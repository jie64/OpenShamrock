package protobuf.push

import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber
import moe.fuqiuluo.symbols.Protobuf

@Serializable
data class GroupInviteEvent(
    @ProtoNumber(1) val groupCode: Long,
    @ProtoNumber(5) val inviterUid: String,
): Protobuf<GroupInviteEvent>
