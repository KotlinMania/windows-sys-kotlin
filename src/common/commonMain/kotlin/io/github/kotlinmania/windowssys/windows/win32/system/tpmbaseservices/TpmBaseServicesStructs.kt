@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

public data class TBS_CONTEXT_PARAMS(public var version: UInt = 0u)

public data class TBS_CONTEXT_PARAMS2(public var version: UInt = 0u, public var Anonymous: TBS_CONTEXT_PARAMS2_0 = TBS_CONTEXT_PARAMS2_0())

public data class TBS_CONTEXT_PARAMS2_0(public var Anonymous: TBS_CONTEXT_PARAMS2_0_0 = TBS_CONTEXT_PARAMS2_0_0(), public var asUINT32: UInt = 0u)

public data class TBS_CONTEXT_PARAMS2_0_0(public var _bitfield: UInt = 0u)

public data class TPM_DEVICE_INFO(
    public var structVersion: UInt = 0u,
    public var tpmVersion: UInt = 0u,
    public var tpmInterfaceType: UInt = 0u,
    public var tpmImpRevision: UInt = 0u,
)

public data class TPM_WNF_PROVISIONING(public var status: UInt = 0u, public var message: UByteArray = UByteArray(28)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TPM_WNF_PROVISIONING) return false
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
