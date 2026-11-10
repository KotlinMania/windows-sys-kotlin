@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

public data class JetBkinfo(
    public var lgposMark: JetLgpos = JetLgpos(),
    public var anonymous: JetBkinfo0 = JetBkinfo0(),
    public var genLow: UInt = 0u,
    public var genHigh: UInt = 0u,
)

public data class JetBkinfo0(
    public var logtimeMark: JetLogtime = JetLogtime(),
    public var bklogtimeMark: JetBklogtime = JetBklogtime(),
)

public data class JetBklogtime(
    public var bSeconds: Byte = 0,
    public var bMinutes: Byte = 0,
    public var bHours: Byte = 0,
    public var bDay: Byte = 0,
    public var bMonth: Byte = 0,
    public var bYear: Byte = 0,
    public var anonymous1: JetBklogtime0 = JetBklogtime0(),
    public var anonymous2: JetBklogtime1 = JetBklogtime1(),
)

public data class JetBklogtime0(
    public var bFiller1: Byte = 0,
    public var anonymous: JetBklogtime00 = JetBklogtime00(),
)

public data class JetBklogtime00(
    public var bitfield: UByte = 0u,
)

public data class JetBklogtime1(
    public var bFiller2: Byte = 0,
    public var anonymous: JetBklogtime10 = JetBklogtime10(),
)

public data class JetBklogtime10(
    public var bitfield: UByte = 0u,
)

public data class JetColumnbaseA(
    public var cbStruct: UInt = 0u,
    public var columnid: UInt = 0u,
    public var coltyp: UInt = 0u,
    public var wCountry: UShort = 0u,
    public var langid: UShort = 0u,
    public var cp: UShort = 0u,
    public var wFiller: UShort = 0u,
    public var cbMax: UInt = 0u,
    public var grbit: UInt = 0u,
    public var szBaseTableName: ByteArray = ByteArray(256),
    public var szBaseColumnName: ByteArray = ByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetColumnbaseA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.columnid != other.columnid) return false
        if (this.coltyp != other.coltyp) return false
        if (this.wCountry != other.wCountry) return false
        if (this.langid != other.langid) return false
        if (this.cp != other.cp) return false
        if (this.wFiller != other.wFiller) return false
        if (this.cbMax != other.cbMax) return false
        if (this.grbit != other.grbit) return false
        if (!this.szBaseTableName.contentEquals(other.szBaseTableName)) return false
        if (!this.szBaseColumnName.contentEquals(other.szBaseColumnName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.columnid.hashCode()
        result = 31 * result + this.coltyp.hashCode()
        result = 31 * result + this.wCountry.hashCode()
        result = 31 * result + this.langid.hashCode()
        result = 31 * result + this.cp.hashCode()
        result = 31 * result + this.wFiller.hashCode()
        result = 31 * result + this.cbMax.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.szBaseTableName.contentHashCode()
        result = 31 * result + this.szBaseColumnName.contentHashCode()
        return result
    }
}

public data class JetColumnbaseW(
    public var cbStruct: UInt = 0u,
    public var columnid: UInt = 0u,
    public var coltyp: UInt = 0u,
    public var wCountry: UShort = 0u,
    public var langid: UShort = 0u,
    public var cp: UShort = 0u,
    public var wFiller: UShort = 0u,
    public var cbMax: UInt = 0u,
    public var grbit: UInt = 0u,
    public var szBaseTableName: UShortArray = UShortArray(256),
    public var szBaseColumnName: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetColumnbaseW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.columnid != other.columnid) return false
        if (this.coltyp != other.coltyp) return false
        if (this.wCountry != other.wCountry) return false
        if (this.langid != other.langid) return false
        if (this.cp != other.cp) return false
        if (this.wFiller != other.wFiller) return false
        if (this.cbMax != other.cbMax) return false
        if (this.grbit != other.grbit) return false
        if (!this.szBaseTableName.contentEquals(other.szBaseTableName)) return false
        if (!this.szBaseColumnName.contentEquals(other.szBaseColumnName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.columnid.hashCode()
        result = 31 * result + this.coltyp.hashCode()
        result = 31 * result + this.wCountry.hashCode()
        result = 31 * result + this.langid.hashCode()
        result = 31 * result + this.cp.hashCode()
        result = 31 * result + this.wFiller.hashCode()
        result = 31 * result + this.cbMax.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.szBaseTableName.contentHashCode()
        result = 31 * result + this.szBaseColumnName.contentHashCode()
        return result
    }
}

public data class JetColumncreateA(
    public var cbStruct: UInt = 0u,
    public var szColumnName: Pstr = null,
    public var coltyp: UInt = 0u,
    public var cbMax: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pvDefault: COpaquePointer? = null,
    public var cbDefault: UInt = 0u,
    public var cp: UInt = 0u,
    public var columnid: UInt = 0u,
    public var err: Int = 0,
)

