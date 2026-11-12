@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public data class SocketSecuritySettingsIpsec(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var securityFlags: UInt = 0u,
    public var ipsecFlags: UInt = 0u,
    public var authipMMPolicyKey: Guid = Guid(),
    public var authipQMPolicyKey: Guid = Guid(),
    public var reserved: Guid = Guid(),
    public var reserved2: ULong = 0uL,
    public var userNameStringLen: UInt = 0u,
    public var domainNameStringLen: UInt = 0u,
    public var passwordStringLen: UInt = 0u,
    public var allStrings: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SocketSecuritySettingsIpsec) return false
        if (this.securityProtocol != other.securityProtocol) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.ipsecFlags != other.ipsecFlags) return false
        if (this.authipMMPolicyKey != other.authipMMPolicyKey) return false
        if (this.authipQMPolicyKey != other.authipQMPolicyKey) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.userNameStringLen != other.userNameStringLen) return false
        if (this.domainNameStringLen != other.domainNameStringLen) return false
        if (this.passwordStringLen != other.passwordStringLen) return false
        if (!this.allStrings.contentEquals(other.allStrings)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityProtocol.hashCode()
        result = 31 * result + this.securityFlags.hashCode()
        result = 31 * result + this.ipsecFlags.hashCode()
        result = 31 * result + this.authipMMPolicyKey.hashCode()
        result = 31 * result + this.authipQMPolicyKey.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.userNameStringLen.hashCode()
        result = 31 * result + this.domainNameStringLen.hashCode()
        result = 31 * result + this.passwordStringLen.hashCode()
        result = 31 * result + this.allStrings.contentHashCode()
        return result
    }
}

public class SockNotifyRegistration internal constructor(
    public var socket: Socket,
    completionKeyCtorArg: MutPtr<CVoid>,
    public var eventFilter: UShort,
    public var operation: UByte,
    public var triggerFlags: UByte,
    public var registrationResult: UInt,
) {
    public var completionKey: MutPtr<CVoid> = completionKeyCtorArg
        internal set

    public constructor() : this(
        socket = 0uL,
        completionKeyCtorArg = MutPtr(0L),
        eventFilter = 0u,
        operation = 0u,
        triggerFlags = 0u,
        registrationResult = 0u,
    )

    public operator fun component1(): Socket = this.socket

    public operator fun component2(): MutPtr<CVoid> = this.completionKey

    public operator fun component3(): UShort = this.eventFilter

    public operator fun component4(): UByte = this.operation

    public operator fun component5(): UByte = this.triggerFlags

    public operator fun component6(): UInt = this.registrationResult

    public fun copy(socket: Socket = this.socket, completionKey: MutPtr<CVoid> = this.completionKey, eventFilter: UShort = this.eventFilter, operation: UByte = this.operation, triggerFlags: UByte = this.triggerFlags, registrationResult: UInt = this.registrationResult): SockNotifyRegistration = SockNotifyRegistration(socket = socket, completionKeyCtorArg = completionKey, eventFilter = eventFilter, operation = operation, triggerFlags = triggerFlags, registrationResult = registrationResult)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockNotifyRegistration) return false
        if (this.socket != other.socket) return false
        if (this.completionKey != other.completionKey) return false
        if (this.eventFilter != other.eventFilter) return false
        if (this.operation != other.operation) return false
        if (this.triggerFlags != other.triggerFlags) return false
        if (this.registrationResult != other.registrationResult) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.socket.hashCode()
        result = 31 * result + this.completionKey.hashCode()
        result = 31 * result + this.eventFilter.hashCode()
        result = 31 * result + this.operation.hashCode()
        result = 31 * result + this.triggerFlags.hashCode()
        result = 31 * result + this.registrationResult.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockNotifyRegistration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockNotifyRegistration> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SockNotifyRegistration =
                    SockNotifyRegistration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: SockNotifyRegistration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.socket)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.completionKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.eventFilter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.operation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.triggerFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.registrationResult)
                }
            }

        public operator fun invoke(
            socket: Socket = 0uL,
            completionKey: MutPtr<CVoid> = MutPtr(0L),
            eventFilter: UShort = 0u,
            operation: UByte = 0u,
            triggerFlags: UByte = 0u,
            registrationResult: UInt = 0u,
        ): SockNotifyRegistration =
            SockNotifyRegistration(
                socket = socket,
                completionKeyCtorArg = completionKey,
                eventFilter = eventFilter,
                operation = operation,
                triggerFlags = triggerFlags,
                registrationResult = registrationResult,
            )
    }
}

public data class TcpAckFrequencyParameters(
    public var tcpDelayedAckFrequency: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpAckFrequencyParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpAckFrequencyParameters> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcpAckFrequencyParameters =
                    TcpAckFrequencyParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcpAckFrequencyParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.tcpDelayedAckFrequency)
                }
            }
    }
}

public data class TcpHdr(
    public var thSport: UShort = 0u,
    public var thDport: UShort = 0u,
    public var thSeq: UInt = 0u,
    public var thAck: UInt = 0u,
    public var bitfield: UByte = 0u,
    public var thFlags: UByte = 0u,
    public var thWin: UShort = 0u,
    public var thSum: UShort = 0u,
    public var thUrp: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpHdr> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcpHdr =
                    TcpHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: TcpHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.thSport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.thDport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.thSeq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.thAck)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.thFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.thWin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.thSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.thUrp)
                }
            }
    }
}

public data class TcpIcwParameters(
    public var level: TcpIcwLevel = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpIcwParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpIcwParameters> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TcpIcwParameters =
                    TcpIcwParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcpIcwParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.level)
                }
            }
    }
}

public class TcpInfoV0(
    public var state: Tcpstate = 0,
    public var mss: UInt = 0u,
    public var connectionTimeMs: ULong = 0uL,
    public var timestampsEnabled: Boolean = false,
    public var rttUs: UInt = 0u,
    public var minRttUs: UInt = 0u,
    public var bytesInFlight: UInt = 0u,
    public var cwnd: UInt = 0u,
    public var sndWnd: UInt = 0u,
    public var rcvWnd: UInt = 0u,
    public var rcvBuf: UInt = 0u,
    public var bytesOut: ULong = 0uL,
    public var bytesIn: ULong = 0uL,
    public var bytesReordered: UInt = 0u,
    public var bytesRetrans: UInt = 0u,
    public var fastRetrans: UInt = 0u,
    public var dupAcksIn: UInt = 0u,
    public var timeoutEpisodes: UInt = 0u,
    public var synRetrans: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfoV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfoV0> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TcpInfoV0 =
                    TcpInfoV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 84L),
                    )
                override fun writeNative(addr: Long, value: TcpInfoV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.connectionTimeMs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.timestampsEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.rttUs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.minRttUs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.bytesInFlight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.sndWnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.rcvWnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.rcvBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.bytesOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.bytesIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.bytesReordered)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.bytesRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.fastRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dupAcksIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.timeoutEpisodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 84L, value.synRetrans)
                }
            }
    }
}

public class TcpInfoV1(
    public var state: Tcpstate = 0,
    public var mss: UInt = 0u,
    public var connectionTimeMs: ULong = 0uL,
    public var timestampsEnabled: Boolean = false,
    public var rttUs: UInt = 0u,
    public var minRttUs: UInt = 0u,
    public var bytesInFlight: UInt = 0u,
    public var cwnd: UInt = 0u,
    public var sndWnd: UInt = 0u,
    public var rcvWnd: UInt = 0u,
    public var rcvBuf: UInt = 0u,
    public var bytesOut: ULong = 0uL,
    public var bytesIn: ULong = 0uL,
    public var bytesReordered: UInt = 0u,
    public var bytesRetrans: UInt = 0u,
    public var fastRetrans: UInt = 0u,
    public var dupAcksIn: UInt = 0u,
    public var timeoutEpisodes: UInt = 0u,
    public var synRetrans: UByte = 0u,
    public var sndLimTransRwin: UInt = 0u,
    public var sndLimTimeRwin: UInt = 0u,
    public var sndLimBytesRwin: ULong = 0uL,
    public var sndLimTransCwnd: UInt = 0u,
    public var sndLimTimeCwnd: UInt = 0u,
    public var sndLimBytesCwnd: ULong = 0uL,
    public var sndLimTransSnd: UInt = 0u,
    public var sndLimTimeSnd: UInt = 0u,
    public var sndLimBytesSnd: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfoV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfoV1> {
                override val sizeBytes: Long = 136L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TcpInfoV1 =
                    TcpInfoV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: TcpInfoV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.connectionTimeMs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.timestampsEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.rttUs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.minRttUs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.bytesInFlight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.sndWnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.rcvWnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.rcvBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.bytesOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.bytesIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.bytesReordered)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.bytesRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.fastRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dupAcksIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.timeoutEpisodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 84L, value.synRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.sndLimTransRwin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.sndLimTimeRwin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.sndLimBytesRwin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.sndLimTransCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.sndLimTimeCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.sndLimBytesCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.sndLimTransSnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.sndLimTimeSnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.sndLimBytesSnd)
                }
            }
    }
}

public data class TcpInitialRtoParameters(
    public var rtt: UShort = 0u,
    public var maxSynRetransmissions: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInitialRtoParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInitialRtoParameters> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): TcpInitialRtoParameters =
                    TcpInitialRtoParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: TcpInitialRtoParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.rtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.maxSynRetransmissions)
                }
            }
    }
}

public data class TcpOptFastopen(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
    public var cookie: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpOptFastopen) return false
        if (this.kind != other.kind) return false
        if (this.length != other.length) return false
        if (!this.cookie.contentEquals(other.cookie)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.kind.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cookie.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptFastopen> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptFastopen> {
                override val sizeBytes: Long = 3L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcpOptFastopen =
                    TcpOptFastopen(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: TcpOptFastopen) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.kind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.cookie)
                }
            }
    }
}

public data class TcpOptMss(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
    public var mss: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptMss> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptMss> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcpOptMss =
                    TcpOptMss(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: TcpOptMss) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.kind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.mss)
                }
            }
    }
}

public data class TcpOptSack(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
    public var block: List<TcpOptSack0> = List(1) { TcpOptSack0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptSack> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptSack> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcpOptSack =
                    TcpOptSack(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(TcpOptSack0.typeLayout(), (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: TcpOptSack) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.kind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(TcpOptSack0.typeLayout(), (1).toInt())
                    ).writeNative(addr + 2L, value.block)
                }
            }
    }
}

public data class TcpOptSack0(
    public var left: UInt = 0u,
    public var right: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptSack0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptSack0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcpOptSack0 =
                    TcpOptSack0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TcpOptSack0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.left)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.right)
                }
            }
    }
}

public data class TcpOptSackPermitted(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptSackPermitted> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptSackPermitted> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcpOptSackPermitted =
                    TcpOptSackPermitted(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: TcpOptSackPermitted) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.kind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                }
            }
    }
}

public data class TcpOptTs(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
    public var value: UInt = 0u,
    public var ecR: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptTs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptTs> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcpOptTs =
                    TcpOptTs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: TcpOptTs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.kind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 6L, value.ecR)
                }
            }
    }
}

public data class TcpOptUnknown(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptUnknown> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptUnknown> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcpOptUnknown =
                    TcpOptUnknown(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: TcpOptUnknown) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.kind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                }
            }
    }
}

public data class TcpOptWs(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
    public var shiftCnt: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptWs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpOptWs> {
                override val sizeBytes: Long = 3L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcpOptWs =
                    TcpOptWs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: TcpOptWs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.kind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.shiftCnt)
                }
            }
    }
}

public data class TimestampingConfig(
    public var flags: UInt = 0u,
    public var txTimestampsBuffered: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimestampingConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimestampingConfig> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TimestampingConfig =
                    TimestampingConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TimestampingConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.txTimestampsBuffered)
                }
            }
    }
}

public data class Timeval(
    public var tvSec: Int = 0,
    public var tvUsec: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Timeval =
                    Timeval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Timeval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tvUsec)
                }
            }
    }
}

public class TransmitFileBuffers internal constructor(
    headCtorArg: MutPtr<CVoid>,
    public var headLength: UInt,
    tailCtorArg: MutPtr<CVoid>,
    public var tailLength: UInt,
) {
    public var head: MutPtr<CVoid> = headCtorArg
        internal set

    public var tail: MutPtr<CVoid> = tailCtorArg
        internal set

    public constructor() : this(
        headCtorArg = MutPtr(0L),
        headLength = 0u,
        tailCtorArg = MutPtr(0L),
        tailLength = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.head

    public operator fun component2(): UInt = this.headLength

    public operator fun component3(): MutPtr<CVoid> = this.tail

    public operator fun component4(): UInt = this.tailLength

    public fun copy(head: MutPtr<CVoid> = this.head, headLength: UInt = this.headLength, tail: MutPtr<CVoid> = this.tail, tailLength: UInt = this.tailLength): TransmitFileBuffers = TransmitFileBuffers(headCtorArg = head, headLength = headLength, tailCtorArg = tail, tailLength = tailLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TransmitFileBuffers) return false
        if (this.head != other.head) return false
        if (this.headLength != other.headLength) return false
        if (this.tail != other.tail) return false
        if (this.tailLength != other.tailLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.head.hashCode()
        result = 31 * result + this.headLength.hashCode()
        result = 31 * result + this.tail.hashCode()
        result = 31 * result + this.tailLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransmitFileBuffers> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransmitFileBuffers> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TransmitFileBuffers =
                    TransmitFileBuffers(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TransmitFileBuffers) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.head)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.headLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.tail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.tailLength)
                }
            }

        public operator fun invoke(
            head: MutPtr<CVoid> = MutPtr(0L),
            headLength: UInt = 0u,
            tail: MutPtr<CVoid> = MutPtr(0L),
            tailLength: UInt = 0u,
        ): TransmitFileBuffers =
            TransmitFileBuffers(
                headCtorArg = head,
                headLength = headLength,
                tailCtorArg = tail,
                tailLength = tailLength,
            )
    }
}

