@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Blendfunction
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfonta
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw

public data class Accel(
    public var fVirt: AccelVirtFlags = 0u,
    public var key: UShort = 0u,
    public var cmd: UShort = 0u,
)

public data class Alttabinfo(
    public var cbSize: UInt = 0u,
    public var cItems: Int = 0,
    public var cColumns: Int = 0,
    public var cRows: Int = 0,
    public var iColFocus: Int = 0,
    public var iRowFocus: Int = 0,
    public var cxItem: Int = 0,
    public var cyItem: Int = 0,
    public var ptStart: Point = Point(),
)

public data class Animationinfo(
    public var cbSize: UInt = 0u,
    public var iMinAnimate: Int = 0,
)

public data class Audiodescription(
    public var cbSize: UInt = 0u,
    public var enabled: Bool = 0,
    public var locale: UInt = 0u,
)

public data class Cbtactivatestruct(
    public var fMouse: Bool = 0,
    public var hWndActive: Hwnd = null,
)

public data class CbtCreatewnda(
    public var lpcs: Createstructa? = null,
    public var hwndInsertAfter: Hwnd = null,
)

public data class CbtCreatewndw(
    public var lpcs: Createstructw? = null,
    public var hwndInsertAfter: Hwnd = null,
)

public data class Changefilterstruct(
    public var cbSize: UInt = 0u,
    public var extStatus: MsgfltinfoStatus = 0u,
)

public data class Clientcreatestruct(
    public var hWindowMenu: Handle = null,
    public var idFirstChild: UInt = 0u,
)

public data class Createstructa(
    public var lpCreateParams: COpaquePointer? = null,
    public var hInstance: Hinstance = null,
    public var hMenu: Hmenu = null,
    public var hwndParent: Hwnd = null,
    public var cy: Int = 0,
    public var cx: Int = 0,
    public var y: Int = 0,
    public var x: Int = 0,
    public var style: Int = 0,
    public var lpszName: Pcstr = null,
    public var lpszClass: Pcstr = null,
    public var dwExStyle: WindowExStyle = 0u,
)

public data class Createstructw(
    public var lpCreateParams: COpaquePointer? = null,
    public var hInstance: Hinstance = null,
    public var hMenu: Hmenu = null,
    public var hwndParent: Hwnd = null,
    public var cy: Int = 0,
    public var cx: Int = 0,
    public var y: Int = 0,
    public var x: Int = 0,
    public var style: Int = 0,
    public var lpszName: Pcwstr = null,
    public var lpszClass: Pcwstr = null,
    public var dwExStyle: WindowExStyle = 0u,
)

public data class Cursorinfo(
    public var cbSize: UInt = 0u,
    public var flags: CursorinfoFlags = 0u,
    public var hCursor: Hcursor = null,
    public var ptScreenPos: Point = Point(),
)

public data class Cursorshape(
    public var xHotSpot: Int = 0,
    public var yHotSpot: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var cbWidth: Int = 0,
    public var planes: UByte = 0u,
    public var bitsPixel: UByte = 0u,
)

public data class Cwpretstruct(
    public var lResult: Lresult = 0L,
    public var lParam: Lparam = 0L,
    public var wParam: Wparam = 0uL,
    public var message: UInt = 0u,
    public var hwnd: Hwnd = null,
)

public data class Cwpstruct(
    public var lParam: Lparam = 0L,
    public var wParam: Wparam = 0uL,
    public var message: UInt = 0u,
    public var hwnd: Hwnd = null,
)

public data class Debughookinfo(
    public var idThread: UInt = 0u,
    public var idThreadInstaller: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var wParam: Wparam = 0uL,
    public var code: Int = 0,
)

public data class DeviceEventBecomingReady(
    public var version: UInt = 0u,
    public var reason: UInt = 0u,
    public var estimated100msToReady: UInt = 0u,
)

public data class DeviceEventExternalRequest(
    public var version: UInt = 0u,
    public var deviceClass: UInt = 0u,
    public var buttonStatus: UShort = 0u,
    public var request: UShort = 0u,
    public var systemTime: Long = 0L,
)

public data class DeviceEventGenericData(
    public var eventNumber: UInt = 0u,
)

public data class DeviceEventMount(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileSystemNameLength: UInt = 0u,
    public var fileSystemNameOffset: UInt = 0u,
)

public data class DeviceEventRbcData(
    public var eventNumber: UInt = 0u,
    public var senseQualifier: UByte = 0u,
    public var senseCode: UByte = 0u,
    public var senseKey: UByte = 0u,
    public var reserved: UByte = 0u,
    public var information: UInt = 0u,
)

