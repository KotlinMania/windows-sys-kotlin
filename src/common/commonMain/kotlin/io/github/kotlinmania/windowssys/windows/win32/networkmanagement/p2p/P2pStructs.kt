@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Sockaddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrIn6
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddress
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertPublicKeyInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob

public data class DrtAddress(
    public var socketAddress: SockaddrStorage = SockaddrStorage(),
    public var flags: UInt = 0u,
    public var nearness: Int = 0,
    public var latency: UInt = 0u,
)

public data class DrtAddressList(
    public var addressCount: UInt = 0u,
    public var addressList: List<DrtAddress> = List(1) { DrtAddress() },
)

public class DrtBootstrapProvider internal constructor(
    pvContextCtorArg: MutPtr<CVoid>,
    public var attach: Int,
    public var detach: Int,
    public var initResolve: Int,
    public var issueResolve: Int,
    public var endResolve: Int,
    public var register: Int,
    public var unregister: Int,
) {
    public var pvContext: MutPtr<CVoid> = pvContextCtorArg
        internal set

    public constructor() : this(
        pvContextCtorArg = MutPtr(0L),
        attach = 0,
        detach = 0,
        initResolve = 0,
        issueResolve = 0,
        endResolve = 0,
        register = 0,
        unregister = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pvContext

    public operator fun component2(): Int = this.attach

    public operator fun component3(): Int = this.detach

    public operator fun component4(): Int = this.initResolve

    public operator fun component5(): Int = this.issueResolve

    public operator fun component6(): Int = this.endResolve

    public operator fun component7(): Int = this.register

    public operator fun component8(): Int = this.unregister

    public fun copy(pvContext: MutPtr<CVoid> = this.pvContext, attach: Int = this.attach, detach: Int = this.detach, initResolve: Int = this.initResolve, issueResolve: Int = this.issueResolve, endResolve: Int = this.endResolve, register: Int = this.register, unregister: Int = this.unregister): DrtBootstrapProvider = DrtBootstrapProvider(pvContextCtorArg = pvContext, attach = attach, detach = detach, initResolve = initResolve, issueResolve = issueResolve, endResolve = endResolve, register = register, unregister = unregister)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrtBootstrapProvider) return false
        if (this.pvContext != other.pvContext) return false
        if (this.attach != other.attach) return false
        if (this.detach != other.detach) return false
        if (this.initResolve != other.initResolve) return false
        if (this.issueResolve != other.issueResolve) return false
        if (this.endResolve != other.endResolve) return false
        if (this.register != other.register) return false
        if (this.unregister != other.unregister) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvContext.hashCode()
        result = 31 * result + this.attach.hashCode()
        result = 31 * result + this.detach.hashCode()
        result = 31 * result + this.initResolve.hashCode()
        result = 31 * result + this.issueResolve.hashCode()
        result = 31 * result + this.endResolve.hashCode()
        result = 31 * result + this.register.hashCode()
        result = 31 * result + this.unregister.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtBootstrapProvider> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtBootstrapProvider> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DrtBootstrapProvider =
                    DrtBootstrapProvider(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: DrtBootstrapProvider) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pvContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.attach)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.detach)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.initResolve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.issueResolve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.endResolve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.register)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.unregister)
                }
            }

        public operator fun invoke(
            pvContext: MutPtr<CVoid> = MutPtr(0L),
            attach: Int = 0,
            detach: Int = 0,
            initResolve: Int = 0,
            issueResolve: Int = 0,
            endResolve: Int = 0,
            register: Int = 0,
            unregister: Int = 0,
        ): DrtBootstrapProvider =
            DrtBootstrapProvider(
                pvContextCtorArg = pvContext,
                attach = attach,
                detach = detach,
                initResolve = initResolve,
                issueResolve = issueResolve,
                endResolve = endResolve,
                register = register,
                unregister = unregister,
            )
    }
}

public class DrtData internal constructor(
    public var cb: UInt,
    pbCtorArg: MutPtr<UByte>,
) {
    public var pb: MutPtr<UByte> = pbCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        pbCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): MutPtr<UByte> = this.pb

    public fun copy(cb: UInt = this.cb, pb: MutPtr<UByte> = this.pb): DrtData = DrtData(cb = cb, pbCtorArg = pb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrtData) return false
        if (this.cb != other.cb) return false
        if (this.pb != other.pb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.pb.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DrtData =
                    DrtData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DrtData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pb)
                }
            }

        public operator fun invoke(
            cb: UInt = 0u,
            pb: MutPtr<UByte> = MutPtr(0L),
        ): DrtData =
            DrtData(
                cb = cb,
                pbCtorArg = pb,
            )
    }
}

public class DrtEventData internal constructor(
    public var type: DrtEventType,
    public var hr: Hresult,
    pvContextCtorArg: MutPtr<CVoid>,
    public var anonymous: DrtEventData0,
) {
    public var pvContext: MutPtr<CVoid> = pvContextCtorArg
        internal set

    public constructor() : this(
        type = 0,
        hr = 0,
        pvContextCtorArg = MutPtr(0L),
        anonymous = DrtEventData0(),
    )

    public operator fun component1(): DrtEventType = this.type

    public operator fun component2(): Hresult = this.hr

    public operator fun component3(): MutPtr<CVoid> = this.pvContext

    public operator fun component4(): DrtEventData0 = this.anonymous

    public fun copy(type: DrtEventType = this.type, hr: Hresult = this.hr, pvContext: MutPtr<CVoid> = this.pvContext, anonymous: DrtEventData0 = this.anonymous): DrtEventData = DrtEventData(type = type, hr = hr, pvContextCtorArg = pvContext, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrtEventData) return false
        if (this.type != other.type) return false
        if (this.hr != other.hr) return false
        if (this.pvContext != other.pvContext) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.hr.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: DrtEventType = 0,
            hr: Hresult = 0,
            pvContext: MutPtr<CVoid> = MutPtr(0L),
            anonymous: DrtEventData0 = DrtEventData0(),
        ): DrtEventData =
            DrtEventData(
                type = type,
                hr = hr,
                pvContextCtorArg = pvContext,
                anonymous = anonymous,
            )
    }
}

public data class DrtEventData0(
    public var leafsetKeyChange: DrtEventData00 = DrtEventData00(),
    public var registrationStateChange: DrtEventData01 = DrtEventData01(),
    public var statusChange: DrtEventData02 = DrtEventData02(),
)

public data class DrtEventData00(
    public var change: DrtLeafsetKeyChangeType = 0,
    public var localKey: DrtData = DrtData(),
    public var remoteKey: DrtData = DrtData(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtEventData00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtEventData00> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DrtEventData00 =
                    DrtEventData00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (DrtData.typeLayout()).readNative(addr + 8L),
                        (DrtData.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DrtEventData00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.change)
                    (DrtData.typeLayout()).writeNative(addr + 8L, value.localKey)
                    (DrtData.typeLayout()).writeNative(addr + 24L, value.remoteKey)
                }
            }
    }
}

public data class DrtEventData01(
    public var state: DrtRegistrationState = 0,
    public var localKey: DrtData = DrtData(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtEventData01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtEventData01> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DrtEventData01 =
                    DrtEventData01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (DrtData.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DrtEventData01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.state)
                    (DrtData.typeLayout()).writeNative(addr + 8L, value.localKey)
                }
            }
    }
}

public data class DrtEventData02(
    public var status: DrtStatus = 0,
    public var bootstrapAddresses: DrtEventData020 = DrtEventData020(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtEventData02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtEventData02> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DrtEventData02 =
                    DrtEventData02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (DrtEventData020.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DrtEventData02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.status)
                    (DrtEventData020.typeLayout()).writeNative(addr + 8L, value.bootstrapAddresses)
                }
            }
    }
}

public class DrtEventData020 internal constructor(
    public var cntAddress: UInt,
    pAddressesCtorArg: MutPtr<SockaddrStorage>,
) {
    public var pAddresses: MutPtr<SockaddrStorage> = pAddressesCtorArg
        internal set

    public constructor() : this(
        cntAddress = 0u,
        pAddressesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cntAddress

    public operator fun component2(): MutPtr<SockaddrStorage> = this.pAddresses

    public fun copy(cntAddress: UInt = this.cntAddress, pAddresses: MutPtr<SockaddrStorage> = this.pAddresses): DrtEventData020 = DrtEventData020(cntAddress = cntAddress, pAddressesCtorArg = pAddresses)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrtEventData020) return false
        if (this.cntAddress != other.cntAddress) return false
        if (this.pAddresses != other.pAddresses) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cntAddress.hashCode()
        result = 31 * result + this.pAddresses.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtEventData020> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtEventData020> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DrtEventData020 =
                    DrtEventData020(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SockaddrStorage>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DrtEventData020) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cntAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SockaddrStorage>(64)
                    ).writeNative(addr + 8L, value.pAddresses)
                }
            }

        public operator fun invoke(
            cntAddress: UInt = 0u,
            pAddresses: MutPtr<SockaddrStorage> = MutPtr(0L),
        ): DrtEventData020 =
            DrtEventData020(
                cntAddress = cntAddress,
                pAddressesCtorArg = pAddresses,
            )
    }
}

public data class DrtRegistration(
    public var key: DrtData = DrtData(),
    public var appData: DrtData = DrtData(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtRegistration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtRegistration> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DrtRegistration =
                    DrtRegistration(
                        (DrtData.typeLayout()).readNative(addr),
                        (DrtData.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DrtRegistration) {
                    (DrtData.typeLayout()).writeNative(addr, value.key)
                    (DrtData.typeLayout()).writeNative(addr + 16L, value.appData)
                }
            }
    }
}

public class DrtSearchInfo internal constructor(
    public var dwSize: UInt,
    public var fIterative: Bool,
    public var fAllowCurrentInstanceMatch: Bool,
    public var fAnyMatchInRange: Bool,
    public var cMaxEndpoints: UInt,
    pMaximumKeyCtorArg: MutPtr<DrtData>,
    pMinimumKeyCtorArg: MutPtr<DrtData>,
) {
    public var pMaximumKey: MutPtr<DrtData> = pMaximumKeyCtorArg
        internal set

    public var pMinimumKey: MutPtr<DrtData> = pMinimumKeyCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        fIterative = 0,
        fAllowCurrentInstanceMatch = 0,
        fAnyMatchInRange = 0,
        cMaxEndpoints = 0u,
        pMaximumKeyCtorArg = MutPtr(0L),
        pMinimumKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Bool = this.fIterative

    public operator fun component3(): Bool = this.fAllowCurrentInstanceMatch

    public operator fun component4(): Bool = this.fAnyMatchInRange

    public operator fun component5(): UInt = this.cMaxEndpoints

    public operator fun component6(): MutPtr<DrtData> = this.pMaximumKey

    public operator fun component7(): MutPtr<DrtData> = this.pMinimumKey

    public fun copy(dwSize: UInt = this.dwSize, fIterative: Bool = this.fIterative, fAllowCurrentInstanceMatch: Bool = this.fAllowCurrentInstanceMatch, fAnyMatchInRange: Bool = this.fAnyMatchInRange, cMaxEndpoints: UInt = this.cMaxEndpoints, pMaximumKey: MutPtr<DrtData> = this.pMaximumKey, pMinimumKey: MutPtr<DrtData> = this.pMinimumKey): DrtSearchInfo = DrtSearchInfo(dwSize = dwSize, fIterative = fIterative, fAllowCurrentInstanceMatch = fAllowCurrentInstanceMatch, fAnyMatchInRange = fAnyMatchInRange, cMaxEndpoints = cMaxEndpoints, pMaximumKeyCtorArg = pMaximumKey, pMinimumKeyCtorArg = pMinimumKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrtSearchInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.fIterative != other.fIterative) return false
        if (this.fAllowCurrentInstanceMatch != other.fAllowCurrentInstanceMatch) return false
        if (this.fAnyMatchInRange != other.fAnyMatchInRange) return false
        if (this.cMaxEndpoints != other.cMaxEndpoints) return false
        if (this.pMaximumKey != other.pMaximumKey) return false
        if (this.pMinimumKey != other.pMinimumKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.fIterative.hashCode()
        result = 31 * result + this.fAllowCurrentInstanceMatch.hashCode()
        result = 31 * result + this.fAnyMatchInRange.hashCode()
        result = 31 * result + this.cMaxEndpoints.hashCode()
        result = 31 * result + this.pMaximumKey.hashCode()
        result = 31 * result + this.pMinimumKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            fIterative: Bool = 0,
            fAllowCurrentInstanceMatch: Bool = 0,
            fAnyMatchInRange: Bool = 0,
            cMaxEndpoints: UInt = 0u,
            pMaximumKey: MutPtr<DrtData> = MutPtr(0L),
            pMinimumKey: MutPtr<DrtData> = MutPtr(0L),
        ): DrtSearchInfo =
            DrtSearchInfo(
                dwSize = dwSize,
                fIterative = fIterative,
                fAllowCurrentInstanceMatch = fAllowCurrentInstanceMatch,
                fAnyMatchInRange = fAnyMatchInRange,
                cMaxEndpoints = cMaxEndpoints,
                pMaximumKeyCtorArg = pMaximumKey,
                pMinimumKeyCtorArg = pMinimumKey,
            )
    }
}

public class DrtSearchResult internal constructor(
    public var dwSize: UInt,
    public var type: DrtMatchType,
    pvContextCtorArg: MutPtr<CVoid>,
    public var registration: DrtRegistration,
) {
    public var pvContext: MutPtr<CVoid> = pvContextCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        type = 0,
        pvContextCtorArg = MutPtr(0L),
        registration = DrtRegistration(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): DrtMatchType = this.type

    public operator fun component3(): MutPtr<CVoid> = this.pvContext

    public operator fun component4(): DrtRegistration = this.registration

    public fun copy(dwSize: UInt = this.dwSize, type: DrtMatchType = this.type, pvContext: MutPtr<CVoid> = this.pvContext, registration: DrtRegistration = this.registration): DrtSearchResult = DrtSearchResult(dwSize = dwSize, type = type, pvContextCtorArg = pvContext, registration = registration)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrtSearchResult) return false
        if (this.dwSize != other.dwSize) return false
        if (this.type != other.type) return false
        if (this.pvContext != other.pvContext) return false
        if (this.registration != other.registration) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        result = 31 * result + this.registration.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtSearchResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtSearchResult> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DrtSearchResult =
                    DrtSearchResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (DrtRegistration.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DrtSearchResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pvContext)
                    (DrtRegistration.typeLayout()).writeNative(addr + 16L, value.registration)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            type: DrtMatchType = 0,
            pvContext: MutPtr<CVoid> = MutPtr(0L),
            registration: DrtRegistration = DrtRegistration(),
        ): DrtSearchResult =
            DrtSearchResult(
                dwSize = dwSize,
                type = type,
                pvContextCtorArg = pvContext,
                registration = registration,
            )
    }
}

