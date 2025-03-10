package attachments

class AttachmentPhoto (
    val photo: Photo?
): Attachment {
    override val type: String = "photo"
}

data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int
)