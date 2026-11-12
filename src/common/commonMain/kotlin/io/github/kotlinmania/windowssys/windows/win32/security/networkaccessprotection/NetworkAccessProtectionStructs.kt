@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.networkaccessprotection

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public data class CorrelationId(
    public var connId: Guid = Guid(),
    public var timeStamp: Filetime = Filetime(),
)

public class CountedString internal constructor(
    public var length: UShort,
    stringCtorArg: Pwstr,
) {
    public var string: Pwstr = stringCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        stringCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): Pwstr = this.string

    public fun copy(length: UShort = this.length, string: Pwstr = this.string): CountedString = CountedString(length = length, stringCtorArg = string)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CountedString) return false
        if (this.length != other.length) return false
        if (this.string != other.string) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.string.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UShort = 0u,
            string: Pwstr = MutPtr(0L),
        ): CountedString =
            CountedString(
                length = length,
                stringCtorArg = string,
            )
    }
}

public data class FailureCategoryMapping(
    public var mappingCompliance: IntArray = IntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FailureCategoryMapping) return false
        if (!this.mappingCompliance.contentEquals(other.mappingCompliance)) return false
        return true
    }

    override fun hashCode(): Int = this.mappingCompliance.contentHashCode()
}

public data class FixupInfo(
    public var state: FixupState = 0,
    public var percentage: UByte = 0u,
    public var resultCodes: ResultCodes = ResultCodes(),
    public var fixupMsgId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FixupInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FixupInfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FixupInfo =
                    FixupInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (ResultCodes.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FixupInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.percentage)
                    (ResultCodes.typeLayout()).writeNative(addr + 8L, value.resultCodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fixupMsgId)
                }
            }
    }
}

public data class Ipv4Address(
    public var addr: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv4Address) return false
        if (!this.addr.contentEquals(other.addr)) return false
        return true
    }

    override fun hashCode(): Int = this.addr.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4Address> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4Address> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv4Address =
                    Ipv4Address(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ipv4Address) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.addr)
                }
            }
    }
}

public data class Ipv6Address(
    public var addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6Address) return false
        if (!this.addr.contentEquals(other.addr)) return false
        return true
    }

    override fun hashCode(): Int = this.addr.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6Address> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6Address> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv6Address =
                    Ipv6Address(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ipv6Address) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.addr)
                }
            }
    }
}

public data class IsolationInfo(
    public var isolationState: IsolationState = 0,
    public var probEndTime: Filetime = Filetime(),
    public var failureUrl: CountedString = CountedString(),
)

public data class IsolationInfoEx(
    public var isolationState: IsolationState = 0,
    public var extendedIsolationState: ExtendedIsolationState = 0,
    public var probEndTime: Filetime = Filetime(),
    public var failureUrl: CountedString = CountedString(),
)

public data class NapComponentRegistrationInfo(
    public var id: UInt = 0u,
    public var friendlyName: CountedString = CountedString(),
    public var description: CountedString = CountedString(),
    public var version: CountedString = CountedString(),
    public var vendorName: CountedString = CountedString(),
    public var infoClsid: Guid = Guid(),
    public var configClsid: Guid = Guid(),
    public var registrationDate: Filetime = Filetime(),
    public var componentType: UInt = 0u,
)

public class NetworkSoH internal constructor(
    public var size: UShort,
    dataCtorArg: MutPtr<UByte>,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        dataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): MutPtr<UByte> = this.data

    public fun copy(size: UShort = this.size, data: MutPtr<UByte> = this.data): NetworkSoH = NetworkSoH(size = size, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkSoH) return false
        if (this.size != other.size) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkSoH> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkSoH> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NetworkSoH =
                    NetworkSoH(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NetworkSoH) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.data)
                }
            }

        public operator fun invoke(
            size: UShort = 0u,
            data: MutPtr<UByte> = MutPtr(0L),
        ): NetworkSoH =
            NetworkSoH(
                size = size,
                dataCtorArg = data,
            )
    }
}

