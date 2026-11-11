@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.Dbid
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.Fullpropspec
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

public data class AuthenticationInfo(
    public var dwSize: UInt = 0u,
    public var atAuthenticationType: AuthType = 0,
    public var pcwszUser: Pcwstr = null,
    public var pcwszPassword: Pcwstr = null,
)

public data class Bucketcategorize(
    public var cBuckets: UInt = 0u,
    public var distribution: UInt = 0u,
)

public data class Categorization(
    public var ulCatType: UInt = 0u,
    public var anonymous: Categorization0 = Categorization0(),
    public var csColumns: Columnset = Columnset(),
)

public data class Categorization0(
    public var cClusters: UInt = 0u,
    public var bucket: Bucketcategorize = Bucketcategorize(),
    public var range: Rangecategorize = Rangecategorize(),
)

public data class Categorizationset(
    public var cCat: UInt = 0u,
    public var aCat: Categorization? = null,
)

public data class Columnset(
    public var cCol: UInt = 0u,
    public var aCol: Fullpropspec? = null,
)

public data class Contentrestriction(
    public var prop: Fullpropspec = Fullpropspec(),
    public var pwcsPhrase: Pwstr = null,
    public var lcid: UInt = 0u,
    public var ulGenerateMethod: UInt = 0u,
)

public data class DateStruct(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
)

public data class Dbbindext(
    public var pExtension: COpaquePointer? = null,
    public var ulExtension: Int = 0,
)

public data class Dbbinding(
    public var iOrdinal: Int = 0,
    public var obValue: Int = 0,
    public var obLength: Int = 0,
    public var obStatus: Int = 0,
    public var pTypeInfo: COpaquePointer? = null,
    public var pObject: Dbobject? = null,
    public var pBindExt: Dbbindext? = null,
    public var dwPart: UInt = 0u,
    public var dwMemOwner: UInt = 0u,
    public var eParamIO: UInt = 0u,
    public var cbMaxLen: Int = 0,
    public var dwFlags: UInt = 0u,
    public var wType: UShort = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
)

public data class Dbcolumnaccess(
    public var pData: COpaquePointer? = null,
    public var columnid: Dbid = Dbid(),
    public var cbDataLen: Int = 0,
    public var dwStatus: UInt = 0u,
    public var cbMaxLen: Int = 0,
    public var dwReserved: Int = 0,
    public var wType: UShort = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
)

public data class Dbcolumndesc(
    public var pwszTypeName: Pwstr = null,
    public var pTypeInfo: COpaquePointer? = null,
    public var rgPropertySets: Dbpropset? = null,
    public var pclsid: Guid? = null,
    public var cPropertySets: UInt = 0u,
    public var ulColumnSize: Int = 0,
    public var dbcid: Dbid = Dbid(),
    public var wType: UShort = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
)

public data class Dbcolumninfo(
    public var pwszName: Pwstr = null,
    public var pTypeInfo: COpaquePointer? = null,
    public var iOrdinal: Int = 0,
    public var dwFlags: UInt = 0u,
    public var ulColumnSize: Int = 0,
    public var wType: UShort = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
    public var columnid: Dbid = Dbid(),
)

public data class Dbconstraintdesc(
    public var pConstraintID: Dbid? = null,
    public var constraintType: UInt = 0u,
    public var cColumns: Int = 0,
    public var rgColumnList: Dbid? = null,
    public var pReferencedTableID: Dbid? = null,
    public var cForeignKeyColumns: Int = 0,
    public var rgForeignKeyColumnList: Dbid? = null,
    public var pwszConstraintText: Pwstr = null,
    public var updateRule: UInt = 0u,
    public var deleteRule: UInt = 0u,
    public var matchType: UInt = 0u,
    public var deferrability: UInt = 0u,
    public var cReserved: Int = 0,
    public var rgReserved: Dbpropset? = null,
)

public data class Dbcost(
    public var eKind: UInt = 0u,
    public var dwUnits: UInt = 0u,
    public var lValue: Int = 0,
)

public data class Dbdate(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
)

public data class Dbdatetim4(
    public var numdays: UShort = 0u,
    public var nummins: UShort = 0u,
)

public data class Dbdatetime(
    public var dtdays: Int = 0,
    public var dttime: UInt = 0u,
)

