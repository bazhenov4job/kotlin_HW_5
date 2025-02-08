package attachments

class AttachmentStory(
    val story: Story
): Attachment {
    override val type: String = "Media"
}

data class Story(
    val id: Int,
    val ownerId: Int,
    val date: Int
)