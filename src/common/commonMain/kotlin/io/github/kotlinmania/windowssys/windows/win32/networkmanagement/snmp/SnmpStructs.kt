package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public data class AsnAny(
    public var asnType: UByte = 0u,
    public var asnValue: AsnAny0 = AsnAny0(),
)

public data class AsnAny0(
    public var number: Int = 0,
    public var unsigned32: UInt = 0u,
    public var counter64: ULong = 0uL,
    public var string: AsnOctetString = AsnOctetString(),
    public var bits: AsnOctetString = AsnOctetString(),
    public var obj: AsnObjectIdentifier = AsnObjectIdentifier(),
    public var sequence: AsnOctetString = AsnOctetString(),
    public var address: AsnOctetString = AsnOctetString(),
    public var counter: UInt = 0u,
    public var gauge: UInt = 0u,
    public var ticks: UInt = 0u,
    public var arbitrary: AsnOctetString = AsnOctetString(),
)

public class AsnObjectIdentifier internal constructor(
    public var idLength: UInt,
    idsCtorArg: MutPtr<UInt>,
) {
    public var ids: MutPtr<UInt> = idsCtorArg
        internal set

    public constructor() : this(
        idLength = 0u,
        idsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.idLength

    public operator fun component2(): MutPtr<UInt> = this.ids

    public fun copy(idLength: UInt = this.idLength, ids: MutPtr<UInt> = this.ids): AsnObjectIdentifier = AsnObjectIdentifier(idLength = idLength, idsCtorArg = ids)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AsnObjectIdentifier) return false
        if (this.idLength != other.idLength) return false
        if (this.ids != other.ids) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.idLength.hashCode()
        result = 31 * result + this.ids.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AsnObjectIdentifier> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AsnObjectIdentifier> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AsnObjectIdentifier =
                    AsnObjectIdentifier(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AsnObjectIdentifier) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.idLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 4L, value.ids)
                }
            }

        public operator fun invoke(
            idLength: UInt = 0u,
            ids: MutPtr<UInt> = MutPtr(0L),
        ): AsnObjectIdentifier =
            AsnObjectIdentifier(
                idLength = idLength,
                idsCtorArg = ids,
            )
    }
}

public class AsnOctetString internal constructor(
    streamCtorArg: MutPtr<UByte>,
    public var length: UInt,
    public var dynamic: Bool,
) {
    public var stream: MutPtr<UByte> = streamCtorArg
        internal set

    public constructor() : this(
        streamCtorArg = MutPtr(0L),
        length = 0u,
        dynamic = 0,
    )

    public operator fun component1(): MutPtr<UByte> = this.stream

    public operator fun component2(): UInt = this.length

    public operator fun component3(): Bool = this.dynamic

    public fun copy(stream: MutPtr<UByte> = this.stream, length: UInt = this.length, dynamic: Bool = this.dynamic): AsnOctetString = AsnOctetString(streamCtorArg = stream, length = length, dynamic = dynamic)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AsnOctetString) return false
        if (this.stream != other.stream) return false
        if (this.length != other.length) return false
        if (this.dynamic != other.dynamic) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stream.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.dynamic.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            stream: MutPtr<UByte> = MutPtr(0L),
            length: UInt = 0u,
            dynamic: Bool = 0,
        ): AsnOctetString =
            AsnOctetString(
                streamCtorArg = stream,
                length = length,
                dynamic = dynamic,
            )
    }
}

public data class SnmpVarBind(
    public var name: AsnObjectIdentifier = AsnObjectIdentifier(),
    public var value: AsnAny = AsnAny(),
)

public class SnmpVarBindList internal constructor(
    listCtorArg: MutPtr<SnmpVarBind>,
    public var len: UInt,
) {
    public var list: MutPtr<SnmpVarBind> = listCtorArg
        internal set

    public constructor() : this(
        listCtorArg = MutPtr(0L),
        len = 0u,
    )

    public operator fun component1(): MutPtr<SnmpVarBind> = this.list

    public operator fun component2(): UInt = this.len

    public fun copy(list: MutPtr<SnmpVarBind> = this.list, len: UInt = this.len): SnmpVarBindList = SnmpVarBindList(listCtorArg = list, len = len)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SnmpVarBindList) return false
        if (this.list != other.list) return false
        if (this.len != other.len) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.list.hashCode()
        result = 31 * result + this.len.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SnmpVarBindList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SnmpVarBindList> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SnmpVarBindList =
                    SnmpVarBindList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SnmpVarBind>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SnmpVarBindList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SnmpVarBind>(64)
                    ).writeNative(addr, value.list)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.len)
                }
            }

        public operator fun invoke(
            list: MutPtr<SnmpVarBind> = MutPtr(0L),
            len: UInt = 0u,
        ): SnmpVarBindList =
            SnmpVarBindList(
                listCtorArg = list,
                len = len,
            )
    }
}

