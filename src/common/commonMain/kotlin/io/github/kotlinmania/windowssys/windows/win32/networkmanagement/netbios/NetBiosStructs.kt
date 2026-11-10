@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class ActionHeader(
    public var transportId: UInt = 0u,
    public var actionCode: UShort = 0u,
    public var reserved: UShort = 0u,
)

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
)

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
}

public data class FindNameHeader(
    public var nodeCount: UShort = 0u,
    public var reserved: UByte = 0u,
    public var uniqueGroup: UByte = 0u,
)

public data class LanaEnum(public var length: UByte = 0u, public var lana: UByteArray = UByteArray(255)) {
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
}

public data class Ncb(
    public var ncbCommand: UByte = 0u,
    public var ncbRetcode: UByte = 0u,
    public var ncbLsn: UByte = 0u,
    public var ncbNum: UByte = 0u,
    public var ncbBuffer: COpaquePointer? = null,
    public var ncbLength: UShort = 0u,
    public var ncbCallname: UByteArray = UByteArray(16),
    public var ncbName: UByteArray = UByteArray(16),
    public var ncbRto: UByte = 0u,
    public var ncbSto: UByte = 0u,
    public var ncbPost: Int = 0,
    public var ncbLanaNum: UByte = 0u,
    public var ncbCmdCplt: UByte = 0u,
    public var ncbReserve: UByteArray = UByteArray(18),
    public var ncbEvent: Handle = null,
) {
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
}

public data class SessionHeader(
    public var sessName: UByte = 0u,
    public var numSess: UByte = 0u,
    public var rcvDgOutstanding: UByte = 0u,
    public var rcvAnyOutstanding: UByte = 0u,
)
