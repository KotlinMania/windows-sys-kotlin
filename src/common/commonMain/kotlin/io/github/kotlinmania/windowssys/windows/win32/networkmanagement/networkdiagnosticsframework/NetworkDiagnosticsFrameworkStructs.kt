package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public data class DiagSockaddr(
    public var family: UShort = 0u,
    public var data: ByteArray = ByteArray(126),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiagSockaddr) return false
        if (this.family != other.family) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.family.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagSockaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagSockaddr> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): DiagSockaddr =
                    DiagSockaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (126).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: DiagSockaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.family)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (126).toInt())
                    ).writeNative(addr + 2L, value.data)
                }
            }
    }
}

public data class DiagnosticsInfo(
    public var cost: Int = 0,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticsInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DiagnosticsInfo =
                    DiagnosticsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DiagnosticsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public class HelperAttribute internal constructor(
    pwszNameCtorArg: Pwstr,
    public var type: AttributeType,
    public var anonymous: HelperAttribute0,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public constructor() : this(
        pwszNameCtorArg = MutPtr(0L),
        type = 0,
        anonymous = HelperAttribute0(),
    )

    public operator fun component1(): Pwstr = this.pwszName

    public operator fun component2(): AttributeType = this.type

    public operator fun component3(): HelperAttribute0 = this.anonymous

    public fun copy(pwszName: Pwstr = this.pwszName, type: AttributeType = this.type, anonymous: HelperAttribute0 = this.anonymous): HelperAttribute = HelperAttribute(pwszNameCtorArg = pwszName, type = type, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HelperAttribute) return false
        if (this.pwszName != other.pwszName) return false
        if (this.type != other.type) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszName.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszName: Pwstr = MutPtr(0L),
            type: AttributeType = 0,
            anonymous: HelperAttribute0 = HelperAttribute0(),
        ): HelperAttribute =
            HelperAttribute(
                pwszNameCtorArg = pwszName,
                type = type,
                anonymous = anonymous,
            )
    }
}

