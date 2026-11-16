@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KdeviceQueue
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PcallbackObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PkdeferredRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkinterrupt
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.LuidAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.Arm64NtNeon128
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerCapabilities
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.SystemPowerState

public data class AcpiDebuggingDeviceInUse(
    public var nameSpacePathLength: UInt = 0u,
    public var nameSpacePath: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcpiDebuggingDeviceInUse) return false
        if (this.nameSpacePathLength != other.nameSpacePathLength) return false
        if (!this.nameSpacePath.contentEquals(other.nameSpacePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameSpacePathLength.hashCode()
        result = 31 * result + this.nameSpacePath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AcpiDebuggingDeviceInUse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AcpiDebuggingDeviceInUse> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): AcpiDebuggingDeviceInUse =
                    AcpiDebuggingDeviceInUse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: AcpiDebuggingDeviceInUse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nameSpacePathLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.nameSpacePath.toList())
                }
            }
    }
}

public class AcpiInterfaceStandard internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var gpeConnectVector: PgpeConnectVector,
    public var gpeDisconnectVector: PgpeDisconnectVector,
    public var gpeEnableEvent: PgpeEnableEvent,
    public var gpeDisableEvent: PgpeDisableEvent,
    public var gpeClearStatus: PgpeClearStatus,
    public var registerForDeviceNotifications: PregisterForDeviceNotifications,
    public var unregisterForDeviceNotifications: PunregisterForDeviceNotifications,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        gpeConnectVector = null,
        gpeDisconnectVector = null,
        gpeEnableEvent = null,
        gpeDisableEvent = null,
        gpeClearStatus = null,
        registerForDeviceNotifications = null,
        unregisterForDeviceNotifications = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PgpeConnectVector = this.gpeConnectVector

    public operator fun component7(): PgpeDisconnectVector = this.gpeDisconnectVector

    public operator fun component8(): PgpeEnableEvent = this.gpeEnableEvent

    public operator fun component9(): PgpeDisableEvent = this.gpeDisableEvent

    public operator fun component10(): PgpeClearStatus = this.gpeClearStatus

    public operator fun component11(): PregisterForDeviceNotifications = this.registerForDeviceNotifications

    public operator fun component12(): PunregisterForDeviceNotifications = this.unregisterForDeviceNotifications

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, gpeConnectVector: PgpeConnectVector = this.gpeConnectVector, gpeDisconnectVector: PgpeDisconnectVector = this.gpeDisconnectVector, gpeEnableEvent: PgpeEnableEvent = this.gpeEnableEvent, gpeDisableEvent: PgpeDisableEvent = this.gpeDisableEvent, gpeClearStatus: PgpeClearStatus = this.gpeClearStatus, registerForDeviceNotifications: PregisterForDeviceNotifications = this.registerForDeviceNotifications, unregisterForDeviceNotifications: PunregisterForDeviceNotifications = this.unregisterForDeviceNotifications): AcpiInterfaceStandard = AcpiInterfaceStandard(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, gpeConnectVector = gpeConnectVector, gpeDisconnectVector = gpeDisconnectVector, gpeEnableEvent = gpeEnableEvent, gpeDisableEvent = gpeDisableEvent, gpeClearStatus = gpeClearStatus, registerForDeviceNotifications = registerForDeviceNotifications, unregisterForDeviceNotifications = unregisterForDeviceNotifications)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcpiInterfaceStandard) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.gpeConnectVector != other.gpeConnectVector) return false
        if (this.gpeDisconnectVector != other.gpeDisconnectVector) return false
        if (this.gpeEnableEvent != other.gpeEnableEvent) return false
        if (this.gpeDisableEvent != other.gpeDisableEvent) return false
        if (this.gpeClearStatus != other.gpeClearStatus) return false
        if (this.registerForDeviceNotifications != other.registerForDeviceNotifications) return false
        if (this.unregisterForDeviceNotifications != other.unregisterForDeviceNotifications) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.gpeConnectVector.hashCode()
        result = 31 * result + this.gpeDisconnectVector.hashCode()
        result = 31 * result + this.gpeEnableEvent.hashCode()
        result = 31 * result + this.gpeDisableEvent.hashCode()
        result = 31 * result + this.gpeClearStatus.hashCode()
        result = 31 * result + this.registerForDeviceNotifications.hashCode()
        result = 31 * result + this.unregisterForDeviceNotifications.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            gpeConnectVector: PgpeConnectVector = null,
            gpeDisconnectVector: PgpeDisconnectVector = null,
            gpeEnableEvent: PgpeEnableEvent = null,
            gpeDisableEvent: PgpeDisableEvent = null,
            gpeClearStatus: PgpeClearStatus = null,
            registerForDeviceNotifications: PregisterForDeviceNotifications = null,
            unregisterForDeviceNotifications: PunregisterForDeviceNotifications = null,
        ): AcpiInterfaceStandard =
            AcpiInterfaceStandard(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                gpeConnectVector = gpeConnectVector,
                gpeDisconnectVector = gpeDisconnectVector,
                gpeEnableEvent = gpeEnableEvent,
                gpeDisableEvent = gpeDisableEvent,
                gpeClearStatus = gpeClearStatus,
                registerForDeviceNotifications = registerForDeviceNotifications,
                unregisterForDeviceNotifications = unregisterForDeviceNotifications,
            )
    }
}

public class AcpiInterfaceStandard2 internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var gpeConnectVector: PgpeConnectVector2,
    public var gpeDisconnectVector: PgpeDisconnectVector2,
    public var gpeEnableEvent: PgpeEnableEvent2,
    public var gpeDisableEvent: PgpeDisableEvent2,
    public var gpeClearStatus: PgpeClearStatus2,
    public var registerForDeviceNotifications: PregisterForDeviceNotifications2,
    public var unregisterForDeviceNotifications: PunregisterForDeviceNotifications2,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        gpeConnectVector = null,
        gpeDisconnectVector = null,
        gpeEnableEvent = null,
        gpeDisableEvent = null,
        gpeClearStatus = null,
        registerForDeviceNotifications = null,
        unregisterForDeviceNotifications = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PgpeConnectVector2 = this.gpeConnectVector

    public operator fun component7(): PgpeDisconnectVector2 = this.gpeDisconnectVector

    public operator fun component8(): PgpeEnableEvent2 = this.gpeEnableEvent

    public operator fun component9(): PgpeDisableEvent2 = this.gpeDisableEvent

    public operator fun component10(): PgpeClearStatus2 = this.gpeClearStatus

    public operator fun component11(): PregisterForDeviceNotifications2 = this.registerForDeviceNotifications

    public operator fun component12(): PunregisterForDeviceNotifications2 = this.unregisterForDeviceNotifications

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, gpeConnectVector: PgpeConnectVector2 = this.gpeConnectVector, gpeDisconnectVector: PgpeDisconnectVector2 = this.gpeDisconnectVector, gpeEnableEvent: PgpeEnableEvent2 = this.gpeEnableEvent, gpeDisableEvent: PgpeDisableEvent2 = this.gpeDisableEvent, gpeClearStatus: PgpeClearStatus2 = this.gpeClearStatus, registerForDeviceNotifications: PregisterForDeviceNotifications2 = this.registerForDeviceNotifications, unregisterForDeviceNotifications: PunregisterForDeviceNotifications2 = this.unregisterForDeviceNotifications): AcpiInterfaceStandard2 = AcpiInterfaceStandard2(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, gpeConnectVector = gpeConnectVector, gpeDisconnectVector = gpeDisconnectVector, gpeEnableEvent = gpeEnableEvent, gpeDisableEvent = gpeDisableEvent, gpeClearStatus = gpeClearStatus, registerForDeviceNotifications = registerForDeviceNotifications, unregisterForDeviceNotifications = unregisterForDeviceNotifications)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcpiInterfaceStandard2) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.gpeConnectVector != other.gpeConnectVector) return false
        if (this.gpeDisconnectVector != other.gpeDisconnectVector) return false
        if (this.gpeEnableEvent != other.gpeEnableEvent) return false
        if (this.gpeDisableEvent != other.gpeDisableEvent) return false
        if (this.gpeClearStatus != other.gpeClearStatus) return false
        if (this.registerForDeviceNotifications != other.registerForDeviceNotifications) return false
        if (this.unregisterForDeviceNotifications != other.unregisterForDeviceNotifications) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.gpeConnectVector.hashCode()
        result = 31 * result + this.gpeDisconnectVector.hashCode()
        result = 31 * result + this.gpeEnableEvent.hashCode()
        result = 31 * result + this.gpeDisableEvent.hashCode()
        result = 31 * result + this.gpeClearStatus.hashCode()
        result = 31 * result + this.registerForDeviceNotifications.hashCode()
        result = 31 * result + this.unregisterForDeviceNotifications.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            gpeConnectVector: PgpeConnectVector2 = null,
            gpeDisconnectVector: PgpeDisconnectVector2 = null,
            gpeEnableEvent: PgpeEnableEvent2 = null,
            gpeDisableEvent: PgpeDisableEvent2 = null,
            gpeClearStatus: PgpeClearStatus2 = null,
            registerForDeviceNotifications: PregisterForDeviceNotifications2 = null,
            unregisterForDeviceNotifications: PunregisterForDeviceNotifications2 = null,
        ): AcpiInterfaceStandard2 =
            AcpiInterfaceStandard2(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                gpeConnectVector = gpeConnectVector,
                gpeDisconnectVector = gpeDisconnectVector,
                gpeEnableEvent = gpeEnableEvent,
                gpeDisableEvent = gpeDisableEvent,
                gpeClearStatus = gpeClearStatus,
                registerForDeviceNotifications = registerForDeviceNotifications,
                unregisterForDeviceNotifications = unregisterForDeviceNotifications,
            )
    }
}

public class AgpTargetBusInterfaceStandard internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var setBusData: PgetSetDeviceData,
    public var getBusData: PgetSetDeviceData,
    public var capabilityID: UByte,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        setBusData = null,
        getBusData = null,
        capabilityID = 0u,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PgetSetDeviceData = this.setBusData

    public operator fun component7(): PgetSetDeviceData = this.getBusData

    public operator fun component8(): UByte = this.capabilityID

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, setBusData: PgetSetDeviceData = this.setBusData, getBusData: PgetSetDeviceData = this.getBusData, capabilityID: UByte = this.capabilityID): AgpTargetBusInterfaceStandard = AgpTargetBusInterfaceStandard(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, setBusData = setBusData, getBusData = getBusData, capabilityID = capabilityID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AgpTargetBusInterfaceStandard) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.setBusData != other.setBusData) return false
        if (this.getBusData != other.getBusData) return false
        if (this.capabilityID != other.capabilityID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.setBusData.hashCode()
        result = 31 * result + this.getBusData.hashCode()
        result = 31 * result + this.capabilityID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            setBusData: PgetSetDeviceData = null,
            getBusData: PgetSetDeviceData = null,
            capabilityID: UByte = 0u,
        ): AgpTargetBusInterfaceStandard =
            AgpTargetBusInterfaceStandard(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                setBusData = setBusData,
                getBusData = getBusData,
                capabilityID = capabilityID,
            )
    }
}

public data class AmdL1CacheInfo(
    public var ulong: UInt = 0u,
    public var anonymous: AmdL1CacheInfo0 = AmdL1CacheInfo0(),
)

public data class AmdL1CacheInfo0(
    public var lineSize: UByte = 0u,
    public var linesPerTag: UByte = 0u,
    public var associativity: UByte = 0u,
    public var size: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AmdL1CacheInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AmdL1CacheInfo0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AmdL1CacheInfo0 =
                    AmdL1CacheInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: AmdL1CacheInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.lineSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.linesPerTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.associativity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.size)
                }
            }
    }
}

public data class AmdL2CacheInfo(
    public var ulong: UInt = 0u,
    public var anonymous: AmdL2CacheInfo0 = AmdL2CacheInfo0(),
)

public data class AmdL2CacheInfo0(
    public var lineSize: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var size: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AmdL2CacheInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AmdL2CacheInfo0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AmdL2CacheInfo0 =
                    AmdL2CacheInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: AmdL2CacheInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.lineSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.size)
                }
            }
    }
}

public data class AmdL3CacheInfo(
    public var ulong: UInt = 0u,
    public var anonymous: AmdL3CacheInfo0 = AmdL3CacheInfo0(),
)

public data class AmdL3CacheInfo0(
    public var lineSize: UByte = 0u,
    public var bitfield1: UByte = 0u,
    public var bitfield2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AmdL3CacheInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AmdL3CacheInfo0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AmdL3CacheInfo0 =
                    AmdL3CacheInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: AmdL3CacheInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.lineSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.bitfield2)
                }
            }
    }
}

public class ArbiterAddReservedParameters internal constructor(
    reserveDeviceCtorArg: MutPtr,
) {
    public var reserveDevice: MutPtr = reserveDeviceCtorArg
        internal set

    public constructor() : this(
        reserveDeviceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.reserveDevice

    public fun copy(reserveDevice: MutPtr = this.reserveDevice): ArbiterAddReservedParameters = ArbiterAddReservedParameters(reserveDeviceCtorArg = reserveDevice)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArbiterAddReservedParameters) return false
        if (this.reserveDevice != other.reserveDevice) return false
        return true
    }

    override fun hashCode(): Int = this.reserveDevice.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterAddReservedParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterAddReservedParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ArbiterAddReservedParameters =
                    ArbiterAddReservedParameters(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ArbiterAddReservedParameters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.reserveDevice)
                }
            }

        public operator fun invoke(
            reserveDevice: MutPtr = MutPtr(0L),
        ): ArbiterAddReservedParameters =
            ArbiterAddReservedParameters(
                reserveDeviceCtorArg = reserveDevice,
            )
    }
}

public class ArbiterBootAllocationParameters internal constructor(
    arbitrationListCtorArg: MutPtr,
) {
    public var arbitrationList: MutPtr = arbitrationListCtorArg
        internal set

    public constructor() : this(
        arbitrationListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.arbitrationList

    public fun copy(arbitrationList: MutPtr = this.arbitrationList): ArbiterBootAllocationParameters = ArbiterBootAllocationParameters(arbitrationListCtorArg = arbitrationList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArbiterBootAllocationParameters) return false
        if (this.arbitrationList != other.arbitrationList) return false
        return true
    }

    override fun hashCode(): Int = this.arbitrationList.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterBootAllocationParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterBootAllocationParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ArbiterBootAllocationParameters =
                    ArbiterBootAllocationParameters(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ArbiterBootAllocationParameters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.arbitrationList)
                }
            }

        public operator fun invoke(
            arbitrationList: MutPtr = MutPtr(0L),
        ): ArbiterBootAllocationParameters =
            ArbiterBootAllocationParameters(
                arbitrationListCtorArg = arbitrationList,
            )
    }
}

public class ArbiterConflictInfo internal constructor(
    owningObjectCtorArg: MutPtr,
    public var start: ULong,
    public var end: ULong,
) {
    public var owningObject: MutPtr = owningObjectCtorArg
        internal set

    public constructor() : this(
        owningObjectCtorArg = MutPtr(0L),
        start = 0uL,
        end = 0uL,
    )

    public operator fun component1(): MutPtr = this.owningObject

    public operator fun component2(): ULong = this.start

    public operator fun component3(): ULong = this.end

    public fun copy(owningObject: MutPtr = this.owningObject, start: ULong = this.start, end: ULong = this.end): ArbiterConflictInfo = ArbiterConflictInfo(owningObjectCtorArg = owningObject, start = start, end = end)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArbiterConflictInfo) return false
        if (this.owningObject != other.owningObject) return false
        if (this.start != other.start) return false
        if (this.end != other.end) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.owningObject.hashCode()
        result = 31 * result + this.start.hashCode()
        result = 31 * result + this.end.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterConflictInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterConflictInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ArbiterConflictInfo =
                    ArbiterConflictInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ArbiterConflictInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.owningObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.end)
                }
            }

        public operator fun invoke(
            owningObject: MutPtr = MutPtr(0L),
            start: ULong = 0uL,
            end: ULong = 0uL,
        ): ArbiterConflictInfo =
            ArbiterConflictInfo(
                owningObjectCtorArg = owningObject,
                start = start,
                end = end,
            )
    }
}

public class ArbiterInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var arbiterHandler: ParbiterHandler,
    public var flags: UInt,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        arbiterHandler = null,
        flags = 0u,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): ParbiterHandler = this.arbiterHandler

    public operator fun component7(): UInt = this.flags

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, arbiterHandler: ParbiterHandler = this.arbiterHandler, flags: UInt = this.flags): ArbiterInterface = ArbiterInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, arbiterHandler = arbiterHandler, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArbiterInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.arbiterHandler != other.arbiterHandler) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.arbiterHandler.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            arbiterHandler: ParbiterHandler = null,
            flags: UInt = 0u,
        ): ArbiterInterface =
            ArbiterInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                arbiterHandler = arbiterHandler,
                flags = flags,
            )
    }
}

public class ArbiterListEntry internal constructor(
    public var listEntry: ListEntry,
    public var alternativeCount: UInt,
    alternativesCtorArg: MutPtr,
    physicalDeviceObjectCtorArg: MutPtr,
    public var requestSource: ArbiterRequestSource,
    public var flags: UInt,
    public var workSpace: Int,
    public var interfaceType: InterfaceType,
    public var slotNumber: UInt,
    public var busNumber: UInt,
    assignmentCtorArg: MutPtr,
    selectedAlternativeCtorArg: MutPtr,
    public var result: ArbiterResult,
) {
    public var alternatives: MutPtr = alternativesCtorArg
        internal set

    public var physicalDeviceObject: MutPtr = physicalDeviceObjectCtorArg
        internal set

    public var assignment: MutPtr = assignmentCtorArg
        internal set

    public var selectedAlternative: MutPtr = selectedAlternativeCtorArg
        internal set

    public constructor() : this(
        listEntry = ListEntry(),
        alternativeCount = 0u,
        alternativesCtorArg = MutPtr(0L),
        physicalDeviceObjectCtorArg = MutPtr(0L),
        requestSource = 0,
        flags = 0u,
        workSpace = 0,
        interfaceType = 0,
        slotNumber = 0u,
        busNumber = 0u,
        assignmentCtorArg = MutPtr(0L),
        selectedAlternativeCtorArg = MutPtr(0L),
        result = 0,
    )

    public operator fun component1(): ListEntry = this.listEntry

    public operator fun component2(): UInt = this.alternativeCount

    public operator fun component3(): MutPtr = this.alternatives

    public operator fun component4(): MutPtr = this.physicalDeviceObject

    public operator fun component5(): ArbiterRequestSource = this.requestSource

    public operator fun component6(): UInt = this.flags

    public operator fun component7(): Int = this.workSpace

    public operator fun component8(): InterfaceType = this.interfaceType

    public operator fun component9(): UInt = this.slotNumber

    public operator fun component10(): UInt = this.busNumber

    public operator fun component11(): MutPtr = this.assignment

    public operator fun component12(): MutPtr = this.selectedAlternative

    public operator fun component13(): ArbiterResult = this.result

    public fun copy(listEntry: ListEntry = this.listEntry, alternativeCount: UInt = this.alternativeCount, alternatives: MutPtr = this.alternatives, physicalDeviceObject: MutPtr = this.physicalDeviceObject, requestSource: ArbiterRequestSource = this.requestSource, flags: UInt = this.flags, workSpace: Int = this.workSpace, interfaceType: InterfaceType = this.interfaceType, slotNumber: UInt = this.slotNumber, busNumber: UInt = this.busNumber, assignment: MutPtr = this.assignment, selectedAlternative: MutPtr = this.selectedAlternative, result: ArbiterResult = this.result): ArbiterListEntry = ArbiterListEntry(listEntry = listEntry, alternativeCount = alternativeCount, alternativesCtorArg = alternatives, physicalDeviceObjectCtorArg = physicalDeviceObject, requestSource = requestSource, flags = flags, workSpace = workSpace, interfaceType = interfaceType, slotNumber = slotNumber, busNumber = busNumber, assignmentCtorArg = assignment, selectedAlternativeCtorArg = selectedAlternative, result = result)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArbiterListEntry) return false
        if (this.listEntry != other.listEntry) return false
        if (this.alternativeCount != other.alternativeCount) return false
        if (this.alternatives != other.alternatives) return false
        if (this.physicalDeviceObject != other.physicalDeviceObject) return false
        if (this.requestSource != other.requestSource) return false
        if (this.flags != other.flags) return false
        if (this.workSpace != other.workSpace) return false
        if (this.interfaceType != other.interfaceType) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.busNumber != other.busNumber) return false
        if (this.assignment != other.assignment) return false
        if (this.selectedAlternative != other.selectedAlternative) return false
        if (this.result != other.result) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.listEntry.hashCode()
        result = 31 * result + this.alternativeCount.hashCode()
        result = 31 * result + this.alternatives.hashCode()
        result = 31 * result + this.physicalDeviceObject.hashCode()
        result = 31 * result + this.requestSource.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.workSpace.hashCode()
        result = 31 * result + this.interfaceType.hashCode()
        result = 31 * result + this.slotNumber.hashCode()
        result = 31 * result + this.busNumber.hashCode()
        result = 31 * result + this.assignment.hashCode()
        result = 31 * result + this.selectedAlternative.hashCode()
        result = 31 * result + this.result.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            listEntry: ListEntry = ListEntry(),
            alternativeCount: UInt = 0u,
            alternatives: MutPtr = MutPtr(0L),
            physicalDeviceObject: MutPtr = MutPtr(0L),
            requestSource: ArbiterRequestSource = 0,
            flags: UInt = 0u,
            workSpace: Int = 0,
            interfaceType: InterfaceType = 0,
            slotNumber: UInt = 0u,
            busNumber: UInt = 0u,
            assignment: MutPtr = MutPtr(0L),
            selectedAlternative: MutPtr = MutPtr(0L),
            result: ArbiterResult = 0,
        ): ArbiterListEntry =
            ArbiterListEntry(
                listEntry = listEntry,
                alternativeCount = alternativeCount,
                alternativesCtorArg = alternatives,
                physicalDeviceObjectCtorArg = physicalDeviceObject,
                requestSource = requestSource,
                flags = flags,
                workSpace = workSpace,
                interfaceType = interfaceType,
                slotNumber = slotNumber,
                busNumber = busNumber,
                assignmentCtorArg = assignment,
                selectedAlternativeCtorArg = selectedAlternative,
                result = result,
            )
    }
}

public data class ArbiterParameters(
    public var parameters: ArbiterParameters0 = ArbiterParameters0(),
)

public data class ArbiterParameters0(
    public var testAllocation: ArbiterTestAllocationParameters = ArbiterTestAllocationParameters(),
    public var retestAllocation: ArbiterRetestAllocationParameters = ArbiterRetestAllocationParameters(),
    public var bootAllocation: ArbiterBootAllocationParameters = ArbiterBootAllocationParameters(),
    public var queryAllocatedResources: ArbiterQueryAllocatedResourcesParameters = ArbiterQueryAllocatedResourcesParameters(),
    public var queryConflict: ArbiterQueryConflictParameters = ArbiterQueryConflictParameters(),
    public var queryArbitrate: ArbiterQueryArbitrateParameters = ArbiterQueryArbitrateParameters(),
    public var addReserved: ArbiterAddReservedParameters = ArbiterAddReservedParameters(),
)

public class ArbiterQueryAllocatedResourcesParameters internal constructor(
    allocatedResourcesCtorArg: MutPtr,
) {
    public var allocatedResources: MutPtr = allocatedResourcesCtorArg
        internal set

    public constructor() : this(
        allocatedResourcesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.allocatedResources

    public fun copy(allocatedResources: MutPtr = this.allocatedResources): ArbiterQueryAllocatedResourcesParameters = ArbiterQueryAllocatedResourcesParameters(allocatedResourcesCtorArg = allocatedResources)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArbiterQueryAllocatedResourcesParameters) return false
        if (this.allocatedResources != other.allocatedResources) return false
        return true
    }

    override fun hashCode(): Int = this.allocatedResources.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterQueryAllocatedResourcesParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterQueryAllocatedResourcesParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ArbiterQueryAllocatedResourcesParameters =
                    ArbiterQueryAllocatedResourcesParameters(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ArbiterQueryAllocatedResourcesParameters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.allocatedResources)
                }
            }

        public operator fun invoke(
            allocatedResources: MutPtr = MutPtr(0L),
        ): ArbiterQueryAllocatedResourcesParameters =
            ArbiterQueryAllocatedResourcesParameters(
                allocatedResourcesCtorArg = allocatedResources,
            )
    }
}

public class ArbiterQueryArbitrateParameters internal constructor(
    arbitrationListCtorArg: MutPtr,
) {
    public var arbitrationList: MutPtr = arbitrationListCtorArg
        internal set

    public constructor() : this(
        arbitrationListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.arbitrationList

    public fun copy(arbitrationList: MutPtr = this.arbitrationList): ArbiterQueryArbitrateParameters = ArbiterQueryArbitrateParameters(arbitrationListCtorArg = arbitrationList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArbiterQueryArbitrateParameters) return false
        if (this.arbitrationList != other.arbitrationList) return false
        return true
    }

    override fun hashCode(): Int = this.arbitrationList.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterQueryArbitrateParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterQueryArbitrateParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ArbiterQueryArbitrateParameters =
                    ArbiterQueryArbitrateParameters(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ArbiterQueryArbitrateParameters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.arbitrationList)
                }
            }

        public operator fun invoke(
            arbitrationList: MutPtr = MutPtr(0L),
        ): ArbiterQueryArbitrateParameters =
            ArbiterQueryArbitrateParameters(
                arbitrationListCtorArg = arbitrationList,
            )
    }
}

public class ArbiterQueryConflictParameters internal constructor(
    physicalDeviceObjectCtorArg: MutPtr,
    conflictingResourceCtorArg: MutPtr,
    conflictCountCtorArg: MutPtr,
    conflictsCtorArg: MutPtr,
) {
    public var physicalDeviceObject: MutPtr = physicalDeviceObjectCtorArg
        internal set

    public var conflictingResource: MutPtr = conflictingResourceCtorArg
        internal set

    public var conflictCount: MutPtr = conflictCountCtorArg
        internal set

    public var conflicts: MutPtr = conflictsCtorArg
        internal set

    public constructor() : this(
        physicalDeviceObjectCtorArg = MutPtr(0L),
        conflictingResourceCtorArg = MutPtr(0L),
        conflictCountCtorArg = MutPtr(0L),
        conflictsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.physicalDeviceObject

    public operator fun component2(): MutPtr = this.conflictingResource

    public operator fun component3(): MutPtr = this.conflictCount

    public operator fun component4(): MutPtr = this.conflicts

    public fun copy(physicalDeviceObject: MutPtr = this.physicalDeviceObject, conflictingResource: MutPtr = this.conflictingResource, conflictCount: MutPtr = this.conflictCount, conflicts: MutPtr = this.conflicts): ArbiterQueryConflictParameters = ArbiterQueryConflictParameters(physicalDeviceObjectCtorArg = physicalDeviceObject, conflictingResourceCtorArg = conflictingResource, conflictCountCtorArg = conflictCount, conflictsCtorArg = conflicts)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArbiterQueryConflictParameters) return false
        if (this.physicalDeviceObject != other.physicalDeviceObject) return false
        if (this.conflictingResource != other.conflictingResource) return false
        if (this.conflictCount != other.conflictCount) return false
        if (this.conflicts != other.conflicts) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalDeviceObject.hashCode()
        result = 31 * result + this.conflictingResource.hashCode()
        result = 31 * result + this.conflictCount.hashCode()
        result = 31 * result + this.conflicts.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterQueryConflictParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterQueryConflictParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ArbiterQueryConflictParameters =
                    ArbiterQueryConflictParameters(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ArbiterQueryConflictParameters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.physicalDeviceObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.conflictingResource)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.conflictCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.conflicts)
                }
            }

        public operator fun invoke(
            physicalDeviceObject: MutPtr = MutPtr(0L),
            conflictingResource: MutPtr = MutPtr(0L),
            conflictCount: MutPtr = MutPtr(0L),
            conflicts: MutPtr = MutPtr(0L),
        ): ArbiterQueryConflictParameters =
            ArbiterQueryConflictParameters(
                physicalDeviceObjectCtorArg = physicalDeviceObject,
                conflictingResourceCtorArg = conflictingResource,
                conflictCountCtorArg = conflictCount,
                conflictsCtorArg = conflicts,
            )
    }
}

