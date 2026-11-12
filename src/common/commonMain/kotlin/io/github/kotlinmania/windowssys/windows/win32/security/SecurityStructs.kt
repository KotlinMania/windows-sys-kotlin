@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid

public data class AccessAllowedAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessAllowedAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessAllowedAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): AccessAllowedAce =
                    AccessAllowedAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AccessAllowedAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class AccessAllowedCallbackAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessAllowedCallbackAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessAllowedCallbackAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): AccessAllowedCallbackAce =
                    AccessAllowedCallbackAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AccessAllowedCallbackAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class AccessAllowedCallbackObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class AccessAllowedObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class AccessDeniedAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessDeniedAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessDeniedAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): AccessDeniedAce =
                    AccessDeniedAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AccessDeniedAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class AccessDeniedCallbackAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessDeniedCallbackAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessDeniedCallbackAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): AccessDeniedCallbackAce =
                    AccessDeniedCallbackAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AccessDeniedCallbackAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class AccessDeniedCallbackObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class AccessDeniedObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class AccessReasons(
    public var data: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AccessReasons) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessReasons> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AccessReasons> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): AccessReasons =
                    AccessReasons(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: AccessReasons) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                    ).writeNative(addr, value.data.toList())
                }
            }
    }
}

public data class AceHeader(
    public var aceType: UByte = 0u,
    public var aceFlags: UByte = 0u,
    public var aceSize: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AceHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AceHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AceHeader =
                    AceHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: AceHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.aceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.aceFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.aceSize)
                }
            }
    }
}

public data class Acl(
    public var aclRevision: UByte = 0u,
    public var sbz1: UByte = 0u,
    public var aclSize: UShort = 0u,
    public var aceCount: UShort = 0u,
    public var sbz2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acl> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Acl =
                    Acl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Acl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.aclRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sbz1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.aclSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.aceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.sbz2)
                }
            }
    }
}

public data class AclRevisionInformation(
    public var aclRevision: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AclRevisionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AclRevisionInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AclRevisionInformation =
                    AclRevisionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: AclRevisionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aclRevision)
                }
            }
    }
}

public data class AclSizeInformation(
    public var aceCount: UInt = 0u,
    public var aclBytesInUse: UInt = 0u,
    public var aclBytesFree: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AclSizeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AclSizeInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): AclSizeInformation =
                    AclSizeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AclSizeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aclBytesInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aclBytesFree)
                }
            }
    }
}

public data class ClaimSecurityAttributesInformation(
    public var version: UShort = 0u,
    public var reserved: UShort = 0u,
    public var attributeCount: UInt = 0u,
    public var attribute: ClaimSecurityAttributesInformation0 = ClaimSecurityAttributesInformation0(),
)

public class ClaimSecurityAttributesInformation0 internal constructor(
    pAttributeV1CtorArg: MutPtr<ClaimSecurityAttributeV1>,
) {
    public var pAttributeV1: MutPtr<ClaimSecurityAttributeV1> = pAttributeV1CtorArg
        internal set

    public constructor() : this(
        pAttributeV1CtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<ClaimSecurityAttributeV1> = this.pAttributeV1

    public fun copy(pAttributeV1: MutPtr<ClaimSecurityAttributeV1> = this.pAttributeV1): ClaimSecurityAttributesInformation0 = ClaimSecurityAttributesInformation0(pAttributeV1CtorArg = pAttributeV1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClaimSecurityAttributesInformation0) return false
        if (this.pAttributeV1 != other.pAttributeV1) return false
        return true
    }

    override fun hashCode(): Int = this.pAttributeV1.hashCode()

    public companion object {
        public operator fun invoke(
            pAttributeV1: MutPtr<ClaimSecurityAttributeV1> = MutPtr(0L),
        ): ClaimSecurityAttributesInformation0 =
            ClaimSecurityAttributesInformation0(
                pAttributeV1CtorArg = pAttributeV1,
            )
    }
}

public class ClaimSecurityAttributeFqbnValue internal constructor(
    public var version: ULong,
    nameCtorArg: Pwstr,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public constructor() : this(
        version = 0uL,
        nameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.version

    public operator fun component2(): Pwstr = this.name

    public fun copy(version: ULong = this.version, name: Pwstr = this.name): ClaimSecurityAttributeFqbnValue = ClaimSecurityAttributeFqbnValue(version = version, nameCtorArg = name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClaimSecurityAttributeFqbnValue) return false
        if (this.version != other.version) return false
        if (this.name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.name.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: ULong = 0uL,
            name: Pwstr = MutPtr(0L),
        ): ClaimSecurityAttributeFqbnValue =
            ClaimSecurityAttributeFqbnValue(
                version = version,
                nameCtorArg = name,
            )
    }
}

public class ClaimSecurityAttributeOctetStringValue internal constructor(
    pValueCtorArg: MutPtr<CVoid>,
    public var valueLength: UInt,
) {
    public var pValue: MutPtr<CVoid> = pValueCtorArg
        internal set

    public constructor() : this(
        pValueCtorArg = MutPtr(0L),
        valueLength = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pValue

    public operator fun component2(): UInt = this.valueLength

    public fun copy(pValue: MutPtr<CVoid> = this.pValue, valueLength: UInt = this.valueLength): ClaimSecurityAttributeOctetStringValue = ClaimSecurityAttributeOctetStringValue(pValueCtorArg = pValue, valueLength = valueLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClaimSecurityAttributeOctetStringValue) return false
        if (this.pValue != other.pValue) return false
        if (this.valueLength != other.valueLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pValue.hashCode()
        result = 31 * result + this.valueLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClaimSecurityAttributeOctetStringValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClaimSecurityAttributeOctetStringValue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ClaimSecurityAttributeOctetStringValue =
                    ClaimSecurityAttributeOctetStringValue(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ClaimSecurityAttributeOctetStringValue) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.valueLength)
                }
            }

        public operator fun invoke(
            pValue: MutPtr<CVoid> = MutPtr(0L),
            valueLength: UInt = 0u,
        ): ClaimSecurityAttributeOctetStringValue =
            ClaimSecurityAttributeOctetStringValue(
                pValueCtorArg = pValue,
                valueLength = valueLength,
            )
    }
}

public data class ClaimSecurityAttributeRelativeV1(
    public var name: UInt = 0u,
    public var valueType: ClaimSecurityAttributeValueType = 0u,
    public var reserved: UShort = 0u,
    public var flags: ClaimSecurityAttributeFlags = 0u,
    public var valueCount: UInt = 0u,
    public var values: ClaimSecurityAttributeRelativeV10 = ClaimSecurityAttributeRelativeV10(),
)

public data class ClaimSecurityAttributeRelativeV10(
    public var pInt64: UIntArray = UIntArray(1),
    public var pUint64: UIntArray = UIntArray(1),
    public var ppString: UIntArray = UIntArray(1),
    public var pFqbn: UIntArray = UIntArray(1),
    public var pOctetString: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClaimSecurityAttributeRelativeV10) return false
        if (!this.pInt64.contentEquals(other.pInt64)) return false
        if (!this.pUint64.contentEquals(other.pUint64)) return false
        if (!this.ppString.contentEquals(other.ppString)) return false
        if (!this.pFqbn.contentEquals(other.pFqbn)) return false
        if (!this.pOctetString.contentEquals(other.pOctetString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pInt64.contentHashCode()
        result = 31 * result + this.pUint64.contentHashCode()
        result = 31 * result + this.ppString.contentHashCode()
        result = 31 * result + this.pFqbn.contentHashCode()
        result = 31 * result + this.pOctetString.contentHashCode()
        return result
    }
}