public class HelperAttribute0 internal constructor(
    public var boolean: Bool,
    public var char: UByte,
    public var byte: UByte,
    public var short: Short,
    public var word: UShort,
    public var int: Int,
    public var dWord: UInt,
    public var int64: Long,
    public var uInt64: ULong,
    pWStrCtorArg: Pwstr,
    public var guid: Guid,
    public var lifeTime: LifeTime,
    public var address: DiagSockaddr,
    public var octetString: OctetString,
) {
    public var pWStr: Pwstr = pWStrCtorArg
        internal set

    public constructor() : this(
        boolean = 0,
        char = 0u,
        byte = 0u,
        short = 0,
        word = 0u,
        int = 0,
        dWord = 0u,
        int64 = 0L,
        uInt64 = 0uL,
        pWStrCtorArg = MutPtr(0L),
        guid = Guid(),
        lifeTime = LifeTime(),
        address = DiagSockaddr(),
        octetString = OctetString(),
    )

    public operator fun component1(): Bool = this.boolean

    public operator fun component2(): UByte = this.char

    public operator fun component3(): UByte = this.byte

    public operator fun component4(): Short = this.short

    public operator fun component5(): UShort = this.word

    public operator fun component6(): Int = this.int

    public operator fun component7(): UInt = this.dWord

    public operator fun component8(): Long = this.int64

    public operator fun component9(): ULong = this.uInt64

    public operator fun component10(): Pwstr = this.pWStr

    public operator fun component11(): Guid = this.guid

    public operator fun component12(): LifeTime = this.lifeTime

    public operator fun component13(): DiagSockaddr = this.address

    public operator fun component14(): OctetString = this.octetString

    public fun copy(boolean: Bool = this.boolean, char: UByte = this.char, byte: UByte = this.byte, short: Short = this.short, word: UShort = this.word, int: Int = this.int, dWord: UInt = this.dWord, int64: Long = this.int64, uInt64: ULong = this.uInt64, pWStr: Pwstr = this.pWStr, guid: Guid = this.guid, lifeTime: LifeTime = this.lifeTime, address: DiagSockaddr = this.address, octetString: OctetString = this.octetString): HelperAttribute0 = HelperAttribute0(boolean = boolean, char = char, byte = byte, short = short, word = word, int = int, dWord = dWord, int64 = int64, uInt64 = uInt64, pWStrCtorArg = pWStr, guid = guid, lifeTime = lifeTime, address = address, octetString = octetString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HelperAttribute0) return false
        if (this.boolean != other.boolean) return false
        if (this.char != other.char) return false
        if (this.byte != other.byte) return false
        if (this.short != other.short) return false
        if (this.word != other.word) return false
        if (this.int != other.int) return false
        if (this.dWord != other.dWord) return false
        if (this.int64 != other.int64) return false
        if (this.uInt64 != other.uInt64) return false
        if (this.pWStr != other.pWStr) return false
        if (this.guid != other.guid) return false
        if (this.lifeTime != other.lifeTime) return false
        if (this.address != other.address) return false
        if (this.octetString != other.octetString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.boolean.hashCode()
        result = 31 * result + this.char.hashCode()
        result = 31 * result + this.byte.hashCode()
        result = 31 * result + this.short.hashCode()
        result = 31 * result + this.word.hashCode()
        result = 31 * result + this.int.hashCode()
        result = 31 * result + this.dWord.hashCode()
        result = 31 * result + this.int64.hashCode()
        result = 31 * result + this.uInt64.hashCode()
        result = 31 * result + this.pWStr.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.lifeTime.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.octetString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            boolean: Bool = 0,
            char: UByte = 0u,
            byte: UByte = 0u,
            short: Short = 0,
            word: UShort = 0u,
            int: Int = 0,
            dWord: UInt = 0u,
            int64: Long = 0L,
            uInt64: ULong = 0uL,
            pWStr: Pwstr = MutPtr(0L),
            guid: Guid = Guid(),
            lifeTime: LifeTime = LifeTime(),
            address: DiagSockaddr = DiagSockaddr(),
            octetString: OctetString = OctetString(),
        ): HelperAttribute0 =
            HelperAttribute0(
                boolean = boolean,
                char = char,
                byte = byte,
                short = short,
                word = word,
                int = int,
                dWord = dWord,
                int64 = int64,
                uInt64 = uInt64,
                pWStrCtorArg = pWStr,
                guid = guid,
                lifeTime = lifeTime,
                address = address,
                octetString = octetString,
            )
    }
}

public class Hypothesis internal constructor(
    pwszClassNameCtorArg: Pwstr,
    pwszDescriptionCtorArg: Pwstr,
    public var celt: UInt,
    rgAttributesCtorArg: MutPtr<HelperAttribute>,
) {
    public var pwszClassName: Pwstr = pwszClassNameCtorArg
        internal set

    public var pwszDescription: Pwstr = pwszDescriptionCtorArg
        internal set

    public var rgAttributes: MutPtr<HelperAttribute> = rgAttributesCtorArg
        internal set

    public constructor() : this(
        pwszClassNameCtorArg = MutPtr(0L),
        pwszDescriptionCtorArg = MutPtr(0L),
        celt = 0u,
        rgAttributesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszClassName

    public operator fun component2(): Pwstr = this.pwszDescription

    public operator fun component3(): UInt = this.celt

    public operator fun component4(): MutPtr<HelperAttribute> = this.rgAttributes

    public fun copy(pwszClassName: Pwstr = this.pwszClassName, pwszDescription: Pwstr = this.pwszDescription, celt: UInt = this.celt, rgAttributes: MutPtr<HelperAttribute> = this.rgAttributes): Hypothesis = Hypothesis(pwszClassNameCtorArg = pwszClassName, pwszDescriptionCtorArg = pwszDescription, celt = celt, rgAttributesCtorArg = rgAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hypothesis) return false
        if (this.pwszClassName != other.pwszClassName) return false
        if (this.pwszDescription != other.pwszDescription) return false
        if (this.celt != other.celt) return false
        if (this.rgAttributes != other.rgAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszClassName.hashCode()
        result = 31 * result + this.pwszDescription.hashCode()
        result = 31 * result + this.celt.hashCode()
        result = 31 * result + this.rgAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszClassName: Pwstr = MutPtr(0L),
            pwszDescription: Pwstr = MutPtr(0L),
            celt: UInt = 0u,
            rgAttributes: MutPtr<HelperAttribute> = MutPtr(0L),
        ): Hypothesis =
            Hypothesis(
                pwszClassNameCtorArg = pwszClassName,
                pwszDescriptionCtorArg = pwszDescription,
                celt = celt,
                rgAttributesCtorArg = rgAttributes,
            )
    }
}