public data class Dbfailureinfo(
    public var hRow: Int = 0,
    public var iColumn: Int = 0,
    public var failure: Hresult = 0,
)

public data class Dbimplicitsession(
    public var pUnkOuter: COpaquePointer? = null,
    public var piid: Guid? = null,
    public var pSession: COpaquePointer? = null,
)

public data class Dbindexcolumndesc(
    public var pColumnID: Dbid? = null,
    public var eIndexColOrder: UInt = 0u,
)

public data class Dbliteralinfo(
    public var pwszLiteralValue: Pwstr = null,
    public var pwszInvalidChars: Pwstr = null,
    public var pwszInvalidStartingChars: Pwstr = null,
    public var lt: UInt = 0u,
    public var fSupported: Bool = 0,
    public var cchMaxLen: UInt = 0u,
)

public data class Dbmoney(
    public var mnyhigh: Int = 0,
    public var mnylow: UInt = 0u,
)

public data class Dbobject(
    public var dwFlags: UInt = 0u,
    public var iid: Guid = Guid(),
)

public data class Dbparambindinfo(
    public var pwszDataSourceType: Pwstr = null,
    public var pwszName: Pwstr = null,
    public var ulParamSize: Int = 0,
    public var dwFlags: UInt = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
)

public data class Dbparaminfo(
    public var dwFlags: UInt = 0u,
    public var iOrdinal: Int = 0,
    public var pwszName: Pwstr = null,
    public var pTypeInfo: COpaquePointer? = null,
    public var ulParamSize: Int = 0,
    public var wType: UShort = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
)

public data class Dbparams(
    public var pData: COpaquePointer? = null,
    public var cParamSets: Int = 0,
    public var hAccessor: Haccessor = 0,
)

public data class Dbprop(
    public var dwPropertyID: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwStatus: UInt = 0u,
    public var colid: Dbid = Dbid(),
    public var vValue: Variant = Variant(),
)

public data class Dbpropidset(
    public var rgPropertyIDs: UInt? = null,
    public var cPropertyIDs: UInt = 0u,
    public var guidPropertySet: Guid = Guid(),
)

public data class Dbpropinfo(
    public var pwszDescription: Pwstr = null,
    public var dwPropertyID: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var vtType: Varenum = 0u,
    public var vValues: Variant = Variant(),
)

public data class Dbpropinfoset(
    public var rgPropertyInfos: Dbpropinfo? = null,
    public var cPropertyInfos: UInt = 0u,
    public var guidPropertySet: Guid = Guid(),
)

public data class Dbpropset(
    public var rgProperties: Dbprop? = null,
    public var cProperties: UInt = 0u,
    public var guidPropertySet: Guid = Guid(),
)

public data class Dbrowwatchchange(
    public var hRegion: Int = 0,
    public var eChangeKind: UInt = 0u,
    public var hRow: Int = 0,
    public var iRow: Int = 0,
)

public data class Dbtime(
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
)

public data class Dbtimestamp(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
    public var fraction: UInt = 0u,
)

public data class Dbvarybin(
    public var len: Short = 0,
    public var array: UByteArray = UByteArray(8001),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbvarybin) return false
        if (this.len != other.len) return false
        if (!this.array.contentEquals(other.array)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.array.contentHashCode()
        return result
    }
}

public data class Dbvarychar(
    public var len: Short = 0,
    public var str: ByteArray = ByteArray(8001),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbvarychar) return false
        if (this.len != other.len) return false
        if (!this.str.contentEquals(other.str)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.str.contentHashCode()
        return result
    }
}

public data class Dbvector(
    public var size: Int = 0,
    public var ptr: COpaquePointer? = null,
)

public data class DbNumeric(
    public var precision: UByte = 0u,
    public var scale: UByte = 0u,
    public var sign: UByte = 0u,
    public var value: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DbNumeric) return false
        if (this.precision != other.precision) return false
        if (this.scale != other.scale) return false
        if (this.sign != other.sign) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.precision.hashCode()
        result = 31 * result + this.scale.hashCode()
        result = 31 * result + this.sign.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class DbVarnumeric(
    public var precision: UByte = 0u,
    public var scale: Byte = 0,
    public var sign: UByte = 0u,
    public var value: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DbVarnumeric) return false
        if (this.precision != other.precision) return false
        if (this.scale != other.scale) return false
        if (this.sign != other.sign) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.precision.hashCode()
        result = 31 * result + this.scale.hashCode()
        result = 31 * result + this.sign.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class Dcinfo(
    public var eInfoType: UInt = 0u,
    public var vData: Variant = Variant(),
)