public class ArbiterRetestAllocationParameters internal constructor(
    arbitrationListCtorArg: MutPtr,
    public var allocateFromCount: UInt,
    allocateFromCtorArg: MutPtr,
) {
    public var arbitrationList: MutPtr = arbitrationListCtorArg
        internal set

    public var allocateFrom: MutPtr = allocateFromCtorArg
        internal set

    public constructor() : this(
        arbitrationListCtorArg = MutPtr(0L),
        allocateFromCount = 0u,
        allocateFromCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.arbitrationList

    public operator fun component2(): UInt = this.allocateFromCount

    public operator fun component3(): MutPtr = this.allocateFrom

    public fun copy(arbitrationList: MutPtr = this.arbitrationList, allocateFromCount: UInt = this.allocateFromCount, allocateFrom: MutPtr = this.allocateFrom): ArbiterRetestAllocationParameters = ArbiterRetestAllocationParameters(arbitrationListCtorArg = arbitrationList, allocateFromCount = allocateFromCount, allocateFromCtorArg = allocateFrom)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArbiterRetestAllocationParameters) return false
        if (this.arbitrationList != other.arbitrationList) return false
        if (this.allocateFromCount != other.allocateFromCount) return false
        if (this.allocateFrom != other.allocateFrom) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.arbitrationList.hashCode()
        result = 31 * result + this.allocateFromCount.hashCode()
        result = 31 * result + this.allocateFrom.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterRetestAllocationParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterRetestAllocationParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ArbiterRetestAllocationParameters =
                    ArbiterRetestAllocationParameters(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ArbiterRetestAllocationParameters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.arbitrationList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.allocateFromCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.allocateFrom)
                }
            }

        public operator fun invoke(
            arbitrationList: MutPtr = MutPtr(0L),
            allocateFromCount: UInt = 0u,
            allocateFrom: MutPtr = MutPtr(0L),
        ): ArbiterRetestAllocationParameters =
            ArbiterRetestAllocationParameters(
                arbitrationListCtorArg = arbitrationList,
                allocateFromCount = allocateFromCount,
                allocateFromCtorArg = allocateFrom,
            )
    }
}

public class ArbiterTestAllocationParameters internal constructor(
    arbitrationListCtorArg: MutPtr,
    public var allocateFromCount: UInt,
    allocateFromCtorArg: MutPtr,
) {
    public var arbitrationList: MutPtr = arbitrationListCtorArg
        internal set

    public var allocateFrom: MutPtr = allocateFromCtorArg
        internal set

    public constructor() : this(
        arbitrationListCtorArg = MutPtr(0L),
        allocateFromCount = 0u,
        allocateFromCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.arbitrationList

    public operator fun component2(): UInt = this.allocateFromCount

    public operator fun component3(): MutPtr = this.allocateFrom

    public fun copy(arbitrationList: MutPtr = this.arbitrationList, allocateFromCount: UInt = this.allocateFromCount, allocateFrom: MutPtr = this.allocateFrom): ArbiterTestAllocationParameters = ArbiterTestAllocationParameters(arbitrationListCtorArg = arbitrationList, allocateFromCount = allocateFromCount, allocateFromCtorArg = allocateFrom)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArbiterTestAllocationParameters) return false
        if (this.arbitrationList != other.arbitrationList) return false
        if (this.allocateFromCount != other.allocateFromCount) return false
        if (this.allocateFrom != other.allocateFrom) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.arbitrationList.hashCode()
        result = 31 * result + this.allocateFromCount.hashCode()
        result = 31 * result + this.allocateFrom.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterTestAllocationParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArbiterTestAllocationParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ArbiterTestAllocationParameters =
                    ArbiterTestAllocationParameters(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ArbiterTestAllocationParameters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.arbitrationList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.allocateFromCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.allocateFrom)
                }
            }

        public operator fun invoke(
            arbitrationList: MutPtr = MutPtr(0L),
            allocateFromCount: UInt = 0u,
            allocateFrom: MutPtr = MutPtr(0L),
        ): ArbiterTestAllocationParameters =
            ArbiterTestAllocationParameters(
                arbitrationListCtorArg = arbitrationList,
                allocateFromCount = allocateFromCount,
                allocateFromCtorArg = allocateFrom,
            )
    }
}

public data class Arm64NtContext(
    public var contextFlags: UInt = 0u,
    public var cpsr: UInt = 0u,
    public var anonymous: Arm64NtContext0 = Arm64NtContext0(),
    public var sp: ULong = 0uL,
    public var pc: ULong = 0uL,
    public var v: List<Arm64NtNeon128> = List(32) { Arm64NtNeon128() },
    public var fpcr: UInt = 0u,
    public var fpsr: UInt = 0u,
    public var bcr: UIntArray = UIntArray(8),
    public var bvr: ULongArray = ULongArray(8),
    public var wcr: UIntArray = UIntArray(2),
    public var wvr: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arm64NtContext) return false
        if (this.contextFlags != other.contextFlags) return false
        if (this.cpsr != other.cpsr) return false
        if (this.anonymous != other.anonymous) return false
        if (this.sp != other.sp) return false
        if (this.pc != other.pc) return false
        if (this.v != other.v) return false
        if (this.fpcr != other.fpcr) return false
        if (this.fpsr != other.fpsr) return false
        if (!this.bcr.contentEquals(other.bcr)) return false
        if (!this.bvr.contentEquals(other.bvr)) return false
        if (!this.wcr.contentEquals(other.wcr)) return false
        if (!this.wvr.contentEquals(other.wvr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.contextFlags.hashCode()
        result = 31 * result + this.cpsr.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.sp.hashCode()
        result = 31 * result + this.pc.hashCode()
        result = 31 * result + this.v.hashCode()
        result = 31 * result + this.fpcr.hashCode()
        result = 31 * result + this.fpsr.hashCode()
        result = 31 * result + this.bcr.contentHashCode()
        result = 31 * result + this.bvr.contentHashCode()
        result = 31 * result + this.wcr.contentHashCode()
        result = 31 * result + this.wvr.contentHashCode()
        return result
    }
}

public data class Arm64NtContext0(
    public var anonymous: Arm64NtContext00 = Arm64NtContext00(),
    public var x: ULongArray = ULongArray(31),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arm64NtContext0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.x.contentEquals(other.x)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.x.contentHashCode()
        return result
    }
}

public class Arm64NtContext00(
    public var x0: ULong = 0uL,
    public var x1: ULong = 0uL,
    public var x2: ULong = 0uL,
    public var x3: ULong = 0uL,
    public var x4: ULong = 0uL,
    public var x5: ULong = 0uL,
    public var x6: ULong = 0uL,
    public var x7: ULong = 0uL,
    public var x8: ULong = 0uL,
    public var x9: ULong = 0uL,
    public var x10: ULong = 0uL,
    public var x11: ULong = 0uL,
    public var x12: ULong = 0uL,
    public var x13: ULong = 0uL,
    public var x14: ULong = 0uL,
    public var x15: ULong = 0uL,
    public var x16: ULong = 0uL,
    public var x17: ULong = 0uL,
    public var x18: ULong = 0uL,
    public var x19: ULong = 0uL,
    public var x20: ULong = 0uL,
    public var x21: ULong = 0uL,
    public var x22: ULong = 0uL,
    public var x23: ULong = 0uL,
    public var x24: ULong = 0uL,
    public var x25: ULong = 0uL,
    public var x26: ULong = 0uL,
    public var x27: ULong = 0uL,
    public var x28: ULong = 0uL,
    public var fp: ULong = 0uL,
    public var lr: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arm64NtContext00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arm64NtContext00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 248L
                override fun readNative(addr: Long): Arm64NtContext00 =
                    Arm64NtContext00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 240L),
                    )
                override fun writeNative(addr: Long, value: Arm64NtContext00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.x0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.x1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.x2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.x3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.x4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.x5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.x6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.x7)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.x8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.x9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.x10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.x11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.x12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.x13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.x14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.x15)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.x16)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.x17)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.x18)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.x19)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.x20)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.x21)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.x22)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.x23)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.x24)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.x25)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.x26)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.x27)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 224L, value.x28)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 232L, value.fp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 240L, value.lr)
                }
            }
    }
}

public class BdcbImageInformation internal constructor(
    public var classification: BdcbClassification,
    public var imageFlags: UInt,
    public var imageName: UnicodeString,
    public var registryPath: UnicodeString,
    public var certificatePublisher: UnicodeString,
    public var certificateIssuer: UnicodeString,
    imageHashCtorArg: MutPtr,
    certificateThumbprintCtorArg: MutPtr,
    public var imageHashAlgorithm: UInt,
    public var thumbprintHashAlgorithm: UInt,
    public var imageHashLength: UInt,
    public var certificateThumbprintLength: UInt,
) {
    public var imageHash: MutPtr = imageHashCtorArg
        internal set

    public var certificateThumbprint: MutPtr = certificateThumbprintCtorArg
        internal set

    public constructor() : this(
        classification = 0,
        imageFlags = 0u,
        imageName = UnicodeString(),
        registryPath = UnicodeString(),
        certificatePublisher = UnicodeString(),
        certificateIssuer = UnicodeString(),
        imageHashCtorArg = MutPtr(0L),
        certificateThumbprintCtorArg = MutPtr(0L),
        imageHashAlgorithm = 0u,
        thumbprintHashAlgorithm = 0u,
        imageHashLength = 0u,
        certificateThumbprintLength = 0u,
    )

    public operator fun component1(): BdcbClassification = this.classification

    public operator fun component2(): UInt = this.imageFlags

    public operator fun component3(): UnicodeString = this.imageName

    public operator fun component4(): UnicodeString = this.registryPath

    public operator fun component5(): UnicodeString = this.certificatePublisher

    public operator fun component6(): UnicodeString = this.certificateIssuer

    public operator fun component7(): MutPtr = this.imageHash

    public operator fun component8(): MutPtr = this.certificateThumbprint

    public operator fun component9(): UInt = this.imageHashAlgorithm

    public operator fun component10(): UInt = this.thumbprintHashAlgorithm

    public operator fun component11(): UInt = this.imageHashLength

    public operator fun component12(): UInt = this.certificateThumbprintLength

    public fun copy(classification: BdcbClassification = this.classification, imageFlags: UInt = this.imageFlags, imageName: UnicodeString = this.imageName, registryPath: UnicodeString = this.registryPath, certificatePublisher: UnicodeString = this.certificatePublisher, certificateIssuer: UnicodeString = this.certificateIssuer, imageHash: MutPtr = this.imageHash, certificateThumbprint: MutPtr = this.certificateThumbprint, imageHashAlgorithm: UInt = this.imageHashAlgorithm, thumbprintHashAlgorithm: UInt = this.thumbprintHashAlgorithm, imageHashLength: UInt = this.imageHashLength, certificateThumbprintLength: UInt = this.certificateThumbprintLength): BdcbImageInformation = BdcbImageInformation(classification = classification, imageFlags = imageFlags, imageName = imageName, registryPath = registryPath, certificatePublisher = certificatePublisher, certificateIssuer = certificateIssuer, imageHashCtorArg = imageHash, certificateThumbprintCtorArg = certificateThumbprint, imageHashAlgorithm = imageHashAlgorithm, thumbprintHashAlgorithm = thumbprintHashAlgorithm, imageHashLength = imageHashLength, certificateThumbprintLength = certificateThumbprintLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BdcbImageInformation) return false
        if (this.classification != other.classification) return false
        if (this.imageFlags != other.imageFlags) return false
        if (this.imageName != other.imageName) return false
        if (this.registryPath != other.registryPath) return false
        if (this.certificatePublisher != other.certificatePublisher) return false
        if (this.certificateIssuer != other.certificateIssuer) return false
        if (this.imageHash != other.imageHash) return false
        if (this.certificateThumbprint != other.certificateThumbprint) return false
        if (this.imageHashAlgorithm != other.imageHashAlgorithm) return false
        if (this.thumbprintHashAlgorithm != other.thumbprintHashAlgorithm) return false
        if (this.imageHashLength != other.imageHashLength) return false
        if (this.certificateThumbprintLength != other.certificateThumbprintLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classification.hashCode()
        result = 31 * result + this.imageFlags.hashCode()
        result = 31 * result + this.imageName.hashCode()
        result = 31 * result + this.registryPath.hashCode()
        result = 31 * result + this.certificatePublisher.hashCode()
        result = 31 * result + this.certificateIssuer.hashCode()
        result = 31 * result + this.imageHash.hashCode()
        result = 31 * result + this.certificateThumbprint.hashCode()
        result = 31 * result + this.imageHashAlgorithm.hashCode()
        result = 31 * result + this.thumbprintHashAlgorithm.hashCode()
        result = 31 * result + this.imageHashLength.hashCode()
        result = 31 * result + this.certificateThumbprintLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            classification: BdcbClassification = 0,
            imageFlags: UInt = 0u,
            imageName: UnicodeString = UnicodeString(),
            registryPath: UnicodeString = UnicodeString(),
            certificatePublisher: UnicodeString = UnicodeString(),
            certificateIssuer: UnicodeString = UnicodeString(),
            imageHash: MutPtr = MutPtr(0L),
            certificateThumbprint: MutPtr = MutPtr(0L),
            imageHashAlgorithm: UInt = 0u,
            thumbprintHashAlgorithm: UInt = 0u,
            imageHashLength: UInt = 0u,
            certificateThumbprintLength: UInt = 0u,
        ): BdcbImageInformation =
            BdcbImageInformation(
                classification = classification,
                imageFlags = imageFlags,
                imageName = imageName,
                registryPath = registryPath,
                certificatePublisher = certificatePublisher,
                certificateIssuer = certificateIssuer,
                imageHashCtorArg = imageHash,
                certificateThumbprintCtorArg = certificateThumbprint,
                imageHashAlgorithm = imageHashAlgorithm,
                thumbprintHashAlgorithm = thumbprintHashAlgorithm,
                imageHashLength = imageHashLength,
                certificateThumbprintLength = certificateThumbprintLength,
            )
    }
}

public data class BdcbStatusUpdateContext(
    public var statusType: BdcbStatusUpdateType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BdcbStatusUpdateContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BdcbStatusUpdateContext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): BdcbStatusUpdateContext =
                    BdcbStatusUpdateContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BdcbStatusUpdateContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.statusType)
                }
            }
    }
}

public data class BootdiskInformation(
    public var bootPartitionOffset: Long = 0L,
    public var systemPartitionOffset: Long = 0L,
    public var bootDeviceSignature: UInt = 0u,
    public var systemDeviceSignature: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BootdiskInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BootdiskInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): BootdiskInformation =
                    BootdiskInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: BootdiskInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.bootPartitionOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.systemPartitionOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bootDeviceSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.systemDeviceSignature)
                }
            }
    }
}

public data class BootdiskInformationEx(
    public var bootPartitionOffset: Long = 0L,
    public var systemPartitionOffset: Long = 0L,
    public var bootDeviceSignature: UInt = 0u,
    public var systemDeviceSignature: UInt = 0u,
    public var bootDeviceGuid: Guid = Guid(),
    public var systemDeviceGuid: Guid = Guid(),
    public var bootDeviceIsGpt: Boolean = false,
    public var systemDeviceIsGpt: Boolean = false,
)

public data class BootdiskInformationLite(
    public var numberEntries: UInt = 0u,
    public var entries: List<LoaderPartitionInformationEx> = List(1) { LoaderPartitionInformationEx() },
)

public class BusInterfaceStandard internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var translateBusAddress: PtranslateBusAddress,
    public var getDmaAdapter: PgetDmaAdapter,
    public var setBusData: PgetSetDeviceData,
    public var getBusData: PgetSetDeviceData,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        translateBusAddress = null,
        getDmaAdapter = null,
        setBusData = null,
        getBusData = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PtranslateBusAddress = this.translateBusAddress

    public operator fun component7(): PgetDmaAdapter = this.getDmaAdapter

    public operator fun component8(): PgetSetDeviceData = this.setBusData

    public operator fun component9(): PgetSetDeviceData = this.getBusData

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, translateBusAddress: PtranslateBusAddress = this.translateBusAddress, getDmaAdapter: PgetDmaAdapter = this.getDmaAdapter, setBusData: PgetSetDeviceData = this.setBusData, getBusData: PgetSetDeviceData = this.getBusData): BusInterfaceStandard = BusInterfaceStandard(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, translateBusAddress = translateBusAddress, getDmaAdapter = getDmaAdapter, setBusData = setBusData, getBusData = getBusData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BusInterfaceStandard) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.translateBusAddress != other.translateBusAddress) return false
        if (this.getDmaAdapter != other.getDmaAdapter) return false
        if (this.setBusData != other.setBusData) return false
        if (this.getBusData != other.getBusData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.translateBusAddress.hashCode()
        result = 31 * result + this.getDmaAdapter.hashCode()
        result = 31 * result + this.setBusData.hashCode()
        result = 31 * result + this.getBusData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            translateBusAddress: PtranslateBusAddress = null,
            getDmaAdapter: PgetDmaAdapter = null,
            setBusData: PgetSetDeviceData = null,
            getBusData: PgetSetDeviceData = null,
        ): BusInterfaceStandard =
            BusInterfaceStandard(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                translateBusAddress = translateBusAddress,
                getDmaAdapter = getDmaAdapter,
                setBusData = setBusData,
                getBusData = getBusData,
            )
    }
}

public class BusResourceUpdateInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var getUpdatedBusResource: PgetUpdatedBusResource,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        getUpdatedBusResource = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PgetUpdatedBusResource = this.getUpdatedBusResource

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, getUpdatedBusResource: PgetUpdatedBusResource = this.getUpdatedBusResource): BusResourceUpdateInterface = BusResourceUpdateInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, getUpdatedBusResource = getUpdatedBusResource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BusResourceUpdateInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.getUpdatedBusResource != other.getUpdatedBusResource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.getUpdatedBusResource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            getUpdatedBusResource: PgetUpdatedBusResource = null,
        ): BusResourceUpdateInterface =
            BusResourceUpdateInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                getUpdatedBusResource = getUpdatedBusResource,
            )
    }
}

public data class BusSpecificResetFlags(
    public var u: BusSpecificResetFlags0 = BusSpecificResetFlags0(),
    public var asUlonglong: ULong = 0uL,
)

public data class BusSpecificResetFlags0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BusSpecificResetFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BusSpecificResetFlags0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BusSpecificResetFlags0 =
                    BusSpecificResetFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BusSpecificResetFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class ClfsMgmtClientRegistration internal constructor(
    public var version: UInt,
    public var advanceTailCallback: PclfsClientAdvanceTailCallback,
    advanceTailCallbackDataCtorArg: MutPtr,
    public var logGrowthCompleteCallback: PclfsClientLffHandlerCompleteCallback,
    logGrowthCompleteCallbackDataCtorArg: MutPtr,
    public var logUnpinnedCallback: PclfsClientLogUnpinnedCallback,
    logUnpinnedCallbackDataCtorArg: MutPtr,
) {
    public var advanceTailCallbackData: MutPtr = advanceTailCallbackDataCtorArg
        internal set

    public var logGrowthCompleteCallbackData: MutPtr = logGrowthCompleteCallbackDataCtorArg
        internal set

    public var logUnpinnedCallbackData: MutPtr = logUnpinnedCallbackDataCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        advanceTailCallback = null,
        advanceTailCallbackDataCtorArg = MutPtr(0L),
        logGrowthCompleteCallback = null,
        logGrowthCompleteCallbackDataCtorArg = MutPtr(0L),
        logUnpinnedCallback = null,
        logUnpinnedCallbackDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): PclfsClientAdvanceTailCallback = this.advanceTailCallback

    public operator fun component3(): MutPtr = this.advanceTailCallbackData

    public operator fun component4(): PclfsClientLffHandlerCompleteCallback = this.logGrowthCompleteCallback

    public operator fun component5(): MutPtr = this.logGrowthCompleteCallbackData

    public operator fun component6(): PclfsClientLogUnpinnedCallback = this.logUnpinnedCallback

    public operator fun component7(): MutPtr = this.logUnpinnedCallbackData

    public fun copy(version: UInt = this.version, advanceTailCallback: PclfsClientAdvanceTailCallback = this.advanceTailCallback, advanceTailCallbackData: MutPtr = this.advanceTailCallbackData, logGrowthCompleteCallback: PclfsClientLffHandlerCompleteCallback = this.logGrowthCompleteCallback, logGrowthCompleteCallbackData: MutPtr = this.logGrowthCompleteCallbackData, logUnpinnedCallback: PclfsClientLogUnpinnedCallback = this.logUnpinnedCallback, logUnpinnedCallbackData: MutPtr = this.logUnpinnedCallbackData): ClfsMgmtClientRegistration = ClfsMgmtClientRegistration(version = version, advanceTailCallback = advanceTailCallback, advanceTailCallbackDataCtorArg = advanceTailCallbackData, logGrowthCompleteCallback = logGrowthCompleteCallback, logGrowthCompleteCallbackDataCtorArg = logGrowthCompleteCallbackData, logUnpinnedCallback = logUnpinnedCallback, logUnpinnedCallbackDataCtorArg = logUnpinnedCallbackData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClfsMgmtClientRegistration) return false
        if (this.version != other.version) return false
        if (this.advanceTailCallback != other.advanceTailCallback) return false
        if (this.advanceTailCallbackData != other.advanceTailCallbackData) return false
        if (this.logGrowthCompleteCallback != other.logGrowthCompleteCallback) return false
        if (this.logGrowthCompleteCallbackData != other.logGrowthCompleteCallbackData) return false
        if (this.logUnpinnedCallback != other.logUnpinnedCallback) return false
        if (this.logUnpinnedCallbackData != other.logUnpinnedCallbackData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.advanceTailCallback.hashCode()
        result = 31 * result + this.advanceTailCallbackData.hashCode()
        result = 31 * result + this.logGrowthCompleteCallback.hashCode()
        result = 31 * result + this.logGrowthCompleteCallbackData.hashCode()
        result = 31 * result + this.logUnpinnedCallback.hashCode()
        result = 31 * result + this.logUnpinnedCallbackData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            advanceTailCallback: PclfsClientAdvanceTailCallback = null,
            advanceTailCallbackData: MutPtr = MutPtr(0L),
            logGrowthCompleteCallback: PclfsClientLffHandlerCompleteCallback = null,
            logGrowthCompleteCallbackData: MutPtr = MutPtr(0L),
            logUnpinnedCallback: PclfsClientLogUnpinnedCallback = null,
            logUnpinnedCallbackData: MutPtr = MutPtr(0L),
        ): ClfsMgmtClientRegistration =
            ClfsMgmtClientRegistration(
                version = version,
                advanceTailCallback = advanceTailCallback,
                advanceTailCallbackDataCtorArg = advanceTailCallbackData,
                logGrowthCompleteCallback = logGrowthCompleteCallback,
                logGrowthCompleteCallbackDataCtorArg = logGrowthCompleteCallbackData,
                logUnpinnedCallback = logUnpinnedCallback,
                logUnpinnedCallbackDataCtorArg = logUnpinnedCallbackData,
            )
    }
}

public class CmcDriverInfo internal constructor(
    public var exceptionCallback: PdriverCmcExceptionCallback,
    public var dpcCallback: PkdeferredRoutine,
    deviceContextCtorArg: MutPtr,
) {
    public var deviceContext: MutPtr = deviceContextCtorArg
        internal set

    public constructor() : this(
        exceptionCallback = null,
        dpcCallback = null,
        deviceContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PdriverCmcExceptionCallback = this.exceptionCallback

    public operator fun component2(): PkdeferredRoutine = this.dpcCallback

    public operator fun component3(): MutPtr = this.deviceContext

    public fun copy(exceptionCallback: PdriverCmcExceptionCallback = this.exceptionCallback, dpcCallback: PkdeferredRoutine = this.dpcCallback, deviceContext: MutPtr = this.deviceContext): CmcDriverInfo = CmcDriverInfo(exceptionCallback = exceptionCallback, dpcCallback = dpcCallback, deviceContextCtorArg = deviceContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmcDriverInfo) return false
        if (this.exceptionCallback != other.exceptionCallback) return false
        if (this.dpcCallback != other.dpcCallback) return false
        if (this.deviceContext != other.deviceContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCallback.hashCode()
        result = 31 * result + this.dpcCallback.hashCode()
        result = 31 * result + this.deviceContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            exceptionCallback: PdriverCmcExceptionCallback = null,
            dpcCallback: PkdeferredRoutine = null,
            deviceContext: MutPtr = MutPtr(0L),
        ): CmcDriverInfo =
            CmcDriverInfo(
                exceptionCallback = exceptionCallback,
                dpcCallback = dpcCallback,
                deviceContextCtorArg = deviceContext,
            )
    }
}

public data class CmComponentInformation(
    public var flags: DeviceFlags = DeviceFlags(),
    public var version: UInt = 0u,
    public var key: UInt = 0u,
    public var affinityMask: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmComponentInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmComponentInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CmComponentInformation =
                    CmComponentInformation(
                        (DeviceFlags.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CmComponentInformation) {
                    (DeviceFlags.typeLayout()).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.affinityMask)
                }
            }
    }
}

public data class CmDiskGeometryDeviceData(
    public var bytesPerSector: UInt = 0u,
    public var numberOfCylinders: UInt = 0u,
    public var sectorsPerTrack: UInt = 0u,
    public var numberOfHeads: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmDiskGeometryDeviceData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmDiskGeometryDeviceData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CmDiskGeometryDeviceData =
                    CmDiskGeometryDeviceData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: CmDiskGeometryDeviceData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bytesPerSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfCylinders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sectorsPerTrack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfHeads)
                }
            }
    }
}