public data class TransmitPacketsElement(
    public var dwElFlags: UInt = 0u,
    public var cLength: UInt = 0u,
    public var anonymous: TransmitPacketsElement0 = TransmitPacketsElement0(),
)

public class TransmitPacketsElement0 internal constructor(
    public var anonymous: TransmitPacketsElement00,
    pBufferCtorArg: MutPtr<CVoid>,
) {
    public var pBuffer: MutPtr<CVoid> = pBufferCtorArg
        internal set

    public constructor() : this(
        anonymous = TransmitPacketsElement00(),
        pBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): TransmitPacketsElement00 = this.anonymous

    public operator fun component2(): MutPtr<CVoid> = this.pBuffer

    public fun copy(anonymous: TransmitPacketsElement00 = this.anonymous, pBuffer: MutPtr<CVoid> = this.pBuffer): TransmitPacketsElement0 = TransmitPacketsElement0(anonymous = anonymous, pBufferCtorArg = pBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TransmitPacketsElement0) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pBuffer != other.pBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.pBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: TransmitPacketsElement00 = TransmitPacketsElement00(),
            pBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): TransmitPacketsElement0 =
            TransmitPacketsElement0(
                anonymous = anonymous,
                pBufferCtorArg = pBuffer,
            )
    }
}

public class TransmitPacketsElement00 internal constructor(
    public var nFileOffset: Long,
    hFileCtorArg: Handle,
) {
    public var hFile: Handle = hFileCtorArg
        internal set

    public constructor() : this(
        nFileOffset = 0L,
        hFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.nFileOffset

    public operator fun component2(): Handle = this.hFile

    public fun copy(nFileOffset: Long = this.nFileOffset, hFile: Handle = this.hFile): TransmitPacketsElement00 = TransmitPacketsElement00(nFileOffset = nFileOffset, hFileCtorArg = hFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TransmitPacketsElement00) return false
        if (this.nFileOffset != other.nFileOffset) return false
        if (this.hFile != other.hFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nFileOffset.hashCode()
        result = 31 * result + this.hFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nFileOffset: Long = 0L,
            hFile: Handle = MutPtr(0L),
        ): TransmitPacketsElement00 =
            TransmitPacketsElement00(
                nFileOffset = nFileOffset,
                hFileCtorArg = hFile,
            )
    }
}

public data class TransportSettingId(
    public var guid: Guid = Guid(),
)

public data class VlanTag(
    public var anonymous: VlanTag0 = VlanTag0(),
    public var type: UShort = 0u,
)

public data class VlanTag0(
    public var tag: UShort = 0u,
    public var anonymous: VlanTag00 = VlanTag00(),
)

public data class VlanTag00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VlanTag00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VlanTag00> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): VlanTag00 =
                    VlanTag00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VlanTag00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WceDevicelist(
    public var numDevice: UInt = 0u,
    public var device: List<WceIrdaDeviceInfo> = List(1) { WceIrdaDeviceInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WceDevicelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WceDevicelist> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WceDevicelist =
                    WceDevicelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(WceIrdaDeviceInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WceDevicelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numDevice)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(WceIrdaDeviceInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.device)
                }
            }
    }
}

public data class WceIrdaDeviceInfo(
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaDeviceName: ByteArray = ByteArray(22),
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WceIrdaDeviceInfo) return false
        if (!this.irdaDeviceID.contentEquals(other.irdaDeviceID)) return false
        if (!this.irdaDeviceName.contentEquals(other.irdaDeviceName)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaDeviceID.contentHashCode()
        result = 31 * result + this.irdaDeviceName.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WceIrdaDeviceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WceIrdaDeviceInfo> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WceIrdaDeviceInfo =
                    WceIrdaDeviceInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (22).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 26L),
                    )
                override fun writeNative(addr: Long, value: WceIrdaDeviceInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.irdaDeviceID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (22).toInt())
                    ).writeNative(addr + 4L, value.irdaDeviceName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 26L, value.reserved)
                }
            }
    }
}

public data class WindowsDevicelist(
    public var numDevice: UInt = 0u,
    public var device: List<WindowsIrdaDeviceInfo> = List(1) { WindowsIrdaDeviceInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsDevicelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsDevicelist> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WindowsDevicelist =
                    WindowsDevicelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(WindowsIrdaDeviceInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WindowsDevicelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numDevice)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(WindowsIrdaDeviceInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.device)
                }
            }
    }
}

public data class WindowsIasQuery(
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaClassName: ByteArray = ByteArray(64),
    public var irdaAttribName: ByteArray = ByteArray(256),
    public var irdaAttribType: UInt = 0u,
    public var irdaAttribute: WindowsIasQuery0 = WindowsIasQuery0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasQuery) return false
        if (!this.irdaDeviceID.contentEquals(other.irdaDeviceID)) return false
        if (!this.irdaClassName.contentEquals(other.irdaClassName)) return false
        if (!this.irdaAttribName.contentEquals(other.irdaAttribName)) return false
        if (this.irdaAttribType != other.irdaAttribType) return false
        if (this.irdaAttribute != other.irdaAttribute) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaDeviceID.contentHashCode()
        result = 31 * result + this.irdaClassName.contentHashCode()
        result = 31 * result + this.irdaAttribName.contentHashCode()
        result = 31 * result + this.irdaAttribType.hashCode()
        result = 31 * result + this.irdaAttribute.hashCode()
        return result
    }
}

public data class WindowsIasQuery0(
    public var irdaAttribInt: Int = 0,
    public var irdaAttribOctetSeq: WindowsIasQuery00 = WindowsIasQuery00(),
    public var irdaAttribUsrStr: WindowsIasQuery01 = WindowsIasQuery01(),
)

public data class WindowsIasQuery00(
    public var len: UInt = 0u,
    public var octetSeq: UByteArray = UByteArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasQuery00) return false
        if (this.len != other.len) return false
        if (!this.octetSeq.contentEquals(other.octetSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.octetSeq.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsIasQuery00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsIasQuery00> {
                override val sizeBytes: Long = 1028L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WindowsIasQuery00 =
                    WindowsIasQuery00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1024).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WindowsIasQuery00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.len)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1024).toInt())
                    ).writeNative(addr + 4L, value.octetSeq)
                }
            }
    }
}

public data class WindowsIasQuery01(
    public var len: UInt = 0u,
    public var charSet: UInt = 0u,
    public var usrStr: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasQuery01) return false
        if (this.len != other.len) return false
        if (this.charSet != other.charSet) return false
        if (!this.usrStr.contentEquals(other.usrStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.charSet.hashCode()
        result = 31 * result + this.usrStr.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsIasQuery01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsIasQuery01> {
                override val sizeBytes: Long = 264L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WindowsIasQuery01 =
                    WindowsIasQuery01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WindowsIasQuery01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.charSet)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 8L, value.usrStr)
                }
            }
    }
}

public data class WindowsIasSet(
    public var irdaClassName: ByteArray = ByteArray(64),
    public var irdaAttribName: ByteArray = ByteArray(256),
    public var irdaAttribType: UInt = 0u,
    public var irdaAttribute: WindowsIasSet0 = WindowsIasSet0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasSet) return false
        if (!this.irdaClassName.contentEquals(other.irdaClassName)) return false
        if (!this.irdaAttribName.contentEquals(other.irdaAttribName)) return false
        if (this.irdaAttribType != other.irdaAttribType) return false
        if (this.irdaAttribute != other.irdaAttribute) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaClassName.contentHashCode()
        result = 31 * result + this.irdaAttribName.contentHashCode()
        result = 31 * result + this.irdaAttribType.hashCode()
        result = 31 * result + this.irdaAttribute.hashCode()
        return result
    }
}

public data class WindowsIasSet0(
    public var irdaAttribInt: Int = 0,
    public var irdaAttribOctetSeq: WindowsIasSet00 = WindowsIasSet00(),
    public var irdaAttribUsrStr: WindowsIasSet01 = WindowsIasSet01(),
)

public data class WindowsIasSet00(
    public var len: UShort = 0u,
    public var octetSeq: UByteArray = UByteArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasSet00) return false
        if (this.len != other.len) return false
        if (!this.octetSeq.contentEquals(other.octetSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.octetSeq.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsIasSet00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsIasSet00> {
                override val sizeBytes: Long = 1026L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): WindowsIasSet00 =
                    WindowsIasSet00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1024).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WindowsIasSet00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.len)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1024).toInt())
                    ).writeNative(addr + 2L, value.octetSeq)
                }
            }
    }
}

public data class WindowsIasSet01(
    public var len: UByte = 0u,
    public var charSet: UByte = 0u,
    public var usrStr: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasSet01) return false
        if (this.len != other.len) return false
        if (this.charSet != other.charSet) return false
        if (!this.usrStr.contentEquals(other.usrStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.charSet.hashCode()
        result = 31 * result + this.usrStr.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsIasSet01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsIasSet01> {
                override val sizeBytes: Long = 258L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WindowsIasSet01 =
                    WindowsIasSet01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WindowsIasSet01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.charSet)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 2L, value.usrStr)
                }
            }
    }
}

public data class WindowsIrdaDeviceInfo(
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaDeviceName: ByteArray = ByteArray(22),
    public var irdaDeviceHints1: UByte = 0u,
    public var irdaDeviceHints2: UByte = 0u,
    public var irdaCharSet: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIrdaDeviceInfo) return false
        if (!this.irdaDeviceID.contentEquals(other.irdaDeviceID)) return false
        if (!this.irdaDeviceName.contentEquals(other.irdaDeviceName)) return false
        if (this.irdaDeviceHints1 != other.irdaDeviceHints1) return false
        if (this.irdaDeviceHints2 != other.irdaDeviceHints2) return false
        if (this.irdaCharSet != other.irdaCharSet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaDeviceID.contentHashCode()
        result = 31 * result + this.irdaDeviceName.contentHashCode()
        result = 31 * result + this.irdaDeviceHints1.hashCode()
        result = 31 * result + this.irdaDeviceHints2.hashCode()
        result = 31 * result + this.irdaCharSet.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsIrdaDeviceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WindowsIrdaDeviceInfo> {
                override val sizeBytes: Long = 29L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WindowsIrdaDeviceInfo =
                    WindowsIrdaDeviceInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (22).toInt())
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 27L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: WindowsIrdaDeviceInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.irdaDeviceID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (22).toInt())
                    ).writeNative(addr + 4L, value.irdaDeviceName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 26L, value.irdaDeviceHints1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 27L, value.irdaDeviceHints2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 28L, value.irdaCharSet)
                }
            }
    }
}

public class Wsabuf internal constructor(
    public var len: UInt,
    bufCtorArg: Pstr,
) {
    public var buf: Pstr = bufCtorArg
        internal set

    public constructor() : this(
        len = 0u,
        bufCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.len

    public operator fun component2(): Pstr = this.buf

    public fun copy(len: UInt = this.len, buf: Pstr = this.buf): Wsabuf = Wsabuf(len = len, bufCtorArg = buf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsabuf) return false
        if (this.len != other.len) return false
        if (this.buf != other.buf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.buf.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            len: UInt = 0u,
            buf: Pstr = MutPtr(0L),
        ): Wsabuf =
            Wsabuf(
                len = len,
                bufCtorArg = buf,
            )
    }
}

public data class Wsacompletion(
    public var type: Wsacompletiontype = 0,
    public var parameters: Wsacompletion0 = Wsacompletion0(),
)

public data class Wsacompletion0(
    public var windowMessage: Wsacompletion00 = Wsacompletion00(),
    public var event: Wsacompletion01 = Wsacompletion01(),
    public var apc: Wsacompletion02 = Wsacompletion02(),
    public var port: Wsacompletion03 = Wsacompletion03(),
)

public class Wsacompletion02 internal constructor(
    lpOverlappedCtorArg: MutPtr<Overlapped>,
    public var lpfnCompletionProc: LpwsaoverlappedCompletionRoutine,
) {
    public var lpOverlapped: MutPtr<Overlapped> = lpOverlappedCtorArg
        internal set

    public constructor() : this(
        lpOverlappedCtorArg = MutPtr(0L),
        lpfnCompletionProc = null,
    )

    public operator fun component1(): MutPtr<Overlapped> = this.lpOverlapped

    public operator fun component2(): LpwsaoverlappedCompletionRoutine = this.lpfnCompletionProc

    public fun copy(lpOverlapped: MutPtr<Overlapped> = this.lpOverlapped, lpfnCompletionProc: LpwsaoverlappedCompletionRoutine = this.lpfnCompletionProc): Wsacompletion02 = Wsacompletion02(lpOverlappedCtorArg = lpOverlapped, lpfnCompletionProc = lpfnCompletionProc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsacompletion02) return false
        if (this.lpOverlapped != other.lpOverlapped) return false
        if (this.lpfnCompletionProc != other.lpfnCompletionProc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpOverlapped.hashCode()
        result = 31 * result + this.lpfnCompletionProc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpOverlapped: MutPtr<Overlapped> = MutPtr(0L),
            lpfnCompletionProc: LpwsaoverlappedCompletionRoutine = null,
        ): Wsacompletion02 =
            Wsacompletion02(
                lpOverlappedCtorArg = lpOverlapped,
                lpfnCompletionProc = lpfnCompletionProc,
            )
    }
}

