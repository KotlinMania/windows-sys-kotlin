@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.nfc

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.core.Guid

public data class NfcrmRadioState(
    public var mediaRadioOn: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcrmRadioState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcrmRadioState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): NfcrmRadioState =
                    NfcrmRadioState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NfcrmRadioState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.mediaRadioOn)
                }
            }
    }
}

public data class NfcrmSetRadioState(
    public var systemStateUpdate: Boolean = false,
    public var mediaRadioOn: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcrmSetRadioState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcrmSetRadioState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): NfcrmSetRadioState =
                    NfcrmSetRadioState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: NfcrmSetRadioState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.systemStateUpdate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.mediaRadioOn)
                }
            }
    }
}

public data class NfcDataBuffer(
    public var cbBuffer: UShort = 0u,
    public var pbBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcDataBuffer) return false
        if (this.cbBuffer != other.cbBuffer) return false
        if (!this.pbBuffer.contentEquals(other.pbBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbBuffer.hashCode()
        result = 31 * result + this.pbBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcDataBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcDataBuffer> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NfcDataBuffer =
                    NfcDataBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NfcDataBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.pbBuffer.toList())
                }
            }
    }
}

public data class NfcLlcpConfig(
    public var uMIU: UShort = 0u,
    public var uWKS: UShort = 0u,
    public var bLTO: UByte = 0u,
    public var bOptions: UByte = 0u,
    public var fAutoActivate: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpConfig> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NfcLlcpConfig =
                    NfcLlcpConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.uMIU)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.uWKS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bLTO)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.fAutoActivate)
                }
            }
    }
}

public data class NfcLlcpServiceDiscoverRequest(
    public var hRemoteDev: Int = 0,
    public var numberOfEntries: UInt = 0u,
    public var serviceNameEntries: List<NfcLlcpServiceNameEntry> = List(1) { NfcLlcpServiceNameEntry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpServiceDiscoverRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpServiceDiscoverRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NfcLlcpServiceDiscoverRequest =
                    NfcLlcpServiceDiscoverRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NfcLlcpServiceNameEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpServiceDiscoverRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hRemoteDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NfcLlcpServiceNameEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 12L, value.serviceNameEntries)
                }
            }
    }
}

public data class NfcLlcpServiceDiscoverSap(
    public var numberOfEntries: UInt = 0u,
    public var sAPEntries: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcLlcpServiceDiscoverSap) return false
        if (this.numberOfEntries != other.numberOfEntries) return false
        if (!this.sAPEntries.contentEquals(other.sAPEntries)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfEntries.hashCode()
        result = 31 * result + this.sAPEntries.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpServiceDiscoverSap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpServiceDiscoverSap> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NfcLlcpServiceDiscoverSap =
                    NfcLlcpServiceDiscoverSap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpServiceDiscoverSap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.sAPEntries.toList())
                }
            }
    }
}

public data class NfcLlcpServiceNameEntry(
    public var cbServiceName: UInt = 0u,
    public var pbServiceName: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcLlcpServiceNameEntry) return false
        if (this.cbServiceName != other.cbServiceName) return false
        if (!this.pbServiceName.contentEquals(other.pbServiceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbServiceName.hashCode()
        result = 31 * result + this.pbServiceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpServiceNameEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpServiceNameEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NfcLlcpServiceNameEntry =
                    NfcLlcpServiceNameEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpServiceNameEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbServiceName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.pbServiceName.toList())
                }
            }
    }
}

public data class NfcLlcpSocketAcceptInfo(
    public var hSocket: Int = 0,
    public var sSocketOption: NfcLlcpSocketOption = NfcLlcpSocketOption(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketAcceptInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketAcceptInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcLlcpSocketAcceptInfo =
                    NfcLlcpSocketAcceptInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (NfcLlcpSocketOption.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpSocketAcceptInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSocket)
                    (NfcLlcpSocketOption.typeLayout()).writeNative(addr + 8L, value.sSocketOption)
                }
            }
    }
}

