@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class BssidInfo(
    public var bssid: UByteArray = UByteArray(6),
    public var pmkid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BssidInfo) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (!this.pmkid.contentEquals(other.pmkid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bssid.contentHashCode()
        result = 31 * result + this.pmkid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BssidInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BssidInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 22L
                override fun readNative(addr: Long): BssidInfo =
                    BssidInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BssidInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.bssid.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 6L, value.pmkid.toList())
                }
            }
    }
}

public data class GenGetNetcardTime(
    public var readTime: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenGetNetcardTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenGetNetcardTime> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GenGetNetcardTime =
                    GenGetNetcardTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GenGetNetcardTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.readTime)
                }
            }
    }
}

public data class GenGetTimeCaps(
    public var flags: UInt = 0u,
    public var clockPrecision: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenGetTimeCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenGetTimeCaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GenGetTimeCaps =
                    GenGetTimeCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: GenGetTimeCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.clockPrecision)
                }
            }
    }
}

public data class IfCountedStringLh(
    public var length: UShort = 0u,
    public var string: UShortArray = UShortArray(257),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfCountedStringLh) return false
        if (this.length != other.length) return false
        if (!this.string.contentEquals(other.string)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.string.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfCountedStringLh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfCountedStringLh> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 516L
                override fun readNative(addr: Long): IfCountedStringLh =
                    IfCountedStringLh(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: IfCountedStringLh) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr + 2L, value.string.toList())
                }
            }
    }
}

public data class IfPhysicalAddressLh(
    public var length: UShort = 0u,
    public var address: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfPhysicalAddressLh) return false
        if (this.length != other.length) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfPhysicalAddressLh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfPhysicalAddressLh> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 34L
                override fun readNative(addr: Long): IfPhysicalAddressLh =
                    IfPhysicalAddressLh(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: IfPhysicalAddressLh) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 2L, value.address.toList())
                }
            }
    }
}

public data class Ndis80211AiReqfi(
    public var capabilities: UShort = 0u,
    public var listenInterval: UShort = 0u,
    public var currentAPAddress: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211AiReqfi) return false
        if (this.capabilities != other.capabilities) return false
        if (this.listenInterval != other.listenInterval) return false
        if (!this.currentAPAddress.contentEquals(other.currentAPAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capabilities.hashCode()
        result = 31 * result + this.listenInterval.hashCode()
        result = 31 * result + this.currentAPAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AiReqfi> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AiReqfi> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): Ndis80211AiReqfi =
                    Ndis80211AiReqfi(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AiReqfi) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.capabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.listenInterval)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.currentAPAddress.toList())
                }
            }
    }
}

public data class Ndis80211AiResfi(
    public var capabilities: UShort = 0u,
    public var statusCode: UShort = 0u,
    public var associationId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AiResfi> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AiResfi> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Ndis80211AiResfi =
                    Ndis80211AiResfi(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AiResfi) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.capabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.statusCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.associationId)
                }
            }
    }
}

public data class Ndis80211AssociationInformation(
    public var length: UInt = 0u,
    public var availableRequestFixedIEs: UShort = 0u,
    public var requestFixedIEs: Ndis80211AiReqfi = Ndis80211AiReqfi(),
    public var requestIELength: UInt = 0u,
    public var offsetRequestIEs: UInt = 0u,
    public var availableResponseFixedIEs: UShort = 0u,
    public var responseFixedIEs: Ndis80211AiResfi = Ndis80211AiResfi(),
    public var responseIELength: UInt = 0u,
    public var offsetResponseIEs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AssociationInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AssociationInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Ndis80211AssociationInformation =
                    Ndis80211AssociationInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (Ndis80211AiReqfi.typeLayout()).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (Ndis80211AiResfi.typeLayout()).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AssociationInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.availableRequestFixedIEs)
                    (Ndis80211AiReqfi.typeLayout()).writeNative(addr + 6L, value.requestFixedIEs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.requestIELength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.offsetRequestIEs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.availableResponseFixedIEs)
                    (Ndis80211AiResfi.typeLayout()).writeNative(addr + 26L, value.responseFixedIEs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.responseIELength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.offsetResponseIEs)
                }
            }
    }
}

public data class Ndis80211AuthenticationEncryption(
    public var authModeSupported: Ndis80211AuthenticationMode = 0,
    public var encryptStatusSupported: Ndis80211WepStatus = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationEncryption> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationEncryption> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndis80211AuthenticationEncryption =
                    Ndis80211AuthenticationEncryption(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AuthenticationEncryption) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.authModeSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.encryptStatusSupported)
                }
            }
    }
}

public data class Ndis80211AuthenticationEvent(
    public var status: Ndis80211StatusIndication = Ndis80211StatusIndication(),
    public var request: List<Ndis80211AuthenticationRequest> = List(1) { Ndis80211AuthenticationRequest() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationEvent> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Ndis80211AuthenticationEvent =
                    Ndis80211AuthenticationEvent(
                        (Ndis80211StatusIndication.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Ndis80211AuthenticationRequest.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AuthenticationEvent) {
                    (Ndis80211StatusIndication.typeLayout()).writeNative(addr, value.status)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Ndis80211AuthenticationRequest.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.request)
                }
            }
    }
}

public data class Ndis80211AuthenticationRequest(
    public var length: UInt = 0u,
    public var bssid: UByteArray = UByteArray(6),
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211AuthenticationRequest) return false
        if (this.length != other.length) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndis80211AuthenticationRequest =
                    Ndis80211AuthenticationRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AuthenticationRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.bssid.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                }
            }
    }
}

public data class Ndis80211BssidList(
    public var numberOfItems: UInt = 0u,
    public var bssid: List<NdisWlanBssid> = List(1) { NdisWlanBssid() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211BssidList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211BssidList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 108L
                override fun readNative(addr: Long): Ndis80211BssidList =
                    Ndis80211BssidList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NdisWlanBssid.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211BssidList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NdisWlanBssid.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.bssid)
                }
            }
    }
}

public data class Ndis80211BssidListEx(
    public var numberOfItems: UInt = 0u,
    public var bssid: List<NdisWlanBssidEx> = List(1) { NdisWlanBssidEx() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211BssidListEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211BssidListEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 124L
                override fun readNative(addr: Long): Ndis80211BssidListEx =
                    Ndis80211BssidListEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NdisWlanBssidEx.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211BssidListEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NdisWlanBssidEx.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.bssid)
                }
            }
    }
}

public data class Ndis80211Capability(
    public var length: UInt = 0u,
    public var version: UInt = 0u,
    public var noOfPMKIDs: UInt = 0u,
    public var noOfAuthEncryptPairsSupported: UInt = 0u,
    public var authenticationEncryptionSupported: List<Ndis80211AuthenticationEncryption> = List(1) { Ndis80211AuthenticationEncryption() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Capability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Capability> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndis80211Capability =
                    Ndis80211Capability(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Ndis80211AuthenticationEncryption.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Capability) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.noOfPMKIDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.noOfAuthEncryptPairsSupported)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Ndis80211AuthenticationEncryption.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.authenticationEncryptionSupported)
                }
            }
    }
}

public data class Ndis80211Configuration(
    public var length: UInt = 0u,
    public var beaconPeriod: UInt = 0u,
    public var aTIMWindow: UInt = 0u,
    public var dSConfig: UInt = 0u,
    public var fHConfig: Ndis80211ConfigurationFh = Ndis80211ConfigurationFh(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Configuration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Configuration> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Ndis80211Configuration =
                    Ndis80211Configuration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (Ndis80211ConfigurationFh.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Configuration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.beaconPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aTIMWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dSConfig)
                    (Ndis80211ConfigurationFh.typeLayout()).writeNative(addr + 16L, value.fHConfig)
                }
            }
    }
}

public data class Ndis80211ConfigurationFh(
    public var length: UInt = 0u,
    public var hopPattern: UInt = 0u,
    public var hopSet: UInt = 0u,
    public var dwellTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211ConfigurationFh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211ConfigurationFh> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndis80211ConfigurationFh =
                    Ndis80211ConfigurationFh(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211ConfigurationFh) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hopPattern)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hopSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwellTime)
                }
            }
    }
}

public data class Ndis80211FixedIes(
    public var timestamp: UByteArray = UByteArray(8),
    public var beaconInterval: UShort = 0u,
    public var capabilities: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211FixedIes) return false
        if (!this.timestamp.contentEquals(other.timestamp)) return false
        if (this.beaconInterval != other.beaconInterval) return false
        if (this.capabilities != other.capabilities) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timestamp.contentHashCode()
        result = 31 * result + this.beaconInterval.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211FixedIes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211FixedIes> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Ndis80211FixedIes =
                    Ndis80211FixedIes(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211FixedIes) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr, value.timestamp.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.beaconInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.capabilities)
                }
            }
    }
}

public data class Ndis80211Key(
    public var length: UInt = 0u,
    public var keyIndex: UInt = 0u,
    public var keyLength: UInt = 0u,
    public var bssid: UByteArray = UByteArray(6),
    public var keyRSC: ULong = 0uL,
    public var keyMaterial: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211Key) return false
        if (this.length != other.length) return false
        if (this.keyIndex != other.keyIndex) return false
        if (this.keyLength != other.keyLength) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.keyRSC != other.keyRSC) return false
        if (!this.keyMaterial.contentEquals(other.keyMaterial)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.keyIndex.hashCode()
        result = 31 * result + this.keyLength.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.keyRSC.hashCode()
        result = 31 * result + this.keyMaterial.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Key> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Key> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Ndis80211Key =
                    Ndis80211Key(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Key) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keyIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.keyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 12L, value.bssid.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.keyRSC)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 32L, value.keyMaterial.toList())
                }
            }
    }
}

public data class Ndis80211NetworkTypeList(
    public var numberOfItems: UInt = 0u,
    public var networkType: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211NetworkTypeList) return false
        if (this.numberOfItems != other.numberOfItems) return false
        if (!this.networkType.contentEquals(other.networkType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfItems.hashCode()
        result = 31 * result + this.networkType.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211NetworkTypeList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211NetworkTypeList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndis80211NetworkTypeList =
                    Ndis80211NetworkTypeList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (1).toInt())
                        ).readNative(addr + 4L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Ndis80211NetworkTypeList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (1).toInt())
                    ).writeNative(addr + 4L, value.networkType.toList())
                }
            }
    }
}

public data class Ndis80211NonBcastSsidList(
    public var numberOfItems: UInt = 0u,
    public var nonBcastSsid: List<Ndis80211Ssid> = List(1) { Ndis80211Ssid() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211NonBcastSsidList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211NonBcastSsidList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Ndis80211NonBcastSsidList =
                    Ndis80211NonBcastSsidList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Ndis80211Ssid.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211NonBcastSsidList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Ndis80211Ssid.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.nonBcastSsid)
                }
            }
    }
}

public data class Ndis80211Pmkid(
    public var length: UInt = 0u,
    public var bSSIDInfoCount: UInt = 0u,
    public var bSSIDInfo: List<BssidInfo> = List(1) { BssidInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Pmkid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Pmkid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Ndis80211Pmkid =
                    Ndis80211Pmkid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(BssidInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Pmkid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bSSIDInfoCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(BssidInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.bSSIDInfo)
                }
            }
    }
}