public class Wsacompletion01 internal constructor(
    lpOverlappedCtorArg: MutPtr<Overlapped>,
) {
    public var lpOverlapped: MutPtr<Overlapped> = lpOverlappedCtorArg
        internal set

    public constructor() : this(
        lpOverlappedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Overlapped> = this.lpOverlapped

    public fun copy(lpOverlapped: MutPtr<Overlapped> = this.lpOverlapped): Wsacompletion01 = Wsacompletion01(lpOverlappedCtorArg = lpOverlapped)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsacompletion01) return false
        if (this.lpOverlapped != other.lpOverlapped) return false
        return true
    }

    override fun hashCode(): Int = this.lpOverlapped.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsacompletion01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsacompletion01> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Wsacompletion01 =
                    Wsacompletion01(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Overlapped>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Wsacompletion01) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Overlapped>(64)
                    ).writeNative(addr, value.lpOverlapped)
                }
            }

        public operator fun invoke(
            lpOverlapped: MutPtr<Overlapped> = MutPtr(0L),
        ): Wsacompletion01 =
            Wsacompletion01(
                lpOverlappedCtorArg = lpOverlapped,
            )
    }
}

public class Wsacompletion03 internal constructor(
    lpOverlappedCtorArg: MutPtr<Overlapped>,
    hPortCtorArg: Handle,
    public var key: Int,
) {
    public var lpOverlapped: MutPtr<Overlapped> = lpOverlappedCtorArg
        internal set

    public var hPort: Handle = hPortCtorArg
        internal set

    public constructor() : this(
        lpOverlappedCtorArg = MutPtr(0L),
        hPortCtorArg = MutPtr(0L),
        key = 0,
    )

    public operator fun component1(): MutPtr<Overlapped> = this.lpOverlapped

    public operator fun component2(): Handle = this.hPort

    public operator fun component3(): Int = this.key

    public fun copy(lpOverlapped: MutPtr<Overlapped> = this.lpOverlapped, hPort: Handle = this.hPort, key: Int = this.key): Wsacompletion03 = Wsacompletion03(lpOverlappedCtorArg = lpOverlapped, hPortCtorArg = hPort, key = key)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsacompletion03) return false
        if (this.lpOverlapped != other.lpOverlapped) return false
        if (this.hPort != other.hPort) return false
        if (this.key != other.key) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpOverlapped.hashCode()
        result = 31 * result + this.hPort.hashCode()
        result = 31 * result + this.key.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpOverlapped: MutPtr<Overlapped> = MutPtr(0L),
            hPort: Handle = MutPtr(0L),
            key: Int = 0,
        ): Wsacompletion03 =
            Wsacompletion03(
                lpOverlappedCtorArg = lpOverlapped,
                hPortCtorArg = hPort,
                key = key,
            )
    }
}

public class Wsacompletion00 internal constructor(
    hWndCtorArg: Hwnd,
    public var uMsg: UInt,
    public var context: Wparam,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public constructor() : this(
        hWndCtorArg = MutPtr(0L),
        uMsg = 0u,
        context = 0uL,
    )

    public operator fun component1(): Hwnd = this.hWnd

    public operator fun component2(): UInt = this.uMsg

    public operator fun component3(): Wparam = this.context

    public fun copy(hWnd: Hwnd = this.hWnd, uMsg: UInt = this.uMsg, context: Wparam = this.context): Wsacompletion00 = Wsacompletion00(hWndCtorArg = hWnd, uMsg = uMsg, context = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsacompletion00) return false
        if (this.hWnd != other.hWnd) return false
        if (this.uMsg != other.uMsg) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.uMsg.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hWnd: Hwnd = MutPtr(0L),
            uMsg: UInt = 0u,
            context: Wparam = 0uL,
        ): Wsacompletion00 =
            Wsacompletion00(
                hWndCtorArg = hWnd,
                uMsg = uMsg,
                context = context,
            )
    }
}

public class Wsadata internal constructor(
    public var wVersion: UShort,
    public var wHighVersion: UShort,
    public var iMaxSockets: UShort,
    public var iMaxUdpDg: UShort,
    lpVendorInfoCtorArg: Pstr,
    public var szDescription: ByteArray,
    public var szSystemStatus: ByteArray,
) {
    public var lpVendorInfo: Pstr = lpVendorInfoCtorArg
        internal set

    public constructor() : this(
        wVersion = 0u,
        wHighVersion = 0u,
        iMaxSockets = 0u,
        iMaxUdpDg = 0u,
        lpVendorInfoCtorArg = MutPtr(0L),
        szDescription = ByteArray(257),
        szSystemStatus = ByteArray(129),
    )

    public operator fun component1(): UShort = this.wVersion

    public operator fun component2(): UShort = this.wHighVersion

    public operator fun component3(): UShort = this.iMaxSockets

    public operator fun component4(): UShort = this.iMaxUdpDg

    public operator fun component5(): Pstr = this.lpVendorInfo

    public operator fun component6(): ByteArray = this.szDescription

    public operator fun component7(): ByteArray = this.szSystemStatus

    public fun copy(wVersion: UShort = this.wVersion, wHighVersion: UShort = this.wHighVersion, iMaxSockets: UShort = this.iMaxSockets, iMaxUdpDg: UShort = this.iMaxUdpDg, lpVendorInfo: Pstr = this.lpVendorInfo, szDescription: ByteArray = this.szDescription, szSystemStatus: ByteArray = this.szSystemStatus): Wsadata = Wsadata(wVersion = wVersion, wHighVersion = wHighVersion, iMaxSockets = iMaxSockets, iMaxUdpDg = iMaxUdpDg, lpVendorInfoCtorArg = lpVendorInfo, szDescription = szDescription, szSystemStatus = szSystemStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsadata) return false
        if (this.wVersion != other.wVersion) return false
        if (this.wHighVersion != other.wHighVersion) return false
        if (this.iMaxSockets != other.iMaxSockets) return false
        if (this.iMaxUdpDg != other.iMaxUdpDg) return false
        if (this.lpVendorInfo != other.lpVendorInfo) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szSystemStatus.contentEquals(other.szSystemStatus)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wVersion.hashCode()
        result = 31 * result + this.wHighVersion.hashCode()
        result = 31 * result + this.iMaxSockets.hashCode()
        result = 31 * result + this.iMaxUdpDg.hashCode()
        result = 31 * result + this.lpVendorInfo.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szSystemStatus.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wVersion: UShort = 0u,
            wHighVersion: UShort = 0u,
            iMaxSockets: UShort = 0u,
            iMaxUdpDg: UShort = 0u,
            lpVendorInfo: Pstr = MutPtr(0L),
            szDescription: ByteArray = ByteArray(257),
            szSystemStatus: ByteArray = ByteArray(129),
        ): Wsadata =
            Wsadata(
                wVersion = wVersion,
                wHighVersion = wHighVersion,
                iMaxSockets = iMaxSockets,
                iMaxUdpDg = iMaxUdpDg,
                lpVendorInfoCtorArg = lpVendorInfo,
                szDescription = szDescription,
                szSystemStatus = szSystemStatus,
            )
    }
}

public class Wsamsg internal constructor(
    nameCtorArg: MutPtr<Sockaddr>,
    public var namelen: Int,
    lpBuffersCtorArg: MutPtr<Wsabuf>,
    public var dwBufferCount: UInt,
    public var control: Wsabuf,
    public var dwFlags: UInt,
) {
    public var name: MutPtr<Sockaddr> = nameCtorArg
        internal set

    public var lpBuffers: MutPtr<Wsabuf> = lpBuffersCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = MutPtr(0L),
        namelen = 0,
        lpBuffersCtorArg = MutPtr(0L),
        dwBufferCount = 0u,
        control = Wsabuf(),
        dwFlags = 0u,
    )

    public operator fun component1(): MutPtr<Sockaddr> = this.name

    public operator fun component2(): Int = this.namelen

    public operator fun component3(): MutPtr<Wsabuf> = this.lpBuffers

    public operator fun component4(): UInt = this.dwBufferCount

    public operator fun component5(): Wsabuf = this.control

    public operator fun component6(): UInt = this.dwFlags

    public fun copy(name: MutPtr<Sockaddr> = this.name, namelen: Int = this.namelen, lpBuffers: MutPtr<Wsabuf> = this.lpBuffers, dwBufferCount: UInt = this.dwBufferCount, control: Wsabuf = this.control, dwFlags: UInt = this.dwFlags): Wsamsg = Wsamsg(nameCtorArg = name, namelen = namelen, lpBuffersCtorArg = lpBuffers, dwBufferCount = dwBufferCount, control = control, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsamsg) return false
        if (this.name != other.name) return false
        if (this.namelen != other.namelen) return false
        if (this.lpBuffers != other.lpBuffers) return false
        if (this.dwBufferCount != other.dwBufferCount) return false
        if (this.control != other.control) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.namelen.hashCode()
        result = 31 * result + this.lpBuffers.hashCode()
        result = 31 * result + this.dwBufferCount.hashCode()
        result = 31 * result + this.control.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: MutPtr<Sockaddr> = MutPtr(0L),
            namelen: Int = 0,
            lpBuffers: MutPtr<Wsabuf> = MutPtr(0L),
            dwBufferCount: UInt = 0u,
            control: Wsabuf = Wsabuf(),
            dwFlags: UInt = 0u,
        ): Wsamsg =
            Wsamsg(
                nameCtorArg = name,
                namelen = namelen,
                lpBuffersCtorArg = lpBuffers,
                dwBufferCount = dwBufferCount,
                control = control,
                dwFlags = dwFlags,
            )
    }
}

public class WsanamespaceInfoa internal constructor(
    public var nSProviderId: Guid,
    public var dwNameSpace: UInt,
    public var fActive: Bool,
    public var dwVersion: UInt,
    lpszIdentifierCtorArg: Pstr,
) {
    public var lpszIdentifier: Pstr = lpszIdentifierCtorArg
        internal set

    public constructor() : this(
        nSProviderId = Guid(),
        dwNameSpace = 0u,
        fActive = 0,
        dwVersion = 0u,
        lpszIdentifierCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.nSProviderId

    public operator fun component2(): UInt = this.dwNameSpace

    public operator fun component3(): Bool = this.fActive

    public operator fun component4(): UInt = this.dwVersion

    public operator fun component5(): Pstr = this.lpszIdentifier

    public fun copy(nSProviderId: Guid = this.nSProviderId, dwNameSpace: UInt = this.dwNameSpace, fActive: Bool = this.fActive, dwVersion: UInt = this.dwVersion, lpszIdentifier: Pstr = this.lpszIdentifier): WsanamespaceInfoa = WsanamespaceInfoa(nSProviderId = nSProviderId, dwNameSpace = dwNameSpace, fActive = fActive, dwVersion = dwVersion, lpszIdentifierCtorArg = lpszIdentifier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsanamespaceInfoa) return false
        if (this.nSProviderId != other.nSProviderId) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.fActive != other.fActive) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpszIdentifier != other.lpszIdentifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nSProviderId.hashCode()
        result = 31 * result + this.dwNameSpace.hashCode()
        result = 31 * result + this.fActive.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.lpszIdentifier.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nSProviderId: Guid = Guid(),
            dwNameSpace: UInt = 0u,
            fActive: Bool = 0,
            dwVersion: UInt = 0u,
            lpszIdentifier: Pstr = MutPtr(0L),
        ): WsanamespaceInfoa =
            WsanamespaceInfoa(
                nSProviderId = nSProviderId,
                dwNameSpace = dwNameSpace,
                fActive = fActive,
                dwVersion = dwVersion,
                lpszIdentifierCtorArg = lpszIdentifier,
            )
    }
}