public class DrtSecurityProvider internal constructor(
    pvContextCtorArg: MutPtr<CVoid>,
    public var attach: Int,
    public var detach: Int,
    public var registerKey: Int,
    public var unregisterKey: Int,
    public var validateAndUnpackPayload: Int,
    public var secureAndPackPayload: Int,
    public var freeData: Int,
    public var encryptData: Int,
    public var decryptData: Int,
    public var getSerializedCredential: Int,
    public var validateRemoteCredential: Int,
    public var signData: Int,
    public var verifyData: Int,
) {
    public var pvContext: MutPtr<CVoid> = pvContextCtorArg
        internal set

    public constructor() : this(
        pvContextCtorArg = MutPtr(0L),
        attach = 0,
        detach = 0,
        registerKey = 0,
        unregisterKey = 0,
        validateAndUnpackPayload = 0,
        secureAndPackPayload = 0,
        freeData = 0,
        encryptData = 0,
        decryptData = 0,
        getSerializedCredential = 0,
        validateRemoteCredential = 0,
        signData = 0,
        verifyData = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pvContext

    public operator fun component2(): Int = this.attach

    public operator fun component3(): Int = this.detach

    public operator fun component4(): Int = this.registerKey

    public operator fun component5(): Int = this.unregisterKey

    public operator fun component6(): Int = this.validateAndUnpackPayload

    public operator fun component7(): Int = this.secureAndPackPayload

    public operator fun component8(): Int = this.freeData

    public operator fun component9(): Int = this.encryptData

    public operator fun component10(): Int = this.decryptData

    public operator fun component11(): Int = this.getSerializedCredential

    public operator fun component12(): Int = this.validateRemoteCredential

    public operator fun component13(): Int = this.signData

    public operator fun component14(): Int = this.verifyData

    public fun copy(pvContext: MutPtr<CVoid> = this.pvContext, attach: Int = this.attach, detach: Int = this.detach, registerKey: Int = this.registerKey, unregisterKey: Int = this.unregisterKey, validateAndUnpackPayload: Int = this.validateAndUnpackPayload, secureAndPackPayload: Int = this.secureAndPackPayload, freeData: Int = this.freeData, encryptData: Int = this.encryptData, decryptData: Int = this.decryptData, getSerializedCredential: Int = this.getSerializedCredential, validateRemoteCredential: Int = this.validateRemoteCredential, signData: Int = this.signData, verifyData: Int = this.verifyData): DrtSecurityProvider = DrtSecurityProvider(pvContextCtorArg = pvContext, attach = attach, detach = detach, registerKey = registerKey, unregisterKey = unregisterKey, validateAndUnpackPayload = validateAndUnpackPayload, secureAndPackPayload = secureAndPackPayload, freeData = freeData, encryptData = encryptData, decryptData = decryptData, getSerializedCredential = getSerializedCredential, validateRemoteCredential = validateRemoteCredential, signData = signData, verifyData = verifyData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrtSecurityProvider) return false
        if (this.pvContext != other.pvContext) return false
        if (this.attach != other.attach) return false
        if (this.detach != other.detach) return false
        if (this.registerKey != other.registerKey) return false
        if (this.unregisterKey != other.unregisterKey) return false
        if (this.validateAndUnpackPayload != other.validateAndUnpackPayload) return false
        if (this.secureAndPackPayload != other.secureAndPackPayload) return false
        if (this.freeData != other.freeData) return false
        if (this.encryptData != other.encryptData) return false
        if (this.decryptData != other.decryptData) return false
        if (this.getSerializedCredential != other.getSerializedCredential) return false
        if (this.validateRemoteCredential != other.validateRemoteCredential) return false
        if (this.signData != other.signData) return false
        if (this.verifyData != other.verifyData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvContext.hashCode()
        result = 31 * result + this.attach.hashCode()
        result = 31 * result + this.detach.hashCode()
        result = 31 * result + this.registerKey.hashCode()
        result = 31 * result + this.unregisterKey.hashCode()
        result = 31 * result + this.validateAndUnpackPayload.hashCode()
        result = 31 * result + this.secureAndPackPayload.hashCode()
        result = 31 * result + this.freeData.hashCode()
        result = 31 * result + this.encryptData.hashCode()
        result = 31 * result + this.decryptData.hashCode()
        result = 31 * result + this.getSerializedCredential.hashCode()
        result = 31 * result + this.validateRemoteCredential.hashCode()
        result = 31 * result + this.signData.hashCode()
        result = 31 * result + this.verifyData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtSecurityProvider> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrtSecurityProvider> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DrtSecurityProvider =
                    DrtSecurityProvider(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: DrtSecurityProvider) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pvContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.attach)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.detach)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.registerKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.unregisterKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.validateAndUnpackPayload)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.secureAndPackPayload)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.freeData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.encryptData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.decryptData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.getSerializedCredential)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.validateRemoteCredential)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.signData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.verifyData)
                }
            }

        public operator fun invoke(
            pvContext: MutPtr<CVoid> = MutPtr(0L),
            attach: Int = 0,
            detach: Int = 0,
            registerKey: Int = 0,
            unregisterKey: Int = 0,
            validateAndUnpackPayload: Int = 0,
            secureAndPackPayload: Int = 0,
            freeData: Int = 0,
            encryptData: Int = 0,
            decryptData: Int = 0,
            getSerializedCredential: Int = 0,
            validateRemoteCredential: Int = 0,
            signData: Int = 0,
            verifyData: Int = 0,
        ): DrtSecurityProvider =
            DrtSecurityProvider(
                pvContextCtorArg = pvContext,
                attach = attach,
                detach = detach,
                registerKey = registerKey,
                unregisterKey = unregisterKey,
                validateAndUnpackPayload = validateAndUnpackPayload,
                secureAndPackPayload = secureAndPackPayload,
                freeData = freeData,
                encryptData = encryptData,
                decryptData = decryptData,
                getSerializedCredential = getSerializedCredential,
                validateRemoteCredential = validateRemoteCredential,
                signData = signData,
                verifyData = verifyData,
            )
    }
}

public class DrtSettings internal constructor(
    public var dwSize: UInt,
    public var cbKey: UInt,
    public var bProtocolMajorVersion: UByte,
    public var bProtocolMinorVersion: UByte,
    public var ulMaxRoutingAddresses: UInt,
    pwzDrtInstancePrefixCtorArg: Pwstr,
    hTransportCtorArg: MutPtr<CVoid>,
    pSecurityProviderCtorArg: MutPtr<DrtSecurityProvider>,
    pBootstrapProviderCtorArg: MutPtr<DrtBootstrapProvider>,
    public var eSecurityMode: DrtSecurityMode,
) {
    public var pwzDrtInstancePrefix: Pwstr = pwzDrtInstancePrefixCtorArg
        internal set

    public var hTransport: MutPtr<CVoid> = hTransportCtorArg
        internal set

    public var pSecurityProvider: MutPtr<DrtSecurityProvider> = pSecurityProviderCtorArg
        internal set

    public var pBootstrapProvider: MutPtr<DrtBootstrapProvider> = pBootstrapProviderCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        cbKey = 0u,
        bProtocolMajorVersion = 0u,
        bProtocolMinorVersion = 0u,
        ulMaxRoutingAddresses = 0u,
        pwzDrtInstancePrefixCtorArg = MutPtr(0L),
        hTransportCtorArg = MutPtr(0L),
        pSecurityProviderCtorArg = MutPtr(0L),
        pBootstrapProviderCtorArg = MutPtr(0L),
        eSecurityMode = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.cbKey

    public operator fun component3(): UByte = this.bProtocolMajorVersion

    public operator fun component4(): UByte = this.bProtocolMinorVersion

    public operator fun component5(): UInt = this.ulMaxRoutingAddresses

    public operator fun component6(): Pwstr = this.pwzDrtInstancePrefix

    public operator fun component7(): MutPtr<CVoid> = this.hTransport

    public operator fun component8(): MutPtr<DrtSecurityProvider> = this.pSecurityProvider

    public operator fun component9(): MutPtr<DrtBootstrapProvider> = this.pBootstrapProvider

    public operator fun component10(): DrtSecurityMode = this.eSecurityMode

    public fun copy(dwSize: UInt = this.dwSize, cbKey: UInt = this.cbKey, bProtocolMajorVersion: UByte = this.bProtocolMajorVersion, bProtocolMinorVersion: UByte = this.bProtocolMinorVersion, ulMaxRoutingAddresses: UInt = this.ulMaxRoutingAddresses, pwzDrtInstancePrefix: Pwstr = this.pwzDrtInstancePrefix, hTransport: MutPtr<CVoid> = this.hTransport, pSecurityProvider: MutPtr<DrtSecurityProvider> = this.pSecurityProvider, pBootstrapProvider: MutPtr<DrtBootstrapProvider> = this.pBootstrapProvider, eSecurityMode: DrtSecurityMode = this.eSecurityMode): DrtSettings = DrtSettings(dwSize = dwSize, cbKey = cbKey, bProtocolMajorVersion = bProtocolMajorVersion, bProtocolMinorVersion = bProtocolMinorVersion, ulMaxRoutingAddresses = ulMaxRoutingAddresses, pwzDrtInstancePrefixCtorArg = pwzDrtInstancePrefix, hTransportCtorArg = hTransport, pSecurityProviderCtorArg = pSecurityProvider, pBootstrapProviderCtorArg = pBootstrapProvider, eSecurityMode = eSecurityMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrtSettings) return false
        if (this.dwSize != other.dwSize) return false
        if (this.cbKey != other.cbKey) return false
        if (this.bProtocolMajorVersion != other.bProtocolMajorVersion) return false
        if (this.bProtocolMinorVersion != other.bProtocolMinorVersion) return false
        if (this.ulMaxRoutingAddresses != other.ulMaxRoutingAddresses) return false
        if (this.pwzDrtInstancePrefix != other.pwzDrtInstancePrefix) return false
        if (this.hTransport != other.hTransport) return false
        if (this.pSecurityProvider != other.pSecurityProvider) return false
        if (this.pBootstrapProvider != other.pBootstrapProvider) return false
        if (this.eSecurityMode != other.eSecurityMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.bProtocolMajorVersion.hashCode()
        result = 31 * result + this.bProtocolMinorVersion.hashCode()
        result = 31 * result + this.ulMaxRoutingAddresses.hashCode()
        result = 31 * result + this.pwzDrtInstancePrefix.hashCode()
        result = 31 * result + this.hTransport.hashCode()
        result = 31 * result + this.pSecurityProvider.hashCode()
        result = 31 * result + this.pBootstrapProvider.hashCode()
        result = 31 * result + this.eSecurityMode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            cbKey: UInt = 0u,
            bProtocolMajorVersion: UByte = 0u,
            bProtocolMinorVersion: UByte = 0u,
            ulMaxRoutingAddresses: UInt = 0u,
            pwzDrtInstancePrefix: Pwstr = MutPtr(0L),
            hTransport: MutPtr<CVoid> = MutPtr(0L),
            pSecurityProvider: MutPtr<DrtSecurityProvider> = MutPtr(0L),
            pBootstrapProvider: MutPtr<DrtBootstrapProvider> = MutPtr(0L),
            eSecurityMode: DrtSecurityMode = 0,
        ): DrtSettings =
            DrtSettings(
                dwSize = dwSize,
                cbKey = cbKey,
                bProtocolMajorVersion = bProtocolMajorVersion,
                bProtocolMinorVersion = bProtocolMinorVersion,
                ulMaxRoutingAddresses = ulMaxRoutingAddresses,
                pwzDrtInstancePrefixCtorArg = pwzDrtInstancePrefix,
                hTransportCtorArg = hTransport,
                pSecurityProviderCtorArg = pSecurityProvider,
                pBootstrapProviderCtorArg = pBootstrapProvider,
                eSecurityMode = eSecurityMode,
            )
    }
}

public data class PeerdistClientBasicInfo(
    public var fFlashCrowd: Bool = 0,
)

public data class PeerdistContentTag(
    public var data: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerdistContentTag) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerdistContentTag> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerdistContentTag> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PeerdistContentTag =
                    PeerdistContentTag(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PeerdistContentTag) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.data)
                }
            }
    }
}

public data class PeerdistPublicationOptions(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerdistPublicationOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerdistPublicationOptions> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PeerdistPublicationOptions =
                    PeerdistPublicationOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PeerdistPublicationOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public data class PeerdistRetrievalOptions(
    public var cbSize: UInt = 0u,
    public var dwContentInfoMinVersion: UInt = 0u,
    public var dwContentInfoMaxVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerdistRetrievalOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerdistRetrievalOptions> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PeerdistRetrievalOptions =
                    PeerdistRetrievalOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PeerdistRetrievalOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwContentInfoMinVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwContentInfoMaxVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwReserved)
                }
            }
    }
}

public data class PeerdistStatusInfo(
    public var cbSize: UInt = 0u,
    public var status: PeerdistStatus = 0,
    public var dwMinVer: PeerdistRetrievalOptionsContentinfoVersionValue = 0u,
    public var dwMaxVer: PeerdistRetrievalOptionsContentinfoVersionValue = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerdistStatusInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerdistStatusInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PeerdistStatusInfo =
                    PeerdistStatusInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PeerdistStatusInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMinVer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMaxVer)
                }
            }
    }
}

public data class PeerAddress(
    public var dwSize: UInt = 0u,
    public var sin6: SockaddrIn6 = SockaddrIn6(),
)

public class PeerApplication internal constructor(
    public var id: Guid,
    public var data: PeerData,
    pwzDescriptionCtorArg: Pwstr,
) {
    public var pwzDescription: Pwstr = pwzDescriptionCtorArg
        internal set

    public constructor() : this(
        id = Guid(),
        data = PeerData(),
        pwzDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.id

    public operator fun component2(): PeerData = this.data

    public operator fun component3(): Pwstr = this.pwzDescription

    public fun copy(id: Guid = this.id, data: PeerData = this.data, pwzDescription: Pwstr = this.pwzDescription): PeerApplication = PeerApplication(id = id, data = data, pwzDescriptionCtorArg = pwzDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerApplication) return false
        if (this.id != other.id) return false
        if (this.data != other.data) return false
        if (this.pwzDescription != other.pwzDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.pwzDescription.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            id: Guid = Guid(),
            data: PeerData = PeerData(),
            pwzDescription: Pwstr = MutPtr(0L),
        ): PeerApplication =
            PeerApplication(
                id = id,
                data = data,
                pwzDescriptionCtorArg = pwzDescription,
            )
    }
}

public class PeerApplicationRegistrationInfo internal constructor(
    public var application: PeerApplication,
    pwzApplicationToLaunchCtorArg: Pwstr,
    pwzApplicationArgumentsCtorArg: Pwstr,
    public var dwPublicationScope: UInt,
) {
    public var pwzApplicationToLaunch: Pwstr = pwzApplicationToLaunchCtorArg
        internal set

    public var pwzApplicationArguments: Pwstr = pwzApplicationArgumentsCtorArg
        internal set

    public constructor() : this(
        application = PeerApplication(),
        pwzApplicationToLaunchCtorArg = MutPtr(0L),
        pwzApplicationArgumentsCtorArg = MutPtr(0L),
        dwPublicationScope = 0u,
    )

    public operator fun component1(): PeerApplication = this.application

    public operator fun component2(): Pwstr = this.pwzApplicationToLaunch

    public operator fun component3(): Pwstr = this.pwzApplicationArguments

    public operator fun component4(): UInt = this.dwPublicationScope

    public fun copy(application: PeerApplication = this.application, pwzApplicationToLaunch: Pwstr = this.pwzApplicationToLaunch, pwzApplicationArguments: Pwstr = this.pwzApplicationArguments, dwPublicationScope: UInt = this.dwPublicationScope): PeerApplicationRegistrationInfo = PeerApplicationRegistrationInfo(application = application, pwzApplicationToLaunchCtorArg = pwzApplicationToLaunch, pwzApplicationArgumentsCtorArg = pwzApplicationArguments, dwPublicationScope = dwPublicationScope)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerApplicationRegistrationInfo) return false
        if (this.application != other.application) return false
        if (this.pwzApplicationToLaunch != other.pwzApplicationToLaunch) return false
        if (this.pwzApplicationArguments != other.pwzApplicationArguments) return false
        if (this.dwPublicationScope != other.dwPublicationScope) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.application.hashCode()
        result = 31 * result + this.pwzApplicationToLaunch.hashCode()
        result = 31 * result + this.pwzApplicationArguments.hashCode()
        result = 31 * result + this.dwPublicationScope.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            application: PeerApplication = PeerApplication(),
            pwzApplicationToLaunch: Pwstr = MutPtr(0L),
            pwzApplicationArguments: Pwstr = MutPtr(0L),
            dwPublicationScope: UInt = 0u,
        ): PeerApplicationRegistrationInfo =
            PeerApplicationRegistrationInfo(
                application = application,
                pwzApplicationToLaunchCtorArg = pwzApplicationToLaunch,
                pwzApplicationArgumentsCtorArg = pwzApplicationArguments,
                dwPublicationScope = dwPublicationScope,
            )
    }
}

public class PeerAppLaunchInfo internal constructor(
    pContactCtorArg: MutPtr<PeerContact>,
    pEndpointCtorArg: MutPtr<PeerEndpoint>,
    pInvitationCtorArg: MutPtr<PeerInvitation>,
) {
    public var pContact: MutPtr<PeerContact> = pContactCtorArg
        internal set

    public var pEndpoint: MutPtr<PeerEndpoint> = pEndpointCtorArg
        internal set

    public var pInvitation: MutPtr<PeerInvitation> = pInvitationCtorArg
        internal set

    public constructor() : this(
        pContactCtorArg = MutPtr(0L),
        pEndpointCtorArg = MutPtr(0L),
        pInvitationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<PeerContact> = this.pContact

    public operator fun component2(): MutPtr<PeerEndpoint> = this.pEndpoint

    public operator fun component3(): MutPtr<PeerInvitation> = this.pInvitation

    public fun copy(pContact: MutPtr<PeerContact> = this.pContact, pEndpoint: MutPtr<PeerEndpoint> = this.pEndpoint, pInvitation: MutPtr<PeerInvitation> = this.pInvitation): PeerAppLaunchInfo = PeerAppLaunchInfo(pContactCtorArg = pContact, pEndpointCtorArg = pEndpoint, pInvitationCtorArg = pInvitation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerAppLaunchInfo) return false
        if (this.pContact != other.pContact) return false
        if (this.pEndpoint != other.pEndpoint) return false
        if (this.pInvitation != other.pInvitation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pContact.hashCode()
        result = 31 * result + this.pEndpoint.hashCode()
        result = 31 * result + this.pInvitation.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerAppLaunchInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerAppLaunchInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerAppLaunchInfo =
                    PeerAppLaunchInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerContact>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerEndpoint>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerInvitation>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PeerAppLaunchInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerContact>(64)
                    ).writeNative(addr, value.pContact)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerEndpoint>(64)
                    ).writeNative(addr + 8L, value.pEndpoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerInvitation>(64)
                    ).writeNative(addr + 16L, value.pInvitation)
                }
            }

        public operator fun invoke(
            pContact: MutPtr<PeerContact> = MutPtr(0L),
            pEndpoint: MutPtr<PeerEndpoint> = MutPtr(0L),
            pInvitation: MutPtr<PeerInvitation> = MutPtr(0L),
        ): PeerAppLaunchInfo =
            PeerAppLaunchInfo(
                pContactCtorArg = pContact,
                pEndpointCtorArg = pEndpoint,
                pInvitationCtorArg = pInvitation,
            )
    }
}