public data class DevBroadcastDeviceinterfaceA(
    public var dbccSize: UInt = 0u,
    public var dbccDevicetype: UInt = 0u,
    public var dbccReserved: UInt = 0u,
    public var dbccClassguid: Guid = Guid(),
    public var dbccName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastDeviceinterfaceA) return false
        if (this.dbccSize != other.dbccSize) return false
        if (this.dbccDevicetype != other.dbccDevicetype) return false
        if (this.dbccReserved != other.dbccReserved) return false
        if (this.dbccClassguid != other.dbccClassguid) return false
        if (!this.dbccName.contentEquals(other.dbccName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbccSize.hashCode()
        result = 31 * result + this.dbccDevicetype.hashCode()
        result = 31 * result + this.dbccReserved.hashCode()
        result = 31 * result + this.dbccClassguid.hashCode()
        result = 31 * result + this.dbccName.contentHashCode()
        return result
    }
}

public data class DevBroadcastDeviceinterfaceW(
    public var dbccSize: UInt = 0u,
    public var dbccDevicetype: UInt = 0u,
    public var dbccReserved: UInt = 0u,
    public var dbccClassguid: Guid = Guid(),
    public var dbccName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastDeviceinterfaceW) return false
        if (this.dbccSize != other.dbccSize) return false
        if (this.dbccDevicetype != other.dbccDevicetype) return false
        if (this.dbccReserved != other.dbccReserved) return false
        if (this.dbccClassguid != other.dbccClassguid) return false
        if (!this.dbccName.contentEquals(other.dbccName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbccSize.hashCode()
        result = 31 * result + this.dbccDevicetype.hashCode()
        result = 31 * result + this.dbccReserved.hashCode()
        result = 31 * result + this.dbccClassguid.hashCode()
        result = 31 * result + this.dbccName.contentHashCode()
        return result
    }
}

public data class DevBroadcastDevnode(
    public var dbcdSize: UInt = 0u,
    public var dbcdDevicetype: UInt = 0u,
    public var dbcdReserved: UInt = 0u,
    public var dbcdDevnode: UInt = 0u,
)

public data class DevBroadcastHandle(
    public var dbchSize: UInt = 0u,
    public var dbchDevicetype: UInt = 0u,
    public var dbchReserved: UInt = 0u,
    public var dbchHandle: Handle = null,
    public var dbchHdevnotify: Hdevnotify = null,
    public var dbchEventguid: Guid = Guid(),
    public var dbchNameoffset: Int = 0,
    public var dbchData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastHandle) return false
        if (this.dbchSize != other.dbchSize) return false
        if (this.dbchDevicetype != other.dbchDevicetype) return false
        if (this.dbchReserved != other.dbchReserved) return false
        if (this.dbchHandle != other.dbchHandle) return false
        if (this.dbchHdevnotify != other.dbchHdevnotify) return false
        if (this.dbchEventguid != other.dbchEventguid) return false
        if (this.dbchNameoffset != other.dbchNameoffset) return false
        if (!this.dbchData.contentEquals(other.dbchData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbchSize.hashCode()
        result = 31 * result + this.dbchDevicetype.hashCode()
        result = 31 * result + this.dbchReserved.hashCode()
        result = 31 * result + this.dbchHandle.hashCode()
        result = 31 * result + this.dbchHdevnotify.hashCode()
        result = 31 * result + this.dbchEventguid.hashCode()
        result = 31 * result + this.dbchNameoffset.hashCode()
        result = 31 * result + this.dbchData.contentHashCode()
        return result
    }
}

public data class DevBroadcastHandle32(
    public var dbchSize: UInt = 0u,
    public var dbchDevicetype: UInt = 0u,
    public var dbchReserved: UInt = 0u,
    public var dbchHandle: UInt = 0u,
    public var dbchHdevnotify: UInt = 0u,
    public var dbchEventguid: Guid = Guid(),
    public var dbchNameoffset: Int = 0,
    public var dbchData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastHandle32) return false
        if (this.dbchSize != other.dbchSize) return false
        if (this.dbchDevicetype != other.dbchDevicetype) return false
        if (this.dbchReserved != other.dbchReserved) return false
        if (this.dbchHandle != other.dbchHandle) return false
        if (this.dbchHdevnotify != other.dbchHdevnotify) return false
        if (this.dbchEventguid != other.dbchEventguid) return false
        if (this.dbchNameoffset != other.dbchNameoffset) return false
        if (!this.dbchData.contentEquals(other.dbchData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbchSize.hashCode()
        result = 31 * result + this.dbchDevicetype.hashCode()
        result = 31 * result + this.dbchReserved.hashCode()
        result = 31 * result + this.dbchHandle.hashCode()
        result = 31 * result + this.dbchHdevnotify.hashCode()
        result = 31 * result + this.dbchEventguid.hashCode()
        result = 31 * result + this.dbchNameoffset.hashCode()
        result = 31 * result + this.dbchData.contentHashCode()
        return result
    }
}