public class WsanamespaceInfoexa internal constructor(
    public var nSProviderId: Guid,
    public var dwNameSpace: UInt,
    public var fActive: Bool,
    public var dwVersion: UInt,
    lpszIdentifierCtorArg: Pstr,
    public var providerSpecific: Blob,
) {
    public var lpszIdentifier: Pstr = lpszIdentifierCtorArg
        internal set

    public constructor() : this(
        nSProviderId = Guid(),
        dwNameSpace = 0u,
        fActive = 0,
        dwVersion = 0u,
        lpszIdentifierCtorArg = MutPtr(0L),
        providerSpecific = Blob(),
    )

    public operator fun component1(): Guid = this.nSProviderId

    public operator fun component2(): UInt = this.dwNameSpace

    public operator fun component3(): Bool = this.fActive

    public operator fun component4(): UInt = this.dwVersion

    public operator fun component5(): Pstr = this.lpszIdentifier

    public operator fun component6(): Blob = this.providerSpecific

    public fun copy(nSProviderId: Guid = this.nSProviderId, dwNameSpace: UInt = this.dwNameSpace, fActive: Bool = this.fActive, dwVersion: UInt = this.dwVersion, lpszIdentifier: Pstr = this.lpszIdentifier, providerSpecific: Blob = this.providerSpecific): WsanamespaceInfoexa = WsanamespaceInfoexa(nSProviderId = nSProviderId, dwNameSpace = dwNameSpace, fActive = fActive, dwVersion = dwVersion, lpszIdentifierCtorArg = lpszIdentifier, providerSpecific = providerSpecific)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsanamespaceInfoexa) return false
        if (this.nSProviderId != other.nSProviderId) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.fActive != other.fActive) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpszIdentifier != other.lpszIdentifier) return false
        if (this.providerSpecific != other.providerSpecific) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nSProviderId.hashCode()
        result = 31 * result + this.dwNameSpace.hashCode()
        result = 31 * result + this.fActive.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.lpszIdentifier.hashCode()
        result = 31 * result + this.providerSpecific.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nSProviderId: Guid = Guid(),
            dwNameSpace: UInt = 0u,
            fActive: Bool = 0,
            dwVersion: UInt = 0u,
            lpszIdentifier: Pstr = MutPtr(0L),
            providerSpecific: Blob = Blob(),
        ): WsanamespaceInfoexa =
            WsanamespaceInfoexa(
                nSProviderId = nSProviderId,
                dwNameSpace = dwNameSpace,
                fActive = fActive,
                dwVersion = dwVersion,
                lpszIdentifierCtorArg = lpszIdentifier,
                providerSpecific = providerSpecific,
            )
    }
}

public class WsanamespaceInfoexw internal constructor(
    public var nSProviderId: Guid,
    public var dwNameSpace: UInt,
    public var fActive: Bool,
    public var dwVersion: UInt,
    lpszIdentifierCtorArg: Pwstr,
    public var providerSpecific: Blob,
) {
    public var lpszIdentifier: Pwstr = lpszIdentifierCtorArg
        internal set

    public constructor() : this(
        nSProviderId = Guid(),
        dwNameSpace = 0u,
        fActive = 0,
        dwVersion = 0u,
        lpszIdentifierCtorArg = MutPtr(0L),
        providerSpecific = Blob(),
    )

    public operator fun component1(): Guid = this.nSProviderId

    public operator fun component2(): UInt = this.dwNameSpace

    public operator fun component3(): Bool = this.fActive

    public operator fun component4(): UInt = this.dwVersion

    public operator fun component5(): Pwstr = this.lpszIdentifier

    public operator fun component6(): Blob = this.providerSpecific

    public fun copy(nSProviderId: Guid = this.nSProviderId, dwNameSpace: UInt = this.dwNameSpace, fActive: Bool = this.fActive, dwVersion: UInt = this.dwVersion, lpszIdentifier: Pwstr = this.lpszIdentifier, providerSpecific: Blob = this.providerSpecific): WsanamespaceInfoexw = WsanamespaceInfoexw(nSProviderId = nSProviderId, dwNameSpace = dwNameSpace, fActive = fActive, dwVersion = dwVersion, lpszIdentifierCtorArg = lpszIdentifier, providerSpecific = providerSpecific)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsanamespaceInfoexw) return false
        if (this.nSProviderId != other.nSProviderId) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.fActive != other.fActive) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpszIdentifier != other.lpszIdentifier) return false
        if (this.providerSpecific != other.providerSpecific) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nSProviderId.hashCode()
        result = 31 * result + this.dwNameSpace.hashCode()
        result = 31 * result + this.fActive.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.lpszIdentifier.hashCode()
        result = 31 * result + this.providerSpecific.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nSProviderId: Guid = Guid(),
            dwNameSpace: UInt = 0u,
            fActive: Bool = 0,
            dwVersion: UInt = 0u,
            lpszIdentifier: Pwstr = MutPtr(0L),
            providerSpecific: Blob = Blob(),
        ): WsanamespaceInfoexw =
            WsanamespaceInfoexw(
                nSProviderId = nSProviderId,
                dwNameSpace = dwNameSpace,
                fActive = fActive,
                dwVersion = dwVersion,
                lpszIdentifierCtorArg = lpszIdentifier,
                providerSpecific = providerSpecific,
            )
    }
}

public class WsanamespaceInfow internal constructor(
    public var nSProviderId: Guid,
    public var dwNameSpace: UInt,
    public var fActive: Bool,
    public var dwVersion: UInt,
    lpszIdentifierCtorArg: Pwstr,
) {
    public var lpszIdentifier: Pwstr = lpszIdentifierCtorArg
        internal set

    public constructor() : this(
        nSProviderId = Guid(),
        dwNameSpace = 0u,
        fActive = 0,
        dwVersion = 0u,
        lpszIdentifierCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.nSProviderId

    public operator fun component2(): UInt = this.dwNameSpace

    public operator fun component3(): Bool = this.fActive

    public operator fun component4(): UInt = this.dwVersion

    public operator fun component5(): Pwstr = this.lpszIdentifier

    public fun copy(nSProviderId: Guid = this.nSProviderId, dwNameSpace: UInt = this.dwNameSpace, fActive: Bool = this.fActive, dwVersion: UInt = this.dwVersion, lpszIdentifier: Pwstr = this.lpszIdentifier): WsanamespaceInfow = WsanamespaceInfow(nSProviderId = nSProviderId, dwNameSpace = dwNameSpace, fActive = fActive, dwVersion = dwVersion, lpszIdentifierCtorArg = lpszIdentifier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsanamespaceInfow) return false
        if (this.nSProviderId != other.nSProviderId) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.fActive != other.fActive) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpszIdentifier != other.lpszIdentifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nSProviderId.hashCode()
        result = 31 * result + this.dwNameSpace.hashCode()
        result = 31 * result + this.fActive.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.lpszIdentifier.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nSProviderId: Guid = Guid(),
            dwNameSpace: UInt = 0u,
            fActive: Bool = 0,
            dwVersion: UInt = 0u,
            lpszIdentifier: Pwstr = MutPtr(0L),
        ): WsanamespaceInfow =
            WsanamespaceInfow(
                nSProviderId = nSProviderId,
                dwNameSpace = dwNameSpace,
                fActive = fActive,
                dwVersion = dwVersion,
                lpszIdentifierCtorArg = lpszIdentifier,
            )
    }
}

public data class Wsanetworkevents(
    public var lNetworkEvents: Int = 0,
    public var iErrorCode: IntArray = IntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsanetworkevents) return false
        if (this.lNetworkEvents != other.lNetworkEvents) return false
        if (!this.iErrorCode.contentEquals(other.iErrorCode)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lNetworkEvents.hashCode()
        result = 31 * result + this.iErrorCode.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsanetworkevents> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsanetworkevents> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Wsanetworkevents =
                    Wsanetworkevents(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (10).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Wsanetworkevents) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lNetworkEvents)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (10).toInt())
                    ).writeNative(addr + 4L, value.iErrorCode)
                }
            }
    }
}

public class Wsansclassinfoa internal constructor(
    lpszNameCtorArg: Pstr,
    public var dwNameSpace: UInt,
    public var dwValueType: UInt,
    public var dwValueSize: UInt,
    lpValueCtorArg: MutPtr<CVoid>,
) {
    public var lpszName: Pstr = lpszNameCtorArg
        internal set

    public var lpValue: MutPtr<CVoid> = lpValueCtorArg
        internal set

    public constructor() : this(
        lpszNameCtorArg = MutPtr(0L),
        dwNameSpace = 0u,
        dwValueType = 0u,
        dwValueSize = 0u,
        lpValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.lpszName

    public operator fun component2(): UInt = this.dwNameSpace

    public operator fun component3(): UInt = this.dwValueType

    public operator fun component4(): UInt = this.dwValueSize

    public operator fun component5(): MutPtr<CVoid> = this.lpValue

    public fun copy(lpszName: Pstr = this.lpszName, dwNameSpace: UInt = this.dwNameSpace, dwValueType: UInt = this.dwValueType, dwValueSize: UInt = this.dwValueSize, lpValue: MutPtr<CVoid> = this.lpValue): Wsansclassinfoa = Wsansclassinfoa(lpszNameCtorArg = lpszName, dwNameSpace = dwNameSpace, dwValueType = dwValueType, dwValueSize = dwValueSize, lpValueCtorArg = lpValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsansclassinfoa) return false
        if (this.lpszName != other.lpszName) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.dwValueType != other.dwValueType) return false
        if (this.dwValueSize != other.dwValueSize) return false
        if (this.lpValue != other.lpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszName.hashCode()
        result = 31 * result + this.dwNameSpace.hashCode()
        result = 31 * result + this.dwValueType.hashCode()
        result = 31 * result + this.dwValueSize.hashCode()
        result = 31 * result + this.lpValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpszName: Pstr = MutPtr(0L),
            dwNameSpace: UInt = 0u,
            dwValueType: UInt = 0u,
            dwValueSize: UInt = 0u,
            lpValue: MutPtr<CVoid> = MutPtr(0L),
        ): Wsansclassinfoa =
            Wsansclassinfoa(
                lpszNameCtorArg = lpszName,
                dwNameSpace = dwNameSpace,
                dwValueType = dwValueType,
                dwValueSize = dwValueSize,
                lpValueCtorArg = lpValue,
            )
    }
}

public class Wsansclassinfow internal constructor(
    lpszNameCtorArg: Pwstr,
    public var dwNameSpace: UInt,
    public var dwValueType: UInt,
    public var dwValueSize: UInt,
    lpValueCtorArg: MutPtr<CVoid>,
) {
    public var lpszName: Pwstr = lpszNameCtorArg
        internal set

    public var lpValue: MutPtr<CVoid> = lpValueCtorArg
        internal set

    public constructor() : this(
        lpszNameCtorArg = MutPtr(0L),
        dwNameSpace = 0u,
        dwValueType = 0u,
        dwValueSize = 0u,
        lpValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lpszName

    public operator fun component2(): UInt = this.dwNameSpace

    public operator fun component3(): UInt = this.dwValueType

    public operator fun component4(): UInt = this.dwValueSize

    public operator fun component5(): MutPtr<CVoid> = this.lpValue

    public fun copy(lpszName: Pwstr = this.lpszName, dwNameSpace: UInt = this.dwNameSpace, dwValueType: UInt = this.dwValueType, dwValueSize: UInt = this.dwValueSize, lpValue: MutPtr<CVoid> = this.lpValue): Wsansclassinfow = Wsansclassinfow(lpszNameCtorArg = lpszName, dwNameSpace = dwNameSpace, dwValueType = dwValueType, dwValueSize = dwValueSize, lpValueCtorArg = lpValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsansclassinfow) return false
        if (this.lpszName != other.lpszName) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.dwValueType != other.dwValueType) return false
        if (this.dwValueSize != other.dwValueSize) return false
        if (this.lpValue != other.lpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszName.hashCode()
        result = 31 * result + this.dwNameSpace.hashCode()
        result = 31 * result + this.dwValueType.hashCode()
        result = 31 * result + this.dwValueSize.hashCode()
        result = 31 * result + this.lpValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpszName: Pwstr = MutPtr(0L),
            dwNameSpace: UInt = 0u,
            dwValueType: UInt = 0u,
            dwValueSize: UInt = 0u,
            lpValue: MutPtr<CVoid> = MutPtr(0L),
        ): Wsansclassinfow =
            Wsansclassinfow(
                lpszNameCtorArg = lpszName,
                dwNameSpace = dwNameSpace,
                dwValueType = dwValueType,
                dwValueSize = dwValueSize,
                lpValueCtorArg = lpValue,
            )
    }
}

public data class Wsapolldata(
    public var result: Int = 0,
    public var fds: UInt = 0u,
    public var timeout: Int = 0,
    public var fdArray: List<Wsapollfd> = List(1) { Wsapollfd() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsapolldata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsapolldata> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Wsapolldata =
                    Wsapolldata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Wsapollfd.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Wsapolldata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.result)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.timeout)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Wsapollfd.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.fdArray)
                }
            }
    }
}

public data class Wsapollfd(
    public var fd: Socket = 0uL,
    public var events: WsapollEventFlags = 0,
    public var revents: WsapollEventFlags = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsapollfd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsapollfd> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Wsapollfd =
                    Wsapollfd(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Wsapollfd) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.fd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.events)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.revents)
                }
            }
    }
}

public data class Wsaprotocolchain(
    public var chainLen: Int = 0,
    public var chainEntries: UIntArray = UIntArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsaprotocolchain) return false
        if (this.chainLen != other.chainLen) return false
        if (!this.chainEntries.contentEquals(other.chainEntries)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chainLen.hashCode()
        result = 31 * result + this.chainEntries.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsaprotocolchain> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsaprotocolchain> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Wsaprotocolchain =
                    Wsaprotocolchain(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (7).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Wsaprotocolchain) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.chainLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (7).toInt())
                    ).writeNative(addr + 4L, value.chainEntries)
                }
            }
    }
}