public class ClaimSecurityAttributeV1 internal constructor(
    nameCtorArg: Pwstr,
    public var valueType: ClaimSecurityAttributeValueType,
    public var reserved: UShort,
    public var flags: UInt,
    public var valueCount: UInt,
    public var values: ClaimSecurityAttributeV10,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = MutPtr(0L),
        valueType = 0u,
        reserved = 0u,
        flags = 0u,
        valueCount = 0u,
        values = ClaimSecurityAttributeV10(),
    )

    public operator fun component1(): Pwstr = this.name

    public operator fun component2(): ClaimSecurityAttributeValueType = this.valueType

    public operator fun component3(): UShort = this.reserved

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): UInt = this.valueCount

    public operator fun component6(): ClaimSecurityAttributeV10 = this.values

    public fun copy(name: Pwstr = this.name, valueType: ClaimSecurityAttributeValueType = this.valueType, reserved: UShort = this.reserved, flags: UInt = this.flags, valueCount: UInt = this.valueCount, values: ClaimSecurityAttributeV10 = this.values): ClaimSecurityAttributeV1 = ClaimSecurityAttributeV1(nameCtorArg = name, valueType = valueType, reserved = reserved, flags = flags, valueCount = valueCount, values = values)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClaimSecurityAttributeV1) return false
        if (this.name != other.name) return false
        if (this.valueType != other.valueType) return false
        if (this.reserved != other.reserved) return false
        if (this.flags != other.flags) return false
        if (this.valueCount != other.valueCount) return false
        if (this.values != other.values) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.valueType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.valueCount.hashCode()
        result = 31 * result + this.values.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pwstr = MutPtr(0L),
            valueType: ClaimSecurityAttributeValueType = 0u,
            reserved: UShort = 0u,
            flags: UInt = 0u,
            valueCount: UInt = 0u,
            values: ClaimSecurityAttributeV10 = ClaimSecurityAttributeV10(),
        ): ClaimSecurityAttributeV1 =
            ClaimSecurityAttributeV1(
                nameCtorArg = name,
                valueType = valueType,
                reserved = reserved,
                flags = flags,
                valueCount = valueCount,
                values = values,
            )
    }
}

public class ClaimSecurityAttributeV10 internal constructor(
    pInt64CtorArg: MutPtr<Long>,
    pUint64CtorArg: MutPtr<ULong>,
    ppStringCtorArg: MutPtr<Pwstr>,
    pFqbnCtorArg: MutPtr<ClaimSecurityAttributeFqbnValue>,
    pOctetStringCtorArg: MutPtr<ClaimSecurityAttributeOctetStringValue>,
) {
    public var pInt64: MutPtr<Long> = pInt64CtorArg
        internal set

    public var pUint64: MutPtr<ULong> = pUint64CtorArg
        internal set

    public var ppString: MutPtr<Pwstr> = ppStringCtorArg
        internal set

    public var pFqbn: MutPtr<ClaimSecurityAttributeFqbnValue> = pFqbnCtorArg
        internal set

    public var pOctetString: MutPtr<ClaimSecurityAttributeOctetStringValue> = pOctetStringCtorArg
        internal set

    public constructor() : this(
        pInt64CtorArg = MutPtr(0L),
        pUint64CtorArg = MutPtr(0L),
        ppStringCtorArg = MutPtr(0L),
        pFqbnCtorArg = MutPtr(0L),
        pOctetStringCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Long> = this.pInt64

    public operator fun component2(): MutPtr<ULong> = this.pUint64

    public operator fun component3(): MutPtr<Pwstr> = this.ppString

    public operator fun component4(): MutPtr<ClaimSecurityAttributeFqbnValue> = this.pFqbn

    public operator fun component5(): MutPtr<ClaimSecurityAttributeOctetStringValue> = this.pOctetString

    public fun copy(pInt64: MutPtr<Long> = this.pInt64, pUint64: MutPtr<ULong> = this.pUint64, ppString: MutPtr<Pwstr> = this.ppString, pFqbn: MutPtr<ClaimSecurityAttributeFqbnValue> = this.pFqbn, pOctetString: MutPtr<ClaimSecurityAttributeOctetStringValue> = this.pOctetString): ClaimSecurityAttributeV10 = ClaimSecurityAttributeV10(pInt64CtorArg = pInt64, pUint64CtorArg = pUint64, ppStringCtorArg = ppString, pFqbnCtorArg = pFqbn, pOctetStringCtorArg = pOctetString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClaimSecurityAttributeV10) return false
        if (this.pInt64 != other.pInt64) return false
        if (this.pUint64 != other.pUint64) return false
        if (this.ppString != other.ppString) return false
        if (this.pFqbn != other.pFqbn) return false
        if (this.pOctetString != other.pOctetString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pInt64.hashCode()
        result = 31 * result + this.pUint64.hashCode()
        result = 31 * result + this.ppString.hashCode()
        result = 31 * result + this.pFqbn.hashCode()
        result = 31 * result + this.pOctetString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pInt64: MutPtr<Long> = MutPtr(0L),
            pUint64: MutPtr<ULong> = MutPtr(0L),
            ppString: MutPtr<Pwstr> = MutPtr(0L),
            pFqbn: MutPtr<ClaimSecurityAttributeFqbnValue> = MutPtr(0L),
            pOctetString: MutPtr<ClaimSecurityAttributeOctetStringValue> = MutPtr(0L),
        ): ClaimSecurityAttributeV10 =
            ClaimSecurityAttributeV10(
                pInt64CtorArg = pInt64,
                pUint64CtorArg = pUint64,
                ppStringCtorArg = ppString,
                pFqbnCtorArg = pFqbn,
                pOctetStringCtorArg = pOctetString,
            )
    }
}

public data class GenericMapping(
    public var genericRead: UInt = 0u,
    public var genericWrite: UInt = 0u,
    public var genericExecute: UInt = 0u,
    public var genericAll: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenericMapping> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenericMapping> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): GenericMapping =
                    GenericMapping(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: GenericMapping) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.genericRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.genericWrite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.genericExecute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.genericAll)
                }
            }
    }
}

public data class Llfiletime(
    public var anonymous: Llfiletime0 = Llfiletime0(),
)

public data class Llfiletime0(
    public var ll: Long = 0L,
    public var ft: Filetime = Filetime(),
)

public data class LuidAndAttributes(
    public var luid: Luid = Luid(),
    public var attributes: TokenPrivilegesAttributes = 0u,
)

public class ObjectTypeList internal constructor(
    public var level: UShort,
    public var sbz: UShort,
    objectTypeCtorArg: MutPtr<Guid>,
) {
    public var objectType: MutPtr<Guid> = objectTypeCtorArg
        internal set

    public constructor() : this(
        level = 0u,
        sbz = 0u,
        objectTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.level

    public operator fun component2(): UShort = this.sbz

    public operator fun component3(): MutPtr<Guid> = this.objectType

    public fun copy(level: UShort = this.level, sbz: UShort = this.sbz, objectType: MutPtr<Guid> = this.objectType): ObjectTypeList = ObjectTypeList(level = level, sbz = sbz, objectTypeCtorArg = objectType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectTypeList) return false
        if (this.level != other.level) return false
        if (this.sbz != other.sbz) return false
        if (this.objectType != other.objectType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.level.hashCode()
        result = 31 * result + this.sbz.hashCode()
        result = 31 * result + this.objectType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObjectTypeList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObjectTypeList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ObjectTypeList =
                    ObjectTypeList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ObjectTypeList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sbz)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.objectType)
                }
            }

        public operator fun invoke(
            level: UShort = 0u,
            sbz: UShort = 0u,
            objectType: MutPtr<Guid> = MutPtr(0L),
        ): ObjectTypeList =
            ObjectTypeList(
                level = level,
                sbz = sbz,
                objectTypeCtorArg = objectType,
            )
    }
}

public data class PrivilegeSet(
    public var privilegeCount: UInt = 0u,
    public var control: UInt = 0u,
    public var privilege: List<LuidAndAttributes> = List(1) { LuidAndAttributes() },
)

public data class QuotaLimits(
    public var pagedPoolLimit: Int = 0,
    public var nonPagedPoolLimit: Int = 0,
    public var minimumWorkingSetSize: Int = 0,
    public var maximumWorkingSetSize: Int = 0,
    public var pagefileLimit: Int = 0,
    public var timeLimit: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QuotaLimits> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QuotaLimits> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): QuotaLimits =
                    QuotaLimits(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: QuotaLimits) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.pagedPoolLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.nonPagedPoolLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.minimumWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.maximumWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.pagefileLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.timeLimit)
                }
            }
    }
}

