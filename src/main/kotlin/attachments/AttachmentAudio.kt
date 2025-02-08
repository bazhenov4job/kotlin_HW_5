package attachments

class AttachmentAudio (
    val audio: Audio?
): Attachment {
    override val type: String = "audio"
}

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String
)