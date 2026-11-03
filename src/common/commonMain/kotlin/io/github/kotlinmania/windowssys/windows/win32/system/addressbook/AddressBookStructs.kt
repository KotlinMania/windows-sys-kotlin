@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ADRENTRY(
    public var ulReserved1: UInt = 0u,
    public var cValues: UInt = 0u,
    public var rgPropVals: Long = 0L,
)

public data class ADRLIST(public var cEntries: UInt = 0u, public var aEntries: List<ADRENTRY> = List(1) { ADRENTRY() })

public class ADRPARM(
    public var cbABContEntryID: UInt = 0u,
    public var lpABContEntryID: Long = 0L,
    public var ulFlags: UInt = 0u,
    public var lpReserved: Long = 0L,
    public var ulHelpContext: UInt = 0u,
    public var lpszHelpFileName: Long = 0L,
    public var lpfnABSDI: LPFNABSDI = null,
    public var lpfnDismiss: LPFNDISMISS = null,
    public var lpvDismissContext: Long = 0L,
    public var lpszCaption: Long = 0L,
    public var lpszNewEntryTitle: Long = 0L,
    public var lpszDestWellsTitle: Long = 0L,
    public var cDestFields: UInt = 0u,
    public var nDestFieldFocus: UInt = 0u,
    public var lppszDestTitles: Long = 0L,
    public var lpulDestComps: Long = 0L,
    public var lpContRestriction: Long = 0L,
    public var lpHierRestriction: Long = 0L,
)

public data class DTBLBUTTON(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulPRControl: UInt = 0u,
)

public data class DTBLCHECKBOX(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulPRPropertyName: UInt = 0u,
)

public data class DTBLCOMBOBOX(
    public var ulbLpszCharsAllowed: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulNumCharsAllowed: UInt = 0u,
    public var ulPRPropertyName: UInt = 0u,
    public var ulPRTableName: UInt = 0u,
)

public data class DTBLDDLBX(
    public var ulFlags: UInt = 0u,
    public var ulPRDisplayProperty: UInt = 0u,
    public var ulPRSetProperty: UInt = 0u,
    public var ulPRTableName: UInt = 0u,
)

public data class DTBLEDIT(
    public var ulbLpszCharsAllowed: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulNumCharsAllowed: UInt = 0u,
    public var ulPropTag: UInt = 0u,
)

public data class DTBLGROUPBOX(public var ulbLpszLabel: UInt = 0u, public var ulFlags: UInt = 0u)

public data class DTBLLABEL(public var ulbLpszLabelName: UInt = 0u, public var ulFlags: UInt = 0u)

public data class DTBLLBX(
    public var ulFlags: UInt = 0u,
    public var ulPRSetProperty: UInt = 0u,
    public var ulPRTableName: UInt = 0u,
)

public data class DTBLMVDDLBX(public var ulFlags: UInt = 0u, public var ulMVPropTag: UInt = 0u)

public data class DTBLMVLISTBOX(public var ulFlags: UInt = 0u, public var ulMVPropTag: UInt = 0u)

public data class DTBLPAGE(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulbLpszComponent: UInt = 0u,
    public var ulContext: UInt = 0u,
)

public data class DTBLRADIOBUTTON(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulcButtons: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var lReturnValue: Int = 0,
)

public data class DTCTL(
    public var ulCtlType: UInt = 0u,
    public var ulCtlFlags: UInt = 0u,
    public var lpbNotif: Long = 0L,
    public var cbNotif: UInt = 0u,
    public var lpszFilter: Long = 0L,
    public var ulItemID: UInt = 0u,
    public var ctl: DTCTL_0 = DTCTL_0(),
)

public data class DTCTL_0(
    public var lpv: Long = 0L,
    public var lplabel: Long = 0L,
    public var lpedit: Long = 0L,
    public var lplbx: Long = 0L,
    public var lpcombobox: Long = 0L,
    public var lpddlbx: Long = 0L,
    public var lpcheckbox: Long = 0L,
    public var lpgroupbox: Long = 0L,
    public var lpbutton: Long = 0L,
    public var lpradiobutton: Long = 0L,
    public var lpmvlbx: Long = 0L,
    public var lpmvddlbx: Long = 0L,
    public var lppage: Long = 0L,
)

public data class DTPAGE(
    public var cctl: UInt = 0u,
    public var lpszResourceName: Long = 0L,
    public var Anonymous: DTPAGE_0 = DTPAGE_0(),
    public var lpctl: Long = 0L,
)