public data class CmEisaFunctionInformation(
    public var compressedId: UInt = 0u,
    public var idSlotFlags1: UByte = 0u,
    public var idSlotFlags2: UByte = 0u,
    public var minorRevision: UByte = 0u,
    public var majorRevision: UByte = 0u,
    public var selections: UByteArray = UByteArray(26),
    public var functionFlags: UByte = 0u,
    public var typeString: UByteArray = UByteArray(80),
    public var eisaMemory: List<EisaMemoryConfiguration> = List(9) { EisaMemoryConfiguration() },
    public var eisaIrq: List<EisaIrqConfiguration> = List(7) { EisaIrqConfiguration() },
    public var eisaDma: List<EisaDmaConfiguration> = List(4) { EisaDmaConfiguration() },
    public var eisaPort: List<EisaPortConfiguration> = List(20) { EisaPortConfiguration() },
    public var initializationData: UByteArray = UByteArray(60),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmEisaFunctionInformation) return false
        if (this.compressedId != other.compressedId) return false
        if (this.idSlotFlags1 != other.idSlotFlags1) return false
        if (this.idSlotFlags2 != other.idSlotFlags2) return false
        if (this.minorRevision != other.minorRevision) return false
        if (this.majorRevision != other.majorRevision) return false
        if (!this.selections.contentEquals(other.selections)) return false
        if (this.functionFlags != other.functionFlags) return false
        if (!this.typeString.contentEquals(other.typeString)) return false
        if (this.eisaMemory != other.eisaMemory) return false
        if (this.eisaIrq != other.eisaIrq) return false
        if (this.eisaDma != other.eisaDma) return false
        if (this.eisaPort != other.eisaPort) return false
        if (!this.initializationData.contentEquals(other.initializationData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compressedId.hashCode()
        result = 31 * result + this.idSlotFlags1.hashCode()
        result = 31 * result + this.idSlotFlags2.hashCode()
        result = 31 * result + this.minorRevision.hashCode()
        result = 31 * result + this.majorRevision.hashCode()
        result = 31 * result + this.selections.contentHashCode()
        result = 31 * result + this.functionFlags.hashCode()
        result = 31 * result + this.typeString.contentHashCode()
        result = 31 * result + this.eisaMemory.hashCode()
        result = 31 * result + this.eisaIrq.hashCode()
        result = 31 * result + this.eisaDma.hashCode()
        result = 31 * result + this.eisaPort.hashCode()
        result = 31 * result + this.initializationData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmEisaFunctionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmEisaFunctionInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 320L
                override fun readNative(addr: Long): CmEisaFunctionInformation =
                    CmEisaFunctionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (26).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 34L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 35L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(EisaMemoryConfiguration.typeLayout(), (9).toInt())
                        ).readNative(addr + 115L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(EisaIrqConfiguration.typeLayout(), (7).toInt())
                        ).readNative(addr + 178L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(EisaDmaConfiguration.typeLayout(), (4).toInt())
                        ).readNative(addr + 192L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(EisaPortConfiguration.typeLayout(), (20).toInt())
                        ).readNative(addr + 200L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (60).toInt())
                        ).readNative(addr + 260L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CmEisaFunctionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.compressedId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.idSlotFlags1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.idSlotFlags2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.minorRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.majorRevision)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (26).toInt())
                    ).writeNative(addr + 8L, value.selections.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 34L, value.functionFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 35L, value.typeString.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(EisaMemoryConfiguration.typeLayout(), (9).toInt())
                    ).writeNative(addr + 115L, value.eisaMemory)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(EisaIrqConfiguration.typeLayout(), (7).toInt())
                    ).writeNative(addr + 178L, value.eisaIrq)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(EisaDmaConfiguration.typeLayout(), (4).toInt())
                    ).writeNative(addr + 192L, value.eisaDma)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(EisaPortConfiguration.typeLayout(), (20).toInt())
                    ).writeNative(addr + 200L, value.eisaPort)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (60).toInt())
                    ).writeNative(addr + 260L, value.initializationData.toList())
                }
            }
    }
}

public data class CmEisaSlotInformation(
    public var returnCode: UByte = 0u,
    public var returnFlags: UByte = 0u,
    public var majorRevision: UByte = 0u,
    public var minorRevision: UByte = 0u,
    public var checksum: UShort = 0u,
    public var numberFunctions: UByte = 0u,
    public var functionInformation: UByte = 0u,
    public var compressedId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmEisaSlotInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmEisaSlotInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmEisaSlotInformation =
                    CmEisaSlotInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmEisaSlotInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.returnCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.returnFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.majorRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.minorRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.numberFunctions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.functionInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.compressedId)
                }
            }
    }
}

public class CmFloppyDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var size: ByteArray = ByteArray(8),
    public var maxDensity: UInt = 0u,
    public var mountDensity: UInt = 0u,
    public var stepRateHeadUnloadTime: UByte = 0u,
    public var headLoadTime: UByte = 0u,
    public var motorOffTime: UByte = 0u,
    public var sectorLengthCode: UByte = 0u,
    public var sectorPerTrack: UByte = 0u,
    public var readWriteGapLength: UByte = 0u,
    public var dataTransferLength: UByte = 0u,
    public var formatGapLength: UByte = 0u,
    public var formatFillCharacter: UByte = 0u,
    public var headSettleTime: UByte = 0u,
    public var motorSettleTime: UByte = 0u,
    public var maximumTrackValue: UByte = 0u,
    public var dataTransferRate: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmFloppyDeviceData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmFloppyDeviceData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): CmFloppyDeviceData =
                    CmFloppyDeviceData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 21L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 23L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 27L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 29L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 31L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CmFloppyDeviceData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.revision)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8).toInt())
                    ).writeNative(addr + 4L, value.size.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxDensity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.mountDensity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.stepRateHeadUnloadTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 21L, value.headLoadTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.motorOffTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 23L, value.sectorLengthCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.sectorPerTrack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.readWriteGapLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 26L, value.dataTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 27L, value.formatGapLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 28L, value.formatFillCharacter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 29L, value.headSettleTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 30L, value.motorSettleTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 31L, value.maximumTrackValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 32L, value.dataTransferRate)
                }
            }
    }
}

public data class CmFullResourceDescriptor(
    public var interfaceType: InterfaceType = 0,
    public var busNumber: UInt = 0u,
    public var partialResourceList: CmPartialResourceList = CmPartialResourceList(),
)

public data class CmInt13DriveParameter(
    public var driveSelect: UShort = 0u,
    public var maxCylinders: UInt = 0u,
    public var sectorsPerTrack: UShort = 0u,
    public var maxHeads: UShort = 0u,
    public var numberDrives: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmInt13DriveParameter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmInt13DriveParameter> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmInt13DriveParameter =
                    CmInt13DriveParameter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: CmInt13DriveParameter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.driveSelect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2L, value.maxCylinders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.sectorsPerTrack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.maxHeads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.numberDrives)
                }
            }
    }
}

public data class CmKeyboardDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var type: UByte = 0u,
    public var subtype: UByte = 0u,
    public var keyboardFlags: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmKeyboardDeviceData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmKeyboardDeviceData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CmKeyboardDeviceData =
                    CmKeyboardDeviceData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: CmKeyboardDeviceData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.subtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.keyboardFlags)
                }
            }
    }
}

public data class CmMcaPosData(
    public var adapterId: UShort = 0u,
    public var posData1: UByte = 0u,
    public var posData2: UByte = 0u,
    public var posData3: UByte = 0u,
    public var posData4: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmMcaPosData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmMcaPosData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): CmMcaPosData =
                    CmMcaPosData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: CmMcaPosData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.adapterId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.posData1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.posData2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.posData3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.posData4)
                }
            }
    }
}

public class CmMonitorDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var horizontalScreenSize: UShort = 0u,
    public var verticalScreenSize: UShort = 0u,
    public var horizontalResolution: UShort = 0u,
    public var verticalResolution: UShort = 0u,
    public var horizontalDisplayTimeLow: UShort = 0u,
    public var horizontalDisplayTime: UShort = 0u,
    public var horizontalDisplayTimeHigh: UShort = 0u,
    public var horizontalBackPorchLow: UShort = 0u,
    public var horizontalBackPorch: UShort = 0u,
    public var horizontalBackPorchHigh: UShort = 0u,
    public var horizontalFrontPorchLow: UShort = 0u,
    public var horizontalFrontPorch: UShort = 0u,
    public var horizontalFrontPorchHigh: UShort = 0u,
    public var horizontalSyncLow: UShort = 0u,
    public var horizontalSync: UShort = 0u,
    public var horizontalSyncHigh: UShort = 0u,
    public var verticalBackPorchLow: UShort = 0u,
    public var verticalBackPorch: UShort = 0u,
    public var verticalBackPorchHigh: UShort = 0u,
    public var verticalFrontPorchLow: UShort = 0u,
    public var verticalFrontPorch: UShort = 0u,
    public var verticalFrontPorchHigh: UShort = 0u,
    public var verticalSyncLow: UShort = 0u,
    public var verticalSync: UShort = 0u,
    public var verticalSyncHigh: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmMonitorDeviceData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmMonitorDeviceData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 54L
                override fun readNative(addr: Long): CmMonitorDeviceData =
                    CmMonitorDeviceData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 38L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: CmMonitorDeviceData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.horizontalScreenSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.verticalScreenSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.horizontalResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.verticalResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.horizontalDisplayTimeLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.horizontalDisplayTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.horizontalDisplayTimeHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.horizontalBackPorchLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.horizontalBackPorch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.horizontalBackPorchHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.horizontalFrontPorchLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.horizontalFrontPorch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.horizontalFrontPorchHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.horizontalSyncLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.horizontalSync)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.horizontalSyncHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.verticalBackPorchLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 38L, value.verticalBackPorch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.verticalBackPorchHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.verticalFrontPorchLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.verticalFrontPorch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.verticalFrontPorchHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.verticalSyncLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.verticalSync)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 52L, value.verticalSyncHigh)
                }
            }
    }
}

public data class CmPartialResourceDescriptor(
    public var type: UByte = 0u,
    public var shareDisposition: UByte = 0u,
    public var flags: UShort = 0u,
    public var u: CmPartialResourceDescriptor0 = CmPartialResourceDescriptor0(),
)

public data class CmPartialResourceDescriptor0(
    public var generic: CmPartialResourceDescriptor00 = CmPartialResourceDescriptor00(),
    public var port: CmPartialResourceDescriptor01 = CmPartialResourceDescriptor01(),
    public var interrupt: CmPartialResourceDescriptor02 = CmPartialResourceDescriptor02(),
    public var messageInterrupt: CmPartialResourceDescriptor03 = CmPartialResourceDescriptor03(),
    public var memory: CmPartialResourceDescriptor04 = CmPartialResourceDescriptor04(),
    public var dma: CmPartialResourceDescriptor05 = CmPartialResourceDescriptor05(),
    public var dmaV3: CmPartialResourceDescriptor06 = CmPartialResourceDescriptor06(),
    public var devicePrivate: CmPartialResourceDescriptor07 = CmPartialResourceDescriptor07(),
    public var busNumber: CmPartialResourceDescriptor08 = CmPartialResourceDescriptor08(),
    public var deviceSpecificData: CmPartialResourceDescriptor09 = CmPartialResourceDescriptor09(),
    public var memory40: CmPartialResourceDescriptor010 = CmPartialResourceDescriptor010(),
    public var memory48: CmPartialResourceDescriptor011 = CmPartialResourceDescriptor011(),
    public var memory64: CmPartialResourceDescriptor012 = CmPartialResourceDescriptor012(),
    public var connection: CmPartialResourceDescriptor013 = CmPartialResourceDescriptor013(),
)

public data class CmPartialResourceDescriptor08(
    public var start: UInt = 0u,
    public var length: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor08> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor08> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor08 =
                    CmPartialResourceDescriptor08(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor08) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved)
                }
            }
    }
}

public data class CmPartialResourceDescriptor013(
    public var cls: UByte = 0u,
    public var type: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var idLowPart: UInt = 0u,
    public var idHighPart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor013> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor013> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor013 =
                    CmPartialResourceDescriptor013(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor013) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.cls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.idLowPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.idHighPart)
                }
            }
    }
}

public data class CmPartialResourceDescriptor07(
    public var data: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPartialResourceDescriptor07) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor07> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor07> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor07 =
                    CmPartialResourceDescriptor07(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor07) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr, value.data.toList())
                }
            }
    }
}

public data class CmPartialResourceDescriptor09(
    public var dataSize: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor09> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor09> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor09 =
                    CmPartialResourceDescriptor09(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor09) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved2)
                }
            }
    }
}

public data class CmPartialResourceDescriptor06(
    public var channel: UInt = 0u,
    public var requestLine: UInt = 0u,
    public var transferWidth: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var reserved3: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor06> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor06> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor06 =
                    CmPartialResourceDescriptor06(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor06) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.channel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.requestLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.transferWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.reserved3)
                }
            }
    }
}

public data class CmPartialResourceDescriptor05(
    public var channel: UInt = 0u,
    public var port: UInt = 0u,
    public var reserved1: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor05> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor05> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor05 =
                    CmPartialResourceDescriptor05(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor05) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.channel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved1)
                }
            }
    }
}

public data class CmPartialResourceDescriptor00(
    public var start: Long = 0L,
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor00 =
                    CmPartialResourceDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class CmPartialResourceDescriptor02(
    public var level: UInt = 0u,
    public var vector: UInt = 0u,
    public var affinity: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor02> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CmPartialResourceDescriptor02 =
                    CmPartialResourceDescriptor02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.affinity)
                }
            }
    }
}

public data class CmPartialResourceDescriptor010(
    public var start: Long = 0L,
    public var length40: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor010> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor010 =
                    CmPartialResourceDescriptor010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length40)
                }
            }
    }
}

public data class CmPartialResourceDescriptor011(
    public var start: Long = 0L,
    public var length48: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor011> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor011> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor011 =
                    CmPartialResourceDescriptor011(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor011) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length48)
                }
            }
    }
}

public data class CmPartialResourceDescriptor012(
    public var start: Long = 0L,
    public var length64: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor012> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor012> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor012 =
                    CmPartialResourceDescriptor012(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor012) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length64)
                }
            }
    }
}

public data class CmPartialResourceDescriptor04(
    public var start: Long = 0L,
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor04> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor04 =
                    CmPartialResourceDescriptor04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class CmPartialResourceDescriptor03(
    public var anonymous: CmPartialResourceDescriptor030 = CmPartialResourceDescriptor030(),
)

public data class CmPartialResourceDescriptor030(
    public var raw: CmPartialResourceDescriptor0300 = CmPartialResourceDescriptor0300(),
    public var translated: CmPartialResourceDescriptor0301 = CmPartialResourceDescriptor0301(),
)

public data class CmPartialResourceDescriptor0300(
    public var reserved: UShort = 0u,
    public var messageCount: UShort = 0u,
    public var vector: UInt = 0u,
    public var affinity: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor0300> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor0300> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CmPartialResourceDescriptor0300 =
                    CmPartialResourceDescriptor0300(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor0300) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.messageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.affinity)
                }
            }
    }
}

public data class CmPartialResourceDescriptor0301(
    public var level: UInt = 0u,
    public var vector: UInt = 0u,
    public var affinity: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor0301> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor0301> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CmPartialResourceDescriptor0301 =
                    CmPartialResourceDescriptor0301(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor0301) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.affinity)
                }
            }
    }
}

public data class CmPartialResourceDescriptor01(
    public var start: Long = 0L,
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPartialResourceDescriptor01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPartialResourceDescriptor01 =
                    CmPartialResourceDescriptor01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmPartialResourceDescriptor01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class CmPartialResourceList(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var count: UInt = 0u,
    public var partialDescriptors: List<CmPartialResourceDescriptor> = List(1) { CmPartialResourceDescriptor() },
)

public data class CmPccardDeviceData(
    public var flags: UByte = 0u,
    public var errorCode: UByte = 0u,
    public var reserved: UShort = 0u,
    public var busData: UInt = 0u,
    public var deviceId: UInt = 0u,
    public var legacyBaseAddress: UInt = 0u,
    public var iRQMap: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPccardDeviceData) return false
        if (this.flags != other.flags) return false
        if (this.errorCode != other.errorCode) return false
        if (this.reserved != other.reserved) return false
        if (this.busData != other.busData) return false
        if (this.deviceId != other.deviceId) return false
        if (this.legacyBaseAddress != other.legacyBaseAddress) return false
        if (!this.iRQMap.contentEquals(other.iRQMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.busData.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        result = 31 * result + this.legacyBaseAddress.hashCode()
        result = 31 * result + this.iRQMap.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPccardDeviceData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPccardDeviceData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CmPccardDeviceData =
                    CmPccardDeviceData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CmPccardDeviceData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.errorCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.busData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.deviceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.legacyBaseAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.iRQMap.toList())
                }
            }
    }
}

public data class CmPnpBiosDeviceNode(
    public var size: UShort = 0u,
    public var node: UByte = 0u,
    public var productId: UInt = 0u,
    public var deviceType: UByteArray = UByteArray(3),
    public var deviceAttributes: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPnpBiosDeviceNode) return false
        if (this.size != other.size) return false
        if (this.node != other.node) return false
        if (this.productId != other.productId) return false
        if (!this.deviceType.contentEquals(other.deviceType)) return false
        if (this.deviceAttributes != other.deviceAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.node.hashCode()
        result = 31 * result + this.productId.hashCode()
        result = 31 * result + this.deviceType.contentHashCode()
        result = 31 * result + this.deviceAttributes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPnpBiosDeviceNode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPnpBiosDeviceNode> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmPnpBiosDeviceNode =
                    CmPnpBiosDeviceNode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 7L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: CmPnpBiosDeviceNode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.node)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 3L, value.productId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 7L, value.deviceType.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.deviceAttributes)
                }
            }
    }
}

public data class CmPnpBiosInstallationCheck(
    public var signature: UByteArray = UByteArray(4),
    public var revision: UByte = 0u,
    public var length: UByte = 0u,
    public var controlField: UShort = 0u,
    public var checksum: UByte = 0u,
    public var eventFlagAddress: UInt = 0u,
    public var realModeEntryOffset: UShort = 0u,
    public var realModeEntrySegment: UShort = 0u,
    public var protectedModeEntryOffset: UShort = 0u,
    public var protectedModeCodeBaseAddress: UInt = 0u,
    public var oemDeviceId: UInt = 0u,
    public var realModeDataBaseAddress: UShort = 0u,
    public var protectedModeDataBaseAddress: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPnpBiosInstallationCheck) return false
        if (!this.signature.contentEquals(other.signature)) return false
        if (this.revision != other.revision) return false
        if (this.length != other.length) return false
        if (this.controlField != other.controlField) return false
        if (this.checksum != other.checksum) return false
        if (this.eventFlagAddress != other.eventFlagAddress) return false
        if (this.realModeEntryOffset != other.realModeEntryOffset) return false
        if (this.realModeEntrySegment != other.realModeEntrySegment) return false
        if (this.protectedModeEntryOffset != other.protectedModeEntryOffset) return false
        if (this.protectedModeCodeBaseAddress != other.protectedModeCodeBaseAddress) return false
        if (this.oemDeviceId != other.oemDeviceId) return false
        if (this.realModeDataBaseAddress != other.realModeDataBaseAddress) return false
        if (this.protectedModeDataBaseAddress != other.protectedModeDataBaseAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.contentHashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.controlField.hashCode()
        result = 31 * result + this.checksum.hashCode()
        result = 31 * result + this.eventFlagAddress.hashCode()
        result = 31 * result + this.realModeEntryOffset.hashCode()
        result = 31 * result + this.realModeEntrySegment.hashCode()
        result = 31 * result + this.protectedModeEntryOffset.hashCode()
        result = 31 * result + this.protectedModeCodeBaseAddress.hashCode()
        result = 31 * result + this.oemDeviceId.hashCode()
        result = 31 * result + this.realModeDataBaseAddress.hashCode()
        result = 31 * result + this.protectedModeDataBaseAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPnpBiosInstallationCheck> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPnpBiosInstallationCheck> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 33L
                override fun readNative(addr: Long): CmPnpBiosInstallationCheck =
                    CmPnpBiosInstallationCheck(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 23L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 27L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 29L),
                    )
                override fun writeNative(addr: Long, value: CmPnpBiosInstallationCheck) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.signature.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.controlField)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 9L, value.eventFlagAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 13L, value.realModeEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 15L, value.realModeEntrySegment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 17L, value.protectedModeEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 19L, value.protectedModeCodeBaseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 23L, value.oemDeviceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 27L, value.realModeDataBaseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 29L, value.protectedModeDataBaseAddress)
                }
            }
    }
}

public data class CmPowerData(
    public var pdSize: UInt = 0u,
    public var pdMostRecentPowerState: DevicePowerState = 0,
    public var pdCapabilities: DevicePowerCapabilities = 0u,
    public var pdD1Latency: UInt = 0u,
    public var pdD2Latency: UInt = 0u,
    public var pdD3Latency: UInt = 0u,
    public var pdPowerStateMapping: IntArray = IntArray(7),
    public var pdDeepestSystemWake: SystemPowerState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPowerData) return false
        if (this.pdSize != other.pdSize) return false
        if (this.pdMostRecentPowerState != other.pdMostRecentPowerState) return false
        if (this.pdCapabilities != other.pdCapabilities) return false
        if (this.pdD1Latency != other.pdD1Latency) return false
        if (this.pdD2Latency != other.pdD2Latency) return false
        if (this.pdD3Latency != other.pdD3Latency) return false
        if (!this.pdPowerStateMapping.contentEquals(other.pdPowerStateMapping)) return false
        if (this.pdDeepestSystemWake != other.pdDeepestSystemWake) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pdSize.hashCode()
        result = 31 * result + this.pdMostRecentPowerState.hashCode()
        result = 31 * result + this.pdCapabilities.hashCode()
        result = 31 * result + this.pdD1Latency.hashCode()
        result = 31 * result + this.pdD2Latency.hashCode()
        result = 31 * result + this.pdD3Latency.hashCode()
        result = 31 * result + this.pdPowerStateMapping.contentHashCode()
        result = 31 * result + this.pdDeepestSystemWake.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPowerData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPowerData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): CmPowerData =
                    CmPowerData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (7).toInt())
                        ).readNative(addr + 24L).toIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: CmPowerData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pdSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.pdMostRecentPowerState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pdCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pdD1Latency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pdD2Latency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pdD3Latency)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (7).toInt())
                    ).writeNative(addr + 24L, value.pdPowerStateMapping.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.pdDeepestSystemWake)
                }
            }
    }
}

public data class CmResourceList(
    public var count: UInt = 0u,
    public var list: List<CmFullResourceDescriptor> = List(1) { CmFullResourceDescriptor() },
)

public data class CmRomBlock(
    public var address: UInt = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmRomBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmRomBlock> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CmRomBlock =
                    CmRomBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CmRomBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                }
            }
    }
}

public data class CmScsiDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var hostIdentifier: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmScsiDeviceData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmScsiDeviceData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): CmScsiDeviceData =
                    CmScsiDeviceData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CmScsiDeviceData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.hostIdentifier)
                }
            }
    }
}

public data class CmSerialDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var baudClock: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmSerialDeviceData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmSerialDeviceData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CmSerialDeviceData =
                    CmSerialDeviceData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CmSerialDeviceData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.baudClock)
                }
            }
    }
}

public data class CmSonicDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var dataConfigurationRegister: UShort = 0u,
    public var ethernetAddress: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmSonicDeviceData) return false
        if (this.version != other.version) return false
        if (this.revision != other.revision) return false
        if (this.dataConfigurationRegister != other.dataConfigurationRegister) return false
        if (!this.ethernetAddress.contentEquals(other.ethernetAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.dataConfigurationRegister.hashCode()
        result = 31 * result + this.ethernetAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmSonicDeviceData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmSonicDeviceData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 14L
                override fun readNative(addr: Long): CmSonicDeviceData =
                    CmSonicDeviceData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CmSonicDeviceData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.dataConfigurationRegister)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 6L, value.ethernetAddress.toList())
                }
            }
    }
}

public data class CmVideoDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var videoClock: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmVideoDeviceData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmVideoDeviceData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CmVideoDeviceData =
                    CmVideoDeviceData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CmVideoDeviceData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.videoClock)
                }
            }
    }
}

public data class ConfigurationInformation(
    public var diskCount: UInt = 0u,
    public var floppyCount: UInt = 0u,
    public var cdRomCount: UInt = 0u,
    public var tapeCount: UInt = 0u,
    public var scsiPortCount: UInt = 0u,
    public var serialCount: UInt = 0u,
    public var parallelCount: UInt = 0u,
    public var atDiskPrimaryAddressClaimed: Boolean = false,
    public var atDiskSecondaryAddressClaimed: Boolean = false,
    public var version: UInt = 0u,
    public var mediumChangerCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConfigurationInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConfigurationInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ConfigurationInformation =
                    ConfigurationInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 29L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: ConfigurationInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.diskCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.floppyCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cdRomCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tapeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.scsiPortCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.serialCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.parallelCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 28L, value.atDiskPrimaryAddressClaimed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 29L, value.atDiskSecondaryAddressClaimed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.mediumChangerCount)
                }
            }
    }
}

public class ControllerObject internal constructor(
    public var type: Short,
    public var size: Short,
    controllerExtensionCtorArg: MutPtr,
    public var deviceWaitQueue: KdeviceQueue,
    public var spare1: UInt,
    public var spare2: Long,
) {
    public var controllerExtension: MutPtr = controllerExtensionCtorArg
        internal set

    public constructor() : this(
        type = 0,
        size = 0,
        controllerExtensionCtorArg = MutPtr(0L),
        deviceWaitQueue = KdeviceQueue(),
        spare1 = 0u,
        spare2 = 0L,
    )

    public operator fun component1(): Short = this.type

    public operator fun component2(): Short = this.size

    public operator fun component3(): MutPtr = this.controllerExtension

    public operator fun component4(): KdeviceQueue = this.deviceWaitQueue

    public operator fun component5(): UInt = this.spare1

    public operator fun component6(): Long = this.spare2

    public fun copy(type: Short = this.type, size: Short = this.size, controllerExtension: MutPtr = this.controllerExtension, deviceWaitQueue: KdeviceQueue = this.deviceWaitQueue, spare1: UInt = this.spare1, spare2: Long = this.spare2): ControllerObject = ControllerObject(type = type, size = size, controllerExtensionCtorArg = controllerExtension, deviceWaitQueue = deviceWaitQueue, spare1 = spare1, spare2 = spare2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ControllerObject) return false
        if (this.type != other.type) return false
        if (this.size != other.size) return false
        if (this.controllerExtension != other.controllerExtension) return false
        if (this.deviceWaitQueue != other.deviceWaitQueue) return false
        if (this.spare1 != other.spare1) return false
        if (this.spare2 != other.spare2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.controllerExtension.hashCode()
        result = 31 * result + this.deviceWaitQueue.hashCode()
        result = 31 * result + this.spare1.hashCode()
        result = 31 * result + this.spare2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: Short = 0,
            size: Short = 0,
            controllerExtension: MutPtr = MutPtr(0L),
            deviceWaitQueue: KdeviceQueue = KdeviceQueue(),
            spare1: UInt = 0u,
            spare2: Long = 0L,
        ): ControllerObject =
            ControllerObject(
                type = type,
                size = size,
                controllerExtensionCtorArg = controllerExtension,
                deviceWaitQueue = deviceWaitQueue,
                spare1 = spare1,
                spare2 = spare2,
            )
    }
}

public data class CountedReasonContext(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var anonymous: CountedReasonContext0 = CountedReasonContext0(),
)

public data class CountedReasonContext0(
    public var anonymous: CountedReasonContext00 = CountedReasonContext00(),
    public var simpleString: UnicodeString = UnicodeString(),
)

public class CountedReasonContext00 internal constructor(
    public var resourceFileName: UnicodeString,
    public var resourceReasonId: UShort,
    public var stringCount: UInt,
    reasonStringsCtorArg: MutPtr,
) {
    public var reasonStrings: MutPtr = reasonStringsCtorArg
        internal set

    public constructor() : this(
        resourceFileName = UnicodeString(),
        resourceReasonId = 0u,
        stringCount = 0u,
        reasonStringsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UnicodeString = this.resourceFileName

    public operator fun component2(): UShort = this.resourceReasonId

    public operator fun component3(): UInt = this.stringCount

    public operator fun component4(): MutPtr = this.reasonStrings

    public fun copy(resourceFileName: UnicodeString = this.resourceFileName, resourceReasonId: UShort = this.resourceReasonId, stringCount: UInt = this.stringCount, reasonStrings: MutPtr = this.reasonStrings): CountedReasonContext00 = CountedReasonContext00(resourceFileName = resourceFileName, resourceReasonId = resourceReasonId, stringCount = stringCount, reasonStringsCtorArg = reasonStrings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CountedReasonContext00) return false
        if (this.resourceFileName != other.resourceFileName) return false
        if (this.resourceReasonId != other.resourceReasonId) return false
        if (this.stringCount != other.stringCount) return false
        if (this.reasonStrings != other.reasonStrings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resourceFileName.hashCode()
        result = 31 * result + this.resourceReasonId.hashCode()
        result = 31 * result + this.stringCount.hashCode()
        result = 31 * result + this.reasonStrings.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            resourceFileName: UnicodeString = UnicodeString(),
            resourceReasonId: UShort = 0u,
            stringCount: UInt = 0u,
            reasonStrings: MutPtr = MutPtr(0L),
        ): CountedReasonContext00 =
            CountedReasonContext00(
                resourceFileName = resourceFileName,
                resourceReasonId = resourceReasonId,
                stringCount = stringCount,
                reasonStringsCtorArg = reasonStrings,
            )
    }
}