public class SecurityAttributes internal constructor(
    public var nLength: UInt,
    lpSecurityDescriptorCtorArg: MutPtr<CVoid>,
    public var bInheritHandle: Bool,
) {
    public var lpSecurityDescriptor: MutPtr<CVoid> = lpSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        nLength = 0u,
        lpSecurityDescriptorCtorArg = MutPtr(0L),
        bInheritHandle = 0,
    )

    public operator fun component1(): UInt = this.nLength

    public operator fun component2(): MutPtr<CVoid> = this.lpSecurityDescriptor

    public operator fun component3(): Bool = this.bInheritHandle

    public fun copy(nLength: UInt = this.nLength, lpSecurityDescriptor: MutPtr<CVoid> = this.lpSecurityDescriptor, bInheritHandle: Bool = this.bInheritHandle): SecurityAttributes = SecurityAttributes(nLength = nLength, lpSecurityDescriptorCtorArg = lpSecurityDescriptor, bInheritHandle = bInheritHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecurityAttributes) return false
        if (this.nLength != other.nLength) return false
        if (this.lpSecurityDescriptor != other.lpSecurityDescriptor) return false
        if (this.bInheritHandle != other.bInheritHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nLength.hashCode()
        result = 31 * result + this.lpSecurityDescriptor.hashCode()
        result = 31 * result + this.bInheritHandle.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityAttributes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SecurityAttributes =
                    SecurityAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SecurityAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.lpSecurityDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.bInheritHandle)
                }
            }

        public operator fun invoke(
            nLength: UInt = 0u,
            lpSecurityDescriptor: MutPtr<CVoid> = MutPtr(0L),
            bInheritHandle: Bool = 0,
        ): SecurityAttributes =
            SecurityAttributes(
                nLength = nLength,
                lpSecurityDescriptorCtorArg = lpSecurityDescriptor,
                bInheritHandle = bInheritHandle,
            )
    }
}

public class SecurityCapabilities internal constructor(
    appContainerSidCtorArg: Psid,
    capabilitiesCtorArg: MutPtr<SidAndAttributes>,
    public var capabilityCount: UInt,
    public var reserved: UInt,
) {
    public var appContainerSid: Psid = appContainerSidCtorArg
        internal set

    public var capabilities: MutPtr<SidAndAttributes> = capabilitiesCtorArg
        internal set

    public constructor() : this(
        appContainerSidCtorArg = MutPtr(0L),
        capabilitiesCtorArg = MutPtr(0L),
        capabilityCount = 0u,
        reserved = 0u,
    )

    public operator fun component1(): Psid = this.appContainerSid

    public operator fun component2(): MutPtr<SidAndAttributes> = this.capabilities

    public operator fun component3(): UInt = this.capabilityCount

    public operator fun component4(): UInt = this.reserved

    public fun copy(appContainerSid: Psid = this.appContainerSid, capabilities: MutPtr<SidAndAttributes> = this.capabilities, capabilityCount: UInt = this.capabilityCount, reserved: UInt = this.reserved): SecurityCapabilities = SecurityCapabilities(appContainerSidCtorArg = appContainerSid, capabilitiesCtorArg = capabilities, capabilityCount = capabilityCount, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecurityCapabilities) return false
        if (this.appContainerSid != other.appContainerSid) return false
        if (this.capabilities != other.capabilities) return false
        if (this.capabilityCount != other.capabilityCount) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.appContainerSid.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.capabilityCount.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityCapabilities> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SecurityCapabilities =
                    SecurityCapabilities(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SidAndAttributes>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: SecurityCapabilities) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.appContainerSid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SidAndAttributes>(64)
                    ).writeNative(addr + 8L, value.capabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.capabilityCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                }
            }

        public operator fun invoke(
            appContainerSid: Psid = MutPtr(0L),
            capabilities: MutPtr<SidAndAttributes> = MutPtr(0L),
            capabilityCount: UInt = 0u,
            reserved: UInt = 0u,
        ): SecurityCapabilities =
            SecurityCapabilities(
                appContainerSidCtorArg = appContainerSid,
                capabilitiesCtorArg = capabilities,
                capabilityCount = capabilityCount,
                reserved = reserved,
            )
    }
}

public class SecurityDescriptor internal constructor(
    public var revision: UByte,
    public var sbz1: UByte,
    public var control: SecurityDescriptorControl,
    ownerCtorArg: Psid,
    groupCtorArg: Psid,
    saclCtorArg: MutPtr<Acl>,
    daclCtorArg: MutPtr<Acl>,
) {
    public var owner: Psid = ownerCtorArg
        internal set

    public var group: Psid = groupCtorArg
        internal set

    public var sacl: MutPtr<Acl> = saclCtorArg
        internal set

    public var dacl: MutPtr<Acl> = daclCtorArg
        internal set

    public constructor() : this(
        revision = 0u,
        sbz1 = 0u,
        control = 0u,
        ownerCtorArg = MutPtr(0L),
        groupCtorArg = MutPtr(0L),
        saclCtorArg = MutPtr(0L),
        daclCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.revision

    public operator fun component2(): UByte = this.sbz1

    public operator fun component3(): SecurityDescriptorControl = this.control

    public operator fun component4(): Psid = this.owner

    public operator fun component5(): Psid = this.group

    public operator fun component6(): MutPtr<Acl> = this.sacl

    public operator fun component7(): MutPtr<Acl> = this.dacl

    public fun copy(revision: UByte = this.revision, sbz1: UByte = this.sbz1, control: SecurityDescriptorControl = this.control, owner: Psid = this.owner, group: Psid = this.group, sacl: MutPtr<Acl> = this.sacl, dacl: MutPtr<Acl> = this.dacl): SecurityDescriptor = SecurityDescriptor(revision = revision, sbz1 = sbz1, control = control, ownerCtorArg = owner, groupCtorArg = group, saclCtorArg = sacl, daclCtorArg = dacl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecurityDescriptor) return false
        if (this.revision != other.revision) return false
        if (this.sbz1 != other.sbz1) return false
        if (this.control != other.control) return false
        if (this.owner != other.owner) return false
        if (this.group != other.group) return false
        if (this.sacl != other.sacl) return false
        if (this.dacl != other.dacl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.revision.hashCode()
        result = 31 * result + this.sbz1.hashCode()
        result = 31 * result + this.control.hashCode()
        result = 31 * result + this.owner.hashCode()
        result = 31 * result + this.group.hashCode()
        result = 31 * result + this.sacl.hashCode()
        result = 31 * result + this.dacl.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): SecurityDescriptor =
                    SecurityDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
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
                                .mutPtrLayout<Acl>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Acl>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: SecurityDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sbz1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.control)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.owner)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.group)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Acl>(64)
                    ).writeNative(addr + 24L, value.sacl)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Acl>(64)
                    ).writeNative(addr + 32L, value.dacl)
                }
            }

        public operator fun invoke(
            revision: UByte = 0u,
            sbz1: UByte = 0u,
            control: SecurityDescriptorControl = 0u,
            owner: Psid = MutPtr(0L),
            group: Psid = MutPtr(0L),
            sacl: MutPtr<Acl> = MutPtr(0L),
            dacl: MutPtr<Acl> = MutPtr(0L),
        ): SecurityDescriptor =
            SecurityDescriptor(
                revision = revision,
                sbz1 = sbz1,
                control = control,
                ownerCtorArg = owner,
                groupCtorArg = group,
                saclCtorArg = sacl,
                daclCtorArg = dacl,
            )
    }
}

public data class SecurityDescriptorRelative(
    public var revision: UByte = 0u,
    public var sbz1: UByte = 0u,
    public var control: SecurityDescriptorControl = 0u,
    public var owner: UInt = 0u,
    public var group: UInt = 0u,
    public var sacl: UInt = 0u,
    public var dacl: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityDescriptorRelative> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityDescriptorRelative> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SecurityDescriptorRelative =
                    SecurityDescriptorRelative(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SecurityDescriptorRelative) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sbz1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.control)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.owner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.group)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sacl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dacl)
                }
            }
    }
}

