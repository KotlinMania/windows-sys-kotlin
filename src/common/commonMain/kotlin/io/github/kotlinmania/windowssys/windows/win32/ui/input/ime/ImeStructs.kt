@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.LOGFONTA
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.LOGFONTW
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON

public data class APPLETIDLIST(public var count: Int = 0, public var pIIDList: Long = 0L)

public data class APPLYCANDEXPARAM(
    public var dwSize: UInt = 0u,
    public var lpwstrDisplay: PWSTR = 0L,
    public var lpwstrReading: PWSTR = 0L,
    public var dwReserved: UInt = 0u,
)

public data class CANDIDATEFORM(
    public var dwIndex: UInt = 0u,
    public var dwStyle: UInt = 0u,
    public var ptCurrentPos: POINT = POINT(),
    public var rcArea: RECT = RECT(),
)

public data class CANDIDATEINFO(
    public var dwSize: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var dwOffset: UIntArray = UIntArray(32),
    public var dwPrivateSize: UInt = 0u,
    public var dwPrivateOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CANDIDATEINFO) return false
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

public data class CANDIDATELIST(
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
        if (other !is CANDIDATELIST) return false
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

public data class COMPOSITIONFORM(
    public var dwStyle: UInt = 0u,
    public var ptCurrentPos: POINT = POINT(),
    public var rcArea: RECT = RECT(),
)

public class COMPOSITIONSTRING(
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

public data class GUIDELINE(
    public var dwSize: UInt = 0u,
    public var dwLevel: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwStrLen: UInt = 0u,
    public var dwStrOffset: UInt = 0u,
    public var dwPrivateSize: UInt = 0u,
    public var dwPrivateOffset: UInt = 0u,
)

public data class IMEAPPLETCFG(
    public var dwConfig: UInt = 0u,
    public var wchTitle: UShortArray = UShortArray(64),
    public var wchTitleFontFace: UShortArray = UShortArray(32),
    public var dwCharSet: UInt = 0u,
    public var iCategory: Int = 0,
    public var hIcon: HICON = 0L,
    public var langID: UShort = 0u,
    public var dummy: UShort = 0u,
    public var lReserved1: LPARAM = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMEAPPLETCFG) return false
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

public data class IMEAPPLETUI(
    public var hwnd: HWND = 0L,
    public var dwStyle: UInt = 0u,
    public var width: Int = 0,
    public var height: Int = 0,
    public var minWidth: Int = 0,
    public var minHeight: Int = 0,
    public var maxWidth: Int = 0,
    public var maxHeight: Int = 0,
    public var lReserved1: LPARAM = 0L,
    public var lReserved2: LPARAM = 0L,
)

public data class IMECHARINFO(public var wch: UShort = 0u, public var dwCharInfo: UInt = 0u)

public data class IMECHARPOSITION(
    public var dwSize: UInt = 0u,
    public var dwCharPos: UInt = 0u,
    public var pt: POINT = POINT(),
    public var cLineHeight: UInt = 0u,
    public var rcDocument: RECT = RECT(),
)

public data class IMECOMPOSITIONSTRINGINFO(
    public var iCompStrLen: Int = 0,
    public var iCaretPos: Int = 0,
    public var iEditStart: Int = 0,
    public var iEditLen: Int = 0,
    public var iTargetStart: Int = 0,
    public var iTargetLen: Int = 0,
)

public data class IMEDLG(
    public var cbIMEDLG: Int = 0,
    public var hwnd: HWND = 0L,
    public var lpwstrWord: PWSTR = 0L,
    public var nTabId: Int = 0,
)

public data class IMEDP(
    public var wrdModifier: IMEWRD = IMEWRD(),
    public var wrdModifiee: IMEWRD = IMEWRD(),
    public var relID: IMEREL = 0,
)

public data class IMEFAREASTINFO(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwData: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMEFAREASTINFO) return false
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

public data class IMEINFO(
    public var dwPrivateDataSize: UInt = 0u,
    public var fdwProperty: UInt = 0u,
    public var fdwConversionCaps: UInt = 0u,
    public var fdwSentenceCaps: UInt = 0u,
    public var fdwUICaps: UInt = 0u,
    public var fdwSCSCaps: UInt = 0u,
    public var fdwSelectCaps: UInt = 0u,
)

public data class IMEITEM(
    public var cbSize: Int = 0,
    public var iType: Int = 0,
    public var lpItemData: Long = 0L,
)

public data class IMEITEMCANDIDATE(public var uCount: UInt = 0u, public var imeItem: List<IMEITEM> = List(1) { IMEITEM() })

public data class IMEKMS(
    public var cbSize: Int = 0,
    public var hIMC: HIMC = 0L,
    public var cKeyList: UInt = 0u,
    public var pKeyList: Long = 0L,
)

public data class IMEKMSFUNCDESC(
    public var cbSize: Int = 0,
    public var idLang: UShort = 0u,
    public var dwControl: UInt = 0u,
    public var pwszDescription: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMEKMSFUNCDESC) return false
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

public data class IMEKMSINIT(public var cbSize: Int = 0, public var hWnd: HWND = 0L)

public data class IMEKMSINVK(
    public var cbSize: Int = 0,
    public var hIMC: HIMC = 0L,
    public var dwControl: UInt = 0u,
)

public data class IMEKMSKEY(
    public var dwStatus: UInt = 0u,
    public var dwCompStatus: UInt = 0u,
    public var dwVKEY: UInt = 0u,
    public var Anonymous1: IMEKMSKEY_0 = IMEKMSKEY_0(),
    public var Anonymous2: IMEKMSKEY_1 = IMEKMSKEY_1(),
)

public data class IMEKMSKEY_0(public var dwControl: UInt = 0u, public var dwNotUsed: UInt = 0u)

public data class IMEKMSKEY_1(public var pwszDscr: UShortArray = UShortArray(31), public var pwszNoUse: UShortArray = UShortArray(31)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMEKMSKEY_1) return false
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

public data class IMEKMSKMP(
    public var cbSize: Int = 0,
    public var hIMC: HIMC = 0L,
    public var idLang: UShort = 0u,
    public var wVKStart: UShort = 0u,
    public var wVKEnd: UShort = 0u,
    public var cKeyList: Int = 0,
    public var pKeyList: Long = 0L,
)

public data class IMEKMSNTFY(
    public var cbSize: Int = 0,
    public var hIMC: HIMC = 0L,
    public var fSelect: BOOL = 0,
)

public data class IMEMENUITEMINFOA(
    public var cbSize: UInt = 0u,
    public var fType: UInt = 0u,
    public var fState: UInt = 0u,
    public var wID: UInt = 0u,
    public var hbmpChecked: HBITMAP = 0L,
    public var hbmpUnchecked: HBITMAP = 0L,
    public var dwItemData: UInt = 0u,
    public var szString: ByteArray = ByteArray(80),
    public var hbmpItem: HBITMAP = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMEMENUITEMINFOA) return false
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

public data class IMEMENUITEMINFOW(
    public var cbSize: UInt = 0u,
    public var fType: UInt = 0u,
    public var fState: UInt = 0u,
    public var wID: UInt = 0u,
    public var hbmpChecked: HBITMAP = 0L,
    public var hbmpUnchecked: HBITMAP = 0L,
    public var dwItemData: UInt = 0u,
    public var szString: UShortArray = UShortArray(80),
    public var hbmpItem: HBITMAP = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMEMENUITEMINFOW) return false
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

public data class IMESHF(
    public var cbShf: UShort = 0u,
    public var verDic: UShort = 0u,
    public var szTitle: ByteArray = ByteArray(48),
    public var szDescription: ByteArray = ByteArray(256),
    public var szCopyright: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMESHF) return false
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

public data class IMESTRINGCANDIDATE(public var uCount: UInt = 0u, public var lpwstr: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMESTRINGCANDIDATE) return false
        if (this.uCount != other.uCount) return false
        if (!this.lpwstr.contentEquals(other.lpwstr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uCount.hashCode()
        result = 31 * result + this.lpwstr.contentHashCode()
        return result
    }
}

public data class IMESTRINGCANDIDATEINFO(
    public var dwFarEastId: UInt = 0u,
    public var lpFarEastInfo: Long = 0L,
    public var fInfoMask: UInt = 0u,
    public var iSelIndex: Int = 0,
    public var uCount: UInt = 0u,
    public var lpwstr: LongArray = LongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMESTRINGCANDIDATEINFO) return false
        if (this.dwFarEastId != other.dwFarEastId) return false
        if (this.lpFarEastInfo != other.lpFarEastInfo) return false
        if (this.fInfoMask != other.fInfoMask) return false
        if (this.iSelIndex != other.iSelIndex) return false
        if (this.uCount != other.uCount) return false
        if (!this.lpwstr.contentEquals(other.lpwstr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFarEastId.hashCode()
        result = 31 * result + this.lpFarEastInfo.hashCode()
        result = 31 * result + this.fInfoMask.hashCode()
        result = 31 * result + this.iSelIndex.hashCode()
        result = 31 * result + this.uCount.hashCode()
        result = 31 * result + this.lpwstr.contentHashCode()
        return result
    }
}

public data class IMESTRINGINFO(public var dwFarEastId: UInt = 0u, public var lpwstr: PWSTR = 0L)

public data class IMEWRD(
    public var pwchReading: PWSTR = 0L,
    public var pwchDisplay: PWSTR = 0L,
    public var Anonymous: IMEWRD_0 = IMEWRD_0(),
    public var rgulAttrs: UIntArray = UIntArray(2),
    public var cbComment: Int = 0,
    public var uct: IMEUCT = 0,
    public var pvComment: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMEWRD) return false
        if (this.pwchReading != other.pwchReading) return false
        if (this.pwchDisplay != other.pwchDisplay) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.rgulAttrs.contentEquals(other.rgulAttrs)) return false
        if (this.cbComment != other.cbComment) return false
        if (this.uct != other.uct) return false
        if (this.pvComment != other.pvComment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwchReading.hashCode()
        result = 31 * result + this.pwchDisplay.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.rgulAttrs.contentHashCode()
        result = 31 * result + this.cbComment.hashCode()
        result = 31 * result + this.uct.hashCode()
        result = 31 * result + this.pvComment.hashCode()
        return result
    }
}