public data class PeerCollabEventData(
    public var eventType: PeerCollabEventType = 0,
    public var anonymous: PeerCollabEventData0 = PeerCollabEventData0(),
)

public data class PeerCollabEventData0(
    public var watchListChangedData: PeerEventWatchlistChangedData = PeerEventWatchlistChangedData(),
    public var presenceChangedData: PeerEventPresenceChangedData = PeerEventPresenceChangedData(),
    public var applicationChangedData: PeerEventApplicationChangedData = PeerEventApplicationChangedData(),
    public var objectChangedData: PeerEventObjectChangedData = PeerEventObjectChangedData(),
    public var endpointChangedData: PeerEventEndpointChangedData = PeerEventEndpointChangedData(),
    public var peopleNearMeChangedData: PeerEventPeopleNearMeChangedData = PeerEventPeopleNearMeChangedData(),
    public var requestStatusChangedData: PeerEventRequestStatusChangedData = PeerEventRequestStatusChangedData(),
)

public class PeerCollabEventRegistration internal constructor(
    public var eventType: PeerCollabEventType,
    pInstanceCtorArg: MutPtr<Guid>,
) {
    public var pInstance: MutPtr<Guid> = pInstanceCtorArg
        internal set

    public constructor() : this(
        eventType = 0,
        pInstanceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PeerCollabEventType = this.eventType

    public operator fun component2(): MutPtr<Guid> = this.pInstance

    public fun copy(eventType: PeerCollabEventType = this.eventType, pInstance: MutPtr<Guid> = this.pInstance): PeerCollabEventRegistration = PeerCollabEventRegistration(eventType = eventType, pInstanceCtorArg = pInstance)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerCollabEventRegistration) return false
        if (this.eventType != other.eventType) return false
        if (this.pInstance != other.pInstance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventType.hashCode()
        result = 31 * result + this.pInstance.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerCollabEventRegistration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerCollabEventRegistration> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerCollabEventRegistration =
                    PeerCollabEventRegistration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PeerCollabEventRegistration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.eventType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.pInstance)
                }
            }

        public operator fun invoke(
            eventType: PeerCollabEventType = 0,
            pInstance: MutPtr<Guid> = MutPtr(0L),
        ): PeerCollabEventRegistration =
            PeerCollabEventRegistration(
                eventType = eventType,
                pInstanceCtorArg = pInstance,
            )
    }
}

public class PeerConnectionInfo internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    public var ullConnectionId: ULong,
    public var ullNodeId: ULong,
    pwzPeerIdCtorArg: Pwstr,
    public var address: PeerAddress,
) {
    public var pwzPeerId: Pwstr = pwzPeerIdCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        ullConnectionId = 0uL,
        ullNodeId = 0uL,
        pwzPeerIdCtorArg = MutPtr(0L),
        address = PeerAddress(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): ULong = this.ullConnectionId

    public operator fun component4(): ULong = this.ullNodeId

    public operator fun component5(): Pwstr = this.pwzPeerId

    public operator fun component6(): PeerAddress = this.address

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, ullConnectionId: ULong = this.ullConnectionId, ullNodeId: ULong = this.ullNodeId, pwzPeerId: Pwstr = this.pwzPeerId, address: PeerAddress = this.address): PeerConnectionInfo = PeerConnectionInfo(dwSize = dwSize, dwFlags = dwFlags, ullConnectionId = ullConnectionId, ullNodeId = ullNodeId, pwzPeerIdCtorArg = pwzPeerId, address = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerConnectionInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.ullConnectionId != other.ullConnectionId) return false
        if (this.ullNodeId != other.ullNodeId) return false
        if (this.pwzPeerId != other.pwzPeerId) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.ullConnectionId.hashCode()
        result = 31 * result + this.ullNodeId.hashCode()
        result = 31 * result + this.pwzPeerId.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            ullConnectionId: ULong = 0uL,
            ullNodeId: ULong = 0uL,
            pwzPeerId: Pwstr = MutPtr(0L),
            address: PeerAddress = PeerAddress(),
        ): PeerConnectionInfo =
            PeerConnectionInfo(
                dwSize = dwSize,
                dwFlags = dwFlags,
                ullConnectionId = ullConnectionId,
                ullNodeId = ullNodeId,
                pwzPeerIdCtorArg = pwzPeerId,
                address = address,
            )
    }
}

public class PeerContact internal constructor(
    pwzPeerNameCtorArg: Pwstr,
    pwzNickNameCtorArg: Pwstr,
    pwzDisplayNameCtorArg: Pwstr,
    pwzEmailAddressCtorArg: Pwstr,
    public var fWatch: Bool,
    public var watcherPermissions: PeerWatchPermission,
    public var credentials: PeerData,
) {
    public var pwzPeerName: Pwstr = pwzPeerNameCtorArg
        internal set

    public var pwzNickName: Pwstr = pwzNickNameCtorArg
        internal set

    public var pwzDisplayName: Pwstr = pwzDisplayNameCtorArg
        internal set

    public var pwzEmailAddress: Pwstr = pwzEmailAddressCtorArg
        internal set

    public constructor() : this(
        pwzPeerNameCtorArg = MutPtr(0L),
        pwzNickNameCtorArg = MutPtr(0L),
        pwzDisplayNameCtorArg = MutPtr(0L),
        pwzEmailAddressCtorArg = MutPtr(0L),
        fWatch = 0,
        watcherPermissions = 0,
        credentials = PeerData(),
    )

    public operator fun component1(): Pwstr = this.pwzPeerName

    public operator fun component2(): Pwstr = this.pwzNickName

    public operator fun component3(): Pwstr = this.pwzDisplayName

    public operator fun component4(): Pwstr = this.pwzEmailAddress

    public operator fun component5(): Bool = this.fWatch

    public operator fun component6(): PeerWatchPermission = this.watcherPermissions

    public operator fun component7(): PeerData = this.credentials

    public fun copy(pwzPeerName: Pwstr = this.pwzPeerName, pwzNickName: Pwstr = this.pwzNickName, pwzDisplayName: Pwstr = this.pwzDisplayName, pwzEmailAddress: Pwstr = this.pwzEmailAddress, fWatch: Bool = this.fWatch, watcherPermissions: PeerWatchPermission = this.watcherPermissions, credentials: PeerData = this.credentials): PeerContact = PeerContact(pwzPeerNameCtorArg = pwzPeerName, pwzNickNameCtorArg = pwzNickName, pwzDisplayNameCtorArg = pwzDisplayName, pwzEmailAddressCtorArg = pwzEmailAddress, fWatch = fWatch, watcherPermissions = watcherPermissions, credentials = credentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerContact) return false
        if (this.pwzPeerName != other.pwzPeerName) return false
        if (this.pwzNickName != other.pwzNickName) return false
        if (this.pwzDisplayName != other.pwzDisplayName) return false
        if (this.pwzEmailAddress != other.pwzEmailAddress) return false
        if (this.fWatch != other.fWatch) return false
        if (this.watcherPermissions != other.watcherPermissions) return false
        if (this.credentials != other.credentials) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwzPeerName.hashCode()
        result = 31 * result + this.pwzNickName.hashCode()
        result = 31 * result + this.pwzDisplayName.hashCode()
        result = 31 * result + this.pwzEmailAddress.hashCode()
        result = 31 * result + this.fWatch.hashCode()
        result = 31 * result + this.watcherPermissions.hashCode()
        result = 31 * result + this.credentials.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwzPeerName: Pwstr = MutPtr(0L),
            pwzNickName: Pwstr = MutPtr(0L),
            pwzDisplayName: Pwstr = MutPtr(0L),
            pwzEmailAddress: Pwstr = MutPtr(0L),
            fWatch: Bool = 0,
            watcherPermissions: PeerWatchPermission = 0,
            credentials: PeerData = PeerData(),
        ): PeerContact =
            PeerContact(
                pwzPeerNameCtorArg = pwzPeerName,
                pwzNickNameCtorArg = pwzNickName,
                pwzDisplayNameCtorArg = pwzDisplayName,
                pwzEmailAddressCtorArg = pwzEmailAddress,
                fWatch = fWatch,
                watcherPermissions = watcherPermissions,
                credentials = credentials,
            )
    }
}

public class PeerCredentialInfo internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    pwzFriendlyNameCtorArg: Pwstr,
    pPublicKeyCtorArg: MutPtr<CertPublicKeyInfo>,
    pwzIssuerPeerNameCtorArg: Pwstr,
    pwzIssuerFriendlyNameCtorArg: Pwstr,
    public var ftValidityStart: Filetime,
    public var ftValidityEnd: Filetime,
    public var cRoles: UInt,
    pRolesCtorArg: MutPtr<Guid>,
) {
    public var pwzFriendlyName: Pwstr = pwzFriendlyNameCtorArg
        internal set

    public var pPublicKey: MutPtr<CertPublicKeyInfo> = pPublicKeyCtorArg
        internal set

    public var pwzIssuerPeerName: Pwstr = pwzIssuerPeerNameCtorArg
        internal set

    public var pwzIssuerFriendlyName: Pwstr = pwzIssuerFriendlyNameCtorArg
        internal set

    public var pRoles: MutPtr<Guid> = pRolesCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        pwzFriendlyNameCtorArg = MutPtr(0L),
        pPublicKeyCtorArg = MutPtr(0L),
        pwzIssuerPeerNameCtorArg = MutPtr(0L),
        pwzIssuerFriendlyNameCtorArg = MutPtr(0L),
        ftValidityStart = Filetime(),
        ftValidityEnd = Filetime(),
        cRoles = 0u,
        pRolesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pwstr = this.pwzFriendlyName

    public operator fun component4(): MutPtr<CertPublicKeyInfo> = this.pPublicKey

    public operator fun component5(): Pwstr = this.pwzIssuerPeerName

    public operator fun component6(): Pwstr = this.pwzIssuerFriendlyName

    public operator fun component7(): Filetime = this.ftValidityStart

    public operator fun component8(): Filetime = this.ftValidityEnd

    public operator fun component9(): UInt = this.cRoles

    public operator fun component10(): MutPtr<Guid> = this.pRoles

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, pwzFriendlyName: Pwstr = this.pwzFriendlyName, pPublicKey: MutPtr<CertPublicKeyInfo> = this.pPublicKey, pwzIssuerPeerName: Pwstr = this.pwzIssuerPeerName, pwzIssuerFriendlyName: Pwstr = this.pwzIssuerFriendlyName, ftValidityStart: Filetime = this.ftValidityStart, ftValidityEnd: Filetime = this.ftValidityEnd, cRoles: UInt = this.cRoles, pRoles: MutPtr<Guid> = this.pRoles): PeerCredentialInfo = PeerCredentialInfo(dwSize = dwSize, dwFlags = dwFlags, pwzFriendlyNameCtorArg = pwzFriendlyName, pPublicKeyCtorArg = pPublicKey, pwzIssuerPeerNameCtorArg = pwzIssuerPeerName, pwzIssuerFriendlyNameCtorArg = pwzIssuerFriendlyName, ftValidityStart = ftValidityStart, ftValidityEnd = ftValidityEnd, cRoles = cRoles, pRolesCtorArg = pRoles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerCredentialInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pwzFriendlyName != other.pwzFriendlyName) return false
        if (this.pPublicKey != other.pPublicKey) return false
        if (this.pwzIssuerPeerName != other.pwzIssuerPeerName) return false
        if (this.pwzIssuerFriendlyName != other.pwzIssuerFriendlyName) return false
        if (this.ftValidityStart != other.ftValidityStart) return false
        if (this.ftValidityEnd != other.ftValidityEnd) return false
        if (this.cRoles != other.cRoles) return false
        if (this.pRoles != other.pRoles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pwzFriendlyName.hashCode()
        result = 31 * result + this.pPublicKey.hashCode()
        result = 31 * result + this.pwzIssuerPeerName.hashCode()
        result = 31 * result + this.pwzIssuerFriendlyName.hashCode()
        result = 31 * result + this.ftValidityStart.hashCode()
        result = 31 * result + this.ftValidityEnd.hashCode()
        result = 31 * result + this.cRoles.hashCode()
        result = 31 * result + this.pRoles.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            pwzFriendlyName: Pwstr = MutPtr(0L),
            pPublicKey: MutPtr<CertPublicKeyInfo> = MutPtr(0L),
            pwzIssuerPeerName: Pwstr = MutPtr(0L),
            pwzIssuerFriendlyName: Pwstr = MutPtr(0L),
            ftValidityStart: Filetime = Filetime(),
            ftValidityEnd: Filetime = Filetime(),
            cRoles: UInt = 0u,
            pRoles: MutPtr<Guid> = MutPtr(0L),
        ): PeerCredentialInfo =
            PeerCredentialInfo(
                dwSize = dwSize,
                dwFlags = dwFlags,
                pwzFriendlyNameCtorArg = pwzFriendlyName,
                pPublicKeyCtorArg = pPublicKey,
                pwzIssuerPeerNameCtorArg = pwzIssuerPeerName,
                pwzIssuerFriendlyNameCtorArg = pwzIssuerFriendlyName,
                ftValidityStart = ftValidityStart,
                ftValidityEnd = ftValidityEnd,
                cRoles = cRoles,
                pRolesCtorArg = pRoles,
            )
    }
}

public class PeerData internal constructor(
    public var cbData: UInt,
    pbDataCtorArg: MutPtr<UByte>,
) {
    public var pbData: MutPtr<UByte> = pbDataCtorArg
        internal set

    public constructor() : this(
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbData

    public operator fun component2(): MutPtr<UByte> = this.pbData

    public fun copy(cbData: UInt = this.cbData, pbData: MutPtr<UByte> = this.pbData): PeerData = PeerData(cbData = cbData, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerData) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerData =
                    PeerData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PeerData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbData)
                }
            }

        public operator fun invoke(
            cbData: UInt = 0u,
            pbData: MutPtr<UByte> = MutPtr(0L),
        ): PeerData =
            PeerData(
                cbData = cbData,
                pbDataCtorArg = pbData,
            )
    }
}

public class PeerEndpoint internal constructor(
    public var address: PeerAddress,
    pwzEndpointNameCtorArg: Pwstr,
) {
    public var pwzEndpointName: Pwstr = pwzEndpointNameCtorArg
        internal set

    public constructor() : this(
        address = PeerAddress(),
        pwzEndpointNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PeerAddress = this.address

    public operator fun component2(): Pwstr = this.pwzEndpointName

    public fun copy(address: PeerAddress = this.address, pwzEndpointName: Pwstr = this.pwzEndpointName): PeerEndpoint = PeerEndpoint(address = address, pwzEndpointNameCtorArg = pwzEndpointName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerEndpoint) return false
        if (this.address != other.address) return false
        if (this.pwzEndpointName != other.pwzEndpointName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.pwzEndpointName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            address: PeerAddress = PeerAddress(),
            pwzEndpointName: Pwstr = MutPtr(0L),
        ): PeerEndpoint =
            PeerEndpoint(
                address = address,
                pwzEndpointNameCtorArg = pwzEndpointName,
            )
    }
}