public data class SecurityQualityOfService(
    public var length: UInt = 0u,
    public var impersonationLevel: SecurityImpersonationLevel = 0,
    public var contextTrackingMode: UByte = 0u,
    public var effectiveOnly: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityQualityOfService> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityQualityOfService> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SecurityQualityOfService =
                    SecurityQualityOfService(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: SecurityQualityOfService) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.impersonationLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.contextTrackingMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.effectiveOnly)
                }
            }
    }
}

public class SeAccessReply internal constructor(
    public var size: UInt,
    public var resultListCount: UInt,
    grantedAccessCtorArg: MutPtr<UInt>,
    accessStatusCtorArg: MutPtr<UInt>,
    accessReasonCtorArg: MutPtr<AccessReasons>,
    privilegesCtorArg: MutPtr<MutPtr<PrivilegeSet>>,
) {
    public var grantedAccess: MutPtr<UInt> = grantedAccessCtorArg
        internal set

    public var accessStatus: MutPtr<UInt> = accessStatusCtorArg
        internal set

    public var accessReason: MutPtr<AccessReasons> = accessReasonCtorArg
        internal set

    public var privileges: MutPtr<MutPtr<PrivilegeSet>> = privilegesCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        resultListCount = 0u,
        grantedAccessCtorArg = MutPtr(0L),
        accessStatusCtorArg = MutPtr(0L),
        accessReasonCtorArg = MutPtr(0L),
        privilegesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.resultListCount

    public operator fun component3(): MutPtr<UInt> = this.grantedAccess

    public operator fun component4(): MutPtr<UInt> = this.accessStatus

    public operator fun component5(): MutPtr<AccessReasons> = this.accessReason

    public operator fun component6(): MutPtr<MutPtr<PrivilegeSet>> = this.privileges

    public fun copy(size: UInt = this.size, resultListCount: UInt = this.resultListCount, grantedAccess: MutPtr<UInt> = this.grantedAccess, accessStatus: MutPtr<UInt> = this.accessStatus, accessReason: MutPtr<AccessReasons> = this.accessReason, privileges: MutPtr<MutPtr<PrivilegeSet>> = this.privileges): SeAccessReply = SeAccessReply(size = size, resultListCount = resultListCount, grantedAccessCtorArg = grantedAccess, accessStatusCtorArg = accessStatus, accessReasonCtorArg = accessReason, privilegesCtorArg = privileges)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeAccessReply) return false
        if (this.size != other.size) return false
        if (this.resultListCount != other.resultListCount) return false
        if (this.grantedAccess != other.grantedAccess) return false
        if (this.accessStatus != other.accessStatus) return false
        if (this.accessReason != other.accessReason) return false
        if (this.privileges != other.privileges) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.resultListCount.hashCode()
        result = 31 * result + this.grantedAccess.hashCode()
        result = 31 * result + this.accessStatus.hashCode()
        result = 31 * result + this.accessReason.hashCode()
        result = 31 * result + this.privileges.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAccessReply> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAccessReply> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): SeAccessReply =
                    SeAccessReply(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<AccessReasons>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<PrivilegeSet>>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: SeAccessReply) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.resultListCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.grantedAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 16L, value.accessStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<AccessReasons>(64)
                    ).writeNative(addr + 24L, value.accessReason)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<PrivilegeSet>>(64)
                    ).writeNative(addr + 32L, value.privileges)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            resultListCount: UInt = 0u,
            grantedAccess: MutPtr<UInt> = MutPtr(0L),
            accessStatus: MutPtr<UInt> = MutPtr(0L),
            accessReason: MutPtr<AccessReasons> = MutPtr(0L),
            privileges: MutPtr<MutPtr<PrivilegeSet>> = MutPtr(0L),
        ): SeAccessReply =
            SeAccessReply(
                size = size,
                resultListCount = resultListCount,
                grantedAccessCtorArg = grantedAccess,
                accessStatusCtorArg = accessStatus,
                accessReasonCtorArg = accessReason,
                privilegesCtorArg = privileges,
            )
    }
}

public class SeAccessRequest internal constructor(
    public var size: UInt,
    seSecurityDescriptorCtorArg: MutPtr<SeSecurityDescriptor>,
    public var desiredAccess: UInt,
    public var previouslyGrantedAccess: UInt,
    principalSelfSidCtorArg: Psid,
    genericMappingCtorArg: MutPtr<GenericMapping>,
    public var objectTypeListCount: UInt,
    objectTypeListCtorArg: MutPtr<ObjectTypeList>,
) {
    public var seSecurityDescriptor: MutPtr<SeSecurityDescriptor> = seSecurityDescriptorCtorArg
        internal set

    public var principalSelfSid: Psid = principalSelfSidCtorArg
        internal set

    public var genericMapping: MutPtr<GenericMapping> = genericMappingCtorArg
        internal set

    public var objectTypeList: MutPtr<ObjectTypeList> = objectTypeListCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        seSecurityDescriptorCtorArg = MutPtr(0L),
        desiredAccess = 0u,
        previouslyGrantedAccess = 0u,
        principalSelfSidCtorArg = MutPtr(0L),
        genericMappingCtorArg = MutPtr(0L),
        objectTypeListCount = 0u,
        objectTypeListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<SeSecurityDescriptor> = this.seSecurityDescriptor

    public operator fun component3(): UInt = this.desiredAccess

    public operator fun component4(): UInt = this.previouslyGrantedAccess

    public operator fun component5(): Psid = this.principalSelfSid

    public operator fun component6(): MutPtr<GenericMapping> = this.genericMapping

    public operator fun component7(): UInt = this.objectTypeListCount

    public operator fun component8(): MutPtr<ObjectTypeList> = this.objectTypeList

    public fun copy(size: UInt = this.size, seSecurityDescriptor: MutPtr<SeSecurityDescriptor> = this.seSecurityDescriptor, desiredAccess: UInt = this.desiredAccess, previouslyGrantedAccess: UInt = this.previouslyGrantedAccess, principalSelfSid: Psid = this.principalSelfSid, genericMapping: MutPtr<GenericMapping> = this.genericMapping, objectTypeListCount: UInt = this.objectTypeListCount, objectTypeList: MutPtr<ObjectTypeList> = this.objectTypeList): SeAccessRequest = SeAccessRequest(size = size, seSecurityDescriptorCtorArg = seSecurityDescriptor, desiredAccess = desiredAccess, previouslyGrantedAccess = previouslyGrantedAccess, principalSelfSidCtorArg = principalSelfSid, genericMappingCtorArg = genericMapping, objectTypeListCount = objectTypeListCount, objectTypeListCtorArg = objectTypeList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeAccessRequest) return false
        if (this.size != other.size) return false
        if (this.seSecurityDescriptor != other.seSecurityDescriptor) return false
        if (this.desiredAccess != other.desiredAccess) return false
        if (this.previouslyGrantedAccess != other.previouslyGrantedAccess) return false
        if (this.principalSelfSid != other.principalSelfSid) return false
        if (this.genericMapping != other.genericMapping) return false
        if (this.objectTypeListCount != other.objectTypeListCount) return false
        if (this.objectTypeList != other.objectTypeList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.seSecurityDescriptor.hashCode()
        result = 31 * result + this.desiredAccess.hashCode()
        result = 31 * result + this.previouslyGrantedAccess.hashCode()
        result = 31 * result + this.principalSelfSid.hashCode()
        result = 31 * result + this.genericMapping.hashCode()
        result = 31 * result + this.objectTypeListCount.hashCode()
        result = 31 * result + this.objectTypeList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAccessRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAccessRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): SeAccessRequest =
                    SeAccessRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SeSecurityDescriptor>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<GenericMapping>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ObjectTypeList>(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: SeAccessRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SeSecurityDescriptor>(64)
                    ).writeNative(addr + 8L, value.seSecurityDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.desiredAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.previouslyGrantedAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.principalSelfSid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<GenericMapping>(64)
                    ).writeNative(addr + 32L, value.genericMapping)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.objectTypeListCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ObjectTypeList>(64)
                    ).writeNative(addr + 48L, value.objectTypeList)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            seSecurityDescriptor: MutPtr<SeSecurityDescriptor> = MutPtr(0L),
            desiredAccess: UInt = 0u,
            previouslyGrantedAccess: UInt = 0u,
            principalSelfSid: Psid = MutPtr(0L),
            genericMapping: MutPtr<GenericMapping> = MutPtr(0L),
            objectTypeListCount: UInt = 0u,
            objectTypeList: MutPtr<ObjectTypeList> = MutPtr(0L),
        ): SeAccessRequest =
            SeAccessRequest(
                size = size,
                seSecurityDescriptorCtorArg = seSecurityDescriptor,
                desiredAccess = desiredAccess,
                previouslyGrantedAccess = previouslyGrantedAccess,
                principalSelfSidCtorArg = principalSelfSid,
                genericMappingCtorArg = genericMapping,
                objectTypeListCount = objectTypeListCount,
                objectTypeListCtorArg = objectTypeList,
            )
    }
}