public data class Ndis80211PmkidCandidateList(
    public var version: UInt = 0u,
    public var numCandidates: UInt = 0u,
    public var candidateList: List<PmkidCandidate> = List(1) { PmkidCandidate() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211PmkidCandidateList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211PmkidCandidateList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Ndis80211PmkidCandidateList =
                    Ndis80211PmkidCandidateList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PmkidCandidate.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211PmkidCandidateList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numCandidates)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PmkidCandidate.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.candidateList)
                }
            }
    }
}

public data class Ndis80211RemoveKey(
    public var length: UInt = 0u,
    public var keyIndex: UInt = 0u,
    public var bssid: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211RemoveKey) return false
        if (this.length != other.length) return false
        if (this.keyIndex != other.keyIndex) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.keyIndex.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211RemoveKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211RemoveKey> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndis80211RemoveKey =
                    Ndis80211RemoveKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Ndis80211RemoveKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keyIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 8L, value.bssid.toList())
                }
            }
    }
}

public data class Ndis80211Ssid(
    public var ssidLength: UInt = 0u,
    public var ssid: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211Ssid) return false
        if (this.ssidLength != other.ssidLength) return false
        if (!this.ssid.contentEquals(other.ssid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssidLength.hashCode()
        result = 31 * result + this.ssid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Ssid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Ssid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): Ndis80211Ssid =
                    Ndis80211Ssid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Ssid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ssidLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 4L, value.ssid.toList())
                }
            }
    }
}

public class Ndis80211Statistics(
    public var length: UInt = 0u,
    public var transmittedFragmentCount: Long = 0L,
    public var multicastTransmittedFrameCount: Long = 0L,
    public var failedCount: Long = 0L,
    public var retryCount: Long = 0L,
    public var multipleRetryCount: Long = 0L,
    public var rTSSuccessCount: Long = 0L,
    public var rTSFailureCount: Long = 0L,
    public var aCKFailureCount: Long = 0L,
    public var frameDuplicateCount: Long = 0L,
    public var receivedFragmentCount: Long = 0L,
    public var multicastReceivedFrameCount: Long = 0L,
    public var fCSErrorCount: Long = 0L,
    public var tKIPLocalMICFailures: Long = 0L,
    public var tKIPICVErrorCount: Long = 0L,
    public var tKIPCounterMeasuresInvoked: Long = 0L,
    public var tKIPReplays: Long = 0L,
    public var cCMPFormatErrors: Long = 0L,
    public var cCMPReplays: Long = 0L,
    public var cCMPDecryptErrors: Long = 0L,
    public var fourWayHandshakeFailures: Long = 0L,
    public var wEPUndecryptableCount: Long = 0L,
    public var wEPICVErrorCount: Long = 0L,
    public var decryptSuccessCount: Long = 0L,
    public var decryptFailureCount: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Statistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Statistics> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 200L
                override fun readNative(addr: Long): Ndis80211Statistics =
                    Ndis80211Statistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 192L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Statistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.transmittedFragmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.multicastTransmittedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.failedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.retryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.multipleRetryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.rTSSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.rTSFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.aCKFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.frameDuplicateCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.receivedFragmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.multicastReceivedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.fCSErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.tKIPLocalMICFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.tKIPICVErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.tKIPCounterMeasuresInvoked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.tKIPReplays)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.cCMPFormatErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 144L, value.cCMPReplays)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 152L, value.cCMPDecryptErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 160L, value.fourWayHandshakeFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 168L, value.wEPUndecryptableCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 176L, value.wEPICVErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 184L, value.decryptSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 192L, value.decryptFailureCount)
                }
            }
    }
}

public data class Ndis80211StatusIndication(
    public var statusType: Ndis80211StatusType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211StatusIndication> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211StatusIndication> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211StatusIndication =
                    Ndis80211StatusIndication(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndis80211StatusIndication) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.statusType)
                }
            }
    }
}

public data class Ndis80211Test(
    public var length: UInt = 0u,
    public var type: UInt = 0u,
    public var anonymous: Ndis80211Test0 = Ndis80211Test0(),
)

public data class Ndis80211Test0(
    public var authenticationEvent: Ndis80211AuthenticationEvent = Ndis80211AuthenticationEvent(),
    public var rssiTrigger: Int = 0,
)

public data class Ndis80211VariableIes(
    public var elementID: UByte = 0u,
    public var length: UByte = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211VariableIes) return false
        if (this.elementID != other.elementID) return false
        if (this.length != other.length) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elementID.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211VariableIes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211VariableIes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): Ndis80211VariableIes =
                    Ndis80211VariableIes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Ndis80211VariableIes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.elementID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.data.toList())
                }
            }
    }
}

public data class Ndis80211Wep(
    public var length: UInt = 0u,
    public var keyIndex: UInt = 0u,
    public var keyLength: UInt = 0u,
    public var keyMaterial: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211Wep) return false
        if (this.length != other.length) return false
        if (this.keyIndex != other.keyIndex) return false
        if (this.keyLength != other.keyLength) return false
        if (!this.keyMaterial.contentEquals(other.keyMaterial)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.keyIndex.hashCode()
        result = 31 * result + this.keyLength.hashCode()
        result = 31 * result + this.keyMaterial.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Wep> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Wep> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndis80211Wep =
                    Ndis80211Wep(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Wep) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keyIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.keyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.keyMaterial.toList())
                }
            }
    }
}

public class NdisCoDeviceProfile(
    public var deviceDescription: NdisVarDataDesc = NdisVarDataDesc(),
    public var devSpecificInfo: NdisVarDataDesc = NdisVarDataDesc(),
    public var ulTAPISupplementaryPassThru: UInt = 0u,
    public var ulAddressModes: UInt = 0u,
    public var ulNumAddresses: UInt = 0u,
    public var ulBearerModes: UInt = 0u,
    public var ulMaxTxRate: UInt = 0u,
    public var ulMinTxRate: UInt = 0u,
    public var ulMaxRxRate: UInt = 0u,
    public var ulMinRxRate: UInt = 0u,
    public var ulMediaModes: UInt = 0u,
    public var ulGenerateToneModes: UInt = 0u,
    public var ulGenerateToneMaxNumFreq: UInt = 0u,
    public var ulGenerateDigitModes: UInt = 0u,
    public var ulMonitorToneMaxNumFreq: UInt = 0u,
    public var ulMonitorToneMaxNumEntries: UInt = 0u,
    public var ulMonitorDigitModes: UInt = 0u,
    public var ulGatherDigitsMinTimeout: UInt = 0u,
    public var ulGatherDigitsMaxTimeout: UInt = 0u,
    public var ulDevCapFlags: UInt = 0u,
    public var ulMaxNumActiveCalls: UInt = 0u,
    public var ulAnswerMode: UInt = 0u,
    public var ulUUIAcceptSize: UInt = 0u,
    public var ulUUIAnswerSize: UInt = 0u,
    public var ulUUIMakeCallSize: UInt = 0u,
    public var ulUUIDropSize: UInt = 0u,
    public var ulUUISendUserUserInfoSize: UInt = 0u,
    public var ulUUICallInfoSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisCoDeviceProfile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisCoDeviceProfile> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): NdisCoDeviceProfile =
                    NdisCoDeviceProfile(
                        (NdisVarDataDesc.typeLayout()).readNative(addr),
                        (NdisVarDataDesc.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                    )
                override fun writeNative(addr: Long, value: NdisCoDeviceProfile) {
                    (NdisVarDataDesc.typeLayout()).writeNative(addr, value.deviceDescription)
                    (NdisVarDataDesc.typeLayout()).writeNative(addr + 16L, value.devSpecificInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ulTAPISupplementaryPassThru)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ulAddressModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ulNumAddresses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.ulBearerModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.ulMaxTxRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.ulMinTxRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.ulMaxRxRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.ulMinRxRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.ulMediaModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.ulGenerateToneModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.ulGenerateToneMaxNumFreq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.ulGenerateDigitModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.ulMonitorToneMaxNumFreq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.ulMonitorToneMaxNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.ulMonitorDigitModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.ulGatherDigitsMinTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.ulGatherDigitsMaxTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.ulDevCapFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.ulMaxNumActiveCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.ulAnswerMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.ulUUIAcceptSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.ulUUIAnswerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.ulUUIMakeCallSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.ulUUIDropSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.ulUUISendUserUserInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.ulUUICallInfoSize)
                }
            }
    }
}

public data class NdisCoLinkSpeed(
    public var outbound: UInt = 0u,
    public var inbound: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisCoLinkSpeed> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisCoLinkSpeed> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NdisCoLinkSpeed =
                    NdisCoLinkSpeed(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisCoLinkSpeed) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inbound)
                }
            }
    }
}

public data class NdisGuid(
    public var guid: Guid = Guid(),
    public var anonymous: NdisGuid0 = NdisGuid0(),
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class NdisGuid0(
    public var oid: UInt = 0u,
    public var status: Int = 0,
)

public data class NdisHardwareCrosstimestamp(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var systemTimestamp1: ULong = 0uL,
    public var hardwareClockTimestamp: ULong = 0uL,
    public var systemTimestamp2: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisHardwareCrosstimestamp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisHardwareCrosstimestamp> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NdisHardwareCrosstimestamp =
                    NdisHardwareCrosstimestamp(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NdisHardwareCrosstimestamp) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.systemTimestamp1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.hardwareClockTimestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.systemTimestamp2)
                }
            }
    }
}

public class NdisInterfaceInformation(
    public var ifOperStatus: NetIfOperStatus = 0,
    public var ifOperStatusFlags: UInt = 0u,
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var mediaDuplexState: NetIfMediaDuplexState = 0,
    public var ifMtu: UInt = 0u,
    public var ifPromiscuousMode: Boolean = false,
    public var ifDeviceWakeUpEnable: Boolean = false,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var ifLastChange: ULong = 0uL,
    public var ifCounterDiscontinuityTime: ULong = 0uL,
    public var ifInUnknownProtos: ULong = 0uL,
    public var ifInDiscards: ULong = 0uL,
    public var ifInErrors: ULong = 0uL,
    public var ifHCInOctets: ULong = 0uL,
    public var ifHCInUcastPkts: ULong = 0uL,
    public var ifHCInMulticastPkts: ULong = 0uL,
    public var ifHCInBroadcastPkts: ULong = 0uL,
    public var ifHCOutOctets: ULong = 0uL,
    public var ifHCOutUcastPkts: ULong = 0uL,
    public var ifHCOutMulticastPkts: ULong = 0uL,
    public var ifHCOutBroadcastPkts: ULong = 0uL,
    public var ifOutErrors: ULong = 0uL,
    public var ifOutDiscards: ULong = 0uL,
    public var ifHCInUcastOctets: ULong = 0uL,
    public var ifHCInMulticastOctets: ULong = 0uL,
    public var ifHCInBroadcastOctets: ULong = 0uL,
    public var ifHCOutUcastOctets: ULong = 0uL,
    public var ifHCOutMulticastOctets: ULong = 0uL,
    public var ifHCOutBroadcastOctets: ULong = 0uL,
    public var compartmentId: NetIfCompartmentId = 0u,
    public var supportedStatistics: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisInterfaceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisInterfaceInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 216L
                override fun readNative(addr: Long): NdisInterfaceInformation =
                    NdisInterfaceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 21L),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 212L),
                    )
                override fun writeNative(addr: Long, value: NdisInterfaceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ifOperStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ifOperStatusFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.mediaConnectState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.mediaDuplexState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ifMtu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.ifPromiscuousMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 21L, value.ifDeviceWakeUpEnable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.xmitLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.rcvLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ifLastChange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ifCounterDiscontinuityTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ifInUnknownProtos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.ifInDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ifInErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.ifHCInOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.ifHCInUcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.ifHCInMulticastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.ifHCInBroadcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.ifHCOutOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.ifHCOutUcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.ifHCOutMulticastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.ifHCOutBroadcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.ifOutErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.ifOutDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.ifHCInUcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.ifHCInMulticastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.ifHCInBroadcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.ifHCOutUcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.ifHCOutMulticastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.ifHCOutBroadcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 208L, value.compartmentId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 212L, value.supportedStatistics)
                }
            }
    }
}