public class HelperAttributeInfo internal constructor(
    pwszNameCtorArg: Pwstr,
    public var type: AttributeType,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public constructor() : this(
        pwszNameCtorArg = MutPtr(0L),
        type = 0,
    )

    public operator fun component1(): Pwstr = this.pwszName

    public operator fun component2(): AttributeType = this.type

    public fun copy(pwszName: Pwstr = this.pwszName, type: AttributeType = this.type): HelperAttributeInfo = HelperAttributeInfo(pwszNameCtorArg = pwszName, type = type)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HelperAttributeInfo) return false
        if (this.pwszName != other.pwszName) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszName.hashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszName: Pwstr = MutPtr(0L),
            type: AttributeType = 0,
        ): HelperAttributeInfo =
            HelperAttributeInfo(
                pwszNameCtorArg = pwszName,
                type = type,
            )
    }
}

public data class HypothesisResult(
    public var hypothesis: Hypothesis = Hypothesis(),
    public var pathStatus: DiagnosisStatus = 0,
)

public data class LifeTime(
    public var startTime: Filetime = Filetime(),
    public var endTime: Filetime = Filetime(),
)

public class OctetString internal constructor(
    public var dwLength: UInt,
    lpValueCtorArg: MutPtr<UByte>,
) {
    public var lpValue: MutPtr<UByte> = lpValueCtorArg
        internal set

    public constructor() : this(
        dwLength = 0u,
        lpValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwLength

    public operator fun component2(): MutPtr<UByte> = this.lpValue

    public fun copy(dwLength: UInt = this.dwLength, lpValue: MutPtr<UByte> = this.lpValue): OctetString = OctetString(dwLength = dwLength, lpValueCtorArg = lpValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OctetString) return false
        if (this.dwLength != other.dwLength) return false
        if (this.lpValue != other.lpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.lpValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OctetString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OctetString> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): OctetString =
                    OctetString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: OctetString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.lpValue)
                }
            }

        public operator fun invoke(
            dwLength: UInt = 0u,
            lpValue: MutPtr<UByte> = MutPtr(0L),
        ): OctetString =
            OctetString(
                dwLength = dwLength,
                lpValueCtorArg = lpValue,
            )
    }
}