public class WsaprotocolInfoa(
    public var dwServiceFlags1: UInt = 0u,
    public var dwServiceFlags2: UInt = 0u,
    public var dwServiceFlags3: UInt = 0u,
    public var dwServiceFlags4: UInt = 0u,
    public var dwProviderFlags: UInt = 0u,
    public var providerId: Guid = Guid(),
    public var dwCatalogEntryId: UInt = 0u,
    public var protocolChain: Wsaprotocolchain = Wsaprotocolchain(),
    public var iVersion: Int = 0,
    public var iAddressFamily: Int = 0,
    public var iMaxSockAddr: Int = 0,
    public var iMinSockAddr: Int = 0,
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
    public var iProtocolMaxOffset: Int = 0,
    public var iNetworkByteOrder: Int = 0,
    public var iSecurityScheme: Int = 0,
    public var dwMessageSize: UInt = 0u,
    public var dwProviderReserved: UInt = 0u,
    public var szProtocol: ByteArray = ByteArray(256),
)

public class WsaprotocolInfow(
    public var dwServiceFlags1: UInt = 0u,
    public var dwServiceFlags2: UInt = 0u,
    public var dwServiceFlags3: UInt = 0u,
    public var dwServiceFlags4: UInt = 0u,
    public var dwProviderFlags: UInt = 0u,
    public var providerId: Guid = Guid(),
    public var dwCatalogEntryId: UInt = 0u,
    public var protocolChain: Wsaprotocolchain = Wsaprotocolchain(),
    public var iVersion: Int = 0,
    public var iAddressFamily: Int = 0,
    public var iMaxSockAddr: Int = 0,
    public var iMinSockAddr: Int = 0,
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
    public var iProtocolMaxOffset: Int = 0,
    public var iNetworkByteOrder: Int = 0,
    public var iSecurityScheme: Int = 0,
    public var dwMessageSize: UInt = 0u,
    public var dwProviderReserved: UInt = 0u,
    public var szProtocol: UShortArray = UShortArray(256),
)

public class Wsaqueryset2a internal constructor(
    public var dwSize: UInt,
    lpszServiceInstanceNameCtorArg: Pstr,
    lpVersionCtorArg: MutPtr<Wsaversion>,
    lpszCommentCtorArg: Pstr,
    public var dwNameSpace: UInt,
    lpNSProviderIdCtorArg: MutPtr<Guid>,
    lpszContextCtorArg: Pstr,
    public var dwNumberOfProtocols: UInt,
    lpafpProtocolsCtorArg: MutPtr<Afprotocols>,
    lpszQueryStringCtorArg: Pstr,
    public var dwNumberOfCsAddrs: UInt,
    lpcsaBufferCtorArg: MutPtr<CsaddrInfo>,
    public var dwOutputFlags: UInt,
    lpBlobCtorArg: MutPtr<Blob>,
) {
    public var lpszServiceInstanceName: Pstr = lpszServiceInstanceNameCtorArg
        internal set

    public var lpVersion: MutPtr<Wsaversion> = lpVersionCtorArg
        internal set

    public var lpszComment: Pstr = lpszCommentCtorArg
        internal set

    public var lpNSProviderId: MutPtr<Guid> = lpNSProviderIdCtorArg
        internal set

    public var lpszContext: Pstr = lpszContextCtorArg
        internal set

    public var lpafpProtocols: MutPtr<Afprotocols> = lpafpProtocolsCtorArg
        internal set

    public var lpszQueryString: Pstr = lpszQueryStringCtorArg
        internal set

    public var lpcsaBuffer: MutPtr<CsaddrInfo> = lpcsaBufferCtorArg
        internal set

    public var lpBlob: MutPtr<Blob> = lpBlobCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpszServiceInstanceNameCtorArg = MutPtr(0L),
        lpVersionCtorArg = MutPtr(0L),
        lpszCommentCtorArg = MutPtr(0L),
        dwNameSpace = 0u,
        lpNSProviderIdCtorArg = MutPtr(0L),
        lpszContextCtorArg = MutPtr(0L),
        dwNumberOfProtocols = 0u,
        lpafpProtocolsCtorArg = MutPtr(0L),
        lpszQueryStringCtorArg = MutPtr(0L),
        dwNumberOfCsAddrs = 0u,
        lpcsaBufferCtorArg = MutPtr(0L),
        dwOutputFlags = 0u,
        lpBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pstr = this.lpszServiceInstanceName

    public operator fun component3(): MutPtr<Wsaversion> = this.lpVersion

    public operator fun component4(): Pstr = this.lpszComment

    public operator fun component5(): UInt = this.dwNameSpace

    public operator fun component6(): MutPtr<Guid> = this.lpNSProviderId

    public operator fun component7(): Pstr = this.lpszContext

    public operator fun component8(): UInt = this.dwNumberOfProtocols

    public operator fun component9(): MutPtr<Afprotocols> = this.lpafpProtocols

    public operator fun component10(): Pstr = this.lpszQueryString

    public operator fun component11(): UInt = this.dwNumberOfCsAddrs

    public operator fun component12(): MutPtr<CsaddrInfo> = this.lpcsaBuffer

    public operator fun component13(): UInt = this.dwOutputFlags

    public operator fun component14(): MutPtr<Blob> = this.lpBlob

    public fun copy(dwSize: UInt = this.dwSize, lpszServiceInstanceName: Pstr = this.lpszServiceInstanceName, lpVersion: MutPtr<Wsaversion> = this.lpVersion, lpszComment: Pstr = this.lpszComment, dwNameSpace: UInt = this.dwNameSpace, lpNSProviderId: MutPtr<Guid> = this.lpNSProviderId, lpszContext: Pstr = this.lpszContext, dwNumberOfProtocols: UInt = this.dwNumberOfProtocols, lpafpProtocols: MutPtr<Afprotocols> = this.lpafpProtocols, lpszQueryString: Pstr = this.lpszQueryString, dwNumberOfCsAddrs: UInt = this.dwNumberOfCsAddrs, lpcsaBuffer: MutPtr<CsaddrInfo> = this.lpcsaBuffer, dwOutputFlags: UInt = this.dwOutputFlags, lpBlob: MutPtr<Blob> = this.lpBlob): Wsaqueryset2a = Wsaqueryset2a(dwSize = dwSize, lpszServiceInstanceNameCtorArg = lpszServiceInstanceName, lpVersionCtorArg = lpVersion, lpszCommentCtorArg = lpszComment, dwNameSpace = dwNameSpace, lpNSProviderIdCtorArg = lpNSProviderId, lpszContextCtorArg = lpszContext, dwNumberOfProtocols = dwNumberOfProtocols, lpafpProtocolsCtorArg = lpafpProtocols, lpszQueryStringCtorArg = lpszQueryString, dwNumberOfCsAddrs = dwNumberOfCsAddrs, lpcsaBufferCtorArg = lpcsaBuffer, dwOutputFlags = dwOutputFlags, lpBlobCtorArg = lpBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsaqueryset2a) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpszServiceInstanceName != other.lpszServiceInstanceName) return false
        if (this.lpVersion != other.lpVersion) return false
        if (this.lpszComment != other.lpszComment) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.lpNSProviderId != other.lpNSProviderId) return false
        if (this.lpszContext != other.lpszContext) return false
        if (this.dwNumberOfProtocols != other.dwNumberOfProtocols) return false
        if (this.lpafpProtocols != other.lpafpProtocols) return false
        if (this.lpszQueryString != other.lpszQueryString) return false
        if (this.dwNumberOfCsAddrs != other.dwNumberOfCsAddrs) return false
        if (this.lpcsaBuffer != other.lpcsaBuffer) return false
        if (this.dwOutputFlags != other.dwOutputFlags) return false
        if (this.lpBlob != other.lpBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpszServiceInstanceName.hashCode()
        result = 31 * result + this.lpVersion.hashCode()
        result = 31 * result + this.lpszComment.hashCode()
        result = 31 * result + this.dwNameSpace.hashCode()
        result = 31 * result + this.lpNSProviderId.hashCode()
        result = 31 * result + this.lpszContext.hashCode()
        result = 31 * result + this.dwNumberOfProtocols.hashCode()
        result = 31 * result + this.lpafpProtocols.hashCode()
        result = 31 * result + this.lpszQueryString.hashCode()
        result = 31 * result + this.dwNumberOfCsAddrs.hashCode()
        result = 31 * result + this.lpcsaBuffer.hashCode()
        result = 31 * result + this.dwOutputFlags.hashCode()
        result = 31 * result + this.lpBlob.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            lpszServiceInstanceName: Pstr = MutPtr(0L),
            lpVersion: MutPtr<Wsaversion> = MutPtr(0L),
            lpszComment: Pstr = MutPtr(0L),
            dwNameSpace: UInt = 0u,
            lpNSProviderId: MutPtr<Guid> = MutPtr(0L),
            lpszContext: Pstr = MutPtr(0L),
            dwNumberOfProtocols: UInt = 0u,
            lpafpProtocols: MutPtr<Afprotocols> = MutPtr(0L),
            lpszQueryString: Pstr = MutPtr(0L),
            dwNumberOfCsAddrs: UInt = 0u,
            lpcsaBuffer: MutPtr<CsaddrInfo> = MutPtr(0L),
            dwOutputFlags: UInt = 0u,
            lpBlob: MutPtr<Blob> = MutPtr(0L),
        ): Wsaqueryset2a =
            Wsaqueryset2a(
                dwSize = dwSize,
                lpszServiceInstanceNameCtorArg = lpszServiceInstanceName,
                lpVersionCtorArg = lpVersion,
                lpszCommentCtorArg = lpszComment,
                dwNameSpace = dwNameSpace,
                lpNSProviderIdCtorArg = lpNSProviderId,
                lpszContextCtorArg = lpszContext,
                dwNumberOfProtocols = dwNumberOfProtocols,
                lpafpProtocolsCtorArg = lpafpProtocols,
                lpszQueryStringCtorArg = lpszQueryString,
                dwNumberOfCsAddrs = dwNumberOfCsAddrs,
                lpcsaBufferCtorArg = lpcsaBuffer,
                dwOutputFlags = dwOutputFlags,
                lpBlobCtorArg = lpBlob,
            )
    }
}

