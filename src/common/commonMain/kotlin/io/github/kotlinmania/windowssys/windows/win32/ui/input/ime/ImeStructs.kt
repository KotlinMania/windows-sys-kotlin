@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfonta
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public data class Appletidlist(public var count: Int = 0, public var pIIDList: Guid? = null)

public data class Applycandexparam(
    public var dwSize: UInt = 0u,
    public var lpwstrDisplay: Pwstr = null,
    public var lpwstrReading: Pwstr = null,
    public var dwReserved: UInt = 0u,
)

public data class Candidateform(
    public var dwIndex: UInt = 0u,
    public var dwStyle: UInt = 0u,
    public var ptCurrentPos: Point = Point(),
    public var rcArea: Rect = Rect(),
)

public data class Candidateinfo(
    public var dwSize: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var dwOffset: UIntArray = UIntArray(32),
    public var dwPrivateSize: UInt = 0u,
    public var dwPrivateOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Candidateinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwCount != other.dwCount) return false
        if (!this.dwOffset.contentEquals(other.dwOffset)) return false
        if (this.dwPrivateSize != other.dwPrivateSize) return false
        if (this.dwPrivateOffset != other.dwPrivateOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwCount.hashCode()
        result = 31 * result + this.dwOffset.contentHashCode()
        result = 31 * result + this.dwPrivateSize.hashCode()
        result = 31 * result + this.dwPrivateOffset.hashCode()
        return result
    }
}

public data class Candidatelist(
    public var dwSize: UInt = 0u,
    public var dwStyle: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var dwSelection: UInt = 0u,
    public var dwPageStart: UInt = 0u,
    public var dwPageSize: UInt = 0u,
    public var dwOffset: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Candidatelist) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.dwCount != other.dwCount) return false
        if (this.dwSelection != other.dwSelection) return false
        if (this.dwPageStart != other.dwPageStart) return false
        if (this.dwPageSize != other.dwPageSize) return false
        if (!this.dwOffset.contentEquals(other.dwOffset)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.dwCount.hashCode()
        result = 31 * result + this.dwSelection.hashCode()
        result = 31 * result + this.dwPageStart.hashCode()
        result = 31 * result + this.dwPageSize.hashCode()
        result = 31 * result + this.dwOffset.contentHashCode()
        return result
    }
}

public data class Compositionform(
    public var dwStyle: UInt = 0u,
    public var ptCurrentPos: Point = Point(),
    public var rcArea: Rect = Rect(),
)

public class Compositionstring(
    public var dwSize: UInt = 0u,
    public var dwCompReadAttrLen: UInt = 0u,
    public var dwCompReadAttrOffset: UInt = 0u,
    public var dwCompReadClauseLen: UInt = 0u,
    public var dwCompReadClauseOffset: UInt = 0u,
    public var dwCompReadStrLen: UInt = 0u,
    public var dwCompReadStrOffset: UInt = 0u,
    public var dwCompAttrLen: UInt = 0u,
    public var dwCompAttrOffset: UInt = 0u,
    public var dwCompClauseLen: UInt = 0u,
    public var dwCompClauseOffset: UInt = 0u,
    public var dwCompStrLen: UInt = 0u,
    public var dwCompStrOffset: UInt = 0u,
    public var dwCursorPos: UInt = 0u,
    public var dwDeltaStart: UInt = 0u,
    public var dwResultReadClauseLen: UInt = 0u,
    public var dwResultReadClauseOffset: UInt = 0u,
    public var dwResultReadStrLen: UInt = 0u,
    public var dwResultReadStrOffset: UInt = 0u,
    public var dwResultClauseLen: UInt = 0u,
    public var dwResultClauseOffset: UInt = 0u,
    public var dwResultStrLen: UInt = 0u,
    public var dwResultStrOffset: UInt = 0u,
    public var dwPrivateSize: UInt = 0u,
    public var dwPrivateOffset: UInt = 0u,
)

public data class Guideline(
    public var dwSize: UInt = 0u,
    public var dwLevel: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwStrLen: UInt = 0u,
    public var dwStrOffset: UInt = 0u,
    public var dwPrivateSize: UInt = 0u,
    public var dwPrivateOffset: UInt = 0u,
)