public data class Errorinfo(
    public var hrError: Hresult = 0,
    public var dwMinor: UInt = 0u,
    public var clsid: Guid = Guid(),
    public var iid: Guid = Guid(),
    public var dispid: Int = 0,
)

public data class FilteredDataSources(
    public var pwcsExtension: Pcwstr = null,
    public var pwcsMime: Pcwstr = null,
    public var pClsid: Guid? = null,
    public var pwcsOverride: Pcwstr = null,
)

public data class Hitrange(
    public var iPosition: UInt = 0u,
    public var cLength: UInt = 0u,
)

public data class IncrementalAccessInfo(
    public var dwSize: UInt = 0u,
    public var ftLastModifiedTime: Filetime = Filetime(),
)

public data class Itemprop(
    public var variantValue: Variant = Variant(),
    public var pwszName: Pwstr = null,
)

public data class ItemInfo(
    public var dwSize: UInt = 0u,
    public var pcwszFromEMail: Pcwstr = null,
    public var pcwszApplicationName: Pcwstr = null,
    public var pcwszCatalogName: Pcwstr = null,
    public var pcwszContentClass: Pcwstr = null,
)

public data class Kaggetdiag(
    public var ulSize: UInt = 0u,
    public var vDiagInfo: Variant = Variant(),
    public var sDiagField: Short = 0,
)

public data class Kagreqdiag(
    public var ulDiagFlags: UInt = 0u,
    public var vt: Varenum = 0u,
    public var sDiagField: Short = 0,
)

public data class Mdaxisinfo(
    public var cbSize: Int = 0,
    public var iAxis: Int = 0,
    public var cDimensions: Int = 0,
    public var cCoordinates: Int = 0,
    public var rgcColumns: Int? = null,
    public var rgpwszDimensionNames: Pwstr = null,
)

public data class Natlanguagerestriction(
    public var prop: Fullpropspec = Fullpropspec(),
    public var pwcsPhrase: Pwstr = null,
    public var lcid: UInt = 0u,
)

public data class Noderestriction(
    public var cRes: UInt = 0u,
    public var paRes: COpaquePointer? = null,
    public var reserved: UInt = 0u,
)

public data class Notrestriction(
    public var pRes: Restriction? = null,
)

public data class OdbcVsArgs(
    public var pguidEvent: Guid? = null,
    public var dwFlags: UInt = 0u,
    public var anonymous1: OdbcVsArgs0 = OdbcVsArgs0(),
    public var anonymous2: OdbcVsArgs1 = OdbcVsArgs1(),
    public var retCode: Short = 0,
)

public data class OdbcVsArgs0(
    public var wszArg: Pwstr = null,
    public var szArg: Pstr = null,
)

public data class OdbcVsArgs1(
    public var wszCorrelation: Pwstr = null,
    public var szCorrelation: Pstr = null,
)

public data class Propertyrestriction(
    public var rel: UInt = 0u,
    public var prop: Fullpropspec = Fullpropspec(),
    public var prval: Propvariant = Propvariant(),
)

public data class ProxyInfo(
    public var dwSize: UInt = 0u,
    public var pcwszUserAgent: Pcwstr = null,
    public var paUseProxy: ProxyAccess = 0,
    public var fLocalBypass: Bool = 0,
    public var dwPortNumber: UInt = 0u,
    public var pcwszProxyName: Pcwstr = null,
    public var pcwszBypassList: Pcwstr = null,
)

public data class Rangecategorize(
    public var cRange: UInt = 0u,
    public var aRangeBegin: Propvariant? = null,
)

public data class Restriction(
    public var rt: UInt = 0u,
    public var weight: UInt = 0u,
    public var res: Restriction0 = Restriction0(),
)