public data class NfcLlcpSocketClPayload(
    public var hSocket: Int = 0,
    public var bSAP: UByte = 0u,
    public var sPayload: NfcDataBuffer = NfcDataBuffer(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketClPayload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketClPayload> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcLlcpSocketClPayload =
                    NfcLlcpSocketClPayload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (NfcDataBuffer.typeLayout()).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpSocketClPayload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSocket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bSAP)
                    (NfcDataBuffer.typeLayout()).writeNative(addr + 10L, value.sPayload)
                }
            }
    }
}

public data class NfcLlcpSocketConnectInfo(
    public var hRemoteDev: Int = 0,
    public var hSocket: Int = 0,
    public var eConnectType: NfcLlcpSocketConnectType = 0,
    public var anonymous: NfcLlcpSocketConnectInfo0 = NfcLlcpSocketConnectInfo0(),
)

public data class NfcLlcpSocketConnectInfo0(
    public var bSAP: UByte = 0u,
    public var sServiceName: NfcLlcpServiceNameEntry = NfcLlcpServiceNameEntry(),
)

public data class NfcLlcpSocketErrorInfo(
    public var hSocket: Int = 0,
    public var eSocketError: NfcLlcpSocketError = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketErrorInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketErrorInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcLlcpSocketErrorInfo =
                    NfcLlcpSocketErrorInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpSocketErrorInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSocket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.eSocketError)
                }
            }
    }
}

public data class NfcLlcpSocketInfo(
    public var eSocketType: NfcLlcpSocketType = 0,
    public var sSocketOption: NfcLlcpSocketOption = NfcLlcpSocketOption(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NfcLlcpSocketInfo =
                    NfcLlcpSocketInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (NfcLlcpSocketOption.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpSocketInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.eSocketType)
                    (NfcLlcpSocketOption.typeLayout()).writeNative(addr + 4L, value.sSocketOption)
                }
            }
    }
}

public data class NfcLlcpSocketOption(
    public var uMIUX: UShort = 0u,
    public var bRW: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketOption> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketOption> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NfcLlcpSocketOption =
                    NfcLlcpSocketOption(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpSocketOption) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.uMIUX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bRW)
                }
            }
    }
}

public data class NfcLlcpSocketPayload(
    public var hSocket: Int = 0,
    public var bSAP: UByte = 0u,
    public var sPayload: NfcDataBuffer = NfcDataBuffer(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketPayload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketPayload> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcLlcpSocketPayload =
                    NfcLlcpSocketPayload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (NfcDataBuffer.typeLayout()).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpSocketPayload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSocket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bSAP)
                    (NfcDataBuffer.typeLayout()).writeNative(addr + 10L, value.sPayload)
                }
            }
    }
}

public data class NfcLlcpSocketServiceInfo(
    public var hSocket: Int = 0,
    public var bSAP: UByte = 0u,
    public var sServiceName: NfcLlcpServiceNameEntry = NfcLlcpServiceNameEntry(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketServiceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcLlcpSocketServiceInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NfcLlcpSocketServiceInfo =
                    NfcLlcpSocketServiceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (NfcLlcpServiceNameEntry.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NfcLlcpSocketServiceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSocket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bSAP)
                    (NfcLlcpServiceNameEntry.typeLayout()).writeNative(addr + 12L, value.sServiceName)
                }
            }
    }
}

public data class NfcNdefInfo(
    public var fIsNdefFormatted: Boolean = false,
    public var fIsReadOnly: Boolean = false,
    public var dwActualMessageLength: UInt = 0u,
    public var dwMaxMessageLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcNdefInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcNdefInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NfcNdefInfo =
                    NfcNdefInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfcNdefInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.fIsNdefFormatted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.fIsReadOnly)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwActualMessageLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMaxMessageLength)
                }
            }
    }
}