public data class Imeappletcfg(
    public var dwConfig: UInt = 0u,
    public var wchTitle: UShortArray = UShortArray(64),
    public var wchTitleFontFace: UShortArray = UShortArray(32),
    public var dwCharSet: UInt = 0u,
    public var iCategory: Int = 0,
    public var hIcon: Hicon = null,
    public var langID: UShort = 0u,
    public var dummy: UShort = 0u,
    public var lReserved1: Lparam = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imeappletcfg) return false
        if (this.dwConfig != other.dwConfig) return false
        if (!this.wchTitle.contentEquals(other.wchTitle)) return false
        if (!this.wchTitleFontFace.contentEquals(other.wchTitleFontFace)) return false
        if (this.dwCharSet != other.dwCharSet) return false
        if (this.iCategory != other.iCategory) return false
        if (this.hIcon != other.hIcon) return false
        if (this.langID != other.langID) return false
        if (this.dummy != other.dummy) return false
        if (this.lReserved1 != other.lReserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwConfig.hashCode()
        result = 31 * result + this.wchTitle.contentHashCode()
        result = 31 * result + this.wchTitleFontFace.contentHashCode()
        result = 31 * result + this.dwCharSet.hashCode()
        result = 31 * result + this.iCategory.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.langID.hashCode()
        result = 31 * result + this.dummy.hashCode()
        result = 31 * result + this.lReserved1.hashCode()
        return result
    }
}

public data class Imeappletui(
    public var hwnd: Hwnd = null,
    public var dwStyle: UInt = 0u,
    public var width: Int = 0,
    public var height: Int = 0,
    public var minWidth: Int = 0,
    public var minHeight: Int = 0,
    public var maxWidth: Int = 0,
    public var maxHeight: Int = 0,
    public var lReserved1: Lparam = 0L,
    public var lReserved2: Lparam = 0L,
)

public data class Imecharinfo(public var wch: UShort = 0u, public var dwCharInfo: UInt = 0u)

public data class Imecharposition(
    public var dwSize: UInt = 0u,
    public var dwCharPos: UInt = 0u,
    public var pt: Point = Point(),
    public var cLineHeight: UInt = 0u,
    public var rcDocument: Rect = Rect(),
)

public data class Imecompositionstringinfo(
    public var iCompStrLen: Int = 0,
    public var iCaretPos: Int = 0,
    public var iEditStart: Int = 0,
    public var iEditLen: Int = 0,
    public var iTargetStart: Int = 0,
    public var iTargetLen: Int = 0,
)

public data class Imedlg(
    public var cbIMEDLG: Int = 0,
    public var hwnd: Hwnd = null,
    public var lpwstrWord: Pwstr = null,
    public var nTabId: Int = 0,
)

public data class Imedp(
    public var wrdModifier: Imewrd = Imewrd(),
    public var wrdModifiee: Imewrd = Imewrd(),
    public var relID: Imerel = 0,
)