public data class DTPAGE_0(public var lpszComponent: Long = 0L, public var ulItemID: UInt = 0u)

public data class ENTRYID(public var abFlags: UByteArray = UByteArray(4), public var ab: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENTRYID) return false
        if (!this.abFlags.contentEquals(other.abFlags)) return false
        if (!this.ab.contentEquals(other.ab)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.abFlags.contentHashCode()
        result = 31 * result + this.ab.contentHashCode()
        return result
    }
}

public data class ERROR_NOTIFICATION(
    public var cbEntryID: UInt = 0u,
    public var lpEntryID: Long = 0L,
    public var scode: Int = 0,
    public var ulFlags: UInt = 0u,
    public var lpMAPIError: Long = 0L,
)

public data class EXTENDED_NOTIFICATION(
    public var ulEvent: UInt = 0u,
    public var cb: UInt = 0u,
    public var pbEventParameters: Long = 0L,
)

public data class FLATENTRY(public var cb: UInt = 0u, public var abEntry: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLATENTRY) return false
        if (this.cb != other.cb) return false
        if (!this.abEntry.contentEquals(other.abEntry)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.abEntry.contentHashCode()
        return result
    }
}

public data class FLATENTRYLIST(
    public var cEntries: UInt = 0u,
    public var cbEntries: UInt = 0u,
    public var abEntries: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLATENTRYLIST) return false
        if (this.cEntries != other.cEntries) return false
        if (this.cbEntries != other.cbEntries) return false
        if (!this.abEntries.contentEquals(other.abEntries)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.cbEntries.hashCode()
        result = 31 * result + this.abEntries.contentHashCode()
        return result
    }
}

public data class FLATMTSIDLIST(
    public var cMTSIDs: UInt = 0u,
    public var cbMTSIDs: UInt = 0u,
    public var abMTSIDs: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLATMTSIDLIST) return false
        if (this.cMTSIDs != other.cMTSIDs) return false
        if (this.cbMTSIDs != other.cbMTSIDs) return false
        if (!this.abMTSIDs.contentEquals(other.abMTSIDs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cMTSIDs.hashCode()
        result = 31 * result + this.cbMTSIDs.hashCode()
        result = 31 * result + this.abMTSIDs.contentHashCode()
        return result
    }
}

public data class FlagList(public var cFlags: UInt = 0u, public var ulFlag: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlagList) return false
        if (this.cFlags != other.cFlags) return false
        if (!this.ulFlag.contentEquals(other.ulFlag)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cFlags.hashCode()
        result = 31 * result + this.ulFlag.contentHashCode()
        return result
    }
}

public data class MAPIERROR(
    public var ulVersion: UInt = 0u,
    public var lpszError: Long = 0L,
    public var lpszComponent: Long = 0L,
    public var ulLowLevelError: UInt = 0u,
    public var ulContext: UInt = 0u,
)

public data class MAPINAMEID(
    public var lpguid: Long = 0L,
    public var ulKind: UInt = 0u,
    public var Kind: MAPINAMEID_0 = MAPINAMEID_0(),
)

public data class MAPINAMEID_0(public var lID: Int = 0, public var lpwstrName: PWSTR = 0L)

public data class MAPIUID(public var ab: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MAPIUID) return false
        if (!this.ab.contentEquals(other.ab)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.ab.contentHashCode()
    }
}

public data class MTSID(public var cb: UInt = 0u, public var ab: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MTSID) return false
        if (this.cb != other.cb) return false
        if (!this.ab.contentEquals(other.ab)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.ab.contentHashCode()
        return result
    }
}

public data class NEWMAIL_NOTIFICATION(
    public var cbEntryID: UInt = 0u,
    public var lpEntryID: Long = 0L,
    public var cbParentID: UInt = 0u,
    public var lpParentID: Long = 0L,
    public var ulFlags: UInt = 0u,
    public var lpszMessageClass: Long = 0L,
    public var ulMessageFlags: UInt = 0u,
)

public data class NOTIFICATION(
    public var ulEventType: UInt = 0u,
    public var ulAlignPad: UInt = 0u,
    public var info: NOTIFICATION_0 = NOTIFICATION_0(),
)