public class CpeDriverInfo internal constructor(
    public var exceptionCallback: PdriverCpeExceptionCallback,
    public var dpcCallback: PkdeferredRoutine,
    deviceContextCtorArg: MutPtr,
) {
    public var deviceContext: MutPtr = deviceContextCtorArg
        internal set

    public constructor() : this(
        exceptionCallback = null,
        dpcCallback = null,
        deviceContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PdriverCpeExceptionCallback = this.exceptionCallback

    public operator fun component2(): PkdeferredRoutine = this.dpcCallback

    public operator fun component3(): MutPtr = this.deviceContext

    public fun copy(exceptionCallback: PdriverCpeExceptionCallback = this.exceptionCallback, dpcCallback: PkdeferredRoutine = this.dpcCallback, deviceContext: MutPtr = this.deviceContext): CpeDriverInfo = CpeDriverInfo(exceptionCallback = exceptionCallback, dpcCallback = dpcCallback, deviceContextCtorArg = deviceContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpeDriverInfo) return false
        if (this.exceptionCallback != other.exceptionCallback) return false
        if (this.dpcCallback != other.dpcCallback) return false
        if (this.deviceContext != other.deviceContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCallback.hashCode()
        result = 31 * result + this.dpcCallback.hashCode()
        result = 31 * result + this.deviceContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            exceptionCallback: PdriverCpeExceptionCallback = null,
            dpcCallback: PkdeferredRoutine = null,
            deviceContext: MutPtr = MutPtr(0L),
        ): CpeDriverInfo =
            CpeDriverInfo(
                exceptionCallback = exceptionCallback,
                dpcCallback = dpcCallback,
                deviceContextCtorArg = deviceContext,
            )
    }
}

public class CrashdumpFunctionsInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var powerOn: PcrashdumpPowerOn,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        powerOn = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PcrashdumpPowerOn = this.powerOn

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, powerOn: PcrashdumpPowerOn = this.powerOn): CrashdumpFunctionsInterface = CrashdumpFunctionsInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, powerOn = powerOn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CrashdumpFunctionsInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.powerOn != other.powerOn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.powerOn.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            powerOn: PcrashdumpPowerOn = null,
        ): CrashdumpFunctionsInterface =
            CrashdumpFunctionsInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                powerOn = powerOn,
            )
    }
}

public class CreateUserProcessEcpContext internal constructor(
    public var size: UShort,
    public var reserved: UShort,
    accessTokenCtorArg: MutPtr,
) {
    public var accessToken: MutPtr = accessTokenCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        reserved = 0u,
        accessTokenCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.reserved

    public operator fun component3(): MutPtr = this.accessToken

    public fun copy(size: UShort = this.size, reserved: UShort = this.reserved, accessToken: MutPtr = this.accessToken): CreateUserProcessEcpContext = CreateUserProcessEcpContext(size = size, reserved = reserved, accessTokenCtorArg = accessToken)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreateUserProcessEcpContext) return false
        if (this.size != other.size) return false
        if (this.reserved != other.reserved) return false
        if (this.accessToken != other.accessToken) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.accessToken.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CreateUserProcessEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CreateUserProcessEcpContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CreateUserProcessEcpContext =
                    CreateUserProcessEcpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CreateUserProcessEcpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.accessToken)
                }
            }

        public operator fun invoke(
            size: UShort = 0u,
            reserved: UShort = 0u,
            accessToken: MutPtr = MutPtr(0L),
        ): CreateUserProcessEcpContext =
            CreateUserProcessEcpContext(
                size = size,
                reserved = reserved,
                accessTokenCtorArg = accessToken,
            )
    }
}

public class D3coldAuxPowerAndTimingInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var requestCorePowerRail: Pd3coldRequestCorePowerRail,
    public var requestAuxPower: Pd3coldRequestAuxPower,
    public var requestPerstDelay: Pd3coldRequestPerstDelay,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        requestCorePowerRail = null,
        requestAuxPower = null,
        requestPerstDelay = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): Pd3coldRequestCorePowerRail = this.requestCorePowerRail

    public operator fun component7(): Pd3coldRequestAuxPower = this.requestAuxPower

    public operator fun component8(): Pd3coldRequestPerstDelay = this.requestPerstDelay

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, requestCorePowerRail: Pd3coldRequestCorePowerRail = this.requestCorePowerRail, requestAuxPower: Pd3coldRequestAuxPower = this.requestAuxPower, requestPerstDelay: Pd3coldRequestPerstDelay = this.requestPerstDelay): D3coldAuxPowerAndTimingInterface = D3coldAuxPowerAndTimingInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, requestCorePowerRail = requestCorePowerRail, requestAuxPower = requestAuxPower, requestPerstDelay = requestPerstDelay)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3coldAuxPowerAndTimingInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.requestCorePowerRail != other.requestCorePowerRail) return false
        if (this.requestAuxPower != other.requestAuxPower) return false
        if (this.requestPerstDelay != other.requestPerstDelay) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.requestCorePowerRail.hashCode()
        result = 31 * result + this.requestAuxPower.hashCode()
        result = 31 * result + this.requestPerstDelay.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            requestCorePowerRail: Pd3coldRequestCorePowerRail = null,
            requestAuxPower: Pd3coldRequestAuxPower = null,
            requestPerstDelay: Pd3coldRequestPerstDelay = null,
        ): D3coldAuxPowerAndTimingInterface =
            D3coldAuxPowerAndTimingInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                requestCorePowerRail = requestCorePowerRail,
                requestAuxPower = requestAuxPower,
                requestPerstDelay = requestPerstDelay,
            )
    }
}

public class D3coldSupportInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var setD3ColdSupport: PsetD3coldSupport,
    public var getIdleWakeInfo: PgetIdleWakeInfo,
    public var getD3ColdCapability: PgetD3coldCapability,
    public var getBusDriverD3ColdSupport: PgetD3coldCapability,
    public var getLastTransitionStatus: PgetD3coldLastTransitionStatus,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        setD3ColdSupport = null,
        getIdleWakeInfo = null,
        getD3ColdCapability = null,
        getBusDriverD3ColdSupport = null,
        getLastTransitionStatus = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PsetD3coldSupport = this.setD3ColdSupport

    public operator fun component7(): PgetIdleWakeInfo = this.getIdleWakeInfo

    public operator fun component8(): PgetD3coldCapability = this.getD3ColdCapability

    public operator fun component9(): PgetD3coldCapability = this.getBusDriverD3ColdSupport

    public operator fun component10(): PgetD3coldLastTransitionStatus = this.getLastTransitionStatus

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, setD3ColdSupport: PsetD3coldSupport = this.setD3ColdSupport, getIdleWakeInfo: PgetIdleWakeInfo = this.getIdleWakeInfo, getD3ColdCapability: PgetD3coldCapability = this.getD3ColdCapability, getBusDriverD3ColdSupport: PgetD3coldCapability = this.getBusDriverD3ColdSupport, getLastTransitionStatus: PgetD3coldLastTransitionStatus = this.getLastTransitionStatus): D3coldSupportInterface = D3coldSupportInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, setD3ColdSupport = setD3ColdSupport, getIdleWakeInfo = getIdleWakeInfo, getD3ColdCapability = getD3ColdCapability, getBusDriverD3ColdSupport = getBusDriverD3ColdSupport, getLastTransitionStatus = getLastTransitionStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3coldSupportInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.setD3ColdSupport != other.setD3ColdSupport) return false
        if (this.getIdleWakeInfo != other.getIdleWakeInfo) return false
        if (this.getD3ColdCapability != other.getD3ColdCapability) return false
        if (this.getBusDriverD3ColdSupport != other.getBusDriverD3ColdSupport) return false
        if (this.getLastTransitionStatus != other.getLastTransitionStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.setD3ColdSupport.hashCode()
        result = 31 * result + this.getIdleWakeInfo.hashCode()
        result = 31 * result + this.getD3ColdCapability.hashCode()
        result = 31 * result + this.getBusDriverD3ColdSupport.hashCode()
        result = 31 * result + this.getLastTransitionStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            setD3ColdSupport: PsetD3coldSupport = null,
            getIdleWakeInfo: PgetIdleWakeInfo = null,
            getD3ColdCapability: PgetD3coldCapability = null,
            getBusDriverD3ColdSupport: PgetD3coldCapability = null,
            getLastTransitionStatus: PgetD3coldLastTransitionStatus = null,
        ): D3coldSupportInterface =
            D3coldSupportInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                setD3ColdSupport = setD3ColdSupport,
                getIdleWakeInfo = getIdleWakeInfo,
                getD3ColdCapability = getD3ColdCapability,
                getBusDriverD3ColdSupport = getBusDriverD3ColdSupport,
                getLastTransitionStatus = getLastTransitionStatus,
            )
    }
}

public data class DebuggingDeviceInUse(
    public var nameSpace: KdNamespaceEnum = 0,
    public var structureLength: UInt = 0u,
    public var anonymous: DebuggingDeviceInUse0 = DebuggingDeviceInUse0(),
)

public data class DebuggingDeviceInUse0(
    public var acpiDevice: AcpiDebuggingDeviceInUse = AcpiDebuggingDeviceInUse(),
    public var pciDevice: PciDebuggingDeviceInUse = PciDebuggingDeviceInUse(),
)

public data class DebuggingDeviceInUseInformation(
    public var deviceCount: UInt = 0u,
    public var device: List<DebuggingDeviceInUse> = List(1) { DebuggingDeviceInUse() },
)

public class DebugDeviceAddress internal constructor(
    public var type: UByte,
    public var valid: Boolean,
    public var anonymous: DebugDeviceAddress0,
    translatedAddressCtorArg: MutPtr,
    public var length: UInt,
) {
    public var translatedAddress: MutPtr = translatedAddressCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        valid = false,
        anonymous = DebugDeviceAddress0(),
        translatedAddressCtorArg = MutPtr(0L),
        length = 0u,
    )

    public operator fun component1(): UByte = this.type

    public operator fun component2(): Boolean = this.valid

    public operator fun component3(): DebugDeviceAddress0 = this.anonymous

    public operator fun component4(): MutPtr = this.translatedAddress

    public operator fun component5(): UInt = this.length

    public fun copy(type: UByte = this.type, valid: Boolean = this.valid, anonymous: DebugDeviceAddress0 = this.anonymous, translatedAddress: MutPtr = this.translatedAddress, length: UInt = this.length): DebugDeviceAddress = DebugDeviceAddress(type = type, valid = valid, anonymous = anonymous, translatedAddressCtorArg = translatedAddress, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugDeviceAddress) return false
        if (this.type != other.type) return false
        if (this.valid != other.valid) return false
        if (this.anonymous != other.anonymous) return false
        if (this.translatedAddress != other.translatedAddress) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.valid.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.translatedAddress.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: UByte = 0u,
            valid: Boolean = false,
            anonymous: DebugDeviceAddress0 = DebugDeviceAddress0(),
            translatedAddress: MutPtr = MutPtr(0L),
            length: UInt = 0u,
        ): DebugDeviceAddress =
            DebugDeviceAddress(
                type = type,
                valid = valid,
                anonymous = anonymous,
                translatedAddressCtorArg = translatedAddress,
                length = length,
            )
    }
}

public data class DebugDeviceAddress0(
    public var reserved: UByteArray = UByteArray(2),
    public var anonymous: DebugDeviceAddress00 = DebugDeviceAddress00(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugDeviceAddress0) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DebugDeviceAddress00(
    public var bitWidth: UByte = 0u,
    public var accessSize: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDeviceAddress00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDeviceAddress00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): DebugDeviceAddress00 =
                    DebugDeviceAddress00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: DebugDeviceAddress00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.accessSize)
                }
            }
    }
}

public class DebugDeviceDescriptor internal constructor(
    public var bus: UInt,
    public var slot: UInt,
    public var segment: UShort,
    public var vendorID: UShort,
    public var deviceID: UShort,
    public var baseClass: UByte,
    public var subClass: UByte,
    public var progIf: UByte,
    public var anonymous: DebugDeviceDescriptor0,
    public var initialized: Boolean,
    public var configured: Boolean,
    public var baseAddress: List<DebugDeviceAddress>,
    public var memory: DebugMemoryRequirements,
    public var dbg2TableIndex: UInt,
    public var portType: UShort,
    public var portSubtype: UShort,
    oemDataCtorArg: MutPtr,
    public var oemDataLength: UInt,
    public var nameSpace: KdNamespaceEnum,
    nameSpacePathCtorArg: Pwstr,
    public var nameSpacePathLength: UInt,
    public var transportType: UInt,
    public var transportData: DebugTransportData,
    public var efiIoMmuData: DebugEfiIommuData,
) {
    public var oemData: MutPtr = oemDataCtorArg
        internal set

    public var nameSpacePath: Pwstr = nameSpacePathCtorArg
        internal set

    public constructor() : this(
        bus = 0u,
        slot = 0u,
        segment = 0u,
        vendorID = 0u,
        deviceID = 0u,
        baseClass = 0u,
        subClass = 0u,
        progIf = 0u,
        anonymous = DebugDeviceDescriptor0(),
        initialized = false,
        configured = false,
        baseAddress = List(6) { DebugDeviceAddress() },
        memory = DebugMemoryRequirements(),
        dbg2TableIndex = 0u,
        portType = 0u,
        portSubtype = 0u,
        oemDataCtorArg = MutPtr(0L),
        oemDataLength = 0u,
        nameSpace = 0,
        nameSpacePathCtorArg = MutPtr(0L),
        nameSpacePathLength = 0u,
        transportType = 0u,
        transportData = DebugTransportData(),
        efiIoMmuData = DebugEfiIommuData(),
    )

    public companion object {
        public operator fun invoke(
            bus: UInt = 0u,
            slot: UInt = 0u,
            segment: UShort = 0u,
            vendorID: UShort = 0u,
            deviceID: UShort = 0u,
            baseClass: UByte = 0u,
            subClass: UByte = 0u,
            progIf: UByte = 0u,
            anonymous: DebugDeviceDescriptor0 = DebugDeviceDescriptor0(),
            initialized: Boolean = false,
            configured: Boolean = false,
            baseAddress: List<DebugDeviceAddress> = List(6) { DebugDeviceAddress() },
            memory: DebugMemoryRequirements = DebugMemoryRequirements(),
            dbg2TableIndex: UInt = 0u,
            portType: UShort = 0u,
            portSubtype: UShort = 0u,
            oemData: MutPtr = MutPtr(0L),
            oemDataLength: UInt = 0u,
            nameSpace: KdNamespaceEnum = 0,
            nameSpacePath: Pwstr = MutPtr(0L),
            nameSpacePathLength: UInt = 0u,
            transportType: UInt = 0u,
            transportData: DebugTransportData = DebugTransportData(),
            efiIoMmuData: DebugEfiIommuData = DebugEfiIommuData(),
        ): DebugDeviceDescriptor =
            DebugDeviceDescriptor(
                bus = bus,
                slot = slot,
                segment = segment,
                vendorID = vendorID,
                deviceID = deviceID,
                baseClass = baseClass,
                subClass = subClass,
                progIf = progIf,
                anonymous = anonymous,
                initialized = initialized,
                configured = configured,
                baseAddress = baseAddress,
                memory = memory,
                dbg2TableIndex = dbg2TableIndex,
                portType = portType,
                portSubtype = portSubtype,
                oemDataCtorArg = oemData,
                oemDataLength = oemDataLength,
                nameSpace = nameSpace,
                nameSpacePathCtorArg = nameSpacePath,
                nameSpacePathLength = nameSpacePathLength,
                transportType = transportType,
                transportData = transportData,
                efiIoMmuData = efiIoMmuData,
            )
    }
}

public data class DebugDeviceDescriptor0(
    public var flags: UByte = 0u,
    public var anonymous: DebugDeviceDescriptor00 = DebugDeviceDescriptor00(),
)

public data class DebugDeviceDescriptor00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDeviceDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDeviceDescriptor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): DebugDeviceDescriptor00 =
                    DebugDeviceDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DebugDeviceDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class DebugEfiIommuData internal constructor(
    pciIoProtocolHandleCtorArg: MutPtr,
    mappingCtorArg: MutPtr,
) {
    public var pciIoProtocolHandle: MutPtr = pciIoProtocolHandleCtorArg
        internal set

    public var mapping: MutPtr = mappingCtorArg
        internal set

    public constructor() : this(
        pciIoProtocolHandleCtorArg = MutPtr(0L),
        mappingCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pciIoProtocolHandle

    public operator fun component2(): MutPtr = this.mapping

    public fun copy(pciIoProtocolHandle: MutPtr = this.pciIoProtocolHandle, mapping: MutPtr = this.mapping): DebugEfiIommuData = DebugEfiIommuData(pciIoProtocolHandleCtorArg = pciIoProtocolHandle, mappingCtorArg = mapping)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugEfiIommuData) return false
        if (this.pciIoProtocolHandle != other.pciIoProtocolHandle) return false
        if (this.mapping != other.mapping) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pciIoProtocolHandle.hashCode()
        result = 31 * result + this.mapping.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugEfiIommuData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugEfiIommuData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DebugEfiIommuData =
                    DebugEfiIommuData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DebugEfiIommuData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pciIoProtocolHandle)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.mapping)
                }
            }

        public operator fun invoke(
            pciIoProtocolHandle: MutPtr = MutPtr(0L),
            mapping: MutPtr = MutPtr(0L),
        ): DebugEfiIommuData =
            DebugEfiIommuData(
                pciIoProtocolHandleCtorArg = pciIoProtocolHandle,
                mappingCtorArg = mapping,
            )
    }
}

public class DebugMemoryRequirements internal constructor(
    public var start: Long,
    public var maxEnd: Long,
    virtualAddressCtorArg: MutPtr,
    public var length: UInt,
    public var cached: Boolean,
    public var aligned: Boolean,
) {
    public var virtualAddress: MutPtr = virtualAddressCtorArg
        internal set

    public constructor() : this(
        start = 0L,
        maxEnd = 0L,
        virtualAddressCtorArg = MutPtr(0L),
        length = 0u,
        cached = false,
        aligned = false,
    )

    public operator fun component1(): Long = this.start

    public operator fun component2(): Long = this.maxEnd

    public operator fun component3(): MutPtr = this.virtualAddress

    public operator fun component4(): UInt = this.length

    public operator fun component5(): Boolean = this.cached

    public operator fun component6(): Boolean = this.aligned

    public fun copy(start: Long = this.start, maxEnd: Long = this.maxEnd, virtualAddress: MutPtr = this.virtualAddress, length: UInt = this.length, cached: Boolean = this.cached, aligned: Boolean = this.aligned): DebugMemoryRequirements = DebugMemoryRequirements(start = start, maxEnd = maxEnd, virtualAddressCtorArg = virtualAddress, length = length, cached = cached, aligned = aligned)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugMemoryRequirements) return false
        if (this.start != other.start) return false
        if (this.maxEnd != other.maxEnd) return false
        if (this.virtualAddress != other.virtualAddress) return false
        if (this.length != other.length) return false
        if (this.cached != other.cached) return false
        if (this.aligned != other.aligned) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.start.hashCode()
        result = 31 * result + this.maxEnd.hashCode()
        result = 31 * result + this.virtualAddress.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cached.hashCode()
        result = 31 * result + this.aligned.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugMemoryRequirements> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugMemoryRequirements> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DebugMemoryRequirements =
                    DebugMemoryRequirements(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 29L),
                    )
                override fun writeNative(addr: Long, value: DebugMemoryRequirements) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.maxEnd)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.virtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 28L, value.cached)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 29L, value.aligned)
                }
            }

        public operator fun invoke(
            start: Long = 0L,
            maxEnd: Long = 0L,
            virtualAddress: MutPtr = MutPtr(0L),
            length: UInt = 0u,
            cached: Boolean = false,
            aligned: Boolean = false,
        ): DebugMemoryRequirements =
            DebugMemoryRequirements(
                start = start,
                maxEnd = maxEnd,
                virtualAddressCtorArg = virtualAddress,
                length = length,
                cached = cached,
                aligned = aligned,
            )
    }
}

public data class DebugTransportData(
    public var hwContextSize: UInt = 0u,
    public var sharedVisibleDataSize: UInt = 0u,
    public var useSerialFraming: Boolean = false,
    public var validUSBCoreId: Boolean = false,
    public var uSBCoreId: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugTransportData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugTransportData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DebugTransportData =
                    DebugTransportData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: DebugTransportData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hwContextSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sharedVisibleDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.useSerialFraming)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.validUSBCoreId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.uSBCoreId)
                }
            }
    }
}

public data class DeviceBusSpecificResetInfo(
    public var busTypeGuid: Guid = Guid(),
    public var resetTypeSupported: DeviceBusSpecificResetType = DeviceBusSpecificResetType(),
)

public data class DeviceBusSpecificResetType(
    public var pci: DeviceBusSpecificResetType0 = DeviceBusSpecificResetType0(),
    public var acpi: DeviceBusSpecificResetType1 = DeviceBusSpecificResetType1(),
    public var asULONGLONG: ULong = 0uL,
)

public data class DeviceBusSpecificResetType1(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceBusSpecificResetType1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceBusSpecificResetType1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DeviceBusSpecificResetType1 =
                    DeviceBusSpecificResetType1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DeviceBusSpecificResetType1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DeviceBusSpecificResetType0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceBusSpecificResetType0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceBusSpecificResetType0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DeviceBusSpecificResetType0 =
                    DeviceBusSpecificResetType0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DeviceBusSpecificResetType0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DeviceCapabilities(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var bitfield: UInt = 0u,
    public var address: UInt = 0u,
    public var uINumber: UInt = 0u,
    public var deviceState: IntArray = IntArray(7),
    public var systemWake: SystemPowerState = 0,
    public var deviceWake: DevicePowerState = 0,
    public var d1Latency: UInt = 0u,
    public var d2Latency: UInt = 0u,
    public var d3Latency: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceCapabilities) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.bitfield != other.bitfield) return false
        if (this.address != other.address) return false
        if (this.uINumber != other.uINumber) return false
        if (!this.deviceState.contentEquals(other.deviceState)) return false
        if (this.systemWake != other.systemWake) return false
        if (this.deviceWake != other.deviceWake) return false
        if (this.d1Latency != other.d1Latency) return false
        if (this.d2Latency != other.d2Latency) return false
        if (this.d3Latency != other.d3Latency) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.uINumber.hashCode()
        result = 31 * result + this.deviceState.contentHashCode()
        result = 31 * result + this.systemWake.hashCode()
        result = 31 * result + this.deviceWake.hashCode()
        result = 31 * result + this.d1Latency.hashCode()
        result = 31 * result + this.d2Latency.hashCode()
        result = 31 * result + this.d3Latency.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DeviceCapabilities =
                    DeviceCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (7).toInt())
                        ).readNative(addr + 16L).toIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: DeviceCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uINumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (7).toInt())
                    ).writeNative(addr + 16L, value.deviceState.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.systemWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.deviceWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.d1Latency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.d2Latency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.d3Latency)
                }
            }
    }
}

public class DeviceDescription(
    public var version: UInt = 0u,
    public var master: Boolean = false,
    public var scatterGather: Boolean = false,
    public var demandMode: Boolean = false,
    public var autoInitialize: Boolean = false,
    public var dma32BitAddresses: Boolean = false,
    public var ignoreCount: Boolean = false,
    public var reserved1: Boolean = false,
    public var dma64BitAddresses: Boolean = false,
    public var busNumber: UInt = 0u,
    public var dmaChannel: UInt = 0u,
    public var interfaceType: InterfaceType = 0,
    public var dmaWidth: DmaWidth = 0,
    public var dmaSpeed: DmaSpeed = 0,
    public var maximumLength: UInt = 0u,
    public var dmaPort: UInt = 0u,
    public var dmaAddressWidth: UInt = 0u,
    public var dmaControllerInstance: UInt = 0u,
    public var dmaRequestLine: UInt = 0u,
    public var deviceAddress: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDescription> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DeviceDescription =
                    DeviceDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: DeviceDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.master)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.scatterGather)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.demandMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 7L, value.autoInitialize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.dma32BitAddresses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.ignoreCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 11L, value.dma64BitAddresses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.busNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dmaChannel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.interfaceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.dmaWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.dmaSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.maximumLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dmaPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dmaAddressWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dmaControllerInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dmaRequestLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.deviceAddress)
                }
            }
    }
}

public class DeviceFaultConfiguration internal constructor(
    public var faultHandler: PiommuDeviceFaultHandler,
    faultContextCtorArg: MutPtr,
) {
    public var faultContext: MutPtr = faultContextCtorArg
        internal set

    public constructor() : this(
        faultHandler = null,
        faultContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PiommuDeviceFaultHandler = this.faultHandler

    public operator fun component2(): MutPtr = this.faultContext

    public fun copy(faultHandler: PiommuDeviceFaultHandler = this.faultHandler, faultContext: MutPtr = this.faultContext): DeviceFaultConfiguration = DeviceFaultConfiguration(faultHandler = faultHandler, faultContextCtorArg = faultContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceFaultConfiguration) return false
        if (this.faultHandler != other.faultHandler) return false
        if (this.faultContext != other.faultContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.faultHandler.hashCode()
        result = 31 * result + this.faultContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            faultHandler: PiommuDeviceFaultHandler = null,
            faultContext: MutPtr = MutPtr(0L),
        ): DeviceFaultConfiguration =
            DeviceFaultConfiguration(
                faultHandler = faultHandler,
                faultContextCtorArg = faultContext,
            )
    }
}

public data class DeviceFlags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceFlags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DeviceFlags =
                    DeviceFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DeviceFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class DeviceInterfaceChangeNotification internal constructor(
    public var version: UShort,
    public var size: UShort,
    public var event: Guid,
    public var interfaceClassGuid: Guid,
    symbolicLinkNameCtorArg: MutPtr,
) {
    public var symbolicLinkName: MutPtr = symbolicLinkNameCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        size = 0u,
        event = Guid(),
        interfaceClassGuid = Guid(),
        symbolicLinkNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.version

    public operator fun component2(): UShort = this.size

    public operator fun component3(): Guid = this.event

    public operator fun component4(): Guid = this.interfaceClassGuid

    public operator fun component5(): MutPtr = this.symbolicLinkName

    public fun copy(version: UShort = this.version, size: UShort = this.size, event: Guid = this.event, interfaceClassGuid: Guid = this.interfaceClassGuid, symbolicLinkName: MutPtr = this.symbolicLinkName): DeviceInterfaceChangeNotification = DeviceInterfaceChangeNotification(version = version, size = size, event = event, interfaceClassGuid = interfaceClassGuid, symbolicLinkNameCtorArg = symbolicLinkName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceInterfaceChangeNotification) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.event != other.event) return false
        if (this.interfaceClassGuid != other.interfaceClassGuid) return false
        if (this.symbolicLinkName != other.symbolicLinkName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.event.hashCode()
        result = 31 * result + this.interfaceClassGuid.hashCode()
        result = 31 * result + this.symbolicLinkName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UShort = 0u,
            size: UShort = 0u,
            event: Guid = Guid(),
            interfaceClassGuid: Guid = Guid(),
            symbolicLinkName: MutPtr = MutPtr(0L),
        ): DeviceInterfaceChangeNotification =
            DeviceInterfaceChangeNotification(
                version = version,
                size = size,
                event = event,
                interfaceClassGuid = interfaceClassGuid,
                symbolicLinkNameCtorArg = symbolicLinkName,
            )
    }
}