public data class Imefareastinfo(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwData: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imefareastinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (!this.dwData.contentEquals(other.dwData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwData.contentHashCode()
        return result
    }
}

public data class Imeinfo(
    public var dwPrivateDataSize: UInt = 0u,
    public var fdwProperty: UInt = 0u,
    public var fdwConversionCaps: UInt = 0u,
    public var fdwSentenceCaps: UInt = 0u,
    public var fdwUICaps: UInt = 0u,
    public var fdwSCSCaps: UInt = 0u,
    public var fdwSelectCaps: UInt = 0u,
)

public data class Imeitem(
    public var cbSize: Int = 0,
    public var iType: Int = 0,
    public var lpItemData: COpaquePointer? = null,
)

public data class Imeitemcandidate(public var uCount: UInt = 0u, public var imeItem: List<Imeitem> = List(1) { Imeitem() })

public data class Imekms(
    public var cbSize: Int = 0,
    public var hIMC: Himc = null,
    public var cKeyList: UInt = 0u,
    public var pKeyList: Imekmskey? = null,
)

public data class Imekmsfuncdesc(
    public var cbSize: Int = 0,
    public var idLang: UShort = 0u,
    public var dwControl: UInt = 0u,
    public var pwszDescription: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imekmsfuncdesc) return false
        if (this.cbSize != other.cbSize) return false
        if (this.idLang != other.idLang) return false
        if (this.dwControl != other.dwControl) return false
        if (!this.pwszDescription.contentEquals(other.pwszDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.idLang.hashCode()
        result = 31 * result + this.dwControl.hashCode()
        result = 31 * result + this.pwszDescription.contentHashCode()
        return result
    }
}

public data class Imekmsinit(public var cbSize: Int = 0, public var hWnd: Hwnd = null)

public data class Imekmsinvk(
    public var cbSize: Int = 0,
    public var hIMC: Himc = null,
    public var dwControl: UInt = 0u,
)

public data class Imekmskey(
    public var dwStatus: UInt = 0u,
    public var dwCompStatus: UInt = 0u,
    public var dwVKEY: UInt = 0u,
    public var anonymous1: Imekmskey0 = Imekmskey0(),
    public var anonymous2: Imekmskey1 = Imekmskey1(),
)

public data class Imekmskey0(public var dwControl: UInt = 0u, public var dwNotUsed: UInt = 0u)

public data class Imekmskey1(public var pwszDscr: UShortArray = UShortArray(31), public var pwszNoUse: UShortArray = UShortArray(31)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imekmskey1) return false
        if (!this.pwszDscr.contentEquals(other.pwszDscr)) return false
        if (!this.pwszNoUse.contentEquals(other.pwszNoUse)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszDscr.contentHashCode()
        result = 31 * result + this.pwszNoUse.contentHashCode()
        return result
    }
}

public data class Imekmskmp(
    public var cbSize: Int = 0,
    public var hIMC: Himc = null,
    public var idLang: UShort = 0u,
    public var wVKStart: UShort = 0u,
    public var wVKEnd: UShort = 0u,
    public var cKeyList: Int = 0,
    public var pKeyList: Imekmskey? = null,
)

public data class Imekmsntfy(
    public var cbSize: Int = 0,
    public var hIMC: Himc = null,
    public var fSelect: Bool = 0,
)

public data class Imemenuiteminfoa(
    public var cbSize: UInt = 0u,
    public var fType: UInt = 0u,
    public var fState: UInt = 0u,
    public var wID: UInt = 0u,
    public var hbmpChecked: Hbitmap = null,
    public var hbmpUnchecked: Hbitmap = null,
    public var dwItemData: UInt = 0u,
    public var szString: ByteArray = ByteArray(80),
    public var hbmpItem: Hbitmap = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imemenuiteminfoa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fType != other.fType) return false
        if (this.fState != other.fState) return false
        if (this.wID != other.wID) return false
        if (this.hbmpChecked != other.hbmpChecked) return false
        if (this.hbmpUnchecked != other.hbmpUnchecked) return false
        if (this.dwItemData != other.dwItemData) return false
        if (!this.szString.contentEquals(other.szString)) return false
        if (this.hbmpItem != other.hbmpItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fType.hashCode()
        result = 31 * result + this.fState.hashCode()
        result = 31 * result + this.wID.hashCode()
        result = 31 * result + this.hbmpChecked.hashCode()
        result = 31 * result + this.hbmpUnchecked.hashCode()
        result = 31 * result + this.dwItemData.hashCode()
        result = 31 * result + this.szString.contentHashCode()
        result = 31 * result + this.hbmpItem.hashCode()
        return result
    }
}

public data class Imemenuiteminfow(
    public var cbSize: UInt = 0u,
    public var fType: UInt = 0u,
    public var fState: UInt = 0u,
    public var wID: UInt = 0u,
    public var hbmpChecked: Hbitmap = null,
    public var hbmpUnchecked: Hbitmap = null,
    public var dwItemData: UInt = 0u,
    public var szString: UShortArray = UShortArray(80),
    public var hbmpItem: Hbitmap = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imemenuiteminfow) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fType != other.fType) return false
        if (this.fState != other.fState) return false
        if (this.wID != other.wID) return false
        if (this.hbmpChecked != other.hbmpChecked) return false
        if (this.hbmpUnchecked != other.hbmpUnchecked) return false
        if (this.dwItemData != other.dwItemData) return false
        if (!this.szString.contentEquals(other.szString)) return false
        if (this.hbmpItem != other.hbmpItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fType.hashCode()
        result = 31 * result + this.fState.hashCode()
        result = 31 * result + this.wID.hashCode()
        result = 31 * result + this.hbmpChecked.hashCode()
        result = 31 * result + this.hbmpUnchecked.hashCode()
        result = 31 * result + this.dwItemData.hashCode()
        result = 31 * result + this.szString.contentHashCode()
        result = 31 * result + this.hbmpItem.hashCode()
        return result
    }
}