public data class JetColumncreateW(
    public var cbStruct: UInt = 0u,
    public var szColumnName: Pwstr = null,
    public var coltyp: UInt = 0u,
    public var cbMax: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pvDefault: COpaquePointer? = null,
    public var cbDefault: UInt = 0u,
    public var cp: UInt = 0u,
    public var columnid: UInt = 0u,
    public var err: Int = 0,
)

public data class JetColumndef(
    public var cbStruct: UInt = 0u,
    public var columnid: UInt = 0u,
    public var coltyp: UInt = 0u,
    public var wCountry: UShort = 0u,
    public var langid: UShort = 0u,
    public var cp: UShort = 0u,
    public var wCollate: UShort = 0u,
    public var cbMax: UInt = 0u,
    public var grbit: UInt = 0u,
)

public class JetColumnlist(
    public var cbStruct: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cRecord: UInt = 0u,
    public var columnidPresentationOrder: UInt = 0u,
    public var columnidcolumnname: UInt = 0u,
    public var columnidcolumnid: UInt = 0u,
    public var columnidcoltyp: UInt = 0u,
    public var columnidCountry: UInt = 0u,
    public var columnidLangid: UInt = 0u,
    public var columnidCp: UInt = 0u,
    public var columnidCollate: UInt = 0u,
    public var columnidcbMax: UInt = 0u,
    public var columnidgrbit: UInt = 0u,
    public var columnidDefault: UInt = 0u,
    public var columnidBaseTableName: UInt = 0u,
    public var columnidBaseColumnName: UInt = 0u,
    public var columnidDefinitionName: UInt = 0u,
)

public data class JetCommitId(
    public var signLog: JetSignature = JetSignature(),
    public var reserved: Int = 0,
    public var commitId: Long = 0L,
)

public data class JetConditionalcolumnA(
    public var cbStruct: UInt = 0u,
    public var szColumnName: Pstr = null,
    public var grbit: UInt = 0u,
)

public data class JetConditionalcolumnW(
    public var cbStruct: UInt = 0u,
    public var szColumnName: Pwstr = null,
    public var grbit: UInt = 0u,
)

public data class JetConvertA(
    public var szOldDll: Pstr = null,
    public var anonymous: JetConvertA0 = JetConvertA0(),
)

public data class JetConvertA0(
    public var fFlags: UInt = 0u,
    public var anonymous: JetConvertA00 = JetConvertA00(),
)

public data class JetConvertA00(
    public var bitfield: UInt = 0u,
)

public data class JetConvertW(
    public var szOldDll: Pwstr = null,
    public var anonymous: JetConvertW0 = JetConvertW0(),
)

public data class JetConvertW0(
    public var fFlags: UInt = 0u,
    public var anonymous: JetConvertW00 = JetConvertW00(),
)

public data class JetConvertW00(
    public var bitfield: UInt = 0u,
)