public class PeerEventApplicationChangedData internal constructor(
    pContactCtorArg: MutPtr<PeerContact>,
    pEndpointCtorArg: MutPtr<PeerEndpoint>,
    public var changeType: PeerChangeType,
    pApplicationCtorArg: MutPtr<PeerApplication>,
) {
    public var pContact: MutPtr<PeerContact> = pContactCtorArg
        internal set

    public var pEndpoint: MutPtr<PeerEndpoint> = pEndpointCtorArg
        internal set

    public var pApplication: MutPtr<PeerApplication> = pApplicationCtorArg
        internal set

    public constructor() : this(
        pContactCtorArg = MutPtr(0L),
        pEndpointCtorArg = MutPtr(0L),
        changeType = 0,
        pApplicationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<PeerContact> = this.pContact

    public operator fun component2(): MutPtr<PeerEndpoint> = this.pEndpoint

    public operator fun component3(): PeerChangeType = this.changeType

    public operator fun component4(): MutPtr<PeerApplication> = this.pApplication

    public fun copy(pContact: MutPtr<PeerContact> = this.pContact, pEndpoint: MutPtr<PeerEndpoint> = this.pEndpoint, changeType: PeerChangeType = this.changeType, pApplication: MutPtr<PeerApplication> = this.pApplication): PeerEventApplicationChangedData = PeerEventApplicationChangedData(pContactCtorArg = pContact, pEndpointCtorArg = pEndpoint, changeType = changeType, pApplicationCtorArg = pApplication)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerEventApplicationChangedData) return false
        if (this.pContact != other.pContact) return false
        if (this.pEndpoint != other.pEndpoint) return false
        if (this.changeType != other.changeType) return false
        if (this.pApplication != other.pApplication) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pContact.hashCode()
        result = 31 * result + this.pEndpoint.hashCode()
        result = 31 * result + this.changeType.hashCode()
        result = 31 * result + this.pApplication.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventApplicationChangedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventApplicationChangedData> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerEventApplicationChangedData =
                    PeerEventApplicationChangedData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerContact>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerEndpoint>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerApplication>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PeerEventApplicationChangedData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerContact>(64)
                    ).writeNative(addr, value.pContact)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerEndpoint>(64)
                    ).writeNative(addr + 8L, value.pEndpoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.changeType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerApplication>(64)
                    ).writeNative(addr + 24L, value.pApplication)
                }
            }

        public operator fun invoke(
            pContact: MutPtr<PeerContact> = MutPtr(0L),
            pEndpoint: MutPtr<PeerEndpoint> = MutPtr(0L),
            changeType: PeerChangeType = 0,
            pApplication: MutPtr<PeerApplication> = MutPtr(0L),
        ): PeerEventApplicationChangedData =
            PeerEventApplicationChangedData(
                pContactCtorArg = pContact,
                pEndpointCtorArg = pEndpoint,
                changeType = changeType,
                pApplicationCtorArg = pApplication,
            )
    }
}

public data class PeerEventConnectionChangeData(
    public var dwSize: UInt = 0u,
    public var status: PeerConnectionStatus = 0,
    public var ullConnectionId: ULong = 0uL,
    public var ullNodeId: ULong = 0uL,
    public var ullNextConnectionId: ULong = 0uL,
    public var hrConnectionFailedReason: Hresult = 0,
)

public class PeerEventEndpointChangedData internal constructor(
    pContactCtorArg: MutPtr<PeerContact>,
    pEndpointCtorArg: MutPtr<PeerEndpoint>,
) {
    public var pContact: MutPtr<PeerContact> = pContactCtorArg
        internal set

    public var pEndpoint: MutPtr<PeerEndpoint> = pEndpointCtorArg
        internal set

    public constructor() : this(
        pContactCtorArg = MutPtr(0L),
        pEndpointCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<PeerContact> = this.pContact

    public operator fun component2(): MutPtr<PeerEndpoint> = this.pEndpoint

    public fun copy(pContact: MutPtr<PeerContact> = this.pContact, pEndpoint: MutPtr<PeerEndpoint> = this.pEndpoint): PeerEventEndpointChangedData = PeerEventEndpointChangedData(pContactCtorArg = pContact, pEndpointCtorArg = pEndpoint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerEventEndpointChangedData) return false
        if (this.pContact != other.pContact) return false
        if (this.pEndpoint != other.pEndpoint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pContact.hashCode()
        result = 31 * result + this.pEndpoint.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventEndpointChangedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventEndpointChangedData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerEventEndpointChangedData =
                    PeerEventEndpointChangedData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerContact>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerEndpoint>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PeerEventEndpointChangedData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerContact>(64)
                    ).writeNative(addr, value.pContact)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerEndpoint>(64)
                    ).writeNative(addr + 8L, value.pEndpoint)
                }
            }

        public operator fun invoke(
            pContact: MutPtr<PeerContact> = MutPtr(0L),
            pEndpoint: MutPtr<PeerEndpoint> = MutPtr(0L),
        ): PeerEventEndpointChangedData =
            PeerEventEndpointChangedData(
                pContactCtorArg = pContact,
                pEndpointCtorArg = pEndpoint,
            )
    }
}

public data class PeerEventIncomingData(
    public var dwSize: UInt = 0u,
    public var ullConnectionId: ULong = 0uL,
    public var type: Guid = Guid(),
    public var data: PeerData = PeerData(),
)

public class PeerEventMemberChangeData internal constructor(
    public var dwSize: UInt,
    public var changeType: PeerMemberChangeType,
    pwzIdentityCtorArg: Pwstr,
) {
    public var pwzIdentity: Pwstr = pwzIdentityCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        changeType = 0,
        pwzIdentityCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): PeerMemberChangeType = this.changeType

    public operator fun component3(): Pwstr = this.pwzIdentity

    public fun copy(dwSize: UInt = this.dwSize, changeType: PeerMemberChangeType = this.changeType, pwzIdentity: Pwstr = this.pwzIdentity): PeerEventMemberChangeData = PeerEventMemberChangeData(dwSize = dwSize, changeType = changeType, pwzIdentityCtorArg = pwzIdentity)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerEventMemberChangeData) return false
        if (this.dwSize != other.dwSize) return false
        if (this.changeType != other.changeType) return false
        if (this.pwzIdentity != other.pwzIdentity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.changeType.hashCode()
        result = 31 * result + this.pwzIdentity.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            changeType: PeerMemberChangeType = 0,
            pwzIdentity: Pwstr = MutPtr(0L),
        ): PeerEventMemberChangeData =
            PeerEventMemberChangeData(
                dwSize = dwSize,
                changeType = changeType,
                pwzIdentityCtorArg = pwzIdentity,
            )
    }
}

public class PeerEventNodeChangeData internal constructor(
    public var dwSize: UInt,
    public var changeType: PeerNodeChangeType,
    public var ullNodeId: ULong,
    pwzPeerIdCtorArg: Pwstr,
) {
    public var pwzPeerId: Pwstr = pwzPeerIdCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        changeType = 0,
        ullNodeId = 0uL,
        pwzPeerIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): PeerNodeChangeType = this.changeType

    public operator fun component3(): ULong = this.ullNodeId

    public operator fun component4(): Pwstr = this.pwzPeerId

    public fun copy(dwSize: UInt = this.dwSize, changeType: PeerNodeChangeType = this.changeType, ullNodeId: ULong = this.ullNodeId, pwzPeerId: Pwstr = this.pwzPeerId): PeerEventNodeChangeData = PeerEventNodeChangeData(dwSize = dwSize, changeType = changeType, ullNodeId = ullNodeId, pwzPeerIdCtorArg = pwzPeerId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerEventNodeChangeData) return false
        if (this.dwSize != other.dwSize) return false
        if (this.changeType != other.changeType) return false
        if (this.ullNodeId != other.ullNodeId) return false
        if (this.pwzPeerId != other.pwzPeerId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.changeType.hashCode()
        result = 31 * result + this.ullNodeId.hashCode()
        result = 31 * result + this.pwzPeerId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            changeType: PeerNodeChangeType = 0,
            ullNodeId: ULong = 0uL,
            pwzPeerId: Pwstr = MutPtr(0L),
        ): PeerEventNodeChangeData =
            PeerEventNodeChangeData(
                dwSize = dwSize,
                changeType = changeType,
                ullNodeId = ullNodeId,
                pwzPeerIdCtorArg = pwzPeerId,
            )
    }
}

public class PeerEventObjectChangedData internal constructor(
    pContactCtorArg: MutPtr<PeerContact>,
    pEndpointCtorArg: MutPtr<PeerEndpoint>,
    public var changeType: PeerChangeType,
    pObjectCtorArg: MutPtr<PeerObject>,
) {
    public var pContact: MutPtr<PeerContact> = pContactCtorArg
        internal set

    public var pEndpoint: MutPtr<PeerEndpoint> = pEndpointCtorArg
        internal set

    public var pObject: MutPtr<PeerObject> = pObjectCtorArg
        internal set

    public constructor() : this(
        pContactCtorArg = MutPtr(0L),
        pEndpointCtorArg = MutPtr(0L),
        changeType = 0,
        pObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<PeerContact> = this.pContact

    public operator fun component2(): MutPtr<PeerEndpoint> = this.pEndpoint

    public operator fun component3(): PeerChangeType = this.changeType

    public operator fun component4(): MutPtr<PeerObject> = this.pObject

    public fun copy(pContact: MutPtr<PeerContact> = this.pContact, pEndpoint: MutPtr<PeerEndpoint> = this.pEndpoint, changeType: PeerChangeType = this.changeType, pObject: MutPtr<PeerObject> = this.pObject): PeerEventObjectChangedData = PeerEventObjectChangedData(pContactCtorArg = pContact, pEndpointCtorArg = pEndpoint, changeType = changeType, pObjectCtorArg = pObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerEventObjectChangedData) return false
        if (this.pContact != other.pContact) return false
        if (this.pEndpoint != other.pEndpoint) return false
        if (this.changeType != other.changeType) return false
        if (this.pObject != other.pObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pContact.hashCode()
        result = 31 * result + this.pEndpoint.hashCode()
        result = 31 * result + this.changeType.hashCode()
        result = 31 * result + this.pObject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventObjectChangedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventObjectChangedData> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerEventObjectChangedData =
                    PeerEventObjectChangedData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerContact>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerEndpoint>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerObject>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PeerEventObjectChangedData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerContact>(64)
                    ).writeNative(addr, value.pContact)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerEndpoint>(64)
                    ).writeNative(addr + 8L, value.pEndpoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.changeType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerObject>(64)
                    ).writeNative(addr + 24L, value.pObject)
                }
            }

        public operator fun invoke(
            pContact: MutPtr<PeerContact> = MutPtr(0L),
            pEndpoint: MutPtr<PeerEndpoint> = MutPtr(0L),
            changeType: PeerChangeType = 0,
            pObject: MutPtr<PeerObject> = MutPtr(0L),
        ): PeerEventObjectChangedData =
            PeerEventObjectChangedData(
                pContactCtorArg = pContact,
                pEndpointCtorArg = pEndpoint,
                changeType = changeType,
                pObjectCtorArg = pObject,
            )
    }
}

public class PeerEventPeopleNearMeChangedData internal constructor(
    public var changeType: PeerChangeType,
    pPeopleNearMeCtorArg: MutPtr<PeerPeopleNearMe>,
) {
    public var pPeopleNearMe: MutPtr<PeerPeopleNearMe> = pPeopleNearMeCtorArg
        internal set

    public constructor() : this(
        changeType = 0,
        pPeopleNearMeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PeerChangeType = this.changeType

    public operator fun component2(): MutPtr<PeerPeopleNearMe> = this.pPeopleNearMe

    public fun copy(changeType: PeerChangeType = this.changeType, pPeopleNearMe: MutPtr<PeerPeopleNearMe> = this.pPeopleNearMe): PeerEventPeopleNearMeChangedData = PeerEventPeopleNearMeChangedData(changeType = changeType, pPeopleNearMeCtorArg = pPeopleNearMe)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerEventPeopleNearMeChangedData) return false
        if (this.changeType != other.changeType) return false
        if (this.pPeopleNearMe != other.pPeopleNearMe) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.changeType.hashCode()
        result = 31 * result + this.pPeopleNearMe.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventPeopleNearMeChangedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventPeopleNearMeChangedData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerEventPeopleNearMeChangedData =
                    PeerEventPeopleNearMeChangedData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerPeopleNearMe>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PeerEventPeopleNearMeChangedData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.changeType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerPeopleNearMe>(64)
                    ).writeNative(addr + 8L, value.pPeopleNearMe)
                }
            }

        public operator fun invoke(
            changeType: PeerChangeType = 0,
            pPeopleNearMe: MutPtr<PeerPeopleNearMe> = MutPtr(0L),
        ): PeerEventPeopleNearMeChangedData =
            PeerEventPeopleNearMeChangedData(
                changeType = changeType,
                pPeopleNearMeCtorArg = pPeopleNearMe,
            )
    }
}

public class PeerEventPresenceChangedData internal constructor(
    pContactCtorArg: MutPtr<PeerContact>,
    pEndpointCtorArg: MutPtr<PeerEndpoint>,
    public var changeType: PeerChangeType,
    pPresenceInfoCtorArg: MutPtr<PeerPresenceInfo>,
) {
    public var pContact: MutPtr<PeerContact> = pContactCtorArg
        internal set

    public var pEndpoint: MutPtr<PeerEndpoint> = pEndpointCtorArg
        internal set

    public var pPresenceInfo: MutPtr<PeerPresenceInfo> = pPresenceInfoCtorArg
        internal set

    public constructor() : this(
        pContactCtorArg = MutPtr(0L),
        pEndpointCtorArg = MutPtr(0L),
        changeType = 0,
        pPresenceInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<PeerContact> = this.pContact

    public operator fun component2(): MutPtr<PeerEndpoint> = this.pEndpoint

    public operator fun component3(): PeerChangeType = this.changeType

    public operator fun component4(): MutPtr<PeerPresenceInfo> = this.pPresenceInfo

    public fun copy(pContact: MutPtr<PeerContact> = this.pContact, pEndpoint: MutPtr<PeerEndpoint> = this.pEndpoint, changeType: PeerChangeType = this.changeType, pPresenceInfo: MutPtr<PeerPresenceInfo> = this.pPresenceInfo): PeerEventPresenceChangedData = PeerEventPresenceChangedData(pContactCtorArg = pContact, pEndpointCtorArg = pEndpoint, changeType = changeType, pPresenceInfoCtorArg = pPresenceInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerEventPresenceChangedData) return false
        if (this.pContact != other.pContact) return false
        if (this.pEndpoint != other.pEndpoint) return false
        if (this.changeType != other.changeType) return false
        if (this.pPresenceInfo != other.pPresenceInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pContact.hashCode()
        result = 31 * result + this.pEndpoint.hashCode()
        result = 31 * result + this.changeType.hashCode()
        result = 31 * result + this.pPresenceInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventPresenceChangedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventPresenceChangedData> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerEventPresenceChangedData =
                    PeerEventPresenceChangedData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerContact>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerEndpoint>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerPresenceInfo>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PeerEventPresenceChangedData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerContact>(64)
                    ).writeNative(addr, value.pContact)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerEndpoint>(64)
                    ).writeNative(addr + 8L, value.pEndpoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.changeType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerPresenceInfo>(64)
                    ).writeNative(addr + 24L, value.pPresenceInfo)
                }
            }

        public operator fun invoke(
            pContact: MutPtr<PeerContact> = MutPtr(0L),
            pEndpoint: MutPtr<PeerEndpoint> = MutPtr(0L),
            changeType: PeerChangeType = 0,
            pPresenceInfo: MutPtr<PeerPresenceInfo> = MutPtr(0L),
        ): PeerEventPresenceChangedData =
            PeerEventPresenceChangedData(
                pContactCtorArg = pContact,
                pEndpointCtorArg = pEndpoint,
                changeType = changeType,
                pPresenceInfoCtorArg = pPresenceInfo,
            )
    }
}

public data class PeerEventRecordChangeData(
    public var dwSize: UInt = 0u,
    public var changeType: PeerRecordChangeType = 0,
    public var recordId: Guid = Guid(),
    public var recordType: Guid = Guid(),
)

public class PeerEventRequestStatusChangedData internal constructor(
    pEndpointCtorArg: MutPtr<PeerEndpoint>,
    public var hrChange: Hresult,
) {
    public var pEndpoint: MutPtr<PeerEndpoint> = pEndpointCtorArg
        internal set

    public constructor() : this(
        pEndpointCtorArg = MutPtr(0L),
        hrChange = 0,
    )

    public operator fun component1(): MutPtr<PeerEndpoint> = this.pEndpoint

    public operator fun component2(): Hresult = this.hrChange

    public fun copy(pEndpoint: MutPtr<PeerEndpoint> = this.pEndpoint, hrChange: Hresult = this.hrChange): PeerEventRequestStatusChangedData = PeerEventRequestStatusChangedData(pEndpointCtorArg = pEndpoint, hrChange = hrChange)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerEventRequestStatusChangedData) return false
        if (this.pEndpoint != other.pEndpoint) return false
        if (this.hrChange != other.hrChange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pEndpoint.hashCode()
        result = 31 * result + this.hrChange.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pEndpoint: MutPtr<PeerEndpoint> = MutPtr(0L),
            hrChange: Hresult = 0,
        ): PeerEventRequestStatusChangedData =
            PeerEventRequestStatusChangedData(
                pEndpointCtorArg = pEndpoint,
                hrChange = hrChange,
            )
    }
}