public data class NdisInterruptModerationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var interruptModeration: NdisInterruptModeration = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisInterruptModerationParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisInterruptModerationParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NdisInterruptModerationParameters =
                    NdisInterruptModerationParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisInterruptModerationParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.interruptModeration)
                }
            }
    }
}

public data class NdisIpsecOffloadV1(
    public var supported: NdisIpsecOffloadV10 = NdisIpsecOffloadV10(),
    public var iPv4AH: NdisIpsecOffloadV11 = NdisIpsecOffloadV11(),
    public var iPv4ESP: NdisIpsecOffloadV12 = NdisIpsecOffloadV12(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): NdisIpsecOffloadV1 =
                    NdisIpsecOffloadV1(
                        (NdisIpsecOffloadV10.typeLayout()).readNative(addr),
                        (NdisIpsecOffloadV11.typeLayout()).readNative(addr + 20L),
                        (NdisIpsecOffloadV12.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NdisIpsecOffloadV1) {
                    (NdisIpsecOffloadV10.typeLayout()).writeNative(addr, value.supported)
                    (NdisIpsecOffloadV11.typeLayout()).writeNative(addr + 20L, value.iPv4AH)
                    (NdisIpsecOffloadV12.typeLayout()).writeNative(addr + 24L, value.iPv4ESP)
                }
            }
    }
}

public data class NdisIpsecOffloadV11(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV11> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV11> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NdisIpsecOffloadV11 =
                    NdisIpsecOffloadV11(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisIpsecOffloadV11) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NdisIpsecOffloadV12(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV12> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV12> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NdisIpsecOffloadV12 =
                    NdisIpsecOffloadV12(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisIpsecOffloadV12) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NdisIpsecOffloadV10(
    public var encapsulation: UInt = 0u,
    public var ahEspCombined: UInt = 0u,
    public var transportTunnelCombined: UInt = 0u,
    public var iPv4Options: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisIpsecOffloadV10 =
                    NdisIpsecOffloadV10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisIpsecOffloadV10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ahEspCombined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.transportTunnelCombined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.iPv4Options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class NdisIpOperState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var ipOperationalStatus: NdisIpOperStatus = NdisIpOperStatus(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpOperState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpOperState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisIpOperState =
                    NdisIpOperState(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (NdisIpOperStatus.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisIpOperState) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (NdisIpOperStatus.typeLayout()).writeNative(addr + 8L, value.ipOperationalStatus)
                }
            }
    }
}

public data class NdisIpOperStatus(
    public var addressFamily: UInt = 0u,
    public var operationalStatus: NetIfOperStatus = 0,
    public var operationalStatusFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpOperStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpOperStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NdisIpOperStatus =
                    NdisIpOperStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisIpOperStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.addressFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.operationalStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.operationalStatusFlags)
                }
            }
    }
}

public data class NdisIpOperStatusInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var numberofAddressFamiliesReturned: UInt = 0u,
    public var ipOperationalStatus: List<NdisIpOperStatus> = List(32) { NdisIpOperStatus() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpOperStatusInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpOperStatusInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 396L
                override fun readNative(addr: Long): NdisIpOperStatusInfo =
                    NdisIpOperStatusInfo(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NdisIpOperStatus.typeLayout(), (32).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisIpOperStatusInfo) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberofAddressFamiliesReturned)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NdisIpOperStatus.typeLayout(), (32).toInt())
                    ).writeNative(addr + 12L, value.ipOperationalStatus)
                }
            }
    }
}

public data class NdisIrdaPacketInfo(
    public var extraBOFs: UInt = 0u,
    public var minTurnAroundTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIrdaPacketInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIrdaPacketInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NdisIrdaPacketInfo =
                    NdisIrdaPacketInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisIrdaPacketInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extraBOFs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minTurnAroundTime)
                }
            }
    }
}

public data class NdisLinkParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var mediaDuplexState: NetIfMediaDuplexState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var pauseFunctions: NdisSupportedPauseFunctions = 0,
    public var autoNegotiationFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisLinkParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisLinkParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NdisLinkParameters =
                    NdisLinkParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: NdisLinkParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.mediaDuplexState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.xmitLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rcvLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.pauseFunctions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.autoNegotiationFlags)
                }
            }
    }
}

public data class NdisLinkSpeed(
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisLinkSpeed> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisLinkSpeed> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdisLinkSpeed =
                    NdisLinkSpeed(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisLinkSpeed) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.xmitLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rcvLinkSpeed)
                }
            }
    }
}

public data class NdisLinkState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var mediaDuplexState: NetIfMediaDuplexState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var pauseFunctions: NdisSupportedPauseFunctions = 0,
    public var autoNegotiationFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisLinkState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisLinkState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): NdisLinkState =
                    NdisLinkState(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: NdisLinkState) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.mediaConnectState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.mediaDuplexState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.xmitLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.rcvLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.pauseFunctions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.autoNegotiationFlags)
                }
            }
    }
}

public data class NdisObjectHeader(
    public var type: UByte = 0u,
    public var revision: UByte = 0u,
    public var size: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisObjectHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisObjectHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NdisObjectHeader =
                    NdisObjectHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: NdisObjectHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.size)
                }
            }
    }
}

public data class NdisOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var checksum: NdisTcpIpChecksumOffload = NdisTcpIpChecksumOffload(),
    public var lsoV1: NdisTcpLargeSendOffloadV1 = NdisTcpLargeSendOffloadV1(),
    public var iPsecV1: NdisIpsecOffloadV1 = NdisIpsecOffloadV1(),
    public var lsoV2: NdisTcpLargeSendOffloadV2 = NdisTcpLargeSendOffloadV2(),
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisOffload> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): NdisOffload =
                    NdisOffload(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (NdisTcpIpChecksumOffload.typeLayout()).readNative(addr + 4L),
                        (NdisTcpLargeSendOffloadV1.typeLayout()).readNative(addr + 36L),
                        (NdisIpsecOffloadV1.typeLayout()).readNative(addr + 52L),
                        (NdisTcpLargeSendOffloadV2.typeLayout()).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                    )
                override fun writeNative(addr: Long, value: NdisOffload) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (NdisTcpIpChecksumOffload.typeLayout()).writeNative(addr + 4L, value.checksum)
                    (NdisTcpLargeSendOffloadV1.typeLayout()).writeNative(addr + 36L, value.lsoV1)
                    (NdisIpsecOffloadV1.typeLayout()).writeNative(addr + 52L, value.iPsecV1)
                    (NdisTcpLargeSendOffloadV2.typeLayout()).writeNative(addr + 80L, value.lsoV2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.flags)
                }
            }
    }
}

public data class NdisOffloadParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var iPv4Checksum: UByte = 0u,
    public var tCPIPv4Checksum: UByte = 0u,
    public var uDPIPv4Checksum: UByte = 0u,
    public var tCPIPv6Checksum: UByte = 0u,
    public var uDPIPv6Checksum: UByte = 0u,
    public var lsoV1: UByte = 0u,
    public var iPsecV1: UByte = 0u,
    public var lsoV2IPv4: UByte = 0u,
    public var lsoV2IPv6: UByte = 0u,
    public var tcpConnectionIPv4: UByte = 0u,
    public var tcpConnectionIPv6: UByte = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisOffloadParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisOffloadParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisOffloadParameters =
                    NdisOffloadParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisOffloadParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.iPv4Checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.tCPIPv4Checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.uDPIPv4Checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.tCPIPv6Checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.uDPIPv6Checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.lsoV1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.iPsecV1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.lsoV2IPv4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.lsoV2IPv6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.tcpConnectionIPv4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.tcpConnectionIPv6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class NdisOperState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var operationalStatus: NetIfOperStatus = 0,
    public var operationalStatusFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisOperState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisOperState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NdisOperState =
                    NdisOperState(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisOperState) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.operationalStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.operationalStatusFlags)
                }
            }
    }
}

public data class NdisPciDeviceCustomProperties(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var deviceType: UInt = 0u,
    public var currentSpeedAndMode: UInt = 0u,
    public var currentPayloadSize: UInt = 0u,
    public var maxPayloadSize: UInt = 0u,
    public var maxReadRequestSize: UInt = 0u,
    public var currentLinkSpeed: UInt = 0u,
    public var currentLinkWidth: UInt = 0u,
    public var maxLinkSpeed: UInt = 0u,
    public var maxLinkWidth: UInt = 0u,
    public var pciExpressVersion: UInt = 0u,
    public var interruptType: UInt = 0u,
    public var maxInterruptMessages: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPciDeviceCustomProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPciDeviceCustomProperties> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): NdisPciDeviceCustomProperties =
                    NdisPciDeviceCustomProperties(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
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
                    )
                override fun writeNative(addr: Long, value: NdisPciDeviceCustomProperties) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.deviceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.currentSpeedAndMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.currentPayloadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maxPayloadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.maxReadRequestSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.currentLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.currentLinkWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.maxLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maxLinkWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.pciExpressVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.interruptType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.maxInterruptMessages)
                }
            }
    }
}

public data class NdisPmPacketPattern(
    public var priority: UInt = 0u,
    public var reserved: UInt = 0u,
    public var maskSize: UInt = 0u,
    public var patternOffset: UInt = 0u,
    public var patternSize: UInt = 0u,
    public var patternFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPmPacketPattern> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPmPacketPattern> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NdisPmPacketPattern =
                    NdisPmPacketPattern(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NdisPmPacketPattern) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.priority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maskSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.patternOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.patternSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.patternFlags)
                }
            }
    }
}

public data class NdisPmWakeUpCapabilities(
    public var minMagicPacketWakeUp: NdisDevicePowerState = 0,
    public var minPatternWakeUp: NdisDevicePowerState = 0,
    public var minLinkChangeWakeUp: NdisDevicePowerState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPmWakeUpCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPmWakeUpCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NdisPmWakeUpCapabilities =
                    NdisPmWakeUpCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisPmWakeUpCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.minMagicPacketWakeUp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.minPatternWakeUp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.minLinkChangeWakeUp)
                }
            }
    }
}