public class RepairInfo internal constructor(
    public var guid: Guid,
    pwszClassNameCtorArg: Pwstr,
    pwszDescriptionCtorArg: Pwstr,
    public var sidType: UInt,
    public var cost: Int,
    public var flags: UInt,
    public var scope: RepairScope,
    public var risk: RepairRisk,
    public var uiInfo: UiInfo,
    public var rootCauseIndex: Int,
) {
    public var pwszClassName: Pwstr = pwszClassNameCtorArg
        internal set

    public var pwszDescription: Pwstr = pwszDescriptionCtorArg
        internal set

    public constructor() : this(
        guid = Guid(),
        pwszClassNameCtorArg = MutPtr(0L),
        pwszDescriptionCtorArg = MutPtr(0L),
        sidType = 0u,
        cost = 0,
        flags = 0u,
        scope = 0,
        risk = 0,
        uiInfo = UiInfo(),
        rootCauseIndex = 0,
    )

    public operator fun component1(): Guid = this.guid

    public operator fun component2(): Pwstr = this.pwszClassName

    public operator fun component3(): Pwstr = this.pwszDescription

    public operator fun component4(): UInt = this.sidType

    public operator fun component5(): Int = this.cost

    public operator fun component6(): UInt = this.flags

    public operator fun component7(): RepairScope = this.scope

    public operator fun component8(): RepairRisk = this.risk

    public operator fun component9(): UiInfo = this.uiInfo

    public operator fun component10(): Int = this.rootCauseIndex

    public fun copy(guid: Guid = this.guid, pwszClassName: Pwstr = this.pwszClassName, pwszDescription: Pwstr = this.pwszDescription, sidType: UInt = this.sidType, cost: Int = this.cost, flags: UInt = this.flags, scope: RepairScope = this.scope, risk: RepairRisk = this.risk, uiInfo: UiInfo = this.uiInfo, rootCauseIndex: Int = this.rootCauseIndex): RepairInfo = RepairInfo(guid = guid, pwszClassNameCtorArg = pwszClassName, pwszDescriptionCtorArg = pwszDescription, sidType = sidType, cost = cost, flags = flags, scope = scope, risk = risk, uiInfo = uiInfo, rootCauseIndex = rootCauseIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RepairInfo) return false
        if (this.guid != other.guid) return false
        if (this.pwszClassName != other.pwszClassName) return false
        if (this.pwszDescription != other.pwszDescription) return false
        if (this.sidType != other.sidType) return false
        if (this.cost != other.cost) return false
        if (this.flags != other.flags) return false
        if (this.scope != other.scope) return false
        if (this.risk != other.risk) return false
        if (this.uiInfo != other.uiInfo) return false
        if (this.rootCauseIndex != other.rootCauseIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guid.hashCode()
        result = 31 * result + this.pwszClassName.hashCode()
        result = 31 * result + this.pwszDescription.hashCode()
        result = 31 * result + this.sidType.hashCode()
        result = 31 * result + this.cost.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.scope.hashCode()
        result = 31 * result + this.risk.hashCode()
        result = 31 * result + this.uiInfo.hashCode()
        result = 31 * result + this.rootCauseIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guid: Guid = Guid(),
            pwszClassName: Pwstr = MutPtr(0L),
            pwszDescription: Pwstr = MutPtr(0L),
            sidType: UInt = 0u,
            cost: Int = 0,
            flags: UInt = 0u,
            scope: RepairScope = 0,
            risk: RepairRisk = 0,
            uiInfo: UiInfo = UiInfo(),
            rootCauseIndex: Int = 0,
        ): RepairInfo =
            RepairInfo(
                guid = guid,
                pwszClassNameCtorArg = pwszClassName,
                pwszDescriptionCtorArg = pwszDescription,
                sidType = sidType,
                cost = cost,
                flags = flags,
                scope = scope,
                risk = risk,
                uiInfo = uiInfo,
                rootCauseIndex = rootCauseIndex,
            )
    }
}

public data class RepairInfoEx(
    public var repair: RepairInfo = RepairInfo(),
    public var repairRank: UShort = 0u,
)