public class DeviceRelations internal constructor(
    public var count: UInt,
    objectsCtorArg: List<MutPtr>,
) {
    public var objects: List<MutPtr> = objectsCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        objectsCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): List<MutPtr> = this.objects

    public fun copy(count: UInt = this.count, objects: List<MutPtr> = this.objects): DeviceRelations = DeviceRelations(count = count, objectsCtorArg = objects)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceRelations) return false
        if (this.count != other.count) return false
        if (this.objects != other.objects) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.objects.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceRelations> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceRelations> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeviceRelations =
                    DeviceRelations(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout(64),
                                    (1).toInt(),
                                )
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeviceRelations) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout(64),
                                (1).toInt(),
                            )
                    ).writeNative(addr + 8L, value.objects)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            objects: List<MutPtr> = List(1) { MutPtr(0L) },
        ): DeviceRelations =
            DeviceRelations(
                count = count,
                objectsCtorArg = objects,
            )
    }
}

public class DeviceResetInterfaceStandard internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var deviceReset: PdeviceResetHandler,
    public var supportedResetTypes: UInt,
    reservedCtorArg: MutPtr,
    public var queryBusSpecificResetInfo: PdeviceQueryBusSpecificResetHandler,
    public var deviceBusSpecificReset: PdeviceBusSpecificResetHandler,
    public var getDeviceResetStatus: PgetDeviceResetStatus,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        deviceReset = null,
        supportedResetTypes = 0u,
        reservedCtorArg = MutPtr(0L),
        queryBusSpecificResetInfo = null,
        deviceBusSpecificReset = null,
        getDeviceResetStatus = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PdeviceResetHandler = this.deviceReset

    public operator fun component7(): UInt = this.supportedResetTypes

    public operator fun component8(): MutPtr = this.reserved

    public operator fun component9(): PdeviceQueryBusSpecificResetHandler = this.queryBusSpecificResetInfo

    public operator fun component10(): PdeviceBusSpecificResetHandler = this.deviceBusSpecificReset

    public operator fun component11(): PgetDeviceResetStatus = this.getDeviceResetStatus

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, deviceReset: PdeviceResetHandler = this.deviceReset, supportedResetTypes: UInt = this.supportedResetTypes, reserved: MutPtr = this.reserved, queryBusSpecificResetInfo: PdeviceQueryBusSpecificResetHandler = this.queryBusSpecificResetInfo, deviceBusSpecificReset: PdeviceBusSpecificResetHandler = this.deviceBusSpecificReset, getDeviceResetStatus: PgetDeviceResetStatus = this.getDeviceResetStatus): DeviceResetInterfaceStandard = DeviceResetInterfaceStandard(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, deviceReset = deviceReset, supportedResetTypes = supportedResetTypes, reservedCtorArg = reserved, queryBusSpecificResetInfo = queryBusSpecificResetInfo, deviceBusSpecificReset = deviceBusSpecificReset, getDeviceResetStatus = getDeviceResetStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceResetInterfaceStandard) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.deviceReset != other.deviceReset) return false
        if (this.supportedResetTypes != other.supportedResetTypes) return false
        if (this.reserved != other.reserved) return false
        if (this.queryBusSpecificResetInfo != other.queryBusSpecificResetInfo) return false
        if (this.deviceBusSpecificReset != other.deviceBusSpecificReset) return false
        if (this.getDeviceResetStatus != other.getDeviceResetStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.deviceReset.hashCode()
        result = 31 * result + this.supportedResetTypes.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.queryBusSpecificResetInfo.hashCode()
        result = 31 * result + this.deviceBusSpecificReset.hashCode()
        result = 31 * result + this.getDeviceResetStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            deviceReset: PdeviceResetHandler = null,
            supportedResetTypes: UInt = 0u,
            reserved: MutPtr = MutPtr(0L),
            queryBusSpecificResetInfo: PdeviceQueryBusSpecificResetHandler = null,
            deviceBusSpecificReset: PdeviceBusSpecificResetHandler = null,
            getDeviceResetStatus: PgetDeviceResetStatus = null,
        ): DeviceResetInterfaceStandard =
            DeviceResetInterfaceStandard(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                deviceReset = deviceReset,
                supportedResetTypes = supportedResetTypes,
                reservedCtorArg = reserved,
                queryBusSpecificResetInfo = queryBusSpecificResetInfo,
                deviceBusSpecificReset = deviceBusSpecificReset,
                getDeviceResetStatus = getDeviceResetStatus,
            )
    }
}

public data class DeviceResetStatusFlags(
    public var u: DeviceResetStatusFlags0 = DeviceResetStatusFlags0(),
    public var asUlonglong: ULong = 0uL,
)

public data class DeviceResetStatusFlags0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceResetStatusFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceResetStatusFlags0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DeviceResetStatusFlags0 =
                    DeviceResetStatusFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DeviceResetStatusFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DiskSignature(
    public var partitionStyle: UInt = 0u,
    public var anonymous: DiskSignature0 = DiskSignature0(),
)

public data class DiskSignature0(
    public var mbr: DiskSignature00 = DiskSignature00(),
    public var gpt: DiskSignature01 = DiskSignature01(),
)

public data class DiskSignature01(
    public var diskId: Guid = Guid(),
)

public data class DiskSignature00(
    public var signature: UInt = 0u,
    public var checkSum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskSignature00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskSignature00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DiskSignature00 =
                    DiskSignature00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DiskSignature00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.checkSum)
                }
            }
    }
}

public class DmaAdapter internal constructor(
    public var version: UShort,
    public var size: UShort,
    dmaOperationsCtorArg: MutPtr,
) {
    public var dmaOperations: MutPtr = dmaOperationsCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        size = 0u,
        dmaOperationsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.version

    public operator fun component2(): UShort = this.size

    public operator fun component3(): MutPtr = this.dmaOperations

    public fun copy(version: UShort = this.version, size: UShort = this.size, dmaOperations: MutPtr = this.dmaOperations): DmaAdapter = DmaAdapter(version = version, size = size, dmaOperationsCtorArg = dmaOperations)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DmaAdapter) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.dmaOperations != other.dmaOperations) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.dmaOperations.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaAdapter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaAdapter> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DmaAdapter =
                    DmaAdapter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DmaAdapter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.dmaOperations)
                }
            }

        public operator fun invoke(
            version: UShort = 0u,
            size: UShort = 0u,
            dmaOperations: MutPtr = MutPtr(0L),
        ): DmaAdapter =
            DmaAdapter(
                version = version,
                size = size,
                dmaOperationsCtorArg = dmaOperations,
            )
    }
}

public data class DmaAdapterInfo(
    public var version: UInt = 0u,
    public var anonymous: DmaAdapterInfo0 = DmaAdapterInfo0(),
)

public data class DmaAdapterInfo0(
    public var v1: DmaAdapterInfoV1 = DmaAdapterInfoV1(),
    public var crashdump: DmaAdapterInfoCrashdump = DmaAdapterInfoCrashdump(),
)

public class DmaAdapterInfoCrashdump internal constructor(
    public var deviceDescription: DeviceDescription,
    public var deviceIdSize: Int,
    deviceIdCtorArg: MutPtr,
) {
    public var deviceId: MutPtr = deviceIdCtorArg
        internal set

    public constructor() : this(
        deviceDescription = DeviceDescription(),
        deviceIdSize = 0,
        deviceIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DeviceDescription = this.deviceDescription

    public operator fun component2(): Int = this.deviceIdSize

    public operator fun component3(): MutPtr = this.deviceId

    public fun copy(deviceDescription: DeviceDescription = this.deviceDescription, deviceIdSize: Int = this.deviceIdSize, deviceId: MutPtr = this.deviceId): DmaAdapterInfoCrashdump = DmaAdapterInfoCrashdump(deviceDescription = deviceDescription, deviceIdSize = deviceIdSize, deviceIdCtorArg = deviceId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DmaAdapterInfoCrashdump) return false
        if (this.deviceDescription != other.deviceDescription) return false
        if (this.deviceIdSize != other.deviceIdSize) return false
        if (this.deviceId != other.deviceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceDescription.hashCode()
        result = 31 * result + this.deviceIdSize.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaAdapterInfoCrashdump> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaAdapterInfoCrashdump> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): DmaAdapterInfoCrashdump =
                    DmaAdapterInfoCrashdump(
                        (DeviceDescription.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: DmaAdapterInfoCrashdump) {
                    (DeviceDescription.typeLayout()).writeNative(addr, value.deviceDescription)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.deviceIdSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 72L, value.deviceId)
                }
            }

        public operator fun invoke(
            deviceDescription: DeviceDescription = DeviceDescription(),
            deviceIdSize: Int = 0,
            deviceId: MutPtr = MutPtr(0L),
        ): DmaAdapterInfoCrashdump =
            DmaAdapterInfoCrashdump(
                deviceDescription = deviceDescription,
                deviceIdSize = deviceIdSize,
                deviceIdCtorArg = deviceId,
            )
    }
}

public data class DmaAdapterInfoV1(
    public var readDmaCounterAvailable: UInt = 0u,
    public var scatterGatherLimit: UInt = 0u,
    public var dmaAddressWidth: UInt = 0u,
    public var flags: UInt = 0u,
    public var minimumTransferUnit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaAdapterInfoV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaAdapterInfoV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DmaAdapterInfoV1 =
                    DmaAdapterInfoV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DmaAdapterInfoV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.readDmaCounterAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.scatterGatherLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dmaAddressWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.minimumTransferUnit)
                }
            }
    }
}

public data class DmaCommonBufferExtendedConfiguration(
    public var configType: DmaCommonBufferExtendedConfigurationType = 0,
    public var anonymous: DmaCommonBufferExtendedConfiguration0 = DmaCommonBufferExtendedConfiguration0(),
)

public data class DmaCommonBufferExtendedConfiguration0(
    public var logicalAddressLimits: DmaCommonBufferExtendedConfiguration00 = DmaCommonBufferExtendedConfiguration00(),
    public var subSection: DmaCommonBufferExtendedConfiguration01 = DmaCommonBufferExtendedConfiguration01(),
    public var hardwareAccessType: DmaCommonBufferExtendedConfigurationAccessType = 0,
    public var reserved: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DmaCommonBufferExtendedConfiguration0) return false
        if (this.logicalAddressLimits != other.logicalAddressLimits) return false
        if (this.subSection != other.subSection) return false
        if (this.hardwareAccessType != other.hardwareAccessType) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logicalAddressLimits.hashCode()
        result = 31 * result + this.subSection.hashCode()
        result = 31 * result + this.hardwareAccessType.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class DmaCommonBufferExtendedConfiguration00(
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaCommonBufferExtendedConfiguration00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaCommonBufferExtendedConfiguration00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DmaCommonBufferExtendedConfiguration00 =
                    DmaCommonBufferExtendedConfiguration00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DmaCommonBufferExtendedConfiguration00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.minimumAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.maximumAddress)
                }
            }
    }
}

public data class DmaCommonBufferExtendedConfiguration01(
    public var offset: ULong = 0uL,
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaCommonBufferExtendedConfiguration01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaCommonBufferExtendedConfiguration01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DmaCommonBufferExtendedConfiguration01 =
                    DmaCommonBufferExtendedConfiguration01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DmaCommonBufferExtendedConfiguration01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class DmaConfigurationByte0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaConfigurationByte0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaConfigurationByte0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): DmaConfigurationByte0 =
                    DmaConfigurationByte0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DmaConfigurationByte0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DmaConfigurationByte1(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaConfigurationByte1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaConfigurationByte1> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): DmaConfigurationByte1 =
                    DmaConfigurationByte1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DmaConfigurationByte1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DmaIommuInterface(
    public var version: UInt = 0u,
    public var createDomain: PiommuDomainCreate = null,
    public var deleteDomain: PiommuDomainDelete = null,
    public var attachDevice: PiommuDomainAttachDevice = null,
    public var detachDevice: PiommuDomainDetachDevice = null,
    public var flushDomain: PiommuFlushDomain = null,
    public var flushDomainByVaList: PiommuFlushDomainVaList = null,
    public var queryInputMappings: PiommuQueryInputMappings = null,
    public var mapLogicalRange: PiommuMapLogicalRange = null,
    public var unmapLogicalRange: PiommuUnmapLogicalRange = null,
    public var mapIdentityRange: PiommuMapIdentityRange = null,
    public var unmapIdentityRange: PiommuUnmapIdentityRange = null,
    public var setDeviceFaultReporting: PiommuSetDeviceFaultReporting = null,
    public var configureDomain: PiommuDomainConfigure = null,
)

public data class DmaIommuInterfaceEx(
    public var size: Int = 0,
    public var version: UInt = 0u,
    public var anonymous: DmaIommuInterfaceEx0 = DmaIommuInterfaceEx0(),
)

public data class DmaIommuInterfaceEx0(
    public var v1: DmaIommuInterfaceV1 = DmaIommuInterfaceV1(),
    public var v2: DmaIommuInterfaceV2 = DmaIommuInterfaceV2(),
)

public data class DmaIommuInterfaceV1(
    public var createDomain: PiommuDomainCreate = null,
    public var deleteDomain: PiommuDomainDelete = null,
    public var attachDevice: PiommuDomainAttachDevice = null,
    public var detachDevice: PiommuDomainDetachDevice = null,
    public var flushDomain: PiommuFlushDomain = null,
    public var flushDomainByVaList: PiommuFlushDomainVaList = null,
    public var queryInputMappings: PiommuQueryInputMappings = null,
    public var mapLogicalRange: PiommuMapLogicalRange = null,
    public var unmapLogicalRange: PiommuUnmapLogicalRange = null,
    public var mapIdentityRange: PiommuMapIdentityRange = null,
    public var unmapIdentityRange: PiommuUnmapIdentityRange = null,
    public var setDeviceFaultReporting: PiommuSetDeviceFaultReporting = null,
    public var configureDomain: PiommuDomainConfigure = null,
)

public class DmaIommuInterfaceV2(
    public var createDomainEx: PiommuDomainCreateEx = null,
    public var deleteDomain: PiommuDomainDelete = null,
    public var attachDeviceEx: PiommuDomainAttachDeviceEx = null,
    public var detachDeviceEx: PiommuDomainDetachDeviceEx = null,
    public var flushDomain: PiommuFlushDomain = null,
    public var flushDomainByVaList: PiommuFlushDomainVaList = null,
    public var queryInputMappings: PiommuQueryInputMappings = null,
    public var mapLogicalRangeEx: PiommuMapLogicalRangeEx = null,
    public var unmapLogicalRange: PiommuUnmapLogicalRange = null,
    public var mapIdentityRangeEx: PiommuMapIdentityRangeEx = null,
    public var unmapIdentityRangeEx: PiommuUnmapIdentityRangeEx = null,
    public var setDeviceFaultReportingEx: PiommuSetDeviceFaultReportingEx = null,
    public var configureDomain: PiommuDomainConfigure = null,
    public var queryAvailableDomainTypes: PiommuDeviceQueryDomainTypes = null,
    public var registerInterfaceStateChangeCallback: PiommuRegisterInterfaceStateChangeCallback = null,
    public var unregisterInterfaceStateChangeCallback: PiommuUnregisterInterfaceStateChangeCallback = null,
    public var reserveLogicalAddressRange: PiommuReserveLogicalAddressRange = null,
    public var freeReservedLogicalAddressRange: PiommuFreeReservedLogicalAddressRange = null,
    public var mapReservedLogicalRange: PiommuMapReservedLogicalRange = null,
    public var unmapReservedLogicalRange: PiommuUnmapReservedLogicalRange = null,
    public var createDevice: PiommuDeviceCreate = null,
    public var deleteDevice: PiommuDeviceDelete = null,
)

public class DmaOperations(
    public var size: UInt = 0u,
    public var putDmaAdapter: PputDmaAdapter = null,
    public var allocateCommonBuffer: PallocateCommonBuffer = null,
    public var freeCommonBuffer: PfreeCommonBuffer = null,
    public var allocateAdapterChannel: PallocateAdapterChannel = null,
    public var flushAdapterBuffers: PflushAdapterBuffers = null,
    public var freeAdapterChannel: PfreeAdapterChannel = null,
    public var freeMapRegisters: PfreeMapRegisters = null,
    public var mapTransfer: PmapTransfer = null,
    public var getDmaAlignment: PgetDmaAlignment = null,
    public var readDmaCounter: PreadDmaCounter = null,
    public var getScatterGatherList: PgetScatterGatherList = null,
    public var putScatterGatherList: PputScatterGatherList = null,
    public var calculateScatterGatherList: PcalculateScatterGatherListSize = null,
    public var buildScatterGatherList: PbuildScatterGatherList = null,
    public var buildMdlFromScatterGatherList: PbuildMdlFromScatterGatherList = null,
    public var getDmaAdapterInfo: PgetDmaAdapterInfo = null,
    public var getDmaTransferInfo: PgetDmaTransferInfo = null,
    public var initializeDmaTransferContext: PinitializeDmaTransferContext = null,
    public var allocateCommonBufferEx: PallocateCommonBufferEx = null,
    public var allocateAdapterChannelEx: PallocateAdapterChannelEx = null,
    public var configureAdapterChannel: PconfigureAdapterChannel = null,
    public var cancelAdapterChannel: PcancelAdapterChannel = null,
    public var mapTransferEx: PmapTransferEx = null,
    public var getScatterGatherListEx: PgetScatterGatherListEx = null,
    public var buildScatterGatherListEx: PbuildScatterGatherListEx = null,
    public var flushAdapterBuffersEx: PflushAdapterBuffersEx = null,
    public var freeAdapterObject: PfreeAdapterObject = null,
    public var cancelMappedTransfer: PcancelMappedTransfer = null,
    public var allocateDomainCommonBuffer: PallocateDomainCommonBuffer = null,
    public var flushDmaBuffer: PflushDmaBuffer = null,
    public var joinDmaDomain: PjoinDmaDomain = null,
    public var leaveDmaDomain: PleaveDmaDomain = null,
    public var getDmaDomain: PgetDmaDomain = null,
    public var allocateCommonBufferWithBounds: PallocateCommonBufferWithBounds = null,
    public var allocateCommonBufferVector: PallocateCommonBufferVector = null,
    public var getCommonBufferFromVectorByIndex: PgetCommonBufferFromVectorByIndex = null,
    public var freeCommonBufferFromVector: PfreeCommonBufferFromVector = null,
    public var freeCommonBufferVector: PfreeCommonBufferVector = null,
    public var createCommonBufferFromMdl: PcreateCommonBufferFromMdl = null,
)

public data class DmaTransferInfo(
    public var version: UInt = 0u,
    public var anonymous: DmaTransferInfo0 = DmaTransferInfo0(),
)

public data class DmaTransferInfo0(
    public var v1: DmaTransferInfoV1 = DmaTransferInfoV1(),
    public var v2: DmaTransferInfoV2 = DmaTransferInfoV2(),
)

public data class DmaTransferInfoV1(
    public var mapRegisterCount: UInt = 0u,
    public var scatterGatherElementCount: UInt = 0u,
    public var scatterGatherListSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaTransferInfoV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaTransferInfoV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DmaTransferInfoV1 =
                    DmaTransferInfoV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DmaTransferInfoV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mapRegisterCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.scatterGatherElementCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.scatterGatherListSize)
                }
            }
    }
}

public data class DmaTransferInfoV2(
    public var mapRegisterCount: UInt = 0u,
    public var scatterGatherElementCount: UInt = 0u,
    public var scatterGatherListSize: UInt = 0u,
    public var logicalPageCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaTransferInfoV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaTransferInfoV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DmaTransferInfoV2 =
                    DmaTransferInfoV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DmaTransferInfoV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mapRegisterCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.scatterGatherElementCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.scatterGatherListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.logicalPageCount)
                }
            }
    }
}

public data class DomainConfiguration(
    public var type: DomainConfigurationArch = 0,
    public var anonymous: DomainConfiguration0 = DomainConfiguration0(),
)

public data class DomainConfiguration0(
    public var arm64: DomainConfigurationArm64 = DomainConfigurationArm64(),
    public var x64: DomainConfigurationX64 = DomainConfigurationX64(),
)

public data class DomainConfigurationArm64(
    public var ttbr0: Long = 0L,
    public var ttbr1: Long = 0L,
    public var mair0: UInt = 0u,
    public var mair1: UInt = 0u,
    public var inputSize0: UByte = 0u,
    public var inputSize1: UByte = 0u,
    public var coherentTableWalks: Boolean = false,
    public var translationEnabled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DomainConfigurationArm64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DomainConfigurationArm64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DomainConfigurationArm64 =
                    DomainConfigurationArm64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 27L),
                    )
                override fun writeNative(addr: Long, value: DomainConfigurationArm64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.ttbr0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.ttbr1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.mair0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.mair1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.inputSize0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.inputSize1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 26L, value.coherentTableWalks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 27L, value.translationEnabled)
                }
            }
    }
}

public data class DomainConfigurationX64(
    public var firstLevelPageTableRoot: Long = 0L,
    public var translationEnabled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DomainConfigurationX64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DomainConfigurationX64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DomainConfigurationX64 =
                    DomainConfigurationX64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DomainConfigurationX64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.firstLevelPageTableRoot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.translationEnabled)
                }
            }
    }
}

public data class DpcWatchdogGlobalTriageBlock(
    public var signature: UInt = 0u,
    public var revision: UShort = 0u,
    public var size: UShort = 0u,
    public var dpcWatchdogProfileOffset: UShort = 0u,
    public var dpcWatchdogProfileLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DpcWatchdogGlobalTriageBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DpcWatchdogGlobalTriageBlock> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DpcWatchdogGlobalTriageBlock =
                    DpcWatchdogGlobalTriageBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DpcWatchdogGlobalTriageBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.dpcWatchdogProfileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dpcWatchdogProfileLength)
                }
            }
    }
}

public data class DriverVerifierThunkPairs(
    public var pristineRoutine: PdriverVerifierThunkRoutine = null,
    public var newRoutine: PdriverVerifierThunkRoutine = null,
)

public data class EfiAcpiRasSignalTable(
    public var header: WheaAcpiHeader = WheaAcpiHeader(),
    public var numberRecord: UInt = 0u,
    public var entries: List<SignalRegValue> = List(1) { SignalRegValue() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfiAcpiRasSignalTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfiAcpiRasSignalTable> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): EfiAcpiRasSignalTable =
                    EfiAcpiRasSignalTable(
                        (WheaAcpiHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SignalRegValue.typeLayout(), (1).toInt())
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: EfiAcpiRasSignalTable) {
                    (WheaAcpiHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.numberRecord)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SignalRegValue.typeLayout(), (1).toInt())
                    ).writeNative(addr + 40L, value.entries)
                }
            }
    }
}

public data class EisaDmaConfiguration(
    public var configurationByte0: DmaConfigurationByte0 = DmaConfigurationByte0(),
    public var configurationByte1: DmaConfigurationByte1 = DmaConfigurationByte1(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaDmaConfiguration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaDmaConfiguration> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): EisaDmaConfiguration =
                    EisaDmaConfiguration(
                        (DmaConfigurationByte0.typeLayout()).readNative(addr),
                        (DmaConfigurationByte1.typeLayout()).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: EisaDmaConfiguration) {
                    (DmaConfigurationByte0.typeLayout()).writeNative(addr, value.configurationByte0)
                    (DmaConfigurationByte1.typeLayout()).writeNative(addr + 1L, value.configurationByte1)
                }
            }
    }
}

public data class EisaIrqConfiguration(
    public var configurationByte: EisaIrqDescriptor = EisaIrqDescriptor(),
    public var reserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaIrqConfiguration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaIrqConfiguration> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): EisaIrqConfiguration =
                    EisaIrqConfiguration(
                        (EisaIrqDescriptor.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: EisaIrqConfiguration) {
                    (EisaIrqDescriptor.typeLayout()).writeNative(addr, value.configurationByte)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserved)
                }
            }
    }
}

public data class EisaIrqDescriptor(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaIrqDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaIrqDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): EisaIrqDescriptor =
                    EisaIrqDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EisaIrqDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class EisaMemoryConfiguration(
    public var configurationByte: EisaMemoryType = EisaMemoryType(),
    public var dataSize: UByte = 0u,
    public var addressLowWord: UShort = 0u,
    public var addressHighByte: UByte = 0u,
    public var memorySize: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaMemoryConfiguration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaMemoryConfiguration> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 7L
                override fun readNative(addr: Long): EisaMemoryConfiguration =
                    EisaMemoryConfiguration(
                        (EisaMemoryType.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: EisaMemoryConfiguration) {
                    (EisaMemoryType.typeLayout()).writeNative(addr, value.configurationByte)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.addressLowWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.addressHighByte)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 5L, value.memorySize)
                }
            }
    }
}

public data class EisaMemoryType(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaMemoryType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaMemoryType> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): EisaMemoryType =
                    EisaMemoryType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EisaMemoryType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class EisaPortConfiguration(
    public var configuration: EisaPortDescriptor = EisaPortDescriptor(),
    public var portAddress: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaPortConfiguration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaPortConfiguration> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): EisaPortConfiguration =
                    EisaPortConfiguration(
                        (EisaPortDescriptor.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: EisaPortConfiguration) {
                    (EisaPortDescriptor.typeLayout()).writeNative(addr, value.configuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1L, value.portAddress)
                }
            }
    }
}

public data class EisaPortDescriptor(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaPortDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EisaPortDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): EisaPortDescriptor =
                    EisaPortDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EisaPortDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class EtwTraceSessionSettings(
    public var version: UInt = 0u,
    public var bufferSize: UInt = 0u,
    public var minimumBuffers: UInt = 0u,
    public var maximumBuffers: UInt = 0u,
    public var loggerMode: UInt = 0u,
    public var flushTimer: UInt = 0u,
    public var flushThreshold: UInt = 0u,
    public var clockType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwTraceSessionSettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwTraceSessionSettings> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): EtwTraceSessionSettings =
                    EtwTraceSessionSettings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: EtwTraceSessionSettings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minimumBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maximumBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.loggerMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flushTimer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flushThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.clockType)
                }
            }
    }
}

public class ExtendedCreateInformation internal constructor(
    public var extendedCreateFlags: Long,
    eaBufferCtorArg: MutPtr,
    public var eaLength: UInt,
) {
    public var eaBuffer: MutPtr = eaBufferCtorArg
        internal set

    public constructor() : this(
        extendedCreateFlags = 0L,
        eaBufferCtorArg = MutPtr(0L),
        eaLength = 0u,
    )

    public operator fun component1(): Long = this.extendedCreateFlags

    public operator fun component2(): MutPtr = this.eaBuffer

    public operator fun component3(): UInt = this.eaLength

    public fun copy(extendedCreateFlags: Long = this.extendedCreateFlags, eaBuffer: MutPtr = this.eaBuffer, eaLength: UInt = this.eaLength): ExtendedCreateInformation = ExtendedCreateInformation(extendedCreateFlags = extendedCreateFlags, eaBufferCtorArg = eaBuffer, eaLength = eaLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtendedCreateInformation) return false
        if (this.extendedCreateFlags != other.extendedCreateFlags) return false
        if (this.eaBuffer != other.eaBuffer) return false
        if (this.eaLength != other.eaLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extendedCreateFlags.hashCode()
        result = 31 * result + this.eaBuffer.hashCode()
        result = 31 * result + this.eaLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtendedCreateInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtendedCreateInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ExtendedCreateInformation =
                    ExtendedCreateInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ExtendedCreateInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.extendedCreateFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.eaBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.eaLength)
                }
            }

        public operator fun invoke(
            extendedCreateFlags: Long = 0L,
            eaBuffer: MutPtr = MutPtr(0L),
            eaLength: UInt = 0u,
        ): ExtendedCreateInformation =
            ExtendedCreateInformation(
                extendedCreateFlags = extendedCreateFlags,
                eaBufferCtorArg = eaBuffer,
                eaLength = eaLength,
            )
    }
}

