@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY

public data class Adrentry(
    public var ulReserved1: UInt = 0u,
    public var cValues: UInt = 0u,
    public var rgPropVals: SPropValue? = null,
)

public data class Adrlist(
    public var cEntries: UInt = 0u,
    public var aEntries: List<Adrentry> = List(1) { Adrentry() },
)

public class Adrparm(
    public var cbABContEntryID: UInt = 0u,
    public var lpABContEntryID: Entryid? = null,
    public var ulFlags: UInt = 0u,
    public var lpReserved: COpaquePointer? = null,
    public var ulHelpContext: UInt = 0u,
    public var lpszHelpFileName: COpaquePointer? = null,
    public var lpfnABSDI: Lpfnabsdi = null,
    public var lpfnDismiss: Lpfndismiss = null,
    public var lpvDismissContext: COpaquePointer? = null,
    public var lpszCaption: COpaquePointer? = null,
    public var lpszNewEntryTitle: COpaquePointer? = null,
    public var lpszDestWellsTitle: COpaquePointer? = null,
    public var cDestFields: UInt = 0u,
    public var nDestFieldFocus: UInt = 0u,
    public var lppszDestTitles: COpaquePointer? = null,
    public var lpulDestComps: UInt? = null,
    public var lpContRestriction: SRestriction? = null,
    public var lpHierRestriction: SRestriction? = null,
)

public data class Dtblbutton(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulPRControl: UInt = 0u,
)

public data class Dtblcheckbox(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulPRPropertyName: UInt = 0u,
)

public data class Dtblcombobox(
    public var ulbLpszCharsAllowed: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulNumCharsAllowed: UInt = 0u,
    public var ulPRPropertyName: UInt = 0u,
    public var ulPRTableName: UInt = 0u,
)

public data class Dtblddlbx(
    public var ulFlags: UInt = 0u,
    public var ulPRDisplayProperty: UInt = 0u,
    public var ulPRSetProperty: UInt = 0u,
    public var ulPRTableName: UInt = 0u,
)

public data class Dtbledit(
    public var ulbLpszCharsAllowed: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulNumCharsAllowed: UInt = 0u,
    public var ulPropTag: UInt = 0u,
)

public data class Dtblgroupbox(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
)

public data class Dtbllabel(
    public var ulbLpszLabelName: UInt = 0u,
    public var ulFlags: UInt = 0u,
)

public data class Dtbllbx(
    public var ulFlags: UInt = 0u,
    public var ulPRSetProperty: UInt = 0u,
    public var ulPRTableName: UInt = 0u,
)

public data class Dtblmvddlbx(
    public var ulFlags: UInt = 0u,
    public var ulMVPropTag: UInt = 0u,
)

public data class Dtblmvlistbox(
    public var ulFlags: UInt = 0u,
    public var ulMVPropTag: UInt = 0u,
)

public data class Dtblpage(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulbLpszComponent: UInt = 0u,
    public var ulContext: UInt = 0u,
)

public data class Dtblradiobutton(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulcButtons: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var lReturnValue: Int = 0,
)

public data class Dtctl(
    public var ulCtlType: UInt = 0u,
    public var ulCtlFlags: UInt = 0u,
    public var lpbNotif: COpaquePointer? = null,
    public var cbNotif: UInt = 0u,
    public var lpszFilter: COpaquePointer? = null,
    public var ulItemID: UInt = 0u,
    public var ctl: Dtctl0 = Dtctl0(),
)

public data class Dtctl0(
    public var lpv: COpaquePointer? = null,
    public var lplabel: Dtbllabel? = null,
    public var lpedit: Dtbledit? = null,
    public var lplbx: Dtbllbx? = null,
    public var lpcombobox: Dtblcombobox? = null,
    public var lpddlbx: Dtblddlbx? = null,
    public var lpcheckbox: Dtblcheckbox? = null,
    public var lpgroupbox: Dtblgroupbox? = null,
    public var lpbutton: Dtblbutton? = null,
    public var lpradiobutton: Dtblradiobutton? = null,
    public var lpmvlbx: Dtblmvlistbox? = null,
    public var lpmvddlbx: Dtblmvddlbx? = null,
    public var lppage: Dtblpage? = null,
)

public data class Dtpage(
    public var cctl: UInt = 0u,
    public var lpszResourceName: COpaquePointer? = null,
    public var anonymous: Dtpage0 = Dtpage0(),
    public var lpctl: Dtctl? = null,
)

public data class Dtpage0(
    public var lpszComponent: COpaquePointer? = null,
    public var ulItemID: UInt = 0u,
)

public data class Entryid(
    public var abFlags: UByteArray = UByteArray(4),
    public var ab: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Entryid) return false
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

public data class ErrorNotification(
    public var cbEntryID: UInt = 0u,
    public var lpEntryID: Entryid? = null,
    public var scode: Int = 0,
    public var ulFlags: UInt = 0u,
    public var lpMAPIError: Mapierror? = null,
)