public data class SmiCntr64(
    public var hipart: UInt = 0u,
    public var lopart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmiCntr64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmiCntr64> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SmiCntr64 =
                    SmiCntr64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SmiCntr64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hipart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lopart)
                }
            }
    }
}

public class SmiOctets internal constructor(
    public var len: UInt,
    ptrCtorArg: MutPtr<UByte>,
) {
    public var ptr: MutPtr<UByte> = ptrCtorArg
        internal set

    public constructor() : this(
        len = 0u,
        ptrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.len

    public operator fun component2(): MutPtr<UByte> = this.ptr

    public fun copy(len: UInt = this.len, ptr: MutPtr<UByte> = this.ptr): SmiOctets = SmiOctets(len = len, ptrCtorArg = ptr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SmiOctets) return false
        if (this.len != other.len) return false
        if (this.ptr != other.ptr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.ptr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmiOctets> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmiOctets> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SmiOctets =
                    SmiOctets(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SmiOctets) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.len)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.ptr)
                }
            }

        public operator fun invoke(
            len: UInt = 0u,
            ptr: MutPtr<UByte> = MutPtr(0L),
        ): SmiOctets =
            SmiOctets(
                len = len,
                ptrCtorArg = ptr,
            )
    }
}

public class SmiOid internal constructor(
    public var len: UInt,
    ptrCtorArg: MutPtr<UInt>,
) {
    public var ptr: MutPtr<UInt> = ptrCtorArg
        internal set

    public constructor() : this(
        len = 0u,
        ptrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.len

    public operator fun component2(): MutPtr<UInt> = this.ptr

    public fun copy(len: UInt = this.len, ptr: MutPtr<UInt> = this.ptr): SmiOid = SmiOid(len = len, ptrCtorArg = ptr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SmiOid) return false
        if (this.len != other.len) return false
        if (this.ptr != other.ptr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.ptr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmiOid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmiOid> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SmiOid =
                    SmiOid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SmiOid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.len)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.ptr)
                }
            }

        public operator fun invoke(
            len: UInt = 0u,
            ptr: MutPtr<UInt> = MutPtr(0L),
        ): SmiOid =
            SmiOid(
                len = len,
                ptrCtorArg = ptr,
            )
    }
}

public data class SmiValue(
    public var syntax: UInt = 0u,
    public var value: SmiValue0 = SmiValue0(),
)

public data class SmiValue0(
    public var sNumber: Int = 0,
    public var uNumber: UInt = 0u,
    public var hNumber: SmiCntr64 = SmiCntr64(),
    public var string: SmiOctets = SmiOctets(),
    public var oid: SmiOid = SmiOid(),
    public var empty: UByte = 0u,
)

public data class SmiVendorinfo(
    public var vendorName: ByteArray = ByteArray(64),
    public var vendorContact: ByteArray = ByteArray(64),
    public var vendorVersionId: ByteArray = ByteArray(32),
    public var vendorVersionDate: ByteArray = ByteArray(32),
    public var vendorEnterprise: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SmiVendorinfo) return false
        if (!this.vendorName.contentEquals(other.vendorName)) return false
        if (!this.vendorContact.contentEquals(other.vendorContact)) return false
        if (!this.vendorVersionId.contentEquals(other.vendorVersionId)) return false
        if (!this.vendorVersionDate.contentEquals(other.vendorVersionDate)) return false
        if (this.vendorEnterprise != other.vendorEnterprise) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vendorName.contentHashCode()
        result = 31 * result + this.vendorContact.contentHashCode()
        result = 31 * result + this.vendorVersionId.contentHashCode()
        result = 31 * result + this.vendorVersionDate.contentHashCode()
        result = 31 * result + this.vendorEnterprise.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmiVendorinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmiVendorinfo> {
                override val sizeBytes: Long = 196L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SmiVendorinfo =
                    SmiVendorinfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                    )
                override fun writeNative(addr: Long, value: SmiVendorinfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr, value.vendorName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 64L, value.vendorContact)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 128L, value.vendorVersionId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 160L, value.vendorVersionDate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.vendorEnterprise)
                }
            }
    }
}