public data class NfcP2pParamConfig(
    public var eP2pMode: NfcP2pMode = 0,
    public var cbGeneralBytes: UByte = 0u,
    public var pbGeneralBytes: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcP2pParamConfig) return false
        if (this.eP2pMode != other.eP2pMode) return false
        if (this.cbGeneralBytes != other.cbGeneralBytes) return false
        if (!this.pbGeneralBytes.contentEquals(other.pbGeneralBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eP2pMode.hashCode()
        result = 31 * result + this.cbGeneralBytes.hashCode()
        result = 31 * result + this.pbGeneralBytes.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcP2pParamConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcP2pParamConfig> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): NfcP2pParamConfig =
                    NfcP2pParamConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                        ).readNative(addr + 5L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NfcP2pParamConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.eP2pMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.cbGeneralBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                    ).writeNative(addr + 5L, value.pbGeneralBytes.toList())
                }
            }
    }
}

public data class NfcRemoteDeviceDisconnet(
    public var hRemoteDev: Int = 0,
    public var eReleaseType: NfcReleaseType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcRemoteDeviceDisconnet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcRemoteDeviceDisconnet> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcRemoteDeviceDisconnet =
                    NfcRemoteDeviceDisconnet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfcRemoteDeviceDisconnet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hRemoteDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.eReleaseType)
                }
            }
    }
}

public data class NfcRemoteDevInfo(
    public var hRemoteDev: Int = 0,
    public var eType: NfcDeviceType = 0,
    public var eRFTech: UByte = 0u,
    public var eProtocol: UByte = 0u,
    public var cbUid: UByte = 0u,
    public var pbUid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcRemoteDevInfo) return false
        if (this.hRemoteDev != other.hRemoteDev) return false
        if (this.eType != other.eType) return false
        if (this.eRFTech != other.eRFTech) return false
        if (this.eProtocol != other.eProtocol) return false
        if (this.cbUid != other.cbUid) return false
        if (!this.pbUid.contentEquals(other.pbUid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hRemoteDev.hashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eRFTech.hashCode()
        result = 31 * result + this.eProtocol.hashCode()
        result = 31 * result + this.cbUid.hashCode()
        result = 31 * result + this.pbUid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcRemoteDevInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcRemoteDevInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NfcRemoteDevInfo =
                    NfcRemoteDevInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 15L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NfcRemoteDevInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hRemoteDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.eType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.eRFTech)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.eProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.cbUid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 15L, value.pbUid.toList())
                }
            }
    }
}

public data class NfcRemoteDevRecvInfo(
    public var hRemoteDev: Int = 0,
    public var sRecvBuffer: NfcDataBuffer = NfcDataBuffer(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcRemoteDevRecvInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcRemoteDevRecvInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcRemoteDevRecvInfo =
                    NfcRemoteDevRecvInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (NfcDataBuffer.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfcRemoteDevRecvInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hRemoteDev)
                    (NfcDataBuffer.typeLayout()).writeNative(addr + 8L, value.sRecvBuffer)
                }
            }
    }
}

public data class NfcRemoteDevSendInfo(
    public var hRemoteDev: Int = 0,
    public var usTimeOut: UShort = 0u,
    public var sSendBuffer: NfcDataBuffer = NfcDataBuffer(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcRemoteDevSendInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcRemoteDevSendInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcRemoteDevSendInfo =
                    NfcRemoteDevSendInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (NfcDataBuffer.typeLayout()).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: NfcRemoteDevSendInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hRemoteDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.usTimeOut)
                    (NfcDataBuffer.typeLayout()).writeNative(addr + 10L, value.sSendBuffer)
                }
            }
    }
}

