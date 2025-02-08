package attachments

class AttachmentFile(
    val file: File
): Attachment {
    override val type: String = "file"
}

data class File(
    val id: Int,
    val ownerId: Int,
    val title: String
)