public data class IMEWRD_0(public var ulPos: UInt = 0u, public var Anonymous: IMEWRD_0_0 = IMEWRD_0_0())

public data class IMEWRD_0_0(public var nPos1: UShort = 0u, public var nPos2: UShort = 0u)

public class INPUTCONTEXT(
    public var hWnd: HWND = 0L,
    public var fOpen: BOOL = 0,
    public var ptStatusWndPos: POINT = POINT(),
    public var ptSoftKbdPos: POINT = POINT(),
    public var fdwConversion: UInt = 0u,
    public var fdwSentence: UInt = 0u,
    public var lfFont: INPUTCONTEXT_0 = INPUTCONTEXT_0(),
    public var cfCompForm: COMPOSITIONFORM = COMPOSITIONFORM(),
    public var cfCandForm: List<CANDIDATEFORM> = List(4) { CANDIDATEFORM() },
    public var hCompStr: HIMCC = 0L,
    public var hCandInfo: HIMCC = 0L,
    public var hGuideLine: HIMCC = 0L,
    public var hPrivate: HIMCC = 0L,
    public var dwNumMsgBuf: UInt = 0u,
    public var hMsgBuf: HIMCC = 0L,
    public var fdwInit: UInt = 0u,
    public var dwReserve: UIntArray = UIntArray(3),
)