public data class DevBroadcastHandle64(
    public var dbchSize: UInt = 0u,
    public var dbchDevicetype: UInt = 0u,
    public var dbchReserved: UInt = 0u,
    public var dbchHandle: ULong = 0uL,
    public var dbchHdevnotify: ULong = 0uL,
    public var dbchEventguid: Guid = Guid(),
    public var dbchNameoffset: Int = 0,
    public var dbchData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastHandle64) return false
        if (this.dbchSize != other.dbchSize) return false
        if (this.dbchDevicetype != other.dbchDevicetype) return false
        if (this.dbchReserved != other.dbchReserved) return false
        if (this.dbchHandle != other.dbchHandle) return false
        if (this.dbchHdevnotify != other.dbchHdevnotify) return false
        if (this.dbchEventguid != other.dbchEventguid) return false
        if (this.dbchNameoffset != other.dbchNameoffset) return false
        if (!this.dbchData.contentEquals(other.dbchData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbchSize.hashCode()
        result = 31 * result + this.dbchDevicetype.hashCode()
        result = 31 * result + this.dbchReserved.hashCode()
        result = 31 * result + this.dbchHandle.hashCode()
        result = 31 * result + this.dbchHdevnotify.hashCode()
        result = 31 * result + this.dbchEventguid.hashCode()
        result = 31 * result + this.dbchNameoffset.hashCode()
        result = 31 * result + this.dbchData.contentHashCode()
        return result
    }
}

public data class DevBroadcastHdr(
    public var dbchSize: UInt = 0u,
    public var dbchDevicetype: DevBroadcastHdrDeviceType = 0u,
    public var dbchReserved: UInt = 0u,
)

public data class DevBroadcastNet(
    public var dbcnSize: UInt = 0u,
    public var dbcnDevicetype: UInt = 0u,
    public var dbcnReserved: UInt = 0u,
    public var dbcnResource: UInt = 0u,
    public var dbcnFlags: UInt = 0u,
)

public data class DevBroadcastOem(
    public var dbcoSize: UInt = 0u,
    public var dbcoDevicetype: UInt = 0u,
    public var dbcoReserved: UInt = 0u,
    public var dbcoIdentifier: UInt = 0u,
    public var dbcoSuppfunc: UInt = 0u,
)

public data class DevBroadcastPortA(
    public var dbcpSize: UInt = 0u,
    public var dbcpDevicetype: UInt = 0u,
    public var dbcpReserved: UInt = 0u,
    public var dbcpName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastPortA) return false
        if (this.dbcpSize != other.dbcpSize) return false
        if (this.dbcpDevicetype != other.dbcpDevicetype) return false
        if (this.dbcpReserved != other.dbcpReserved) return false
        if (!this.dbcpName.contentEquals(other.dbcpName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbcpSize.hashCode()
        result = 31 * result + this.dbcpDevicetype.hashCode()
        result = 31 * result + this.dbcpReserved.hashCode()
        result = 31 * result + this.dbcpName.contentHashCode()
        return result
    }
}

public data class DevBroadcastPortW(
    public var dbcpSize: UInt = 0u,
    public var dbcpDevicetype: UInt = 0u,
    public var dbcpReserved: UInt = 0u,
    public var dbcpName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastPortW) return false
        if (this.dbcpSize != other.dbcpSize) return false
        if (this.dbcpDevicetype != other.dbcpDevicetype) return false
        if (this.dbcpReserved != other.dbcpReserved) return false
        if (!this.dbcpName.contentEquals(other.dbcpName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbcpSize.hashCode()
        result = 31 * result + this.dbcpDevicetype.hashCode()
        result = 31 * result + this.dbcpReserved.hashCode()
        result = 31 * result + this.dbcpName.contentHashCode()
        return result
    }
}

public data class DevBroadcastVolume(
    public var dbcvSize: UInt = 0u,
    public var dbcvDevicetype: UInt = 0u,
    public var dbcvReserved: UInt = 0u,
    public var dbcvUnitmask: UInt = 0u,
    public var dbcvFlags: DevBroadcastVolumeFlags = 0u,
)

public data class DiskHealthNotificationData(
    public var deviceGuid: Guid = Guid(),
)

public data class Dlgitemtemplate(
    public var style: UInt = 0u,
    public var dwExtendedStyle: UInt = 0u,
    public var x: Short = 0,
    public var y: Short = 0,
    public var cx: Short = 0,
    public var cy: Short = 0,
    public var id: UShort = 0u,
)