public data class NdisPnpCapabilities(
    public var flags: UInt = 0u,
    public var wakeUpCapabilities: NdisPmWakeUpCapabilities = NdisPmWakeUpCapabilities(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPnpCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPnpCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdisPnpCapabilities =
                    NdisPnpCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (NdisPmWakeUpCapabilities.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisPnpCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (NdisPmWakeUpCapabilities.typeLayout()).writeNative(addr + 4L, value.wakeUpCapabilities)
                }
            }
    }
}

public class NdisPort internal constructor(
    nextCtorArg: MutPtr<NdisPort>,
    ndisReservedCtorArg: MutPtr<CVoid>,
    miniportReservedCtorArg: MutPtr<CVoid>,
    protocolReservedCtorArg: MutPtr<CVoid>,
    public var portCharacteristics: NdisPortCharacteristics,
) {
    public var next: MutPtr<NdisPort> = nextCtorArg
        internal set

    public var ndisReserved: MutPtr<CVoid> = ndisReservedCtorArg
        internal set

    public var miniportReserved: MutPtr<CVoid> = miniportReservedCtorArg
        internal set

    public var protocolReserved: MutPtr<CVoid> = protocolReservedCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        ndisReservedCtorArg = MutPtr(0L),
        miniportReservedCtorArg = MutPtr(0L),
        protocolReservedCtorArg = MutPtr(0L),
        portCharacteristics = NdisPortCharacteristics(),
    )

    public operator fun component1(): MutPtr<NdisPort> = this.next

    public operator fun component2(): MutPtr<CVoid> = this.ndisReserved

    public operator fun component3(): MutPtr<CVoid> = this.miniportReserved

    public operator fun component4(): MutPtr<CVoid> = this.protocolReserved

    public operator fun component5(): NdisPortCharacteristics = this.portCharacteristics

    public fun copy(next: MutPtr<NdisPort> = this.next, ndisReserved: MutPtr<CVoid> = this.ndisReserved, miniportReserved: MutPtr<CVoid> = this.miniportReserved, protocolReserved: MutPtr<CVoid> = this.protocolReserved, portCharacteristics: NdisPortCharacteristics = this.portCharacteristics): NdisPort = NdisPort(nextCtorArg = next, ndisReservedCtorArg = ndisReserved, miniportReservedCtorArg = miniportReserved, protocolReservedCtorArg = protocolReserved, portCharacteristics = portCharacteristics)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisPort) return false
        if (this.next != other.next) return false
        if (this.ndisReserved != other.ndisReserved) return false
        if (this.miniportReserved != other.miniportReserved) return false
        if (this.protocolReserved != other.protocolReserved) return false
        if (this.portCharacteristics != other.portCharacteristics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.ndisReserved.hashCode()
        result = 31 * result + this.miniportReserved.hashCode()
        result = 31 * result + this.protocolReserved.hashCode()
        result = 31 * result + this.portCharacteristics.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPort> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPort> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): NdisPort =
                    NdisPort(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<NdisPort>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (NdisPortCharacteristics.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: NdisPort) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<NdisPort>(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.ndisReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.miniportReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.protocolReserved)
                    (NdisPortCharacteristics.typeLayout()).writeNative(addr + 32L, value.portCharacteristics)
                }
            }

        public operator fun invoke(
            next: MutPtr<NdisPort> = MutPtr(0L),
            ndisReserved: MutPtr<CVoid> = MutPtr(0L),
            miniportReserved: MutPtr<CVoid> = MutPtr(0L),
            protocolReserved: MutPtr<CVoid> = MutPtr(0L),
            portCharacteristics: NdisPortCharacteristics = NdisPortCharacteristics(),
        ): NdisPort =
            NdisPort(
                nextCtorArg = next,
                ndisReservedCtorArg = ndisReserved,
                miniportReservedCtorArg = miniportReserved,
                protocolReservedCtorArg = protocolReserved,
                portCharacteristics = portCharacteristics,
            )
    }
}

public data class NdisPortArray(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var numberOfPorts: UInt = 0u,
    public var offsetFirstPort: UInt = 0u,
    public var elementSize: UInt = 0u,
    public var ports: List<NdisPortCharacteristics> = List(1) { NdisPortCharacteristics() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPortArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPortArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): NdisPortArray =
                    NdisPortArray(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NdisPortCharacteristics.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisPortArray) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offsetFirstPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.elementSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NdisPortCharacteristics.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.ports)
                }
            }
    }
}

public data class NdisPortAuthenticationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var sendControlState: NdisPortControlState = 0,
    public var rcvControlState: NdisPortControlState = 0,
    public var sendAuthorizationState: NdisPortAuthorizationState = 0,
    public var rcvAuthorizationState: NdisPortAuthorizationState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPortAuthenticationParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPortAuthenticationParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisPortAuthenticationParameters =
                    NdisPortAuthenticationParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisPortAuthenticationParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.sendControlState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.rcvControlState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.sendAuthorizationState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.rcvAuthorizationState)
                }
            }
    }
}

public data class NdisPortCharacteristics(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var portNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var type: NdisPortType = 0,
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var direction: NetIfDirectionType = 0,
    public var sendControlState: NdisPortControlState = 0,
    public var rcvControlState: NdisPortControlState = 0,
    public var sendAuthorizationState: NdisPortAuthorizationState = 0,
    public var rcvAuthorizationState: NdisPortAuthorizationState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPortCharacteristics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPortCharacteristics> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): NdisPortCharacteristics =
                    NdisPortCharacteristics(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: NdisPortCharacteristics) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.mediaConnectState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.xmitLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.rcvLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.direction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.sendControlState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.rcvControlState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.sendAuthorizationState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.rcvAuthorizationState)
                }
            }
    }
}

public data class NdisPortState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var direction: NetIfDirectionType = 0,
    public var sendControlState: NdisPortControlState = 0,
    public var rcvControlState: NdisPortControlState = 0,
    public var sendAuthorizationState: NdisPortAuthorizationState = 0,
    public var rcvAuthorizationState: NdisPortAuthorizationState = 0,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPortState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPortState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): NdisPortState =
                    NdisPortState(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: NdisPortState) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.mediaConnectState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.xmitLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rcvLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.direction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.sendControlState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.rcvControlState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.sendAuthorizationState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.rcvAuthorizationState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.flags)
                }
            }
    }
}

public data class NdisReceiveHashParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var hashInformation: UInt = 0u,
    public var hashSecretKeySize: UShort = 0u,
    public var hashSecretKeyOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveHashParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveHashParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisReceiveHashParameters =
                    NdisReceiveHashParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisReceiveHashParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hashInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.hashSecretKeySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.hashSecretKeyOffset)
                }
            }
    }
}

public data class NdisReceiveScaleCapabilities(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var capabilitiesFlags: UInt = 0u,
    public var numberOfInterruptMessages: UInt = 0u,
    public var numberOfReceiveQueues: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveScaleCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveScaleCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdisReceiveScaleCapabilities =
                    NdisReceiveScaleCapabilities(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisReceiveScaleCapabilities) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.capabilitiesFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfInterruptMessages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfReceiveQueues)
                }
            }
    }
}

public data class NdisReceiveScaleParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UShort = 0u,
    public var baseCpuNumber: UShort = 0u,
    public var hashInformation: UInt = 0u,
    public var indirectionTableSize: UShort = 0u,
    public var indirectionTableOffset: UInt = 0u,
    public var hashSecretKeySize: UShort = 0u,
    public var hashSecretKeyOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveScaleParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveScaleParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): NdisReceiveScaleParameters =
                    NdisReceiveScaleParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NdisReceiveScaleParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.baseCpuNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hashInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.indirectionTableSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.indirectionTableOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.hashSecretKeySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.hashSecretKeyOffset)
                }
            }
    }
}

public class NdisStatisticsInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var supportedStatistics: UInt = 0u,
    public var ifInDiscards: ULong = 0uL,
    public var ifInErrors: ULong = 0uL,
    public var ifHCInOctets: ULong = 0uL,
    public var ifHCInUcastPkts: ULong = 0uL,
    public var ifHCInMulticastPkts: ULong = 0uL,
    public var ifHCInBroadcastPkts: ULong = 0uL,
    public var ifHCOutOctets: ULong = 0uL,
    public var ifHCOutUcastPkts: ULong = 0uL,
    public var ifHCOutMulticastPkts: ULong = 0uL,
    public var ifHCOutBroadcastPkts: ULong = 0uL,
    public var ifOutErrors: ULong = 0uL,
    public var ifOutDiscards: ULong = 0uL,
    public var ifHCInUcastOctets: ULong = 0uL,
    public var ifHCInMulticastOctets: ULong = 0uL,
    public var ifHCInBroadcastOctets: ULong = 0uL,
    public var ifHCOutUcastOctets: ULong = 0uL,
    public var ifHCOutMulticastOctets: ULong = 0uL,
    public var ifHCOutBroadcastOctets: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): NdisStatisticsInfo =
                    NdisStatisticsInfo(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
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
                    )
                override fun writeNative(addr: Long, value: NdisStatisticsInfo) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.supportedStatistics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ifInDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ifInErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ifHCInOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ifHCInUcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ifHCInMulticastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ifHCInBroadcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ifHCOutOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.ifHCOutUcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ifHCOutMulticastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.ifHCOutBroadcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.ifOutErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.ifOutDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.ifHCInUcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.ifHCInMulticastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.ifHCInBroadcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.ifHCOutUcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.ifHCOutMulticastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.ifHCOutBroadcastOctets)
                }
            }
    }
}

public data class NdisStatisticsValue(
    public var oid: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisStatisticsValue) return false
        if (this.oid != other.oid) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oid.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsValue> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NdisStatisticsValue =
                    NdisStatisticsValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NdisStatisticsValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.oid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.data.toList())
                }
            }
    }
}

public data class NdisStatisticsValueEx(
    public var oid: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisStatisticsValueEx) return false
        if (this.oid != other.oid) return false
        if (this.dataLength != other.dataLength) return false
        if (this.length != other.length) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oid.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsValueEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsValueEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdisStatisticsValueEx =
                    NdisStatisticsValueEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NdisStatisticsValueEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.oid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.data.toList())
                }
            }
    }
}

public data class NdisTcpConnectionOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
    public var tcpConnectionOffloadCapacity: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpConnectionOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpConnectionOffload> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisTcpConnectionOffload =
                    NdisTcpConnectionOffload(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpConnectionOffload) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpConnectionOffloadCapacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class NdisTcpIpChecksumOffload(
    public var iPv4Transmit: NdisTcpIpChecksumOffload0 = NdisTcpIpChecksumOffload0(),
    public var iPv4Receive: NdisTcpIpChecksumOffload1 = NdisTcpIpChecksumOffload1(),
    public var iPv6Transmit: NdisTcpIpChecksumOffload2 = NdisTcpIpChecksumOffload2(),
    public var iPv6Receive: NdisTcpIpChecksumOffload3 = NdisTcpIpChecksumOffload3(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NdisTcpIpChecksumOffload =
                    NdisTcpIpChecksumOffload(
                        (NdisTcpIpChecksumOffload0.typeLayout()).readNative(addr),
                        (NdisTcpIpChecksumOffload1.typeLayout()).readNative(addr + 8L),
                        (NdisTcpIpChecksumOffload2.typeLayout()).readNative(addr + 16L),
                        (NdisTcpIpChecksumOffload3.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumOffload) {
                    (NdisTcpIpChecksumOffload0.typeLayout()).writeNative(addr, value.iPv4Transmit)
                    (NdisTcpIpChecksumOffload1.typeLayout()).writeNative(addr + 8L, value.iPv4Receive)
                    (NdisTcpIpChecksumOffload2.typeLayout()).writeNative(addr + 16L, value.iPv6Transmit)
                    (NdisTcpIpChecksumOffload3.typeLayout()).writeNative(addr + 24L, value.iPv6Receive)
                }
            }
    }
}