public data class PeerEventSynchronizedData(
    public var dwSize: UInt = 0u,
    public var recordType: Guid = Guid(),
)

public class PeerEventWatchlistChangedData internal constructor(
    pContactCtorArg: MutPtr<PeerContact>,
    public var changeType: PeerChangeType,
) {
    public var pContact: MutPtr<PeerContact> = pContactCtorArg
        internal set

    public constructor() : this(
        pContactCtorArg = MutPtr(0L),
        changeType = 0,
    )

    public operator fun component1(): MutPtr<PeerContact> = this.pContact

    public operator fun component2(): PeerChangeType = this.changeType

    public fun copy(pContact: MutPtr<PeerContact> = this.pContact, changeType: PeerChangeType = this.changeType): PeerEventWatchlistChangedData = PeerEventWatchlistChangedData(pContactCtorArg = pContact, changeType = changeType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerEventWatchlistChangedData) return false
        if (this.pContact != other.pContact) return false
        if (this.changeType != other.changeType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pContact.hashCode()
        result = 31 * result + this.changeType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventWatchlistChangedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerEventWatchlistChangedData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerEventWatchlistChangedData =
                    PeerEventWatchlistChangedData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PeerContact>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PeerEventWatchlistChangedData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PeerContact>(64)
                    ).writeNative(addr, value.pContact)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.changeType)
                }
            }

        public operator fun invoke(
            pContact: MutPtr<PeerContact> = MutPtr(0L),
            changeType: PeerChangeType = 0,
        ): PeerEventWatchlistChangedData =
            PeerEventWatchlistChangedData(
                pContactCtorArg = pContact,
                changeType = changeType,
            )
    }
}

public data class PeerGraphEventData(
    public var eventType: PeerGraphEventType = 0,
    public var anonymous: PeerGraphEventData0 = PeerGraphEventData0(),
)

public data class PeerGraphEventData0(
    public var dwStatus: PeerGraphStatusFlags = 0,
    public var incomingData: PeerEventIncomingData = PeerEventIncomingData(),
    public var recordChangeData: PeerEventRecordChangeData = PeerEventRecordChangeData(),
    public var connectionChangeData: PeerEventConnectionChangeData = PeerEventConnectionChangeData(),
    public var nodeChangeData: PeerEventNodeChangeData = PeerEventNodeChangeData(),
    public var synchronizedData: PeerEventSynchronizedData = PeerEventSynchronizedData(),
)

public class PeerGraphEventRegistration internal constructor(
    public var eventType: PeerGraphEventType,
    pTypeCtorArg: MutPtr<Guid>,
) {
    public var pType: MutPtr<Guid> = pTypeCtorArg
        internal set

    public constructor() : this(
        eventType = 0,
        pTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PeerGraphEventType = this.eventType

    public operator fun component2(): MutPtr<Guid> = this.pType

    public fun copy(eventType: PeerGraphEventType = this.eventType, pType: MutPtr<Guid> = this.pType): PeerGraphEventRegistration = PeerGraphEventRegistration(eventType = eventType, pTypeCtorArg = pType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerGraphEventRegistration) return false
        if (this.eventType != other.eventType) return false
        if (this.pType != other.pType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventType.hashCode()
        result = 31 * result + this.pType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerGraphEventRegistration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerGraphEventRegistration> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerGraphEventRegistration =
                    PeerGraphEventRegistration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PeerGraphEventRegistration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.eventType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.pType)
                }
            }

        public operator fun invoke(
            eventType: PeerGraphEventType = 0,
            pType: MutPtr<Guid> = MutPtr(0L),
        ): PeerGraphEventRegistration =
            PeerGraphEventRegistration(
                eventType = eventType,
                pTypeCtorArg = pType,
            )
    }
}

public class PeerGraphProperties internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    public var dwScope: UInt,
    public var dwMaxRecordSize: UInt,
    pwzGraphIdCtorArg: Pwstr,
    pwzCreatorIdCtorArg: Pwstr,
    pwzFriendlyNameCtorArg: Pwstr,
    pwzCommentCtorArg: Pwstr,
    public var ulPresenceLifetime: UInt,
    public var cPresenceMax: UInt,
) {
    public var pwzGraphId: Pwstr = pwzGraphIdCtorArg
        internal set

    public var pwzCreatorId: Pwstr = pwzCreatorIdCtorArg
        internal set

    public var pwzFriendlyName: Pwstr = pwzFriendlyNameCtorArg
        internal set

    public var pwzComment: Pwstr = pwzCommentCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        dwScope = 0u,
        dwMaxRecordSize = 0u,
        pwzGraphIdCtorArg = MutPtr(0L),
        pwzCreatorIdCtorArg = MutPtr(0L),
        pwzFriendlyNameCtorArg = MutPtr(0L),
        pwzCommentCtorArg = MutPtr(0L),
        ulPresenceLifetime = 0u,
        cPresenceMax = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwScope

    public operator fun component4(): UInt = this.dwMaxRecordSize

    public operator fun component5(): Pwstr = this.pwzGraphId

    public operator fun component6(): Pwstr = this.pwzCreatorId

    public operator fun component7(): Pwstr = this.pwzFriendlyName

    public operator fun component8(): Pwstr = this.pwzComment

    public operator fun component9(): UInt = this.ulPresenceLifetime

    public operator fun component10(): UInt = this.cPresenceMax

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, dwScope: UInt = this.dwScope, dwMaxRecordSize: UInt = this.dwMaxRecordSize, pwzGraphId: Pwstr = this.pwzGraphId, pwzCreatorId: Pwstr = this.pwzCreatorId, pwzFriendlyName: Pwstr = this.pwzFriendlyName, pwzComment: Pwstr = this.pwzComment, ulPresenceLifetime: UInt = this.ulPresenceLifetime, cPresenceMax: UInt = this.cPresenceMax): PeerGraphProperties = PeerGraphProperties(dwSize = dwSize, dwFlags = dwFlags, dwScope = dwScope, dwMaxRecordSize = dwMaxRecordSize, pwzGraphIdCtorArg = pwzGraphId, pwzCreatorIdCtorArg = pwzCreatorId, pwzFriendlyNameCtorArg = pwzFriendlyName, pwzCommentCtorArg = pwzComment, ulPresenceLifetime = ulPresenceLifetime, cPresenceMax = cPresenceMax)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerGraphProperties) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwScope != other.dwScope) return false
        if (this.dwMaxRecordSize != other.dwMaxRecordSize) return false
        if (this.pwzGraphId != other.pwzGraphId) return false
        if (this.pwzCreatorId != other.pwzCreatorId) return false
        if (this.pwzFriendlyName != other.pwzFriendlyName) return false
        if (this.pwzComment != other.pwzComment) return false
        if (this.ulPresenceLifetime != other.ulPresenceLifetime) return false
        if (this.cPresenceMax != other.cPresenceMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwScope.hashCode()
        result = 31 * result + this.dwMaxRecordSize.hashCode()
        result = 31 * result + this.pwzGraphId.hashCode()
        result = 31 * result + this.pwzCreatorId.hashCode()
        result = 31 * result + this.pwzFriendlyName.hashCode()
        result = 31 * result + this.pwzComment.hashCode()
        result = 31 * result + this.ulPresenceLifetime.hashCode()
        result = 31 * result + this.cPresenceMax.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwScope: UInt = 0u,
            dwMaxRecordSize: UInt = 0u,
            pwzGraphId: Pwstr = MutPtr(0L),
            pwzCreatorId: Pwstr = MutPtr(0L),
            pwzFriendlyName: Pwstr = MutPtr(0L),
            pwzComment: Pwstr = MutPtr(0L),
            ulPresenceLifetime: UInt = 0u,
            cPresenceMax: UInt = 0u,
        ): PeerGraphProperties =
            PeerGraphProperties(
                dwSize = dwSize,
                dwFlags = dwFlags,
                dwScope = dwScope,
                dwMaxRecordSize = dwMaxRecordSize,
                pwzGraphIdCtorArg = pwzGraphId,
                pwzCreatorIdCtorArg = pwzCreatorId,
                pwzFriendlyNameCtorArg = pwzFriendlyName,
                pwzCommentCtorArg = pwzComment,
                ulPresenceLifetime = ulPresenceLifetime,
                cPresenceMax = cPresenceMax,
            )
    }
}

public data class PeerGroupEventData(
    public var eventType: PeerGroupEventType = 0,
    public var anonymous: PeerGroupEventData0 = PeerGroupEventData0(),
)

public data class PeerGroupEventData0(
    public var dwStatus: PeerGroupStatus = 0,
    public var incomingData: PeerEventIncomingData = PeerEventIncomingData(),
    public var recordChangeData: PeerEventRecordChangeData = PeerEventRecordChangeData(),
    public var connectionChangeData: PeerEventConnectionChangeData = PeerEventConnectionChangeData(),
    public var memberChangeData: PeerEventMemberChangeData = PeerEventMemberChangeData(),
    public var hrConnectionFailedReason: Hresult = 0,
)

public class PeerGroupEventRegistration internal constructor(
    public var eventType: PeerGroupEventType,
    pTypeCtorArg: MutPtr<Guid>,
) {
    public var pType: MutPtr<Guid> = pTypeCtorArg
        internal set

    public constructor() : this(
        eventType = 0,
        pTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PeerGroupEventType = this.eventType

    public operator fun component2(): MutPtr<Guid> = this.pType

    public fun copy(eventType: PeerGroupEventType = this.eventType, pType: MutPtr<Guid> = this.pType): PeerGroupEventRegistration = PeerGroupEventRegistration(eventType = eventType, pTypeCtorArg = pType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerGroupEventRegistration) return false
        if (this.eventType != other.eventType) return false
        if (this.pType != other.pType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventType.hashCode()
        result = 31 * result + this.pType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerGroupEventRegistration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerGroupEventRegistration> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PeerGroupEventRegistration =
                    PeerGroupEventRegistration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PeerGroupEventRegistration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.eventType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.pType)
                }
            }

        public operator fun invoke(
            eventType: PeerGroupEventType = 0,
            pType: MutPtr<Guid> = MutPtr(0L),
        ): PeerGroupEventRegistration =
            PeerGroupEventRegistration(
                eventType = eventType,
                pTypeCtorArg = pType,
            )
    }
}

public class PeerGroupProperties internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    pwzCloudCtorArg: Pwstr,
    pwzClassifierCtorArg: Pwstr,
    pwzGroupPeerNameCtorArg: Pwstr,
    pwzCreatorPeerNameCtorArg: Pwstr,
    pwzFriendlyNameCtorArg: Pwstr,
    pwzCommentCtorArg: Pwstr,
    public var ulMemberDataLifetime: UInt,
    public var ulPresenceLifetime: UInt,
    public var dwAuthenticationSchemes: UInt,
    pwzGroupPasswordCtorArg: Pwstr,
    public var groupPasswordRole: Guid,
) {
    public var pwzCloud: Pwstr = pwzCloudCtorArg
        internal set

    public var pwzClassifier: Pwstr = pwzClassifierCtorArg
        internal set

    public var pwzGroupPeerName: Pwstr = pwzGroupPeerNameCtorArg
        internal set

    public var pwzCreatorPeerName: Pwstr = pwzCreatorPeerNameCtorArg
        internal set

    public var pwzFriendlyName: Pwstr = pwzFriendlyNameCtorArg
        internal set

    public var pwzComment: Pwstr = pwzCommentCtorArg
        internal set

    public var pwzGroupPassword: Pwstr = pwzGroupPasswordCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        pwzCloudCtorArg = MutPtr(0L),
        pwzClassifierCtorArg = MutPtr(0L),
        pwzGroupPeerNameCtorArg = MutPtr(0L),
        pwzCreatorPeerNameCtorArg = MutPtr(0L),
        pwzFriendlyNameCtorArg = MutPtr(0L),
        pwzCommentCtorArg = MutPtr(0L),
        ulMemberDataLifetime = 0u,
        ulPresenceLifetime = 0u,
        dwAuthenticationSchemes = 0u,
        pwzGroupPasswordCtorArg = MutPtr(0L),
        groupPasswordRole = Guid(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pwstr = this.pwzCloud

    public operator fun component4(): Pwstr = this.pwzClassifier

    public operator fun component5(): Pwstr = this.pwzGroupPeerName

    public operator fun component6(): Pwstr = this.pwzCreatorPeerName

    public operator fun component7(): Pwstr = this.pwzFriendlyName

    public operator fun component8(): Pwstr = this.pwzComment

    public operator fun component9(): UInt = this.ulMemberDataLifetime

    public operator fun component10(): UInt = this.ulPresenceLifetime

    public operator fun component11(): UInt = this.dwAuthenticationSchemes

    public operator fun component12(): Pwstr = this.pwzGroupPassword

    public operator fun component13(): Guid = this.groupPasswordRole

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, pwzCloud: Pwstr = this.pwzCloud, pwzClassifier: Pwstr = this.pwzClassifier, pwzGroupPeerName: Pwstr = this.pwzGroupPeerName, pwzCreatorPeerName: Pwstr = this.pwzCreatorPeerName, pwzFriendlyName: Pwstr = this.pwzFriendlyName, pwzComment: Pwstr = this.pwzComment, ulMemberDataLifetime: UInt = this.ulMemberDataLifetime, ulPresenceLifetime: UInt = this.ulPresenceLifetime, dwAuthenticationSchemes: UInt = this.dwAuthenticationSchemes, pwzGroupPassword: Pwstr = this.pwzGroupPassword, groupPasswordRole: Guid = this.groupPasswordRole): PeerGroupProperties = PeerGroupProperties(dwSize = dwSize, dwFlags = dwFlags, pwzCloudCtorArg = pwzCloud, pwzClassifierCtorArg = pwzClassifier, pwzGroupPeerNameCtorArg = pwzGroupPeerName, pwzCreatorPeerNameCtorArg = pwzCreatorPeerName, pwzFriendlyNameCtorArg = pwzFriendlyName, pwzCommentCtorArg = pwzComment, ulMemberDataLifetime = ulMemberDataLifetime, ulPresenceLifetime = ulPresenceLifetime, dwAuthenticationSchemes = dwAuthenticationSchemes, pwzGroupPasswordCtorArg = pwzGroupPassword, groupPasswordRole = groupPasswordRole)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerGroupProperties) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pwzCloud != other.pwzCloud) return false
        if (this.pwzClassifier != other.pwzClassifier) return false
        if (this.pwzGroupPeerName != other.pwzGroupPeerName) return false
        if (this.pwzCreatorPeerName != other.pwzCreatorPeerName) return false
        if (this.pwzFriendlyName != other.pwzFriendlyName) return false
        if (this.pwzComment != other.pwzComment) return false
        if (this.ulMemberDataLifetime != other.ulMemberDataLifetime) return false
        if (this.ulPresenceLifetime != other.ulPresenceLifetime) return false
        if (this.dwAuthenticationSchemes != other.dwAuthenticationSchemes) return false
        if (this.pwzGroupPassword != other.pwzGroupPassword) return false
        if (this.groupPasswordRole != other.groupPasswordRole) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pwzCloud.hashCode()
        result = 31 * result + this.pwzClassifier.hashCode()
        result = 31 * result + this.pwzGroupPeerName.hashCode()
        result = 31 * result + this.pwzCreatorPeerName.hashCode()
        result = 31 * result + this.pwzFriendlyName.hashCode()
        result = 31 * result + this.pwzComment.hashCode()
        result = 31 * result + this.ulMemberDataLifetime.hashCode()
        result = 31 * result + this.ulPresenceLifetime.hashCode()
        result = 31 * result + this.dwAuthenticationSchemes.hashCode()
        result = 31 * result + this.pwzGroupPassword.hashCode()
        result = 31 * result + this.groupPasswordRole.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            pwzCloud: Pwstr = MutPtr(0L),
            pwzClassifier: Pwstr = MutPtr(0L),
            pwzGroupPeerName: Pwstr = MutPtr(0L),
            pwzCreatorPeerName: Pwstr = MutPtr(0L),
            pwzFriendlyName: Pwstr = MutPtr(0L),
            pwzComment: Pwstr = MutPtr(0L),
            ulMemberDataLifetime: UInt = 0u,
            ulPresenceLifetime: UInt = 0u,
            dwAuthenticationSchemes: UInt = 0u,
            pwzGroupPassword: Pwstr = MutPtr(0L),
            groupPasswordRole: Guid = Guid(),
        ): PeerGroupProperties =
            PeerGroupProperties(
                dwSize = dwSize,
                dwFlags = dwFlags,
                pwzCloudCtorArg = pwzCloud,
                pwzClassifierCtorArg = pwzClassifier,
                pwzGroupPeerNameCtorArg = pwzGroupPeerName,
                pwzCreatorPeerNameCtorArg = pwzCreatorPeerName,
                pwzFriendlyNameCtorArg = pwzFriendlyName,
                pwzCommentCtorArg = pwzComment,
                ulMemberDataLifetime = ulMemberDataLifetime,
                ulPresenceLifetime = ulPresenceLifetime,
                dwAuthenticationSchemes = dwAuthenticationSchemes,
                pwzGroupPasswordCtorArg = pwzGroupPassword,
                groupPasswordRole = groupPasswordRole,
            )
    }
}