public data class NfcRfDiscoveryConfig(
    public var usTotalDuration: UShort = 0u,
    public var ulPollConfig: UInt = 0u,
    public var fDisableCardEmulation: Boolean = false,
    public var ucNfcIPMode: UByte = 0u,
    public var fNfcIPTgtModeDisable: Boolean = false,
    public var ucNfcIPTgtMode: UByte = 0u,
    public var ucNfcCEMode: UByte = 0u,
    public var ucBailoutConfig: UByte = 0u,
    public var ucSystemCode: UByteArray = UByteArray(2),
    public var ucRequestCode: UByte = 0u,
    public var ucTimeSlotNumber: UByte = 0u,
    public var eRfDiscoveryMode: NfcRfDiscoveryMode = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcRfDiscoveryConfig) return false
        if (this.usTotalDuration != other.usTotalDuration) return false
        if (this.ulPollConfig != other.ulPollConfig) return false
        if (this.fDisableCardEmulation != other.fDisableCardEmulation) return false
        if (this.ucNfcIPMode != other.ucNfcIPMode) return false
        if (this.fNfcIPTgtModeDisable != other.fNfcIPTgtModeDisable) return false
        if (this.ucNfcIPTgtMode != other.ucNfcIPTgtMode) return false
        if (this.ucNfcCEMode != other.ucNfcCEMode) return false
        if (this.ucBailoutConfig != other.ucBailoutConfig) return false
        if (!this.ucSystemCode.contentEquals(other.ucSystemCode)) return false
        if (this.ucRequestCode != other.ucRequestCode) return false
        if (this.ucTimeSlotNumber != other.ucTimeSlotNumber) return false
        if (this.eRfDiscoveryMode != other.eRfDiscoveryMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usTotalDuration.hashCode()
        result = 31 * result + this.ulPollConfig.hashCode()
        result = 31 * result + this.fDisableCardEmulation.hashCode()
        result = 31 * result + this.ucNfcIPMode.hashCode()
        result = 31 * result + this.fNfcIPTgtModeDisable.hashCode()
        result = 31 * result + this.ucNfcIPTgtMode.hashCode()
        result = 31 * result + this.ucNfcCEMode.hashCode()
        result = 31 * result + this.ucBailoutConfig.hashCode()
        result = 31 * result + this.ucSystemCode.contentHashCode()
        result = 31 * result + this.ucRequestCode.hashCode()
        result = 31 * result + this.ucTimeSlotNumber.hashCode()
        result = 31 * result + this.eRfDiscoveryMode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcRfDiscoveryConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcRfDiscoveryConfig> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NfcRfDiscoveryConfig =
                    NfcRfDiscoveryConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 14L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NfcRfDiscoveryConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usTotalDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulPollConfig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.fDisableCardEmulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.ucNfcIPMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.fNfcIPTgtModeDisable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.ucNfcIPTgtMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.ucNfcCEMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.ucBailoutConfig)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 14L, value.ucSystemCode.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.ucRequestCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.ucTimeSlotNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.eRfDiscoveryMode)
                }
            }
    }
}

public data class NfcSeAidRoutingInfo(
    public var hSecureElement: Int = 0,
    public var bPowerState: UByte = 0u,
    public var cbAid: UInt = 0u,
    public var pbAid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcSeAidRoutingInfo) return false
        if (this.hSecureElement != other.hSecureElement) return false
        if (this.bPowerState != other.bPowerState) return false
        if (this.cbAid != other.cbAid) return false
        if (!this.pbAid.contentEquals(other.pbAid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSecureElement.hashCode()
        result = 31 * result + this.bPowerState.hashCode()
        result = 31 * result + this.cbAid.hashCode()
        result = 31 * result + this.pbAid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeAidRoutingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeAidRoutingInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NfcSeAidRoutingInfo =
                    NfcSeAidRoutingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NfcSeAidRoutingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSecureElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bPowerState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbAid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.pbAid.toList())
                }
            }
    }
}

public data class NfcSeEmulationModeInfo(
    public var hSecureElement: Int = 0,
    public var eMode: NfcSeEmulationMode = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeEmulationModeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeEmulationModeInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcSeEmulationModeInfo =
                    NfcSeEmulationModeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfcSeEmulationModeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSecureElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.eMode)
                }
            }
    }
}

public data class NfcSeEventInfo(
    public var hSecureElement: Int = 0,
    public var eEventType: SecureElementEventType = 0,
    public var cbEventData: UInt = 0u,
    public var pbEventData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcSeEventInfo) return false
        if (this.hSecureElement != other.hSecureElement) return false
        if (this.eEventType != other.eEventType) return false
        if (this.cbEventData != other.cbEventData) return false
        if (!this.pbEventData.contentEquals(other.pbEventData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSecureElement.hashCode()
        result = 31 * result + this.eEventType.hashCode()
        result = 31 * result + this.cbEventData.hashCode()
        result = 31 * result + this.pbEventData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeEventInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeEventInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NfcSeEventInfo =
                    NfcSeEventInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NfcSeEventInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSecureElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.eEventType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbEventData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.pbEventData.toList())
                }
            }
    }
}