public data class Restriction0(
    public var ar: Noderestriction = Noderestriction(),
    public var orRestriction: Noderestriction = Noderestriction(),
    public var pxr: Noderestriction = Noderestriction(),
    public var vr: Vectorrestriction = Vectorrestriction(),
    public var nr: Notrestriction = Notrestriction(),
    public var cr: Contentrestriction = Contentrestriction(),
    public var nlr: Natlanguagerestriction = Natlanguagerestriction(),
    public var pr: Propertyrestriction = Propertyrestriction(),
)

public data class Rmtpack(
    public var pISeqStream: COpaquePointer? = null,
    public var cbData: UInt = 0u,
    public var cBSTR: UInt = 0u,
    public var rgBSTR: Bstr = null,
    public var cVARIANT: UInt = 0u,
    public var rgVARIANT: Variant? = null,
    public var cIDISPATCH: UInt = 0u,
    public var rgIDISPATCH: COpaquePointer? = null,
    public var cIUNKNOWN: UInt = 0u,
    public var rgIUNKNOWN: COpaquePointer? = null,
    public var cPROPVARIANT: UInt = 0u,
    public var rgPROPVARIANT: Propvariant? = null,
    public var cArray: UInt = 0u,
    public var rgArray: Variant? = null,
)

public data class SearchColumnProperties(
    public var value: Propvariant = Propvariant(),
    public var lcid: UInt = 0u,
)

public data class SearchItemChange(
    public var change: SearchKindOfChange = 0,
    public var priority: SearchNotificationPriority = 0,
    public var pUserData: Blob? = null,
    public var lpwszURL: Pwstr = null,
    public var lpwszOldURL: Pwstr = null,
)

public data class SearchItemIndexingStatus(
    public var dwDocID: UInt = 0u,
    public var hrIndexingStatus: Hresult = 0,
)

public data class SearchItemPersistentChange(
    public var change: SearchKindOfChange = 0,
    public var url: Pwstr = null,
    public var oldURL: Pwstr = null,
    public var priority: SearchNotificationPriority = 0,
)

public data class SecObject(
    public var cObjects: UInt = 0u,
    public var prgObjects: SecObjectElement? = null,
)

public data class SecObjectElement(
    public var guidObjectType: Guid = Guid(),
    public var objectID: Dbid = Dbid(),
)

public data class Sortkey(
    public var propColumn: Fullpropspec = Fullpropspec(),
    public var dwOrder: UInt = 0u,
    public var locale: UInt = 0u,
)

public data class Sortset(
    public var cCol: UInt = 0u,
    public var aCol: Sortkey? = null,
)

public class Sqlperf(
    public var timerResolution: UInt = 0u,
    public var sQLidu: UInt = 0u,
    public var sQLiduRows: UInt = 0u,
    public var sQLSelects: UInt = 0u,
    public var sQLSelectRows: UInt = 0u,
    public var transactions: UInt = 0u,
    public var sQLPrepares: UInt = 0u,
    public var execDirects: UInt = 0u,
    public var sQLExecutes: UInt = 0u,
    public var cursorOpens: UInt = 0u,
    public var cursorSize: UInt = 0u,
    public var cursorUsed: UInt = 0u,
    public var percentCursorUsed: Double = 0.0,
    public var avgFetchTime: Double = 0.0,
    public var avgCursorSize: Double = 0.0,
    public var avgCursorUsed: Double = 0.0,
    public var sQLFetchTime: UInt = 0u,
    public var sQLFetchCount: UInt = 0u,
    public var currentStmtCount: UInt = 0u,
    public var maxOpenStmt: UInt = 0u,
    public var sumOpenStmt: UInt = 0u,
    public var currentConnectionCount: UInt = 0u,
    public var maxConnectionsOpened: UInt = 0u,
    public var sumConnectionsOpened: UInt = 0u,
    public var sumConnectiontime: UInt = 0u,
    public var avgTimeOpened: Double = 0.0,
    public var serverRndTrips: UInt = 0u,
    public var buffersSent: UInt = 0u,
    public var buffersRec: UInt = 0u,
    public var bytesSent: UInt = 0u,
    public var bytesRec: UInt = 0u,
    public var msExecutionTime: UInt = 0u,
    public var msNetWorkServerTime: UInt = 0u,
)

public data class SqlDaySecondStruct(
    public var day: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var fraction: UInt = 0u,
)

