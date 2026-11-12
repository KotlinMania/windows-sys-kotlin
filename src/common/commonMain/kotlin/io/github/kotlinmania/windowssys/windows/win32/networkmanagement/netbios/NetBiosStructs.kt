@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class ActionHeader(
    public var transportId: UInt = 0u,
    public var actionCode: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActionHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActionHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ActionHeader =
                    ActionHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: ActionHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.transportId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.actionCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}

public class AdapterStatus(
    public var adapterAddress: UByteArray = UByteArray(6),
    public var revMajor: UByte = 0u,
    public var reserved0: UByte = 0u,
    public var adapterType: UByte = 0u,
    public var revMinor: UByte = 0u,
    public var duration: UShort = 0u,
    public var frmrRecv: UShort = 0u,
    public var frmrXmit: UShort = 0u,
    public var iframeRecvErr: UShort = 0u,
    public var xmitAborts: UShort = 0u,
    public var xmitSuccess: UInt = 0u,
    public var recvSuccess: UInt = 0u,
    public var iframeXmitErr: UShort = 0u,
    public var recvBuffUnavail: UShort = 0u,
    public var t1Timeouts: UShort = 0u,
    public var tiTimeouts: UShort = 0u,
    public var reserved1: UInt = 0u,
    public var freeNcbs: UShort = 0u,
    public var maxCfgNcbs: UShort = 0u,
    public var maxNcbs: UShort = 0u,
    public var xmitBufUnavail: UShort = 0u,
    public var maxDgramSize: UShort = 0u,
    public var pendingSess: UShort = 0u,
    public var maxCfgSess: UShort = 0u,
    public var maxSess: UShort = 0u,
    public var maxSessPktSize: UShort = 0u,
    public var nameCount: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdapterStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdapterStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): AdapterStatus =
                    AdapterStatus(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 54L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                    )
                override fun writeNative(addr: Long, value: AdapterStatus) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.adapterAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.revMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.adapterType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.revMinor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.duration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.frmrRecv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.frmrXmit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.iframeRecvErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.xmitAborts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.xmitSuccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.recvSuccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.iframeXmitErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.recvBuffUnavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.t1Timeouts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.tiTimeouts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.freeNcbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.maxCfgNcbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.maxNcbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.xmitBufUnavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.maxDgramSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.pendingSess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 52L, value.maxCfgSess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 54L, value.maxSess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.maxSessPktSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.nameCount)
                }
            }
    }
}

public data class FindNameBuffer(
    public var length: UByte = 0u,
    public var accessControl: UByte = 0u,
    public var frameControl: UByte = 0u,
    public var destinationAddr: UByteArray = UByteArray(6),
    public var sourceAddr: UByteArray = UByteArray(6),
    public var routingInfo: UByteArray = UByteArray(18),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FindNameBuffer) return false
        if (this.length != other.length) return false
        if (this.accessControl != other.accessControl) return false
        if (this.frameControl != other.frameControl) return false
        if (!this.destinationAddr.contentEquals(other.destinationAddr)) return false
        if (!this.sourceAddr.contentEquals(other.sourceAddr)) return false
        if (!this.routingInfo.contentEquals(other.routingInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.accessControl.hashCode()
        result = 31 * result + this.frameControl.hashCode()
        result = 31 * result + this.destinationAddr.contentHashCode()
        result = 31 * result + this.sourceAddr.contentHashCode()
        result = 31 * result + this.routingInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FindNameBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FindNameBuffer> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 33L
                override fun readNative(addr: Long): FindNameBuffer =
                    FindNameBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 3L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (18).toInt())
                        ).readNative(addr + 15L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FindNameBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.accessControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.frameControl)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 3L, value.destinationAddr.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 9L, value.sourceAddr.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (18).toInt())
                    ).writeNative(addr + 15L, value.routingInfo.toList())
                }
            }
    }
}

public data class FindNameHeader(
    public var nodeCount: UShort = 0u,
    public var reserved: UByte = 0u,
    public var uniqueGroup: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FindNameHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FindNameHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FindNameHeader =
                    FindNameHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: FindNameHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nodeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.uniqueGroup)
                }
            }
    }
}

public data class LanaEnum(
    public var length: UByte = 0u,
    public var lana: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LanaEnum) return false
        if (this.length != other.length) return false
        if (!this.lana.contentEquals(other.lana)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.lana.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LanaEnum> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LanaEnum> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 256L
                override fun readNative(addr: Long): LanaEnum =
                    LanaEnum(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: LanaEnum) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                    ).writeNative(addr + 1L, value.lana.toList())
                }
            }
    }
}