public data class NdisTcpIpChecksumOffload1(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NdisTcpIpChecksumOffload1 =
                    NdisTcpIpChecksumOffload1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumOffload1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public data class NdisTcpIpChecksumOffload0(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NdisTcpIpChecksumOffload0 =
                    NdisTcpIpChecksumOffload0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumOffload0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public data class NdisTcpIpChecksumOffload3(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NdisTcpIpChecksumOffload3 =
                    NdisTcpIpChecksumOffload3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumOffload3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public data class NdisTcpIpChecksumOffload2(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NdisTcpIpChecksumOffload2 =
                    NdisTcpIpChecksumOffload2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumOffload2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public data class NdisTcpLargeSendOffloadV1(
    public var iPv4: NdisTcpLargeSendOffloadV10 = NdisTcpLargeSendOffloadV10(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdisTcpLargeSendOffloadV1 =
                    NdisTcpLargeSendOffloadV1(
                        (NdisTcpLargeSendOffloadV10.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisTcpLargeSendOffloadV1) {
                    (NdisTcpLargeSendOffloadV10.typeLayout()).writeNative(addr, value.iPv4)
                }
            }
    }
}

public data class NdisTcpLargeSendOffloadV10(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdisTcpLargeSendOffloadV10 =
                    NdisTcpLargeSendOffloadV10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpLargeSendOffloadV10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bitfield)
                }
            }
    }
}

public data class NdisTcpLargeSendOffloadV2(
    public var iPv4: NdisTcpLargeSendOffloadV20 = NdisTcpLargeSendOffloadV20(),
    public var iPv6: NdisTcpLargeSendOffloadV21 = NdisTcpLargeSendOffloadV21(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): NdisTcpLargeSendOffloadV2 =
                    NdisTcpLargeSendOffloadV2(
                        (NdisTcpLargeSendOffloadV20.typeLayout()).readNative(addr),
                        (NdisTcpLargeSendOffloadV21.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpLargeSendOffloadV2) {
                    (NdisTcpLargeSendOffloadV20.typeLayout()).writeNative(addr, value.iPv4)
                    (NdisTcpLargeSendOffloadV21.typeLayout()).writeNative(addr + 12L, value.iPv6)
                }
            }
    }
}

public data class NdisTcpLargeSendOffloadV20(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV20> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NdisTcpLargeSendOffloadV20 =
                    NdisTcpLargeSendOffloadV20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpLargeSendOffloadV20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                }
            }
    }
}

public data class NdisTcpLargeSendOffloadV21(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV21> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV21> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdisTcpLargeSendOffloadV21 =
                    NdisTcpLargeSendOffloadV21(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpLargeSendOffloadV21) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bitfield)
                }
            }
    }
}

public data class NdisTimeoutDpcRequestCapabilities(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var timeoutArrayLength: UInt = 0u,
    public var timeoutArray: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisTimeoutDpcRequestCapabilities) return false
        if (this.header != other.header) return false
        if (this.flags != other.flags) return false
        if (this.timeoutArrayLength != other.timeoutArrayLength) return false
        if (!this.timeoutArray.contentEquals(other.timeoutArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.timeoutArrayLength.hashCode()
        result = 31 * result + this.timeoutArray.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimeoutDpcRequestCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimeoutDpcRequestCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdisTimeoutDpcRequestCapabilities =
                    NdisTimeoutDpcRequestCapabilities(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 12L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: NdisTimeoutDpcRequestCapabilities) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.timeoutArrayLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 12L, value.timeoutArray.toList())
                }
            }
    }
}

public data class NdisTimestampCapabilities(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var hardwareClockFrequencyHz: ULong = 0uL,
    public var crossTimestamp: Boolean = false,
    public var reserved1: ULong = 0uL,
    public var reserved2: ULong = 0uL,
    public var timestampFlags: NdisTimestampCapabilityFlags = NdisTimestampCapabilityFlags(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimestampCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimestampCapabilities> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): NdisTimestampCapabilities =
                    NdisTimestampCapabilities(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (NdisTimestampCapabilityFlags.typeLayout()).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: NdisTimestampCapabilities) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.hardwareClockFrequencyHz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.crossTimestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.reserved2)
                    (NdisTimestampCapabilityFlags.typeLayout()).writeNative(addr + 40L, value.timestampFlags)
                }
            }
    }
}

public data class NdisTimestampCapabilityFlags(
    public var ptpV2OverUdpIPv4EventMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv4AllMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv4EventMsgTransmitHw: Boolean = false,
    public var ptpV2OverUdpIPv4AllMsgTransmitHw: Boolean = false,
    public var ptpV2OverUdpIPv6EventMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv6AllMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv6EventMsgTransmitHw: Boolean = false,
    public var ptpV2OverUdpIPv6AllMsgTransmitHw: Boolean = false,
    public var allReceiveHw: Boolean = false,
    public var allTransmitHw: Boolean = false,
    public var taggedTransmitHw: Boolean = false,
    public var allReceiveSw: Boolean = false,
    public var allTransmitSw: Boolean = false,
    public var taggedTransmitSw: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimestampCapabilityFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimestampCapabilityFlags> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 14L
                override fun readNative(addr: Long): NdisTimestampCapabilityFlags =
                    NdisTimestampCapabilityFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 13L),
                    )
                override fun writeNative(addr: Long, value: NdisTimestampCapabilityFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.ptpV2OverUdpIPv4EventMsgReceiveHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.ptpV2OverUdpIPv4AllMsgReceiveHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.ptpV2OverUdpIPv4EventMsgTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.ptpV2OverUdpIPv4AllMsgTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.ptpV2OverUdpIPv6EventMsgReceiveHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.ptpV2OverUdpIPv6AllMsgReceiveHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.ptpV2OverUdpIPv6EventMsgTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 7L, value.ptpV2OverUdpIPv6AllMsgTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.allReceiveHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.allTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.taggedTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 11L, value.allReceiveSw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.allTransmitSw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 13L, value.taggedTransmitSw)
                }
            }
    }
}

public data class NdisVarDataDesc(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var offset: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisVarDataDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisVarDataDesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdisVarDataDesc =
                    NdisVarDataDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisVarDataDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maximumLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.offset)
                }
            }
    }
}

public data class NdisWanProtocolCaps(
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWanProtocolCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWanProtocolCaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NdisWanProtocolCaps =
                    NdisWanProtocolCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisWanProtocolCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class NdisWlanBssid(
    public var length: UInt = 0u,
    public var macAddress: UByteArray = UByteArray(6),
    public var reserved: UByteArray = UByteArray(2),
    public var ssid: Ndis80211Ssid = Ndis80211Ssid(),
    public var privacy: UInt = 0u,
    public var rssi: Int = 0,
    public var networkTypeInUse: Ndis80211NetworkType = 0,
    public var configuration: Ndis80211Configuration = Ndis80211Configuration(),
    public var infrastructureMode: Ndis80211NetworkInfrastructure = 0,
    public var supportedRates: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWlanBssid) return false
        if (this.length != other.length) return false
        if (!this.macAddress.contentEquals(other.macAddress)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.ssid != other.ssid) return false
        if (this.privacy != other.privacy) return false
        if (this.rssi != other.rssi) return false
        if (this.networkTypeInUse != other.networkTypeInUse) return false
        if (this.configuration != other.configuration) return false
        if (this.infrastructureMode != other.infrastructureMode) return false
        if (!this.supportedRates.contentEquals(other.supportedRates)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.macAddress.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        result = 31 * result + this.privacy.hashCode()
        result = 31 * result + this.rssi.hashCode()
        result = 31 * result + this.networkTypeInUse.hashCode()
        result = 31 * result + this.configuration.hashCode()
        result = 31 * result + this.infrastructureMode.hashCode()
        result = 31 * result + this.supportedRates.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWlanBssid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWlanBssid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): NdisWlanBssid =
                    NdisWlanBssid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 10L).toUByteArray(),
                        (Ndis80211Ssid.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (Ndis80211Configuration.typeLayout()).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 92L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 96L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NdisWlanBssid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.macAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 10L, value.reserved.toList())
                    (Ndis80211Ssid.typeLayout()).writeNative(addr + 12L, value.ssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.privacy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.rssi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.networkTypeInUse)
                    (Ndis80211Configuration.typeLayout()).writeNative(addr + 60L, value.configuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 92L, value.infrastructureMode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 96L, value.supportedRates.toList())
                }
            }
    }
}

public data class NdisWlanBssidEx(
    public var length: UInt = 0u,
    public var macAddress: UByteArray = UByteArray(6),
    public var reserved: UByteArray = UByteArray(2),
    public var ssid: Ndis80211Ssid = Ndis80211Ssid(),
    public var privacy: UInt = 0u,
    public var rssi: Int = 0,
    public var networkTypeInUse: Ndis80211NetworkType = 0,
    public var configuration: Ndis80211Configuration = Ndis80211Configuration(),
    public var infrastructureMode: Ndis80211NetworkInfrastructure = 0,
    public var supportedRates: UByteArray = UByteArray(16),
    public var iELength: UInt = 0u,
    public var iEs: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWlanBssidEx) return false
        if (this.length != other.length) return false
        if (!this.macAddress.contentEquals(other.macAddress)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.ssid != other.ssid) return false
        if (this.privacy != other.privacy) return false
        if (this.rssi != other.rssi) return false
        if (this.networkTypeInUse != other.networkTypeInUse) return false
        if (this.configuration != other.configuration) return false
        if (this.infrastructureMode != other.infrastructureMode) return false
        if (!this.supportedRates.contentEquals(other.supportedRates)) return false
        if (this.iELength != other.iELength) return false
        if (!this.iEs.contentEquals(other.iEs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.macAddress.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        result = 31 * result + this.privacy.hashCode()
        result = 31 * result + this.rssi.hashCode()
        result = 31 * result + this.networkTypeInUse.hashCode()
        result = 31 * result + this.configuration.hashCode()
        result = 31 * result + this.infrastructureMode.hashCode()
        result = 31 * result + this.supportedRates.contentHashCode()
        result = 31 * result + this.iELength.hashCode()
        result = 31 * result + this.iEs.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWlanBssidEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWlanBssidEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): NdisWlanBssidEx =
                    NdisWlanBssidEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 10L).toUByteArray(),
                        (Ndis80211Ssid.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (Ndis80211Configuration.typeLayout()).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 92L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 96L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 116L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NdisWlanBssidEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.macAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 10L, value.reserved.toList())
                    (Ndis80211Ssid.typeLayout()).writeNative(addr + 12L, value.ssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.privacy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.rssi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.networkTypeInUse)
                    (Ndis80211Configuration.typeLayout()).writeNative(addr + 60L, value.configuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 92L, value.infrastructureMode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 96L, value.supportedRates.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.iELength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 116L, value.iEs.toList())
                }
            }
    }
}