public class PeerInvitation internal constructor(
    public var applicationId: Guid,
    public var applicationData: PeerData,
    pwzMessageCtorArg: Pwstr,
) {
    public var pwzMessage: Pwstr = pwzMessageCtorArg
        internal set

    public constructor() : this(
        applicationId = Guid(),
        applicationData = PeerData(),
        pwzMessageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.applicationId

    public operator fun component2(): PeerData = this.applicationData

    public operator fun component3(): Pwstr = this.pwzMessage

    public fun copy(applicationId: Guid = this.applicationId, applicationData: PeerData = this.applicationData, pwzMessage: Pwstr = this.pwzMessage): PeerInvitation = PeerInvitation(applicationId = applicationId, applicationData = applicationData, pwzMessageCtorArg = pwzMessage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerInvitation) return false
        if (this.applicationId != other.applicationId) return false
        if (this.applicationData != other.applicationData) return false
        if (this.pwzMessage != other.pwzMessage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.applicationId.hashCode()
        result = 31 * result + this.applicationData.hashCode()
        result = 31 * result + this.pwzMessage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            applicationId: Guid = Guid(),
            applicationData: PeerData = PeerData(),
            pwzMessage: Pwstr = MutPtr(0L),
        ): PeerInvitation =
            PeerInvitation(
                applicationId = applicationId,
                applicationData = applicationData,
                pwzMessageCtorArg = pwzMessage,
            )
    }
}

public class PeerInvitationInfo internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    pwzCloudNameCtorArg: Pwstr,
    public var dwScope: UInt,
    public var dwCloudFlags: UInt,
    pwzGroupPeerNameCtorArg: Pwstr,
    pwzIssuerPeerNameCtorArg: Pwstr,
    pwzSubjectPeerNameCtorArg: Pwstr,
    pwzGroupFriendlyNameCtorArg: Pwstr,
    pwzIssuerFriendlyNameCtorArg: Pwstr,
    pwzSubjectFriendlyNameCtorArg: Pwstr,
    public var ftValidityStart: Filetime,
    public var ftValidityEnd: Filetime,
    public var cRoles: UInt,
    pRolesCtorArg: MutPtr<Guid>,
    public var cClassifiers: UInt,
    ppwzClassifiersCtorArg: MutPtr<Pwstr>,
    pSubjectPublicKeyCtorArg: MutPtr<CertPublicKeyInfo>,
    public var authScheme: PeerGroupAuthenticationScheme,
) {
    public var pwzCloudName: Pwstr = pwzCloudNameCtorArg
        internal set

    public var pwzGroupPeerName: Pwstr = pwzGroupPeerNameCtorArg
        internal set

    public var pwzIssuerPeerName: Pwstr = pwzIssuerPeerNameCtorArg
        internal set

    public var pwzSubjectPeerName: Pwstr = pwzSubjectPeerNameCtorArg
        internal set

    public var pwzGroupFriendlyName: Pwstr = pwzGroupFriendlyNameCtorArg
        internal set

    public var pwzIssuerFriendlyName: Pwstr = pwzIssuerFriendlyNameCtorArg
        internal set

    public var pwzSubjectFriendlyName: Pwstr = pwzSubjectFriendlyNameCtorArg
        internal set

    public var pRoles: MutPtr<Guid> = pRolesCtorArg
        internal set

    public var ppwzClassifiers: MutPtr<Pwstr> = ppwzClassifiersCtorArg
        internal set

    public var pSubjectPublicKey: MutPtr<CertPublicKeyInfo> = pSubjectPublicKeyCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        pwzCloudNameCtorArg = MutPtr(0L),
        dwScope = 0u,
        dwCloudFlags = 0u,
        pwzGroupPeerNameCtorArg = MutPtr(0L),
        pwzIssuerPeerNameCtorArg = MutPtr(0L),
        pwzSubjectPeerNameCtorArg = MutPtr(0L),
        pwzGroupFriendlyNameCtorArg = MutPtr(0L),
        pwzIssuerFriendlyNameCtorArg = MutPtr(0L),
        pwzSubjectFriendlyNameCtorArg = MutPtr(0L),
        ftValidityStart = Filetime(),
        ftValidityEnd = Filetime(),
        cRoles = 0u,
        pRolesCtorArg = MutPtr(0L),
        cClassifiers = 0u,
        ppwzClassifiersCtorArg = MutPtr(0L),
        pSubjectPublicKeyCtorArg = MutPtr(0L),
        authScheme = 0,
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            pwzCloudName: Pwstr = MutPtr(0L),
            dwScope: UInt = 0u,
            dwCloudFlags: UInt = 0u,
            pwzGroupPeerName: Pwstr = MutPtr(0L),
            pwzIssuerPeerName: Pwstr = MutPtr(0L),
            pwzSubjectPeerName: Pwstr = MutPtr(0L),
            pwzGroupFriendlyName: Pwstr = MutPtr(0L),
            pwzIssuerFriendlyName: Pwstr = MutPtr(0L),
            pwzSubjectFriendlyName: Pwstr = MutPtr(0L),
            ftValidityStart: Filetime = Filetime(),
            ftValidityEnd: Filetime = Filetime(),
            cRoles: UInt = 0u,
            pRoles: MutPtr<Guid> = MutPtr(0L),
            cClassifiers: UInt = 0u,
            ppwzClassifiers: MutPtr<Pwstr> = MutPtr(0L),
            pSubjectPublicKey: MutPtr<CertPublicKeyInfo> = MutPtr(0L),
            authScheme: PeerGroupAuthenticationScheme = 0,
        ): PeerInvitationInfo =
            PeerInvitationInfo(
                dwSize = dwSize,
                dwFlags = dwFlags,
                pwzCloudNameCtorArg = pwzCloudName,
                dwScope = dwScope,
                dwCloudFlags = dwCloudFlags,
                pwzGroupPeerNameCtorArg = pwzGroupPeerName,
                pwzIssuerPeerNameCtorArg = pwzIssuerPeerName,
                pwzSubjectPeerNameCtorArg = pwzSubjectPeerName,
                pwzGroupFriendlyNameCtorArg = pwzGroupFriendlyName,
                pwzIssuerFriendlyNameCtorArg = pwzIssuerFriendlyName,
                pwzSubjectFriendlyNameCtorArg = pwzSubjectFriendlyName,
                ftValidityStart = ftValidityStart,
                ftValidityEnd = ftValidityEnd,
                cRoles = cRoles,
                pRolesCtorArg = pRoles,
                cClassifiers = cClassifiers,
                ppwzClassifiersCtorArg = ppwzClassifiers,
                pSubjectPublicKeyCtorArg = pSubjectPublicKey,
                authScheme = authScheme,
            )
    }
}

public class PeerInvitationResponse internal constructor(
    public var action: PeerInvitationResponseType,
    pwzMessageCtorArg: Pwstr,
    public var hrExtendedInfo: Hresult,
) {
    public var pwzMessage: Pwstr = pwzMessageCtorArg
        internal set

    public constructor() : this(
        action = 0,
        pwzMessageCtorArg = MutPtr(0L),
        hrExtendedInfo = 0,
    )

    public operator fun component1(): PeerInvitationResponseType = this.action

    public operator fun component2(): Pwstr = this.pwzMessage

    public operator fun component3(): Hresult = this.hrExtendedInfo

    public fun copy(action: PeerInvitationResponseType = this.action, pwzMessage: Pwstr = this.pwzMessage, hrExtendedInfo: Hresult = this.hrExtendedInfo): PeerInvitationResponse = PeerInvitationResponse(action = action, pwzMessageCtorArg = pwzMessage, hrExtendedInfo = hrExtendedInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerInvitationResponse) return false
        if (this.action != other.action) return false
        if (this.pwzMessage != other.pwzMessage) return false
        if (this.hrExtendedInfo != other.hrExtendedInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.action.hashCode()
        result = 31 * result + this.pwzMessage.hashCode()
        result = 31 * result + this.hrExtendedInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            action: PeerInvitationResponseType = 0,
            pwzMessage: Pwstr = MutPtr(0L),
            hrExtendedInfo: Hresult = 0,
        ): PeerInvitationResponse =
            PeerInvitationResponse(
                action = action,
                pwzMessageCtorArg = pwzMessage,
                hrExtendedInfo = hrExtendedInfo,
            )
    }
}

public class PeerMember internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    pwzIdentityCtorArg: Pwstr,
    pwzAttributesCtorArg: Pwstr,
    public var ullNodeId: ULong,
    public var cAddresses: UInt,
    pAddressesCtorArg: MutPtr<PeerAddress>,
    pCredentialInfoCtorArg: MutPtr<PeerCredentialInfo>,
) {
    public var pwzIdentity: Pwstr = pwzIdentityCtorArg
        internal set

    public var pwzAttributes: Pwstr = pwzAttributesCtorArg
        internal set

    public var pAddresses: MutPtr<PeerAddress> = pAddressesCtorArg
        internal set

    public var pCredentialInfo: MutPtr<PeerCredentialInfo> = pCredentialInfoCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        pwzIdentityCtorArg = MutPtr(0L),
        pwzAttributesCtorArg = MutPtr(0L),
        ullNodeId = 0uL,
        cAddresses = 0u,
        pAddressesCtorArg = MutPtr(0L),
        pCredentialInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pwstr = this.pwzIdentity

    public operator fun component4(): Pwstr = this.pwzAttributes

    public operator fun component5(): ULong = this.ullNodeId

    public operator fun component6(): UInt = this.cAddresses

    public operator fun component7(): MutPtr<PeerAddress> = this.pAddresses

    public operator fun component8(): MutPtr<PeerCredentialInfo> = this.pCredentialInfo

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, pwzIdentity: Pwstr = this.pwzIdentity, pwzAttributes: Pwstr = this.pwzAttributes, ullNodeId: ULong = this.ullNodeId, cAddresses: UInt = this.cAddresses, pAddresses: MutPtr<PeerAddress> = this.pAddresses, pCredentialInfo: MutPtr<PeerCredentialInfo> = this.pCredentialInfo): PeerMember = PeerMember(dwSize = dwSize, dwFlags = dwFlags, pwzIdentityCtorArg = pwzIdentity, pwzAttributesCtorArg = pwzAttributes, ullNodeId = ullNodeId, cAddresses = cAddresses, pAddressesCtorArg = pAddresses, pCredentialInfoCtorArg = pCredentialInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerMember) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pwzIdentity != other.pwzIdentity) return false
        if (this.pwzAttributes != other.pwzAttributes) return false
        if (this.ullNodeId != other.ullNodeId) return false
        if (this.cAddresses != other.cAddresses) return false
        if (this.pAddresses != other.pAddresses) return false
        if (this.pCredentialInfo != other.pCredentialInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pwzIdentity.hashCode()
        result = 31 * result + this.pwzAttributes.hashCode()
        result = 31 * result + this.ullNodeId.hashCode()
        result = 31 * result + this.cAddresses.hashCode()
        result = 31 * result + this.pAddresses.hashCode()
        result = 31 * result + this.pCredentialInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            pwzIdentity: Pwstr = MutPtr(0L),
            pwzAttributes: Pwstr = MutPtr(0L),
            ullNodeId: ULong = 0uL,
            cAddresses: UInt = 0u,
            pAddresses: MutPtr<PeerAddress> = MutPtr(0L),
            pCredentialInfo: MutPtr<PeerCredentialInfo> = MutPtr(0L),
        ): PeerMember =
            PeerMember(
                dwSize = dwSize,
                dwFlags = dwFlags,
                pwzIdentityCtorArg = pwzIdentity,
                pwzAttributesCtorArg = pwzAttributes,
                ullNodeId = ullNodeId,
                cAddresses = cAddresses,
                pAddressesCtorArg = pAddresses,
                pCredentialInfoCtorArg = pCredentialInfo,
            )
    }
}

public class PeerNamePair internal constructor(
    public var dwSize: UInt,
    pwzPeerNameCtorArg: Pwstr,
    pwzFriendlyNameCtorArg: Pwstr,
) {
    public var pwzPeerName: Pwstr = pwzPeerNameCtorArg
        internal set

    public var pwzFriendlyName: Pwstr = pwzFriendlyNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pwzPeerNameCtorArg = MutPtr(0L),
        pwzFriendlyNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.pwzPeerName

    public operator fun component3(): Pwstr = this.pwzFriendlyName

    public fun copy(dwSize: UInt = this.dwSize, pwzPeerName: Pwstr = this.pwzPeerName, pwzFriendlyName: Pwstr = this.pwzFriendlyName): PeerNamePair = PeerNamePair(dwSize = dwSize, pwzPeerNameCtorArg = pwzPeerName, pwzFriendlyNameCtorArg = pwzFriendlyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerNamePair) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pwzPeerName != other.pwzPeerName) return false
        if (this.pwzFriendlyName != other.pwzFriendlyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pwzPeerName.hashCode()
        result = 31 * result + this.pwzFriendlyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pwzPeerName: Pwstr = MutPtr(0L),
            pwzFriendlyName: Pwstr = MutPtr(0L),
        ): PeerNamePair =
            PeerNamePair(
                dwSize = dwSize,
                pwzPeerNameCtorArg = pwzPeerName,
                pwzFriendlyNameCtorArg = pwzFriendlyName,
            )
    }
}

public class PeerNodeInfo internal constructor(
    public var dwSize: UInt,
    public var ullNodeId: ULong,
    pwzPeerIdCtorArg: Pwstr,
    public var cAddresses: UInt,
    pAddressesCtorArg: MutPtr<PeerAddress>,
    pwzAttributesCtorArg: Pwstr,
) {
    public var pwzPeerId: Pwstr = pwzPeerIdCtorArg
        internal set

    public var pAddresses: MutPtr<PeerAddress> = pAddressesCtorArg
        internal set

    public var pwzAttributes: Pwstr = pwzAttributesCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        ullNodeId = 0uL,
        pwzPeerIdCtorArg = MutPtr(0L),
        cAddresses = 0u,
        pAddressesCtorArg = MutPtr(0L),
        pwzAttributesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): ULong = this.ullNodeId

    public operator fun component3(): Pwstr = this.pwzPeerId

    public operator fun component4(): UInt = this.cAddresses

    public operator fun component5(): MutPtr<PeerAddress> = this.pAddresses

    public operator fun component6(): Pwstr = this.pwzAttributes

    public fun copy(dwSize: UInt = this.dwSize, ullNodeId: ULong = this.ullNodeId, pwzPeerId: Pwstr = this.pwzPeerId, cAddresses: UInt = this.cAddresses, pAddresses: MutPtr<PeerAddress> = this.pAddresses, pwzAttributes: Pwstr = this.pwzAttributes): PeerNodeInfo = PeerNodeInfo(dwSize = dwSize, ullNodeId = ullNodeId, pwzPeerIdCtorArg = pwzPeerId, cAddresses = cAddresses, pAddressesCtorArg = pAddresses, pwzAttributesCtorArg = pwzAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerNodeInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.ullNodeId != other.ullNodeId) return false
        if (this.pwzPeerId != other.pwzPeerId) return false
        if (this.cAddresses != other.cAddresses) return false
        if (this.pAddresses != other.pAddresses) return false
        if (this.pwzAttributes != other.pwzAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.ullNodeId.hashCode()
        result = 31 * result + this.pwzPeerId.hashCode()
        result = 31 * result + this.cAddresses.hashCode()
        result = 31 * result + this.pAddresses.hashCode()
        result = 31 * result + this.pwzAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            ullNodeId: ULong = 0uL,
            pwzPeerId: Pwstr = MutPtr(0L),
            cAddresses: UInt = 0u,
            pAddresses: MutPtr<PeerAddress> = MutPtr(0L),
            pwzAttributes: Pwstr = MutPtr(0L),
        ): PeerNodeInfo =
            PeerNodeInfo(
                dwSize = dwSize,
                ullNodeId = ullNodeId,
                pwzPeerIdCtorArg = pwzPeerId,
                cAddresses = cAddresses,
                pAddressesCtorArg = pAddresses,
                pwzAttributesCtorArg = pwzAttributes,
            )
    }
}