public class RootCauseInfo internal constructor(
    pwszDescriptionCtorArg: Pwstr,
    public var rootCauseID: Guid,
    public var rootCauseFlags: UInt,
    public var networkInterfaceID: Guid,
    pRepairsCtorArg: MutPtr<RepairInfoEx>,
    public var repairCount: UShort,
) {
    public var pwszDescription: Pwstr = pwszDescriptionCtorArg
        internal set

    public var pRepairs: MutPtr<RepairInfoEx> = pRepairsCtorArg
        internal set

    public constructor() : this(
        pwszDescriptionCtorArg = MutPtr(0L),
        rootCauseID = Guid(),
        rootCauseFlags = 0u,
        networkInterfaceID = Guid(),
        pRepairsCtorArg = MutPtr(0L),
        repairCount = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszDescription

    public operator fun component2(): Guid = this.rootCauseID

    public operator fun component3(): UInt = this.rootCauseFlags

    public operator fun component4(): Guid = this.networkInterfaceID

    public operator fun component5(): MutPtr<RepairInfoEx> = this.pRepairs

    public operator fun component6(): UShort = this.repairCount

    public fun copy(pwszDescription: Pwstr = this.pwszDescription, rootCauseID: Guid = this.rootCauseID, rootCauseFlags: UInt = this.rootCauseFlags, networkInterfaceID: Guid = this.networkInterfaceID, pRepairs: MutPtr<RepairInfoEx> = this.pRepairs, repairCount: UShort = this.repairCount): RootCauseInfo = RootCauseInfo(pwszDescriptionCtorArg = pwszDescription, rootCauseID = rootCauseID, rootCauseFlags = rootCauseFlags, networkInterfaceID = networkInterfaceID, pRepairsCtorArg = pRepairs, repairCount = repairCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RootCauseInfo) return false
        if (this.pwszDescription != other.pwszDescription) return false
        if (this.rootCauseID != other.rootCauseID) return false
        if (this.rootCauseFlags != other.rootCauseFlags) return false
        if (this.networkInterfaceID != other.networkInterfaceID) return false
        if (this.pRepairs != other.pRepairs) return false
        if (this.repairCount != other.repairCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszDescription.hashCode()
        result = 31 * result + this.rootCauseID.hashCode()
        result = 31 * result + this.rootCauseFlags.hashCode()
        result = 31 * result + this.networkInterfaceID.hashCode()
        result = 31 * result + this.pRepairs.hashCode()
        result = 31 * result + this.repairCount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszDescription: Pwstr = MutPtr(0L),
            rootCauseID: Guid = Guid(),
            rootCauseFlags: UInt = 0u,
            networkInterfaceID: Guid = Guid(),
            pRepairs: MutPtr<RepairInfoEx> = MutPtr(0L),
            repairCount: UShort = 0u,
        ): RootCauseInfo =
            RootCauseInfo(
                pwszDescriptionCtorArg = pwszDescription,
                rootCauseID = rootCauseID,
                rootCauseFlags = rootCauseFlags,
                networkInterfaceID = networkInterfaceID,
                pRepairsCtorArg = pRepairs,
                repairCount = repairCount,
            )
    }
}

public class ShellCommandInfo internal constructor(
    pwszOperationCtorArg: Pwstr,
    pwszFileCtorArg: Pwstr,
    pwszParametersCtorArg: Pwstr,
    pwszDirectoryCtorArg: Pwstr,
    public var nShowCmd: UInt,
) {
    public var pwszOperation: Pwstr = pwszOperationCtorArg
        internal set

    public var pwszFile: Pwstr = pwszFileCtorArg
        internal set

    public var pwszParameters: Pwstr = pwszParametersCtorArg
        internal set

    public var pwszDirectory: Pwstr = pwszDirectoryCtorArg
        internal set

    public constructor() : this(
        pwszOperationCtorArg = MutPtr(0L),
        pwszFileCtorArg = MutPtr(0L),
        pwszParametersCtorArg = MutPtr(0L),
        pwszDirectoryCtorArg = MutPtr(0L),
        nShowCmd = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszOperation

    public operator fun component2(): Pwstr = this.pwszFile

    public operator fun component3(): Pwstr = this.pwszParameters

    public operator fun component4(): Pwstr = this.pwszDirectory

    public operator fun component5(): UInt = this.nShowCmd

    public fun copy(pwszOperation: Pwstr = this.pwszOperation, pwszFile: Pwstr = this.pwszFile, pwszParameters: Pwstr = this.pwszParameters, pwszDirectory: Pwstr = this.pwszDirectory, nShowCmd: UInt = this.nShowCmd): ShellCommandInfo = ShellCommandInfo(pwszOperationCtorArg = pwszOperation, pwszFileCtorArg = pwszFile, pwszParametersCtorArg = pwszParameters, pwszDirectoryCtorArg = pwszDirectory, nShowCmd = nShowCmd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShellCommandInfo) return false
        if (this.pwszOperation != other.pwszOperation) return false
        if (this.pwszFile != other.pwszFile) return false
        if (this.pwszParameters != other.pwszParameters) return false
        if (this.pwszDirectory != other.pwszDirectory) return false
        if (this.nShowCmd != other.nShowCmd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszOperation.hashCode()
        result = 31 * result + this.pwszFile.hashCode()
        result = 31 * result + this.pwszParameters.hashCode()
        result = 31 * result + this.pwszDirectory.hashCode()
        result = 31 * result + this.nShowCmd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszOperation: Pwstr = MutPtr(0L),
            pwszFile: Pwstr = MutPtr(0L),
            pwszParameters: Pwstr = MutPtr(0L),
            pwszDirectory: Pwstr = MutPtr(0L),
            nShowCmd: UInt = 0u,
        ): ShellCommandInfo =
            ShellCommandInfo(
                pwszOperationCtorArg = pwszOperation,
                pwszFileCtorArg = pwszFile,
                pwszParametersCtorArg = pwszParameters,
                pwszDirectoryCtorArg = pwszDirectory,
                nShowCmd = nShowCmd,
            )
    }
}