public data class Dlgtemplate(
    public var style: UInt = 0u,
    public var dwExtendedStyle: UInt = 0u,
    public var cdit: UShort = 0u,
    public var x: Short = 0,
    public var y: Short = 0,
    public var cx: Short = 0,
    public var cy: Short = 0,
)

public data class Dropstruct(
    public var hwndSource: Hwnd = null,
    public var hwndSink: Hwnd = null,
    public var wFmt: UInt = 0u,
    public var dwData: Int = 0,
    public var ptDrop: Point = Point(),
    public var dwControlData: UInt = 0u,
)

public data class Eventmsg(
    public var message: UInt = 0u,
    public var paramL: UInt = 0u,
    public var paramH: UInt = 0u,
    public var time: UInt = 0u,
    public var hwnd: Hwnd = null,
)

public data class Flashwinfo(
    public var cbSize: UInt = 0u,
    public var hwnd: Hwnd = null,
    public var dwFlags: FlashwinfoFlags = 0u,
    public var uCount: UInt = 0u,
    public var dwTimeout: UInt = 0u,
)

public data class Getclipbmetadata(
    public var version: UInt = 0u,
    public var isDelayRendered: Bool = 0,
    public var isSynthetic: Bool = 0,
)

public data class GuidIoDiskCloneArrivalInformation(
    public var diskNumber: UInt = 0u,
)

public data class Guithreadinfo(
    public var cbSize: UInt = 0u,
    public var flags: GuithreadinfoFlags = 0u,
    public var hwndActive: Hwnd = null,
    public var hwndFocus: Hwnd = null,
    public var hwndCapture: Hwnd = null,
    public var hwndMenuOwner: Hwnd = null,
    public var hwndMoveSize: Hwnd = null,
    public var hwndCaret: Hwnd = null,
    public var rcCaret: Rect = Rect(),
)

public data class Hardwarehookstruct(
    public var hwnd: Hwnd = null,
    public var message: UInt = 0u,
    public var wParam: Wparam = 0uL,
    public var lParam: Lparam = 0L,
)

public data class Iconinfo(
    public var fIcon: Bool = 0,
    public var xHotspot: UInt = 0u,
    public var yHotspot: UInt = 0u,
    public var hbmMask: Hbitmap = null,
    public var hbmColor: Hbitmap = null,
)

public data class Iconinfoexa(
    public var cbSize: UInt = 0u,
    public var fIcon: Bool = 0,
    public var xHotspot: UInt = 0u,
    public var yHotspot: UInt = 0u,
    public var hbmMask: Hbitmap = null,
    public var hbmColor: Hbitmap = null,
    public var wResID: UShort = 0u,
    public var szModName: ByteArray = ByteArray(260),
    public var szResName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Iconinfoexa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fIcon != other.fIcon) return false
        if (this.xHotspot != other.xHotspot) return false
        if (this.yHotspot != other.yHotspot) return false
        if (this.hbmMask != other.hbmMask) return false
        if (this.hbmColor != other.hbmColor) return false
        if (this.wResID != other.wResID) return false
        if (!this.szModName.contentEquals(other.szModName)) return false
        if (!this.szResName.contentEquals(other.szResName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fIcon.hashCode()
        result = 31 * result + this.xHotspot.hashCode()
        result = 31 * result + this.yHotspot.hashCode()
        result = 31 * result + this.hbmMask.hashCode()
        result = 31 * result + this.hbmColor.hashCode()
        result = 31 * result + this.wResID.hashCode()
        result = 31 * result + this.szModName.contentHashCode()
        result = 31 * result + this.szResName.contentHashCode()
        return result
    }
}

public data class Iconinfoexw(
    public var cbSize: UInt = 0u,
    public var fIcon: Bool = 0,
    public var xHotspot: UInt = 0u,
    public var yHotspot: UInt = 0u,
    public var hbmMask: Hbitmap = null,
    public var hbmColor: Hbitmap = null,
    public var wResID: UShort = 0u,
    public var szModName: UShortArray = UShortArray(260),
    public var szResName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Iconinfoexw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fIcon != other.fIcon) return false
        if (this.xHotspot != other.xHotspot) return false
        if (this.yHotspot != other.yHotspot) return false
        if (this.hbmMask != other.hbmMask) return false
        if (this.hbmColor != other.hbmColor) return false
        if (this.wResID != other.wResID) return false
        if (!this.szModName.contentEquals(other.szModName)) return false
        if (!this.szResName.contentEquals(other.szResName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fIcon.hashCode()
        result = 31 * result + this.xHotspot.hashCode()
        result = 31 * result + this.yHotspot.hashCode()
        result = 31 * result + this.hbmMask.hashCode()
        result = 31 * result + this.hbmColor.hashCode()
        result = 31 * result + this.wResID.hashCode()
        result = 31 * result + this.szModName.contentHashCode()
        result = 31 * result + this.szResName.contentHashCode()
        return result
    }
}