public class ExtendedCreateInformation32 internal constructor(
    public var extendedCreateFlags: Long,
    eaBufferCtorArg: MutPtr,
    public var eaLength: UInt,
) {
    public var eaBuffer: MutPtr = eaBufferCtorArg
        internal set

    public constructor() : this(
        extendedCreateFlags = 0L,
        eaBufferCtorArg = MutPtr(0L),
        eaLength = 0u,
    )

    public operator fun component1(): Long = this.extendedCreateFlags

    public operator fun component2(): MutPtr = this.eaBuffer

    public operator fun component3(): UInt = this.eaLength

    public fun copy(extendedCreateFlags: Long = this.extendedCreateFlags, eaBuffer: MutPtr = this.eaBuffer, eaLength: UInt = this.eaLength): ExtendedCreateInformation32 = ExtendedCreateInformation32(extendedCreateFlags = extendedCreateFlags, eaBufferCtorArg = eaBuffer, eaLength = eaLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtendedCreateInformation32) return false
        if (this.extendedCreateFlags != other.extendedCreateFlags) return false
        if (this.eaBuffer != other.eaBuffer) return false
        if (this.eaLength != other.eaLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extendedCreateFlags.hashCode()
        result = 31 * result + this.eaBuffer.hashCode()
        result = 31 * result + this.eaLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtendedCreateInformation32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtendedCreateInformation32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ExtendedCreateInformation32 =
                    ExtendedCreateInformation32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ExtendedCreateInformation32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.extendedCreateFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.eaBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.eaLength)
                }
            }

        public operator fun invoke(
            extendedCreateFlags: Long = 0L,
            eaBuffer: MutPtr = MutPtr(0L),
            eaLength: UInt = 0u,
        ): ExtendedCreateInformation32 =
            ExtendedCreateInformation32(
                extendedCreateFlags = extendedCreateFlags,
                eaBufferCtorArg = eaBuffer,
                eaLength = eaLength,
            )
    }
}

public class ExtDeleteParameters internal constructor(
    public var version: UInt,
    public var reserved: UInt,
    public var deleteCallback: PextDeleteCallback,
    deleteContextCtorArg: MutPtr,
) {
    public var deleteContext: MutPtr = deleteContextCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        reserved = 0u,
        deleteCallback = null,
        deleteContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.reserved

    public operator fun component3(): PextDeleteCallback = this.deleteCallback

    public operator fun component4(): MutPtr = this.deleteContext

    public fun copy(version: UInt = this.version, reserved: UInt = this.reserved, deleteCallback: PextDeleteCallback = this.deleteCallback, deleteContext: MutPtr = this.deleteContext): ExtDeleteParameters = ExtDeleteParameters(version = version, reserved = reserved, deleteCallback = deleteCallback, deleteContextCtorArg = deleteContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtDeleteParameters) return false
        if (this.version != other.version) return false
        if (this.reserved != other.reserved) return false
        if (this.deleteCallback != other.deleteCallback) return false
        if (this.deleteContext != other.deleteContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.deleteCallback.hashCode()
        result = 31 * result + this.deleteContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            reserved: UInt = 0u,
            deleteCallback: PextDeleteCallback = null,
            deleteContext: MutPtr = MutPtr(0L),
        ): ExtDeleteParameters =
            ExtDeleteParameters(
                version = version,
                reserved = reserved,
                deleteCallback = deleteCallback,
                deleteContextCtorArg = deleteContext,
            )
    }
}

public data class ExRundownRef(
    public var anonymous: ExRundownRef0 = ExRundownRef0(),
)

public class ExRundownRef0 internal constructor(
    public var count: Int,
    ptrCtorArg: MutPtr,
) {
    public var ptr: MutPtr = ptrCtorArg
        internal set

    public constructor() : this(
        count = 0,
        ptrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.count

    public operator fun component2(): MutPtr = this.ptr

    public fun copy(count: Int = this.count, ptr: MutPtr = this.ptr): ExRundownRef0 = ExRundownRef0(count = count, ptrCtorArg = ptr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExRundownRef0) return false
        if (this.count != other.count) return false
        if (this.ptr != other.ptr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.ptr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            count: Int = 0,
            ptr: MutPtr = MutPtr(0L),
        ): ExRundownRef0 =
            ExRundownRef0(
                count = count,
                ptrCtorArg = ptr,
            )
    }
}

public data class FaultInformation(
    public var type: FaultInformationArch = 0,
    public var isStage1: Boolean = false,
    public var anonymous: FaultInformation0 = FaultInformation0(),
)

public data class FaultInformation0(
    public var arm64: FaultInformationArm64 = FaultInformationArm64(),
    public var x64: FaultInformationX64 = FaultInformationX64(),
)

public class FaultInformationArm64 internal constructor(
    domainHandleCtorArg: MutPtr,
    faultAddressCtorArg: MutPtr,
    physicalDeviceObjectCtorArg: MutPtr,
    public var inputMappingId: UInt,
    public var flags: FaultInformationArm64Flags,
    public var type: FaultInformationArm64Type,
    public var iommuBaseAddress: ULong,
) {
    public var domainHandle: MutPtr = domainHandleCtorArg
        internal set

    public var faultAddress: MutPtr = faultAddressCtorArg
        internal set

    public var physicalDeviceObject: MutPtr = physicalDeviceObjectCtorArg
        internal set

    public constructor() : this(
        domainHandleCtorArg = MutPtr(0L),
        faultAddressCtorArg = MutPtr(0L),
        physicalDeviceObjectCtorArg = MutPtr(0L),
        inputMappingId = 0u,
        flags = FaultInformationArm64Flags(),
        type = 0,
        iommuBaseAddress = 0uL,
    )

    public operator fun component1(): MutPtr = this.domainHandle

    public operator fun component2(): MutPtr = this.faultAddress

    public operator fun component3(): MutPtr = this.physicalDeviceObject

    public operator fun component4(): UInt = this.inputMappingId

    public operator fun component5(): FaultInformationArm64Flags = this.flags

    public operator fun component6(): FaultInformationArm64Type = this.type

    public operator fun component7(): ULong = this.iommuBaseAddress

    public fun copy(domainHandle: MutPtr = this.domainHandle, faultAddress: MutPtr = this.faultAddress, physicalDeviceObject: MutPtr = this.physicalDeviceObject, inputMappingId: UInt = this.inputMappingId, flags: FaultInformationArm64Flags = this.flags, type: FaultInformationArm64Type = this.type, iommuBaseAddress: ULong = this.iommuBaseAddress): FaultInformationArm64 = FaultInformationArm64(domainHandleCtorArg = domainHandle, faultAddressCtorArg = faultAddress, physicalDeviceObjectCtorArg = physicalDeviceObject, inputMappingId = inputMappingId, flags = flags, type = type, iommuBaseAddress = iommuBaseAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaultInformationArm64) return false
        if (this.domainHandle != other.domainHandle) return false
        if (this.faultAddress != other.faultAddress) return false
        if (this.physicalDeviceObject != other.physicalDeviceObject) return false
        if (this.inputMappingId != other.inputMappingId) return false
        if (this.flags != other.flags) return false
        if (this.type != other.type) return false
        if (this.iommuBaseAddress != other.iommuBaseAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.domainHandle.hashCode()
        result = 31 * result + this.faultAddress.hashCode()
        result = 31 * result + this.physicalDeviceObject.hashCode()
        result = 31 * result + this.inputMappingId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.iommuBaseAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaultInformationArm64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaultInformationArm64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): FaultInformationArm64 =
                    FaultInformationArm64(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (FaultInformationArm64Flags.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: FaultInformationArm64) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.domainHandle)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.faultAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.physicalDeviceObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.inputMappingId)
                    (FaultInformationArm64Flags.typeLayout()).writeNative(addr + 28L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.iommuBaseAddress)
                }
            }

        public operator fun invoke(
            domainHandle: MutPtr = MutPtr(0L),
            faultAddress: MutPtr = MutPtr(0L),
            physicalDeviceObject: MutPtr = MutPtr(0L),
            inputMappingId: UInt = 0u,
            flags: FaultInformationArm64Flags = FaultInformationArm64Flags(),
            type: FaultInformationArm64Type = 0,
            iommuBaseAddress: ULong = 0uL,
        ): FaultInformationArm64 =
            FaultInformationArm64(
                domainHandleCtorArg = domainHandle,
                faultAddressCtorArg = faultAddress,
                physicalDeviceObjectCtorArg = physicalDeviceObject,
                inputMappingId = inputMappingId,
                flags = flags,
                type = type,
                iommuBaseAddress = iommuBaseAddress,
            )
    }
}

public data class FaultInformationArm64Flags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaultInformationArm64Flags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaultInformationArm64Flags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FaultInformationArm64Flags =
                    FaultInformationArm64Flags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FaultInformationArm64Flags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class FaultInformationX64 internal constructor(
    domainHandleCtorArg: MutPtr,
    faultAddressCtorArg: MutPtr,
    public var flags: FaultInformationX64Flags,
    public var type: FaultInformationArm64Type,
    public var iommuBaseAddress: ULong,
    public var pciSegment: UInt,
) {
    public var domainHandle: MutPtr = domainHandleCtorArg
        internal set

    public var faultAddress: MutPtr = faultAddressCtorArg
        internal set

    public constructor() : this(
        domainHandleCtorArg = MutPtr(0L),
        faultAddressCtorArg = MutPtr(0L),
        flags = FaultInformationX64Flags(),
        type = 0,
        iommuBaseAddress = 0uL,
        pciSegment = 0u,
    )

    public operator fun component1(): MutPtr = this.domainHandle

    public operator fun component2(): MutPtr = this.faultAddress

    public operator fun component3(): FaultInformationX64Flags = this.flags

    public operator fun component4(): FaultInformationArm64Type = this.type

    public operator fun component5(): ULong = this.iommuBaseAddress

    public operator fun component6(): UInt = this.pciSegment

    public fun copy(domainHandle: MutPtr = this.domainHandle, faultAddress: MutPtr = this.faultAddress, flags: FaultInformationX64Flags = this.flags, type: FaultInformationArm64Type = this.type, iommuBaseAddress: ULong = this.iommuBaseAddress, pciSegment: UInt = this.pciSegment): FaultInformationX64 = FaultInformationX64(domainHandleCtorArg = domainHandle, faultAddressCtorArg = faultAddress, flags = flags, type = type, iommuBaseAddress = iommuBaseAddress, pciSegment = pciSegment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaultInformationX64) return false
        if (this.domainHandle != other.domainHandle) return false
        if (this.faultAddress != other.faultAddress) return false
        if (this.flags != other.flags) return false
        if (this.type != other.type) return false
        if (this.iommuBaseAddress != other.iommuBaseAddress) return false
        if (this.pciSegment != other.pciSegment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.domainHandle.hashCode()
        result = 31 * result + this.faultAddress.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.iommuBaseAddress.hashCode()
        result = 31 * result + this.pciSegment.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaultInformationX64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaultInformationX64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): FaultInformationX64 =
                    FaultInformationX64(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (FaultInformationX64Flags.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FaultInformationX64) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.domainHandle)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.faultAddress)
                    (FaultInformationX64Flags.typeLayout()).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.iommuBaseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.pciSegment)
                }
            }

        public operator fun invoke(
            domainHandle: MutPtr = MutPtr(0L),
            faultAddress: MutPtr = MutPtr(0L),
            flags: FaultInformationX64Flags = FaultInformationX64Flags(),
            type: FaultInformationArm64Type = 0,
            iommuBaseAddress: ULong = 0uL,
            pciSegment: UInt = 0u,
        ): FaultInformationX64 =
            FaultInformationX64(
                domainHandleCtorArg = domainHandle,
                faultAddressCtorArg = faultAddress,
                flags = flags,
                type = type,
                iommuBaseAddress = iommuBaseAddress,
                pciSegment = pciSegment,
            )
    }
}

public data class FaultInformationX64Flags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaultInformationX64Flags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaultInformationX64Flags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FaultInformationX64Flags =
                    FaultInformationX64Flags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FaultInformationX64Flags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class FileAttributeTagInformation(
    public var fileAttributes: UInt = 0u,
    public var reparseTag: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAttributeTagInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAttributeTagInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FileAttributeTagInformation =
                    FileAttributeTagInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileAttributeTagInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reparseTag)
                }
            }
    }
}

public data class FileEndOfFileInformation(
    public var endOfFile: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileEndOfFileInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileEndOfFileInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FileEndOfFileInformation =
                    FileEndOfFileInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileEndOfFileInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.endOfFile)
                }
            }
    }
}

public data class FileFsDeviceInformation(
    public var deviceType: UInt = 0u,
    public var characteristics: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsDeviceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsDeviceInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FileFsDeviceInformation =
                    FileFsDeviceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileFsDeviceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.deviceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.characteristics)
                }
            }
    }
}

public data class FileFsFullSizeInformation(
    public var totalAllocationUnits: Long = 0L,
    public var callerAvailableAllocationUnits: Long = 0L,
    public var actualAvailableAllocationUnits: Long = 0L,
    public var sectorsPerAllocationUnit: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsFullSizeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsFullSizeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): FileFsFullSizeInformation =
                    FileFsFullSizeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: FileFsFullSizeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.totalAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.callerAvailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.actualAvailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sectorsPerAllocationUnit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.bytesPerSector)
                }
            }
    }
}

public data class FileFsFullSizeInformationEx(
    public var actualTotalAllocationUnits: ULong = 0uL,
    public var actualAvailableAllocationUnits: ULong = 0uL,
    public var actualPoolUnavailableAllocationUnits: ULong = 0uL,
    public var callerTotalAllocationUnits: ULong = 0uL,
    public var callerAvailableAllocationUnits: ULong = 0uL,
    public var callerPoolUnavailableAllocationUnits: ULong = 0uL,
    public var usedAllocationUnits: ULong = 0uL,
    public var totalReservedAllocationUnits: ULong = 0uL,
    public var volumeStorageReserveAllocationUnits: ULong = 0uL,
    public var availableCommittedAllocationUnits: ULong = 0uL,
    public var poolAvailableAllocationUnits: ULong = 0uL,
    public var sectorsPerAllocationUnit: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsFullSizeInformationEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsFullSizeInformationEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): FileFsFullSizeInformationEx =
                    FileFsFullSizeInformationEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                    )
                override fun writeNative(addr: Long, value: FileFsFullSizeInformationEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.actualTotalAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.actualAvailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.actualPoolUnavailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.callerTotalAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.callerAvailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.callerPoolUnavailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.usedAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.totalReservedAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.volumeStorageReserveAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.availableCommittedAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.poolAvailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.sectorsPerAllocationUnit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.bytesPerSector)
                }
            }
    }
}

public data class FileFsLabelInformation(
    public var volumeLabelLength: UInt = 0u,
    public var volumeLabel: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFsLabelInformation) return false
        if (this.volumeLabelLength != other.volumeLabelLength) return false
        if (!this.volumeLabel.contentEquals(other.volumeLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeLabelLength.hashCode()
        result = 31 * result + this.volumeLabel.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsLabelInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsLabelInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FileFsLabelInformation =
                    FileFsLabelInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: FileFsLabelInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.volumeLabelLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.volumeLabel.toList())
                }
            }
    }
}

public data class FileFsMetadataSizeInformation(
    public var totalMetadataAllocationUnits: Long = 0L,
    public var sectorsPerAllocationUnit: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsMetadataSizeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsMetadataSizeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FileFsMetadataSizeInformation =
                    FileFsMetadataSizeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FileFsMetadataSizeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.totalMetadataAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sectorsPerAllocationUnit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bytesPerSector)
                }
            }
    }
}

public data class FileFsObjectidInformation(
    public var objectId: UByteArray = UByteArray(16),
    public var extendedInfo: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFsObjectidInformation) return false
        if (!this.objectId.contentEquals(other.objectId)) return false
        if (!this.extendedInfo.contentEquals(other.extendedInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectId.contentHashCode()
        result = 31 * result + this.extendedInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsObjectidInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsObjectidInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): FileFsObjectidInformation =
                    FileFsObjectidInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FileFsObjectidInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.objectId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                    ).writeNative(addr + 16L, value.extendedInfo.toList())
                }
            }
    }
}

public data class FileFsSizeInformation(
    public var totalAllocationUnits: Long = 0L,
    public var availableAllocationUnits: Long = 0L,
    public var sectorsPerAllocationUnit: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsSizeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsSizeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FileFsSizeInformation =
                    FileFsSizeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: FileFsSizeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.totalAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.availableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sectorsPerAllocationUnit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bytesPerSector)
                }
            }
    }
}

public data class FileFsVolumeInformation(
    public var volumeCreationTime: Long = 0L,
    public var volumeSerialNumber: UInt = 0u,
    public var volumeLabelLength: UInt = 0u,
    public var supportsObjects: Boolean = false,
    public var volumeLabel: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFsVolumeInformation) return false
        if (this.volumeCreationTime != other.volumeCreationTime) return false
        if (this.volumeSerialNumber != other.volumeSerialNumber) return false
        if (this.volumeLabelLength != other.volumeLabelLength) return false
        if (this.supportsObjects != other.supportsObjects) return false
        if (!this.volumeLabel.contentEquals(other.volumeLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeCreationTime.hashCode()
        result = 31 * result + this.volumeSerialNumber.hashCode()
        result = 31 * result + this.volumeLabelLength.hashCode()
        result = 31 * result + this.supportsObjects.hashCode()
        result = 31 * result + this.volumeLabel.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsVolumeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsVolumeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FileFsVolumeInformation =
                    FileFsVolumeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 18L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: FileFsVolumeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.volumeCreationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.volumeSerialNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.volumeLabelLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.supportsObjects)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 18L, value.volumeLabel.toList())
                }
            }
    }
}

public class FileIostatusblockRangeInformation internal constructor(
    ioStatusBlockRangeCtorArg: MutPtr,
    public var length: UInt,
) {
    public var ioStatusBlockRange: MutPtr = ioStatusBlockRangeCtorArg
        internal set

    public constructor() : this(
        ioStatusBlockRangeCtorArg = MutPtr(0L),
        length = 0u,
    )

    public operator fun component1(): MutPtr = this.ioStatusBlockRange

    public operator fun component2(): UInt = this.length

    public fun copy(ioStatusBlockRange: MutPtr = this.ioStatusBlockRange, length: UInt = this.length): FileIostatusblockRangeInformation = FileIostatusblockRangeInformation(ioStatusBlockRangeCtorArg = ioStatusBlockRange, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIostatusblockRangeInformation) return false
        if (this.ioStatusBlockRange != other.ioStatusBlockRange) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ioStatusBlockRange.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIostatusblockRangeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIostatusblockRangeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FileIostatusblockRangeInformation =
                    FileIostatusblockRangeInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileIostatusblockRangeInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.ioStatusBlockRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }

        public operator fun invoke(
            ioStatusBlockRange: MutPtr = MutPtr(0L),
            length: UInt = 0u,
        ): FileIostatusblockRangeInformation =
            FileIostatusblockRangeInformation(
                ioStatusBlockRangeCtorArg = ioStatusBlockRange,
                length = length,
            )
    }
}

public data class FileIoCompletionNotificationInformation(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIoCompletionNotificationInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIoCompletionNotificationInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FileIoCompletionNotificationInformation =
                    FileIoCompletionNotificationInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileIoCompletionNotificationInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class FileIoPriorityHintInformation(
    public var priorityHint: IoPriorityHint = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIoPriorityHintInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIoPriorityHintInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FileIoPriorityHintInformation =
                    FileIoPriorityHintInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileIoPriorityHintInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.priorityHint)
                }
            }
    }
}

public data class FileIoPriorityHintInformationEx(
    public var priorityHint: IoPriorityHint = 0,
    public var boostOutstanding: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIoPriorityHintInformationEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIoPriorityHintInformationEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FileIoPriorityHintInformationEx =
                    FileIoPriorityHintInformationEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileIoPriorityHintInformationEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.priorityHint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.boostOutstanding)
                }
            }
    }
}

public data class FileIsRemoteDeviceInformation(
    public var isRemote: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIsRemoteDeviceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIsRemoteDeviceInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): FileIsRemoteDeviceInformation =
                    FileIsRemoteDeviceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileIsRemoteDeviceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.isRemote)
                }
            }
    }
}

public data class FileMemoryPartitionInformation(
    public var ownerPartitionHandle: Int = 0,
    public var flags: FileMemoryPartitionInformation0 = FileMemoryPartitionInformation0(),
)

public data class FileMemoryPartitionInformation0(
    public var anonymous: FileMemoryPartitionInformation00 = FileMemoryPartitionInformation00(),
    public var allFlags: UInt = 0u,
)

public data class FileMemoryPartitionInformation00(
    public var noCrossPartitionAccess: UByte = 0u,
    public var spare: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileMemoryPartitionInformation00) return false
        if (this.noCrossPartitionAccess != other.noCrossPartitionAccess) return false
        if (!this.spare.contentEquals(other.spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.noCrossPartitionAccess.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileMemoryPartitionInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileMemoryPartitionInformation00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FileMemoryPartitionInformation00 =
                    FileMemoryPartitionInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FileMemoryPartitionInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.noCrossPartitionAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.spare.toList())
                }
            }
    }
}

public data class FileNumaNodeInformation(
    public var nodeNumber: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNumaNodeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNumaNodeInformation> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): FileNumaNodeInformation =
                    FileNumaNodeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileNumaNodeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nodeNumber)
                }
            }
    }
}

public data class FileProcessIdsUsingFileInformation(
    public var numberOfProcessIdsInList: UInt = 0u,
    public var processIdList: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileProcessIdsUsingFileInformation) return false
        if (this.numberOfProcessIdsInList != other.numberOfProcessIdsInList) return false
        if (!this.processIdList.contentEquals(other.processIdList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfProcessIdsInList.hashCode()
        result = 31 * result + this.processIdList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileProcessIdsUsingFileInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileProcessIdsUsingFileInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FileProcessIdsUsingFileInformation =
                    FileProcessIdsUsingFileInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (1).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: FileProcessIdsUsingFileInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfProcessIdsInList)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (1).toInt())
                    ).writeNative(addr + 8L, value.processIdList.toList())
                }
            }
    }
}

public data class FileSfioReserveInformation(
    public var requestsPerPeriod: UInt = 0u,
    public var period: UInt = 0u,
    public var retryFailures: Boolean = false,
    public var discardable: Boolean = false,
    public var requestSize: UInt = 0u,
    public var numOutstandingRequests: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileSfioReserveInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileSfioReserveInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): FileSfioReserveInformation =
                    FileSfioReserveInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FileSfioReserveInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestsPerPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.period)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.retryFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.discardable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.requestSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numOutstandingRequests)
                }
            }
    }
}

public data class FileSfioVolumeInformation(
    public var maximumRequestsPerPeriod: UInt = 0u,
    public var minimumPeriod: UInt = 0u,
    public var minimumTransferSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileSfioVolumeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileSfioVolumeInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): FileSfioVolumeInformation =
                    FileSfioVolumeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileSfioVolumeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumRequestsPerPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minimumPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minimumTransferSize)
                }
            }
    }
}

public data class FileStandardInformationEx(
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var numberOfLinks: UInt = 0u,
    public var deletePending: Boolean = false,
    public var directory: Boolean = false,
    public var alternateStream: Boolean = false,
    public var metadataAttribute: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStandardInformationEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStandardInformationEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FileStandardInformationEx =
                    FileStandardInformationEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 21L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 23L),
                    )
                override fun writeNative(addr: Long, value: FileStandardInformationEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfLinks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.deletePending)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 21L, value.directory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 22L, value.alternateStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 23L, value.metadataAttribute)
                }
            }
    }
}

public data class FileValidDataLengthInformation(
    public var validDataLength: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileValidDataLengthInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileValidDataLengthInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FileValidDataLengthInformation =
                    FileValidDataLengthInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileValidDataLengthInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.validDataLength)
                }
            }
    }
}

public data class FloatingSaveArea(
    public var controlWord: UInt = 0u,
    public var statusWord: UInt = 0u,
    public var tagWord: UInt = 0u,
    public var errorOffset: UInt = 0u,
    public var errorSelector: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataSelector: UInt = 0u,
    public var registerArea: UByteArray = UByteArray(80),
    public var spare0: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FloatingSaveArea) return false
        if (this.controlWord != other.controlWord) return false
        if (this.statusWord != other.statusWord) return false
        if (this.tagWord != other.tagWord) return false
        if (this.errorOffset != other.errorOffset) return false
        if (this.errorSelector != other.errorSelector) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.dataSelector != other.dataSelector) return false
        if (!this.registerArea.contentEquals(other.registerArea)) return false
        if (this.spare0 != other.spare0) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.controlWord.hashCode()
        result = 31 * result + this.statusWord.hashCode()
        result = 31 * result + this.tagWord.hashCode()
        result = 31 * result + this.errorOffset.hashCode()
        result = 31 * result + this.errorSelector.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.dataSelector.hashCode()
        result = 31 * result + this.registerArea.contentHashCode()
        result = 31 * result + this.spare0.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FloatingSaveArea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FloatingSaveArea> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): FloatingSaveArea =
                    FloatingSaveArea(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                    )
                override fun writeNative(addr: Long, value: FloatingSaveArea) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.controlWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.statusWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tagWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.errorOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.errorSelector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dataSelector)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 28L, value.registerArea.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.spare0)
                }
            }
    }
}

public class FpgaControlInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var busScan: PfpgaBusScan,
    public var controlLink: PfpgaControlLink,
    public var controlConfigSpace: PfpgaControlConfigSpace,
    public var controlErrorReporting: PfpgaControlErrorReporting,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        busScan = null,
        controlLink = null,
        controlConfigSpace = null,
        controlErrorReporting = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PfpgaBusScan = this.busScan

    public operator fun component7(): PfpgaControlLink = this.controlLink

    public operator fun component8(): PfpgaControlConfigSpace = this.controlConfigSpace

    public operator fun component9(): PfpgaControlErrorReporting = this.controlErrorReporting

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, busScan: PfpgaBusScan = this.busScan, controlLink: PfpgaControlLink = this.controlLink, controlConfigSpace: PfpgaControlConfigSpace = this.controlConfigSpace, controlErrorReporting: PfpgaControlErrorReporting = this.controlErrorReporting): FpgaControlInterface = FpgaControlInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, busScan = busScan, controlLink = controlLink, controlConfigSpace = controlConfigSpace, controlErrorReporting = controlErrorReporting)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FpgaControlInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.busScan != other.busScan) return false
        if (this.controlLink != other.controlLink) return false
        if (this.controlConfigSpace != other.controlConfigSpace) return false
        if (this.controlErrorReporting != other.controlErrorReporting) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.busScan.hashCode()
        result = 31 * result + this.controlLink.hashCode()
        result = 31 * result + this.controlConfigSpace.hashCode()
        result = 31 * result + this.controlErrorReporting.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            busScan: PfpgaBusScan = null,
            controlLink: PfpgaControlLink = null,
            controlConfigSpace: PfpgaControlConfigSpace = null,
            controlErrorReporting: PfpgaControlErrorReporting = null,
        ): FpgaControlInterface =
            FpgaControlInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                busScan = busScan,
                controlLink = controlLink,
                controlConfigSpace = controlConfigSpace,
                controlErrorReporting = controlErrorReporting,
            )
    }
}

public class FunctionLevelDeviceResetParameters internal constructor(
    public var size: UInt,
    public var deviceResetCompletion: PdeviceResetCompletion,
    completionContextCtorArg: MutPtr,
) {
    public var completionContext: MutPtr = completionContextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        deviceResetCompletion = null,
        completionContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): PdeviceResetCompletion = this.deviceResetCompletion

    public operator fun component3(): MutPtr = this.completionContext

    public fun copy(size: UInt = this.size, deviceResetCompletion: PdeviceResetCompletion = this.deviceResetCompletion, completionContext: MutPtr = this.completionContext): FunctionLevelDeviceResetParameters = FunctionLevelDeviceResetParameters(size = size, deviceResetCompletion = deviceResetCompletion, completionContextCtorArg = completionContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FunctionLevelDeviceResetParameters) return false
        if (this.size != other.size) return false
        if (this.deviceResetCompletion != other.deviceResetCompletion) return false
        if (this.completionContext != other.completionContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.deviceResetCompletion.hashCode()
        result = 31 * result + this.completionContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            deviceResetCompletion: PdeviceResetCompletion = null,
            completionContext: MutPtr = MutPtr(0L),
        ): FunctionLevelDeviceResetParameters =
            FunctionLevelDeviceResetParameters(
                size = size,
                deviceResetCompletion = deviceResetCompletion,
                completionContextCtorArg = completionContext,
            )
    }
}