public data class NdisWmiEnumAdapter(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ifIndex: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var deviceNameLength: UShort = 0u,
    public var deviceName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiEnumAdapter) return false
        if (this.header != other.header) return false
        if (this.ifIndex != other.ifIndex) return false
        if (this.netLuid != other.netLuid) return false
        if (this.deviceNameLength != other.deviceNameLength) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.ifIndex.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.deviceNameLength.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        return result
    }
}

public data class NdisWmiEventHeader(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ifIndex: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var requestId: ULong = 0uL,
    public var portNumber: UInt = 0u,
    public var deviceNameLength: UInt = 0u,
    public var deviceNameOffset: UInt = 0u,
    public var padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiEventHeader) return false
        if (this.header != other.header) return false
        if (this.ifIndex != other.ifIndex) return false
        if (this.netLuid != other.netLuid) return false
        if (this.requestId != other.requestId) return false
        if (this.portNumber != other.portNumber) return false
        if (this.deviceNameLength != other.deviceNameLength) return false
        if (this.deviceNameOffset != other.deviceNameOffset) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.ifIndex.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.requestId.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.deviceNameLength.hashCode()
        result = 31 * result + this.deviceNameOffset.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class NdisWmiIpsecOffloadV1(
    public var supported: NdisWmiIpsecOffloadV10 = NdisWmiIpsecOffloadV10(),
    public var iPv4AH: NdisWmiIpsecOffloadV11 = NdisWmiIpsecOffloadV11(),
    public var iPv4ESP: NdisWmiIpsecOffloadV12 = NdisWmiIpsecOffloadV12(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): NdisWmiIpsecOffloadV1 =
                    NdisWmiIpsecOffloadV1(
                        (NdisWmiIpsecOffloadV10.typeLayout()).readNative(addr),
                        (NdisWmiIpsecOffloadV11.typeLayout()).readNative(addr + 20L),
                        (NdisWmiIpsecOffloadV12.typeLayout()).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiIpsecOffloadV1) {
                    (NdisWmiIpsecOffloadV10.typeLayout()).writeNative(addr, value.supported)
                    (NdisWmiIpsecOffloadV11.typeLayout()).writeNative(addr + 20L, value.iPv4AH)
                    (NdisWmiIpsecOffloadV12.typeLayout()).writeNative(addr + 44L, value.iPv4ESP)
                }
            }
    }
}

public data class NdisWmiIpsecOffloadV11(
    public var md5: UInt = 0u,
    public var sha1: UInt = 0u,
    public var transport: UInt = 0u,
    public var tunnel: UInt = 0u,
    public var send: UInt = 0u,
    public var receive: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV11> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV11> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NdisWmiIpsecOffloadV11 =
                    NdisWmiIpsecOffloadV11(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiIpsecOffloadV11) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.md5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sha1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.transport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tunnel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.send)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.receive)
                }
            }
    }
}

public data class NdisWmiIpsecOffloadV12(
    public var des: UInt = 0u,
    public var reserved: UInt = 0u,
    public var tripleDes: UInt = 0u,
    public var nullEsp: UInt = 0u,
    public var transport: UInt = 0u,
    public var tunnel: UInt = 0u,
    public var send: UInt = 0u,
    public var receive: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV12> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV12> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NdisWmiIpsecOffloadV12 =
                    NdisWmiIpsecOffloadV12(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiIpsecOffloadV12) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.des)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tripleDes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nullEsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.transport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.tunnel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.send)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.receive)
                }
            }
    }
}

public data class NdisWmiIpsecOffloadV10(
    public var encapsulation: UInt = 0u,
    public var ahEspCombined: UInt = 0u,
    public var transportTunnelCombined: UInt = 0u,
    public var iPv4Options: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisWmiIpsecOffloadV10 =
                    NdisWmiIpsecOffloadV10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiIpsecOffloadV10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ahEspCombined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.transportTunnelCombined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.iPv4Options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class NdisWmiMethodHeader(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var portNumber: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var requestId: ULong = 0uL,
    public var timeout: UInt = 0u,
    public var padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiMethodHeader) return false
        if (this.header != other.header) return false
        if (this.portNumber != other.portNumber) return false
        if (this.netLuid != other.netLuid) return false
        if (this.requestId != other.requestId) return false
        if (this.timeout != other.timeout) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.requestId.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class NdisWmiOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var checksum: NdisWmiTcpIpChecksumOffload = NdisWmiTcpIpChecksumOffload(),
    public var lsoV1: NdisWmiTcpLargeSendOffloadV1 = NdisWmiTcpLargeSendOffloadV1(),
    public var iPsecV1: NdisWmiIpsecOffloadV1 = NdisWmiIpsecOffloadV1(),
    public var lsoV2: NdisWmiTcpLargeSendOffloadV2 = NdisWmiTcpLargeSendOffloadV2(),
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiOffload> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 224L
                override fun readNative(addr: Long): NdisWmiOffload =
                    NdisWmiOffload(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (NdisWmiTcpIpChecksumOffload.typeLayout()).readNative(addr + 4L),
                        (NdisWmiTcpLargeSendOffloadV1.typeLayout()).readNative(addr + 92L),
                        (NdisWmiIpsecOffloadV1.typeLayout()).readNative(addr + 112L),
                        (NdisWmiTcpLargeSendOffloadV2.typeLayout()).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 220L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiOffload) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (NdisWmiTcpIpChecksumOffload.typeLayout()).writeNative(addr + 4L, value.checksum)
                    (NdisWmiTcpLargeSendOffloadV1.typeLayout()).writeNative(addr + 92L, value.lsoV1)
                    (NdisWmiIpsecOffloadV1.typeLayout()).writeNative(addr + 112L, value.iPsecV1)
                    (NdisWmiTcpLargeSendOffloadV2.typeLayout()).writeNative(addr + 188L, value.lsoV2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 220L, value.flags)
                }
            }
    }
}

public data class NdisWmiOutputInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var supportedRevision: UByte = 0u,
    public var dataOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiOutputInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiOutputInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdisWmiOutputInfo =
                    NdisWmiOutputInfo(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiOutputInfo) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.supportedRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataOffset)
                }
            }
    }
}

public data class NdisWmiSetHeader(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var portNumber: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var requestId: ULong = 0uL,
    public var timeout: UInt = 0u,
    public var padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiSetHeader) return false
        if (this.header != other.header) return false
        if (this.portNumber != other.portNumber) return false
        if (this.netLuid != other.netLuid) return false
        if (this.requestId != other.requestId) return false
        if (this.timeout != other.timeout) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.requestId.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class NdisWmiTcpConnectionOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var encapsulation: UInt = 0u,
    public var supportIPv4: UInt = 0u,
    public var supportIPv6: UInt = 0u,
    public var supportIPv6ExtensionHeaders: UInt = 0u,
    public var supportSack: UInt = 0u,
    public var tcpConnectionOffloadCapacity: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpConnectionOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpConnectionOffload> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NdisWmiTcpConnectionOffload =
                    NdisWmiTcpConnectionOffload(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpConnectionOffload) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.supportIPv4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.supportIPv6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.supportIPv6ExtensionHeaders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.supportSack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.tcpConnectionOffloadCapacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.flags)
                }
            }
    }
}

public data class NdisWmiTcpIpChecksumOffload(
    public var iPv4Transmit: NdisWmiTcpIpChecksumOffload0 = NdisWmiTcpIpChecksumOffload0(),
    public var iPv4Receive: NdisWmiTcpIpChecksumOffload1 = NdisWmiTcpIpChecksumOffload1(),
    public var iPv6Transmit: NdisWmiTcpIpChecksumOffload2 = NdisWmiTcpIpChecksumOffload2(),
    public var iPv6Receive: NdisWmiTcpIpChecksumOffload3 = NdisWmiTcpIpChecksumOffload3(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): NdisWmiTcpIpChecksumOffload =
                    NdisWmiTcpIpChecksumOffload(
                        (NdisWmiTcpIpChecksumOffload0.typeLayout()).readNative(addr),
                        (NdisWmiTcpIpChecksumOffload1.typeLayout()).readNative(addr + 24L),
                        (NdisWmiTcpIpChecksumOffload2.typeLayout()).readNative(addr + 48L),
                        (NdisWmiTcpIpChecksumOffload3.typeLayout()).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpIpChecksumOffload) {
                    (NdisWmiTcpIpChecksumOffload0.typeLayout()).writeNative(addr, value.iPv4Transmit)
                    (NdisWmiTcpIpChecksumOffload1.typeLayout()).writeNative(addr + 24L, value.iPv4Receive)
                    (NdisWmiTcpIpChecksumOffload2.typeLayout()).writeNative(addr + 48L, value.iPv6Transmit)
                    (NdisWmiTcpIpChecksumOffload3.typeLayout()).writeNative(addr + 68L, value.iPv6Receive)
                }
            }
    }
}

public data class NdisWmiTcpIpChecksumOffload1(
    public var encapsulation: UInt = 0u,
    public var ipOptionsSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
    public var ipChecksum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NdisWmiTcpIpChecksumOffload1 =
                    NdisWmiTcpIpChecksumOffload1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpIpChecksumOffload1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ipOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tcpOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.udpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ipChecksum)
                }
            }
    }
}

public data class NdisWmiTcpIpChecksumOffload0(
    public var encapsulation: UInt = 0u,
    public var ipOptionsSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
    public var ipChecksum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NdisWmiTcpIpChecksumOffload0 =
                    NdisWmiTcpIpChecksumOffload0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpIpChecksumOffload0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ipOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tcpOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.udpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ipChecksum)
                }
            }
    }
}

public data class NdisWmiTcpIpChecksumOffload3(
    public var encapsulation: UInt = 0u,
    public var ipExtensionHeadersSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisWmiTcpIpChecksumOffload3 =
                    NdisWmiTcpIpChecksumOffload3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpIpChecksumOffload3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ipExtensionHeadersSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tcpOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.udpChecksum)
                }
            }
    }
}

public data class NdisWmiTcpIpChecksumOffload2(
    public var encapsulation: UInt = 0u,
    public var ipExtensionHeadersSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisWmiTcpIpChecksumOffload2 =
                    NdisWmiTcpIpChecksumOffload2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpIpChecksumOffload2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ipExtensionHeadersSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tcpOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.udpChecksum)
                }
            }
    }
}

public data class NdisWmiTcpLargeSendOffloadV1(
    public var iPv4: NdisWmiTcpLargeSendOffloadV10 = NdisWmiTcpLargeSendOffloadV10(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisWmiTcpLargeSendOffloadV1 =
                    NdisWmiTcpLargeSendOffloadV1(
                        (NdisWmiTcpLargeSendOffloadV10.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpLargeSendOffloadV1) {
                    (NdisWmiTcpLargeSendOffloadV10.typeLayout()).writeNative(addr, value.iPv4)
                }
            }
    }
}