public data class NfcSeInfo(
    public var hSecureElement: Int = 0,
    public var eSecureElementType: SecureElementType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcSeInfo =
                    NfcSeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfcSeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSecureElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.eSecureElementType)
                }
            }
    }
}

public data class NfcSeList(
    public var numberOfEndpoints: UInt = 0u,
    public var endpointList: List<NfcSeInfo> = List(1) { NfcSeInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NfcSeList =
                    NfcSeList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NfcSeInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfcSeList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfEndpoints)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NfcSeInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.endpointList)
                }
            }
    }
}

public data class NfcSeProtoRoutingInfo(
    public var hSecureElement: Int = 0,
    public var bPowerState: UByte = 0u,
    public var eRfProtocolType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeProtoRoutingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeProtoRoutingInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcSeProtoRoutingInfo =
                    NfcSeProtoRoutingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: NfcSeProtoRoutingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSecureElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bPowerState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.eRfProtocolType)
                }
            }
    }
}

public data class NfcSeRoutingTable(
    public var numberOfEntries: UInt = 0u,
    public var tableEntries: List<NfcSeRoutingTableEntry> = List(1) { NfcSeRoutingTableEntry() },
)

public data class NfcSeRoutingTableEntry(
    public var eRoutingType: SecureElementRoutingType = 0,
    public var anonymous: NfcSeRoutingTableEntry0 = NfcSeRoutingTableEntry0(),
)

public data class NfcSeRoutingTableEntry0(
    public var techRoutingInfo: NfcSeTechRoutingInfo = NfcSeTechRoutingInfo(),
    public var protoRoutingInfo: NfcSeProtoRoutingInfo = NfcSeProtoRoutingInfo(),
    public var aidRoutingInfo: NfcSeAidRoutingInfo = NfcSeAidRoutingInfo(),
)

public data class NfcSeTechRoutingInfo(
    public var hSecureElement: Int = 0,
    public var bPowerState: UByte = 0u,
    public var eRfTechType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeTechRoutingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSeTechRoutingInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcSeTechRoutingInfo =
                    NfcSeTechRoutingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: NfcSeTechRoutingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSecureElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bPowerState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.eRfTechType)
                }
            }
    }
}

public data class NfcSnepClientGetInfo(
    public var hSnepClient: Int = 0,
    public var sGetPayload: NfcDataBuffer = NfcDataBuffer(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepClientGetInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepClientGetInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcSnepClientGetInfo =
                    NfcSnepClientGetInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (NfcDataBuffer.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfcSnepClientGetInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSnepClient)
                    (NfcDataBuffer.typeLayout()).writeNative(addr + 8L, value.sGetPayload)
                }
            }
    }
}

public data class NfcSnepClientInfo(
    public var hRemoteDev: Int = 0,
    public var eServerType: NfcSnepServerType = 0,
    public var sSocketOption: NfcLlcpSocketOption = NfcLlcpSocketOption(),
    public var sService: NfcLlcpServiceNameEntry = NfcLlcpServiceNameEntry(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepClientInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepClientInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NfcSnepClientInfo =
                    NfcSnepClientInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (NfcLlcpSocketOption.typeLayout()).readNative(addr + 12L),
                        (NfcLlcpServiceNameEntry.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NfcSnepClientInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hRemoteDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.eServerType)
                    (NfcLlcpSocketOption.typeLayout()).writeNative(addr + 12L, value.sSocketOption)
                    (NfcLlcpServiceNameEntry.typeLayout()).writeNative(addr + 16L, value.sService)
                }
            }
    }
}