public data class NOTIFICATION_0(
    public var err: ERROR_NOTIFICATION = ERROR_NOTIFICATION(),
    public var newmail: NEWMAIL_NOTIFICATION = NEWMAIL_NOTIFICATION(),
    public var obj: OBJECT_NOTIFICATION = OBJECT_NOTIFICATION(),
    public var tab: TABLE_NOTIFICATION = TABLE_NOTIFICATION(),
    public var ext: EXTENDED_NOTIFICATION = EXTENDED_NOTIFICATION(),
    public var statobj: STATUS_OBJECT_NOTIFICATION = STATUS_OBJECT_NOTIFICATION(),
)

public data class NOTIFKEY(public var cb: UInt = 0u, public var ab: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NOTIFKEY) return false
        if (this.cb != other.cb) return false
        if (!this.ab.contentEquals(other.ab)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.ab.contentHashCode()
        return result
    }
}

public data class OBJECT_NOTIFICATION(
    public var cbEntryID: UInt = 0u,
    public var lpEntryID: Long = 0L,
    public var ulObjType: UInt = 0u,
    public var cbParentID: UInt = 0u,
    public var lpParentID: Long = 0L,
    public var cbOldID: UInt = 0u,
    public var lpOldID: Long = 0L,
    public var cbOldParentID: UInt = 0u,
    public var lpOldParentID: Long = 0L,
    public var lpPropTagArray: Long = 0L,
)

public data class SAndRestriction(public var cRes: UInt = 0u, public var lpRes: Long = 0L)

public data class SAppTimeArray(public var cValues: UInt = 0u, public var lpat: Long = 0L)

public data class SBinary(public var cb: UInt = 0u, public var lpb: Long = 0L)

public data class SBinaryArray(public var cValues: UInt = 0u, public var lpbin: Long = 0L)

public data class SBitMaskRestriction(
    public var relBMR: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var ulMask: UInt = 0u,
)

public data class SCommentRestriction(
    public var cValues: UInt = 0u,
    public var lpRes: Long = 0L,
    public var lpProp: Long = 0L,
)

public data class SComparePropsRestriction(
    public var relop: UInt = 0u,
    public var ulPropTag1: UInt = 0u,
    public var ulPropTag2: UInt = 0u,
)

public data class SContentRestriction(
    public var ulFuzzyLevel: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var lpProp: Long = 0L,
)

public data class SCurrencyArray(public var cValues: UInt = 0u, public var lpcur: Long = 0L)

public data class SDateTimeArray(public var cValues: UInt = 0u, public var lpft: Long = 0L)

public data class SDoubleArray(public var cValues: UInt = 0u, public var lpdbl: Long = 0L)

public data class SExistRestriction(
    public var ulReserved1: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var ulReserved2: UInt = 0u,
)

public data class SGuidArray(public var cValues: UInt = 0u, public var lpguid: Long = 0L)

public data class SLPSTRArray(public var cValues: UInt = 0u, public var lppszA: Long = 0L)

public data class SLargeIntegerArray(public var cValues: UInt = 0u, public var lpli: Long = 0L)

public data class SLongArray(public var cValues: UInt = 0u, public var lpl: Long = 0L)

public data class SNotRestriction(public var ulReserved: UInt = 0u, public var lpRes: Long = 0L)

public data class SOrRestriction(public var cRes: UInt = 0u, public var lpRes: Long = 0L)

public data class SPropProblem(
    public var ulIndex: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var scode: Int = 0,
)

public data class SPropProblemArray(public var cProblem: UInt = 0u, public var aProblem: List<SPropProblem> = List(1) { SPropProblem() })

public data class SPropTagArray(public var cValues: UInt = 0u, public var aulPropTag: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SPropTagArray) return false
        if (this.cValues != other.cValues) return false
        if (!this.aulPropTag.contentEquals(other.aulPropTag)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.aulPropTag.contentHashCode()
        return result
    }
}

public data class SPropValue(
    public var ulPropTag: UInt = 0u,
    public var dwAlignPad: UInt = 0u,
    public var Value: __UPV = __UPV(),
)

public data class SPropertyRestriction(
    public var relop: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var lpProp: Long = 0L,
)

public data class SRealArray(public var cValues: UInt = 0u, public var lpflt: Long = 0L)

public data class SRestriction(public var rt: UInt = 0u, public var res: SRestriction_0 = SRestriction_0())

