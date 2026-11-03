@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class JET_BKINFO(
    public var lgposMark: JET_LGPOS = JET_LGPOS(),
    public var Anonymous: JET_BKINFO_0 = JET_BKINFO_0(),
    public var genLow: UInt = 0u,
    public var genHigh: UInt = 0u,
)

public data class JET_BKINFO_0(public var logtimeMark: JET_LOGTIME = JET_LOGTIME(), public var bklogtimeMark: JET_BKLOGTIME = JET_BKLOGTIME())

public data class JET_BKLOGTIME(
    public var bSeconds: Byte = 0,
    public var bMinutes: Byte = 0,
    public var bHours: Byte = 0,
    public var bDay: Byte = 0,
    public var bMonth: Byte = 0,
    public var bYear: Byte = 0,
    public var Anonymous1: JET_BKLOGTIME_0 = JET_BKLOGTIME_0(),
    public var Anonymous2: JET_BKLOGTIME_1 = JET_BKLOGTIME_1(),
)

public data class JET_BKLOGTIME_0(public var bFiller1: Byte = 0, public var Anonymous: JET_BKLOGTIME_0_0 = JET_BKLOGTIME_0_0())

public data class JET_BKLOGTIME_0_0(public var _bitfield: UByte = 0u)

public data class JET_BKLOGTIME_1(public var bFiller2: Byte = 0, public var Anonymous: JET_BKLOGTIME_1_0 = JET_BKLOGTIME_1_0())

public data class JET_BKLOGTIME_1_0(public var _bitfield: UByte = 0u)

