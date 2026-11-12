@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.AddressFamily
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.DlEui48
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.InAddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlDadState

public data class WnvCustomerAddressChangeParam(
    public var mACAddress: DlEui48 = DlEui48(),
    public var cAFamily: AddressFamily = 0u,
    public var ca: WnvIpAddress = WnvIpAddress(),
    public var virtualSubnetId: UInt = 0u,
    public var pAFamily: AddressFamily = 0u,
    public var pa: WnvIpAddress = WnvIpAddress(),
    public var notificationReason: WnvCaNotificationType = 0,
)

public data class WnvIpAddress(
    public var ip: WnvIpAddress0 = WnvIpAddress0(),
)

public data class WnvIpAddress0(
    public var v4: InAddr = InAddr(),
    public var v6: In6Addr = In6Addr(),
    public var addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WnvIpAddress0) return false
        if (this.v4 != other.v4) return false
        if (this.v6 != other.v6) return false
        if (!this.addr.contentEquals(other.addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.v4.hashCode()
        result = 31 * result + this.v6.hashCode()
        result = 31 * result + this.addr.contentHashCode()
        return result
    }
}

public class WnvNotificationParam internal constructor(
    public var header: WnvObjectHeader,
    public var notificationType: WnvNotificationType,
    public var pendingNotifications: UInt,
    bufferCtorArg: MutPtr,
) {
    public var buffer: MutPtr = bufferCtorArg
        internal set

    public constructor() : this(
        header = WnvObjectHeader(),
        notificationType = 0,
        pendingNotifications = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WnvObjectHeader = this.header

    public operator fun component2(): WnvNotificationType = this.notificationType

    public operator fun component3(): UInt = this.pendingNotifications

    public operator fun component4(): MutPtr = this.buffer

    public fun copy(header: WnvObjectHeader = this.header, notificationType: WnvNotificationType = this.notificationType, pendingNotifications: UInt = this.pendingNotifications, buffer: MutPtr = this.buffer): WnvNotificationParam = WnvNotificationParam(header = header, notificationType = notificationType, pendingNotifications = pendingNotifications, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WnvNotificationParam) return false
        if (this.header != other.header) return false
        if (this.notificationType != other.notificationType) return false
        if (this.pendingNotifications != other.pendingNotifications) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.notificationType.hashCode()
        result = 31 * result + this.pendingNotifications.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WnvNotificationParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WnvNotificationParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WnvNotificationParam =
                    WnvNotificationParam(
                        (WnvObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WnvNotificationParam) {
                    (WnvObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.notificationType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pendingNotifications)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.buffer)
                }
            }

        public operator fun invoke(
            header: WnvObjectHeader = WnvObjectHeader(),
            notificationType: WnvNotificationType = 0,
            pendingNotifications: UInt = 0u,
            buffer: MutPtr = MutPtr(0L),
        ): WnvNotificationParam =
            WnvNotificationParam(
                header = header,
                notificationType = notificationType,
                pendingNotifications = pendingNotifications,
                bufferCtorArg = buffer,
            )
    }
}

public data class WnvObjectChangeParam(
    public var objectType: WnvObjectType = 0,
    public var objectParam: WnvObjectChangeParam0 = WnvObjectChangeParam0(),
)

public data class WnvObjectChangeParam0(
    public var providerAddressChange: WnvProviderAddressChangeParam = WnvProviderAddressChangeParam(),
    public var customerAddressChange: WnvCustomerAddressChangeParam = WnvCustomerAddressChangeParam(),
)

public data class WnvObjectHeader(
    public var majorVersion: UByte = 0u,
    public var minorVersion: UByte = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WnvObjectHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WnvObjectHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WnvObjectHeader =
                    WnvObjectHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WnvObjectHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                }
            }
    }
}

public data class WnvPolicyMismatchParam(
    public var cAFamily: AddressFamily = 0u,
    public var pAFamily: AddressFamily = 0u,
    public var virtualSubnetId: UInt = 0u,
    public var ca: WnvIpAddress = WnvIpAddress(),
    public var pa: WnvIpAddress = WnvIpAddress(),
)

public data class WnvProviderAddressChangeParam(
    public var pAFamily: AddressFamily = 0u,
    public var pa: WnvIpAddress = WnvIpAddress(),
    public var addressState: NlDadState = 0,
)

public data class WnvRedirectParam(
    public var cAFamily: AddressFamily = 0u,
    public var pAFamily: AddressFamily = 0u,
    public var newPAFamily: AddressFamily = 0u,
    public var virtualSubnetId: UInt = 0u,
    public var ca: WnvIpAddress = WnvIpAddress(),
    public var pa: WnvIpAddress = WnvIpAddress(),
    public var newPA: WnvIpAddress = WnvIpAddress(),
)