public data class NameBuffer(
    public var name: UByteArray = UByteArray(16),
    public var nameNum: UByte = 0u,
    public var nameFlags: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NameBuffer) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.nameNum != other.nameNum) return false
        if (this.nameFlags != other.nameFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.nameNum.hashCode()
        result = 31 * result + this.nameFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NameBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NameBuffer> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): NameBuffer =
                    NameBuffer(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: NameBuffer) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.name.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.nameNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.nameFlags)
                }
            }
    }
}

public class Ncb internal constructor(
    public var ncbCommand: UByte,
    public var ncbRetcode: UByte,
    public var ncbLsn: UByte,
    public var ncbNum: UByte,
    ncbBufferCtorArg: MutPtr,
    public var ncbLength: UShort,
    public var ncbCallname: UByteArray,
    public var ncbName: UByteArray,
    public var ncbRto: UByte,
    public var ncbSto: UByte,
    public var ncbPost: Int,
    public var ncbLanaNum: UByte,
    public var ncbCmdCplt: UByte,
    public var ncbReserve: UByteArray,
    ncbEventCtorArg: Handle,
) {
    public var ncbBuffer: MutPtr = ncbBufferCtorArg
        internal set

    public var ncbEvent: Handle = ncbEventCtorArg
        internal set

    public constructor() : this(
        ncbCommand = 0u,
        ncbRetcode = 0u,
        ncbLsn = 0u,
        ncbNum = 0u,
        ncbBufferCtorArg = MutPtr(0L),
        ncbLength = 0u,
        ncbCallname = UByteArray(16),
        ncbName = UByteArray(16),
        ncbRto = 0u,
        ncbSto = 0u,
        ncbPost = 0,
        ncbLanaNum = 0u,
        ncbCmdCplt = 0u,
        ncbReserve = UByteArray(18),
        ncbEventCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.ncbCommand

    public operator fun component2(): UByte = this.ncbRetcode

    public operator fun component3(): UByte = this.ncbLsn

    public operator fun component4(): UByte = this.ncbNum

    public operator fun component5(): MutPtr = this.ncbBuffer

    public operator fun component6(): UShort = this.ncbLength

    public operator fun component7(): UByteArray = this.ncbCallname

    public operator fun component8(): UByteArray = this.ncbName

    public operator fun component9(): UByte = this.ncbRto

    public operator fun component10(): UByte = this.ncbSto

    public operator fun component11(): Int = this.ncbPost

    public operator fun component12(): UByte = this.ncbLanaNum

    public operator fun component13(): UByte = this.ncbCmdCplt

    public operator fun component14(): UByteArray = this.ncbReserve

    public operator fun component15(): Handle = this.ncbEvent

    public fun copy(ncbCommand: UByte = this.ncbCommand, ncbRetcode: UByte = this.ncbRetcode, ncbLsn: UByte = this.ncbLsn, ncbNum: UByte = this.ncbNum, ncbBuffer: MutPtr = this.ncbBuffer, ncbLength: UShort = this.ncbLength, ncbCallname: UByteArray = this.ncbCallname, ncbName: UByteArray = this.ncbName, ncbRto: UByte = this.ncbRto, ncbSto: UByte = this.ncbSto, ncbPost: Int = this.ncbPost, ncbLanaNum: UByte = this.ncbLanaNum, ncbCmdCplt: UByte = this.ncbCmdCplt, ncbReserve: UByteArray = this.ncbReserve, ncbEvent: Handle = this.ncbEvent): Ncb = Ncb(ncbCommand = ncbCommand, ncbRetcode = ncbRetcode, ncbLsn = ncbLsn, ncbNum = ncbNum, ncbBufferCtorArg = ncbBuffer, ncbLength = ncbLength, ncbCallname = ncbCallname, ncbName = ncbName, ncbRto = ncbRto, ncbSto = ncbSto, ncbPost = ncbPost, ncbLanaNum = ncbLanaNum, ncbCmdCplt = ncbCmdCplt, ncbReserve = ncbReserve, ncbEventCtorArg = ncbEvent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ncb) return false
        if (this.ncbCommand != other.ncbCommand) return false
        if (this.ncbRetcode != other.ncbRetcode) return false
        if (this.ncbLsn != other.ncbLsn) return false
        if (this.ncbNum != other.ncbNum) return false
        if (this.ncbBuffer != other.ncbBuffer) return false
        if (this.ncbLength != other.ncbLength) return false
        if (!this.ncbCallname.contentEquals(other.ncbCallname)) return false
        if (!this.ncbName.contentEquals(other.ncbName)) return false
        if (this.ncbRto != other.ncbRto) return false
        if (this.ncbSto != other.ncbSto) return false
        if (this.ncbPost != other.ncbPost) return false
        if (this.ncbLanaNum != other.ncbLanaNum) return false
        if (this.ncbCmdCplt != other.ncbCmdCplt) return false
        if (!this.ncbReserve.contentEquals(other.ncbReserve)) return false
        if (this.ncbEvent != other.ncbEvent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ncbCommand.hashCode()
        result = 31 * result + this.ncbRetcode.hashCode()
        result = 31 * result + this.ncbLsn.hashCode()
        result = 31 * result + this.ncbNum.hashCode()
        result = 31 * result + this.ncbBuffer.hashCode()
        result = 31 * result + this.ncbLength.hashCode()
        result = 31 * result + this.ncbCallname.contentHashCode()
        result = 31 * result + this.ncbName.contentHashCode()
        result = 31 * result + this.ncbRto.hashCode()
        result = 31 * result + this.ncbSto.hashCode()
        result = 31 * result + this.ncbPost.hashCode()
        result = 31 * result + this.ncbLanaNum.hashCode()
        result = 31 * result + this.ncbCmdCplt.hashCode()
        result = 31 * result + this.ncbReserve.contentHashCode()
        result = 31 * result + this.ncbEvent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ncbCommand: UByte = 0u,
            ncbRetcode: UByte = 0u,
            ncbLsn: UByte = 0u,
            ncbNum: UByte = 0u,
            ncbBuffer: MutPtr = MutPtr(0L),
            ncbLength: UShort = 0u,
            ncbCallname: UByteArray = UByteArray(16),
            ncbName: UByteArray = UByteArray(16),
            ncbRto: UByte = 0u,
            ncbSto: UByte = 0u,
            ncbPost: Int = 0,
            ncbLanaNum: UByte = 0u,
            ncbCmdCplt: UByte = 0u,
            ncbReserve: UByteArray = UByteArray(18),
            ncbEvent: Handle = MutPtr(0L),
        ): Ncb =
            Ncb(
                ncbCommand = ncbCommand,
                ncbRetcode = ncbRetcode,
                ncbLsn = ncbLsn,
                ncbNum = ncbNum,
                ncbBufferCtorArg = ncbBuffer,
                ncbLength = ncbLength,
                ncbCallname = ncbCallname,
                ncbName = ncbName,
                ncbRto = ncbRto,
                ncbSto = ncbSto,
                ncbPost = ncbPost,
                ncbLanaNum = ncbLanaNum,
                ncbCmdCplt = ncbCmdCplt,
                ncbReserve = ncbReserve,
                ncbEventCtorArg = ncbEvent,
            )
    }
}