public data class Iconmetricsa(
    public var cbSize: UInt = 0u,
    public var iHorzSpacing: Int = 0,
    public var iVertSpacing: Int = 0,
    public var iTitleWrap: Int = 0,
    public var lfFont: Logfonta = Logfonta(),
)

public data class Iconmetricsw(
    public var cbSize: UInt = 0u,
    public var iHorzSpacing: Int = 0,
    public var iVertSpacing: Int = 0,
    public var iTitleWrap: Int = 0,
    public var lfFont: Logfontw = Logfontw(),
)

public data class IndexedResourceQualifier(
    public var name: Pwstr = null,
    public var value: Pwstr = null,
)

public data class Kbdllhookstruct(
    public var vkCode: UInt = 0u,
    public var scanCode: UInt = 0u,
    public var flags: KbdllhookstructFlags = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: Int = 0,
)

public data class Mdicreatestructa(
    public var szClass: Pcstr = null,
    public var szTitle: Pcstr = null,
    public var hOwner: Handle = null,
    public var x: Int = 0,
    public var y: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var style: WindowStyle = 0u,
    public var lParam: Lparam = 0L,
)

public data class Mdicreatestructw(
    public var szClass: Pcwstr = null,
    public var szTitle: Pcwstr = null,
    public var hOwner: Handle = null,
    public var x: Int = 0,
    public var y: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var style: WindowStyle = 0u,
    public var lParam: Lparam = 0L,
)

public data class Mdinextmenu(
    public var hmenuIn: Hmenu = null,
    public var hmenuNext: Hmenu = null,
    public var hwndNext: Hwnd = null,
)

public data class Menubarinfo(
    public var cbSize: UInt = 0u,
    public var rcBar: Rect = Rect(),
    public var hMenu: Hmenu = null,
    public var hwndMenu: Hwnd = null,
    public var bitfield: Int = 0,
)

public data class MenuexTemplateHeader(
    public var wVersion: UShort = 0u,
    public var wOffset: UShort = 0u,
    public var dwHelpId: UInt = 0u,
)

public data class MenuexTemplateItem(
    public var dwType: UInt = 0u,
    public var dwState: UInt = 0u,
    public var uId: UInt = 0u,
    public var wFlags: UShort = 0u,
    public var szText: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MenuexTemplateItem) return false
        if (this.dwType != other.dwType) return false
        if (this.dwState != other.dwState) return false
        if (this.uId != other.uId) return false
        if (this.wFlags != other.wFlags) return false
        if (!this.szText.contentEquals(other.szText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.uId.hashCode()
        result = 31 * result + this.wFlags.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        return result
    }
}

public data class Menugetobjectinfo(
    public var dwFlags: MenugetobjectinfoFlags = 0u,
    public var uPos: UInt = 0u,
    public var hmenu: Hmenu = null,
    public var riid: COpaquePointer? = null,
    public var pvObj: COpaquePointer? = null,
)

public data class Menuinfo(
    public var cbSize: UInt = 0u,
    public var fMask: MenuinfoMask = 0u,
    public var dwStyle: MenuinfoStyle = 0u,
    public var cyMax: UInt = 0u,
    public var hbrBack: Hbrush = null,
    public var dwContextHelpID: UInt = 0u,
    public var dwMenuData: Int = 0,
)

public data class Menuiteminfoa(
    public var cbSize: UInt = 0u,
    public var fMask: MenuItemMask = 0u,
    public var fType: MenuItemType = 0u,
    public var fState: MenuItemState = 0u,
    public var wID: UInt = 0u,
    public var hSubMenu: Hmenu = null,
    public var hbmpChecked: Hbitmap = null,
    public var hbmpUnchecked: Hbitmap = null,
    public var dwItemData: Int = 0,
    public var dwTypeData: Pstr = null,
    public var cch: UInt = 0u,
    public var hbmpItem: Hbitmap = null,
)

public data class Menuiteminfow(
    public var cbSize: UInt = 0u,
    public var fMask: MenuItemMask = 0u,
    public var fType: MenuItemType = 0u,
    public var fState: MenuItemState = 0u,
    public var wID: UInt = 0u,
    public var hSubMenu: Hmenu = null,
    public var hbmpChecked: Hbitmap = null,
    public var hbmpUnchecked: Hbitmap = null,
    public var dwItemData: Int = 0,
    public var dwTypeData: Pwstr = null,
    public var cch: UInt = 0u,
    public var hbmpItem: Hbitmap = null,
)