public data class HalAmliBadIoAddressList(
    public var badAddrBegin: UInt = 0u,
    public var badAddrSize: UInt = 0u,
    public var oSVersionTrigger: UInt = 0u,
    public var iOHandler: Phalioreadwritehandler = null,
)

public data class HalBusInformation(
    public var busType: InterfaceType = 0,
    public var configurationType: BusDataType = 0,
    public var busNumber: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalBusInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalBusInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HalBusInformation =
                    HalBusInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: HalBusInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.busType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.configurationType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.busNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class HalCallbacks(
    public var setSystemInformation: PcallbackObject = 0L,
    public var busCheck: PcallbackObject = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalCallbacks> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalCallbacks> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HalCallbacks =
                    HalCallbacks(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HalCallbacks) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.setSystemInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.busCheck)
                }
            }
    }
}

public class HalDispatch(
    public var version: UInt = 0u,
    public var halQuerySystemInformation: PHalQuerySystemInformation = null,
    public var halSetSystemInformation: PHalSetSystemInformation = null,
    public var halQueryBusSlots: PHalQueryBusSlots = null,
    public var spare1: UInt = 0u,
    public var halExamineMBR: PHalExamineMbr = null,
    public var halIoReadPartitionTable: PHalIoReadPartitionTable = null,
    public var halIoSetPartitionInformation: PHalIoSetPartitionInformation = null,
    public var halIoWritePartitionTable: PHalIoWritePartitionTable = null,
    public var halReferenceHandlerForBus: PHalHandlerForBus = null,
    public var halReferenceBusHandler: PHalReferenceBusHandler = null,
    public var halDereferenceBusHandler: PHalReferenceBusHandler = null,
    public var halInitPnpDriver: PHalInitPnpDriver = null,
    public var halInitPowerManagement: PHalInitPowerManagement = null,
    public var halGetDmaAdapter: PHalGetDmaAdapter = null,
    public var halGetInterruptTranslator: PHalGetInterruptTranslator = null,
    public var halStartMirroring: PHalStartMirroring = null,
    public var halEndMirroring: PHalEndMirroring = null,
    public var halMirrorPhysicalMemory: PHalMirrorPhysicalMemory = null,
    public var halEndOfBoot: PHalEndOfBoot = null,
    public var halMirrorVerify: PHalMirrorVerify = null,
    public var halGetCachedAcpiTable: PHalGetAcpiTable = null,
    public var halSetPciErrorHandlerCallback: PHalSetPciErrorHandlerCallback = null,
    public var halGetPrmCache: PHalGetPrmCache = null,
)

public class HalErrorInfo(
    public var version: UInt = 0u,
    public var initMaxSize: UInt = 0u,
    public var mcaMaxSize: UInt = 0u,
    public var mcaPreviousEventsCount: UInt = 0u,
    public var mcaCorrectedEventsCount: UInt = 0u,
    public var mcaKernelDeliveryFails: UInt = 0u,
    public var mcaDriverDpcQueueFails: UInt = 0u,
    public var mcaReserved: UInt = 0u,
    public var cmcMaxSize: UInt = 0u,
    public var cmcPollingInterval: UInt = 0u,
    public var cmcInterruptsCount: UInt = 0u,
    public var cmcKernelDeliveryFails: UInt = 0u,
    public var cmcDriverDpcQueueFails: UInt = 0u,
    public var cmcGetStateFails: UInt = 0u,
    public var cmcClearStateFails: UInt = 0u,
    public var cmcReserved: UInt = 0u,
    public var cmcLogId: ULong = 0uL,
    public var cpeMaxSize: UInt = 0u,
    public var cpePollingInterval: UInt = 0u,
    public var cpeInterruptsCount: UInt = 0u,
    public var cpeKernelDeliveryFails: UInt = 0u,
    public var cpeDriverDpcQueueFails: UInt = 0u,
    public var cpeGetStateFails: UInt = 0u,
    public var cpeClearStateFails: UInt = 0u,
    public var cpeInterruptSources: UInt = 0u,
    public var cpeLogId: ULong = 0uL,
    public var kernelReserved: ULongArray = ULongArray(4),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalErrorInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalErrorInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): HalErrorInfo =
                    HalErrorInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 112L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: HalErrorInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.initMaxSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mcaMaxSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.mcaPreviousEventsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.mcaCorrectedEventsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.mcaKernelDeliveryFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.mcaDriverDpcQueueFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mcaReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cmcMaxSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cmcPollingInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cmcInterruptsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.cmcKernelDeliveryFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cmcDriverDpcQueueFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.cmcGetStateFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.cmcClearStateFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.cmcReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.cmcLogId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.cpeMaxSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.cpePollingInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.cpeInterruptsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.cpeKernelDeliveryFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.cpeDriverDpcQueueFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.cpeGetStateFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.cpeClearStateFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.cpeInterruptSources)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.cpeLogId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 112L, value.kernelReserved.toList())
                }
            }
    }
}

public data class HalMcaInterface(
    public var lock: Phalmcainterfacelock = null,
    public var unlock: Phalmcainterfaceunlock = null,
    public var readRegister: Phalmcainterfacereadregister = null,
)

public data class HalPlatformInformation(
    public var platformFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalPlatformInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalPlatformInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HalPlatformInformation =
                    HalPlatformInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HalPlatformInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.platformFlags)
                }
            }
    }
}

public data class HalPowerInformation(
    public var tbd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalPowerInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalPowerInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HalPowerInformation =
                    HalPowerInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HalPowerInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tbd)
                }
            }
    }
}

public data class HalProcessorFeature(
    public var usableFeatureBits: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalProcessorFeature> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalProcessorFeature> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HalProcessorFeature =
                    HalProcessorFeature(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HalProcessorFeature) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usableFeatureBits)
                }
            }
    }
}

public data class HalProcessorSpeedInformation(
    public var processorSpeed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalProcessorSpeedInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HalProcessorSpeedInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HalProcessorSpeedInformation =
                    HalProcessorSpeedInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HalProcessorSpeedInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.processorSpeed)
                }
            }
    }
}

public data class HardwareCounter(
    public var type: HardwareCounterType = 0,
    public var reserved: UInt = 0u,
    public var index: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HardwareCounter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HardwareCounter> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HardwareCounter =
                    HardwareCounter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HardwareCounter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.index)
                }
            }
    }
}

public data class HwprofileChangeNotification(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var event: Guid = Guid(),
)

public class ImageInfo internal constructor(
    public var anonymous: ImageInfo0,
    imageBaseCtorArg: MutPtr,
    public var imageSelector: UInt,
    public var imageSize: Int,
    public var imageSectionNumber: UInt,
) {
    public var imageBase: MutPtr = imageBaseCtorArg
        internal set

    public constructor() : this(
        anonymous = ImageInfo0(),
        imageBaseCtorArg = MutPtr(0L),
        imageSelector = 0u,
        imageSize = 0,
        imageSectionNumber = 0u,
    )

    public operator fun component1(): ImageInfo0 = this.anonymous

    public operator fun component2(): MutPtr = this.imageBase

    public operator fun component3(): UInt = this.imageSelector

    public operator fun component4(): Int = this.imageSize

    public operator fun component5(): UInt = this.imageSectionNumber

    public fun copy(anonymous: ImageInfo0 = this.anonymous, imageBase: MutPtr = this.imageBase, imageSelector: UInt = this.imageSelector, imageSize: Int = this.imageSize, imageSectionNumber: UInt = this.imageSectionNumber): ImageInfo = ImageInfo(anonymous = anonymous, imageBaseCtorArg = imageBase, imageSelector = imageSelector, imageSize = imageSize, imageSectionNumber = imageSectionNumber)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageInfo) return false
        if (this.anonymous != other.anonymous) return false
        if (this.imageBase != other.imageBase) return false
        if (this.imageSelector != other.imageSelector) return false
        if (this.imageSize != other.imageSize) return false
        if (this.imageSectionNumber != other.imageSectionNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.imageBase.hashCode()
        result = 31 * result + this.imageSelector.hashCode()
        result = 31 * result + this.imageSize.hashCode()
        result = 31 * result + this.imageSectionNumber.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: ImageInfo0 = ImageInfo0(),
            imageBase: MutPtr = MutPtr(0L),
            imageSelector: UInt = 0u,
            imageSize: Int = 0,
            imageSectionNumber: UInt = 0u,
        ): ImageInfo =
            ImageInfo(
                anonymous = anonymous,
                imageBaseCtorArg = imageBase,
                imageSelector = imageSelector,
                imageSize = imageSize,
                imageSectionNumber = imageSectionNumber,
            )
    }
}

public data class ImageInfo0(
    public var properties: UInt = 0u,
    public var anonymous: ImageInfo00 = ImageInfo00(),
)

public data class ImageInfo00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageInfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageInfo00 =
                    ImageInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class ImageInfoEx internal constructor(
    public var size: Int,
    public var imageInfo: ImageInfo,
    fileObjectCtorArg: MutPtr,
) {
    public var fileObject: MutPtr = fileObjectCtorArg
        internal set

    public constructor() : this(
        size = 0,
        imageInfo = ImageInfo(),
        fileObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): ImageInfo = this.imageInfo

    public operator fun component3(): MutPtr = this.fileObject

    public fun copy(size: Int = this.size, imageInfo: ImageInfo = this.imageInfo, fileObject: MutPtr = this.fileObject): ImageInfoEx = ImageInfoEx(size = size, imageInfo = imageInfo, fileObjectCtorArg = fileObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageInfoEx) return false
        if (this.size != other.size) return false
        if (this.imageInfo != other.imageInfo) return false
        if (this.fileObject != other.fileObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.imageInfo.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            imageInfo: ImageInfo = ImageInfo(),
            fileObject: MutPtr = MutPtr(0L),
        ): ImageInfoEx =
            ImageInfoEx(
                size = size,
                imageInfo = imageInfo,
                fileObjectCtorArg = fileObject,
            )
    }
}

public data class InitialPrivilegeSet(
    public var privilegeCount: UInt = 0u,
    public var control: UInt = 0u,
    public var privilege: List<LuidAndAttributes> = List(3) { LuidAndAttributes() },
)

public data class InputMappingElement(
    public var inputMappingId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputMappingElement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputMappingElement> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): InputMappingElement =
                    InputMappingElement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: InputMappingElement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inputMappingId)
                }
            }
    }
}

public data class IntelCacheInfoEax(
    public var ulong: UInt = 0u,
    public var anonymous: IntelCacheInfoEax0 = IntelCacheInfoEax0(),
)

public data class IntelCacheInfoEax0(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntelCacheInfoEax0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntelCacheInfoEax0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): IntelCacheInfoEax0 =
                    IntelCacheInfoEax0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IntelCacheInfoEax0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class IntelCacheInfoEbx(
    public var ulong: UInt = 0u,
    public var anonymous: IntelCacheInfoEbx0 = IntelCacheInfoEbx0(),
)

public data class IntelCacheInfoEbx0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntelCacheInfoEbx0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntelCacheInfoEbx0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): IntelCacheInfoEbx0 =
                    IntelCacheInfoEbx0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IntelCacheInfoEbx0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class Interface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference): Interface = Interface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Interface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
        ): Interface =
            Interface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
            )
    }
}

public data class IommuDeviceCreationConfiguration(
    public var nextConfiguration: ListEntry = ListEntry(),
    public var configType: IommuDeviceCreationConfigurationType = 0,
    public var anonymous: IommuDeviceCreationConfiguration0 = IommuDeviceCreationConfiguration0(),
)

public class IommuDeviceCreationConfiguration0 internal constructor(
    public var acpi: IommuDeviceCreationConfigurationAcpi,
    deviceIdCtorArg: MutPtr,
) {
    public var deviceId: MutPtr = deviceIdCtorArg
        internal set

    public constructor() : this(
        acpi = IommuDeviceCreationConfigurationAcpi(),
        deviceIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IommuDeviceCreationConfigurationAcpi = this.acpi

    public operator fun component2(): MutPtr = this.deviceId

    public fun copy(acpi: IommuDeviceCreationConfigurationAcpi = this.acpi, deviceId: MutPtr = this.deviceId): IommuDeviceCreationConfiguration0 = IommuDeviceCreationConfiguration0(acpi = acpi, deviceIdCtorArg = deviceId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IommuDeviceCreationConfiguration0) return false
        if (this.acpi != other.acpi) return false
        if (this.deviceId != other.deviceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.acpi.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            acpi: IommuDeviceCreationConfigurationAcpi = IommuDeviceCreationConfigurationAcpi(),
            deviceId: MutPtr = MutPtr(0L),
        ): IommuDeviceCreationConfiguration0 =
            IommuDeviceCreationConfiguration0(
                acpi = acpi,
                deviceIdCtorArg = deviceId,
            )
    }
}

public data class IommuDeviceCreationConfigurationAcpi(
    public var inputMappingBase: UInt = 0u,
    public var mappingsCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDeviceCreationConfigurationAcpi> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDeviceCreationConfigurationAcpi> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IommuDeviceCreationConfigurationAcpi =
                    IommuDeviceCreationConfigurationAcpi(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IommuDeviceCreationConfigurationAcpi) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inputMappingBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mappingsCount)
                }
            }
    }
}

public data class IommuDmaDomainCreationFlags(
    public var anonymous: IommuDmaDomainCreationFlags0 = IommuDmaDomainCreationFlags0(),
    public var asUlonglong: ULong = 0uL,
)

public data class IommuDmaDomainCreationFlags0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDmaDomainCreationFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDmaDomainCreationFlags0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IommuDmaDomainCreationFlags0 =
                    IommuDmaDomainCreationFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IommuDmaDomainCreationFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class IommuDmaLogicalAddressToken(
    public var logicalAddressBase: ULong = 0uL,
    public var size: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDmaLogicalAddressToken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDmaLogicalAddressToken> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IommuDmaLogicalAddressToken =
                    IommuDmaLogicalAddressToken(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IommuDmaLogicalAddressToken) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.logicalAddressBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.size)
                }
            }
    }
}

public class IommuDmaLogicalAddressTokenMappedSegment internal constructor(
    owningTokenCtorArg: MutPtr,
    public var offset: Int,
    public var size: Int,
) {
    public var owningToken: MutPtr = owningTokenCtorArg
        internal set

    public constructor() : this(
        owningTokenCtorArg = MutPtr(0L),
        offset = 0,
        size = 0,
    )

    public operator fun component1(): MutPtr = this.owningToken

    public operator fun component2(): Int = this.offset

    public operator fun component3(): Int = this.size

    public fun copy(owningToken: MutPtr = this.owningToken, offset: Int = this.offset, size: Int = this.size): IommuDmaLogicalAddressTokenMappedSegment = IommuDmaLogicalAddressTokenMappedSegment(owningTokenCtorArg = owningToken, offset = offset, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IommuDmaLogicalAddressTokenMappedSegment) return false
        if (this.owningToken != other.owningToken) return false
        if (this.offset != other.offset) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.owningToken.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDmaLogicalAddressTokenMappedSegment> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDmaLogicalAddressTokenMappedSegment> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IommuDmaLogicalAddressTokenMappedSegment =
                    IommuDmaLogicalAddressTokenMappedSegment(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IommuDmaLogicalAddressTokenMappedSegment) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.owningToken)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.size)
                }
            }

        public operator fun invoke(
            owningToken: MutPtr = MutPtr(0L),
            offset: Int = 0,
            size: Int = 0,
        ): IommuDmaLogicalAddressTokenMappedSegment =
            IommuDmaLogicalAddressTokenMappedSegment(
                owningTokenCtorArg = owningToken,
                offset = offset,
                size = size,
            )
    }
}

public data class IommuDmaLogicalAllocatorConfig(
    public var logicalAllocatorType: IommuDmaLogicalAllocatorType = 0,
    public var anonymous: IommuDmaLogicalAllocatorConfig0 = IommuDmaLogicalAllocatorConfig0(),
)

public data class IommuDmaLogicalAllocatorConfig0(
    public var buddyAllocatorConfig: IommuDmaLogicalAllocatorConfig00 = IommuDmaLogicalAllocatorConfig00(),
)

public data class IommuDmaLogicalAllocatorConfig00(
    public var addressWidth: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDmaLogicalAllocatorConfig00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDmaLogicalAllocatorConfig00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): IommuDmaLogicalAllocatorConfig00 =
                    IommuDmaLogicalAllocatorConfig00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IommuDmaLogicalAllocatorConfig00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.addressWidth)
                }
            }
    }
}

public class IommuDmaReservedRegion internal constructor(
    regionNextCtorArg: MutPtr,
    public var base: ULong,
    public var numberOfPages: Int,
    public var shouldMap: Boolean,
) {
    public var regionNext: MutPtr = regionNextCtorArg
        internal set

    public constructor() : this(
        regionNextCtorArg = MutPtr(0L),
        base = 0uL,
        numberOfPages = 0,
        shouldMap = false,
    )

    public operator fun component1(): MutPtr = this.regionNext

    public operator fun component2(): ULong = this.base

    public operator fun component3(): Int = this.numberOfPages

    public operator fun component4(): Boolean = this.shouldMap

    public fun copy(regionNext: MutPtr = this.regionNext, base: ULong = this.base, numberOfPages: Int = this.numberOfPages, shouldMap: Boolean = this.shouldMap): IommuDmaReservedRegion = IommuDmaReservedRegion(regionNextCtorArg = regionNext, base = base, numberOfPages = numberOfPages, shouldMap = shouldMap)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IommuDmaReservedRegion) return false
        if (this.regionNext != other.regionNext) return false
        if (this.base != other.base) return false
        if (this.numberOfPages != other.numberOfPages) return false
        if (this.shouldMap != other.shouldMap) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.regionNext.hashCode()
        result = 31 * result + this.base.hashCode()
        result = 31 * result + this.numberOfPages.hashCode()
        result = 31 * result + this.shouldMap.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDmaReservedRegion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuDmaReservedRegion> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): IommuDmaReservedRegion =
                    IommuDmaReservedRegion(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IommuDmaReservedRegion) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.regionNext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.base)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.numberOfPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 24L, value.shouldMap)
                }
            }

        public operator fun invoke(
            regionNext: MutPtr = MutPtr(0L),
            base: ULong = 0uL,
            numberOfPages: Int = 0,
            shouldMap: Boolean = false,
        ): IommuDmaReservedRegion =
            IommuDmaReservedRegion(
                regionNextCtorArg = regionNext,
                base = base,
                numberOfPages = numberOfPages,
                shouldMap = shouldMap,
            )
    }
}

public data class IommuInterfaceStateChange(
    public var presentFields: IommuInterfaceStateChangeFields = IommuInterfaceStateChangeFields(),
    public var availableDomainTypes: UInt = 0u,
)

public data class IommuInterfaceStateChangeFields(
    public var anonymous: IommuInterfaceStateChangeFields0 = IommuInterfaceStateChangeFields0(),
    public var asULONG: UInt = 0u,
)

public data class IommuInterfaceStateChangeFields0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuInterfaceStateChangeFields0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuInterfaceStateChangeFields0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): IommuInterfaceStateChangeFields0 =
                    IommuInterfaceStateChangeFields0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IommuInterfaceStateChangeFields0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class IommuMapPhysicalAddress(
    public var mapType: IommuMapPhysicalAddressType = 0,
    public var anonymous: IommuMapPhysicalAddress0 = IommuMapPhysicalAddress0(),
)

public data class IommuMapPhysicalAddress0(
    public var mdl: IommuMapPhysicalAddress00 = IommuMapPhysicalAddress00(),
    public var contiguousRange: IommuMapPhysicalAddress01 = IommuMapPhysicalAddress01(),
    public var pfnArray: IommuMapPhysicalAddress02 = IommuMapPhysicalAddress02(),
)

public data class IommuMapPhysicalAddress01(
    public var base: Long = 0L,
    public var size: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuMapPhysicalAddress01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuMapPhysicalAddress01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IommuMapPhysicalAddress01 =
                    IommuMapPhysicalAddress01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IommuMapPhysicalAddress01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.base)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.size)
                }
            }
    }
}

public class IommuMapPhysicalAddress00 internal constructor(
    mdlCtorArg: MutPtr,
) {
    public var mdl: MutPtr = mdlCtorArg
        internal set

    public constructor() : this(
        mdlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.mdl

    public fun copy(mdl: MutPtr = this.mdl): IommuMapPhysicalAddress00 = IommuMapPhysicalAddress00(mdlCtorArg = mdl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IommuMapPhysicalAddress00) return false
        if (this.mdl != other.mdl) return false
        return true
    }

    override fun hashCode(): Int = this.mdl.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuMapPhysicalAddress00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuMapPhysicalAddress00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IommuMapPhysicalAddress00 =
                    IommuMapPhysicalAddress00(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IommuMapPhysicalAddress00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.mdl)
                }
            }

        public operator fun invoke(
            mdl: MutPtr = MutPtr(0L),
        ): IommuMapPhysicalAddress00 =
            IommuMapPhysicalAddress00(
                mdlCtorArg = mdl,
            )
    }
}

public class IommuMapPhysicalAddress02 internal constructor(
    pageFrameCtorArg: MutPtr,
    public var numberOfPages: Int,
) {
    public var pageFrame: MutPtr = pageFrameCtorArg
        internal set

    public constructor() : this(
        pageFrameCtorArg = MutPtr(0L),
        numberOfPages = 0,
    )

    public operator fun component1(): MutPtr = this.pageFrame

    public operator fun component2(): Int = this.numberOfPages

    public fun copy(pageFrame: MutPtr = this.pageFrame, numberOfPages: Int = this.numberOfPages): IommuMapPhysicalAddress02 = IommuMapPhysicalAddress02(pageFrameCtorArg = pageFrame, numberOfPages = numberOfPages)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IommuMapPhysicalAddress02) return false
        if (this.pageFrame != other.pageFrame) return false
        if (this.numberOfPages != other.numberOfPages) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pageFrame.hashCode()
        result = 31 * result + this.numberOfPages.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuMapPhysicalAddress02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IommuMapPhysicalAddress02> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IommuMapPhysicalAddress02 =
                    IommuMapPhysicalAddress02(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IommuMapPhysicalAddress02) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pageFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.numberOfPages)
                }
            }

        public operator fun invoke(
            pageFrame: MutPtr = MutPtr(0L),
            numberOfPages: Int = 0,
        ): IommuMapPhysicalAddress02 =
            IommuMapPhysicalAddress02(
                pageFrameCtorArg = pageFrame,
                numberOfPages = numberOfPages,
            )
    }
}

public data class IoAttributionInformation(
    public var version: UInt = 0u,
    public var flags: IoAttributionInformation0 = IoAttributionInformation0(),
    public var length: UInt = 0u,
    public var serviceStartTime: ULong = 0uL,
    public var currentTime: ULong = 0uL,
)

public data class IoAttributionInformation0(
    public var anonymous: IoAttributionInformation00 = IoAttributionInformation00(),
    public var allFlags: UInt = 0u,
)

public data class IoAttributionInformation00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoAttributionInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoAttributionInformation00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): IoAttributionInformation00 =
                    IoAttributionInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IoAttributionInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class IoConnectInterruptFullySpecifiedParameters internal constructor(
    physicalDeviceObjectCtorArg: MutPtr,
    interruptObjectCtorArg: MutPtr,
    public var serviceRoutine: PkserviceRoutine,
    serviceContextCtorArg: MutPtr,
    spinLockCtorArg: MutPtr,
    public var synchronizeIrql: UByte,
    public var floatingSave: Boolean,
    public var shareVector: Boolean,
    public var vector: UInt,
    public var irql: UByte,
    public var interruptMode: KinterruptMode,
    public var processorEnableMask: Int,
    public var group: UShort,
) {
    public var physicalDeviceObject: MutPtr = physicalDeviceObjectCtorArg
        internal set

    public var interruptObject: MutPtr = interruptObjectCtorArg
        internal set

    public var serviceContext: MutPtr = serviceContextCtorArg
        internal set

    public var spinLock: MutPtr = spinLockCtorArg
        internal set

    public constructor() : this(
        physicalDeviceObjectCtorArg = MutPtr(0L),
        interruptObjectCtorArg = MutPtr(0L),
        serviceRoutine = null,
        serviceContextCtorArg = MutPtr(0L),
        spinLockCtorArg = MutPtr(0L),
        synchronizeIrql = 0u,
        floatingSave = false,
        shareVector = false,
        vector = 0u,
        irql = 0u,
        interruptMode = 0,
        processorEnableMask = 0,
        group = 0u,
    )

    public operator fun component1(): MutPtr = this.physicalDeviceObject

    public operator fun component2(): MutPtr = this.interruptObject

    public operator fun component3(): PkserviceRoutine = this.serviceRoutine

    public operator fun component4(): MutPtr = this.serviceContext

    public operator fun component5(): MutPtr = this.spinLock

    public operator fun component6(): UByte = this.synchronizeIrql

    public operator fun component7(): Boolean = this.floatingSave

    public operator fun component8(): Boolean = this.shareVector

    public operator fun component9(): UInt = this.vector

    public operator fun component10(): UByte = this.irql

    public operator fun component11(): KinterruptMode = this.interruptMode

    public operator fun component12(): Int = this.processorEnableMask

    public operator fun component13(): UShort = this.group

    public fun copy(physicalDeviceObject: MutPtr = this.physicalDeviceObject, interruptObject: MutPtr = this.interruptObject, serviceRoutine: PkserviceRoutine = this.serviceRoutine, serviceContext: MutPtr = this.serviceContext, spinLock: MutPtr = this.spinLock, synchronizeIrql: UByte = this.synchronizeIrql, floatingSave: Boolean = this.floatingSave, shareVector: Boolean = this.shareVector, vector: UInt = this.vector, irql: UByte = this.irql, interruptMode: KinterruptMode = this.interruptMode, processorEnableMask: Int = this.processorEnableMask, group: UShort = this.group): IoConnectInterruptFullySpecifiedParameters = IoConnectInterruptFullySpecifiedParameters(physicalDeviceObjectCtorArg = physicalDeviceObject, interruptObjectCtorArg = interruptObject, serviceRoutine = serviceRoutine, serviceContextCtorArg = serviceContext, spinLockCtorArg = spinLock, synchronizeIrql = synchronizeIrql, floatingSave = floatingSave, shareVector = shareVector, vector = vector, irql = irql, interruptMode = interruptMode, processorEnableMask = processorEnableMask, group = group)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoConnectInterruptFullySpecifiedParameters) return false
        if (this.physicalDeviceObject != other.physicalDeviceObject) return false
        if (this.interruptObject != other.interruptObject) return false
        if (this.serviceRoutine != other.serviceRoutine) return false
        if (this.serviceContext != other.serviceContext) return false
        if (this.spinLock != other.spinLock) return false
        if (this.synchronizeIrql != other.synchronizeIrql) return false
        if (this.floatingSave != other.floatingSave) return false
        if (this.shareVector != other.shareVector) return false
        if (this.vector != other.vector) return false
        if (this.irql != other.irql) return false
        if (this.interruptMode != other.interruptMode) return false
        if (this.processorEnableMask != other.processorEnableMask) return false
        if (this.group != other.group) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalDeviceObject.hashCode()
        result = 31 * result + this.interruptObject.hashCode()
        result = 31 * result + this.serviceRoutine.hashCode()
        result = 31 * result + this.serviceContext.hashCode()
        result = 31 * result + this.spinLock.hashCode()
        result = 31 * result + this.synchronizeIrql.hashCode()
        result = 31 * result + this.floatingSave.hashCode()
        result = 31 * result + this.shareVector.hashCode()
        result = 31 * result + this.vector.hashCode()
        result = 31 * result + this.irql.hashCode()
        result = 31 * result + this.interruptMode.hashCode()
        result = 31 * result + this.processorEnableMask.hashCode()
        result = 31 * result + this.group.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            physicalDeviceObject: MutPtr = MutPtr(0L),
            interruptObject: MutPtr = MutPtr(0L),
            serviceRoutine: PkserviceRoutine = null,
            serviceContext: MutPtr = MutPtr(0L),
            spinLock: MutPtr = MutPtr(0L),
            synchronizeIrql: UByte = 0u,
            floatingSave: Boolean = false,
            shareVector: Boolean = false,
            vector: UInt = 0u,
            irql: UByte = 0u,
            interruptMode: KinterruptMode = 0,
            processorEnableMask: Int = 0,
            group: UShort = 0u,
        ): IoConnectInterruptFullySpecifiedParameters =
            IoConnectInterruptFullySpecifiedParameters(
                physicalDeviceObjectCtorArg = physicalDeviceObject,
                interruptObjectCtorArg = interruptObject,
                serviceRoutine = serviceRoutine,
                serviceContextCtorArg = serviceContext,
                spinLockCtorArg = spinLock,
                synchronizeIrql = synchronizeIrql,
                floatingSave = floatingSave,
                shareVector = shareVector,
                vector = vector,
                irql = irql,
                interruptMode = interruptMode,
                processorEnableMask = processorEnableMask,
                group = group,
            )
    }
}