public data class SessionBuffer(
    public var lsn: UByte = 0u,
    public var state: UByte = 0u,
    public var localName: UByteArray = UByteArray(16),
    public var remoteName: UByteArray = UByteArray(16),
    public var rcvsOutstanding: UByte = 0u,
    public var sendsOutstanding: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SessionBuffer) return false
        if (this.lsn != other.lsn) return false
        if (this.state != other.state) return false
        if (!this.localName.contentEquals(other.localName)) return false
        if (!this.remoteName.contentEquals(other.remoteName)) return false
        if (this.rcvsOutstanding != other.rcvsOutstanding) return false
        if (this.sendsOutstanding != other.sendsOutstanding) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lsn.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.localName.contentHashCode()
        result = 31 * result + this.remoteName.contentHashCode()
        result = 31 * result + this.rcvsOutstanding.hashCode()
        result = 31 * result + this.sendsOutstanding.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SessionBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SessionBuffer> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): SessionBuffer =
                    SessionBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 18L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 35L),
                    )
                override fun writeNative(addr: Long, value: SessionBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.lsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.state)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 2L, value.localName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 18L, value.remoteName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 34L, value.rcvsOutstanding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 35L, value.sendsOutstanding)
                }
            }
    }
}

public data class SessionHeader(
    public var sessName: UByte = 0u,
    public var numSess: UByte = 0u,
    public var rcvDgOutstanding: UByte = 0u,
    public var rcvAnyOutstanding: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SessionHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SessionHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SessionHeader =
                    SessionHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: SessionHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sessName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.numSess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.rcvDgOutstanding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.rcvAnyOutstanding)
                }
            }
    }
}