public data class UiInfo(
    public var type: UiInfoType = 0,
    public var anonymous: UiInfo0 = UiInfo0(),
)

public class UiInfo0 internal constructor(
    pwzNullCtorArg: Pwstr,
    public var shellInfo: ShellCommandInfo,
    pwzHelpUrlCtorArg: Pwstr,
    pwzDuiCtorArg: Pwstr,
) {
    public var pwzNull: Pwstr = pwzNullCtorArg
        internal set

    public var pwzHelpUrl: Pwstr = pwzHelpUrlCtorArg
        internal set

    public var pwzDui: Pwstr = pwzDuiCtorArg
        internal set

    public constructor() : this(
        pwzNullCtorArg = MutPtr(0L),
        shellInfo = ShellCommandInfo(),
        pwzHelpUrlCtorArg = MutPtr(0L),
        pwzDuiCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwzNull

    public operator fun component2(): ShellCommandInfo = this.shellInfo

    public operator fun component3(): Pwstr = this.pwzHelpUrl

    public operator fun component4(): Pwstr = this.pwzDui

    public fun copy(pwzNull: Pwstr = this.pwzNull, shellInfo: ShellCommandInfo = this.shellInfo, pwzHelpUrl: Pwstr = this.pwzHelpUrl, pwzDui: Pwstr = this.pwzDui): UiInfo0 = UiInfo0(pwzNullCtorArg = pwzNull, shellInfo = shellInfo, pwzHelpUrlCtorArg = pwzHelpUrl, pwzDuiCtorArg = pwzDui)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UiInfo0) return false
        if (this.pwzNull != other.pwzNull) return false
        if (this.shellInfo != other.shellInfo) return false
        if (this.pwzHelpUrl != other.pwzHelpUrl) return false
        if (this.pwzDui != other.pwzDui) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwzNull.hashCode()
        result = 31 * result + this.shellInfo.hashCode()
        result = 31 * result + this.pwzHelpUrl.hashCode()
        result = 31 * result + this.pwzDui.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwzNull: Pwstr = MutPtr(0L),
            shellInfo: ShellCommandInfo = ShellCommandInfo(),
            pwzHelpUrl: Pwstr = MutPtr(0L),
            pwzDui: Pwstr = MutPtr(0L),
        ): UiInfo0 =
            UiInfo0(
                pwzNullCtorArg = pwzNull,
                shellInfo = shellInfo,
                pwzHelpUrlCtorArg = pwzHelpUrl,
                pwzDuiCtorArg = pwzDui,
            )
    }
}