public data class NdisWmiTcpLargeSendOffloadV10(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var tcpOptions: UInt = 0u,
    public var ipOptions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisWmiTcpLargeSendOffloadV10 =
                    NdisWmiTcpLargeSendOffloadV10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpLargeSendOffloadV10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ipOptions)
                }
            }
    }
}

public data class NdisWmiTcpLargeSendOffloadV2(
    public var iPv4: NdisWmiTcpLargeSendOffloadV20 = NdisWmiTcpLargeSendOffloadV20(),
    public var iPv6: NdisWmiTcpLargeSendOffloadV21 = NdisWmiTcpLargeSendOffloadV21(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NdisWmiTcpLargeSendOffloadV2 =
                    NdisWmiTcpLargeSendOffloadV2(
                        (NdisWmiTcpLargeSendOffloadV20.typeLayout()).readNative(addr),
                        (NdisWmiTcpLargeSendOffloadV21.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpLargeSendOffloadV2) {
                    (NdisWmiTcpLargeSendOffloadV20.typeLayout()).writeNative(addr, value.iPv4)
                    (NdisWmiTcpLargeSendOffloadV21.typeLayout()).writeNative(addr + 12L, value.iPv6)
                }
            }
    }
}

public data class NdisWmiTcpLargeSendOffloadV20(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV20> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NdisWmiTcpLargeSendOffloadV20 =
                    NdisWmiTcpLargeSendOffloadV20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpLargeSendOffloadV20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                }
            }
    }
}

public data class NdisWmiTcpLargeSendOffloadV21(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var ipExtensionHeadersSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV21> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV21> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NdisWmiTcpLargeSendOffloadV21 =
                    NdisWmiTcpLargeSendOffloadV21(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpLargeSendOffloadV21) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ipExtensionHeadersSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.tcpOptionsSupported)
                }
            }
    }
}

public class NdkAdapterInfo(
    public var version: NdkVersion = NdkVersion(),
    public var vendorId: UInt = 0u,
    public var deviceId: UInt = 0u,
    public var maxRegistrationSize: Int = 0,
    public var maxWindowSize: Int = 0,
    public var fRMRPageCount: UInt = 0u,
    public var maxInitiatorRequestSge: UInt = 0u,
    public var maxReceiveRequestSge: UInt = 0u,
    public var maxReadRequestSge: UInt = 0u,
    public var maxTransferLength: UInt = 0u,
    public var maxInlineDataSize: UInt = 0u,
    public var maxInboundReadLimit: UInt = 0u,
    public var maxOutboundReadLimit: UInt = 0u,
    public var maxReceiveQueueDepth: UInt = 0u,
    public var maxInitiatorQueueDepth: UInt = 0u,
    public var maxSrqDepth: UInt = 0u,
    public var maxCqDepth: UInt = 0u,
    public var largeRequestThreshold: UInt = 0u,
    public var maxCallerData: UInt = 0u,
    public var maxCalleeData: UInt = 0u,
    public var adapterFlags: UInt = 0u,
    public var rdmaTechnology: NdkRdmaTechnology = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdkAdapterInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdkAdapterInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): NdkAdapterInfo =
                    NdkAdapterInfo(
                        (NdkVersion.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: NdkAdapterInfo) {
                    (NdkVersion.typeLayout()).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vendorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.deviceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.maxRegistrationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.maxWindowSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.fRMRPageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maxInitiatorRequestSge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.maxReceiveRequestSge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.maxReadRequestSge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.maxTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.maxInlineDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.maxInboundReadLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.maxOutboundReadLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.maxReceiveQueueDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.maxInitiatorQueueDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.maxSrqDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.maxCqDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.largeRequestThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.maxCallerData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.maxCalleeData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.adapterFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.rdmaTechnology)
                }
            }
    }
}

public data class NdkVersion(
    public var major: UShort = 0u,
    public var minor: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdkVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdkVersion> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NdkVersion =
                    NdkVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: NdkVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.major)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minor)
                }
            }
    }
}

public data class NetworkAddress(
    public var addressLength: UShort = 0u,
    public var addressType: UShort = 0u,
    public var address: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddress) return false
        if (this.addressLength != other.addressLength) return false
        if (this.addressType != other.addressType) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressLength.hashCode()
        result = 31 * result + this.addressType.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddress> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): NetworkAddress =
                    NetworkAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NetworkAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.addressLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.addressType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.address.toList())
                }
            }
    }
}

public data class NetworkAddressIp(
    public var sinPort: UShort = 0u,
    public var inAddr: UInt = 0u,
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddressIp) return false
        if (this.sinPort != other.sinPort) return false
        if (this.inAddr != other.inAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinPort.hashCode()
        result = 31 * result + this.inAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NetworkAddressIp =
                    NetworkAddressIp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NetworkAddressIp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.sinZero.toList())
                }
            }
    }
}

public data class NetworkAddressIp6(
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: UShortArray = UShortArray(8),
    public var sin6ScopeId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddressIp6) return false
        if (this.sin6Port != other.sin6Port) return false
        if (this.sin6Flowinfo != other.sin6Flowinfo) return false
        if (!this.sin6Addr.contentEquals(other.sin6Addr)) return false
        if (this.sin6ScopeId != other.sin6ScopeId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin6Port.hashCode()
        result = 31 * result + this.sin6Flowinfo.hashCode()
        result = 31 * result + this.sin6Addr.contentHashCode()
        result = 31 * result + this.sin6ScopeId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIp6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIp6> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): NetworkAddressIp6 =
                    NetworkAddressIp6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NetworkAddressIp6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sin6Port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sin6Flowinfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                    ).writeNative(addr + 8L, value.sin6Addr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sin6ScopeId)
                }
            }
    }
}

public data class NetworkAddressIpx(
    public var networkAddress: UInt = 0u,
    public var nodeAddress: UByteArray = UByteArray(6),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddressIpx) return false
        if (this.networkAddress != other.networkAddress) return false
        if (!this.nodeAddress.contentEquals(other.nodeAddress)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.networkAddress.hashCode()
        result = 31 * result + this.nodeAddress.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIpx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIpx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NetworkAddressIpx =
                    NetworkAddressIpx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: NetworkAddressIpx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.networkAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.nodeAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.socket)
                }
            }
    }
}

public data class NetworkAddressList(
    public var addressCount: Int = 0,
    public var addressType: UShort = 0u,
    public var address: List<NetworkAddress> = List(1) { NetworkAddress() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NetworkAddressList =
                    NetworkAddressList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NetworkAddress.typeLayout(), (1).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NetworkAddressList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.addressCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.addressType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NetworkAddress.typeLayout(), (1).toInt())
                    ).writeNative(addr + 6L, value.address)
                }
            }
    }
}

public data class NetIfAliasLh(
    public var ifAliasLength: UShort = 0u,
    public var ifAliasOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetIfAliasLh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetIfAliasLh> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NetIfAliasLh =
                    NetIfAliasLh(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: NetIfAliasLh) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ifAliasLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ifAliasOffset)
                }
            }
    }
}

public data class NetIfRcvAddressLh(
    public var ifRcvAddressType: NetIfRcvAddressType = 0,
    public var ifRcvAddressLength: UShort = 0u,
    public var ifRcvAddressOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetIfRcvAddressLh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetIfRcvAddressLh> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NetIfRcvAddressLh =
                    NetIfRcvAddressLh(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NetIfRcvAddressLh) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ifRcvAddressType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.ifRcvAddressLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.ifRcvAddressOffset)
                }
            }
    }
}

public data class NetLuidLh(
    public var value: ULong = 0uL,
    public var info: NetLuidLh0 = NetLuidLh0(),
)

public data class NetLuidLh0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetLuidLh0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetLuidLh0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NetLuidLh0 =
                    NetLuidLh0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NetLuidLh0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NetPhysicalLocationLh(
    public var busNumber: UInt = 0u,
    public var slotNumber: UInt = 0u,
    public var functionNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetPhysicalLocationLh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetPhysicalLocationLh> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NetPhysicalLocationLh =
                    NetPhysicalLocationLh(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NetPhysicalLocationLh) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.busNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.slotNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.functionNumber)
                }
            }
    }
}

public data class OffloadAlgoInfo(
    public var algoIdentifier: UInt = 0u,
    public var algoKeylen: UInt = 0u,
    public var algoRounds: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadAlgoInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadAlgoInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): OffloadAlgoInfo =
                    OffloadAlgoInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: OffloadAlgoInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.algoIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.algoKeylen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.algoRounds)
                }
            }
    }
}