public class JetDbinfomisc(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JetSignature = JetSignature(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JetLgpos = JetLgpos(),
    public var logtimeConsistent: JetLogtime = JetLogtime(),
    public var logtimeAttach: JetLogtime = JetLogtime(),
    public var lgposAttach: JetLgpos = JetLgpos(),
    public var logtimeDetach: JetLogtime = JetLogtime(),
    public var lgposDetach: JetLgpos = JetLgpos(),
    public var signLog: JetSignature = JetSignature(),
    public var bkinfoFullPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoIncPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoFullCur: JetBkinfo = JetBkinfo(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
)

public class JetDbinfomisc2(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JetSignature = JetSignature(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JetLgpos = JetLgpos(),
    public var logtimeConsistent: JetLogtime = JetLogtime(),
    public var logtimeAttach: JetLogtime = JetLogtime(),
    public var lgposAttach: JetLgpos = JetLgpos(),
    public var logtimeDetach: JetLogtime = JetLogtime(),
    public var lgposDetach: JetLgpos = JetLgpos(),
    public var signLog: JetSignature = JetSignature(),
    public var bkinfoFullPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoIncPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoFullCur: JetBkinfo = JetBkinfo(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
    public var genMinRequired: UInt = 0u,
    public var genMaxRequired: UInt = 0u,
    public var logtimeGenMaxCreate: JetLogtime = JetLogtime(),
    public var ulRepairCount: UInt = 0u,
    public var logtimeRepair: JetLogtime = JetLogtime(),
    public var ulRepairCountOld: UInt = 0u,
    public var ulECCFixSuccess: UInt = 0u,
    public var logtimeECCFixSuccess: JetLogtime = JetLogtime(),
    public var ulECCFixSuccessOld: UInt = 0u,
    public var ulECCFixFail: UInt = 0u,
    public var logtimeECCFixFail: JetLogtime = JetLogtime(),
    public var ulECCFixFailOld: UInt = 0u,
    public var ulBadChecksum: UInt = 0u,
    public var logtimeBadChecksum: JetLogtime = JetLogtime(),
    public var ulBadChecksumOld: UInt = 0u,
)

public class JetDbinfomisc3(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JetSignature = JetSignature(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JetLgpos = JetLgpos(),
    public var logtimeConsistent: JetLogtime = JetLogtime(),
    public var logtimeAttach: JetLogtime = JetLogtime(),
    public var lgposAttach: JetLgpos = JetLgpos(),
    public var logtimeDetach: JetLogtime = JetLogtime(),
    public var lgposDetach: JetLgpos = JetLgpos(),
    public var signLog: JetSignature = JetSignature(),
    public var bkinfoFullPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoIncPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoFullCur: JetBkinfo = JetBkinfo(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
    public var genMinRequired: UInt = 0u,
    public var genMaxRequired: UInt = 0u,
    public var logtimeGenMaxCreate: JetLogtime = JetLogtime(),
    public var ulRepairCount: UInt = 0u,
    public var logtimeRepair: JetLogtime = JetLogtime(),
    public var ulRepairCountOld: UInt = 0u,
    public var ulECCFixSuccess: UInt = 0u,
    public var logtimeECCFixSuccess: JetLogtime = JetLogtime(),
    public var ulECCFixSuccessOld: UInt = 0u,
    public var ulECCFixFail: UInt = 0u,
    public var logtimeECCFixFail: JetLogtime = JetLogtime(),
    public var ulECCFixFailOld: UInt = 0u,
    public var ulBadChecksum: UInt = 0u,
    public var logtimeBadChecksum: JetLogtime = JetLogtime(),
    public var ulBadChecksumOld: UInt = 0u,
    public var genCommitted: UInt = 0u,
)

public class JetDbinfomisc4(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JetSignature = JetSignature(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JetLgpos = JetLgpos(),
    public var logtimeConsistent: JetLogtime = JetLogtime(),
    public var logtimeAttach: JetLogtime = JetLogtime(),
    public var lgposAttach: JetLgpos = JetLgpos(),
    public var logtimeDetach: JetLogtime = JetLogtime(),
    public var lgposDetach: JetLgpos = JetLgpos(),
    public var signLog: JetSignature = JetSignature(),
    public var bkinfoFullPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoIncPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoFullCur: JetBkinfo = JetBkinfo(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
    public var genMinRequired: UInt = 0u,
    public var genMaxRequired: UInt = 0u,
    public var logtimeGenMaxCreate: JetLogtime = JetLogtime(),
    public var ulRepairCount: UInt = 0u,
    public var logtimeRepair: JetLogtime = JetLogtime(),
    public var ulRepairCountOld: UInt = 0u,
    public var ulECCFixSuccess: UInt = 0u,
    public var logtimeECCFixSuccess: JetLogtime = JetLogtime(),
    public var ulECCFixSuccessOld: UInt = 0u,
    public var ulECCFixFail: UInt = 0u,
    public var logtimeECCFixFail: JetLogtime = JetLogtime(),
    public var ulECCFixFailOld: UInt = 0u,
    public var ulBadChecksum: UInt = 0u,
    public var logtimeBadChecksum: JetLogtime = JetLogtime(),
    public var ulBadChecksumOld: UInt = 0u,
    public var genCommitted: UInt = 0u,
    public var bkinfoCopyPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoDiffPrev: JetBkinfo = JetBkinfo(),
)

public data class JetDbinfoupgrade(
    public var cbStruct: UInt = 0u,
    public var cbFilesizeLow: UInt = 0u,
    public var cbFilesizeHigh: UInt = 0u,
    public var cbFreeSpaceRequiredLow: UInt = 0u,
    public var cbFreeSpaceRequiredHigh: UInt = 0u,
    public var csecToUpgrade: UInt = 0u,
    public var anonymous: JetDbinfoupgrade0 = JetDbinfoupgrade0(),
)

public data class JetDbinfoupgrade0(
    public var ulFlags: UInt = 0u,
    public var anonymous: JetDbinfoupgrade00 = JetDbinfoupgrade00(),
)

public data class JetDbinfoupgrade00(
    public var bitfield: UInt = 0u,
)

public data class JetEnumcolumn(
    public var columnid: UInt = 0u,
    public var err: Int = 0,
    public var anonymous: JetEnumcolumn0 = JetEnumcolumn0(),
)

public data class JetEnumcolumn0(
    public var anonymous1: JetEnumcolumn00 = JetEnumcolumn00(),
    public var anonymous2: JetEnumcolumn01 = JetEnumcolumn01(),
)

public data class JetEnumcolumn00(
    public var cEnumColumnValue: UInt = 0u,
    public var rgEnumColumnValue: JetEnumcolumnvalue? = null,
)

public data class JetEnumcolumn01(
    public var cbData: UInt = 0u,
    public var pvData: COpaquePointer? = null,
)

public data class JetEnumcolumnid(
    public var columnid: UInt = 0u,
    public var ctagSequence: UInt = 0u,
    public var rgtagSequence: UInt? = null,
)

public data class JetEnumcolumnvalue(
    public var itagSequence: UInt = 0u,
    public var err: Int = 0,
    public var cbData: UInt = 0u,
    public var pvData: COpaquePointer? = null,
)

public data class JetErrinfobasicW(
    public var cbStruct: UInt = 0u,
    public var errValue: Int = 0,
    public var errcatMostSpecific: JetErrcat = 0,
    public var rgCategoricalHierarchy: UByteArray = UByteArray(8),
    public var lSourceLine: UInt = 0u,
    public var rgszSourceFile: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetErrinfobasicW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.errValue != other.errValue) return false
        if (this.errcatMostSpecific != other.errcatMostSpecific) return false
        if (!this.rgCategoricalHierarchy.contentEquals(other.rgCategoricalHierarchy)) return false
        if (this.lSourceLine != other.lSourceLine) return false
        if (!this.rgszSourceFile.contentEquals(other.rgszSourceFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.errValue.hashCode()
        result = 31 * result + this.errcatMostSpecific.hashCode()
        result = 31 * result + this.rgCategoricalHierarchy.contentHashCode()
        result = 31 * result + this.lSourceLine.hashCode()
        result = 31 * result + this.rgszSourceFile.contentHashCode()
        return result
    }
}

public data class JetIndexcreate2A(
    public var cbStruct: UInt = 0u,
    public var szIndexName: Pstr = null,
    public var szKey: Pstr = null,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var anonymous1: JetIndexcreate2A0 = JetIndexcreate2A0(),
    public var anonymous2: JetIndexcreate2A1 = JetIndexcreate2A1(),
    public var rgconditionalcolumn: JetConditionalcolumnA? = null,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
    public var pSpacehints: JetSpacehints? = null,
)

public data class JetIndexcreate2A0(
    public var lcid: UInt = 0u,
    public var pidxunicode: JetUnicodeindex? = null,
)

public data class JetIndexcreate2A1(
    public var cbVarSegMac: UInt = 0u,
    public var ptuplelimits: JetTuplelimits? = null,
)

public data class JetIndexcreate2W(
    public var cbStruct: UInt = 0u,
    public var szIndexName: Pwstr = null,
    public var szKey: Pwstr = null,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var anonymous1: JetIndexcreate2W0 = JetIndexcreate2W0(),
    public var anonymous2: JetIndexcreate2W1 = JetIndexcreate2W1(),
    public var rgconditionalcolumn: JetConditionalcolumnW? = null,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
    public var pSpacehints: JetSpacehints? = null,
)

public data class JetIndexcreate2W0(
    public var lcid: UInt = 0u,
    public var pidxunicode: JetUnicodeindex? = null,
)

public data class JetIndexcreate2W1(
    public var cbVarSegMac: UInt = 0u,
    public var ptuplelimits: JetTuplelimits? = null,
)

public data class JetIndexcreate3A(
    public var cbStruct: UInt = 0u,
    public var szIndexName: Pstr = null,
    public var szKey: Pstr = null,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var pidxunicode: JetUnicodeindex2? = null,
    public var anonymous: JetIndexcreate3A0 = JetIndexcreate3A0(),
    public var rgconditionalcolumn: JetConditionalcolumnA? = null,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
    public var pSpacehints: JetSpacehints? = null,
)

public data class JetIndexcreate3A0(
    public var cbVarSegMac: UInt = 0u,
    public var ptuplelimits: JetTuplelimits? = null,
)

public data class JetIndexcreate3W(
    public var cbStruct: UInt = 0u,
    public var szIndexName: Pwstr = null,
    public var szKey: Pwstr = null,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var pidxunicode: JetUnicodeindex2? = null,
    public var anonymous: JetIndexcreate3W0 = JetIndexcreate3W0(),
    public var rgconditionalcolumn: JetConditionalcolumnW? = null,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
    public var pSpacehints: JetSpacehints? = null,
)

public data class JetIndexcreate3W0(
    public var cbVarSegMac: UInt = 0u,
    public var ptuplelimits: JetTuplelimits? = null,
)

public data class JetIndexcreateA(
    public var cbStruct: UInt = 0u,
    public var szIndexName: Pstr = null,
    public var szKey: Pstr = null,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var anonymous1: JetIndexcreateA0 = JetIndexcreateA0(),
    public var anonymous2: JetIndexcreateA1 = JetIndexcreateA1(),
    public var rgconditionalcolumn: JetConditionalcolumnA? = null,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
)

public data class JetIndexcreateA0(
    public var lcid: UInt = 0u,
    public var pidxunicode: JetUnicodeindex? = null,
)

public data class JetIndexcreateA1(
    public var cbVarSegMac: UInt = 0u,
    public var ptuplelimits: JetTuplelimits? = null,
)

public data class JetIndexcreateW(
    public var cbStruct: UInt = 0u,
    public var szIndexName: Pwstr = null,
    public var szKey: Pwstr = null,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var anonymous1: JetIndexcreateW0 = JetIndexcreateW0(),
    public var anonymous2: JetIndexcreateW1 = JetIndexcreateW1(),
    public var rgconditionalcolumn: JetConditionalcolumnW? = null,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
)

public data class JetIndexcreateW0(
    public var lcid: UInt = 0u,
    public var pidxunicode: JetUnicodeindex? = null,
)

public data class JetIndexcreateW1(
    public var cbVarSegMac: UInt = 0u,
    public var ptuplelimits: JetTuplelimits? = null,
)

public data class JetIndexid(
    public var cbStruct: UInt = 0u,
    public var rgbIndexId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexid) return false
        if (this.cbStruct != other.cbStruct) return false
        if (!this.rgbIndexId.contentEquals(other.rgbIndexId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.rgbIndexId.contentHashCode()
        return result
    }
}

public class JetIndexlist(
    public var cbStruct: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cRecord: UInt = 0u,
    public var columnidindexname: UInt = 0u,
    public var columnidgrbitIndex: UInt = 0u,
    public var columnidcKey: UInt = 0u,
    public var columnidcEntry: UInt = 0u,
    public var columnidcPage: UInt = 0u,
    public var columnidcColumn: UInt = 0u,
    public var columnidiColumn: UInt = 0u,
    public var columnidcolumnid: UInt = 0u,
    public var columnidcoltyp: UInt = 0u,
    public var columnidCountry: UInt = 0u,
    public var columnidLangid: UInt = 0u,
    public var columnidCp: UInt = 0u,
    public var columnidCollate: UInt = 0u,
    public var columnidgrbitColumn: UInt = 0u,
    public var columnidcolumnname: UInt = 0u,
    public var columnidLCMapFlags: UInt = 0u,
)

public data class JetIndexrange(
    public var cbStruct: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var grbit: UInt = 0u,
)

public data class JetIndexColumn(
    public var columnid: UInt = 0u,
    public var relop: JetRelop = 0,
    public var pv: COpaquePointer? = null,
    public var cb: UInt = 0u,
    public var grbit: UInt = 0u,
)

public data class JetIndexRange(
    public var rgStartColumns: JetIndexColumn? = null,
    public var cStartColumns: UInt = 0u,
    public var rgEndColumns: JetIndexColumn? = null,
    public var cEndColumns: UInt = 0u,
)

public data class JetInstanceInfoA(
    public var hInstanceId: JetInstance = 0uL,
    public var szInstanceName: Pstr = null,
    public var cDatabases: JetApiPtr = 0uL,
    public var szDatabaseFileName: COpaquePointer? = null,
    public var szDatabaseDisplayName: COpaquePointer? = null,
    public var szDatabaseSlvfileNameObsolete: COpaquePointer? = null,
)

public data class JetInstanceInfoW(
    public var hInstanceId: JetInstance = 0uL,
    public var szInstanceName: Pwstr = null,
    public var cDatabases: JetApiPtr = 0uL,
    public var szDatabaseFileName: COpaquePointer? = null,
    public var szDatabaseDisplayName: COpaquePointer? = null,
    public var szDatabaseSlvfileNameObsolete: COpaquePointer? = null,
)

public data class JetLgpos(
    public var ib: UShort = 0u,
    public var isec: UShort = 0u,
    public var lGeneration: Int = 0,
)

public data class JetLoginfoA(
    public var cbSize: UInt = 0u,
    public var ulGenLow: UInt = 0u,
    public var ulGenHigh: UInt = 0u,
    public var szBaseName: ByteArray = ByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetLoginfoA) return false
        if (this.cbSize != other.cbSize) return false
        if (this.ulGenLow != other.ulGenLow) return false
        if (this.ulGenHigh != other.ulGenHigh) return false
        if (!this.szBaseName.contentEquals(other.szBaseName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.ulGenLow.hashCode()
        result = 31 * result + this.ulGenHigh.hashCode()
        result = 31 * result + this.szBaseName.contentHashCode()
        return result
    }
}

public data class JetLoginfoW(
    public var cbSize: UInt = 0u,
    public var ulGenLow: UInt = 0u,
    public var ulGenHigh: UInt = 0u,
    public var szBaseName: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetLoginfoW) return false
        if (this.cbSize != other.cbSize) return false
        if (this.ulGenLow != other.ulGenLow) return false
        if (this.ulGenHigh != other.ulGenHigh) return false
        if (!this.szBaseName.contentEquals(other.szBaseName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.ulGenLow.hashCode()
        result = 31 * result + this.ulGenHigh.hashCode()
        result = 31 * result + this.szBaseName.contentHashCode()
        return result
    }
}

public data class JetLogtime(
    public var bSeconds: Byte = 0,
    public var bMinutes: Byte = 0,
    public var bHours: Byte = 0,
    public var bDay: Byte = 0,
    public var bMonth: Byte = 0,
    public var bYear: Byte = 0,
    public var anonymous1: JetLogtime0 = JetLogtime0(),
    public var anonymous2: JetLogtime1 = JetLogtime1(),
)

public data class JetLogtime0(
    public var bFiller1: Byte = 0,
    public var anonymous: JetLogtime00 = JetLogtime00(),
)

public data class JetLogtime00(
    public var bitfield: UByte = 0u,
)

public data class JetLogtime1(
    public var bFiller2: Byte = 0,
    public var anonymous: JetLogtime10 = JetLogtime10(),
)

public data class JetLogtime10(
    public var bitfield: UByte = 0u,
)

public data class JetObjectinfo(
    public var cbStruct: UInt = 0u,
    public var objtyp: UInt = 0u,
    public var dtCreate: Double = 0.0,
    public var dtUpdate: Double = 0.0,
    public var grbit: UInt = 0u,
    public var flags: UInt = 0u,
    public var cRecord: UInt = 0u,
    public var cPage: UInt = 0u,
)

public data class JetObjectlist(
    public var cbStruct: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cRecord: UInt = 0u,
    public var columnidcontainername: UInt = 0u,
    public var columnidobjectname: UInt = 0u,
    public var columnidobjtyp: UInt = 0u,
    public var columniddtCreate: UInt = 0u,
    public var columniddtUpdate: UInt = 0u,
    public var columnidgrbit: UInt = 0u,
    public var columnidflags: UInt = 0u,
    public var columnidcRecord: UInt = 0u,
    public var columnidcPage: UInt = 0u,
)

public data class JetOpentemporarytable(
    public var cbStruct: UInt = 0u,
    public var prgcolumndef: JetColumndef? = null,
    public var ccolumn: UInt = 0u,
    public var pidxunicode: JetUnicodeindex? = null,
    public var grbit: UInt = 0u,
    public var prgcolumnid: UInt? = null,
    public var cbKeyMost: UInt = 0u,
    public var cbVarSegMac: UInt = 0u,
    public var tableid: JetTableid = 0uL,
)

public data class JetOpentemporarytable2(
    public var cbStruct: UInt = 0u,
    public var prgcolumndef: JetColumndef? = null,
    public var ccolumn: UInt = 0u,
    public var pidxunicode: JetUnicodeindex2? = null,
    public var grbit: UInt = 0u,
    public var prgcolumnid: UInt? = null,
    public var cbKeyMost: UInt = 0u,
    public var cbVarSegMac: UInt = 0u,
    public var tableid: JetTableid = 0uL,
)

public data class JetOperationcontext(
    public var ulUserID: UInt = 0u,
    public var nOperationID: UByte = 0u,
    public var nOperationType: UByte = 0u,
    public var nClientType: UByte = 0u,
    public var fFlags: UByte = 0u,
)

public data class JetRecordlist(
    public var cbStruct: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cRecord: UInt = 0u,
    public var columnidBookmark: UInt = 0u,
)

public data class JetRecpos(
    public var cbStruct: UInt = 0u,
    public var centriesLT: UInt = 0u,
    public var centriesInRange: UInt = 0u,
    public var centriesTotal: UInt = 0u,
)

public data class JetRecpos2(
    public var cbStruct: UInt = 0u,
    public var centriesLTDeprecated: UInt = 0u,
    public var centriesInRangeDeprecated: UInt = 0u,
    public var centriesTotalDeprecated: UInt = 0u,
    public var centriesLT: ULong = 0uL,
    public var centriesTotal: ULong = 0uL,
)

public data class JetRecsize(
    public var cbData: ULong = 0uL,
    public var cbLongValueData: ULong = 0uL,
    public var cbOverhead: ULong = 0uL,
    public var cbLongValueOverhead: ULong = 0uL,
    public var cNonTaggedColumns: ULong = 0uL,
    public var cTaggedColumns: ULong = 0uL,
    public var cLongValues: ULong = 0uL,
    public var cMultiValues: ULong = 0uL,
)

public data class JetRecsize2(
    public var cbData: ULong = 0uL,
    public var cbLongValueData: ULong = 0uL,
    public var cbOverhead: ULong = 0uL,
    public var cbLongValueOverhead: ULong = 0uL,
    public var cNonTaggedColumns: ULong = 0uL,
    public var cTaggedColumns: ULong = 0uL,
    public var cLongValues: ULong = 0uL,
    public var cMultiValues: ULong = 0uL,
    public var cCompressedColumns: ULong = 0uL,
    public var cbDataCompressed: ULong = 0uL,
    public var cbLongValueDataCompressed: ULong = 0uL,
)

public data class JetRetinfo(
    public var cbStruct: UInt = 0u,
    public var ibLongValue: UInt = 0u,
    public var itagSequence: UInt = 0u,
    public var columnidNextTagged: UInt = 0u,
)

public data class JetRetrievecolumn(
    public var columnid: UInt = 0u,
    public var pvData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
    public var cbActual: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ibLongValue: UInt = 0u,
    public var itagSequence: UInt = 0u,
    public var columnidNextTagged: UInt = 0u,
    public var err: Int = 0,
)

public data class JetRstinfoA(
    public var cbStruct: UInt = 0u,
    public var rgrstmap: JetRstmapA? = null,
    public var crstmap: Int = 0,
    public var lgposStop: JetLgpos = JetLgpos(),
    public var logtimeStop: JetLogtime = JetLogtime(),
    public var pfnStatus: JetPfnstatus = null,
)

public data class JetRstinfoW(
    public var cbStruct: UInt = 0u,
    public var rgrstmap: JetRstmapW? = null,
    public var crstmap: Int = 0,
    public var lgposStop: JetLgpos = JetLgpos(),
    public var logtimeStop: JetLogtime = JetLogtime(),
    public var pfnStatus: JetPfnstatus = null,
)

public data class JetRstmapA(
    public var szDatabaseName: Pstr = null,
    public var szNewDatabaseName: Pstr = null,
)

public data class JetRstmapW(
    public var szDatabaseName: Pwstr = null,
    public var szNewDatabaseName: Pwstr = null,
)

public data class JetSetcolumn(
    public var columnid: UInt = 0u,
    public var pvData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ibLongValue: UInt = 0u,
    public var itagSequence: UInt = 0u,
    public var err: Int = 0,
)

public data class JetSetinfo(
    public var cbStruct: UInt = 0u,
    public var ibLongValue: UInt = 0u,
    public var itagSequence: UInt = 0u,
)

public data class JetSetsysparamA(
    public var paramid: UInt = 0u,
    public var lParam: JetApiPtr = 0uL,
    public var sz: Pcstr = null,
    public var err: Int = 0,
)

public data class JetSetsysparamW(
    public var paramid: UInt = 0u,
    public var lParam: JetApiPtr = 0uL,
    public var sz: Pcwstr = null,
    public var err: Int = 0,
)

public data class JetSignature(
    public var ulRandom: UInt = 0u,
    public var logtimeCreate: JetLogtime = JetLogtime(),
    public var szComputerName: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetSignature) return false
        if (this.ulRandom != other.ulRandom) return false
        if (this.logtimeCreate != other.logtimeCreate) return false
        if (!this.szComputerName.contentEquals(other.szComputerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulRandom.hashCode()
        result = 31 * result + this.logtimeCreate.hashCode()
        result = 31 * result + this.szComputerName.contentHashCode()
        return result
    }
}

public data class JetSnprog(
    public var cbStruct: UInt = 0u,
    public var cunitDone: UInt = 0u,
    public var cunitTotal: UInt = 0u,
)

public data class JetSpacehints(
    public var cbStruct: UInt = 0u,
    public var ulInitialDensity: UInt = 0u,
    public var cbInitial: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulMaintDensity: UInt = 0u,
    public var ulGrowth: UInt = 0u,
    public var cbMinExtent: UInt = 0u,
    public var cbMaxExtent: UInt = 0u,
)

public data class JetTablecreate2A(
    public var cbStruct: UInt = 0u,
    public var szTableName: Pstr = null,
    public var szTemplateTableName: Pstr = null,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: JetColumncreateA? = null,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: JetIndexcreateA? = null,
    public var cIndexes: UInt = 0u,
    public var szCallback: Pstr = null,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cCreated: UInt = 0u,
)

public data class JetTablecreate2W(
    public var cbStruct: UInt = 0u,
    public var szTableName: Pwstr = null,
    public var szTemplateTableName: Pwstr = null,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: JetColumncreateW? = null,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: JetIndexcreateW? = null,
    public var cIndexes: UInt = 0u,
    public var szCallback: Pwstr = null,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cCreated: UInt = 0u,
)

public class JetTablecreate3A(
    public var cbStruct: UInt = 0u,
    public var szTableName: Pstr = null,
    public var szTemplateTableName: Pstr = null,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: JetColumncreateA? = null,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: JetIndexcreate2A? = null,
    public var cIndexes: UInt = 0u,
    public var szCallback: Pstr = null,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pSeqSpacehints: JetSpacehints? = null,
    public var pLVSpacehints: JetSpacehints? = null,
    public var cbSeparateLV: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cCreated: UInt = 0u,
)

public class JetTablecreate3W(
    public var cbStruct: UInt = 0u,
    public var szTableName: Pwstr = null,
    public var szTemplateTableName: Pwstr = null,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: JetColumncreateW? = null,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: JetIndexcreate2W? = null,
    public var cIndexes: UInt = 0u,
    public var szCallback: Pwstr = null,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pSeqSpacehints: JetSpacehints? = null,
    public var pLVSpacehints: JetSpacehints? = null,
    public var cbSeparateLV: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cCreated: UInt = 0u,
)

public class JetTablecreate4A(
    public var cbStruct: UInt = 0u,
    public var szTableName: Pstr = null,
    public var szTemplateTableName: Pstr = null,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: JetColumncreateA? = null,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: JetIndexcreate3A? = null,
    public var cIndexes: UInt = 0u,
    public var szCallback: Pstr = null,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pSeqSpacehints: JetSpacehints? = null,
    public var pLVSpacehints: JetSpacehints? = null,
    public var cbSeparateLV: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cCreated: UInt = 0u,
)

public class JetTablecreate4W(
    public var cbStruct: UInt = 0u,
    public var szTableName: Pwstr = null,
    public var szTemplateTableName: Pwstr = null,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: JetColumncreateW? = null,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: JetIndexcreate3W? = null,
    public var cIndexes: UInt = 0u,
    public var szCallback: Pwstr = null,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pSeqSpacehints: JetSpacehints? = null,
    public var pLVSpacehints: JetSpacehints? = null,
    public var cbSeparateLV: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cCreated: UInt = 0u,
)

public data class JetTablecreateA(
    public var cbStruct: UInt = 0u,
    public var szTableName: Pstr = null,
    public var szTemplateTableName: Pstr = null,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: JetColumncreateA? = null,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: JetIndexcreateA? = null,
    public var cIndexes: UInt = 0u,
    public var grbit: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cCreated: UInt = 0u,
)

public data class JetTablecreateW(
    public var cbStruct: UInt = 0u,
    public var szTableName: Pwstr = null,
    public var szTemplateTableName: Pwstr = null,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: JetColumncreateW? = null,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: JetIndexcreateW? = null,
    public var cIndexes: UInt = 0u,
    public var grbit: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cCreated: UInt = 0u,
)

public data class JetThreadstats(
    public var cbStruct: UInt = 0u,
    public var cPageReferenced: UInt = 0u,
    public var cPageRead: UInt = 0u,
    public var cPagePreread: UInt = 0u,
    public var cPageDirtied: UInt = 0u,
    public var cPageRedirtied: UInt = 0u,
    public var cLogRecord: UInt = 0u,
    public var cbLogRecord: UInt = 0u,
)

public data class JetThreadstats2(
    public var cbStruct: UInt = 0u,
    public var cPageReferenced: UInt = 0u,
    public var cPageRead: UInt = 0u,
    public var cPagePreread: UInt = 0u,
    public var cPageDirtied: UInt = 0u,
    public var cPageRedirtied: UInt = 0u,
    public var cLogRecord: UInt = 0u,
    public var cbLogRecord: UInt = 0u,
    public var cusecPageCacheMiss: ULong = 0uL,
    public var cPageCacheMiss: UInt = 0u,
)

public data class JetTuplelimits(
    public var chLengthMin: UInt = 0u,
    public var chLengthMax: UInt = 0u,
    public var chToIndexMax: UInt = 0u,
    public var cchIncrement: UInt = 0u,
    public var ichStart: UInt = 0u,
)

public data class JetUnicodeindex(
    public var lcid: UInt = 0u,
    public var dwMapFlags: UInt = 0u,
)

public data class JetUnicodeindex2(
    public var szLocaleName: Pwstr = null,
    public var dwMapFlags: UInt = 0u,
)

public data class JetUserdefineddefaultA(
    public var szCallback: Pstr = null,
    public var pbUserData: COpaquePointer? = null,
    public var cbUserData: UInt = 0u,
    public var szDependantColumns: Pstr = null,
)

public data class JetUserdefineddefaultW(
    public var szCallback: Pwstr = null,
    public var pbUserData: COpaquePointer? = null,
    public var cbUserData: UInt = 0u,
    public var szDependantColumns: Pwstr = null,
)