public class Wsaqueryset2w internal constructor(
    public var dwSize: UInt,
    lpszServiceInstanceNameCtorArg: Pwstr,
    lpVersionCtorArg: MutPtr<Wsaversion>,
    lpszCommentCtorArg: Pwstr,
    public var dwNameSpace: UInt,
    lpNSProviderIdCtorArg: MutPtr<Guid>,
    lpszContextCtorArg: Pwstr,
    public var dwNumberOfProtocols: UInt,
    lpafpProtocolsCtorArg: MutPtr<Afprotocols>,
    lpszQueryStringCtorArg: Pwstr,
    public var dwNumberOfCsAddrs: UInt,
    lpcsaBufferCtorArg: MutPtr<CsaddrInfo>,
    public var dwOutputFlags: UInt,
    lpBlobCtorArg: MutPtr<Blob>,
) {
    public var lpszServiceInstanceName: Pwstr = lpszServiceInstanceNameCtorArg
        internal set

    public var lpVersion: MutPtr<Wsaversion> = lpVersionCtorArg
        internal set

    public var lpszComment: Pwstr = lpszCommentCtorArg
        internal set

    public var lpNSProviderId: MutPtr<Guid> = lpNSProviderIdCtorArg
        internal set

    public var lpszContext: Pwstr = lpszContextCtorArg
        internal set

    public var lpafpProtocols: MutPtr<Afprotocols> = lpafpProtocolsCtorArg
        internal set

    public var lpszQueryString: Pwstr = lpszQueryStringCtorArg
        internal set

    public var lpcsaBuffer: MutPtr<CsaddrInfo> = lpcsaBufferCtorArg
        internal set

    public var lpBlob: MutPtr<Blob> = lpBlobCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpszServiceInstanceNameCtorArg = MutPtr(0L),
        lpVersionCtorArg = MutPtr(0L),
        lpszCommentCtorArg = MutPtr(0L),
        dwNameSpace = 0u,
        lpNSProviderIdCtorArg = MutPtr(0L),
        lpszContextCtorArg = MutPtr(0L),
        dwNumberOfProtocols = 0u,
        lpafpProtocolsCtorArg = MutPtr(0L),
        lpszQueryStringCtorArg = MutPtr(0L),
        dwNumberOfCsAddrs = 0u,
        lpcsaBufferCtorArg = MutPtr(0L),
        dwOutputFlags = 0u,
        lpBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.lpszServiceInstanceName

    public operator fun component3(): MutPtr<Wsaversion> = this.lpVersion

    public operator fun component4(): Pwstr = this.lpszComment

    public operator fun component5(): UInt = this.dwNameSpace

    public operator fun component6(): MutPtr<Guid> = this.lpNSProviderId

    public operator fun component7(): Pwstr = this.lpszContext

    public operator fun component8(): UInt = this.dwNumberOfProtocols

    public operator fun component9(): MutPtr<Afprotocols> = this.lpafpProtocols

    public operator fun component10(): Pwstr = this.lpszQueryString

    public operator fun component11(): UInt = this.dwNumberOfCsAddrs

    public operator fun component12(): MutPtr<CsaddrInfo> = this.lpcsaBuffer

    public operator fun component13(): UInt = this.dwOutputFlags

    public operator fun component14(): MutPtr<Blob> = this.lpBlob

    public fun copy(dwSize: UInt = this.dwSize, lpszServiceInstanceName: Pwstr = this.lpszServiceInstanceName, lpVersion: MutPtr<Wsaversion> = this.lpVersion, lpszComment: Pwstr = this.lpszComment, dwNameSpace: UInt = this.dwNameSpace, lpNSProviderId: MutPtr<Guid> = this.lpNSProviderId, lpszContext: Pwstr = this.lpszContext, dwNumberOfProtocols: UInt = this.dwNumberOfProtocols, lpafpProtocols: MutPtr<Afprotocols> = this.lpafpProtocols, lpszQueryString: Pwstr = this.lpszQueryString, dwNumberOfCsAddrs: UInt = this.dwNumberOfCsAddrs, lpcsaBuffer: MutPtr<CsaddrInfo> = this.lpcsaBuffer, dwOutputFlags: UInt = this.dwOutputFlags, lpBlob: MutPtr<Blob> = this.lpBlob): Wsaqueryset2w = Wsaqueryset2w(dwSize = dwSize, lpszServiceInstanceNameCtorArg = lpszServiceInstanceName, lpVersionCtorArg = lpVersion, lpszCommentCtorArg = lpszComment, dwNameSpace = dwNameSpace, lpNSProviderIdCtorArg = lpNSProviderId, lpszContextCtorArg = lpszContext, dwNumberOfProtocols = dwNumberOfProtocols, lpafpProtocolsCtorArg = lpafpProtocols, lpszQueryStringCtorArg = lpszQueryString, dwNumberOfCsAddrs = dwNumberOfCsAddrs, lpcsaBufferCtorArg = lpcsaBuffer, dwOutputFlags = dwOutputFlags, lpBlobCtorArg = lpBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsaqueryset2w) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpszServiceInstanceName != other.lpszServiceInstanceName) return false
        if (this.lpVersion != other.lpVersion) return false
        if (this.lpszComment != other.lpszComment) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.lpNSProviderId != other.lpNSProviderId) return false
        if (this.lpszContext != other.lpszContext) return false
        if (this.dwNumberOfProtocols != other.dwNumberOfProtocols) return false
        if (this.lpafpProtocols != other.lpafpProtocols) return false
        if (this.lpszQueryString != other.lpszQueryString) return false
        if (this.dwNumberOfCsAddrs != other.dwNumberOfCsAddrs) return false
        if (this.lpcsaBuffer != other.lpcsaBuffer) return false
        if (this.dwOutputFlags != other.dwOutputFlags) return false
        if (this.lpBlob != other.lpBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpszServiceInstanceName.hashCode()
        result = 31 * result + this.lpVersion.hashCode()
        result = 31 * result + this.lpszComment.hashCode()
        result = 31 * result + this.dwNameSpace.hashCode()
        result = 31 * result + this.lpNSProviderId.hashCode()
        result = 31 * result + this.lpszContext.hashCode()
        result = 31 * result + this.dwNumberOfProtocols.hashCode()
        result = 31 * result + this.lpafpProtocols.hashCode()
        result = 31 * result + this.lpszQueryString.hashCode()
        result = 31 * result + this.dwNumberOfCsAddrs.hashCode()
        result = 31 * result + this.lpcsaBuffer.hashCode()
        result = 31 * result + this.dwOutputFlags.hashCode()
        result = 31 * result + this.lpBlob.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            lpszServiceInstanceName: Pwstr = MutPtr(0L),
            lpVersion: MutPtr<Wsaversion> = MutPtr(0L),
            lpszComment: Pwstr = MutPtr(0L),
            dwNameSpace: UInt = 0u,
            lpNSProviderId: MutPtr<Guid> = MutPtr(0L),
            lpszContext: Pwstr = MutPtr(0L),
            dwNumberOfProtocols: UInt = 0u,
            lpafpProtocols: MutPtr<Afprotocols> = MutPtr(0L),
            lpszQueryString: Pwstr = MutPtr(0L),
            dwNumberOfCsAddrs: UInt = 0u,
            lpcsaBuffer: MutPtr<CsaddrInfo> = MutPtr(0L),
            dwOutputFlags: UInt = 0u,
            lpBlob: MutPtr<Blob> = MutPtr(0L),
        ): Wsaqueryset2w =
            Wsaqueryset2w(
                dwSize = dwSize,
                lpszServiceInstanceNameCtorArg = lpszServiceInstanceName,
                lpVersionCtorArg = lpVersion,
                lpszCommentCtorArg = lpszComment,
                dwNameSpace = dwNameSpace,
                lpNSProviderIdCtorArg = lpNSProviderId,
                lpszContextCtorArg = lpszContext,
                dwNumberOfProtocols = dwNumberOfProtocols,
                lpafpProtocolsCtorArg = lpafpProtocols,
                lpszQueryStringCtorArg = lpszQueryString,
                dwNumberOfCsAddrs = dwNumberOfCsAddrs,
                lpcsaBufferCtorArg = lpcsaBuffer,
                dwOutputFlags = dwOutputFlags,
                lpBlobCtorArg = lpBlob,
            )
    }
}

public class Wsaqueryseta internal constructor(
    public var dwSize: UInt,
    lpszServiceInstanceNameCtorArg: Pstr,
    lpServiceClassIdCtorArg: MutPtr<Guid>,
    lpVersionCtorArg: MutPtr<Wsaversion>,
    lpszCommentCtorArg: Pstr,
    public var dwNameSpace: UInt,
    lpNSProviderIdCtorArg: MutPtr<Guid>,
    lpszContextCtorArg: Pstr,
    public var dwNumberOfProtocols: UInt,
    lpafpProtocolsCtorArg: MutPtr<Afprotocols>,
    lpszQueryStringCtorArg: Pstr,
    public var dwNumberOfCsAddrs: UInt,
    lpcsaBufferCtorArg: MutPtr<CsaddrInfo>,
    public var dwOutputFlags: UInt,
    lpBlobCtorArg: MutPtr<Blob>,
) {
    public var lpszServiceInstanceName: Pstr = lpszServiceInstanceNameCtorArg
        internal set

    public var lpServiceClassId: MutPtr<Guid> = lpServiceClassIdCtorArg
        internal set

    public var lpVersion: MutPtr<Wsaversion> = lpVersionCtorArg
        internal set

    public var lpszComment: Pstr = lpszCommentCtorArg
        internal set

    public var lpNSProviderId: MutPtr<Guid> = lpNSProviderIdCtorArg
        internal set

    public var lpszContext: Pstr = lpszContextCtorArg
        internal set

    public var lpafpProtocols: MutPtr<Afprotocols> = lpafpProtocolsCtorArg
        internal set

    public var lpszQueryString: Pstr = lpszQueryStringCtorArg
        internal set

    public var lpcsaBuffer: MutPtr<CsaddrInfo> = lpcsaBufferCtorArg
        internal set

    public var lpBlob: MutPtr<Blob> = lpBlobCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpszServiceInstanceNameCtorArg = MutPtr(0L),
        lpServiceClassIdCtorArg = MutPtr(0L),
        lpVersionCtorArg = MutPtr(0L),
        lpszCommentCtorArg = MutPtr(0L),
        dwNameSpace = 0u,
        lpNSProviderIdCtorArg = MutPtr(0L),
        lpszContextCtorArg = MutPtr(0L),
        dwNumberOfProtocols = 0u,
        lpafpProtocolsCtorArg = MutPtr(0L),
        lpszQueryStringCtorArg = MutPtr(0L),
        dwNumberOfCsAddrs = 0u,
        lpcsaBufferCtorArg = MutPtr(0L),
        dwOutputFlags = 0u,
        lpBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pstr = this.lpszServiceInstanceName

    public operator fun component3(): MutPtr<Guid> = this.lpServiceClassId

    public operator fun component4(): MutPtr<Wsaversion> = this.lpVersion

    public operator fun component5(): Pstr = this.lpszComment

    public operator fun component6(): UInt = this.dwNameSpace

    public operator fun component7(): MutPtr<Guid> = this.lpNSProviderId

    public operator fun component8(): Pstr = this.lpszContext

    public operator fun component9(): UInt = this.dwNumberOfProtocols

    public operator fun component10(): MutPtr<Afprotocols> = this.lpafpProtocols

    public operator fun component11(): Pstr = this.lpszQueryString

    public operator fun component12(): UInt = this.dwNumberOfCsAddrs

    public operator fun component13(): MutPtr<CsaddrInfo> = this.lpcsaBuffer

    public operator fun component14(): UInt = this.dwOutputFlags

    public operator fun component15(): MutPtr<Blob> = this.lpBlob

    public fun copy(dwSize: UInt = this.dwSize, lpszServiceInstanceName: Pstr = this.lpszServiceInstanceName, lpServiceClassId: MutPtr<Guid> = this.lpServiceClassId, lpVersion: MutPtr<Wsaversion> = this.lpVersion, lpszComment: Pstr = this.lpszComment, dwNameSpace: UInt = this.dwNameSpace, lpNSProviderId: MutPtr<Guid> = this.lpNSProviderId, lpszContext: Pstr = this.lpszContext, dwNumberOfProtocols: UInt = this.dwNumberOfProtocols, lpafpProtocols: MutPtr<Afprotocols> = this.lpafpProtocols, lpszQueryString: Pstr = this.lpszQueryString, dwNumberOfCsAddrs: UInt = this.dwNumberOfCsAddrs, lpcsaBuffer: MutPtr<CsaddrInfo> = this.lpcsaBuffer, dwOutputFlags: UInt = this.dwOutputFlags, lpBlob: MutPtr<Blob> = this.lpBlob): Wsaqueryseta = Wsaqueryseta(dwSize = dwSize, lpszServiceInstanceNameCtorArg = lpszServiceInstanceName, lpServiceClassIdCtorArg = lpServiceClassId, lpVersionCtorArg = lpVersion, lpszCommentCtorArg = lpszComment, dwNameSpace = dwNameSpace, lpNSProviderIdCtorArg = lpNSProviderId, lpszContextCtorArg = lpszContext, dwNumberOfProtocols = dwNumberOfProtocols, lpafpProtocolsCtorArg = lpafpProtocols, lpszQueryStringCtorArg = lpszQueryString, dwNumberOfCsAddrs = dwNumberOfCsAddrs, lpcsaBufferCtorArg = lpcsaBuffer, dwOutputFlags = dwOutputFlags, lpBlobCtorArg = lpBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsaqueryseta) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpszServiceInstanceName != other.lpszServiceInstanceName) return false
        if (this.lpServiceClassId != other.lpServiceClassId) return false
        if (this.lpVersion != other.lpVersion) return false
        if (this.lpszComment != other.lpszComment) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.lpNSProviderId != other.lpNSProviderId) return false
        if (this.lpszContext != other.lpszContext) return false
        if (this.dwNumberOfProtocols != other.dwNumberOfProtocols) return false
        if (this.lpafpProtocols != other.lpafpProtocols) return false
        if (this.lpszQueryString != other.lpszQueryString) return false
        if (this.dwNumberOfCsAddrs != other.dwNumberOfCsAddrs) return false
        if (this.lpcsaBuffer != other.lpcsaBuffer) return false
        if (this.dwOutputFlags != other.dwOutputFlags) return false
        if (this.lpBlob != other.lpBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpszServiceInstanceName.hashCode()
        result = 31 * result + this.lpServiceClassId.hashCode()
        result = 31 * result + this.lpVersion.hashCode()
        result = 31 * result + this.lpszComment.hashCode()
        result = 31 * result + this.dwNameSpace.hashCode()
        result = 31 * result + this.lpNSProviderId.hashCode()
        result = 31 * result + this.lpszContext.hashCode()
        result = 31 * result + this.dwNumberOfProtocols.hashCode()
        result = 31 * result + this.lpafpProtocols.hashCode()
        result = 31 * result + this.lpszQueryString.hashCode()
        result = 31 * result + this.dwNumberOfCsAddrs.hashCode()
        result = 31 * result + this.lpcsaBuffer.hashCode()
        result = 31 * result + this.dwOutputFlags.hashCode()
        result = 31 * result + this.lpBlob.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            lpszServiceInstanceName: Pstr = MutPtr(0L),
            lpServiceClassId: MutPtr<Guid> = MutPtr(0L),
            lpVersion: MutPtr<Wsaversion> = MutPtr(0L),
            lpszComment: Pstr = MutPtr(0L),
            dwNameSpace: UInt = 0u,
            lpNSProviderId: MutPtr<Guid> = MutPtr(0L),
            lpszContext: Pstr = MutPtr(0L),
            dwNumberOfProtocols: UInt = 0u,
            lpafpProtocols: MutPtr<Afprotocols> = MutPtr(0L),
            lpszQueryString: Pstr = MutPtr(0L),
            dwNumberOfCsAddrs: UInt = 0u,
            lpcsaBuffer: MutPtr<CsaddrInfo> = MutPtr(0L),
            dwOutputFlags: UInt = 0u,
            lpBlob: MutPtr<Blob> = MutPtr(0L),
        ): Wsaqueryseta =
            Wsaqueryseta(
                dwSize = dwSize,
                lpszServiceInstanceNameCtorArg = lpszServiceInstanceName,
                lpServiceClassIdCtorArg = lpServiceClassId,
                lpVersionCtorArg = lpVersion,
                lpszCommentCtorArg = lpszComment,
                dwNameSpace = dwNameSpace,
                lpNSProviderIdCtorArg = lpNSProviderId,
                lpszContextCtorArg = lpszContext,
                dwNumberOfProtocols = dwNumberOfProtocols,
                lpafpProtocolsCtorArg = lpafpProtocols,
                lpszQueryStringCtorArg = lpszQueryString,
                dwNumberOfCsAddrs = dwNumberOfCsAddrs,
                lpcsaBufferCtorArg = lpcsaBuffer,
                dwOutputFlags = dwOutputFlags,
                lpBlobCtorArg = lpBlob,
            )
    }
}

