package blog

import java.time.LocalDateTime
import javax.persistence.*

// put optional parameters at the end of the parameter list so they can be
// omitted, using the default values

@Entity
data class Article (
        val title: String,
        val headline: String,
        val content: String,
        @ManyToOne @JoinColumn val author: User,
        @Id @GeneratedValue val id: Long? = null,
        val addedAt: LocalDateTime = LocalDateTime.now()
)

@Entity
data class User (
    @Id val login: String,
    val firstame: String,
    val lastname: String,
    val description: String? = null
)