public data class ExtendedNotification(
    public var ulEvent: UInt = 0u,
    public var cb: UInt = 0u,
    public var pbEventParameters: COpaquePointer? = null,
)

public data class Flatentry(
    public var cb: UInt = 0u,
    public var abEntry: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Flatentry) return false
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

public data class Flatentrylist(
    public var cEntries: UInt = 0u,
    public var cbEntries: UInt = 0u,
    public var abEntries: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Flatentrylist) return false
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

public data class Flatmtsidlist(
    public var cMTSIDs: UInt = 0u,
    public var cbMTSIDs: UInt = 0u,
    public var abMTSIDs: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Flatmtsidlist) return false
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

public data class FlagList(
    public var cFlags: UInt = 0u,
    public var ulFlag: UIntArray = UIntArray(1),
) {
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

public data class Mapierror(
    public var ulVersion: UInt = 0u,
    public var lpszError: COpaquePointer? = null,
    public var lpszComponent: COpaquePointer? = null,
    public var ulLowLevelError: UInt = 0u,
    public var ulContext: UInt = 0u,
)

public data class Mapinameid(
    public var lpguid: Guid? = null,
    public var ulKind: UInt = 0u,
    public var kind: Mapinameid0 = Mapinameid0(),
)

public data class Mapinameid0(
    public var lID: Int = 0,
    public var lpwstrName: Pwstr = null,
)

public data class Mapiuid(
    public var ab: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mapiuid) return false
        if (!this.ab.contentEquals(other.ab)) return false
        return true
    }

    override fun hashCode(): Int = this.ab.contentHashCode()
}

public data class Mtsid(
    public var cb: UInt = 0u,
    public var ab: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mtsid) return false
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

public data class NewmailNotification(
    public var cbEntryID: UInt = 0u,
    public var lpEntryID: Entryid? = null,
    public var cbParentID: UInt = 0u,
    public var lpParentID: Entryid? = null,
    public var ulFlags: UInt = 0u,
    public var lpszMessageClass: COpaquePointer? = null,
    public var ulMessageFlags: UInt = 0u,
)

public data class Notification(
    public var ulEventType: UInt = 0u,
    public var ulAlignPad: UInt = 0u,
    public var info: Notification0 = Notification0(),
)

public data class Notification0(
    public var err: ErrorNotification = ErrorNotification(),
    public var newmail: NewmailNotification = NewmailNotification(),
    public var obj: ObjectNotification = ObjectNotification(),
    public var tab: TableNotification = TableNotification(),
    public var ext: ExtendedNotification = ExtendedNotification(),
    public var statobj: StatusObjectNotification = StatusObjectNotification(),
)

public data class Notifkey(
    public var cb: UInt = 0u,
    public var ab: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Notifkey) return false
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

public data class ObjectNotification(
    public var cbEntryID: UInt = 0u,
    public var lpEntryID: Entryid? = null,
    public var ulObjType: UInt = 0u,
    public var cbParentID: UInt = 0u,
    public var lpParentID: Entryid? = null,
    public var cbOldID: UInt = 0u,
    public var lpOldID: Entryid? = null,
    public var cbOldParentID: UInt = 0u,
    public var lpOldParentID: Entryid? = null,
    public var lpPropTagArray: SPropTagArray? = null,
)

public data class SAndRestriction(
    public var cRes: UInt = 0u,
    public var lpRes: SRestriction? = null,
)

public data class SAppTimeArray(
    public var cValues: UInt = 0u,
    public var lpat: Double? = null,
)

public data class SBinary(
    public var cb: UInt = 0u,
    public var lpb: COpaquePointer? = null,
)

public data class SBinaryArray(
    public var cValues: UInt = 0u,
    public var lpbin: SBinary? = null,
)

public data class SBitMaskRestriction(
    public var relBMR: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var ulMask: UInt = 0u,
)

public data class SCommentRestriction(
    public var cValues: UInt = 0u,
    public var lpRes: SRestriction? = null,
    public var lpProp: SPropValue? = null,
)

public data class SComparePropsRestriction(
    public var relop: UInt = 0u,
    public var ulPropTag1: UInt = 0u,
    public var ulPropTag2: UInt = 0u,
)

public data class SContentRestriction(
    public var ulFuzzyLevel: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var lpProp: SPropValue? = null,
)

public data class SCurrencyArray(
    public var cValues: UInt = 0u,
    public var lpcur: CY? = null,
)

public data class SDateTimeArray(
    public var cValues: UInt = 0u,
    public var lpft: Filetime? = null,
)

public data class SDoubleArray(
    public var cValues: UInt = 0u,
    public var lpdbl: Double? = null,
)

public data class SExistRestriction(
    public var ulReserved1: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var ulReserved2: UInt = 0u,
)

public data class SGuidArray(
    public var cValues: UInt = 0u,
    public var lpguid: Guid? = null,
)

public data class SLPSTRArray(
    public var cValues: UInt = 0u,
    public var lppszA: Pstr? = null,
)

public data class SLargeIntegerArray(
    public var cValues: UInt = 0u,
    public var lpli: Long? = null,
)

