@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

public data class TbsContextParams(public var version: UInt = 0u)

public data class TbsContextParams2(public var version: UInt = 0u, public var anonymous: TbsContextParams20 = TbsContextParams20())

public data class TbsContextParams20(public var anonymous: TbsContextParams200 = TbsContextParams200(), public var asUINT32: UInt = 0u)

public data class TbsContextParams200(public var bitfield: UInt = 0u)

public data class TpmDeviceInfo(
    public var structVersion: UInt = 0u,
    public var tpmVersion: UInt = 0u,
    public var tpmInterfaceType: UInt = 0u,
    public var tpmImpRevision: UInt = 0u,
)

public data class TpmWnfProvisioning(public var status: UInt = 0u, public var message: UByteArray = UByteArray(28)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TpmWnfProvisioning) return false
        if (this.status != other.status) return false
        if (!this.message.contentEquals(other.message)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.message.contentHashCode()
        return result
    }
}