public data class NfcSnepClientPutInfo(
    public var hSnepClient: Int = 0,
    public var sPutPayload: NfcDataBuffer = NfcDataBuffer(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepClientPutInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepClientPutInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NfcSnepClientPutInfo =
                    NfcSnepClientPutInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (NfcDataBuffer.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfcSnepClientPutInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSnepClient)
                    (NfcDataBuffer.typeLayout()).writeNative(addr + 8L, value.sPutPayload)
                }
            }
    }
}

public data class NfcSnepServerAcceptInfo(
    public var hSnepServer: Int = 0,
    public var hConnection: Int = 0,
    public var sSocketOption: NfcLlcpSocketOption = NfcLlcpSocketOption(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepServerAcceptInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepServerAcceptInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NfcSnepServerAcceptInfo =
                    NfcSnepServerAcceptInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (NfcLlcpSocketOption.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NfcSnepServerAcceptInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSnepServer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.hConnection)
                    (NfcLlcpSocketOption.typeLayout()).writeNative(addr + 16L, value.sSocketOption)
                }
            }
    }
}

public data class NfcSnepServerInfo(
    public var eServerType: NfcSnepServerType = 0,
    public var sSocketOption: NfcLlcpSocketOption = NfcLlcpSocketOption(),
    public var usInboxSize: UShort = 0u,
    public var bSAP: UByte = 0u,
    public var sService: NfcLlcpServiceNameEntry = NfcLlcpServiceNameEntry(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepServerInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepServerInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NfcSnepServerInfo =
                    NfcSnepServerInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (NfcLlcpSocketOption.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (NfcLlcpServiceNameEntry.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NfcSnepServerInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.eServerType)
                    (NfcLlcpSocketOption.typeLayout()).writeNative(addr + 4L, value.sSocketOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.usInboxSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.bSAP)
                    (NfcLlcpServiceNameEntry.typeLayout()).writeNative(addr + 12L, value.sService)
                }
            }
    }
}

public data class NfcSnepServerRequest(
    public var hSnepServer: Int = 0,
    public var hConnection: Int = 0,
    public var eRequestType: NfcSnepRequestType = 0,
    public var sRequestPayload: NfcDataBuffer = NfcDataBuffer(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepServerRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepServerRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NfcSnepServerRequest =
                    NfcSnepServerRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (NfcDataBuffer.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NfcSnepServerRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSnepServer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.hConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.eRequestType)
                    (NfcDataBuffer.typeLayout()).writeNative(addr + 20L, value.sRequestPayload)
                }
            }
    }
}

public data class NfcSnepServerResponseInfo(
    public var hSnepServer: Int = 0,
    public var hConnection: Int = 0,
    public var dwResponseStatus: UInt = 0u,
    public var sResponsePayload: NfcDataBuffer = NfcDataBuffer(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepServerResponseInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfcSnepServerResponseInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NfcSnepServerResponseInfo =
                    NfcSnepServerResponseInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (NfcDataBuffer.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NfcSnepServerResponseInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.hSnepServer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.hConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwResponseStatus)
                    (NfcDataBuffer.typeLayout()).writeNative(addr + 20L, value.sResponsePayload)
                }
            }
    }
}

public data class SecureElementAidRoutingInfo(
    public var guidSecureElementId: Guid = Guid(),
    public var cbAid: UInt = 0u,
    public var pbAid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecureElementAidRoutingInfo) return false
        if (this.guidSecureElementId != other.guidSecureElementId) return false
        if (this.cbAid != other.cbAid) return false
        if (!this.pbAid.contentEquals(other.pbAid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidSecureElementId.hashCode()
        result = 31 * result + this.cbAid.hashCode()
        result = 31 * result + this.pbAid.contentHashCode()
        return result
    }
}

public data class SecureElementEndpointInfo(
    public var guidSecureElementId: Guid = Guid(),
    public var eSecureElementType: SecureElementType = 0,
)

public data class SecureElementEndpointList(
    public var numberOfEndpoints: UInt = 0u,
    public var endpointList: List<SecureElementEndpointInfo> = List(1) { SecureElementEndpointInfo() },
)