public data class SLongArray(
    public var cValues: UInt = 0u,
    public var lpl: Int? = null,
)

public data class SNotRestriction(
    public var ulReserved: UInt = 0u,
    public var lpRes: SRestriction? = null,
)

public data class SOrRestriction(
    public var cRes: UInt = 0u,
    public var lpRes: SRestriction? = null,
)

public data class SPropProblem(
    public var ulIndex: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var scode: Int = 0,
)

public data class SPropProblemArray(
    public var cProblem: UInt = 0u,
    public var aProblem: List<SPropProblem> = List(1) { SPropProblem() },
)

public data class SPropTagArray(
    public var cValues: UInt = 0u,
    public var aulPropTag: UIntArray = UIntArray(1),
) {
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
    public var value: Upv = Upv(),
)

public data class SPropertyRestriction(
    public var relop: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var lpProp: SPropValue? = null,
)

public data class SRealArray(
    public var cValues: UInt = 0u,
    public var lpflt: Float? = null,
)

public data class SRestriction(
    public var rt: UInt = 0u,
    public var res: Srestriction0 = Srestriction0(),
)

public data class Srestriction0(
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
    public var lpProps: SPropValue? = null,
)

public data class SRowSet(
    public var cRows: UInt = 0u,
    public var aRow: List<SRow> = List(1) { SRow() },
)

public data class SShortArray(
    public var cValues: UInt = 0u,
    public var lpi: Short? = null,
)

public data class SSizeRestriction(
    public var relop: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var cb: UInt = 0u,
)

public data class SSortOrder(
    public var ulPropTag: UInt = 0u,
    public var ulOrder: UInt = 0u,
)

public data class SSortOrderSet(
    public var cSorts: UInt = 0u,
    public var cCategories: UInt = 0u,
    public var cExpanded: UInt = 0u,
    public var aSort: List<SSortOrder> = List(1) { SSortOrder() },
)

public data class SSubRestriction(
    public var ulSubObject: UInt = 0u,
    public var lpRes: SRestriction? = null,
)

public data class StatusObjectNotification(
    public var cbEntryID: UInt = 0u,
    public var lpEntryID: Entryid? = null,
    public var cValues: UInt = 0u,
    public var lpPropVals: SPropValue? = null,
)

public data class SWStringArray(
    public var cValues: UInt = 0u,
    public var lppszW: Pwstr? = null,
)

public data class TableNotification(
    public var ulTableEvent: UInt = 0u,
    public var hResult: Hresult = 0,
    public var propIndex: SPropValue = SPropValue(),
    public var propPrior: SPropValue = SPropValue(),
    public var row: SRow = SRow(),
    public var ulPad: UInt = 0u,
)

public data class Wabextdisplay(
    public var cbSize: UInt = 0u,
    public var lpWABObject: COpaquePointer? = null,
    public var lpAdrBook: COpaquePointer? = null,
    public var lpPropObj: COpaquePointer? = null,
    public var fReadOnly: Bool = 0,
    public var fDataChanged: Bool = 0,
    public var ulFlags: UInt = 0u,
    public var lpv: COpaquePointer? = null,
    public var lpsz: COpaquePointer? = null,
)

public data class Wabimportparam(
    public var cbSize: UInt = 0u,
    public var lpAdrBook: COpaquePointer? = null,
    public var hWnd: Hwnd = null,
    public var ulFlags: UInt = 0u,
    public var lpszFileName: Pstr = null,
)

public data class WabParam(
    public var cbSize: UInt = 0u,
    public var hwnd: Hwnd = null,
    public var szFileName: Pstr = null,
    public var ulFlags: UInt = 0u,
    public var guidPSExt: Guid = Guid(),
)

public class Upv(
    public var i: Short = 0,
    public var l: Int = 0,
    public var ul: UInt = 0u,
    public var flt: Float = 0.0f,
    public var dbl: Double = 0.0,
    public var b: UShort = 0u,
    public var cur: CY = CY(),
    public var at: Double = 0.0,
    public var ft: Filetime = Filetime(),
    public var lpszA: Pstr = null,
    public var bin: SBinary = SBinary(),
    public var lpszW: Pwstr = null,
    public var lpguid: Guid? = null,
    public var li: Long = 0L,
    public var mVi: SShortArray = SShortArray(),
    public var mVl: SLongArray = SLongArray(),
    public var mVflt: SRealArray = SRealArray(),
    public var mVdbl: SDoubleArray = SDoubleArray(),
    public var mVcur: SCurrencyArray = SCurrencyArray(),
    public var mVat: SAppTimeArray = SAppTimeArray(),
    public var mVft: SDateTimeArray = SDateTimeArray(),
    public var mVbin: SBinaryArray = SBinaryArray(),
    public var mVszA: SLPSTRArray = SLPSTRArray(),
    public var mVszW: SWStringArray = SWStringArray(),
    public var mVguid: SGuidArray = SGuidArray(),
    public var mVli: SLargeIntegerArray = SLargeIntegerArray(),
    public var err: Int = 0,
    public var x: Int = 0,
)
