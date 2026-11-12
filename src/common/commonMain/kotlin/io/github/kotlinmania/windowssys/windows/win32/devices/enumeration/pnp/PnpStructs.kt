package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Pcwstr

public class SwDeviceCreateInfo internal constructor(
    public var cbSize: UInt,
    pszInstanceIdCtorArg: Pcwstr,
    pszzHardwareIdsCtorArg: Pcwstr,
    pszzCompatibleIdsCtorArg: Pcwstr,
    pContainerIdCtorArg: ConstPtr,
    public var capabilityFlags: UInt,
    pszDeviceDescriptionCtorArg: Pcwstr,
    pszDeviceLocationCtorArg: Pcwstr,
    pSecurityDescriptorCtorArg: ConstPtr,
) {
    public var pszInstanceId: Pcwstr = pszInstanceIdCtorArg
        internal set

    public var pszzHardwareIds: Pcwstr = pszzHardwareIdsCtorArg
        internal set

    public var pszzCompatibleIds: Pcwstr = pszzCompatibleIdsCtorArg
        internal set

    public var pContainerId: ConstPtr = pContainerIdCtorArg
        internal set

    public var pszDeviceDescription: Pcwstr = pszDeviceDescriptionCtorArg
        internal set

    public var pszDeviceLocation: Pcwstr = pszDeviceLocationCtorArg
        internal set

    public var pSecurityDescriptor: ConstPtr = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pszInstanceIdCtorArg = ConstPtr(0L),
        pszzHardwareIdsCtorArg = ConstPtr(0L),
        pszzCompatibleIdsCtorArg = ConstPtr(0L),
        pContainerIdCtorArg = ConstPtr(0L),
        capabilityFlags = 0u,
        pszDeviceDescriptionCtorArg = ConstPtr(0L),
        pszDeviceLocationCtorArg = ConstPtr(0L),
        pSecurityDescriptorCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.pszInstanceId

    public operator fun component3(): Pcwstr = this.pszzHardwareIds

    public operator fun component4(): Pcwstr = this.pszzCompatibleIds

    public operator fun component5(): ConstPtr = this.pContainerId

    public operator fun component6(): UInt = this.capabilityFlags

    public operator fun component7(): Pcwstr = this.pszDeviceDescription

    public operator fun component8(): Pcwstr = this.pszDeviceLocation

    public operator fun component9(): ConstPtr = this.pSecurityDescriptor

    public fun copy(cbSize: UInt = this.cbSize, pszInstanceId: Pcwstr = this.pszInstanceId, pszzHardwareIds: Pcwstr = this.pszzHardwareIds, pszzCompatibleIds: Pcwstr = this.pszzCompatibleIds, pContainerId: ConstPtr = this.pContainerId, capabilityFlags: UInt = this.capabilityFlags, pszDeviceDescription: Pcwstr = this.pszDeviceDescription, pszDeviceLocation: Pcwstr = this.pszDeviceLocation, pSecurityDescriptor: ConstPtr = this.pSecurityDescriptor): SwDeviceCreateInfo = SwDeviceCreateInfo(cbSize = cbSize, pszInstanceIdCtorArg = pszInstanceId, pszzHardwareIdsCtorArg = pszzHardwareIds, pszzCompatibleIdsCtorArg = pszzCompatibleIds, pContainerIdCtorArg = pContainerId, capabilityFlags = capabilityFlags, pszDeviceDescriptionCtorArg = pszDeviceDescription, pszDeviceLocationCtorArg = pszDeviceLocation, pSecurityDescriptorCtorArg = pSecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SwDeviceCreateInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pszInstanceId != other.pszInstanceId) return false
        if (this.pszzHardwareIds != other.pszzHardwareIds) return false
        if (this.pszzCompatibleIds != other.pszzCompatibleIds) return false
        if (this.pContainerId != other.pContainerId) return false
        if (this.capabilityFlags != other.capabilityFlags) return false
        if (this.pszDeviceDescription != other.pszDeviceDescription) return false
        if (this.pszDeviceLocation != other.pszDeviceLocation) return false
        if (this.pSecurityDescriptor != other.pSecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pszInstanceId.hashCode()
        result = 31 * result + this.pszzHardwareIds.hashCode()
        result = 31 * result + this.pszzCompatibleIds.hashCode()
        result = 31 * result + this.pContainerId.hashCode()
        result = 31 * result + this.capabilityFlags.hashCode()
        result = 31 * result + this.pszDeviceDescription.hashCode()
        result = 31 * result + this.pszDeviceLocation.hashCode()
        result = 31 * result + this.pSecurityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pszInstanceId: Pcwstr = ConstPtr(0L),
            pszzHardwareIds: Pcwstr = ConstPtr(0L),
            pszzCompatibleIds: Pcwstr = ConstPtr(0L),
            pContainerId: ConstPtr = ConstPtr(0L),
            capabilityFlags: UInt = 0u,
            pszDeviceDescription: Pcwstr = ConstPtr(0L),
            pszDeviceLocation: Pcwstr = ConstPtr(0L),
            pSecurityDescriptor: ConstPtr = ConstPtr(0L),
        ): SwDeviceCreateInfo =
            SwDeviceCreateInfo(
                cbSize = cbSize,
                pszInstanceIdCtorArg = pszInstanceId,
                pszzHardwareIdsCtorArg = pszzHardwareIds,
                pszzCompatibleIdsCtorArg = pszzCompatibleIds,
                pContainerIdCtorArg = pContainerId,
                capabilityFlags = capabilityFlags,
                pszDeviceDescriptionCtorArg = pszDeviceDescription,
                pszDeviceLocationCtorArg = pszDeviceLocation,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
            )
    }
}