public data class Menuitemtemplate(
    public var mtOption: UShort = 0u,
    public var mtID: UShort = 0u,
    public var mtString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Menuitemtemplate) return false
        if (this.mtOption != other.mtOption) return false
        if (this.mtID != other.mtID) return false
        if (!this.mtString.contentEquals(other.mtString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mtOption.hashCode()
        result = 31 * result + this.mtID.hashCode()
        result = 31 * result + this.mtString.contentHashCode()
        return result
    }
}

public data class Menuitemtemplateheader(
    public var versionNumber: UShort = 0u,
    public var offset: UShort = 0u,
)

public data class Menutemplateex(
    public var anonymous: Menutemplateex0 = Menutemplateex0(),
)

public data class Menutemplateex0(
    public var menu: Menutemplateex00 = Menutemplateex00(),
    public var menuEx: Menutemplateex01 = Menutemplateex01(),
)

public data class Menutemplateex01(
    public var mexHeader: MenuexTemplateHeader = MenuexTemplateHeader(),
    public var mexItem: List<MenuexTemplateItem> = List(1) { MenuexTemplateItem() },
)

public data class Menutemplateex00(
    public var mitHeader: Menuitemtemplateheader = Menuitemtemplateheader(),
    public var miTemplate: List<Menuitemtemplate> = List(1) { Menuitemtemplate() },
)

public data class MessageResourceBlock(
    public var lowId: UInt = 0u,
    public var highId: UInt = 0u,
    public var offsetToEntries: UInt = 0u,
)

public data class MessageResourceData(
    public var numberOfBlocks: UInt = 0u,
    public var blocks: List<MessageResourceBlock> = List(1) { MessageResourceBlock() },
)

public data class MessageResourceEntry(
    public var length: UShort = 0u,
    public var flags: UShort = 0u,
    public var text: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MessageResourceEntry) return false
        if (this.length != other.length) return false
        if (this.flags != other.flags) return false
        if (!this.text.contentEquals(other.text)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.text.contentHashCode()
        return result
    }
}

public data class Minimizedmetrics(
    public var cbSize: UInt = 0u,
    public var iWidth: Int = 0,
    public var iHorzGap: Int = 0,
    public var iVertGap: Int = 0,
    public var iArrange: MinimizedmetricsArrange = 0,
)

public data class Minmaxinfo(
    public var ptReserved: Point = Point(),
    public var ptMaxSize: Point = Point(),
    public var ptMaxPosition: Point = Point(),
    public var ptMinTrackSize: Point = Point(),
    public var ptMaxTrackSize: Point = Point(),
)

public data class Mousehookstruct(
    public var pt: Point = Point(),
    public var hwnd: Hwnd = null,
    public var wHitTestCode: UInt = 0u,
    public var dwExtraInfo: Int = 0,
)

public data class Mousehookstructex(
    public var base: Mousehookstruct = Mousehookstruct(),
    public var mouseData: UInt = 0u,
)

public data class Msg(
    public var hwnd: Hwnd = null,
    public var message: UInt = 0u,
    public var wParam: Wparam = 0uL,
    public var lParam: Lparam = 0L,
    public var time: UInt = 0u,
    public var pt: Point = Point(),
)

public data class Msgboxparamsa(
    public var cbSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var lpszText: Pcstr = null,
    public var lpszCaption: Pcstr = null,
    public var dwStyle: MessageboxStyle = 0u,
    public var lpszIcon: Pcstr = null,
    public var dwContextHelpId: Int = 0,
    public var lpfnMsgBoxCallback: Msgboxcallback = null,
    public var dwLanguageId: UInt = 0u,
)

public data class Msgboxparamsw(
    public var cbSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var lpszText: Pcwstr = null,
    public var lpszCaption: Pcwstr = null,
    public var dwStyle: MessageboxStyle = 0u,
    public var lpszIcon: Pcwstr = null,
    public var dwContextHelpId: Int = 0,
    public var lpfnMsgBoxCallback: Msgboxcallback = null,
    public var dwLanguageId: UInt = 0u,
)

public data class Msllhookstruct(
    public var pt: Point = Point(),
    public var mouseData: UInt = 0u,
    public var flags: UInt = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: Int = 0,
)

public data class MrmResourceIndexerHandle(
    public var handle: COpaquePointer? = null,
)

public data class MrmResourceIndexerMessage(
    public var severity: MrmResourceIndexerMessageSeverity = 0,
    public var id: UInt = 0u,
    public var text: Pcwstr = null,
)

public data class NccalcsizeParams(
    public var rgrc: List<Rect> = List(3) { Rect() },
    public var lppos: Windowpos? = null,
)