public data class PeerObject(
    public var id: Guid = Guid(),
    public var data: PeerData = PeerData(),
    public var dwPublicationScope: UInt = 0u,
)

public class PeerPeopleNearMe internal constructor(
    pwzNickNameCtorArg: Pwstr,
    public var endpoint: PeerEndpoint,
    public var id: Guid,
) {
    public var pwzNickName: Pwstr = pwzNickNameCtorArg
        internal set

    public constructor() : this(
        pwzNickNameCtorArg = MutPtr(0L),
        endpoint = PeerEndpoint(),
        id = Guid(),
    )

    public operator fun component1(): Pwstr = this.pwzNickName

    public operator fun component2(): PeerEndpoint = this.endpoint

    public operator fun component3(): Guid = this.id

    public fun copy(pwzNickName: Pwstr = this.pwzNickName, endpoint: PeerEndpoint = this.endpoint, id: Guid = this.id): PeerPeopleNearMe = PeerPeopleNearMe(pwzNickNameCtorArg = pwzNickName, endpoint = endpoint, id = id)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerPeopleNearMe) return false
        if (this.pwzNickName != other.pwzNickName) return false
        if (this.endpoint != other.endpoint) return false
        if (this.id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwzNickName.hashCode()
        result = 31 * result + this.endpoint.hashCode()
        result = 31 * result + this.id.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwzNickName: Pwstr = MutPtr(0L),
            endpoint: PeerEndpoint = PeerEndpoint(),
            id: Guid = Guid(),
        ): PeerPeopleNearMe =
            PeerPeopleNearMe(
                pwzNickNameCtorArg = pwzNickName,
                endpoint = endpoint,
                id = id,
            )
    }
}

public class PeerPnrpCloudInfo internal constructor(
    pwzCloudNameCtorArg: Pwstr,
    public var dwScope: PnrpScope,
    public var dwScopeId: UInt,
) {
    public var pwzCloudName: Pwstr = pwzCloudNameCtorArg
        internal set

    public constructor() : this(
        pwzCloudNameCtorArg = MutPtr(0L),
        dwScope = 0,
        dwScopeId = 0u,
    )

    public operator fun component1(): Pwstr = this.pwzCloudName

    public operator fun component2(): PnrpScope = this.dwScope

    public operator fun component3(): UInt = this.dwScopeId

    public fun copy(pwzCloudName: Pwstr = this.pwzCloudName, dwScope: PnrpScope = this.dwScope, dwScopeId: UInt = this.dwScopeId): PeerPnrpCloudInfo = PeerPnrpCloudInfo(pwzCloudNameCtorArg = pwzCloudName, dwScope = dwScope, dwScopeId = dwScopeId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerPnrpCloudInfo) return false
        if (this.pwzCloudName != other.pwzCloudName) return false
        if (this.dwScope != other.dwScope) return false
        if (this.dwScopeId != other.dwScopeId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwzCloudName.hashCode()
        result = 31 * result + this.dwScope.hashCode()
        result = 31 * result + this.dwScopeId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwzCloudName: Pwstr = MutPtr(0L),
            dwScope: PnrpScope = 0,
            dwScopeId: UInt = 0u,
        ): PeerPnrpCloudInfo =
            PeerPnrpCloudInfo(
                pwzCloudNameCtorArg = pwzCloudName,
                dwScope = dwScope,
                dwScopeId = dwScopeId,
            )
    }
}

public class PeerPnrpEndpointInfo internal constructor(
    pwzPeerNameCtorArg: Pwstr,
    public var cAddresses: UInt,
    ppAddressesCtorArg: MutPtr<MutPtr<Sockaddr>>,
    pwzCommentCtorArg: Pwstr,
    public var payload: PeerData,
) {
    public var pwzPeerName: Pwstr = pwzPeerNameCtorArg
        internal set

    public var ppAddresses: MutPtr<MutPtr<Sockaddr>> = ppAddressesCtorArg
        internal set

    public var pwzComment: Pwstr = pwzCommentCtorArg
        internal set

    public constructor() : this(
        pwzPeerNameCtorArg = MutPtr(0L),
        cAddresses = 0u,
        ppAddressesCtorArg = MutPtr(0L),
        pwzCommentCtorArg = MutPtr(0L),
        payload = PeerData(),
    )

    public operator fun component1(): Pwstr = this.pwzPeerName

    public operator fun component2(): UInt = this.cAddresses

    public operator fun component3(): MutPtr<MutPtr<Sockaddr>> = this.ppAddresses

    public operator fun component4(): Pwstr = this.pwzComment

    public operator fun component5(): PeerData = this.payload

    public fun copy(pwzPeerName: Pwstr = this.pwzPeerName, cAddresses: UInt = this.cAddresses, ppAddresses: MutPtr<MutPtr<Sockaddr>> = this.ppAddresses, pwzComment: Pwstr = this.pwzComment, payload: PeerData = this.payload): PeerPnrpEndpointInfo = PeerPnrpEndpointInfo(pwzPeerNameCtorArg = pwzPeerName, cAddresses = cAddresses, ppAddressesCtorArg = ppAddresses, pwzCommentCtorArg = pwzComment, payload = payload)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerPnrpEndpointInfo) return false
        if (this.pwzPeerName != other.pwzPeerName) return false
        if (this.cAddresses != other.cAddresses) return false
        if (this.ppAddresses != other.ppAddresses) return false
        if (this.pwzComment != other.pwzComment) return false
        if (this.payload != other.payload) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwzPeerName.hashCode()
        result = 31 * result + this.cAddresses.hashCode()
        result = 31 * result + this.ppAddresses.hashCode()
        result = 31 * result + this.pwzComment.hashCode()
        result = 31 * result + this.payload.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwzPeerName: Pwstr = MutPtr(0L),
            cAddresses: UInt = 0u,
            ppAddresses: MutPtr<MutPtr<Sockaddr>> = MutPtr(0L),
            pwzComment: Pwstr = MutPtr(0L),
            payload: PeerData = PeerData(),
        ): PeerPnrpEndpointInfo =
            PeerPnrpEndpointInfo(
                pwzPeerNameCtorArg = pwzPeerName,
                cAddresses = cAddresses,
                ppAddressesCtorArg = ppAddresses,
                pwzCommentCtorArg = pwzComment,
                payload = payload,
            )
    }
}

public class PeerPnrpRegistrationInfo internal constructor(
    pwzCloudNameCtorArg: Pwstr,
    pwzPublishingIdentityCtorArg: Pwstr,
    public var cAddresses: UInt,
    ppAddressesCtorArg: MutPtr<MutPtr<Sockaddr>>,
    public var wPort: UShort,
    pwzCommentCtorArg: Pwstr,
    public var payload: PeerData,
) {
    public var pwzCloudName: Pwstr = pwzCloudNameCtorArg
        internal set

    public var pwzPublishingIdentity: Pwstr = pwzPublishingIdentityCtorArg
        internal set

    public var ppAddresses: MutPtr<MutPtr<Sockaddr>> = ppAddressesCtorArg
        internal set

    public var pwzComment: Pwstr = pwzCommentCtorArg
        internal set

    public constructor() : this(
        pwzCloudNameCtorArg = MutPtr(0L),
        pwzPublishingIdentityCtorArg = MutPtr(0L),
        cAddresses = 0u,
        ppAddressesCtorArg = MutPtr(0L),
        wPort = 0u,
        pwzCommentCtorArg = MutPtr(0L),
        payload = PeerData(),
    )

    public operator fun component1(): Pwstr = this.pwzCloudName

    public operator fun component2(): Pwstr = this.pwzPublishingIdentity

    public operator fun component3(): UInt = this.cAddresses

    public operator fun component4(): MutPtr<MutPtr<Sockaddr>> = this.ppAddresses

    public operator fun component5(): UShort = this.wPort

    public operator fun component6(): Pwstr = this.pwzComment

    public operator fun component7(): PeerData = this.payload

    public fun copy(pwzCloudName: Pwstr = this.pwzCloudName, pwzPublishingIdentity: Pwstr = this.pwzPublishingIdentity, cAddresses: UInt = this.cAddresses, ppAddresses: MutPtr<MutPtr<Sockaddr>> = this.ppAddresses, wPort: UShort = this.wPort, pwzComment: Pwstr = this.pwzComment, payload: PeerData = this.payload): PeerPnrpRegistrationInfo = PeerPnrpRegistrationInfo(pwzCloudNameCtorArg = pwzCloudName, pwzPublishingIdentityCtorArg = pwzPublishingIdentity, cAddresses = cAddresses, ppAddressesCtorArg = ppAddresses, wPort = wPort, pwzCommentCtorArg = pwzComment, payload = payload)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerPnrpRegistrationInfo) return false
        if (this.pwzCloudName != other.pwzCloudName) return false
        if (this.pwzPublishingIdentity != other.pwzPublishingIdentity) return false
        if (this.cAddresses != other.cAddresses) return false
        if (this.ppAddresses != other.ppAddresses) return false
        if (this.wPort != other.wPort) return false
        if (this.pwzComment != other.pwzComment) return false
        if (this.payload != other.payload) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwzCloudName.hashCode()
        result = 31 * result + this.pwzPublishingIdentity.hashCode()
        result = 31 * result + this.cAddresses.hashCode()
        result = 31 * result + this.ppAddresses.hashCode()
        result = 31 * result + this.wPort.hashCode()
        result = 31 * result + this.pwzComment.hashCode()
        result = 31 * result + this.payload.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwzCloudName: Pwstr = MutPtr(0L),
            pwzPublishingIdentity: Pwstr = MutPtr(0L),
            cAddresses: UInt = 0u,
            ppAddresses: MutPtr<MutPtr<Sockaddr>> = MutPtr(0L),
            wPort: UShort = 0u,
            pwzComment: Pwstr = MutPtr(0L),
            payload: PeerData = PeerData(),
        ): PeerPnrpRegistrationInfo =
            PeerPnrpRegistrationInfo(
                pwzCloudNameCtorArg = pwzCloudName,
                pwzPublishingIdentityCtorArg = pwzPublishingIdentity,
                cAddresses = cAddresses,
                ppAddressesCtorArg = ppAddresses,
                wPort = wPort,
                pwzCommentCtorArg = pwzComment,
                payload = payload,
            )
    }
}

public class PeerPresenceInfo internal constructor(
    public var status: PeerPresenceStatus,
    pwzDescriptiveTextCtorArg: Pwstr,
) {
    public var pwzDescriptiveText: Pwstr = pwzDescriptiveTextCtorArg
        internal set

    public constructor() : this(
        status = 0,
        pwzDescriptiveTextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PeerPresenceStatus = this.status

    public operator fun component2(): Pwstr = this.pwzDescriptiveText

    public fun copy(status: PeerPresenceStatus = this.status, pwzDescriptiveText: Pwstr = this.pwzDescriptiveText): PeerPresenceInfo = PeerPresenceInfo(status = status, pwzDescriptiveTextCtorArg = pwzDescriptiveText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerPresenceInfo) return false
        if (this.status != other.status) return false
        if (this.pwzDescriptiveText != other.pwzDescriptiveText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.pwzDescriptiveText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            status: PeerPresenceStatus = 0,
            pwzDescriptiveText: Pwstr = MutPtr(0L),
        ): PeerPresenceInfo =
            PeerPresenceInfo(
                status = status,
                pwzDescriptiveTextCtorArg = pwzDescriptiveText,
            )
    }
}

public class PeerRecord internal constructor(
    public var dwSize: UInt,
    public var type: Guid,
    public var id: Guid,
    public var dwVersion: UInt,
    public var dwFlags: UInt,
    pwzCreatorIdCtorArg: Pwstr,
    pwzModifiedByIdCtorArg: Pwstr,
    pwzAttributesCtorArg: Pwstr,
    public var ftCreation: Filetime,
    public var ftExpiration: Filetime,
    public var ftLastModified: Filetime,
    public var securityData: PeerData,
    public var data: PeerData,
) {
    public var pwzCreatorId: Pwstr = pwzCreatorIdCtorArg
        internal set

    public var pwzModifiedById: Pwstr = pwzModifiedByIdCtorArg
        internal set

    public var pwzAttributes: Pwstr = pwzAttributesCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        type = Guid(),
        id = Guid(),
        dwVersion = 0u,
        dwFlags = 0u,
        pwzCreatorIdCtorArg = MutPtr(0L),
        pwzModifiedByIdCtorArg = MutPtr(0L),
        pwzAttributesCtorArg = MutPtr(0L),
        ftCreation = Filetime(),
        ftExpiration = Filetime(),
        ftLastModified = Filetime(),
        securityData = PeerData(),
        data = PeerData(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Guid = this.type

    public operator fun component3(): Guid = this.id

    public operator fun component4(): UInt = this.dwVersion

    public operator fun component5(): UInt = this.dwFlags

    public operator fun component6(): Pwstr = this.pwzCreatorId

    public operator fun component7(): Pwstr = this.pwzModifiedById

    public operator fun component8(): Pwstr = this.pwzAttributes

    public operator fun component9(): Filetime = this.ftCreation

    public operator fun component10(): Filetime = this.ftExpiration

    public operator fun component11(): Filetime = this.ftLastModified

    public operator fun component12(): PeerData = this.securityData

    public operator fun component13(): PeerData = this.data

    public fun copy(dwSize: UInt = this.dwSize, type: Guid = this.type, id: Guid = this.id, dwVersion: UInt = this.dwVersion, dwFlags: UInt = this.dwFlags, pwzCreatorId: Pwstr = this.pwzCreatorId, pwzModifiedById: Pwstr = this.pwzModifiedById, pwzAttributes: Pwstr = this.pwzAttributes, ftCreation: Filetime = this.ftCreation, ftExpiration: Filetime = this.ftExpiration, ftLastModified: Filetime = this.ftLastModified, securityData: PeerData = this.securityData, data: PeerData = this.data): PeerRecord = PeerRecord(dwSize = dwSize, type = type, id = id, dwVersion = dwVersion, dwFlags = dwFlags, pwzCreatorIdCtorArg = pwzCreatorId, pwzModifiedByIdCtorArg = pwzModifiedById, pwzAttributesCtorArg = pwzAttributes, ftCreation = ftCreation, ftExpiration = ftExpiration, ftLastModified = ftLastModified, securityData = securityData, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerRecord) return false
        if (this.dwSize != other.dwSize) return false
        if (this.type != other.type) return false
        if (this.id != other.id) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pwzCreatorId != other.pwzCreatorId) return false
        if (this.pwzModifiedById != other.pwzModifiedById) return false
        if (this.pwzAttributes != other.pwzAttributes) return false
        if (this.ftCreation != other.ftCreation) return false
        if (this.ftExpiration != other.ftExpiration) return false
        if (this.ftLastModified != other.ftLastModified) return false
        if (this.securityData != other.securityData) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pwzCreatorId.hashCode()
        result = 31 * result + this.pwzModifiedById.hashCode()
        result = 31 * result + this.pwzAttributes.hashCode()
        result = 31 * result + this.ftCreation.hashCode()
        result = 31 * result + this.ftExpiration.hashCode()
        result = 31 * result + this.ftLastModified.hashCode()
        result = 31 * result + this.securityData.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            type: Guid = Guid(),
            id: Guid = Guid(),
            dwVersion: UInt = 0u,
            dwFlags: UInt = 0u,
            pwzCreatorId: Pwstr = MutPtr(0L),
            pwzModifiedById: Pwstr = MutPtr(0L),
            pwzAttributes: Pwstr = MutPtr(0L),
            ftCreation: Filetime = Filetime(),
            ftExpiration: Filetime = Filetime(),
            ftLastModified: Filetime = Filetime(),
            securityData: PeerData = PeerData(),
            data: PeerData = PeerData(),
        ): PeerRecord =
            PeerRecord(
                dwSize = dwSize,
                type = type,
                id = id,
                dwVersion = dwVersion,
                dwFlags = dwFlags,
                pwzCreatorIdCtorArg = pwzCreatorId,
                pwzModifiedByIdCtorArg = pwzModifiedById,
                pwzAttributesCtorArg = pwzAttributes,
                ftCreation = ftCreation,
                ftExpiration = ftExpiration,
                ftLastModified = ftLastModified,
                securityData = securityData,
                data = data,
            )
    }
}