public data class SecureElementEventInfo(
    public var guidSecureElementId: Guid = Guid(),
    public var eEventType: SecureElementEventType = 0,
    public var cbEventData: UInt = 0u,
    public var pbEventData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecureElementEventInfo) return false
        if (this.guidSecureElementId != other.guidSecureElementId) return false
        if (this.eEventType != other.eEventType) return false
        if (this.cbEventData != other.cbEventData) return false
        if (!this.pbEventData.contentEquals(other.pbEventData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidSecureElementId.hashCode()
        result = 31 * result + this.eEventType.hashCode()
        result = 31 * result + this.cbEventData.hashCode()
        result = 31 * result + this.pbEventData.contentHashCode()
        return result
    }
}

public data class SecureElementEventSubscriptionInfo(
    public var guidSecureElementId: Guid = Guid(),
    public var eEventType: SecureElementEventType = 0,
)

public data class SecureElementHceActivationPayload(
    public var bConnectionId: UShort = 0u,
    public var eRfTechType: UByte = 0u,
    public var eRfProtocolType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecureElementHceActivationPayload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecureElementHceActivationPayload> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SecureElementHceActivationPayload =
                    SecureElementHceActivationPayload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: SecureElementHceActivationPayload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bConnectionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.eRfTechType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.eRfProtocolType)
                }
            }
    }
}

public data class SecureElementHceDataPacket(
    public var bConnectionId: UShort = 0u,
    public var cbPayload: UShort = 0u,
    public var pbPayload: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecureElementHceDataPacket) return false
        if (this.bConnectionId != other.bConnectionId) return false
        if (this.cbPayload != other.cbPayload) return false
        if (!this.pbPayload.contentEquals(other.pbPayload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bConnectionId.hashCode()
        result = 31 * result + this.cbPayload.hashCode()
        result = 31 * result + this.pbPayload.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecureElementHceDataPacket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecureElementHceDataPacket> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): SecureElementHceDataPacket =
                    SecureElementHceDataPacket(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SecureElementHceDataPacket) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bConnectionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cbPayload)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.pbPayload.toList())
                }
            }
    }
}

public data class SecureElementNfccCapabilities(
    public var cbMaxRoutingTableSize: UShort = 0u,
    public var isAidRoutingSupported: Boolean = false,
    public var isProtocolRoutingSupported: Boolean = false,
    public var isTechRoutingSupported: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecureElementNfccCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecureElementNfccCapabilities> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): SecureElementNfccCapabilities =
                    SecureElementNfccCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecureElementNfccCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbMaxRoutingTableSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.isAidRoutingSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.isProtocolRoutingSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.isTechRoutingSupported)
                }
            }
    }
}

public data class SecureElementProtoRoutingInfo(
    public var guidSecureElementId: Guid = Guid(),
    public var eRfProtocolType: UByte = 0u,
)

public data class SecureElementRoutingTable(
    public var numberOfEntries: UInt = 0u,
    public var tableEntries: List<SecureElementRoutingTableEntry> = List(1) { SecureElementRoutingTableEntry() },
)

public data class SecureElementRoutingTableEntry(
    public var eRoutingType: SecureElementRoutingType = 0,
    public var anonymous: SecureElementRoutingTableEntry0 = SecureElementRoutingTableEntry0(),
)

public data class SecureElementRoutingTableEntry0(
    public var techRoutingInfo: SecureElementTechRoutingInfo = SecureElementTechRoutingInfo(),
    public var protoRoutingInfo: SecureElementProtoRoutingInfo = SecureElementProtoRoutingInfo(),
    public var aidRoutingInfo: SecureElementAidRoutingInfo = SecureElementAidRoutingInfo(),
)

public data class SecureElementSetCardEmulationModeInfo(
    public var guidSecureElementId: Guid = Guid(),
    public var eMode: SecureElementCardEmulationMode = 0,
)

public data class SecureElementSetPowerModeInfo(
    public var guidSecureElementId: Guid = Guid(),
    public var powerMode: SecureElementPowerMode = 0,
)

public data class SecureElementTechRoutingInfo(
    public var guidSecureElementId: Guid = Guid(),
    public var eRfTechType: UByte = 0u,
)