public data class Nonclientmetricsa(
    public var cbSize: UInt = 0u,
    public var iBorderWidth: Int = 0,
    public var iScrollWidth: Int = 0,
    public var iScrollHeight: Int = 0,
    public var iCaptionWidth: Int = 0,
    public var iCaptionHeight: Int = 0,
    public var lfCaptionFont: Logfonta = Logfonta(),
    public var iSmCaptionWidth: Int = 0,
    public var iSmCaptionHeight: Int = 0,
    public var lfSmCaptionFont: Logfonta = Logfonta(),
    public var iMenuWidth: Int = 0,
    public var iMenuHeight: Int = 0,
    public var lfMenuFont: Logfonta = Logfonta(),
    public var lfStatusFont: Logfonta = Logfonta(),
    public var lfMessageFont: Logfonta = Logfonta(),
    public var iPaddedBorderWidth: Int = 0,
)

public data class Nonclientmetricsw(
    public var cbSize: UInt = 0u,
    public var iBorderWidth: Int = 0,
    public var iScrollWidth: Int = 0,
    public var iScrollHeight: Int = 0,
    public var iCaptionWidth: Int = 0,
    public var iCaptionHeight: Int = 0,
    public var lfCaptionFont: Logfontw = Logfontw(),
    public var iSmCaptionWidth: Int = 0,
    public var iSmCaptionHeight: Int = 0,
    public var lfSmCaptionFont: Logfontw = Logfontw(),
    public var iMenuWidth: Int = 0,
    public var iMenuHeight: Int = 0,
    public var lfMenuFont: Logfontw = Logfontw(),
    public var lfStatusFont: Logfontw = Logfontw(),
    public var lfMessageFont: Logfontw = Logfontw(),
    public var iPaddedBorderWidth: Int = 0,
)

public data class Scrollbarinfo(
    public var cbSize: UInt = 0u,
    public var rcScrollBar: Rect = Rect(),
    public var dxyLineButton: Int = 0,
    public var xyThumbTop: Int = 0,
    public var xyThumbBottom: Int = 0,
    public var reserved: Int = 0,
    public var rgstate: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Scrollbarinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.rcScrollBar != other.rcScrollBar) return false
        if (this.dxyLineButton != other.dxyLineButton) return false
        if (this.xyThumbTop != other.xyThumbTop) return false
        if (this.xyThumbBottom != other.xyThumbBottom) return false
        if (this.reserved != other.reserved) return false
        if (!this.rgstate.contentEquals(other.rgstate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rcScrollBar.hashCode()
        result = 31 * result + this.dxyLineButton.hashCode()
        result = 31 * result + this.xyThumbTop.hashCode()
        result = 31 * result + this.xyThumbBottom.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.rgstate.contentHashCode()
        return result
    }
}

public data class Scrollinfo(
    public var cbSize: UInt = 0u,
    public var fMask: ScrollinfoMask = 0u,
    public var nMin: Int = 0,
    public var nMax: Int = 0,
    public var nPage: UInt = 0u,
    public var nPos: Int = 0,
    public var nTrackPos: Int = 0,
)

public data class Shellhookinfo(
    public var hwnd: Hwnd = null,
    public var rc: Rect = Rect(),
)

public data class Stylestruct(
    public var styleOld: UInt = 0u,
    public var styleNew: UInt = 0u,
)

public data class Titlebarinfo(
    public var cbSize: UInt = 0u,
    public var rcTitleBar: Rect = Rect(),
    public var rgstate: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Titlebarinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.rcTitleBar != other.rcTitleBar) return false
        if (!this.rgstate.contentEquals(other.rgstate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rcTitleBar.hashCode()
        result = 31 * result + this.rgstate.contentHashCode()
        return result
    }
}

public data class Titlebarinfoex(
    public var cbSize: UInt = 0u,
    public var rcTitleBar: Rect = Rect(),
    public var rgstate: UIntArray = UIntArray(6),
    public var rgrect: List<Rect> = List(6) { Rect() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Titlebarinfoex) return false
        if (this.cbSize != other.cbSize) return false
        if (this.rcTitleBar != other.rcTitleBar) return false
        if (!this.rgstate.contentEquals(other.rgstate)) return false
        if (this.rgrect != other.rgrect) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rcTitleBar.hashCode()
        result = 31 * result + this.rgstate.contentHashCode()
        result = 31 * result + this.rgrect.hashCode()
        return result
    }
}

public data class Touchpredictionparameters(
    public var cbSize: UInt = 0u,
    public var dwLatency: UInt = 0u,
    public var dwSampleTime: UInt = 0u,
    public var bUseHWTimeStamp: UInt = 0u,
)

public data class Tpmparams(
    public var cbSize: UInt = 0u,
    public var rcExclude: Rect = Rect(),
)