public class OffloadIpsecAddSa internal constructor(
    public var srcAddr: UInt,
    public var srcMask: UInt,
    public var destAddr: UInt,
    public var destMask: UInt,
    public var protocol: UInt,
    public var srcPort: UShort,
    public var destPort: UShort,
    public var srcTunnelAddr: UInt,
    public var destTunnelAddr: UInt,
    public var flags: UShort,
    public var numSAs: Short,
    public var secAssoc: List<OffloadSecurityAssociation>,
    offloadHandleCtorArg: Handle,
    public var keyLen: UInt,
    public var keyMat: UByteArray,
) {
    public var offloadHandle: Handle = offloadHandleCtorArg
        internal set

    public constructor() : this(
        srcAddr = 0u,
        srcMask = 0u,
        destAddr = 0u,
        destMask = 0u,
        protocol = 0u,
        srcPort = 0u,
        destPort = 0u,
        srcTunnelAddr = 0u,
        destTunnelAddr = 0u,
        flags = 0u,
        numSAs = 0,
        secAssoc = List(3) { OffloadSecurityAssociation() },
        offloadHandleCtorArg = MutPtr(0L),
        keyLen = 0u,
        keyMat = UByteArray(1),
    )

    public operator fun component1(): UInt = this.srcAddr

    public operator fun component2(): UInt = this.srcMask

    public operator fun component3(): UInt = this.destAddr

    public operator fun component4(): UInt = this.destMask

    public operator fun component5(): UInt = this.protocol

    public operator fun component6(): UShort = this.srcPort

    public operator fun component7(): UShort = this.destPort

    public operator fun component8(): UInt = this.srcTunnelAddr

    public operator fun component9(): UInt = this.destTunnelAddr

    public operator fun component10(): UShort = this.flags

    public operator fun component11(): Short = this.numSAs

    public operator fun component12(): List<OffloadSecurityAssociation> = this.secAssoc

    public operator fun component13(): Handle = this.offloadHandle

    public operator fun component14(): UInt = this.keyLen

    public operator fun component15(): UByteArray = this.keyMat

    public fun copy(srcAddr: UInt = this.srcAddr, srcMask: UInt = this.srcMask, destAddr: UInt = this.destAddr, destMask: UInt = this.destMask, protocol: UInt = this.protocol, srcPort: UShort = this.srcPort, destPort: UShort = this.destPort, srcTunnelAddr: UInt = this.srcTunnelAddr, destTunnelAddr: UInt = this.destTunnelAddr, flags: UShort = this.flags, numSAs: Short = this.numSAs, secAssoc: List<OffloadSecurityAssociation> = this.secAssoc, offloadHandle: Handle = this.offloadHandle, keyLen: UInt = this.keyLen, keyMat: UByteArray = this.keyMat): OffloadIpsecAddSa = OffloadIpsecAddSa(srcAddr = srcAddr, srcMask = srcMask, destAddr = destAddr, destMask = destMask, protocol = protocol, srcPort = srcPort, destPort = destPort, srcTunnelAddr = srcTunnelAddr, destTunnelAddr = destTunnelAddr, flags = flags, numSAs = numSAs, secAssoc = secAssoc, offloadHandleCtorArg = offloadHandle, keyLen = keyLen, keyMat = keyMat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OffloadIpsecAddSa) return false
        if (this.srcAddr != other.srcAddr) return false
        if (this.srcMask != other.srcMask) return false
        if (this.destAddr != other.destAddr) return false
        if (this.destMask != other.destMask) return false
        if (this.protocol != other.protocol) return false
        if (this.srcPort != other.srcPort) return false
        if (this.destPort != other.destPort) return false
        if (this.srcTunnelAddr != other.srcTunnelAddr) return false
        if (this.destTunnelAddr != other.destTunnelAddr) return false
        if (this.flags != other.flags) return false
        if (this.numSAs != other.numSAs) return false
        if (this.secAssoc != other.secAssoc) return false
        if (this.offloadHandle != other.offloadHandle) return false
        if (this.keyLen != other.keyLen) return false
        if (!this.keyMat.contentEquals(other.keyMat)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.srcAddr.hashCode()
        result = 31 * result + this.srcMask.hashCode()
        result = 31 * result + this.destAddr.hashCode()
        result = 31 * result + this.destMask.hashCode()
        result = 31 * result + this.protocol.hashCode()
        result = 31 * result + this.srcPort.hashCode()
        result = 31 * result + this.destPort.hashCode()
        result = 31 * result + this.srcTunnelAddr.hashCode()
        result = 31 * result + this.destTunnelAddr.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.numSAs.hashCode()
        result = 31 * result + this.secAssoc.hashCode()
        result = 31 * result + this.offloadHandle.hashCode()
        result = 31 * result + this.keyLen.hashCode()
        result = 31 * result + this.keyMat.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            srcAddr: UInt = 0u,
            srcMask: UInt = 0u,
            destAddr: UInt = 0u,
            destMask: UInt = 0u,
            protocol: UInt = 0u,
            srcPort: UShort = 0u,
            destPort: UShort = 0u,
            srcTunnelAddr: UInt = 0u,
            destTunnelAddr: UInt = 0u,
            flags: UShort = 0u,
            numSAs: Short = 0,
            secAssoc: List<OffloadSecurityAssociation> = List(3) { OffloadSecurityAssociation() },
            offloadHandle: Handle = MutPtr(0L),
            keyLen: UInt = 0u,
            keyMat: UByteArray = UByteArray(1),
        ): OffloadIpsecAddSa =
            OffloadIpsecAddSa(
                srcAddr = srcAddr,
                srcMask = srcMask,
                destAddr = destAddr,
                destMask = destMask,
                protocol = protocol,
                srcPort = srcPort,
                destPort = destPort,
                srcTunnelAddr = srcTunnelAddr,
                destTunnelAddr = destTunnelAddr,
                flags = flags,
                numSAs = numSAs,
                secAssoc = secAssoc,
                offloadHandleCtorArg = offloadHandle,
                keyLen = keyLen,
                keyMat = keyMat,
            )
    }
}

public class OffloadIpsecAddUdpespSa internal constructor(
    public var srcAddr: UInt,
    public var srcMask: UInt,
    public var dstAddr: UInt,
    public var dstMask: UInt,
    public var protocol: UInt,
    public var srcPort: UShort,
    public var dstPort: UShort,
    public var srcTunnelAddr: UInt,
    public var dstTunnelAddr: UInt,
    public var flags: UShort,
    public var numSAs: Short,
    public var secAssoc: List<OffloadSecurityAssociation>,
    offloadHandleCtorArg: Handle,
    public var encapTypeEntry: OffloadIpsecUdpespEncaptypeEntry,
    encapTypeEntryOffldHandleCtorArg: Handle,
    public var keyLen: UInt,
    public var keyMat: UByteArray,
) {
    public var offloadHandle: Handle = offloadHandleCtorArg
        internal set

    public var encapTypeEntryOffldHandle: Handle = encapTypeEntryOffldHandleCtorArg
        internal set

    public constructor() : this(
        srcAddr = 0u,
        srcMask = 0u,
        dstAddr = 0u,
        dstMask = 0u,
        protocol = 0u,
        srcPort = 0u,
        dstPort = 0u,
        srcTunnelAddr = 0u,
        dstTunnelAddr = 0u,
        flags = 0u,
        numSAs = 0,
        secAssoc = List(3) { OffloadSecurityAssociation() },
        offloadHandleCtorArg = MutPtr(0L),
        encapTypeEntry = OffloadIpsecUdpespEncaptypeEntry(),
        encapTypeEntryOffldHandleCtorArg = MutPtr(0L),
        keyLen = 0u,
        keyMat = UByteArray(1),
    )

    public companion object {
        public operator fun invoke(
            srcAddr: UInt = 0u,
            srcMask: UInt = 0u,
            dstAddr: UInt = 0u,
            dstMask: UInt = 0u,
            protocol: UInt = 0u,
            srcPort: UShort = 0u,
            dstPort: UShort = 0u,
            srcTunnelAddr: UInt = 0u,
            dstTunnelAddr: UInt = 0u,
            flags: UShort = 0u,
            numSAs: Short = 0,
            secAssoc: List<OffloadSecurityAssociation> = List(3) { OffloadSecurityAssociation() },
            offloadHandle: Handle = MutPtr(0L),
            encapTypeEntry: OffloadIpsecUdpespEncaptypeEntry = OffloadIpsecUdpespEncaptypeEntry(),
            encapTypeEntryOffldHandle: Handle = MutPtr(0L),
            keyLen: UInt = 0u,
            keyMat: UByteArray = UByteArray(1),
        ): OffloadIpsecAddUdpespSa =
            OffloadIpsecAddUdpespSa(
                srcAddr = srcAddr,
                srcMask = srcMask,
                dstAddr = dstAddr,
                dstMask = dstMask,
                protocol = protocol,
                srcPort = srcPort,
                dstPort = dstPort,
                srcTunnelAddr = srcTunnelAddr,
                dstTunnelAddr = dstTunnelAddr,
                flags = flags,
                numSAs = numSAs,
                secAssoc = secAssoc,
                offloadHandleCtorArg = offloadHandle,
                encapTypeEntry = encapTypeEntry,
                encapTypeEntryOffldHandleCtorArg = encapTypeEntryOffldHandle,
                keyLen = keyLen,
                keyMat = keyMat,
            )
    }
}

public class OffloadIpsecDeleteSa internal constructor(
    offloadHandleCtorArg: Handle,
) {
    public var offloadHandle: Handle = offloadHandleCtorArg
        internal set

    public constructor() : this(
        offloadHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.offloadHandle

    public fun copy(offloadHandle: Handle = this.offloadHandle): OffloadIpsecDeleteSa = OffloadIpsecDeleteSa(offloadHandleCtorArg = offloadHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OffloadIpsecDeleteSa) return false
        if (this.offloadHandle != other.offloadHandle) return false
        return true
    }

    override fun hashCode(): Int = this.offloadHandle.hashCode()

    public companion object {
        public operator fun invoke(
            offloadHandle: Handle = MutPtr(0L),
        ): OffloadIpsecDeleteSa =
            OffloadIpsecDeleteSa(
                offloadHandleCtorArg = offloadHandle,
            )
    }
}

public class OffloadIpsecDeleteUdpespSa internal constructor(
    offloadHandleCtorArg: Handle,
    encapTypeEntryOffldHandleCtorArg: Handle,
) {
    public var offloadHandle: Handle = offloadHandleCtorArg
        internal set

    public var encapTypeEntryOffldHandle: Handle = encapTypeEntryOffldHandleCtorArg
        internal set

    public constructor() : this(
        offloadHandleCtorArg = MutPtr(0L),
        encapTypeEntryOffldHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.offloadHandle

    public operator fun component2(): Handle = this.encapTypeEntryOffldHandle

    public fun copy(offloadHandle: Handle = this.offloadHandle, encapTypeEntryOffldHandle: Handle = this.encapTypeEntryOffldHandle): OffloadIpsecDeleteUdpespSa = OffloadIpsecDeleteUdpespSa(offloadHandleCtorArg = offloadHandle, encapTypeEntryOffldHandleCtorArg = encapTypeEntryOffldHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OffloadIpsecDeleteUdpespSa) return false
        if (this.offloadHandle != other.offloadHandle) return false
        if (this.encapTypeEntryOffldHandle != other.encapTypeEntryOffldHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offloadHandle.hashCode()
        result = 31 * result + this.encapTypeEntryOffldHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            offloadHandle: Handle = MutPtr(0L),
            encapTypeEntryOffldHandle: Handle = MutPtr(0L),
        ): OffloadIpsecDeleteUdpespSa =
            OffloadIpsecDeleteUdpespSa(
                offloadHandleCtorArg = offloadHandle,
                encapTypeEntryOffldHandleCtorArg = encapTypeEntryOffldHandle,
            )
    }
}

public data class OffloadIpsecUdpespEncaptypeEntry(
    public var udpEncapType: UdpEncapType = 0,
    public var dstEncapPort: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadIpsecUdpespEncaptypeEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadIpsecUdpespEncaptypeEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): OffloadIpsecUdpespEncaptypeEntry =
                    OffloadIpsecUdpespEncaptypeEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: OffloadIpsecUdpespEncaptypeEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.udpEncapType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.dstEncapPort)
                }
            }
    }
}

public data class OffloadSecurityAssociation(
    public var operation: OffloadOperationE = 0,
    public var spi: UInt = 0u,
    public var integrityAlgo: OffloadAlgoInfo = OffloadAlgoInfo(),
    public var confAlgo: OffloadAlgoInfo = OffloadAlgoInfo(),
    public var reserved: OffloadAlgoInfo = OffloadAlgoInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadSecurityAssociation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadSecurityAssociation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): OffloadSecurityAssociation =
                    OffloadSecurityAssociation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (OffloadAlgoInfo.typeLayout()).readNative(addr + 8L),
                        (OffloadAlgoInfo.typeLayout()).readNative(addr + 20L),
                        (OffloadAlgoInfo.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: OffloadSecurityAssociation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.operation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.spi)
                    (OffloadAlgoInfo.typeLayout()).writeNative(addr + 8L, value.integrityAlgo)
                    (OffloadAlgoInfo.typeLayout()).writeNative(addr + 20L, value.confAlgo)
                    (OffloadAlgoInfo.typeLayout()).writeNative(addr + 32L, value.reserved)
                }
            }
    }
}

public data class PmkidCandidate(
    public var bssid: UByteArray = UByteArray(6),
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmkidCandidate) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bssid.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PmkidCandidate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PmkidCandidate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PmkidCandidate =
                    PmkidCandidate(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PmkidCandidate) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.bssid.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class TransportHeaderOffset(
    public var protocolType: UShort = 0u,
    public var headerOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransportHeaderOffset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransportHeaderOffset> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TransportHeaderOffset =
                    TransportHeaderOffset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: TransportHeaderOffset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.protocolType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.headerOffset)
                }
            }
    }
}