public data class SqlIntervalStruct(
    public var intervalType: Sqlinterval = 0,
    public var intervalSign: Short = 0,
    public var intval: SqlIntervalStruct0 = SqlIntervalStruct0(),
)

public data class SqlIntervalStruct0(
    public var yearMonth: SqlYearMonthStruct = SqlYearMonthStruct(),
    public var daySecond: SqlDaySecondStruct = SqlDaySecondStruct(),
)

public data class SqlNumericStruct(
    public var precision: UByte = 0u,
    public var scale: Byte = 0,
    public var sign: UByte = 0u,
    public var value: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SqlNumericStruct) return false
        if (this.precision != other.precision) return false
        if (this.scale != other.scale) return false
        if (this.sign != other.sign) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.precision.hashCode()
        result = 31 * result + this.scale.hashCode()
        result = 31 * result + this.sign.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class SqlYearMonthStruct(
    public var year: UInt = 0u,
    public var month: UInt = 0u,
)

public data class Sserrorinfo(
    public var pwszMessage: Pwstr = null,
    public var pwszServer: Pwstr = null,
    public var pwszProcedure: Pwstr = null,
    public var lNative: Int = 0,
    public var bState: UByte = 0u,
    public var bClass: UByte = 0u,
    public var wLineNumber: UShort = 0u,
)

public data class Ssvariant(
    public var vt: UShort = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var anonymous: Ssvariant0 = Ssvariant0(),
)

public data class Ssvariant0(
    public var bTinyIntVal: UByte = 0u,
    public var sShortIntVal: Short = 0,
    public var lIntVal: Int = 0,
    public var llBigIntVal: Long = 0L,
    public var fltRealVal: Float = 0.0f,
    public var dblFloatVal: Double = 0.0,
    public var cyMoneyVal: CY = CY(),
    public var nCharVal: Ssvariant00 = Ssvariant00(),
    public var charVal: Ssvariant01 = Ssvariant01(),
    public var fBitVal: VariantBool = 0,
    public var rgbGuidVal: UByteArray = UByteArray(16),
    public var numNumericVal: DbNumeric = DbNumeric(),
    public var binaryVal: Ssvariant02 = Ssvariant02(),
    public var tsDateTimeVal: Dbtimestamp = Dbtimestamp(),
    public var unknownType: Ssvariant03 = Ssvariant03(),
    public var bLOBType: Ssvariant04 = Ssvariant04(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ssvariant0) return false
        if (this.bTinyIntVal != other.bTinyIntVal) return false
        if (this.sShortIntVal != other.sShortIntVal) return false
        if (this.lIntVal != other.lIntVal) return false
        if (this.llBigIntVal != other.llBigIntVal) return false
        if (this.fltRealVal != other.fltRealVal) return false
        if (this.dblFloatVal != other.dblFloatVal) return false
        if (this.cyMoneyVal != other.cyMoneyVal) return false
        if (this.nCharVal != other.nCharVal) return false
        if (this.charVal != other.charVal) return false
        if (this.fBitVal != other.fBitVal) return false
        if (!this.rgbGuidVal.contentEquals(other.rgbGuidVal)) return false
        if (this.numNumericVal != other.numNumericVal) return false
        if (this.binaryVal != other.binaryVal) return false
        if (this.tsDateTimeVal != other.tsDateTimeVal) return false
        if (this.unknownType != other.unknownType) return false
        if (this.bLOBType != other.bLOBType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bTinyIntVal.hashCode()
        result = 31 * result + this.sShortIntVal.hashCode()
        result = 31 * result + this.lIntVal.hashCode()
        result = 31 * result + this.llBigIntVal.hashCode()
        result = 31 * result + this.fltRealVal.hashCode()
        result = 31 * result + this.dblFloatVal.hashCode()
        result = 31 * result + this.cyMoneyVal.hashCode()
        result = 31 * result + this.nCharVal.hashCode()
        result = 31 * result + this.charVal.hashCode()
        result = 31 * result + this.fBitVal.hashCode()
        result = 31 * result + this.rgbGuidVal.contentHashCode()
        result = 31 * result + this.numNumericVal.hashCode()
        result = 31 * result + this.binaryVal.hashCode()
        result = 31 * result + this.tsDateTimeVal.hashCode()
        result = 31 * result + this.unknownType.hashCode()
        result = 31 * result + this.bLOBType.hashCode()
        return result
    }
}