public class PeerSecurityInterface internal constructor(
    public var dwSize: UInt,
    pwzSspFilenameCtorArg: Pwstr,
    pwzPackageNameCtorArg: Pwstr,
    public var cbSecurityInfo: UInt,
    pbSecurityInfoCtorArg: MutPtr<UByte>,
    pvContextCtorArg: MutPtr<CVoid>,
    public var pfnValidateRecord: PfnpeerValidateRecord,
    public var pfnSecureRecord: PfnpeerSecureRecord,
    public var pfnFreeSecurityData: PfnpeerFreeSecurityData,
    public var pfnAuthFailed: PfnpeerOnPasswordAuthFailed,
) {
    public var pwzSspFilename: Pwstr = pwzSspFilenameCtorArg
        internal set

    public var pwzPackageName: Pwstr = pwzPackageNameCtorArg
        internal set

    public var pbSecurityInfo: MutPtr<UByte> = pbSecurityInfoCtorArg
        internal set

    public var pvContext: MutPtr<CVoid> = pvContextCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pwzSspFilenameCtorArg = MutPtr(0L),
        pwzPackageNameCtorArg = MutPtr(0L),
        cbSecurityInfo = 0u,
        pbSecurityInfoCtorArg = MutPtr(0L),
        pvContextCtorArg = MutPtr(0L),
        pfnValidateRecord = null,
        pfnSecureRecord = null,
        pfnFreeSecurityData = null,
        pfnAuthFailed = null,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.pwzSspFilename

    public operator fun component3(): Pwstr = this.pwzPackageName

    public operator fun component4(): UInt = this.cbSecurityInfo

    public operator fun component5(): MutPtr<UByte> = this.pbSecurityInfo

    public operator fun component6(): MutPtr<CVoid> = this.pvContext

    public operator fun component7(): PfnpeerValidateRecord = this.pfnValidateRecord

    public operator fun component8(): PfnpeerSecureRecord = this.pfnSecureRecord

    public operator fun component9(): PfnpeerFreeSecurityData = this.pfnFreeSecurityData

    public operator fun component10(): PfnpeerOnPasswordAuthFailed = this.pfnAuthFailed

    public fun copy(dwSize: UInt = this.dwSize, pwzSspFilename: Pwstr = this.pwzSspFilename, pwzPackageName: Pwstr = this.pwzPackageName, cbSecurityInfo: UInt = this.cbSecurityInfo, pbSecurityInfo: MutPtr<UByte> = this.pbSecurityInfo, pvContext: MutPtr<CVoid> = this.pvContext, pfnValidateRecord: PfnpeerValidateRecord = this.pfnValidateRecord, pfnSecureRecord: PfnpeerSecureRecord = this.pfnSecureRecord, pfnFreeSecurityData: PfnpeerFreeSecurityData = this.pfnFreeSecurityData, pfnAuthFailed: PfnpeerOnPasswordAuthFailed = this.pfnAuthFailed): PeerSecurityInterface = PeerSecurityInterface(dwSize = dwSize, pwzSspFilenameCtorArg = pwzSspFilename, pwzPackageNameCtorArg = pwzPackageName, cbSecurityInfo = cbSecurityInfo, pbSecurityInfoCtorArg = pbSecurityInfo, pvContextCtorArg = pvContext, pfnValidateRecord = pfnValidateRecord, pfnSecureRecord = pfnSecureRecord, pfnFreeSecurityData = pfnFreeSecurityData, pfnAuthFailed = pfnAuthFailed)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerSecurityInterface) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pwzSspFilename != other.pwzSspFilename) return false
        if (this.pwzPackageName != other.pwzPackageName) return false
        if (this.cbSecurityInfo != other.cbSecurityInfo) return false
        if (this.pbSecurityInfo != other.pbSecurityInfo) return false
        if (this.pvContext != other.pvContext) return false
        if (this.pfnValidateRecord != other.pfnValidateRecord) return false
        if (this.pfnSecureRecord != other.pfnSecureRecord) return false
        if (this.pfnFreeSecurityData != other.pfnFreeSecurityData) return false
        if (this.pfnAuthFailed != other.pfnAuthFailed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pwzSspFilename.hashCode()
        result = 31 * result + this.pwzPackageName.hashCode()
        result = 31 * result + this.cbSecurityInfo.hashCode()
        result = 31 * result + this.pbSecurityInfo.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        result = 31 * result + this.pfnValidateRecord.hashCode()
        result = 31 * result + this.pfnSecureRecord.hashCode()
        result = 31 * result + this.pfnFreeSecurityData.hashCode()
        result = 31 * result + this.pfnAuthFailed.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pwzSspFilename: Pwstr = MutPtr(0L),
            pwzPackageName: Pwstr = MutPtr(0L),
            cbSecurityInfo: UInt = 0u,
            pbSecurityInfo: MutPtr<UByte> = MutPtr(0L),
            pvContext: MutPtr<CVoid> = MutPtr(0L),
            pfnValidateRecord: PfnpeerValidateRecord = null,
            pfnSecureRecord: PfnpeerSecureRecord = null,
            pfnFreeSecurityData: PfnpeerFreeSecurityData = null,
            pfnAuthFailed: PfnpeerOnPasswordAuthFailed = null,
        ): PeerSecurityInterface =
            PeerSecurityInterface(
                dwSize = dwSize,
                pwzSspFilenameCtorArg = pwzSspFilename,
                pwzPackageNameCtorArg = pwzPackageName,
                cbSecurityInfo = cbSecurityInfo,
                pbSecurityInfoCtorArg = pbSecurityInfo,
                pvContextCtorArg = pvContext,
                pfnValidateRecord = pfnValidateRecord,
                pfnSecureRecord = pfnSecureRecord,
                pfnFreeSecurityData = pfnFreeSecurityData,
                pfnAuthFailed = pfnAuthFailed,
            )
    }
}

public data class PeerVersionData(
    public var wVersion: UShort = 0u,
    public var wHighestVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerVersionData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PeerVersionData> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): PeerVersionData =
                    PeerVersionData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: PeerVersionData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wHighestVersion)
                }
            }
    }
}

public data class Pnrpcloudinfo(
    public var dwSize: UInt = 0u,
    public var cloud: PnrpCloudId = PnrpCloudId(),
    public var enCloudState: PnrpCloudState = 0,
    public var enCloudFlags: PnrpCloudFlags = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pnrpcloudinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pnrpcloudinfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Pnrpcloudinfo =
                    Pnrpcloudinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (PnrpCloudId.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Pnrpcloudinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (PnrpCloudId.typeLayout()).writeNative(addr + 4L, value.cloud)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.enCloudState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.enCloudFlags)
                }
            }
    }
}

public class PnrpinfoV1 internal constructor(
    public var dwSize: UInt,
    lpwszIdentityCtorArg: Pwstr,
    public var nMaxResolve: UInt,
    public var dwTimeout: UInt,
    public var dwLifetime: UInt,
    public var enResolveCriteria: PnrpResolveCriteria,
    public var dwFlags: UInt,
    public var saHint: SocketAddress,
    public var enNameState: PnrpRegisteredIdState,
) {
    public var lpwszIdentity: Pwstr = lpwszIdentityCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpwszIdentityCtorArg = MutPtr(0L),
        nMaxResolve = 0u,
        dwTimeout = 0u,
        dwLifetime = 0u,
        enResolveCriteria = 0,
        dwFlags = 0u,
        saHint = SocketAddress(),
        enNameState = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.lpwszIdentity

    public operator fun component3(): UInt = this.nMaxResolve

    public operator fun component4(): UInt = this.dwTimeout

    public operator fun component5(): UInt = this.dwLifetime

    public operator fun component6(): PnrpResolveCriteria = this.enResolveCriteria

    public operator fun component7(): UInt = this.dwFlags

    public operator fun component8(): SocketAddress = this.saHint

    public operator fun component9(): PnrpRegisteredIdState = this.enNameState

    public fun copy(dwSize: UInt = this.dwSize, lpwszIdentity: Pwstr = this.lpwszIdentity, nMaxResolve: UInt = this.nMaxResolve, dwTimeout: UInt = this.dwTimeout, dwLifetime: UInt = this.dwLifetime, enResolveCriteria: PnrpResolveCriteria = this.enResolveCriteria, dwFlags: UInt = this.dwFlags, saHint: SocketAddress = this.saHint, enNameState: PnrpRegisteredIdState = this.enNameState): PnrpinfoV1 = PnrpinfoV1(dwSize = dwSize, lpwszIdentityCtorArg = lpwszIdentity, nMaxResolve = nMaxResolve, dwTimeout = dwTimeout, dwLifetime = dwLifetime, enResolveCriteria = enResolveCriteria, dwFlags = dwFlags, saHint = saHint, enNameState = enNameState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PnrpinfoV1) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpwszIdentity != other.lpwszIdentity) return false
        if (this.nMaxResolve != other.nMaxResolve) return false
        if (this.dwTimeout != other.dwTimeout) return false
        if (this.dwLifetime != other.dwLifetime) return false
        if (this.enResolveCriteria != other.enResolveCriteria) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.saHint != other.saHint) return false
        if (this.enNameState != other.enNameState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpwszIdentity.hashCode()
        result = 31 * result + this.nMaxResolve.hashCode()
        result = 31 * result + this.dwTimeout.hashCode()
        result = 31 * result + this.dwLifetime.hashCode()
        result = 31 * result + this.enResolveCriteria.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.saHint.hashCode()
        result = 31 * result + this.enNameState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            lpwszIdentity: Pwstr = MutPtr(0L),
            nMaxResolve: UInt = 0u,
            dwTimeout: UInt = 0u,
            dwLifetime: UInt = 0u,
            enResolveCriteria: PnrpResolveCriteria = 0,
            dwFlags: UInt = 0u,
            saHint: SocketAddress = SocketAddress(),
            enNameState: PnrpRegisteredIdState = 0,
        ): PnrpinfoV1 =
            PnrpinfoV1(
                dwSize = dwSize,
                lpwszIdentityCtorArg = lpwszIdentity,
                nMaxResolve = nMaxResolve,
                dwTimeout = dwTimeout,
                dwLifetime = dwLifetime,
                enResolveCriteria = enResolveCriteria,
                dwFlags = dwFlags,
                saHint = saHint,
                enNameState = enNameState,
            )
    }
}

public class PnrpinfoV2 internal constructor(
    public var dwSize: UInt,
    lpwszIdentityCtorArg: Pwstr,
    public var nMaxResolve: UInt,
    public var dwTimeout: UInt,
    public var dwLifetime: UInt,
    public var enResolveCriteria: PnrpResolveCriteria,
    public var dwFlags: UInt,
    public var saHint: SocketAddress,
    public var enNameState: PnrpRegisteredIdState,
    public var enExtendedPayloadType: PnrpExtendedPayloadType,
    public var anonymous: PnrpinfoV20,
) {
    public var lpwszIdentity: Pwstr = lpwszIdentityCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpwszIdentityCtorArg = MutPtr(0L),
        nMaxResolve = 0u,
        dwTimeout = 0u,
        dwLifetime = 0u,
        enResolveCriteria = 0,
        dwFlags = 0u,
        saHint = SocketAddress(),
        enNameState = 0,
        enExtendedPayloadType = 0,
        anonymous = PnrpinfoV20(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.lpwszIdentity

    public operator fun component3(): UInt = this.nMaxResolve

    public operator fun component4(): UInt = this.dwTimeout

    public operator fun component5(): UInt = this.dwLifetime

    public operator fun component6(): PnrpResolveCriteria = this.enResolveCriteria

    public operator fun component7(): UInt = this.dwFlags

    public operator fun component8(): SocketAddress = this.saHint

    public operator fun component9(): PnrpRegisteredIdState = this.enNameState

    public operator fun component10(): PnrpExtendedPayloadType = this.enExtendedPayloadType

    public operator fun component11(): PnrpinfoV20 = this.anonymous

    public fun copy(dwSize: UInt = this.dwSize, lpwszIdentity: Pwstr = this.lpwszIdentity, nMaxResolve: UInt = this.nMaxResolve, dwTimeout: UInt = this.dwTimeout, dwLifetime: UInt = this.dwLifetime, enResolveCriteria: PnrpResolveCriteria = this.enResolveCriteria, dwFlags: UInt = this.dwFlags, saHint: SocketAddress = this.saHint, enNameState: PnrpRegisteredIdState = this.enNameState, enExtendedPayloadType: PnrpExtendedPayloadType = this.enExtendedPayloadType, anonymous: PnrpinfoV20 = this.anonymous): PnrpinfoV2 = PnrpinfoV2(dwSize = dwSize, lpwszIdentityCtorArg = lpwszIdentity, nMaxResolve = nMaxResolve, dwTimeout = dwTimeout, dwLifetime = dwLifetime, enResolveCriteria = enResolveCriteria, dwFlags = dwFlags, saHint = saHint, enNameState = enNameState, enExtendedPayloadType = enExtendedPayloadType, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PnrpinfoV2) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpwszIdentity != other.lpwszIdentity) return false
        if (this.nMaxResolve != other.nMaxResolve) return false
        if (this.dwTimeout != other.dwTimeout) return false
        if (this.dwLifetime != other.dwLifetime) return false
        if (this.enResolveCriteria != other.enResolveCriteria) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.saHint != other.saHint) return false
        if (this.enNameState != other.enNameState) return false
        if (this.enExtendedPayloadType != other.enExtendedPayloadType) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpwszIdentity.hashCode()
        result = 31 * result + this.nMaxResolve.hashCode()
        result = 31 * result + this.dwTimeout.hashCode()
        result = 31 * result + this.dwLifetime.hashCode()
        result = 31 * result + this.enResolveCriteria.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.saHint.hashCode()
        result = 31 * result + this.enNameState.hashCode()
        result = 31 * result + this.enExtendedPayloadType.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            lpwszIdentity: Pwstr = MutPtr(0L),
            nMaxResolve: UInt = 0u,
            dwTimeout: UInt = 0u,
            dwLifetime: UInt = 0u,
            enResolveCriteria: PnrpResolveCriteria = 0,
            dwFlags: UInt = 0u,
            saHint: SocketAddress = SocketAddress(),
            enNameState: PnrpRegisteredIdState = 0,
            enExtendedPayloadType: PnrpExtendedPayloadType = 0,
            anonymous: PnrpinfoV20 = PnrpinfoV20(),
        ): PnrpinfoV2 =
            PnrpinfoV2(
                dwSize = dwSize,
                lpwszIdentityCtorArg = lpwszIdentity,
                nMaxResolve = nMaxResolve,
                dwTimeout = dwTimeout,
                dwLifetime = dwLifetime,
                enResolveCriteria = enResolveCriteria,
                dwFlags = dwFlags,
                saHint = saHint,
                enNameState = enNameState,
                enExtendedPayloadType = enExtendedPayloadType,
                anonymous = anonymous,
            )
    }
}

public class PnrpinfoV20 internal constructor(
    public var blobPayload: Blob,
    pwszPayloadCtorArg: Pwstr,
) {
    public var pwszPayload: Pwstr = pwszPayloadCtorArg
        internal set

    public constructor() : this(
        blobPayload = Blob(),
        pwszPayloadCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Blob = this.blobPayload

    public operator fun component2(): Pwstr = this.pwszPayload

    public fun copy(blobPayload: Blob = this.blobPayload, pwszPayload: Pwstr = this.pwszPayload): PnrpinfoV20 = PnrpinfoV20(blobPayload = blobPayload, pwszPayloadCtorArg = pwszPayload)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PnrpinfoV20) return false
        if (this.blobPayload != other.blobPayload) return false
        if (this.pwszPayload != other.pwszPayload) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.blobPayload.hashCode()
        result = 31 * result + this.pwszPayload.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            blobPayload: Blob = Blob(),
            pwszPayload: Pwstr = MutPtr(0L),
        ): PnrpinfoV20 =
            PnrpinfoV20(
                blobPayload = blobPayload,
                pwszPayloadCtorArg = pwszPayload,
            )
    }
}

public data class PnrpCloudId(
    public var addressFamily: Int = 0,
    public var scope: PnrpScope = 0,
    public var scopeId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PnrpCloudId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PnrpCloudId> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PnrpCloudId =
                    PnrpCloudId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PnrpCloudId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.addressFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.scope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.scopeId)
                }
            }
    }
}
