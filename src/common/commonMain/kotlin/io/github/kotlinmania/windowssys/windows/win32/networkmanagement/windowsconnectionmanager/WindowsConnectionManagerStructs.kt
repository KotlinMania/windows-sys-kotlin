@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public class NetInterfaceContext internal constructor(
    public var interfaceIndex: UInt,
    configurationNameCtorArg: Pwstr,
) {
    public var configurationName: Pwstr = configurationNameCtorArg
        internal set

    public constructor() : this(
        interfaceIndex = 0u,
        configurationNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.interfaceIndex

    public operator fun component2(): Pwstr = this.configurationName

    public fun copy(interfaceIndex: UInt = this.interfaceIndex, configurationName: Pwstr = this.configurationName): NetInterfaceContext = NetInterfaceContext(interfaceIndex = interfaceIndex, configurationNameCtorArg = configurationName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetInterfaceContext) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.configurationName != other.configurationName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.interfaceIndex.hashCode()
        result = 31 * result + this.configurationName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            interfaceIndex: UInt = 0u,
            configurationName: Pwstr = MutPtr(0L),
        ): NetInterfaceContext =
            NetInterfaceContext(
                interfaceIndex = interfaceIndex,
                configurationNameCtorArg = configurationName,
            )
    }
}

public class NetInterfaceContextTable internal constructor(
    interfaceContextHandleCtorArg: Handle,
    public var numberOfEntries: UInt,
    interfaceContextArrayCtorArg: MutPtr<NetInterfaceContext>,
) {
    public var interfaceContextHandle: Handle = interfaceContextHandleCtorArg
        internal set

    public var interfaceContextArray: MutPtr<NetInterfaceContext> = interfaceContextArrayCtorArg
        internal set

    public constructor() : this(
        interfaceContextHandleCtorArg = MutPtr(0L),
        numberOfEntries = 0u,
        interfaceContextArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.interfaceContextHandle

    public operator fun component2(): UInt = this.numberOfEntries

    public operator fun component3(): MutPtr<NetInterfaceContext> = this.interfaceContextArray

    public fun copy(interfaceContextHandle: Handle = this.interfaceContextHandle, numberOfEntries: UInt = this.numberOfEntries, interfaceContextArray: MutPtr<NetInterfaceContext> = this.interfaceContextArray): NetInterfaceContextTable = NetInterfaceContextTable(interfaceContextHandleCtorArg = interfaceContextHandle, numberOfEntries = numberOfEntries, interfaceContextArrayCtorArg = interfaceContextArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetInterfaceContextTable) return false
        if (this.interfaceContextHandle != other.interfaceContextHandle) return false
        if (this.numberOfEntries != other.numberOfEntries) return false
        if (this.interfaceContextArray != other.interfaceContextArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.interfaceContextHandle.hashCode()
        result = 31 * result + this.numberOfEntries.hashCode()
        result = 31 * result + this.interfaceContextArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            interfaceContextHandle: Handle = MutPtr(0L),
            numberOfEntries: UInt = 0u,
            interfaceContextArray: MutPtr<NetInterfaceContext> = MutPtr(0L),
        ): NetInterfaceContextTable =
            NetInterfaceContextTable(
                interfaceContextHandleCtorArg = interfaceContextHandle,
                numberOfEntries = numberOfEntries,
                interfaceContextArrayCtorArg = interfaceContextArray,
            )
    }
}

public data class WcmBillingCycleInfo(
    public var startDate: Filetime = Filetime(),
    public var duration: WcmTimeInterval = WcmTimeInterval(),
    public var reset: Bool = 0,
)

public data class WcmConnectionCostData(
    public var connectionCost: UInt = 0u,
    public var costSource: WcmConnectionCostSource = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WcmConnectionCostData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WcmConnectionCostData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WcmConnectionCostData =
                    WcmConnectionCostData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WcmConnectionCostData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.connectionCost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.costSource)
                }
            }
    }
}

public data class WcmDataplanStatus(
    public var usageData: WcmUsageData = WcmUsageData(),
    public var dataLimitInMegabytes: UInt = 0u,
    public var inboundBandwidthInKbps: UInt = 0u,
    public var outboundBandwidthInKbps: UInt = 0u,
    public var billingCycle: WcmBillingCycleInfo = WcmBillingCycleInfo(),
    public var maxTransferSizeInMegabytes: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class WcmPolicyValue(
    public var fValue: Bool = 0,
    public var fIsGroupPolicy: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WcmPolicyValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WcmPolicyValue> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WcmPolicyValue =
                    WcmPolicyValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WcmPolicyValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fIsGroupPolicy)
                }
            }
    }
}

public data class WcmProfileInfo(
    public var strProfileName: UShortArray = UShortArray(256),
    public var adapterGUID: Guid = Guid(),
    public var media: WcmMediaType = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WcmProfileInfo) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.adapterGUID != other.adapterGUID) return false
        if (this.media != other.media) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strProfileName.contentHashCode()
        result = 31 * result + this.adapterGUID.hashCode()
        result = 31 * result + this.media.hashCode()
        return result
    }
}

public data class WcmProfileInfoList(
    public var dwNumberOfItems: UInt = 0u,
    public var profileInfo: List<WcmProfileInfo> = List(1) { WcmProfileInfo() },
)

public data class WcmTimeInterval(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wMilliseconds: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WcmTimeInterval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WcmTimeInterval> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 14L
                override fun readNative(addr: Long): WcmTimeInterval =
                    WcmTimeInterval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WcmTimeInterval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wYear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wMonth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wDay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wHour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wMinute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.wSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wMilliseconds)
                }
            }
    }
}

public data class WcmUsageData(
    public var usageInMegabytes: UInt = 0u,
    public var lastSyncTime: Filetime = Filetime(),
)