public class Wsaquerysetw internal constructor(
    public var dwSize: UInt,
    lpszServiceInstanceNameCtorArg: Pwstr,
    lpServiceClassIdCtorArg: MutPtr<Guid>,
    lpVersionCtorArg: MutPtr<Wsaversion>,
    lpszCommentCtorArg: Pwstr,
    public var dwNameSpace: UInt,
    lpNSProviderIdCtorArg: MutPtr<Guid>,
    lpszContextCtorArg: Pwstr,
    public var dwNumberOfProtocols: UInt,
    lpafpProtocolsCtorArg: MutPtr<Afprotocols>,
    lpszQueryStringCtorArg: Pwstr,
    public var dwNumberOfCsAddrs: UInt,
    lpcsaBufferCtorArg: MutPtr<CsaddrInfo>,
    public var dwOutputFlags: UInt,
    lpBlobCtorArg: MutPtr<Blob>,
) {
    public var lpszServiceInstanceName: Pwstr = lpszServiceInstanceNameCtorArg
        internal set

    public var lpServiceClassId: MutPtr<Guid> = lpServiceClassIdCtorArg
        internal set

    public var lpVersion: MutPtr<Wsaversion> = lpVersionCtorArg
        internal set

    public var lpszComment: Pwstr = lpszCommentCtorArg
        internal set

    public var lpNSProviderId: MutPtr<Guid> = lpNSProviderIdCtorArg
        internal set

    public var lpszContext: Pwstr = lpszContextCtorArg
        internal set

    public var lpafpProtocols: MutPtr<Afprotocols> = lpafpProtocolsCtorArg
        internal set

    public var lpszQueryString: Pwstr = lpszQueryStringCtorArg
        internal set

    public var lpcsaBuffer: MutPtr<CsaddrInfo> = lpcsaBufferCtorArg
        internal set

    public var lpBlob: MutPtr<Blob> = lpBlobCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpszServiceInstanceNameCtorArg = MutPtr(0L),
        lpServiceClassIdCtorArg = MutPtr(0L),
        lpVersionCtorArg = MutPtr(0L),
        lpszCommentCtorArg = MutPtr(0L),
        dwNameSpace = 0u,
        lpNSProviderIdCtorArg = MutPtr(0L),
        lpszContextCtorArg = MutPtr(0L),
        dwNumberOfProtocols = 0u,
        lpafpProtocolsCtorArg = MutPtr(0L),
        lpszQueryStringCtorArg = MutPtr(0L),
        dwNumberOfCsAddrs = 0u,
        lpcsaBufferCtorArg = MutPtr(0L),
        dwOutputFlags = 0u,
        lpBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.lpszServiceInstanceName

    public operator fun component3(): MutPtr<Guid> = this.lpServiceClassId

    public operator fun component4(): MutPtr<Wsaversion> = this.lpVersion

    public operator fun component5(): Pwstr = this.lpszComment

    public operator fun component6(): UInt = this.dwNameSpace

    public operator fun component7(): MutPtr<Guid> = this.lpNSProviderId

    public operator fun component8(): Pwstr = this.lpszContext

    public operator fun component9(): UInt = this.dwNumberOfProtocols

    public operator fun component10(): MutPtr<Afprotocols> = this.lpafpProtocols

    public operator fun component11(): Pwstr = this.lpszQueryString

    public operator fun component12(): UInt = this.dwNumberOfCsAddrs

    public operator fun component13(): MutPtr<CsaddrInfo> = this.lpcsaBuffer

    public operator fun component14(): UInt = this.dwOutputFlags

    public operator fun component15(): MutPtr<Blob> = this.lpBlob

    public fun copy(dwSize: UInt = this.dwSize, lpszServiceInstanceName: Pwstr = this.lpszServiceInstanceName, lpServiceClassId: MutPtr<Guid> = this.lpServiceClassId, lpVersion: MutPtr<Wsaversion> = this.lpVersion, lpszComment: Pwstr = this.lpszComment, dwNameSpace: UInt = this.dwNameSpace, lpNSProviderId: MutPtr<Guid> = this.lpNSProviderId, lpszContext: Pwstr = this.lpszContext, dwNumberOfProtocols: UInt = this.dwNumberOfProtocols, lpafpProtocols: MutPtr<Afprotocols> = this.lpafpProtocols, lpszQueryString: Pwstr = this.lpszQueryString, dwNumberOfCsAddrs: UInt = this.dwNumberOfCsAddrs, lpcsaBuffer: MutPtr<CsaddrInfo> = this.lpcsaBuffer, dwOutputFlags: UInt = this.dwOutputFlags, lpBlob: MutPtr<Blob> = this.lpBlob): Wsaquerysetw = Wsaquerysetw(dwSize = dwSize, lpszServiceInstanceNameCtorArg = lpszServiceInstanceName, lpServiceClassIdCtorArg = lpServiceClassId, lpVersionCtorArg = lpVersion, lpszCommentCtorArg = lpszComment, dwNameSpace = dwNameSpace, lpNSProviderIdCtorArg = lpNSProviderId, lpszContextCtorArg = lpszContext, dwNumberOfProtocols = dwNumberOfProtocols, lpafpProtocolsCtorArg = lpafpProtocols, lpszQueryStringCtorArg = lpszQueryString, dwNumberOfCsAddrs = dwNumberOfCsAddrs, lpcsaBufferCtorArg = lpcsaBuffer, dwOutputFlags = dwOutputFlags, lpBlobCtorArg = lpBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsaquerysetw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpszServiceInstanceName != other.lpszServiceInstanceName) return false
        if (this.lpServiceClassId != other.lpServiceClassId) return false
        if (this.lpVersion != other.lpVersion) return false
        if (this.lpszComment != other.lpszComment) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.lpNSProviderId != other.lpNSProviderId) return false
        if (this.lpszContext != other.lpszContext) return false
        if (this.dwNumberOfProtocols != other.dwNumberOfProtocols) return false
        if (this.lpafpProtocols != other.lpafpProtocols) return false
        if (this.lpszQueryString != other.lpszQueryString) return false
        if (this.dwNumberOfCsAddrs != other.dwNumberOfCsAddrs) return false
        if (this.lpcsaBuffer != other.lpcsaBuffer) return false
        if (this.dwOutputFlags != other.dwOutputFlags) return false
        if (this.lpBlob != other.lpBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpszServiceInstanceName.hashCode()
        result = 31 * result + this.lpServiceClassId.hashCode()
        result = 31 * result + this.lpVersion.hashCode()
        result = 31 * result + this.lpszComment.hashCode()
        result = 31 * result + this.dwNameSpace.hashCode()
        result = 31 * result + this.lpNSProviderId.hashCode()
        result = 31 * result + this.lpszContext.hashCode()
        result = 31 * result + this.dwNumberOfProtocols.hashCode()
        result = 31 * result + this.lpafpProtocols.hashCode()
        result = 31 * result + this.lpszQueryString.hashCode()
        result = 31 * result + this.dwNumberOfCsAddrs.hashCode()
        result = 31 * result + this.lpcsaBuffer.hashCode()
        result = 31 * result + this.dwOutputFlags.hashCode()
        result = 31 * result + this.lpBlob.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            lpszServiceInstanceName: Pwstr = MutPtr(0L),
            lpServiceClassId: MutPtr<Guid> = MutPtr(0L),
            lpVersion: MutPtr<Wsaversion> = MutPtr(0L),
            lpszComment: Pwstr = MutPtr(0L),
            dwNameSpace: UInt = 0u,
            lpNSProviderId: MutPtr<Guid> = MutPtr(0L),
            lpszContext: Pwstr = MutPtr(0L),
            dwNumberOfProtocols: UInt = 0u,
            lpafpProtocols: MutPtr<Afprotocols> = MutPtr(0L),
            lpszQueryString: Pwstr = MutPtr(0L),
            dwNumberOfCsAddrs: UInt = 0u,
            lpcsaBuffer: MutPtr<CsaddrInfo> = MutPtr(0L),
            dwOutputFlags: UInt = 0u,
            lpBlob: MutPtr<Blob> = MutPtr(0L),
        ): Wsaquerysetw =
            Wsaquerysetw(
                dwSize = dwSize,
                lpszServiceInstanceNameCtorArg = lpszServiceInstanceName,
                lpServiceClassIdCtorArg = lpServiceClassId,
                lpVersionCtorArg = lpVersion,
                lpszCommentCtorArg = lpszComment,
                dwNameSpace = dwNameSpace,
                lpNSProviderIdCtorArg = lpNSProviderId,
                lpszContextCtorArg = lpszContext,
                dwNumberOfProtocols = dwNumberOfProtocols,
                lpafpProtocolsCtorArg = lpafpProtocols,
                lpszQueryStringCtorArg = lpszQueryString,
                dwNumberOfCsAddrs = dwNumberOfCsAddrs,
                lpcsaBufferCtorArg = lpcsaBuffer,
                dwOutputFlags = dwOutputFlags,
                lpBlobCtorArg = lpBlob,
            )
    }
}

public class Wsasendmsg internal constructor(
    lpMsgCtorArg: MutPtr<Wsamsg>,
    public var dwFlags: UInt,
    lpNumberOfBytesSentCtorArg: MutPtr<UInt>,
    lpOverlappedCtorArg: MutPtr<Overlapped>,
    public var lpCompletionRoutine: LpwsaoverlappedCompletionRoutine,
) {
    public var lpMsg: MutPtr<Wsamsg> = lpMsgCtorArg
        internal set

    public var lpNumberOfBytesSent: MutPtr<UInt> = lpNumberOfBytesSentCtorArg
        internal set

    public var lpOverlapped: MutPtr<Overlapped> = lpOverlappedCtorArg
        internal set

    public constructor() : this(
        lpMsgCtorArg = MutPtr(0L),
        dwFlags = 0u,
        lpNumberOfBytesSentCtorArg = MutPtr(0L),
        lpOverlappedCtorArg = MutPtr(0L),
        lpCompletionRoutine = null,
    )

    public operator fun component1(): MutPtr<Wsamsg> = this.lpMsg

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): MutPtr<UInt> = this.lpNumberOfBytesSent

    public operator fun component4(): MutPtr<Overlapped> = this.lpOverlapped

    public operator fun component5(): LpwsaoverlappedCompletionRoutine = this.lpCompletionRoutine

    public fun copy(lpMsg: MutPtr<Wsamsg> = this.lpMsg, dwFlags: UInt = this.dwFlags, lpNumberOfBytesSent: MutPtr<UInt> = this.lpNumberOfBytesSent, lpOverlapped: MutPtr<Overlapped> = this.lpOverlapped, lpCompletionRoutine: LpwsaoverlappedCompletionRoutine = this.lpCompletionRoutine): Wsasendmsg = Wsasendmsg(lpMsgCtorArg = lpMsg, dwFlags = dwFlags, lpNumberOfBytesSentCtorArg = lpNumberOfBytesSent, lpOverlappedCtorArg = lpOverlapped, lpCompletionRoutine = lpCompletionRoutine)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsasendmsg) return false
        if (this.lpMsg != other.lpMsg) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpNumberOfBytesSent != other.lpNumberOfBytesSent) return false
        if (this.lpOverlapped != other.lpOverlapped) return false
        if (this.lpCompletionRoutine != other.lpCompletionRoutine) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpMsg.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpNumberOfBytesSent.hashCode()
        result = 31 * result + this.lpOverlapped.hashCode()
        result = 31 * result + this.lpCompletionRoutine.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpMsg: MutPtr<Wsamsg> = MutPtr(0L),
            dwFlags: UInt = 0u,
            lpNumberOfBytesSent: MutPtr<UInt> = MutPtr(0L),
            lpOverlapped: MutPtr<Overlapped> = MutPtr(0L),
            lpCompletionRoutine: LpwsaoverlappedCompletionRoutine = null,
        ): Wsasendmsg =
            Wsasendmsg(
                lpMsgCtorArg = lpMsg,
                dwFlags = dwFlags,
                lpNumberOfBytesSentCtorArg = lpNumberOfBytesSent,
                lpOverlappedCtorArg = lpOverlapped,
                lpCompletionRoutine = lpCompletionRoutine,
            )
    }
}