public data class INPUTCONTEXT_0(public var A: LOGFONTA = LOGFONTA(), public var W: LOGFONTW = LOGFONTW())

public data class MORRSLT(
    public var dwSize: UInt = 0u,
    public var pwchOutput: PWSTR = 0L,
    public var cchOutput: UShort = 0u,
    public var Anonymous1: MORRSLT_0 = MORRSLT_0(),
    public var Anonymous2: MORRSLT_1 = MORRSLT_1(),
    public var pchInputPos: Long = 0L,
    public var pchOutputIdxWDD: Long = 0L,
    public var Anonymous3: MORRSLT_2 = MORRSLT_2(),
    public var paMonoRubyPos: Long = 0L,
    public var pWDD: Long = 0L,
    public var cWDD: Int = 0,
    public var pPrivate: Long = 0L,
    public var BLKBuff: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MORRSLT) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pwchOutput != other.pwchOutput) return false
        if (this.cchOutput != other.cchOutput) return false
        if (this.Anonymous1 != other.Anonymous1) return false
        if (this.Anonymous2 != other.Anonymous2) return false
        if (this.pchInputPos != other.pchInputPos) return false
        if (this.pchOutputIdxWDD != other.pchOutputIdxWDD) return false
        if (this.Anonymous3 != other.Anonymous3) return false
        if (this.paMonoRubyPos != other.paMonoRubyPos) return false
        if (this.pWDD != other.pWDD) return false
        if (this.cWDD != other.cWDD) return false
        if (this.pPrivate != other.pPrivate) return false
        if (!this.BLKBuff.contentEquals(other.BLKBuff)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pwchOutput.hashCode()
        result = 31 * result + this.cchOutput.hashCode()
        result = 31 * result + this.Anonymous1.hashCode()
        result = 31 * result + this.Anonymous2.hashCode()
        result = 31 * result + this.pchInputPos.hashCode()
        result = 31 * result + this.pchOutputIdxWDD.hashCode()
        result = 31 * result + this.Anonymous3.hashCode()
        result = 31 * result + this.paMonoRubyPos.hashCode()
        result = 31 * result + this.pWDD.hashCode()
        result = 31 * result + this.cWDD.hashCode()
        result = 31 * result + this.pPrivate.hashCode()
        result = 31 * result + this.BLKBuff.contentHashCode()
        return result
    }
}