public data class SRestriction_0(
    public var resCompareProps: SComparePropsRestriction = SComparePropsRestriction(),
    public var resAnd: SAndRestriction = SAndRestriction(),
    public var resOr: SOrRestriction = SOrRestriction(),
    public var resNot: SNotRestriction = SNotRestriction(),
    public var resContent: SContentRestriction = SContentRestriction(),
    public var resProperty: SPropertyRestriction = SPropertyRestriction(),
    public var resBitMask: SBitMaskRestriction = SBitMaskRestriction(),
    public var resSize: SSizeRestriction = SSizeRestriction(),
    public var resExist: SExistRestriction = SExistRestriction(),
    public var resSub: SSubRestriction = SSubRestriction(),
    public var resComment: SCommentRestriction = SCommentRestriction(),
)

public data class SRow(
    public var ulAdrEntryPad: UInt = 0u,
    public var cValues: UInt = 0u,
    public var lpProps: Long = 0L,
)

public data class SRowSet(public var cRows: UInt = 0u, public var aRow: List<SRow> = List(1) { SRow() })

public data class SShortArray(public var cValues: UInt = 0u, public var lpi: Long = 0L)

public data class SSizeRestriction(
    public var relop: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var cb: UInt = 0u,
)

public data class SSortOrder(public var ulPropTag: UInt = 0u, public var ulOrder: UInt = 0u)

public data class SSortOrderSet(
    public var cSorts: UInt = 0u,
    public var cCategories: UInt = 0u,
    public var cExpanded: UInt = 0u,
    public var aSort: List<SSortOrder> = List(1) { SSortOrder() },
)

public data class SSubRestriction(public var ulSubObject: UInt = 0u, public var lpRes: Long = 0L)

public data class STATUS_OBJECT_NOTIFICATION(
    public var cbEntryID: UInt = 0u,
    public var lpEntryID: Long = 0L,
    public var cValues: UInt = 0u,
    public var lpPropVals: Long = 0L,
)

public data class SWStringArray(public var cValues: UInt = 0u, public var lppszW: Long = 0L)

public data class TABLE_NOTIFICATION(
    public var ulTableEvent: UInt = 0u,
    public var hResult: HRESULT = 0,
    public var propIndex: SPropValue = SPropValue(),
    public var propPrior: SPropValue = SPropValue(),
    public var row: SRow = SRow(),
    public var ulPad: UInt = 0u,
)

public data class WABEXTDISPLAY(
    public var cbSize: UInt = 0u,
    public var lpWABObject: Long = 0L,
    public var lpAdrBook: Long = 0L,
    public var lpPropObj: Long = 0L,
    public var fReadOnly: BOOL = 0,
    public var fDataChanged: BOOL = 0,
    public var ulFlags: UInt = 0u,
    public var lpv: Long = 0L,
    public var lpsz: Long = 0L,
)

public data class WABIMPORTPARAM(
    public var cbSize: UInt = 0u,
    public var lpAdrBook: Long = 0L,
    public var hWnd: Foundation.HWND = Foundation.HWND(),
    public var ulFlags: UInt = 0u,
    public var lpszFileName: PSTR = 0L,
)

public data class WAB_PARAM(
    public var cbSize: UInt = 0u,
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var szFileName: PSTR = 0L,
    public var ulFlags: UInt = 0u,
    public var guidPSExt: GUID = GUID(),
)

public class __UPV(
    public var i: Short = 0,
    public var l: Int = 0,
    public var ul: UInt = 0u,
    public var flt: Float = 0.0f,
    public var dbl: Double = 0.0,
    public var b: UShort = 0u,
    public var cur: Com.CY = Com.CY(),
    public var at: Double = 0.0,
    public var ft: Foundation.FILETIME = Foundation.FILETIME(),
    public var lpszA: PSTR = 0L,
    public var bin: SBinary = SBinary(),
    public var lpszW: PWSTR = 0L,
    public var lpguid: Long = 0L,
    public var li: Long = 0L,
    public var MVi: SShortArray = SShortArray(),
    public var MVl: SLongArray = SLongArray(),
    public var MVflt: SRealArray = SRealArray(),
    public var MVdbl: SDoubleArray = SDoubleArray(),
    public var MVcur: SCurrencyArray = SCurrencyArray(),
    public var MVat: SAppTimeArray = SAppTimeArray(),
    public var MVft: SDateTimeArray = SDateTimeArray(),
    public var MVbin: SBinaryArray = SBinaryArray(),
    public var MVszA: SLPSTRArray = SLPSTRArray(),
    public var MVszW: SWStringArray = SWStringArray(),
    public var MVguid: SGuidArray = SGuidArray(),
    public var MVli: SLargeIntegerArray = SLargeIntegerArray(),
    public var err: Int = 0,
    public var x: Int = 0,
)