public class Wsaserviceclassinfoa internal constructor(
    lpServiceClassIdCtorArg: MutPtr<Guid>,
    lpszServiceClassNameCtorArg: Pstr,
    public var dwCount: UInt,
    lpClassInfosCtorArg: MutPtr<Wsansclassinfoa>,
) {
    public var lpServiceClassId: MutPtr<Guid> = lpServiceClassIdCtorArg
        internal set

    public var lpszServiceClassName: Pstr = lpszServiceClassNameCtorArg
        internal set

    public var lpClassInfos: MutPtr<Wsansclassinfoa> = lpClassInfosCtorArg
        internal set

    public constructor() : this(
        lpServiceClassIdCtorArg = MutPtr(0L),
        lpszServiceClassNameCtorArg = MutPtr(0L),
        dwCount = 0u,
        lpClassInfosCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Guid> = this.lpServiceClassId

    public operator fun component2(): Pstr = this.lpszServiceClassName

    public operator fun component3(): UInt = this.dwCount

    public operator fun component4(): MutPtr<Wsansclassinfoa> = this.lpClassInfos

    public fun copy(lpServiceClassId: MutPtr<Guid> = this.lpServiceClassId, lpszServiceClassName: Pstr = this.lpszServiceClassName, dwCount: UInt = this.dwCount, lpClassInfos: MutPtr<Wsansclassinfoa> = this.lpClassInfos): Wsaserviceclassinfoa = Wsaserviceclassinfoa(lpServiceClassIdCtorArg = lpServiceClassId, lpszServiceClassNameCtorArg = lpszServiceClassName, dwCount = dwCount, lpClassInfosCtorArg = lpClassInfos)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsaserviceclassinfoa) return false
        if (this.lpServiceClassId != other.lpServiceClassId) return false
        if (this.lpszServiceClassName != other.lpszServiceClassName) return false
        if (this.dwCount != other.dwCount) return false
        if (this.lpClassInfos != other.lpClassInfos) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceClassId.hashCode()
        result = 31 * result + this.lpszServiceClassName.hashCode()
        result = 31 * result + this.dwCount.hashCode()
        result = 31 * result + this.lpClassInfos.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceClassId: MutPtr<Guid> = MutPtr(0L),
            lpszServiceClassName: Pstr = MutPtr(0L),
            dwCount: UInt = 0u,
            lpClassInfos: MutPtr<Wsansclassinfoa> = MutPtr(0L),
        ): Wsaserviceclassinfoa =
            Wsaserviceclassinfoa(
                lpServiceClassIdCtorArg = lpServiceClassId,
                lpszServiceClassNameCtorArg = lpszServiceClassName,
                dwCount = dwCount,
                lpClassInfosCtorArg = lpClassInfos,
            )
    }
}

public class Wsaserviceclassinfow internal constructor(
    lpServiceClassIdCtorArg: MutPtr<Guid>,
    lpszServiceClassNameCtorArg: Pwstr,
    public var dwCount: UInt,
    lpClassInfosCtorArg: MutPtr<Wsansclassinfow>,
) {
    public var lpServiceClassId: MutPtr<Guid> = lpServiceClassIdCtorArg
        internal set

    public var lpszServiceClassName: Pwstr = lpszServiceClassNameCtorArg
        internal set

    public var lpClassInfos: MutPtr<Wsansclassinfow> = lpClassInfosCtorArg
        internal set

    public constructor() : this(
        lpServiceClassIdCtorArg = MutPtr(0L),
        lpszServiceClassNameCtorArg = MutPtr(0L),
        dwCount = 0u,
        lpClassInfosCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Guid> = this.lpServiceClassId

    public operator fun component2(): Pwstr = this.lpszServiceClassName

    public operator fun component3(): UInt = this.dwCount

    public operator fun component4(): MutPtr<Wsansclassinfow> = this.lpClassInfos

    public fun copy(lpServiceClassId: MutPtr<Guid> = this.lpServiceClassId, lpszServiceClassName: Pwstr = this.lpszServiceClassName, dwCount: UInt = this.dwCount, lpClassInfos: MutPtr<Wsansclassinfow> = this.lpClassInfos): Wsaserviceclassinfow = Wsaserviceclassinfow(lpServiceClassIdCtorArg = lpServiceClassId, lpszServiceClassNameCtorArg = lpszServiceClassName, dwCount = dwCount, lpClassInfosCtorArg = lpClassInfos)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsaserviceclassinfow) return false
        if (this.lpServiceClassId != other.lpServiceClassId) return false
        if (this.lpszServiceClassName != other.lpszServiceClassName) return false
        if (this.dwCount != other.dwCount) return false
        if (this.lpClassInfos != other.lpClassInfos) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceClassId.hashCode()
        result = 31 * result + this.lpszServiceClassName.hashCode()
        result = 31 * result + this.dwCount.hashCode()
        result = 31 * result + this.lpClassInfos.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceClassId: MutPtr<Guid> = MutPtr(0L),
            lpszServiceClassName: Pwstr = MutPtr(0L),
            dwCount: UInt = 0u,
            lpClassInfos: MutPtr<Wsansclassinfow> = MutPtr(0L),
        ): Wsaserviceclassinfow =
            Wsaserviceclassinfow(
                lpServiceClassIdCtorArg = lpServiceClassId,
                lpszServiceClassNameCtorArg = lpszServiceClassName,
                dwCount = dwCount,
                lpClassInfosCtorArg = lpClassInfos,
            )
    }
}

public class Wsathreadid internal constructor(
    threadHandleCtorArg: Handle,
    public var reserved: Int,
) {
    public var threadHandle: Handle = threadHandleCtorArg
        internal set

    public constructor() : this(
        threadHandleCtorArg = MutPtr(0L),
        reserved = 0,
    )

    public operator fun component1(): Handle = this.threadHandle

    public operator fun component2(): Int = this.reserved

    public fun copy(threadHandle: Handle = this.threadHandle, reserved: Int = this.reserved): Wsathreadid = Wsathreadid(threadHandleCtorArg = threadHandle, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsathreadid) return false
        if (this.threadHandle != other.threadHandle) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadHandle.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            threadHandle: Handle = MutPtr(0L),
            reserved: Int = 0,
        ): Wsathreadid =
            Wsathreadid(
                threadHandleCtorArg = threadHandle,
                reserved = reserved,
            )
    }
}

public data class Wsaversion(
    public var dwVersion: UInt = 0u,
    public var ecHow: Wsaecomparator = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsaversion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wsaversion> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Wsaversion =
                    Wsaversion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Wsaversion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ecHow)
                }
            }
    }
}

public data class WsaCompatibilityMode(
    public var behaviorId: WsaCompatibilityBehaviorId = 0,
    public var targetOsVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsaCompatibilityMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsaCompatibilityMode> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsaCompatibilityMode =
                    WsaCompatibilityMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsaCompatibilityMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.behaviorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.targetOsVersion)
                }
            }
    }
}

public class WscProviderAuditInfo internal constructor(
    public var recordSize: UInt,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        recordSize = 0u,
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.recordSize

    public operator fun component2(): MutPtr<CVoid> = this.reserved

    public fun copy(recordSize: UInt = this.recordSize, reserved: MutPtr<CVoid> = this.reserved): WscProviderAuditInfo = WscProviderAuditInfo(recordSize = recordSize, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WscProviderAuditInfo) return false
        if (this.recordSize != other.recordSize) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recordSize.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WscProviderAuditInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WscProviderAuditInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WscProviderAuditInfo =
                    WscProviderAuditInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WscProviderAuditInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.recordSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.reserved)
                }
            }

        public operator fun invoke(
            recordSize: UInt = 0u,
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): WscProviderAuditInfo =
            WscProviderAuditInfo(
                recordSize = recordSize,
                reservedCtorArg = reserved,
            )
    }
}

public data class Wspdata(
    public var wVersion: UShort = 0u,
    public var wHighVersion: UShort = 0u,
    public var szDescription: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wspdata) return false
        if (this.wVersion != other.wVersion) return false
        if (this.wHighVersion != other.wHighVersion) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wVersion.hashCode()
        result = 31 * result + this.wHighVersion.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wspdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wspdata> {
                override val sizeBytes: Long = 516L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Wspdata =
                    Wspdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Wspdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wHighVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 4L, value.szDescription)
                }
            }
    }
}

public class WspprocTable(
    public var lpWSPAccept: Lpwspaccept = null,
    public var lpWSPAddressToString: Lpwspaddresstostring = null,
    public var lpWSPAsyncSelect: Lpwspasyncselect = null,
    public var lpWSPBind: Lpwspbind = null,
    public var lpWSPCancelBlockingCall: Lpwspcancelblockingcall = null,
    public var lpWSPCleanup: Lpwspcleanup = null,
    public var lpWSPCloseSocket: Lpwspclosesocket = null,
    public var lpWSPConnect: Lpwspconnect = null,
    public var lpWSPDuplicateSocket: Lpwspduplicatesocket = null,
    public var lpWSPEnumNetworkEvents: Lpwspenumnetworkevents = null,
    public var lpWSPEventSelect: Lpwspeventselect = null,
    public var lpWSPGetOverlappedResult: Lpwspgetoverlappedresult = null,
    public var lpWSPGetPeerName: Lpwspgetpeername = null,
    public var lpWSPGetSockName: Lpwspgetsockname = null,
    public var lpWSPGetSockOpt: Lpwspgetsockopt = null,
    public var lpWSPGetQOSByName: Lpwspgetqosbyname = null,
    public var lpWSPIoctl: Lpwspioctl = null,
    public var lpWSPJoinLeaf: Lpwspjoinleaf = null,
    public var lpWSPListen: Lpwsplisten = null,
    public var lpWSPRecv: Lpwsprecv = null,
    public var lpWSPRecvDisconnect: Lpwsprecvdisconnect = null,
    public var lpWSPRecvFrom: Lpwsprecvfrom = null,
    public var lpWSPSelect: Lpwspselect = null,
    public var lpWSPSend: Lpwspsend = null,
    public var lpWSPSendDisconnect: Lpwspsenddisconnect = null,
    public var lpWSPSendTo: Lpwspsendto = null,
    public var lpWSPSetSockOpt: Lpwspsetsockopt = null,
    public var lpWSPShutdown: Lpwspshutdown = null,
    public var lpWSPSocket: Lpwspsocket = null,
    public var lpWSPStringToAddress: Lpwspstringtoaddress = null,
)

public data class Wspupcalltable(
    public var lpWPUCloseEvent: Lpwpucloseevent = null,
    public var lpWPUCloseSocketHandle: Lpwpuclosesockethandle = null,
    public var lpWPUCreateEvent: Lpwpucreateevent = null,
    public var lpWPUCreateSocketHandle: Lpwpucreatesockethandle = null,
    public var lpWPUFDIsSet: Lpwpufdisset = null,
    public var lpWPUGetProviderPath: Lpwpugetproviderpath = null,
    public var lpWPUModifyIFSHandle: Lpwpumodifyifshandle = null,
    public var lpWPUPostMessage: Lpwpupostmessage = null,
    public var lpWPUQueryBlockingCallback: Lpwpuqueryblockingcallback = null,
    public var lpWPUQuerySocketHandleContext: Lpwpuquerysockethandlecontext = null,
    public var lpWPUQueueApc: Lpwpuqueueapc = null,
    public var lpWPUResetEvent: Lpwpuresetevent = null,
    public var lpWPUSetEvent: Lpwpusetevent = null,
    public var lpWPUOpenCurrentThread: Lpwpuopencurrentthread = null,
    public var lpWPUCloseThread: Lpwpuclosethread = null,
)

public class Netent internal constructor(
    nNameCtorArg: Pstr,
    nAliasesCtorArg: MutPtr<MutPtr<Byte>>,
    public var nAddrtype: Short,
    public var nNet: UInt,
) {
    public var nName: Pstr = nNameCtorArg
        internal set

    public var nAliases: MutPtr<MutPtr<Byte>> = nAliasesCtorArg
        internal set

    public constructor() : this(
        nNameCtorArg = MutPtr(0L),
        nAliasesCtorArg = MutPtr(0L),
        nAddrtype = 0,
        nNet = 0u,
    )

    public operator fun component1(): Pstr = this.nName

    public operator fun component2(): MutPtr<MutPtr<Byte>> = this.nAliases

    public operator fun component3(): Short = this.nAddrtype

    public operator fun component4(): UInt = this.nNet

    public fun copy(nName: Pstr = this.nName, nAliases: MutPtr<MutPtr<Byte>> = this.nAliases, nAddrtype: Short = this.nAddrtype, nNet: UInt = this.nNet): Netent = Netent(nNameCtorArg = nName, nAliasesCtorArg = nAliases, nAddrtype = nAddrtype, nNet = nNet)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Netent) return false
        if (this.nName != other.nName) return false
        if (this.nAliases != other.nAliases) return false
        if (this.nAddrtype != other.nAddrtype) return false
        if (this.nNet != other.nNet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nName.hashCode()
        result = 31 * result + this.nAliases.hashCode()
        result = 31 * result + this.nAddrtype.hashCode()
        result = 31 * result + this.nNet.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nName: Pstr = MutPtr(0L),
            nAliases: MutPtr<MutPtr<Byte>> = MutPtr(0L),
            nAddrtype: Short = 0,
            nNet: UInt = 0u,
        ): Netent =
            Netent(
                nNameCtorArg = nName,
                nAliasesCtorArg = nAliases,
                nAddrtype = nAddrtype,
                nNet = nNet,
            )
    }
}

public data class SockaddrGen(
    public var address: Sockaddr = Sockaddr(),
    public var addressIn: SockaddrIn = SockaddrIn(),
    public var addressIn6: SockaddrIn6Old = SockaddrIn6Old(),
)

public data class SockaddrIn6Old(
    public var sin6Family: Short = 0,
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
)

public data class Sockproto(
    public var spFamily: UShort = 0u,
    public var spProtocol: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockproto> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockproto> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Sockproto =
                    Sockproto(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Sockproto) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.spFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.spProtocol)
                }
            }
    }
}

public data class TcpKeepalive(
    public var onoff: UInt = 0u,
    public var keepalivetime: UInt = 0u,
    public var keepaliveinterval: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpKeepalive> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpKeepalive> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TcpKeepalive =
                    TcpKeepalive(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TcpKeepalive) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.onoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keepalivetime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.keepaliveinterval)
                }
            }
    }
}