public data class JET_COLUMNBASE_A(
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
        if (other !is JET_COLUMNBASE_A) return false
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

public data class JET_COLUMNBASE_W(
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
        if (other !is JET_COLUMNBASE_W) return false
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

public data class JET_COLUMNCREATE_A(
    public var cbStruct: UInt = 0u,
    public var szColumnName: PSTR = 0L,
    public var coltyp: UInt = 0u,
    public var cbMax: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pvDefault: Long = 0L,
    public var cbDefault: UInt = 0u,
    public var cp: UInt = 0u,
    public var columnid: UInt = 0u,
    public var err: Int = 0,
)

public data class JET_COLUMNCREATE_W(
    public var cbStruct: UInt = 0u,
    public var szColumnName: PWSTR = 0L,
    public var coltyp: UInt = 0u,
    public var cbMax: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pvDefault: Long = 0L,
    public var cbDefault: UInt = 0u,
    public var cp: UInt = 0u,
    public var columnid: UInt = 0u,
    public var err: Int = 0,
)

public data class JET_COLUMNDEF(
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

public class JET_COLUMNLIST(
    public var cbStruct: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
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

public data class JET_COMMIT_ID(
    public var signLog: JET_SIGNATURE = JET_SIGNATURE(),
    public var reserved: Int = 0,
    public var commitId: Long = 0L,
)

public data class JET_CONDITIONALCOLUMN_A(
    public var cbStruct: UInt = 0u,
    public var szColumnName: PSTR = 0L,
    public var grbit: UInt = 0u,
)

public data class JET_CONDITIONALCOLUMN_W(
    public var cbStruct: UInt = 0u,
    public var szColumnName: PWSTR = 0L,
    public var grbit: UInt = 0u,
)

public data class JET_CONVERT_A(public var szOldDll: PSTR = 0L, public var Anonymous: JET_CONVERT_A_0 = JET_CONVERT_A_0())

public data class JET_CONVERT_A_0(public var fFlags: UInt = 0u, public var Anonymous: JET_CONVERT_A_0_0 = JET_CONVERT_A_0_0())

public data class JET_CONVERT_A_0_0(public var _bitfield: UInt = 0u)

public data class JET_CONVERT_W(public var szOldDll: PWSTR = 0L, public var Anonymous: JET_CONVERT_W_0 = JET_CONVERT_W_0())

public data class JET_CONVERT_W_0(public var fFlags: UInt = 0u, public var Anonymous: JET_CONVERT_W_0_0 = JET_CONVERT_W_0_0())

public data class JET_CONVERT_W_0_0(public var _bitfield: UInt = 0u)

public class JET_DBINFOMISC(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JET_SIGNATURE = JET_SIGNATURE(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JET_LGPOS = JET_LGPOS(),
    public var logtimeConsistent: JET_LOGTIME = JET_LOGTIME(),
    public var logtimeAttach: JET_LOGTIME = JET_LOGTIME(),
    public var lgposAttach: JET_LGPOS = JET_LGPOS(),
    public var logtimeDetach: JET_LOGTIME = JET_LOGTIME(),
    public var lgposDetach: JET_LGPOS = JET_LGPOS(),
    public var signLog: JET_SIGNATURE = JET_SIGNATURE(),
    public var bkinfoFullPrev: JET_BKINFO = JET_BKINFO(),
    public var bkinfoIncPrev: JET_BKINFO = JET_BKINFO(),
    public var bkinfoFullCur: JET_BKINFO = JET_BKINFO(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
)

public class JET_DBINFOMISC2(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JET_SIGNATURE = JET_SIGNATURE(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JET_LGPOS = JET_LGPOS(),
    public var logtimeConsistent: JET_LOGTIME = JET_LOGTIME(),
    public var logtimeAttach: JET_LOGTIME = JET_LOGTIME(),
    public var lgposAttach: JET_LGPOS = JET_LGPOS(),
    public var logtimeDetach: JET_LOGTIME = JET_LOGTIME(),
    public var lgposDetach: JET_LGPOS = JET_LGPOS(),
    public var signLog: JET_SIGNATURE = JET_SIGNATURE(),
    public var bkinfoFullPrev: JET_BKINFO = JET_BKINFO(),
    public var bkinfoIncPrev: JET_BKINFO = JET_BKINFO(),
    public var bkinfoFullCur: JET_BKINFO = JET_BKINFO(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
    public var genMinRequired: UInt = 0u,
    public var genMaxRequired: UInt = 0u,
    public var logtimeGenMaxCreate: JET_LOGTIME = JET_LOGTIME(),
    public var ulRepairCount: UInt = 0u,
    public var logtimeRepair: JET_LOGTIME = JET_LOGTIME(),
    public var ulRepairCountOld: UInt = 0u,
    public var ulECCFixSuccess: UInt = 0u,
    public var logtimeECCFixSuccess: JET_LOGTIME = JET_LOGTIME(),
    public var ulECCFixSuccessOld: UInt = 0u,
    public var ulECCFixFail: UInt = 0u,
    public var logtimeECCFixFail: JET_LOGTIME = JET_LOGTIME(),
    public var ulECCFixFailOld: UInt = 0u,
    public var ulBadChecksum: UInt = 0u,
    public var logtimeBadChecksum: JET_LOGTIME = JET_LOGTIME(),
    public var ulBadChecksumOld: UInt = 0u,
)

public class JET_DBINFOMISC3(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JET_SIGNATURE = JET_SIGNATURE(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JET_LGPOS = JET_LGPOS(),
    public var logtimeConsistent: JET_LOGTIME = JET_LOGTIME(),
    public var logtimeAttach: JET_LOGTIME = JET_LOGTIME(),
    public var lgposAttach: JET_LGPOS = JET_LGPOS(),
    public var logtimeDetach: JET_LOGTIME = JET_LOGTIME(),
    public var lgposDetach: JET_LGPOS = JET_LGPOS(),
    public var signLog: JET_SIGNATURE = JET_SIGNATURE(),
    public var bkinfoFullPrev: JET_BKINFO = JET_BKINFO(),
    public var bkinfoIncPrev: JET_BKINFO = JET_BKINFO(),
    public var bkinfoFullCur: JET_BKINFO = JET_BKINFO(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
    public var genMinRequired: UInt = 0u,
    public var genMaxRequired: UInt = 0u,
    public var logtimeGenMaxCreate: JET_LOGTIME = JET_LOGTIME(),
    public var ulRepairCount: UInt = 0u,
    public var logtimeRepair: JET_LOGTIME = JET_LOGTIME(),
    public var ulRepairCountOld: UInt = 0u,
    public var ulECCFixSuccess: UInt = 0u,
    public var logtimeECCFixSuccess: JET_LOGTIME = JET_LOGTIME(),
    public var ulECCFixSuccessOld: UInt = 0u,
    public var ulECCFixFail: UInt = 0u,
    public var logtimeECCFixFail: JET_LOGTIME = JET_LOGTIME(),
    public var ulECCFixFailOld: UInt = 0u,
    public var ulBadChecksum: UInt = 0u,
    public var logtimeBadChecksum: JET_LOGTIME = JET_LOGTIME(),
    public var ulBadChecksumOld: UInt = 0u,
    public var genCommitted: UInt = 0u,
)

public class JET_DBINFOMISC4(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JET_SIGNATURE = JET_SIGNATURE(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JET_LGPOS = JET_LGPOS(),
    public var logtimeConsistent: JET_LOGTIME = JET_LOGTIME(),
    public var logtimeAttach: JET_LOGTIME = JET_LOGTIME(),
    public var lgposAttach: JET_LGPOS = JET_LGPOS(),
    public var logtimeDetach: JET_LOGTIME = JET_LOGTIME(),
    public var lgposDetach: JET_LGPOS = JET_LGPOS(),
    public var signLog: JET_SIGNATURE = JET_SIGNATURE(),
    public var bkinfoFullPrev: JET_BKINFO = JET_BKINFO(),
    public var bkinfoIncPrev: JET_BKINFO = JET_BKINFO(),
    public var bkinfoFullCur: JET_BKINFO = JET_BKINFO(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
    public var genMinRequired: UInt = 0u,
    public var genMaxRequired: UInt = 0u,
    public var logtimeGenMaxCreate: JET_LOGTIME = JET_LOGTIME(),
    public var ulRepairCount: UInt = 0u,
    public var logtimeRepair: JET_LOGTIME = JET_LOGTIME(),
    public var ulRepairCountOld: UInt = 0u,
    public var ulECCFixSuccess: UInt = 0u,
    public var logtimeECCFixSuccess: JET_LOGTIME = JET_LOGTIME(),
    public var ulECCFixSuccessOld: UInt = 0u,
    public var ulECCFixFail: UInt = 0u,
    public var logtimeECCFixFail: JET_LOGTIME = JET_LOGTIME(),
    public var ulECCFixFailOld: UInt = 0u,
    public var ulBadChecksum: UInt = 0u,
    public var logtimeBadChecksum: JET_LOGTIME = JET_LOGTIME(),
    public var ulBadChecksumOld: UInt = 0u,
    public var genCommitted: UInt = 0u,
    public var bkinfoCopyPrev: JET_BKINFO = JET_BKINFO(),
    public var bkinfoDiffPrev: JET_BKINFO = JET_BKINFO(),
)

public data class JET_DBINFOUPGRADE(
    public var cbStruct: UInt = 0u,
    public var cbFilesizeLow: UInt = 0u,
    public var cbFilesizeHigh: UInt = 0u,
    public var cbFreeSpaceRequiredLow: UInt = 0u,
    public var cbFreeSpaceRequiredHigh: UInt = 0u,
    public var csecToUpgrade: UInt = 0u,
    public var Anonymous: JET_DBINFOUPGRADE_0 = JET_DBINFOUPGRADE_0(),
)

public data class JET_DBINFOUPGRADE_0(public var ulFlags: UInt = 0u, public var Anonymous: JET_DBINFOUPGRADE_0_0 = JET_DBINFOUPGRADE_0_0())

public data class JET_DBINFOUPGRADE_0_0(public var _bitfield: UInt = 0u)

public data class JET_ENUMCOLUMN(
    public var columnid: UInt = 0u,
    public var err: Int = 0,
    public var Anonymous: JET_ENUMCOLUMN_0 = JET_ENUMCOLUMN_0(),
)

public data class JET_ENUMCOLUMN_0(public var Anonymous1: JET_ENUMCOLUMN_0_0 = JET_ENUMCOLUMN_0_0(), public var Anonymous2: JET_ENUMCOLUMN_0_1 = JET_ENUMCOLUMN_0_1())

public data class JET_ENUMCOLUMN_0_0(public var cEnumColumnValue: UInt = 0u, public var rgEnumColumnValue: Long = 0L)

public data class JET_ENUMCOLUMN_0_1(public var cbData: UInt = 0u, public var pvData: Long = 0L)

public data class JET_ENUMCOLUMNID(
    public var columnid: UInt = 0u,
    public var ctagSequence: UInt = 0u,
    public var rgtagSequence: Long = 0L,
)

public data class JET_ENUMCOLUMNVALUE(
    public var itagSequence: UInt = 0u,
    public var err: Int = 0,
    public var cbData: UInt = 0u,
    public var pvData: Long = 0L,
)

public data class JET_ERRINFOBASIC_W(
    public var cbStruct: UInt = 0u,
    public var errValue: Int = 0,
    public var errcatMostSpecific: JET_ERRCAT = 0,
    public var rgCategoricalHierarchy: UByteArray = UByteArray(8),
    public var lSourceLine: UInt = 0u,
    public var rgszSourceFile: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JET_ERRINFOBASIC_W) return false
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

public data class JET_INDEXCREATE2_A(
    public var cbStruct: UInt = 0u,
    public var szIndexName: PSTR = 0L,
    public var szKey: PSTR = 0L,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var Anonymous1: JET_INDEXCREATE2_A_0 = JET_INDEXCREATE2_A_0(),
    public var Anonymous2: JET_INDEXCREATE2_A_1 = JET_INDEXCREATE2_A_1(),
    public var rgconditionalcolumn: Long = 0L,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
    public var pSpacehints: Long = 0L,
)

public data class JET_INDEXCREATE2_A_0(public var lcid: UInt = 0u, public var pidxunicode: Long = 0L)

public data class JET_INDEXCREATE2_A_1(public var cbVarSegMac: UInt = 0u, public var ptuplelimits: Long = 0L)

public data class JET_INDEXCREATE2_W(
    public var cbStruct: UInt = 0u,
    public var szIndexName: PWSTR = 0L,
    public var szKey: PWSTR = 0L,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var Anonymous1: JET_INDEXCREATE2_W_0 = JET_INDEXCREATE2_W_0(),
    public var Anonymous2: JET_INDEXCREATE2_W_1 = JET_INDEXCREATE2_W_1(),
    public var rgconditionalcolumn: Long = 0L,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
    public var pSpacehints: Long = 0L,
)

public data class JET_INDEXCREATE2_W_0(public var lcid: UInt = 0u, public var pidxunicode: Long = 0L)

public data class JET_INDEXCREATE2_W_1(public var cbVarSegMac: UInt = 0u, public var ptuplelimits: Long = 0L)

public data class JET_INDEXCREATE3_A(
    public var cbStruct: UInt = 0u,
    public var szIndexName: PSTR = 0L,
    public var szKey: PSTR = 0L,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var pidxunicode: Long = 0L,
    public var Anonymous: JET_INDEXCREATE3_A_0 = JET_INDEXCREATE3_A_0(),
    public var rgconditionalcolumn: Long = 0L,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
    public var pSpacehints: Long = 0L,
)

public data class JET_INDEXCREATE3_A_0(public var cbVarSegMac: UInt = 0u, public var ptuplelimits: Long = 0L)

public data class JET_INDEXCREATE3_W(
    public var cbStruct: UInt = 0u,
    public var szIndexName: PWSTR = 0L,
    public var szKey: PWSTR = 0L,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var pidxunicode: Long = 0L,
    public var Anonymous: JET_INDEXCREATE3_W_0 = JET_INDEXCREATE3_W_0(),
    public var rgconditionalcolumn: Long = 0L,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
    public var pSpacehints: Long = 0L,
)

public data class JET_INDEXCREATE3_W_0(public var cbVarSegMac: UInt = 0u, public var ptuplelimits: Long = 0L)

public data class JET_INDEXCREATE_A(
    public var cbStruct: UInt = 0u,
    public var szIndexName: PSTR = 0L,
    public var szKey: PSTR = 0L,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var Anonymous1: JET_INDEXCREATE_A_0 = JET_INDEXCREATE_A_0(),
    public var Anonymous2: JET_INDEXCREATE_A_1 = JET_INDEXCREATE_A_1(),
    public var rgconditionalcolumn: Long = 0L,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
)

public data class JET_INDEXCREATE_A_0(public var lcid: UInt = 0u, public var pidxunicode: Long = 0L)

public data class JET_INDEXCREATE_A_1(public var cbVarSegMac: UInt = 0u, public var ptuplelimits: Long = 0L)

public data class JET_INDEXCREATE_W(
    public var cbStruct: UInt = 0u,
    public var szIndexName: PWSTR = 0L,
    public var szKey: PWSTR = 0L,
    public var cbKey: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var Anonymous1: JET_INDEXCREATE_W_0 = JET_INDEXCREATE_W_0(),
    public var Anonymous2: JET_INDEXCREATE_W_1 = JET_INDEXCREATE_W_1(),
    public var rgconditionalcolumn: Long = 0L,
    public var cConditionalColumn: UInt = 0u,
    public var err: Int = 0,
    public var cbKeyMost: UInt = 0u,
)

public data class JET_INDEXCREATE_W_0(public var lcid: UInt = 0u, public var pidxunicode: Long = 0L)

public data class JET_INDEXCREATE_W_1(public var cbVarSegMac: UInt = 0u, public var ptuplelimits: Long = 0L)

public data class JET_INDEXID(public var cbStruct: UInt = 0u, public var rgbIndexId: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JET_INDEXID) return false
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

public class JET_INDEXLIST(
    public var cbStruct: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
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

public data class JET_INDEXRANGE(
    public var cbStruct: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
    public var grbit: UInt = 0u,
)

public data class JET_INDEX_COLUMN(
    public var columnid: UInt = 0u,
    public var relop: JET_RELOP = 0,
    public var pv: Long = 0L,
    public var cb: UInt = 0u,
    public var grbit: UInt = 0u,
)

public data class JET_INDEX_RANGE(
    public var rgStartColumns: Long = 0L,
    public var cStartColumns: UInt = 0u,
    public var rgEndColumns: Long = 0L,
    public var cEndColumns: UInt = 0u,
)

public data class JET_INSTANCE_INFO_A(
    public var hInstanceId: JET_INSTANCE = 0uL,
    public var szInstanceName: PSTR = 0L,
    public var cDatabases: StructuredStorage.JET_API_PTR = StructuredStorage.JET_API_PTR(),
    public var szDatabaseFileName: Long = 0L,
    public var szDatabaseDisplayName: Long = 0L,
    public var szDatabaseSLVFileName_Obsolete: Long = 0L,
)

public data class JET_INSTANCE_INFO_W(
    public var hInstanceId: JET_INSTANCE = 0uL,
    public var szInstanceName: PWSTR = 0L,
    public var cDatabases: StructuredStorage.JET_API_PTR = StructuredStorage.JET_API_PTR(),
    public var szDatabaseFileName: Long = 0L,
    public var szDatabaseDisplayName: Long = 0L,
    public var szDatabaseSLVFileName_Obsolete: Long = 0L,
)

public data class JET_LGPOS(
    public var ib: UShort = 0u,
    public var isec: UShort = 0u,
    public var lGeneration: Int = 0,
)

public data class JET_LOGINFO_A(
    public var cbSize: UInt = 0u,
    public var ulGenLow: UInt = 0u,
    public var ulGenHigh: UInt = 0u,
    public var szBaseName: ByteArray = ByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JET_LOGINFO_A) return false
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

public data class JET_LOGINFO_W(
    public var cbSize: UInt = 0u,
    public var ulGenLow: UInt = 0u,
    public var ulGenHigh: UInt = 0u,
    public var szBaseName: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JET_LOGINFO_W) return false
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

public data class JET_LOGTIME(
    public var bSeconds: Byte = 0,
    public var bMinutes: Byte = 0,
    public var bHours: Byte = 0,
    public var bDay: Byte = 0,
    public var bMonth: Byte = 0,
    public var bYear: Byte = 0,
    public var Anonymous1: JET_LOGTIME_0 = JET_LOGTIME_0(),
    public var Anonymous2: JET_LOGTIME_1 = JET_LOGTIME_1(),
)

public data class JET_LOGTIME_0(public var bFiller1: Byte = 0, public var Anonymous: JET_LOGTIME_0_0 = JET_LOGTIME_0_0())

public data class JET_LOGTIME_0_0(public var _bitfield: UByte = 0u)

public data class JET_LOGTIME_1(public var bFiller2: Byte = 0, public var Anonymous: JET_LOGTIME_1_0 = JET_LOGTIME_1_0())

public data class JET_LOGTIME_1_0(public var _bitfield: UByte = 0u)

public data class JET_OBJECTINFO(
    public var cbStruct: UInt = 0u,
    public var objtyp: UInt = 0u,
    public var dtCreate: Double = 0.0,
    public var dtUpdate: Double = 0.0,
    public var grbit: UInt = 0u,
    public var flags: UInt = 0u,
    public var cRecord: UInt = 0u,
    public var cPage: UInt = 0u,
)

public data class JET_OBJECTLIST(
    public var cbStruct: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
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

public data class JET_OPENTEMPORARYTABLE(
    public var cbStruct: UInt = 0u,
    public var prgcolumndef: Long = 0L,
    public var ccolumn: UInt = 0u,
    public var pidxunicode: Long = 0L,
    public var grbit: UInt = 0u,
    public var prgcolumnid: Long = 0L,
    public var cbKeyMost: UInt = 0u,
    public var cbVarSegMac: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
)

public data class JET_OPENTEMPORARYTABLE2(
    public var cbStruct: UInt = 0u,
    public var prgcolumndef: Long = 0L,
    public var ccolumn: UInt = 0u,
    public var pidxunicode: Long = 0L,
    public var grbit: UInt = 0u,
    public var prgcolumnid: Long = 0L,
    public var cbKeyMost: UInt = 0u,
    public var cbVarSegMac: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
)

public data class JET_OPERATIONCONTEXT(
    public var ulUserID: UInt = 0u,
    public var nOperationID: UByte = 0u,
    public var nOperationType: UByte = 0u,
    public var nClientType: UByte = 0u,
    public var fFlags: UByte = 0u,
)

public data class JET_RECORDLIST(
    public var cbStruct: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
    public var cRecord: UInt = 0u,
    public var columnidBookmark: UInt = 0u,
)

public data class JET_RECPOS(
    public var cbStruct: UInt = 0u,
    public var centriesLT: UInt = 0u,
    public var centriesInRange: UInt = 0u,
    public var centriesTotal: UInt = 0u,
)

public data class JET_RECPOS2(
    public var cbStruct: UInt = 0u,
    public var centriesLTDeprecated: UInt = 0u,
    public var centriesInRangeDeprecated: UInt = 0u,
    public var centriesTotalDeprecated: UInt = 0u,
    public var centriesLT: ULong = 0uL,
    public var centriesTotal: ULong = 0uL,
)

public data class JET_RECSIZE(
    public var cbData: ULong = 0uL,
    public var cbLongValueData: ULong = 0uL,
    public var cbOverhead: ULong = 0uL,
    public var cbLongValueOverhead: ULong = 0uL,
    public var cNonTaggedColumns: ULong = 0uL,
    public var cTaggedColumns: ULong = 0uL,
    public var cLongValues: ULong = 0uL,
    public var cMultiValues: ULong = 0uL,
)

public data class JET_RECSIZE2(
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

public data class JET_RETINFO(
    public var cbStruct: UInt = 0u,
    public var ibLongValue: UInt = 0u,
    public var itagSequence: UInt = 0u,
    public var columnidNextTagged: UInt = 0u,
)

public data class JET_RETRIEVECOLUMN(
    public var columnid: UInt = 0u,
    public var pvData: Long = 0L,
    public var cbData: UInt = 0u,
    public var cbActual: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ibLongValue: UInt = 0u,
    public var itagSequence: UInt = 0u,
    public var columnidNextTagged: UInt = 0u,
    public var err: Int = 0,
)

public data class JET_RSTINFO_A(
    public var cbStruct: UInt = 0u,
    public var rgrstmap: Long = 0L,
    public var crstmap: Int = 0,
    public var lgposStop: JET_LGPOS = JET_LGPOS(),
    public var logtimeStop: JET_LOGTIME = JET_LOGTIME(),
    public var pfnStatus: JET_PFNSTATUS = null,
)

public data class JET_RSTINFO_W(
    public var cbStruct: UInt = 0u,
    public var rgrstmap: Long = 0L,
    public var crstmap: Int = 0,
    public var lgposStop: JET_LGPOS = JET_LGPOS(),
    public var logtimeStop: JET_LOGTIME = JET_LOGTIME(),
    public var pfnStatus: JET_PFNSTATUS = null,
)

public data class JET_RSTMAP_A(public var szDatabaseName: PSTR = 0L, public var szNewDatabaseName: PSTR = 0L)

public data class JET_RSTMAP_W(public var szDatabaseName: PWSTR = 0L, public var szNewDatabaseName: PWSTR = 0L)

public data class JET_SETCOLUMN(
    public var columnid: UInt = 0u,
    public var pvData: Long = 0L,
    public var cbData: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ibLongValue: UInt = 0u,
    public var itagSequence: UInt = 0u,
    public var err: Int = 0,
)

public data class JET_SETINFO(
    public var cbStruct: UInt = 0u,
    public var ibLongValue: UInt = 0u,
    public var itagSequence: UInt = 0u,
)

public data class JET_SETSYSPARAM_A(
    public var paramid: UInt = 0u,
    public var lParam: StructuredStorage.JET_API_PTR = StructuredStorage.JET_API_PTR(),
    public var sz: PCSTR = 0L,
    public var err: Int = 0,
)

public data class JET_SETSYSPARAM_W(
    public var paramid: UInt = 0u,
    public var lParam: StructuredStorage.JET_API_PTR = StructuredStorage.JET_API_PTR(),
    public var sz: PCWSTR = 0L,
    public var err: Int = 0,
)

public data class JET_SIGNATURE(
    public var ulRandom: UInt = 0u,
    public var logtimeCreate: JET_LOGTIME = JET_LOGTIME(),
    public var szComputerName: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JET_SIGNATURE) return false
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

public data class JET_SNPROG(
    public var cbStruct: UInt = 0u,
    public var cunitDone: UInt = 0u,
    public var cunitTotal: UInt = 0u,
)

public data class JET_SPACEHINTS(
    public var cbStruct: UInt = 0u,
    public var ulInitialDensity: UInt = 0u,
    public var cbInitial: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulMaintDensity: UInt = 0u,
    public var ulGrowth: UInt = 0u,
    public var cbMinExtent: UInt = 0u,
    public var cbMaxExtent: UInt = 0u,
)

public data class JET_TABLECREATE2_A(
    public var cbStruct: UInt = 0u,
    public var szTableName: PSTR = 0L,
    public var szTemplateTableName: PSTR = 0L,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: Long = 0L,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: Long = 0L,
    public var cIndexes: UInt = 0u,
    public var szCallback: PSTR = 0L,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
    public var cCreated: UInt = 0u,
)

public data class JET_TABLECREATE2_W(
    public var cbStruct: UInt = 0u,
    public var szTableName: PWSTR = 0L,
    public var szTemplateTableName: PWSTR = 0L,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: Long = 0L,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: Long = 0L,
    public var cIndexes: UInt = 0u,
    public var szCallback: PWSTR = 0L,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
    public var cCreated: UInt = 0u,
)

public class JET_TABLECREATE3_A(
    public var cbStruct: UInt = 0u,
    public var szTableName: PSTR = 0L,
    public var szTemplateTableName: PSTR = 0L,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: Long = 0L,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: Long = 0L,
    public var cIndexes: UInt = 0u,
    public var szCallback: PSTR = 0L,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pSeqSpacehints: Long = 0L,
    public var pLVSpacehints: Long = 0L,
    public var cbSeparateLV: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
    public var cCreated: UInt = 0u,
)

public class JET_TABLECREATE3_W(
    public var cbStruct: UInt = 0u,
    public var szTableName: PWSTR = 0L,
    public var szTemplateTableName: PWSTR = 0L,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: Long = 0L,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: Long = 0L,
    public var cIndexes: UInt = 0u,
    public var szCallback: PWSTR = 0L,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pSeqSpacehints: Long = 0L,
    public var pLVSpacehints: Long = 0L,
    public var cbSeparateLV: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
    public var cCreated: UInt = 0u,
)

public class JET_TABLECREATE4_A(
    public var cbStruct: UInt = 0u,
    public var szTableName: PSTR = 0L,
    public var szTemplateTableName: PSTR = 0L,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: Long = 0L,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: Long = 0L,
    public var cIndexes: UInt = 0u,
    public var szCallback: PSTR = 0L,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pSeqSpacehints: Long = 0L,
    public var pLVSpacehints: Long = 0L,
    public var cbSeparateLV: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
    public var cCreated: UInt = 0u,
)

public class JET_TABLECREATE4_W(
    public var cbStruct: UInt = 0u,
    public var szTableName: PWSTR = 0L,
    public var szTemplateTableName: PWSTR = 0L,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: Long = 0L,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: Long = 0L,
    public var cIndexes: UInt = 0u,
    public var szCallback: PWSTR = 0L,
    public var cbtyp: UInt = 0u,
    public var grbit: UInt = 0u,
    public var pSeqSpacehints: Long = 0L,
    public var pLVSpacehints: Long = 0L,
    public var cbSeparateLV: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
    public var cCreated: UInt = 0u,
)

public data class JET_TABLECREATE_A(
    public var cbStruct: UInt = 0u,
    public var szTableName: PSTR = 0L,
    public var szTemplateTableName: PSTR = 0L,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: Long = 0L,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: Long = 0L,
    public var cIndexes: UInt = 0u,
    public var grbit: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
    public var cCreated: UInt = 0u,
)

public data class JET_TABLECREATE_W(
    public var cbStruct: UInt = 0u,
    public var szTableName: PWSTR = 0L,
    public var szTemplateTableName: PWSTR = 0L,
    public var ulPages: UInt = 0u,
    public var ulDensity: UInt = 0u,
    public var rgcolumncreate: Long = 0L,
    public var cColumns: UInt = 0u,
    public var rgindexcreate: Long = 0L,
    public var cIndexes: UInt = 0u,
    public var grbit: UInt = 0u,
    public var tableid: StructuredStorage.JET_TABLEID = StructuredStorage.JET_TABLEID(),
    public var cCreated: UInt = 0u,
)

public data class JET_THREADSTATS(
    public var cbStruct: UInt = 0u,
    public var cPageReferenced: UInt = 0u,
    public var cPageRead: UInt = 0u,
    public var cPagePreread: UInt = 0u,
    public var cPageDirtied: UInt = 0u,
    public var cPageRedirtied: UInt = 0u,
    public var cLogRecord: UInt = 0u,
    public var cbLogRecord: UInt = 0u,
)

public data class JET_THREADSTATS2(
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

public data class JET_TUPLELIMITS(
    public var chLengthMin: UInt = 0u,
    public var chLengthMax: UInt = 0u,
    public var chToIndexMax: UInt = 0u,
    public var cchIncrement: UInt = 0u,
    public var ichStart: UInt = 0u,
)

public data class JET_UNICODEINDEX(public var lcid: UInt = 0u, public var dwMapFlags: UInt = 0u)

public data class JET_UNICODEINDEX2(public var szLocaleName: PWSTR = 0L, public var dwMapFlags: UInt = 0u)

public data class JET_USERDEFINEDDEFAULT_A(
    public var szCallback: PSTR = 0L,
    public var pbUserData: Long = 0L,
    public var cbUserData: UInt = 0u,
    public var szDependantColumns: PSTR = 0L,
)

public data class JET_USERDEFINEDDEFAULT_W(
    public var szCallback: PWSTR = 0L,
    public var pbUserData: Long = 0L,
    public var cbUserData: UInt = 0u,
    public var szDependantColumns: PWSTR = 0L,
)