public class IoConnectInterruptLineBasedParameters internal constructor(
    physicalDeviceObjectCtorArg: MutPtr,
    interruptObjectCtorArg: MutPtr,
    public var serviceRoutine: PkserviceRoutine,
    serviceContextCtorArg: MutPtr,
    spinLockCtorArg: MutPtr,
    public var synchronizeIrql: UByte,
    public var floatingSave: Boolean,
) {
    public var physicalDeviceObject: MutPtr = physicalDeviceObjectCtorArg
        internal set

    public var interruptObject: MutPtr = interruptObjectCtorArg
        internal set

    public var serviceContext: MutPtr = serviceContextCtorArg
        internal set

    public var spinLock: MutPtr = spinLockCtorArg
        internal set

    public constructor() : this(
        physicalDeviceObjectCtorArg = MutPtr(0L),
        interruptObjectCtorArg = MutPtr(0L),
        serviceRoutine = null,
        serviceContextCtorArg = MutPtr(0L),
        spinLockCtorArg = MutPtr(0L),
        synchronizeIrql = 0u,
        floatingSave = false,
    )

    public operator fun component1(): MutPtr = this.physicalDeviceObject

    public operator fun component2(): MutPtr = this.interruptObject

    public operator fun component3(): PkserviceRoutine = this.serviceRoutine

    public operator fun component4(): MutPtr = this.serviceContext

    public operator fun component5(): MutPtr = this.spinLock

    public operator fun component6(): UByte = this.synchronizeIrql

    public operator fun component7(): Boolean = this.floatingSave

    public fun copy(physicalDeviceObject: MutPtr = this.physicalDeviceObject, interruptObject: MutPtr = this.interruptObject, serviceRoutine: PkserviceRoutine = this.serviceRoutine, serviceContext: MutPtr = this.serviceContext, spinLock: MutPtr = this.spinLock, synchronizeIrql: UByte = this.synchronizeIrql, floatingSave: Boolean = this.floatingSave): IoConnectInterruptLineBasedParameters = IoConnectInterruptLineBasedParameters(physicalDeviceObjectCtorArg = physicalDeviceObject, interruptObjectCtorArg = interruptObject, serviceRoutine = serviceRoutine, serviceContextCtorArg = serviceContext, spinLockCtorArg = spinLock, synchronizeIrql = synchronizeIrql, floatingSave = floatingSave)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoConnectInterruptLineBasedParameters) return false
        if (this.physicalDeviceObject != other.physicalDeviceObject) return false
        if (this.interruptObject != other.interruptObject) return false
        if (this.serviceRoutine != other.serviceRoutine) return false
        if (this.serviceContext != other.serviceContext) return false
        if (this.spinLock != other.spinLock) return false
        if (this.synchronizeIrql != other.synchronizeIrql) return false
        if (this.floatingSave != other.floatingSave) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalDeviceObject.hashCode()
        result = 31 * result + this.interruptObject.hashCode()
        result = 31 * result + this.serviceRoutine.hashCode()
        result = 31 * result + this.serviceContext.hashCode()
        result = 31 * result + this.spinLock.hashCode()
        result = 31 * result + this.synchronizeIrql.hashCode()
        result = 31 * result + this.floatingSave.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            physicalDeviceObject: MutPtr = MutPtr(0L),
            interruptObject: MutPtr = MutPtr(0L),
            serviceRoutine: PkserviceRoutine = null,
            serviceContext: MutPtr = MutPtr(0L),
            spinLock: MutPtr = MutPtr(0L),
            synchronizeIrql: UByte = 0u,
            floatingSave: Boolean = false,
        ): IoConnectInterruptLineBasedParameters =
            IoConnectInterruptLineBasedParameters(
                physicalDeviceObjectCtorArg = physicalDeviceObject,
                interruptObjectCtorArg = interruptObject,
                serviceRoutine = serviceRoutine,
                serviceContextCtorArg = serviceContext,
                spinLockCtorArg = spinLock,
                synchronizeIrql = synchronizeIrql,
                floatingSave = floatingSave,
            )
    }
}

public class IoConnectInterruptMessageBasedParameters internal constructor(
    physicalDeviceObjectCtorArg: MutPtr,
    public var connectionContext: IoConnectInterruptMessageBasedParameters0,
    public var messageServiceRoutine: PkmessageServiceRoutine,
    serviceContextCtorArg: MutPtr,
    spinLockCtorArg: MutPtr,
    public var synchronizeIrql: UByte,
    public var floatingSave: Boolean,
    public var fallBackServiceRoutine: PkserviceRoutine,
) {
    public var physicalDeviceObject: MutPtr = physicalDeviceObjectCtorArg
        internal set

    public var serviceContext: MutPtr = serviceContextCtorArg
        internal set

    public var spinLock: MutPtr = spinLockCtorArg
        internal set

    public constructor() : this(
        physicalDeviceObjectCtorArg = MutPtr(0L),
        connectionContext = IoConnectInterruptMessageBasedParameters0(),
        messageServiceRoutine = null,
        serviceContextCtorArg = MutPtr(0L),
        spinLockCtorArg = MutPtr(0L),
        synchronizeIrql = 0u,
        floatingSave = false,
        fallBackServiceRoutine = null,
    )

    public operator fun component1(): MutPtr = this.physicalDeviceObject

    public operator fun component2(): IoConnectInterruptMessageBasedParameters0 = this.connectionContext

    public operator fun component3(): PkmessageServiceRoutine = this.messageServiceRoutine

    public operator fun component4(): MutPtr = this.serviceContext

    public operator fun component5(): MutPtr = this.spinLock

    public operator fun component6(): UByte = this.synchronizeIrql

    public operator fun component7(): Boolean = this.floatingSave

    public operator fun component8(): PkserviceRoutine = this.fallBackServiceRoutine

    public fun copy(physicalDeviceObject: MutPtr = this.physicalDeviceObject, connectionContext: IoConnectInterruptMessageBasedParameters0 = this.connectionContext, messageServiceRoutine: PkmessageServiceRoutine = this.messageServiceRoutine, serviceContext: MutPtr = this.serviceContext, spinLock: MutPtr = this.spinLock, synchronizeIrql: UByte = this.synchronizeIrql, floatingSave: Boolean = this.floatingSave, fallBackServiceRoutine: PkserviceRoutine = this.fallBackServiceRoutine): IoConnectInterruptMessageBasedParameters = IoConnectInterruptMessageBasedParameters(physicalDeviceObjectCtorArg = physicalDeviceObject, connectionContext = connectionContext, messageServiceRoutine = messageServiceRoutine, serviceContextCtorArg = serviceContext, spinLockCtorArg = spinLock, synchronizeIrql = synchronizeIrql, floatingSave = floatingSave, fallBackServiceRoutine = fallBackServiceRoutine)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoConnectInterruptMessageBasedParameters) return false
        if (this.physicalDeviceObject != other.physicalDeviceObject) return false
        if (this.connectionContext != other.connectionContext) return false
        if (this.messageServiceRoutine != other.messageServiceRoutine) return false
        if (this.serviceContext != other.serviceContext) return false
        if (this.spinLock != other.spinLock) return false
        if (this.synchronizeIrql != other.synchronizeIrql) return false
        if (this.floatingSave != other.floatingSave) return false
        if (this.fallBackServiceRoutine != other.fallBackServiceRoutine) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalDeviceObject.hashCode()
        result = 31 * result + this.connectionContext.hashCode()
        result = 31 * result + this.messageServiceRoutine.hashCode()
        result = 31 * result + this.serviceContext.hashCode()
        result = 31 * result + this.spinLock.hashCode()
        result = 31 * result + this.synchronizeIrql.hashCode()
        result = 31 * result + this.floatingSave.hashCode()
        result = 31 * result + this.fallBackServiceRoutine.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            physicalDeviceObject: MutPtr = MutPtr(0L),
            connectionContext: IoConnectInterruptMessageBasedParameters0 = IoConnectInterruptMessageBasedParameters0(),
            messageServiceRoutine: PkmessageServiceRoutine = null,
            serviceContext: MutPtr = MutPtr(0L),
            spinLock: MutPtr = MutPtr(0L),
            synchronizeIrql: UByte = 0u,
            floatingSave: Boolean = false,
            fallBackServiceRoutine: PkserviceRoutine = null,
        ): IoConnectInterruptMessageBasedParameters =
            IoConnectInterruptMessageBasedParameters(
                physicalDeviceObjectCtorArg = physicalDeviceObject,
                connectionContext = connectionContext,
                messageServiceRoutine = messageServiceRoutine,
                serviceContextCtorArg = serviceContext,
                spinLockCtorArg = spinLock,
                synchronizeIrql = synchronizeIrql,
                floatingSave = floatingSave,
                fallBackServiceRoutine = fallBackServiceRoutine,
            )
    }
}

public class IoConnectInterruptMessageBasedParameters0 internal constructor(
    genericCtorArg: MutPtr,
    interruptMessageTableCtorArg: MutPtr,
    interruptObjectCtorArg: MutPtr,
) {
    public var generic: MutPtr = genericCtorArg
        internal set

    public var interruptMessageTable: MutPtr = interruptMessageTableCtorArg
        internal set

    public var interruptObject: MutPtr = interruptObjectCtorArg
        internal set

    public constructor() : this(
        genericCtorArg = MutPtr(0L),
        interruptMessageTableCtorArg = MutPtr(0L),
        interruptObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.generic

    public operator fun component2(): MutPtr = this.interruptMessageTable

    public operator fun component3(): MutPtr = this.interruptObject

    public fun copy(generic: MutPtr = this.generic, interruptMessageTable: MutPtr = this.interruptMessageTable, interruptObject: MutPtr = this.interruptObject): IoConnectInterruptMessageBasedParameters0 = IoConnectInterruptMessageBasedParameters0(genericCtorArg = generic, interruptMessageTableCtorArg = interruptMessageTable, interruptObjectCtorArg = interruptObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoConnectInterruptMessageBasedParameters0) return false
        if (this.generic != other.generic) return false
        if (this.interruptMessageTable != other.interruptMessageTable) return false
        if (this.interruptObject != other.interruptObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.generic.hashCode()
        result = 31 * result + this.interruptMessageTable.hashCode()
        result = 31 * result + this.interruptObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            generic: MutPtr = MutPtr(0L),
            interruptMessageTable: MutPtr = MutPtr(0L),
            interruptObject: MutPtr = MutPtr(0L),
        ): IoConnectInterruptMessageBasedParameters0 =
            IoConnectInterruptMessageBasedParameters0(
                genericCtorArg = generic,
                interruptMessageTableCtorArg = interruptMessageTable,
                interruptObjectCtorArg = interruptObject,
            )
    }
}

public data class IoConnectInterruptParameters(
    public var version: UInt = 0u,
    public var anonymous: IoConnectInterruptParameters0 = IoConnectInterruptParameters0(),
)

public data class IoConnectInterruptParameters0(
    public var fullySpecified: IoConnectInterruptFullySpecifiedParameters = IoConnectInterruptFullySpecifiedParameters(),
    public var lineBased: IoConnectInterruptLineBasedParameters = IoConnectInterruptLineBasedParameters(),
    public var messageBased: IoConnectInterruptMessageBasedParameters = IoConnectInterruptMessageBasedParameters(),
)

public class IoCsq internal constructor(
    public var type: UInt,
    public var csqInsertIrp: PioCsqInsertIrp,
    public var csqRemoveIrp: PioCsqRemoveIrp,
    public var csqPeekNextIrp: PioCsqPeekNextIrp,
    public var csqAcquireLock: PioCsqAcquireLock,
    public var csqReleaseLock: PioCsqReleaseLock,
    public var csqCompleteCanceledIrp: PioCsqCompleteCanceledIrp,
    reservePointerCtorArg: MutPtr,
) {
    public var reservePointer: MutPtr = reservePointerCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        csqInsertIrp = null,
        csqRemoveIrp = null,
        csqPeekNextIrp = null,
        csqAcquireLock = null,
        csqReleaseLock = null,
        csqCompleteCanceledIrp = null,
        reservePointerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.type

    public operator fun component2(): PioCsqInsertIrp = this.csqInsertIrp

    public operator fun component3(): PioCsqRemoveIrp = this.csqRemoveIrp

    public operator fun component4(): PioCsqPeekNextIrp = this.csqPeekNextIrp

    public operator fun component5(): PioCsqAcquireLock = this.csqAcquireLock

    public operator fun component6(): PioCsqReleaseLock = this.csqReleaseLock

    public operator fun component7(): PioCsqCompleteCanceledIrp = this.csqCompleteCanceledIrp

    public operator fun component8(): MutPtr = this.reservePointer

    public fun copy(type: UInt = this.type, csqInsertIrp: PioCsqInsertIrp = this.csqInsertIrp, csqRemoveIrp: PioCsqRemoveIrp = this.csqRemoveIrp, csqPeekNextIrp: PioCsqPeekNextIrp = this.csqPeekNextIrp, csqAcquireLock: PioCsqAcquireLock = this.csqAcquireLock, csqReleaseLock: PioCsqReleaseLock = this.csqReleaseLock, csqCompleteCanceledIrp: PioCsqCompleteCanceledIrp = this.csqCompleteCanceledIrp, reservePointer: MutPtr = this.reservePointer): IoCsq = IoCsq(type = type, csqInsertIrp = csqInsertIrp, csqRemoveIrp = csqRemoveIrp, csqPeekNextIrp = csqPeekNextIrp, csqAcquireLock = csqAcquireLock, csqReleaseLock = csqReleaseLock, csqCompleteCanceledIrp = csqCompleteCanceledIrp, reservePointerCtorArg = reservePointer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoCsq) return false
        if (this.type != other.type) return false
        if (this.csqInsertIrp != other.csqInsertIrp) return false
        if (this.csqRemoveIrp != other.csqRemoveIrp) return false
        if (this.csqPeekNextIrp != other.csqPeekNextIrp) return false
        if (this.csqAcquireLock != other.csqAcquireLock) return false
        if (this.csqReleaseLock != other.csqReleaseLock) return false
        if (this.csqCompleteCanceledIrp != other.csqCompleteCanceledIrp) return false
        if (this.reservePointer != other.reservePointer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.csqInsertIrp.hashCode()
        result = 31 * result + this.csqRemoveIrp.hashCode()
        result = 31 * result + this.csqPeekNextIrp.hashCode()
        result = 31 * result + this.csqAcquireLock.hashCode()
        result = 31 * result + this.csqReleaseLock.hashCode()
        result = 31 * result + this.csqCompleteCanceledIrp.hashCode()
        result = 31 * result + this.reservePointer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: UInt = 0u,
            csqInsertIrp: PioCsqInsertIrp = null,
            csqRemoveIrp: PioCsqRemoveIrp = null,
            csqPeekNextIrp: PioCsqPeekNextIrp = null,
            csqAcquireLock: PioCsqAcquireLock = null,
            csqReleaseLock: PioCsqReleaseLock = null,
            csqCompleteCanceledIrp: PioCsqCompleteCanceledIrp = null,
            reservePointer: MutPtr = MutPtr(0L),
        ): IoCsq =
            IoCsq(
                type = type,
                csqInsertIrp = csqInsertIrp,
                csqRemoveIrp = csqRemoveIrp,
                csqPeekNextIrp = csqPeekNextIrp,
                csqAcquireLock = csqAcquireLock,
                csqReleaseLock = csqReleaseLock,
                csqCompleteCanceledIrp = csqCompleteCanceledIrp,
                reservePointerCtorArg = reservePointer,
            )
    }
}

public class IoCsqIrpContext internal constructor(
    public var type: UInt,
    irpCtorArg: MutPtr,
    csqCtorArg: MutPtr,
) {
    public var irp: MutPtr = irpCtorArg
        internal set

    public var csq: MutPtr = csqCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        irpCtorArg = MutPtr(0L),
        csqCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.type

    public operator fun component2(): MutPtr = this.irp

    public operator fun component3(): MutPtr = this.csq

    public fun copy(type: UInt = this.type, irp: MutPtr = this.irp, csq: MutPtr = this.csq): IoCsqIrpContext = IoCsqIrpContext(type = type, irpCtorArg = irp, csqCtorArg = csq)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoCsqIrpContext) return false
        if (this.type != other.type) return false
        if (this.irp != other.irp) return false
        if (this.csq != other.csq) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.irp.hashCode()
        result = 31 * result + this.csq.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoCsqIrpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoCsqIrpContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoCsqIrpContext =
                    IoCsqIrpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoCsqIrpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.irp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.csq)
                }
            }

        public operator fun invoke(
            type: UInt = 0u,
            irp: MutPtr = MutPtr(0L),
            csq: MutPtr = MutPtr(0L),
        ): IoCsqIrpContext =
            IoCsqIrpContext(
                type = type,
                irpCtorArg = irp,
                csqCtorArg = csq,
            )
    }
}

public data class IoDisconnectInterruptParameters(
    public var version: UInt = 0u,
    public var connectionContext: IoDisconnectInterruptParameters0 = IoDisconnectInterruptParameters0(),
)

public class IoDisconnectInterruptParameters0 internal constructor(
    genericCtorArg: MutPtr,
    public var interruptObject: Pkinterrupt,
    interruptMessageTableCtorArg: MutPtr,
) {
    public var generic: MutPtr = genericCtorArg
        internal set

    public var interruptMessageTable: MutPtr = interruptMessageTableCtorArg
        internal set

    public constructor() : this(
        genericCtorArg = MutPtr(0L),
        interruptObject = 0L,
        interruptMessageTableCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.generic

    public operator fun component2(): Pkinterrupt = this.interruptObject

    public operator fun component3(): MutPtr = this.interruptMessageTable

    public fun copy(generic: MutPtr = this.generic, interruptObject: Pkinterrupt = this.interruptObject, interruptMessageTable: MutPtr = this.interruptMessageTable): IoDisconnectInterruptParameters0 = IoDisconnectInterruptParameters0(genericCtorArg = generic, interruptObject = interruptObject, interruptMessageTableCtorArg = interruptMessageTable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoDisconnectInterruptParameters0) return false
        if (this.generic != other.generic) return false
        if (this.interruptObject != other.interruptObject) return false
        if (this.interruptMessageTable != other.interruptMessageTable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.generic.hashCode()
        result = 31 * result + this.interruptObject.hashCode()
        result = 31 * result + this.interruptMessageTable.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            generic: MutPtr = MutPtr(0L),
            interruptObject: Pkinterrupt = 0L,
            interruptMessageTable: MutPtr = MutPtr(0L),
        ): IoDisconnectInterruptParameters0 =
            IoDisconnectInterruptParameters0(
                genericCtorArg = generic,
                interruptObject = interruptObject,
                interruptMessageTableCtorArg = interruptMessageTable,
            )
    }
}

public class IoDriverCreateContext internal constructor(
    public var size: Short,
    extraCreateParameterCtorArg: MutPtr,
    deviceObjectHintCtorArg: MutPtr,
    txnParametersCtorArg: MutPtr,
    public var siloContext: Pesilo,
) {
    public var extraCreateParameter: MutPtr = extraCreateParameterCtorArg
        internal set

    public var deviceObjectHint: MutPtr = deviceObjectHintCtorArg
        internal set

    public var txnParameters: MutPtr = txnParametersCtorArg
        internal set

    public constructor() : this(
        size = 0,
        extraCreateParameterCtorArg = MutPtr(0L),
        deviceObjectHintCtorArg = MutPtr(0L),
        txnParametersCtorArg = MutPtr(0L),
        siloContext = 0L,
    )

    public operator fun component1(): Short = this.size

    public operator fun component2(): MutPtr = this.extraCreateParameter

    public operator fun component3(): MutPtr = this.deviceObjectHint

    public operator fun component4(): MutPtr = this.txnParameters

    public operator fun component5(): Pesilo = this.siloContext

    public fun copy(size: Short = this.size, extraCreateParameter: MutPtr = this.extraCreateParameter, deviceObjectHint: MutPtr = this.deviceObjectHint, txnParameters: MutPtr = this.txnParameters, siloContext: Pesilo = this.siloContext): IoDriverCreateContext = IoDriverCreateContext(size = size, extraCreateParameterCtorArg = extraCreateParameter, deviceObjectHintCtorArg = deviceObjectHint, txnParametersCtorArg = txnParameters, siloContext = siloContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoDriverCreateContext) return false
        if (this.size != other.size) return false
        if (this.extraCreateParameter != other.extraCreateParameter) return false
        if (this.deviceObjectHint != other.deviceObjectHint) return false
        if (this.txnParameters != other.txnParameters) return false
        if (this.siloContext != other.siloContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.extraCreateParameter.hashCode()
        result = 31 * result + this.deviceObjectHint.hashCode()
        result = 31 * result + this.txnParameters.hashCode()
        result = 31 * result + this.siloContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoDriverCreateContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoDriverCreateContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IoDriverCreateContext =
                    IoDriverCreateContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IoDriverCreateContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.extraCreateParameter)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.deviceObjectHint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.txnParameters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.siloContext)
                }
            }

        public operator fun invoke(
            size: Short = 0,
            extraCreateParameter: MutPtr = MutPtr(0L),
            deviceObjectHint: MutPtr = MutPtr(0L),
            txnParameters: MutPtr = MutPtr(0L),
            siloContext: Pesilo = 0L,
        ): IoDriverCreateContext =
            IoDriverCreateContext(
                size = size,
                extraCreateParameterCtorArg = extraCreateParameter,
                deviceObjectHintCtorArg = deviceObjectHint,
                txnParametersCtorArg = txnParameters,
                siloContext = siloContext,
            )
    }
}

public data class IoErrorLogMessage(
    public var type: UShort = 0u,
    public var size: UShort = 0u,
    public var driverNameLength: UShort = 0u,
    public var timeStamp: Long = 0L,
    public var driverNameOffset: UInt = 0u,
    public var entryData: IoErrorLogPacket = IoErrorLogPacket(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoErrorLogMessage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoErrorLogMessage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): IoErrorLogMessage =
                    IoErrorLogMessage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (IoErrorLogPacket.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IoErrorLogMessage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.driverNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.timeStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.driverNameOffset)
                    (IoErrorLogPacket.typeLayout()).writeNative(addr + 24L, value.entryData)
                }
            }
    }
}

public data class IoErrorLogPacket(
    public var majorFunctionCode: UByte = 0u,
    public var retryCount: UByte = 0u,
    public var dumpDataSize: UShort = 0u,
    public var numberOfStrings: UShort = 0u,
    public var stringOffset: UShort = 0u,
    public var eventCategory: UShort = 0u,
    public var errorCode: Ntstatus = 0,
    public var uniqueErrorValue: UInt = 0u,
    public var finalStatus: Ntstatus = 0,
    public var sequenceNumber: UInt = 0u,
    public var ioControlCode: UInt = 0u,
    public var deviceOffset: Long = 0L,
    public var dumpData: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoErrorLogPacket) return false
        if (this.majorFunctionCode != other.majorFunctionCode) return false
        if (this.retryCount != other.retryCount) return false
        if (this.dumpDataSize != other.dumpDataSize) return false
        if (this.numberOfStrings != other.numberOfStrings) return false
        if (this.stringOffset != other.stringOffset) return false
        if (this.eventCategory != other.eventCategory) return false
        if (this.errorCode != other.errorCode) return false
        if (this.uniqueErrorValue != other.uniqueErrorValue) return false
        if (this.finalStatus != other.finalStatus) return false
        if (this.sequenceNumber != other.sequenceNumber) return false
        if (this.ioControlCode != other.ioControlCode) return false
        if (this.deviceOffset != other.deviceOffset) return false
        if (!this.dumpData.contentEquals(other.dumpData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majorFunctionCode.hashCode()
        result = 31 * result + this.retryCount.hashCode()
        result = 31 * result + this.dumpDataSize.hashCode()
        result = 31 * result + this.numberOfStrings.hashCode()
        result = 31 * result + this.stringOffset.hashCode()
        result = 31 * result + this.eventCategory.hashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.uniqueErrorValue.hashCode()
        result = 31 * result + this.finalStatus.hashCode()
        result = 31 * result + this.sequenceNumber.hashCode()
        result = 31 * result + this.ioControlCode.hashCode()
        result = 31 * result + this.deviceOffset.hashCode()
        result = 31 * result + this.dumpData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoErrorLogPacket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoErrorLogPacket> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): IoErrorLogPacket =
                    IoErrorLogPacket(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 40L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: IoErrorLogPacket) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.majorFunctionCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.retryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.dumpDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.numberOfStrings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.stringOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.eventCategory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.errorCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uniqueErrorValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.finalStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sequenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ioControlCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.deviceOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 40L, value.dumpData.toList())
                }
            }
    }
}

public class IoFoextShadowFile internal constructor(
    backingFileObjectCtorArg: MutPtr,
    backingFltInstanceCtorArg: MutPtr,
) {
    public var backingFileObject: MutPtr = backingFileObjectCtorArg
        internal set

    public var backingFltInstance: MutPtr = backingFltInstanceCtorArg
        internal set

    public constructor() : this(
        backingFileObjectCtorArg = MutPtr(0L),
        backingFltInstanceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.backingFileObject

    public operator fun component2(): MutPtr = this.backingFltInstance

    public fun copy(backingFileObject: MutPtr = this.backingFileObject, backingFltInstance: MutPtr = this.backingFltInstance): IoFoextShadowFile = IoFoextShadowFile(backingFileObjectCtorArg = backingFileObject, backingFltInstanceCtorArg = backingFltInstance)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoFoextShadowFile) return false
        if (this.backingFileObject != other.backingFileObject) return false
        if (this.backingFltInstance != other.backingFltInstance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.backingFileObject.hashCode()
        result = 31 * result + this.backingFltInstance.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoFoextShadowFile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoFoextShadowFile> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IoFoextShadowFile =
                    IoFoextShadowFile(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoFoextShadowFile) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.backingFileObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.backingFltInstance)
                }
            }

        public operator fun invoke(
            backingFileObject: MutPtr = MutPtr(0L),
            backingFltInstance: MutPtr = MutPtr(0L),
        ): IoFoextShadowFile =
            IoFoextShadowFile(
                backingFileObjectCtorArg = backingFileObject,
                backingFltInstanceCtorArg = backingFltInstance,
            )
    }
}

public data class IoFoextSiloParameters(
    public var length: UInt = 0u,
    public var anonymous: IoFoextSiloParameters0 = IoFoextSiloParameters0(),
    public var siloContext: Pesilo = 0L,
)

public data class IoFoextSiloParameters0(
    public var anonymous: IoFoextSiloParameters00 = IoFoextSiloParameters00(),
    public var flags: UInt = 0u,
)