public class SeImpersonationState internal constructor(
    tokenCtorArg: MutPtr<CVoid>,
    public var copyOnOpen: Boolean,
    public var effectiveOnly: Boolean,
    public var level: SecurityImpersonationLevel,
) {
    public var token: MutPtr<CVoid> = tokenCtorArg
        internal set

    public constructor() : this(
        tokenCtorArg = MutPtr(0L),
        copyOnOpen = false,
        effectiveOnly = false,
        level = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.token

    public operator fun component2(): Boolean = this.copyOnOpen

    public operator fun component3(): Boolean = this.effectiveOnly

    public operator fun component4(): SecurityImpersonationLevel = this.level

    public fun copy(token: MutPtr<CVoid> = this.token, copyOnOpen: Boolean = this.copyOnOpen, effectiveOnly: Boolean = this.effectiveOnly, level: SecurityImpersonationLevel = this.level): SeImpersonationState = SeImpersonationState(tokenCtorArg = token, copyOnOpen = copyOnOpen, effectiveOnly = effectiveOnly, level = level)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeImpersonationState) return false
        if (this.token != other.token) return false
        if (this.copyOnOpen != other.copyOnOpen) return false
        if (this.effectiveOnly != other.effectiveOnly) return false
        if (this.level != other.level) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.token.hashCode()
        result = 31 * result + this.copyOnOpen.hashCode()
        result = 31 * result + this.effectiveOnly.hashCode()
        result = 31 * result + this.level.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeImpersonationState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeImpersonationState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SeImpersonationState =
                    SeImpersonationState(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SeImpersonationState) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.token)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.copyOnOpen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.effectiveOnly)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.level)
                }
            }

        public operator fun invoke(
            token: MutPtr<CVoid> = MutPtr(0L),
            copyOnOpen: Boolean = false,
            effectiveOnly: Boolean = false,
            level: SecurityImpersonationLevel = 0,
        ): SeImpersonationState =
            SeImpersonationState(
                tokenCtorArg = token,
                copyOnOpen = copyOnOpen,
                effectiveOnly = effectiveOnly,
                level = level,
            )
    }
}

public class SeSecurityDescriptor internal constructor(
    public var size: UInt,
    public var flags: UInt,
    securityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var securityDescriptor: PsecurityDescriptor = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        flags = 0u,
        securityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): PsecurityDescriptor = this.securityDescriptor

    public fun copy(size: UInt = this.size, flags: UInt = this.flags, securityDescriptor: PsecurityDescriptor = this.securityDescriptor): SeSecurityDescriptor = SeSecurityDescriptor(size = size, flags = flags, securityDescriptorCtorArg = securityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeSecurityDescriptor) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeSecurityDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeSecurityDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SeSecurityDescriptor =
                    SeSecurityDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SeSecurityDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.securityDescriptor)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            flags: UInt = 0u,
            securityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): SeSecurityDescriptor =
            SeSecurityDescriptor(
                size = size,
                flags = flags,
                securityDescriptorCtorArg = securityDescriptor,
            )
    }
}

public data class SeSid(
    public var sid: Sid = Sid(),
    public var buffer: UByteArray = UByteArray(68),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeSid) return false
        if (this.sid != other.sid) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sid.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class Sid(
    public var revision: UByte = 0u,
    public var subAuthorityCount: UByte = 0u,
    public var identifierAuthority: SidIdentifierAuthority = SidIdentifierAuthority(),
    public var subAuthority: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sid) return false
        if (this.revision != other.revision) return false
        if (this.subAuthorityCount != other.subAuthorityCount) return false
        if (this.identifierAuthority != other.identifierAuthority) return false
        if (!this.subAuthority.contentEquals(other.subAuthority)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.revision.hashCode()
        result = 31 * result + this.subAuthorityCount.hashCode()
        result = 31 * result + this.identifierAuthority.hashCode()
        result = 31 * result + this.subAuthority.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Sid =
                    Sid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (SidIdentifierAuthority.typeLayout()).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Sid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.subAuthorityCount)
                    (SidIdentifierAuthority.typeLayout()).writeNative(addr + 2L, value.identifierAuthority)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.subAuthority.toList())
                }
            }
    }
}

public class SidAndAttributes internal constructor(
    sidCtorArg: Psid,
    public var attributes: UInt,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        sidCtorArg = MutPtr(0L),
        attributes = 0u,
    )

    public operator fun component1(): Psid = this.sid

    public operator fun component2(): UInt = this.attributes

    public fun copy(sid: Psid = this.sid, attributes: UInt = this.attributes): SidAndAttributes = SidAndAttributes(sidCtorArg = sid, attributes = attributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SidAndAttributes) return false
        if (this.sid != other.sid) return false
        if (this.attributes != other.attributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sid.hashCode()
        result = 31 * result + this.attributes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SidAndAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SidAndAttributes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SidAndAttributes =
                    SidAndAttributes(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SidAndAttributes) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.sid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.attributes)
                }
            }

        public operator fun invoke(
            sid: Psid = MutPtr(0L),
            attributes: UInt = 0u,
        ): SidAndAttributes =
            SidAndAttributes(
                sidCtorArg = sid,
                attributes = attributes,
            )
    }
}

public class SidAndAttributesHash internal constructor(
    public var sidCount: UInt,
    sidAttrCtorArg: MutPtr<SidAndAttributes>,
    public var hash: IntArray,
) {
    public var sidAttr: MutPtr<SidAndAttributes> = sidAttrCtorArg
        internal set

    public constructor() : this(
        sidCount = 0u,
        sidAttrCtorArg = MutPtr(0L),
        hash = IntArray(32),
    )

    public operator fun component1(): UInt = this.sidCount

    public operator fun component2(): MutPtr<SidAndAttributes> = this.sidAttr

    public operator fun component3(): IntArray = this.hash

    public fun copy(sidCount: UInt = this.sidCount, sidAttr: MutPtr<SidAndAttributes> = this.sidAttr, hash: IntArray = this.hash): SidAndAttributesHash = SidAndAttributesHash(sidCount = sidCount, sidAttrCtorArg = sidAttr, hash = hash)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SidAndAttributesHash) return false
        if (this.sidCount != other.sidCount) return false
        if (this.sidAttr != other.sidAttr) return false
        if (!this.hash.contentEquals(other.hash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sidCount.hashCode()
        result = 31 * result + this.sidAttr.hashCode()
        result = 31 * result + this.hash.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SidAndAttributesHash> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SidAndAttributesHash> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): SidAndAttributesHash =
                    SidAndAttributesHash(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SidAndAttributes>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (32).toInt())
                        ).readNative(addr + 16L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: SidAndAttributesHash) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sidCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SidAndAttributes>(64)
                    ).writeNative(addr + 8L, value.sidAttr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (32).toInt())
                    ).writeNative(addr + 16L, value.hash.toList())
                }
            }

        public operator fun invoke(
            sidCount: UInt = 0u,
            sidAttr: MutPtr<SidAndAttributes> = MutPtr(0L),
            hash: IntArray = IntArray(32),
        ): SidAndAttributesHash =
            SidAndAttributesHash(
                sidCount = sidCount,
                sidAttrCtorArg = sidAttr,
                hash = hash,
            )
    }
}

public data class SidIdentifierAuthority(
    public var value: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SidIdentifierAuthority) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SidIdentifierAuthority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SidIdentifierAuthority> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): SidIdentifierAuthority =
                    SidIdentifierAuthority(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SidIdentifierAuthority) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.value.toList())
                }
            }
    }
}