public class PrivateData internal constructor(
    public var size: UShort,
    dataCtorArg: MutPtr<UByte>,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        dataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): MutPtr<UByte> = this.data

    public fun copy(size: UShort = this.size, data: MutPtr<UByte> = this.data): PrivateData = PrivateData(size = size, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrivateData) return false
        if (this.size != other.size) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrivateData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrivateData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PrivateData =
                    PrivateData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PrivateData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.data)
                }
            }

        public operator fun invoke(
            size: UShort = 0u,
            data: MutPtr<UByte> = MutPtr(0L),
        ): PrivateData =
            PrivateData(
                size = size,
                dataCtorArg = data,
            )
    }
}

public class ResultCodes internal constructor(
    public var count: UShort,
    resultsCtorArg: MutPtr<Hresult>,
) {
    public var results: MutPtr<Hresult> = resultsCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        resultsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.count

    public operator fun component2(): MutPtr<Hresult> = this.results

    public fun copy(count: UShort = this.count, results: MutPtr<Hresult> = this.results): ResultCodes = ResultCodes(count = count, resultsCtorArg = results)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResultCodes) return false
        if (this.count != other.count) return false
        if (this.results != other.results) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.results.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResultCodes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResultCodes> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ResultCodes =
                    ResultCodes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Hresult>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ResultCodes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Hresult>(64)
                    ).writeNative(addr + 8L, value.results)
                }
            }

        public operator fun invoke(
            count: UShort = 0u,
            results: MutPtr<Hresult> = MutPtr(0L),
        ): ResultCodes =
            ResultCodes(
                count = count,
                resultsCtorArg = results,
            )
    }
}

public class SoH internal constructor(
    public var count: UShort,
    attributesCtorArg: MutPtr<SoHAttribute>,
) {
    public var attributes: MutPtr<SoHAttribute> = attributesCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        attributesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.count

    public operator fun component2(): MutPtr<SoHAttribute> = this.attributes

    public fun copy(count: UShort = this.count, attributes: MutPtr<SoHAttribute> = this.attributes): SoH = SoH(count = count, attributesCtorArg = attributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SoH) return false
        if (this.count != other.count) return false
        if (this.attributes != other.attributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.attributes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SoH> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SoH> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SoH =
                    SoH(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SoHAttribute>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SoH) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SoHAttribute>(64)
                    ).writeNative(addr + 8L, value.attributes)
                }
            }

        public operator fun invoke(
            count: UShort = 0u,
            attributes: MutPtr<SoHAttribute> = MutPtr(0L),
        ): SoH =
            SoH(
                count = count,
                attributesCtorArg = attributes,
            )
    }
}

public class SoHAttribute internal constructor(
    public var type: UShort,
    public var size: UShort,
    valueCtorArg: MutPtr<UByte>,
) {
    public var value: MutPtr<UByte> = valueCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        size = 0u,
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.type

    public operator fun component2(): UShort = this.size

    public operator fun component3(): MutPtr<UByte> = this.value

    public fun copy(type: UShort = this.type, size: UShort = this.size, value: MutPtr<UByte> = this.value): SoHAttribute = SoHAttribute(type = type, size = size, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SoHAttribute) return false
        if (this.type != other.type) return false
        if (this.size != other.size) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SoHAttribute> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SoHAttribute> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SoHAttribute =
                    SoHAttribute(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SoHAttribute) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.value)
                }
            }

        public operator fun invoke(
            type: UShort = 0u,
            size: UShort = 0u,
            value: MutPtr<UByte> = MutPtr(0L),
        ): SoHAttribute =
            SoHAttribute(
                type = type,
                size = size,
                valueCtorArg = value,
            )
    }
}

public data class SystemHealthAgentState(
    public var id: UInt = 0u,
    public var shaResultCodes: ResultCodes = ResultCodes(),
    public var failureCategory: FailureCategory = 0,
    public var fixupInfo: FixupInfo = FixupInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemHealthAgentState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemHealthAgentState> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SystemHealthAgentState =
                    SystemHealthAgentState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (ResultCodes.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (FixupInfo.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: SystemHealthAgentState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.id)
                    (ResultCodes.typeLayout()).writeNative(addr + 8L, value.shaResultCodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.failureCategory)
                    (FixupInfo.typeLayout()).writeNative(addr + 32L, value.fixupInfo)
                }
            }
    }
}