public data class Imeshf(
    public var cbShf: UShort = 0u,
    public var verDic: UShort = 0u,
    public var szTitle: ByteArray = ByteArray(48),
    public var szDescription: ByteArray = ByteArray(256),
    public var szCopyright: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imeshf) return false
        if (this.cbShf != other.cbShf) return false
        if (this.verDic != other.verDic) return false
        if (!this.szTitle.contentEquals(other.szTitle)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szCopyright.contentEquals(other.szCopyright)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbShf.hashCode()
        result = 31 * result + this.verDic.hashCode()
        result = 31 * result + this.szTitle.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szCopyright.contentHashCode()
        return result
    }
}

public data class Imestringcandidate(public var uCount: UInt = 0u, public var lpwstr: List<COpaquePointer> = List(1) { COpaquePointer(0L) })

public data class Imestringcandidateinfo(
    public var dwFarEastId: UInt = 0u,
    public var lpFarEastInfo: Imefareastinfo? = null,
    public var fInfoMask: UInt = 0u,
    public var iSelIndex: Int = 0,
    public var uCount: UInt = 0u,
    public var lpwstr: List<COpaquePointer> = List(1) { COpaquePointer(0L) },
)

public data class Imestringinfo(public var dwFarEastId: UInt = 0u, public var lpwstr: Pwstr = null)

public data class Imewrd(
    public var pwchReading: Pwstr = null,
    public var pwchDisplay: Pwstr = null,
    public var anonymous: Imewrd0 = Imewrd0(),
    public var rgulAttrs: UIntArray = UIntArray(2),
    public var cbComment: Int = 0,
    public var uct: Imeuct = 0,
    public var pvComment: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imewrd) return false
        if (this.pwchReading != other.pwchReading) return false
        if (this.pwchDisplay != other.pwchDisplay) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.rgulAttrs.contentEquals(other.rgulAttrs)) return false
        if (this.cbComment != other.cbComment) return false
        if (this.uct != other.uct) return false
        if (this.pvComment != other.pvComment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwchReading.hashCode()
        result = 31 * result + this.pwchDisplay.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.rgulAttrs.contentHashCode()
        result = 31 * result + this.cbComment.hashCode()
        result = 31 * result + this.uct.hashCode()
        result = 31 * result + this.pvComment.hashCode()
        return result
    }
}

public data class Imewrd0(public var ulPos: UInt = 0u, public var anonymous: Imewrd00 = Imewrd00())

public data class Imewrd00(public var nPos1: UShort = 0u, public var nPos2: UShort = 0u)

public class Inputcontext(
    public var hWnd: Hwnd = null,
    public var fOpen: Bool = 0,
    public var ptStatusWndPos: Point = Point(),
    public var ptSoftKbdPos: Point = Point(),
    public var fdwConversion: UInt = 0u,
    public var fdwSentence: UInt = 0u,
    public var lfFont: Inputcontext0 = Inputcontext0(),
    public var cfCompForm: Compositionform = Compositionform(),
    public var cfCandForm: List<Candidateform> = List(4) { Candidateform() },
    public var hCompStr: Himcc = null,
    public var hCandInfo: Himcc = null,
    public var hGuideLine: Himcc = null,
    public var hPrivate: Himcc = null,
    public var dwNumMsgBuf: UInt = 0u,
    public var hMsgBuf: Himcc = null,
    public var fdwInit: UInt = 0u,
    public var dwReserve: UIntArray = UIntArray(3),
)

public data class Inputcontext0(public var a: Logfonta = Logfonta(), public var w: Logfontw = Logfontw())