public data class SystemAccessFilterAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemAccessFilterAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemAccessFilterAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SystemAccessFilterAce =
                    SystemAccessFilterAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemAccessFilterAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class SystemAlarmAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemAlarmAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemAlarmAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SystemAlarmAce =
                    SystemAlarmAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemAlarmAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class SystemAlarmCallbackAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemAlarmCallbackAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemAlarmCallbackAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SystemAlarmCallbackAce =
                    SystemAlarmCallbackAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemAlarmCallbackAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class SystemAlarmCallbackObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class SystemAlarmObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: UInt = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class SystemAuditAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemAuditAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemAuditAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SystemAuditAce =
                    SystemAuditAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemAuditAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class SystemAuditCallbackAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemAuditCallbackAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemAuditCallbackAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SystemAuditCallbackAce =
                    SystemAuditCallbackAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemAuditCallbackAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class SystemAuditCallbackObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class SystemAuditObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class SystemMandatoryLabelAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemMandatoryLabelAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemMandatoryLabelAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SystemMandatoryLabelAce =
                    SystemMandatoryLabelAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemMandatoryLabelAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class SystemProcessTrustLabelAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemProcessTrustLabelAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemProcessTrustLabelAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SystemProcessTrustLabelAce =
                    SystemProcessTrustLabelAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemProcessTrustLabelAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class SystemResourceAttributeAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemResourceAttributeAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemResourceAttributeAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SystemResourceAttributeAce =
                    SystemResourceAttributeAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemResourceAttributeAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public data class SystemScopedPolicyIdAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemScopedPolicyIdAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemScopedPolicyIdAce> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SystemScopedPolicyIdAce =
                    SystemScopedPolicyIdAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemScopedPolicyIdAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public class TokenAccessInformation internal constructor(
    sidHashCtorArg: MutPtr<SidAndAttributesHash>,
    restrictedSidHashCtorArg: MutPtr<SidAndAttributesHash>,
    privilegesCtorArg: MutPtr<TokenPrivileges>,
    public var authenticationId: Luid,
    public var tokenType: TokenType,
    public var impersonationLevel: SecurityImpersonationLevel,
    public var mandatoryPolicy: TokenMandatoryPolicy,
    public var flags: UInt,
    public var appContainerNumber: UInt,
    packageSidCtorArg: Psid,
    capabilitiesHashCtorArg: MutPtr<SidAndAttributesHash>,
    trustLevelSidCtorArg: Psid,
    securityAttributesCtorArg: MutPtr<CVoid>,
) {
    public var sidHash: MutPtr<SidAndAttributesHash> = sidHashCtorArg
        internal set

    public var restrictedSidHash: MutPtr<SidAndAttributesHash> = restrictedSidHashCtorArg
        internal set

    public var privileges: MutPtr<TokenPrivileges> = privilegesCtorArg
        internal set

    public var packageSid: Psid = packageSidCtorArg
        internal set

    public var capabilitiesHash: MutPtr<SidAndAttributesHash> = capabilitiesHashCtorArg
        internal set

    public var trustLevelSid: Psid = trustLevelSidCtorArg
        internal set

    public var securityAttributes: MutPtr<CVoid> = securityAttributesCtorArg
        internal set

    public constructor() : this(
        sidHashCtorArg = MutPtr(0L),
        restrictedSidHashCtorArg = MutPtr(0L),
        privilegesCtorArg = MutPtr(0L),
        authenticationId = Luid(),
        tokenType = 0,
        impersonationLevel = 0,
        mandatoryPolicy = TokenMandatoryPolicy(),
        flags = 0u,
        appContainerNumber = 0u,
        packageSidCtorArg = MutPtr(0L),
        capabilitiesHashCtorArg = MutPtr(0L),
        trustLevelSidCtorArg = MutPtr(0L),
        securityAttributesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<SidAndAttributesHash> = this.sidHash

    public operator fun component2(): MutPtr<SidAndAttributesHash> = this.restrictedSidHash

    public operator fun component3(): MutPtr<TokenPrivileges> = this.privileges

    public operator fun component4(): Luid = this.authenticationId

    public operator fun component5(): TokenType = this.tokenType

    public operator fun component6(): SecurityImpersonationLevel = this.impersonationLevel

    public operator fun component7(): TokenMandatoryPolicy = this.mandatoryPolicy

    public operator fun component8(): UInt = this.flags

    public operator fun component9(): UInt = this.appContainerNumber

    public operator fun component10(): Psid = this.packageSid

    public operator fun component11(): MutPtr<SidAndAttributesHash> = this.capabilitiesHash

    public operator fun component12(): Psid = this.trustLevelSid

    public operator fun component13(): MutPtr<CVoid> = this.securityAttributes

    public fun copy(sidHash: MutPtr<SidAndAttributesHash> = this.sidHash, restrictedSidHash: MutPtr<SidAndAttributesHash> = this.restrictedSidHash, privileges: MutPtr<TokenPrivileges> = this.privileges, authenticationId: Luid = this.authenticationId, tokenType: TokenType = this.tokenType, impersonationLevel: SecurityImpersonationLevel = this.impersonationLevel, mandatoryPolicy: TokenMandatoryPolicy = this.mandatoryPolicy, flags: UInt = this.flags, appContainerNumber: UInt = this.appContainerNumber, packageSid: Psid = this.packageSid, capabilitiesHash: MutPtr<SidAndAttributesHash> = this.capabilitiesHash, trustLevelSid: Psid = this.trustLevelSid, securityAttributes: MutPtr<CVoid> = this.securityAttributes): TokenAccessInformation = TokenAccessInformation(sidHashCtorArg = sidHash, restrictedSidHashCtorArg = restrictedSidHash, privilegesCtorArg = privileges, authenticationId = authenticationId, tokenType = tokenType, impersonationLevel = impersonationLevel, mandatoryPolicy = mandatoryPolicy, flags = flags, appContainerNumber = appContainerNumber, packageSidCtorArg = packageSid, capabilitiesHashCtorArg = capabilitiesHash, trustLevelSidCtorArg = trustLevelSid, securityAttributesCtorArg = securityAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenAccessInformation) return false
        if (this.sidHash != other.sidHash) return false
        if (this.restrictedSidHash != other.restrictedSidHash) return false
        if (this.privileges != other.privileges) return false
        if (this.authenticationId != other.authenticationId) return false
        if (this.tokenType != other.tokenType) return false
        if (this.impersonationLevel != other.impersonationLevel) return false
        if (this.mandatoryPolicy != other.mandatoryPolicy) return false
        if (this.flags != other.flags) return false
        if (this.appContainerNumber != other.appContainerNumber) return false
        if (this.packageSid != other.packageSid) return false
        if (this.capabilitiesHash != other.capabilitiesHash) return false
        if (this.trustLevelSid != other.trustLevelSid) return false
        if (this.securityAttributes != other.securityAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sidHash.hashCode()
        result = 31 * result + this.restrictedSidHash.hashCode()
        result = 31 * result + this.privileges.hashCode()
        result = 31 * result + this.authenticationId.hashCode()
        result = 31 * result + this.tokenType.hashCode()
        result = 31 * result + this.impersonationLevel.hashCode()
        result = 31 * result + this.mandatoryPolicy.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.appContainerNumber.hashCode()
        result = 31 * result + this.packageSid.hashCode()
        result = 31 * result + this.capabilitiesHash.hashCode()
        result = 31 * result + this.trustLevelSid.hashCode()
        result = 31 * result + this.securityAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sidHash: MutPtr<SidAndAttributesHash> = MutPtr(0L),
            restrictedSidHash: MutPtr<SidAndAttributesHash> = MutPtr(0L),
            privileges: MutPtr<TokenPrivileges> = MutPtr(0L),
            authenticationId: Luid = Luid(),
            tokenType: TokenType = 0,
            impersonationLevel: SecurityImpersonationLevel = 0,
            mandatoryPolicy: TokenMandatoryPolicy = TokenMandatoryPolicy(),
            flags: UInt = 0u,
            appContainerNumber: UInt = 0u,
            packageSid: Psid = MutPtr(0L),
            capabilitiesHash: MutPtr<SidAndAttributesHash> = MutPtr(0L),
            trustLevelSid: Psid = MutPtr(0L),
            securityAttributes: MutPtr<CVoid> = MutPtr(0L),
        ): TokenAccessInformation =
            TokenAccessInformation(
                sidHashCtorArg = sidHash,
                restrictedSidHashCtorArg = restrictedSidHash,
                privilegesCtorArg = privileges,
                authenticationId = authenticationId,
                tokenType = tokenType,
                impersonationLevel = impersonationLevel,
                mandatoryPolicy = mandatoryPolicy,
                flags = flags,
                appContainerNumber = appContainerNumber,
                packageSidCtorArg = packageSid,
                capabilitiesHashCtorArg = capabilitiesHash,
                trustLevelSidCtorArg = trustLevelSid,
                securityAttributesCtorArg = securityAttributes,
            )
    }
}