public data class Ssvariant04(
    public var dbobj: Dbobject = Dbobject(),
    public var pUnk: COpaquePointer? = null,
)

public data class Ssvariant02(
    public var sActualLength: Short = 0,
    public var sMaxLength: Short = 0,
    public var prgbBinaryVal: COpaquePointer? = null,
    public var dwReserved: UInt = 0u,
)

public data class Ssvariant01(
    public var sActualLength: Short = 0,
    public var sMaxLength: Short = 0,
    public var pchCharVal: Pstr = null,
    public var rgbReserved: UByteArray = UByteArray(5),
    public var dwReserved: UInt = 0u,
    public var pwchReserved: Pwstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ssvariant01) return false
        if (this.sActualLength != other.sActualLength) return false
        if (this.sMaxLength != other.sMaxLength) return false
        if (this.pchCharVal != other.pchCharVal) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pwchReserved != other.pwchReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sActualLength.hashCode()
        result = 31 * result + this.sMaxLength.hashCode()
        result = 31 * result + this.pchCharVal.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pwchReserved.hashCode()
        return result
    }
}

public data class Ssvariant00(
    public var sActualLength: Short = 0,
    public var sMaxLength: Short = 0,
    public var pwchNCharVal: Pwstr = null,
    public var rgbReserved: UByteArray = UByteArray(5),
    public var dwReserved: UInt = 0u,
    public var pwchReserved: Pwstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ssvariant00) return false
        if (this.sActualLength != other.sActualLength) return false
        if (this.sMaxLength != other.sMaxLength) return false
        if (this.pwchNCharVal != other.pwchNCharVal) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pwchReserved != other.pwchReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sActualLength.hashCode()
        result = 31 * result + this.sMaxLength.hashCode()
        result = 31 * result + this.pwchNCharVal.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pwchReserved.hashCode()
        return result
    }
}

public data class Ssvariant03(
    public var dwActualLength: UInt = 0u,
    public var rgMetadata: UByteArray = UByteArray(16),
    public var pUnknownData: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ssvariant03) return false
        if (this.dwActualLength != other.dwActualLength) return false
        if (!this.rgMetadata.contentEquals(other.rgMetadata)) return false
        if (this.pUnknownData != other.pUnknownData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwActualLength.hashCode()
        result = 31 * result + this.rgMetadata.contentHashCode()
        result = 31 * result + this.pUnknownData.hashCode()
        return result
    }
}

public class Subscriptioninfo(
    public var cbSize: UInt = 0u,
    public var fUpdateFlags: UInt = 0u,
    public var schedule: Subscriptionschedule = 0,
    public var customGroupCookie: Guid = Guid(),
    public var pTrigger: COpaquePointer? = null,
    public var dwRecurseLevels: UInt = 0u,
    public var fWebcrawlerFlags: UInt = 0u,
    public var bMailNotification: Bool = 0,
    public var bGleam: Bool = 0,
    public var bChangesOnly: Bool = 0,
    public var bNeedPassword: Bool = 0,
    public var fChannelFlags: UInt = 0u,
    public var bstrUserName: Bstr = null,
    public var bstrPassword: Bstr = null,
    public var bstrFriendlyName: Bstr = null,
    public var dwMaxSizeKB: UInt = 0u,
    public var subType: Subscriptiontype = 0,
    public var fTaskFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class Subscriptioniteminfo(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwPriority: UInt = 0u,
    public var scheduleGroup: Guid = Guid(),
    public var clsidAgent: Guid = Guid(),
)

public data class TextSource(
    public var pfnFillTextBuffer: Pfnfilltextbuffer = null,
    public var awcBuffer: Pcwstr = null,
    public var iEnd: UInt = 0u,
    public var iCur: UInt = 0u,
)

public data class TimeoutInfo(
    public var dwSize: UInt = 0u,
    public var dwConnectTimeout: UInt = 0u,
    public var dwDataTimeout: UInt = 0u,
)

public data class TimestampStruct(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
    public var fraction: UInt = 0u,
)

public data class TimeStruct(
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
)

public data class Vectorrestriction(
    public var node: Noderestriction = Noderestriction(),
    public var rankMethod: UInt = 0u,
)