public data class Updatelayeredwindowinfo(
    public var cbSize: UInt = 0u,
    public var hdcDst: Hdc = null,
    public var pptDst: Point? = null,
    public var psize: Size? = null,
    public var hdcSrc: Hdc = null,
    public var pptSrc: Point? = null,
    public var crKey: Colorref = 0u,
    public var pblend: Blendfunction? = null,
    public var dwFlags: UpdateLayeredWindowFlags = 0u,
    public var prcDirty: Rect? = null,
)

public data class VolLockBroadcast(
    public var vlbDbh: DevBroadcastHdr = DevBroadcastHdr(),
    public var vlbOwner: UInt = 0u,
    public var vlbPerms: UByte = 0u,
    public var vlbLockType: UByte = 0u,
    public var vlbDrive: UByte = 0u,
    public var vlbFlags: UByte = 0u,
)

public data class Windowinfo(
    public var cbSize: UInt = 0u,
    public var rcWindow: Rect = Rect(),
    public var rcClient: Rect = Rect(),
    public var dwStyle: WindowStyle = 0u,
    public var dwExStyle: WindowExStyle = 0u,
    public var dwWindowStatus: UInt = 0u,
    public var cxWindowBorders: UInt = 0u,
    public var cyWindowBorders: UInt = 0u,
    public var atomWindowType: UShort = 0u,
    public var wCreatorVersion: UShort = 0u,
)

public data class Windowplacement(
    public var length: UInt = 0u,
    public var flags: WindowplacementFlags = 0u,
    public var showCmd: UInt = 0u,
    public var ptMinPosition: Point = Point(),
    public var ptMaxPosition: Point = Point(),
    public var rcNormalPosition: Rect = Rect(),
)

public data class Windowpos(
    public var hwnd: Hwnd = null,
    public var hwndInsertAfter: Hwnd = null,
    public var x: Int = 0,
    public var y: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var flags: SetWindowPosFlags = 0u,
)

public data class Wndclassa(
    public var style: WndclassStyles = 0u,
    public var lpfnWndProc: Wndproc = null,
    public var cbClsExtra: Int = 0,
    public var cbWndExtra: Int = 0,
    public var hInstance: Hinstance = null,
    public var hIcon: Hicon = null,
    public var hCursor: Hcursor = null,
    public var hbrBackground: Hbrush = null,
    public var lpszMenuName: Pcstr = null,
    public var lpszClassName: Pcstr = null,
)

public data class Wndclassexa(
    public var cbSize: UInt = 0u,
    public var style: WndclassStyles = 0u,
    public var lpfnWndProc: Wndproc = null,
    public var cbClsExtra: Int = 0,
    public var cbWndExtra: Int = 0,
    public var hInstance: Hinstance = null,
    public var hIcon: Hicon = null,
    public var hCursor: Hcursor = null,
    public var hbrBackground: Hbrush = null,
    public var lpszMenuName: Pcstr = null,
    public var lpszClassName: Pcstr = null,
    public var hIconSm: Hicon = null,
)

public data class Wndclassexw(
    public var cbSize: UInt = 0u,
    public var style: WndclassStyles = 0u,
    public var lpfnWndProc: Wndproc = null,
    public var cbClsExtra: Int = 0,
    public var cbWndExtra: Int = 0,
    public var hInstance: Hinstance = null,
    public var hIcon: Hicon = null,
    public var hCursor: Hcursor = null,
    public var hbrBackground: Hbrush = null,
    public var lpszMenuName: Pcwstr = null,
    public var lpszClassName: Pcwstr = null,
    public var hIconSm: Hicon = null,
)

public data class Wndclassw(
    public var style: WndclassStyles = 0u,
    public var lpfnWndProc: Wndproc = null,
    public var cbClsExtra: Int = 0,
    public var cbWndExtra: Int = 0,
    public var hInstance: Hinstance = null,
    public var hIcon: Hicon = null,
    public var hCursor: Hcursor = null,
    public var hbrBackground: Hbrush = null,
    public var lpszMenuName: Pcwstr = null,
    public var lpszClassName: Pcwstr = null,
)

public data class DevBroadcastHeader(
    public var dbcdSize: UInt = 0u,
    public var dbcdDevicetype: UInt = 0u,
    public var dbcdReserved: UInt = 0u,
)

public data class DevBroadcastUserdefined(
    public var dbudDbh: DevBroadcastHdr = DevBroadcastHdr(),
    public var dbudSzName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastUserdefined) return false
        if (this.dbudDbh != other.dbudDbh) return false
        if (!this.dbudSzName.contentEquals(other.dbudSzName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbudDbh.hashCode()
        result = 31 * result + this.dbudSzName.contentHashCode()
        return result
    }
}