public class TokenAppcontainerInformation internal constructor(
    tokenAppContainerCtorArg: Psid,
) {
    public var tokenAppContainer: Psid = tokenAppContainerCtorArg
        internal set

    public constructor() : this(
        tokenAppContainerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Psid = this.tokenAppContainer

    public fun copy(tokenAppContainer: Psid = this.tokenAppContainer): TokenAppcontainerInformation = TokenAppcontainerInformation(tokenAppContainerCtorArg = tokenAppContainer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenAppcontainerInformation) return false
        if (this.tokenAppContainer != other.tokenAppContainer) return false
        return true
    }

    override fun hashCode(): Int = this.tokenAppContainer.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenAppcontainerInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenAppcontainerInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TokenAppcontainerInformation =
                    TokenAppcontainerInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenAppcontainerInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.tokenAppContainer)
                }
            }

        public operator fun invoke(
            tokenAppContainer: Psid = MutPtr(0L),
        ): TokenAppcontainerInformation =
            TokenAppcontainerInformation(
                tokenAppContainerCtorArg = tokenAppContainer,
            )
    }
}

public data class TokenAuditPolicy(
    public var perUserPolicy: UByteArray = UByteArray(30),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenAuditPolicy) return false
        if (!this.perUserPolicy.contentEquals(other.perUserPolicy)) return false
        return true
    }

    override fun hashCode(): Int = this.perUserPolicy.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenAuditPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenAuditPolicy> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 30L
                override fun readNative(addr: Long): TokenAuditPolicy =
                    TokenAuditPolicy(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (30).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: TokenAuditPolicy) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (30).toInt())
                    ).writeNative(addr, value.perUserPolicy.toList())
                }
            }
    }
}

public data class TokenControl(
    public var tokenId: Luid = Luid(),
    public var authenticationId: Luid = Luid(),
    public var modifiedId: Luid = Luid(),
    public var tokenSource: TokenSource = TokenSource(),
)

public class TokenDefaultDacl internal constructor(
    defaultDaclCtorArg: MutPtr<Acl>,
) {
    public var defaultDacl: MutPtr<Acl> = defaultDaclCtorArg
        internal set

    public constructor() : this(
        defaultDaclCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Acl> = this.defaultDacl

    public fun copy(defaultDacl: MutPtr<Acl> = this.defaultDacl): TokenDefaultDacl = TokenDefaultDacl(defaultDaclCtorArg = defaultDacl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenDefaultDacl) return false
        if (this.defaultDacl != other.defaultDacl) return false
        return true
    }

    override fun hashCode(): Int = this.defaultDacl.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenDefaultDacl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenDefaultDacl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TokenDefaultDacl =
                    TokenDefaultDacl(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Acl>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenDefaultDacl) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Acl>(64)
                    ).writeNative(addr, value.defaultDacl)
                }
            }

        public operator fun invoke(
            defaultDacl: MutPtr<Acl> = MutPtr(0L),
        ): TokenDefaultDacl =
            TokenDefaultDacl(
                defaultDaclCtorArg = defaultDacl,
            )
    }
}

public class TokenDeviceClaims internal constructor(
    deviceClaimsCtorArg: MutPtr<CVoid>,
) {
    public var deviceClaims: MutPtr<CVoid> = deviceClaimsCtorArg
        internal set

    public constructor() : this(
        deviceClaimsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.deviceClaims

    public fun copy(deviceClaims: MutPtr<CVoid> = this.deviceClaims): TokenDeviceClaims = TokenDeviceClaims(deviceClaimsCtorArg = deviceClaims)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenDeviceClaims) return false
        if (this.deviceClaims != other.deviceClaims) return false
        return true
    }

    override fun hashCode(): Int = this.deviceClaims.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenDeviceClaims> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenDeviceClaims> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TokenDeviceClaims =
                    TokenDeviceClaims(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenDeviceClaims) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.deviceClaims)
                }
            }

        public operator fun invoke(
            deviceClaims: MutPtr<CVoid> = MutPtr(0L),
        ): TokenDeviceClaims =
            TokenDeviceClaims(
                deviceClaimsCtorArg = deviceClaims,
            )
    }
}

public data class TokenElevation(
    public var tokenIsElevated: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenElevation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenElevation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TokenElevation =
                    TokenElevation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenElevation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tokenIsElevated)
                }
            }
    }
}

public data class TokenGroups(
    public var groupCount: UInt = 0u,
    public var groups: List<SidAndAttributes> = List(1) { SidAndAttributes() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenGroups> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenGroups> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): TokenGroups =
                    TokenGroups(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SidAndAttributes.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TokenGroups) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.groupCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SidAndAttributes.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.groups)
                }
            }
    }
}