public data class Morrslt(
    public var dwSize: UInt = 0u,
    public var pwchOutput: Pwstr = null,
    public var cchOutput: UShort = 0u,
    public var anonymous1: Morrslt0 = Morrslt0(),
    public var anonymous2: Morrslt1 = Morrslt1(),
    public var pchInputPos: UShort? = null,
    public var pchOutputIdxWDD: UShort? = null,
    public var anonymous3: Morrslt2 = Morrslt2(),
    public var paMonoRubyPos: UShort? = null,
    public var pWDD: Wdd? = null,
    public var cWDD: Int = 0,
    public var pPrivate: COpaquePointer? = null,
    public var bLKBuff: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Morrslt) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pwchOutput != other.pwchOutput) return false
        if (this.cchOutput != other.cchOutput) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pchInputPos != other.pchInputPos) return false
        if (this.pchOutputIdxWDD != other.pchOutputIdxWDD) return false
        if (this.anonymous3 != other.anonymous3) return false
        if (this.paMonoRubyPos != other.paMonoRubyPos) return false
        if (this.pWDD != other.pWDD) return false
        if (this.cWDD != other.cWDD) return false
        if (this.pPrivate != other.pPrivate) return false
        if (!this.bLKBuff.contentEquals(other.bLKBuff)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pwchOutput.hashCode()
        result = 31 * result + this.cchOutput.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pchInputPos.hashCode()
        result = 31 * result + this.pchOutputIdxWDD.hashCode()
        result = 31 * result + this.anonymous3.hashCode()
        result = 31 * result + this.paMonoRubyPos.hashCode()
        result = 31 * result + this.pWDD.hashCode()
        result = 31 * result + this.cWDD.hashCode()
        result = 31 * result + this.pPrivate.hashCode()
        result = 31 * result + this.bLKBuff.contentHashCode()
        return result
    }
}

public data class Morrslt0(public var pwchRead: Pwstr = null, public var pwchComp: Pwstr = null)

public data class Morrslt1(public var cchRead: UShort = 0u, public var cchComp: UShort = 0u)

public data class Morrslt2(public var pchReadIdxWDD: UShort? = null, public var pchCompIdxWDD: UShort? = null)

public data class Postbl(public var nPos: UShort = 0u, public var szName: COpaquePointer? = null)

public data class Reconvertstring(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwStrLen: UInt = 0u,
    public var dwStrOffset: UInt = 0u,
    public var dwCompStrLen: UInt = 0u,
    public var dwCompStrOffset: UInt = 0u,
    public var dwTargetStrLen: UInt = 0u,
    public var dwTargetStrOffset: UInt = 0u,
)

public data class Registerworda(public var lpReading: Pstr = null, public var lpWord: Pstr = null)

public data class Registerwordw(public var lpReading: Pwstr = null, public var lpWord: Pwstr = null)

public data class Softkbddata(public var uCount: UInt = 0u, public var wCode: UShortArray = UShortArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Softkbddata) return false
        if (this.uCount != other.uCount) return false
        if (!this.wCode.contentEquals(other.wCode)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uCount.hashCode()
        result = 31 * result + this.wCode.contentHashCode()
        return result
    }
}

public data class Stylebufa(public var dwStyle: UInt = 0u, public var szDescription: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stylebufa) return false
        if (this.dwStyle != other.dwStyle) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStyle.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public data class Stylebufw(public var dwStyle: UInt = 0u, public var szDescription: UShortArray = UShortArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stylebufw) return false
        if (this.dwStyle != other.dwStyle) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStyle.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public data class Transmsg(
    public var message: UInt = 0u,
    public var wParam: Wparam = 0uL,
    public var lParam: Lparam = 0L,
)

public data class Transmsglist(public var uMsgCount: UInt = 0u, public var transMsg: List<Transmsg> = List(1) { Transmsg() })

public data class Wdd(
    public var wDispPos: UShort = 0u,
    public var anonymous1: Wdd0 = Wdd0(),
    public var cchDisp: UShort = 0u,
    public var anonymous2: Wdd1 = Wdd1(),
    public var wddNReserve1: UInt = 0u,
    public var nPos: UShort = 0u,
    public var bitfield: UShort = 0u,
    public var pReserved: COpaquePointer? = null,
)

public data class Wdd0(public var wReadPos: UShort = 0u, public var wCompPos: UShort = 0u)

public data class Wdd1(public var cchRead: UShort = 0u, public var cchComp: UShort = 0u)