public data class MORRSLT_0(public var pwchRead: PWSTR = 0L, public var pwchComp: PWSTR = 0L)

public data class MORRSLT_1(public var cchRead: UShort = 0u, public var cchComp: UShort = 0u)

public data class MORRSLT_2(public var pchReadIdxWDD: Long = 0L, public var pchCompIdxWDD: Long = 0L)

public data class POSTBL(public var nPos: UShort = 0u, public var szName: Long = 0L)

public data class RECONVERTSTRING(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwStrLen: UInt = 0u,
    public var dwStrOffset: UInt = 0u,
    public var dwCompStrLen: UInt = 0u,
    public var dwCompStrOffset: UInt = 0u,
    public var dwTargetStrLen: UInt = 0u,
    public var dwTargetStrOffset: UInt = 0u,
)

public data class REGISTERWORDA(public var lpReading: PSTR = 0L, public var lpWord: PSTR = 0L)

public data class REGISTERWORDW(public var lpReading: PWSTR = 0L, public var lpWord: PWSTR = 0L)

public data class SOFTKBDDATA(public var uCount: UInt = 0u, public var wCode: UShortArray = UShortArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOFTKBDDATA) return false
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

public data class STYLEBUFA(public var dwStyle: UInt = 0u, public var szDescription: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STYLEBUFA) return false
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

public data class STYLEBUFW(public var dwStyle: UInt = 0u, public var szDescription: UShortArray = UShortArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STYLEBUFW) return false
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

public data class TRANSMSG(
    public var message: UInt = 0u,
    public var wParam: WPARAM = 0uL,
    public var lParam: LPARAM = 0L,
)

public data class TRANSMSGLIST(public var uMsgCount: UInt = 0u, public var TransMsg: List<TRANSMSG> = List(1) { TRANSMSG() })

public data class WDD(
    public var wDispPos: UShort = 0u,
    public var Anonymous1: WDD_0 = WDD_0(),
    public var cchDisp: UShort = 0u,
    public var Anonymous2: WDD_1 = WDD_1(),
    public var WDD_nReserve1: UInt = 0u,
    public var nPos: UShort = 0u,
    public var _bitfield: UShort = 0u,
    public var pReserved: Long = 0L,
)

public data class WDD_0(public var wReadPos: UShort = 0u, public var wCompPos: UShort = 0u)

public data class WDD_1(public var cchRead: UShort = 0u, public var cchComp: UShort = 0u)