public class TokenGroupsAndPrivileges internal constructor(
    public var sidCount: UInt,
    public var sidLength: UInt,
    sidsCtorArg: MutPtr<SidAndAttributes>,
    public var restrictedSidCount: UInt,
    public var restrictedSidLength: UInt,
    restrictedSidsCtorArg: MutPtr<SidAndAttributes>,
    public var privilegeCount: UInt,
    public var privilegeLength: UInt,
    privilegesCtorArg: MutPtr<LuidAndAttributes>,
    public var authenticationId: Luid,
) {
    public var sids: MutPtr<SidAndAttributes> = sidsCtorArg
        internal set

    public var restrictedSids: MutPtr<SidAndAttributes> = restrictedSidsCtorArg
        internal set

    public var privileges: MutPtr<LuidAndAttributes> = privilegesCtorArg
        internal set

    public constructor() : this(
        sidCount = 0u,
        sidLength = 0u,
        sidsCtorArg = MutPtr(0L),
        restrictedSidCount = 0u,
        restrictedSidLength = 0u,
        restrictedSidsCtorArg = MutPtr(0L),
        privilegeCount = 0u,
        privilegeLength = 0u,
        privilegesCtorArg = MutPtr(0L),
        authenticationId = Luid(),
    )

    public operator fun component1(): UInt = this.sidCount

    public operator fun component2(): UInt = this.sidLength

    public operator fun component3(): MutPtr<SidAndAttributes> = this.sids

    public operator fun component4(): UInt = this.restrictedSidCount

    public operator fun component5(): UInt = this.restrictedSidLength

    public operator fun component6(): MutPtr<SidAndAttributes> = this.restrictedSids

    public operator fun component7(): UInt = this.privilegeCount

    public operator fun component8(): UInt = this.privilegeLength

    public operator fun component9(): MutPtr<LuidAndAttributes> = this.privileges

    public operator fun component10(): Luid = this.authenticationId

    public fun copy(sidCount: UInt = this.sidCount, sidLength: UInt = this.sidLength, sids: MutPtr<SidAndAttributes> = this.sids, restrictedSidCount: UInt = this.restrictedSidCount, restrictedSidLength: UInt = this.restrictedSidLength, restrictedSids: MutPtr<SidAndAttributes> = this.restrictedSids, privilegeCount: UInt = this.privilegeCount, privilegeLength: UInt = this.privilegeLength, privileges: MutPtr<LuidAndAttributes> = this.privileges, authenticationId: Luid = this.authenticationId): TokenGroupsAndPrivileges = TokenGroupsAndPrivileges(sidCount = sidCount, sidLength = sidLength, sidsCtorArg = sids, restrictedSidCount = restrictedSidCount, restrictedSidLength = restrictedSidLength, restrictedSidsCtorArg = restrictedSids, privilegeCount = privilegeCount, privilegeLength = privilegeLength, privilegesCtorArg = privileges, authenticationId = authenticationId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenGroupsAndPrivileges) return false
        if (this.sidCount != other.sidCount) return false
        if (this.sidLength != other.sidLength) return false
        if (this.sids != other.sids) return false
        if (this.restrictedSidCount != other.restrictedSidCount) return false
        if (this.restrictedSidLength != other.restrictedSidLength) return false
        if (this.restrictedSids != other.restrictedSids) return false
        if (this.privilegeCount != other.privilegeCount) return false
        if (this.privilegeLength != other.privilegeLength) return false
        if (this.privileges != other.privileges) return false
        if (this.authenticationId != other.authenticationId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sidCount.hashCode()
        result = 31 * result + this.sidLength.hashCode()
        result = 31 * result + this.sids.hashCode()
        result = 31 * result + this.restrictedSidCount.hashCode()
        result = 31 * result + this.restrictedSidLength.hashCode()
        result = 31 * result + this.restrictedSids.hashCode()
        result = 31 * result + this.privilegeCount.hashCode()
        result = 31 * result + this.privilegeLength.hashCode()
        result = 31 * result + this.privileges.hashCode()
        result = 31 * result + this.authenticationId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sidCount: UInt = 0u,
            sidLength: UInt = 0u,
            sids: MutPtr<SidAndAttributes> = MutPtr(0L),
            restrictedSidCount: UInt = 0u,
            restrictedSidLength: UInt = 0u,
            restrictedSids: MutPtr<SidAndAttributes> = MutPtr(0L),
            privilegeCount: UInt = 0u,
            privilegeLength: UInt = 0u,
            privileges: MutPtr<LuidAndAttributes> = MutPtr(0L),
            authenticationId: Luid = Luid(),
        ): TokenGroupsAndPrivileges =
            TokenGroupsAndPrivileges(
                sidCount = sidCount,
                sidLength = sidLength,
                sidsCtorArg = sids,
                restrictedSidCount = restrictedSidCount,
                restrictedSidLength = restrictedSidLength,
                restrictedSidsCtorArg = restrictedSids,
                privilegeCount = privilegeCount,
                privilegeLength = privilegeLength,
                privilegesCtorArg = privileges,
                authenticationId = authenticationId,
            )
    }
}

public class TokenLinkedToken internal constructor(
    linkedTokenCtorArg: Handle,
) {
    public var linkedToken: Handle = linkedTokenCtorArg
        internal set

    public constructor() : this(
        linkedTokenCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.linkedToken

    public fun copy(linkedToken: Handle = this.linkedToken): TokenLinkedToken = TokenLinkedToken(linkedTokenCtorArg = linkedToken)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenLinkedToken) return false
        if (this.linkedToken != other.linkedToken) return false
        return true
    }

    override fun hashCode(): Int = this.linkedToken.hashCode()

    public companion object {
        public operator fun invoke(
            linkedToken: Handle = MutPtr(0L),
        ): TokenLinkedToken =
            TokenLinkedToken(
                linkedTokenCtorArg = linkedToken,
            )
    }
}

public data class TokenMandatoryLabel(
    public var label: SidAndAttributes = SidAndAttributes(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenMandatoryLabel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenMandatoryLabel> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TokenMandatoryLabel =
                    TokenMandatoryLabel(
                        (SidAndAttributes.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenMandatoryLabel) {
                    (SidAndAttributes.typeLayout()).writeNative(addr, value.label)
                }
            }
    }
}

public data class TokenMandatoryPolicy(
    public var policy: TokenMandatoryPolicyId = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenMandatoryPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenMandatoryPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TokenMandatoryPolicy =
                    TokenMandatoryPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenMandatoryPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.policy)
                }
            }
    }
}

public data class TokenOrigin(
    public var originatingLogonSession: Luid = Luid(),
)

public class TokenOwner internal constructor(
    ownerCtorArg: Psid,
) {
    public var owner: Psid = ownerCtorArg
        internal set

    public constructor() : this(
        ownerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Psid = this.owner

    public fun copy(owner: Psid = this.owner): TokenOwner = TokenOwner(ownerCtorArg = owner)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenOwner) return false
        if (this.owner != other.owner) return false
        return true
    }

    override fun hashCode(): Int = this.owner.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenOwner> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenOwner> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TokenOwner =
                    TokenOwner(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenOwner) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.owner)
                }
            }

        public operator fun invoke(
            owner: Psid = MutPtr(0L),
        ): TokenOwner =
            TokenOwner(
                ownerCtorArg = owner,
            )
    }
}

public class TokenPrimaryGroup internal constructor(
    primaryGroupCtorArg: Psid,
) {
    public var primaryGroup: Psid = primaryGroupCtorArg
        internal set

    public constructor() : this(
        primaryGroupCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Psid = this.primaryGroup

    public fun copy(primaryGroup: Psid = this.primaryGroup): TokenPrimaryGroup = TokenPrimaryGroup(primaryGroupCtorArg = primaryGroup)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenPrimaryGroup) return false
        if (this.primaryGroup != other.primaryGroup) return false
        return true
    }

    override fun hashCode(): Int = this.primaryGroup.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenPrimaryGroup> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenPrimaryGroup> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TokenPrimaryGroup =
                    TokenPrimaryGroup(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenPrimaryGroup) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.primaryGroup)
                }
            }

        public operator fun invoke(
            primaryGroup: Psid = MutPtr(0L),
        ): TokenPrimaryGroup =
            TokenPrimaryGroup(
                primaryGroupCtorArg = primaryGroup,
            )
    }
}

public data class TokenPrivileges(
    public var privilegeCount: UInt = 0u,
    public var privileges: List<LuidAndAttributes> = List(1) { LuidAndAttributes() },
)

public data class TokenSource(
    public var sourceName: ByteArray = ByteArray(8),
    public var sourceIdentifier: Luid = Luid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenSource) return false
        if (!this.sourceName.contentEquals(other.sourceName)) return false
        if (this.sourceIdentifier != other.sourceIdentifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sourceName.contentHashCode()
        result = 31 * result + this.sourceIdentifier.hashCode()
        return result
    }
}

public data class TokenStatistics(
    public var tokenId: Luid = Luid(),
    public var authenticationId: Luid = Luid(),
    public var expirationTime: Long = 0L,
    public var tokenType: TokenType = 0,
    public var impersonationLevel: SecurityImpersonationLevel = 0,
    public var dynamicCharged: UInt = 0u,
    public var dynamicAvailable: UInt = 0u,
    public var groupCount: UInt = 0u,
    public var privilegeCount: UInt = 0u,
    public var modifiedId: Luid = Luid(),
)

public data class TokenUser(
    public var user: SidAndAttributes = SidAndAttributes(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenUser> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenUser> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TokenUser =
                    TokenUser(
                        (SidAndAttributes.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenUser) {
                    (SidAndAttributes.typeLayout()).writeNative(addr, value.user)
                }
            }
    }
}

public class TokenUserClaims internal constructor(
    userClaimsCtorArg: MutPtr<CVoid>,
) {
    public var userClaims: MutPtr<CVoid> = userClaimsCtorArg
        internal set

    public constructor() : this(
        userClaimsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.userClaims

    public fun copy(userClaims: MutPtr<CVoid> = this.userClaims): TokenUserClaims = TokenUserClaims(userClaimsCtorArg = userClaims)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenUserClaims) return false
        if (this.userClaims != other.userClaims) return false
        return true
    }

    override fun hashCode(): Int = this.userClaims.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenUserClaims> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenUserClaims> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TokenUserClaims =
                    TokenUserClaims(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenUserClaims) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.userClaims)
                }
            }

        public operator fun invoke(
            userClaims: MutPtr<CVoid> = MutPtr(0L),
        ): TokenUserClaims =
            TokenUserClaims(
                userClaimsCtorArg = userClaims,
            )
    }
}
