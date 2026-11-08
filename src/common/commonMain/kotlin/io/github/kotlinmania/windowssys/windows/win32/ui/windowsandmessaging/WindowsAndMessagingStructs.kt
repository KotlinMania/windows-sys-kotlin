@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBRUSH
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.LOGFONTA
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.LOGFONTW

public data class ACCEL(
    public var fVirt: ACCEL_VIRT_FLAGS = 0u,
    public var key: UShort = 0u,
    public var cmd: UShort = 0u,
)

public data class ALTTABINFO(
    public var cbSize: UInt = 0u,
    public var cItems: Int = 0,
    public var cColumns: Int = 0,
    public var cRows: Int = 0,
    public var iColFocus: Int = 0,
    public var iRowFocus: Int = 0,
    public var cxItem: Int = 0,
    public var cyItem: Int = 0,
    public var ptStart: POINT = POINT(),
)

public data class ANIMATIONINFO(public var cbSize: UInt = 0u, public var iMinAnimate: Int = 0)

public data class AUDIODESCRIPTION(
    public var cbSize: UInt = 0u,
    public var Enabled: BOOL = 0,
    public var Locale: UInt = 0u,
)

public data class CBTACTIVATESTRUCT(public var fMouse: BOOL = 0, public var hWndActive: HWND = 0L)

public data class CBT_CREATEWNDA(public var lpcs: Long = 0L, public var hwndInsertAfter: HWND = 0L)

public data class CBT_CREATEWNDW(public var lpcs: Long = 0L, public var hwndInsertAfter: HWND = 0L)

public data class CHANGEFILTERSTRUCT(public var cbSize: UInt = 0u, public var ExtStatus: MSGFLTINFO_STATUS = 0u)

public data class CLIENTCREATESTRUCT(public var hWindowMenu: HANDLE = 0L, public var idFirstChild: UInt = 0u)

public data class CREATESTRUCTA(
    public var lpCreateParams: Long = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var hMenu: HMENU = 0L,
    public var hwndParent: HWND = 0L,
    public var cy: Int = 0,
    public var cx: Int = 0,
    public var y: Int = 0,
    public var x: Int = 0,
    public var style: Int = 0,
    public var lpszName: PCSTR = 0L,
    public var lpszClass: PCSTR = 0L,
    public var dwExStyle: WINDOW_EX_STYLE = 0u,
)

public data class CREATESTRUCTW(
    public var lpCreateParams: Long = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var hMenu: HMENU = 0L,
    public var hwndParent: HWND = 0L,
    public var cy: Int = 0,
    public var cx: Int = 0,
    public var y: Int = 0,
    public var x: Int = 0,
    public var style: Int = 0,
    public var lpszName: PCWSTR = 0L,
    public var lpszClass: PCWSTR = 0L,
    public var dwExStyle: WINDOW_EX_STYLE = 0u,
)

public data class CURSORINFO(
    public var cbSize: UInt = 0u,
    public var flags: CURSORINFO_FLAGS = 0u,
    public var hCursor: HCURSOR = 0L,
    public var ptScreenPos: POINT = POINT(),
)

public data class CURSORSHAPE(
    public var xHotSpot: Int = 0,
    public var yHotSpot: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var cbWidth: Int = 0,
    public var Planes: UByte = 0u,
    public var BitsPixel: UByte = 0u,
)

public data class CWPRETSTRUCT(
    public var lResult: LRESULT = 0L,
    public var lParam: LPARAM = 0L,
    public var wParam: WPARAM = 0uL,
    public var message: UInt = 0u,
    public var hwnd: HWND = 0L,
)

public data class CWPSTRUCT(
    public var lParam: LPARAM = 0L,
    public var wParam: WPARAM = 0uL,
    public var message: UInt = 0u,
    public var hwnd: HWND = 0L,
)

public data class DEBUGHOOKINFO(
    public var idThread: UInt = 0u,
    public var idThreadInstaller: UInt = 0u,
    public var lParam: LPARAM = 0L,
    public var wParam: WPARAM = 0uL,
    public var code: Int = 0,
)

public data class DEVICE_EVENT_BECOMING_READY(
    public var Version: UInt = 0u,
    public var Reason: UInt = 0u,
    public var Estimated100msToReady: UInt = 0u,
)

public data class DEVICE_EVENT_EXTERNAL_REQUEST(
    public var Version: UInt = 0u,
    public var DeviceClass: UInt = 0u,
    public var ButtonStatus: UShort = 0u,
    public var Request: UShort = 0u,
    public var SystemTime: Long = 0L,
)

public data class DEVICE_EVENT_GENERIC_DATA(public var EventNumber: UInt = 0u)

public data class DEVICE_EVENT_MOUNT(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var FileSystemNameLength: UInt = 0u,
    public var FileSystemNameOffset: UInt = 0u,
)

public data class DEVICE_EVENT_RBC_DATA(
    public var EventNumber: UInt = 0u,
    public var SenseQualifier: UByte = 0u,
    public var SenseCode: UByte = 0u,
    public var SenseKey: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var Information: UInt = 0u,
)

public data class DEV_BROADCAST_DEVICEINTERFACE_A(
    public var dbcc_size: UInt = 0u,
    public var dbcc_devicetype: UInt = 0u,
    public var dbcc_reserved: UInt = 0u,
    public var dbcc_classguid: GUID = GUID(),
    public var dbcc_name: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEV_BROADCAST_DEVICEINTERFACE_A) return false
        if (this.dbcc_size != other.dbcc_size) return false
        if (this.dbcc_devicetype != other.dbcc_devicetype) return false
        if (this.dbcc_reserved != other.dbcc_reserved) return false
        if (this.dbcc_classguid != other.dbcc_classguid) return false
        if (!this.dbcc_name.contentEquals(other.dbcc_name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbcc_size.hashCode()
        result = 31 * result + this.dbcc_devicetype.hashCode()
        result = 31 * result + this.dbcc_reserved.hashCode()
        result = 31 * result + this.dbcc_classguid.hashCode()
        result = 31 * result + this.dbcc_name.contentHashCode()
        return result
    }
}

public data class DEV_BROADCAST_DEVICEINTERFACE_W(
    public var dbcc_size: UInt = 0u,
    public var dbcc_devicetype: UInt = 0u,
    public var dbcc_reserved: UInt = 0u,
    public var dbcc_classguid: GUID = GUID(),
    public var dbcc_name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEV_BROADCAST_DEVICEINTERFACE_W) return false
        if (this.dbcc_size != other.dbcc_size) return false
        if (this.dbcc_devicetype != other.dbcc_devicetype) return false
        if (this.dbcc_reserved != other.dbcc_reserved) return false
        if (this.dbcc_classguid != other.dbcc_classguid) return false
        if (!this.dbcc_name.contentEquals(other.dbcc_name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbcc_size.hashCode()
        result = 31 * result + this.dbcc_devicetype.hashCode()
        result = 31 * result + this.dbcc_reserved.hashCode()
        result = 31 * result + this.dbcc_classguid.hashCode()
        result = 31 * result + this.dbcc_name.contentHashCode()
        return result
    }
}

public data class DEV_BROADCAST_DEVNODE(
    public var dbcd_size: UInt = 0u,
    public var dbcd_devicetype: UInt = 0u,
    public var dbcd_reserved: UInt = 0u,
    public var dbcd_devnode: UInt = 0u,
)

public data class DEV_BROADCAST_HANDLE(
    public var dbch_size: UInt = 0u,
    public var dbch_devicetype: UInt = 0u,
    public var dbch_reserved: UInt = 0u,
    public var dbch_handle: HANDLE = 0L,
    public var dbch_hdevnotify: HDEVNOTIFY = 0L,
    public var dbch_eventguid: GUID = GUID(),
    public var dbch_nameoffset: Int = 0,
    public var dbch_data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEV_BROADCAST_HANDLE) return false
        if (this.dbch_size != other.dbch_size) return false
        if (this.dbch_devicetype != other.dbch_devicetype) return false
        if (this.dbch_reserved != other.dbch_reserved) return false
        if (this.dbch_handle != other.dbch_handle) return false
        if (this.dbch_hdevnotify != other.dbch_hdevnotify) return false
        if (this.dbch_eventguid != other.dbch_eventguid) return false
        if (this.dbch_nameoffset != other.dbch_nameoffset) return false
        if (!this.dbch_data.contentEquals(other.dbch_data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbch_size.hashCode()
        result = 31 * result + this.dbch_devicetype.hashCode()
        result = 31 * result + this.dbch_reserved.hashCode()
        result = 31 * result + this.dbch_handle.hashCode()
        result = 31 * result + this.dbch_hdevnotify.hashCode()
        result = 31 * result + this.dbch_eventguid.hashCode()
        result = 31 * result + this.dbch_nameoffset.hashCode()
        result = 31 * result + this.dbch_data.contentHashCode()
        return result
    }
}

public data class DEV_BROADCAST_HANDLE32(
    public var dbch_size: UInt = 0u,
    public var dbch_devicetype: UInt = 0u,
    public var dbch_reserved: UInt = 0u,
    public var dbch_handle: UInt = 0u,
    public var dbch_hdevnotify: UInt = 0u,
    public var dbch_eventguid: GUID = GUID(),
    public var dbch_nameoffset: Int = 0,
    public var dbch_data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEV_BROADCAST_HANDLE32) return false
        if (this.dbch_size != other.dbch_size) return false
        if (this.dbch_devicetype != other.dbch_devicetype) return false
        if (this.dbch_reserved != other.dbch_reserved) return false
        if (this.dbch_handle != other.dbch_handle) return false
        if (this.dbch_hdevnotify != other.dbch_hdevnotify) return false
        if (this.dbch_eventguid != other.dbch_eventguid) return false
        if (this.dbch_nameoffset != other.dbch_nameoffset) return false
        if (!this.dbch_data.contentEquals(other.dbch_data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbch_size.hashCode()
        result = 31 * result + this.dbch_devicetype.hashCode()
        result = 31 * result + this.dbch_reserved.hashCode()
        result = 31 * result + this.dbch_handle.hashCode()
        result = 31 * result + this.dbch_hdevnotify.hashCode()
        result = 31 * result + this.dbch_eventguid.hashCode()
        result = 31 * result + this.dbch_nameoffset.hashCode()
        result = 31 * result + this.dbch_data.contentHashCode()
        return result
    }
}

public data class DEV_BROADCAST_HANDLE64(
    public var dbch_size: UInt = 0u,
    public var dbch_devicetype: UInt = 0u,
    public var dbch_reserved: UInt = 0u,
    public var dbch_handle: ULong = 0uL,
    public var dbch_hdevnotify: ULong = 0uL,
    public var dbch_eventguid: GUID = GUID(),
    public var dbch_nameoffset: Int = 0,
    public var dbch_data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEV_BROADCAST_HANDLE64) return false
        if (this.dbch_size != other.dbch_size) return false
        if (this.dbch_devicetype != other.dbch_devicetype) return false
        if (this.dbch_reserved != other.dbch_reserved) return false
        if (this.dbch_handle != other.dbch_handle) return false
        if (this.dbch_hdevnotify != other.dbch_hdevnotify) return false
        if (this.dbch_eventguid != other.dbch_eventguid) return false
        if (this.dbch_nameoffset != other.dbch_nameoffset) return false
        if (!this.dbch_data.contentEquals(other.dbch_data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbch_size.hashCode()
        result = 31 * result + this.dbch_devicetype.hashCode()
        result = 31 * result + this.dbch_reserved.hashCode()
        result = 31 * result + this.dbch_handle.hashCode()
        result = 31 * result + this.dbch_hdevnotify.hashCode()
        result = 31 * result + this.dbch_eventguid.hashCode()
        result = 31 * result + this.dbch_nameoffset.hashCode()
        result = 31 * result + this.dbch_data.contentHashCode()
        return result
    }
}

public data class DEV_BROADCAST_HDR(
    public var dbch_size: UInt = 0u,
    public var dbch_devicetype: DEV_BROADCAST_HDR_DEVICE_TYPE = 0u,
    public var dbch_reserved: UInt = 0u,
)

public data class DEV_BROADCAST_NET(
    public var dbcn_size: UInt = 0u,
    public var dbcn_devicetype: UInt = 0u,
    public var dbcn_reserved: UInt = 0u,
    public var dbcn_resource: UInt = 0u,
    public var dbcn_flags: UInt = 0u,
)

public data class DEV_BROADCAST_OEM(
    public var dbco_size: UInt = 0u,
    public var dbco_devicetype: UInt = 0u,
    public var dbco_reserved: UInt = 0u,
    public var dbco_identifier: UInt = 0u,
    public var dbco_suppfunc: UInt = 0u,
)

public data class DEV_BROADCAST_PORT_A(
    public var dbcp_size: UInt = 0u,
    public var dbcp_devicetype: UInt = 0u,
    public var dbcp_reserved: UInt = 0u,
    public var dbcp_name: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEV_BROADCAST_PORT_A) return false
        if (this.dbcp_size != other.dbcp_size) return false
        if (this.dbcp_devicetype != other.dbcp_devicetype) return false
        if (this.dbcp_reserved != other.dbcp_reserved) return false
        if (!this.dbcp_name.contentEquals(other.dbcp_name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbcp_size.hashCode()
        result = 31 * result + this.dbcp_devicetype.hashCode()
        result = 31 * result + this.dbcp_reserved.hashCode()
        result = 31 * result + this.dbcp_name.contentHashCode()
        return result
    }
}

public data class DEV_BROADCAST_PORT_W(
    public var dbcp_size: UInt = 0u,
    public var dbcp_devicetype: UInt = 0u,
    public var dbcp_reserved: UInt = 0u,
    public var dbcp_name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEV_BROADCAST_PORT_W) return false
        if (this.dbcp_size != other.dbcp_size) return false
        if (this.dbcp_devicetype != other.dbcp_devicetype) return false
        if (this.dbcp_reserved != other.dbcp_reserved) return false
        if (!this.dbcp_name.contentEquals(other.dbcp_name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbcp_size.hashCode()
        result = 31 * result + this.dbcp_devicetype.hashCode()
        result = 31 * result + this.dbcp_reserved.hashCode()
        result = 31 * result + this.dbcp_name.contentHashCode()
        return result
    }
}

public data class DEV_BROADCAST_VOLUME(
    public var dbcv_size: UInt = 0u,
    public var dbcv_devicetype: UInt = 0u,
    public var dbcv_reserved: UInt = 0u,
    public var dbcv_unitmask: UInt = 0u,
    public var dbcv_flags: DEV_BROADCAST_VOLUME_FLAGS = 0u,
)

public data class DISK_HEALTH_NOTIFICATION_DATA(public var DeviceGuid: GUID = GUID())

public data class DLGITEMTEMPLATE(
    public var style: UInt = 0u,
    public var dwExtendedStyle: UInt = 0u,
    public var x: Short = 0,
    public var y: Short = 0,
    public var cx: Short = 0,
    public var cy: Short = 0,
    public var id: UShort = 0u,
)

public data class DLGTEMPLATE(
    public var style: UInt = 0u,
    public var dwExtendedStyle: UInt = 0u,
    public var cdit: UShort = 0u,
    public var x: Short = 0,
    public var y: Short = 0,
    public var cx: Short = 0,
    public var cy: Short = 0,
)

public data class DROPSTRUCT(
    public var hwndSource: HWND = 0L,
    public var hwndSink: HWND = 0L,
    public var wFmt: UInt = 0u,
    public var dwData: ULong = 0uL,
    public var ptDrop: POINT = POINT(),
    public var dwControlData: UInt = 0u,
)

public data class EVENTMSG(
    public var message: UInt = 0u,
    public var paramL: UInt = 0u,
    public var paramH: UInt = 0u,
    public var time: UInt = 0u,
    public var hwnd: HWND = 0L,
)

public data class FLASHWINFO(
    public var cbSize: UInt = 0u,
    public var hwnd: HWND = 0L,
    public var dwFlags: FLASHWINFO_FLAGS = 0u,
    public var uCount: UInt = 0u,
    public var dwTimeout: UInt = 0u,
)

public data class GETCLIPBMETADATA(
    public var Version: UInt = 0u,
    public var IsDelayRendered: BOOL = 0,
    public var IsSynthetic: BOOL = 0,
)

public data class GUID_IO_DISK_CLONE_ARRIVAL_INFORMATION(public var DiskNumber: UInt = 0u)

public data class GUITHREADINFO(
    public var cbSize: UInt = 0u,
    public var flags: GUITHREADINFO_FLAGS = 0u,
    public var hwndActive: HWND = 0L,
    public var hwndFocus: HWND = 0L,
    public var hwndCapture: HWND = 0L,
    public var hwndMenuOwner: HWND = 0L,
    public var hwndMoveSize: HWND = 0L,
    public var hwndCaret: HWND = 0L,
    public var rcCaret: RECT = RECT(),
)

public data class HARDWAREHOOKSTRUCT(
    public var hwnd: HWND = 0L,
    public var message: UInt = 0u,
    public var wParam: WPARAM = 0uL,
    public var lParam: LPARAM = 0L,
)

public data class ICONINFO(
    public var fIcon: BOOL = 0,
    public var xHotspot: UInt = 0u,
    public var yHotspot: UInt = 0u,
    public var hbmMask: HBITMAP = 0L,
    public var hbmColor: HBITMAP = 0L,
)

public data class ICONINFOEXA(
    public var cbSize: UInt = 0u,
    public var fIcon: BOOL = 0,
    public var xHotspot: UInt = 0u,
    public var yHotspot: UInt = 0u,
    public var hbmMask: HBITMAP = 0L,
    public var hbmColor: HBITMAP = 0L,
    public var wResID: UShort = 0u,
    public var szModName: ByteArray = ByteArray(260),
    public var szResName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ICONINFOEXA) return false
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

public data class ICONINFOEXW(
    public var cbSize: UInt = 0u,
    public var fIcon: BOOL = 0,
    public var xHotspot: UInt = 0u,
    public var yHotspot: UInt = 0u,
    public var hbmMask: HBITMAP = 0L,
    public var hbmColor: HBITMAP = 0L,
    public var wResID: UShort = 0u,
    public var szModName: UShortArray = UShortArray(260),
    public var szResName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ICONINFOEXW) return false
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

public data class ICONMETRICSA(
    public var cbSize: UInt = 0u,
    public var iHorzSpacing: Int = 0,
    public var iVertSpacing: Int = 0,
    public var iTitleWrap: Int = 0,
    public var lfFont: LOGFONTA = LOGFONTA(),
)

public data class ICONMETRICSW(
    public var cbSize: UInt = 0u,
    public var iHorzSpacing: Int = 0,
    public var iVertSpacing: Int = 0,
    public var iTitleWrap: Int = 0,
    public var lfFont: LOGFONTW = LOGFONTW(),
)

public data class IndexedResourceQualifier(public var name: PWSTR = 0L, public var value: PWSTR = 0L)

public data class KBDLLHOOKSTRUCT(
    public var vkCode: UInt = 0u,
    public var scanCode: UInt = 0u,
    public var flags: KBDLLHOOKSTRUCT_FLAGS = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: ULong = 0uL,
)

public data class MDICREATESTRUCTA(
    public var szClass: PCSTR = 0L,
    public var szTitle: PCSTR = 0L,
    public var hOwner: HANDLE = 0L,
    public var x: Int = 0,
    public var y: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var style: WINDOW_STYLE = 0u,
    public var lParam: LPARAM = 0L,
)

public data class MDICREATESTRUCTW(
    public var szClass: PCWSTR = 0L,
    public var szTitle: PCWSTR = 0L,
    public var hOwner: HANDLE = 0L,
    public var x: Int = 0,
    public var y: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var style: WINDOW_STYLE = 0u,
    public var lParam: LPARAM = 0L,
)

public data class MDINEXTMENU(
    public var hmenuIn: HMENU = 0L,
    public var hmenuNext: HMENU = 0L,
    public var hwndNext: HWND = 0L,
)

public data class MENUBARINFO(
    public var cbSize: UInt = 0u,
    public var rcBar: RECT = RECT(),
    public var hMenu: HMENU = 0L,
    public var hwndMenu: HWND = 0L,
    public var _bitfield: Int = 0,
)

public data class MENUEX_TEMPLATE_HEADER(
    public var wVersion: UShort = 0u,
    public var wOffset: UShort = 0u,
    public var dwHelpId: UInt = 0u,
)

public data class MENUEX_TEMPLATE_ITEM(
    public var dwType: UInt = 0u,
    public var dwState: UInt = 0u,
    public var uId: UInt = 0u,
    public var wFlags: UShort = 0u,
    public var szText: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MENUEX_TEMPLATE_ITEM) return false
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

public data class MENUGETOBJECTINFO(
    public var dwFlags: MENUGETOBJECTINFO_FLAGS = 0u,
    public var uPos: UInt = 0u,
    public var hmenu: HMENU = 0L,
    public var riid: Long = 0L,
    public var pvObj: Long = 0L,
)

public data class MENUINFO(
    public var cbSize: UInt = 0u,
    public var fMask: MENUINFO_MASK = 0u,
    public var dwStyle: MENUINFO_STYLE = 0u,
    public var cyMax: UInt = 0u,
    public var hbrBack: HBRUSH = 0L,
    public var dwContextHelpID: UInt = 0u,
    public var dwMenuData: ULong = 0uL,
)

public data class MENUITEMINFOA(
    public var cbSize: UInt = 0u,
    public var fMask: MENU_ITEM_MASK = 0u,
    public var fType: MENU_ITEM_TYPE = 0u,
    public var fState: MENU_ITEM_STATE = 0u,
    public var wID: UInt = 0u,
    public var hSubMenu: HMENU = 0L,
    public var hbmpChecked: HBITMAP = 0L,
    public var hbmpUnchecked: HBITMAP = 0L,
    public var dwItemData: ULong = 0uL,
    public var dwTypeData: PSTR = 0L,
    public var cch: UInt = 0u,
    public var hbmpItem: HBITMAP = 0L,
)

public data class MENUITEMINFOW(
    public var cbSize: UInt = 0u,
    public var fMask: MENU_ITEM_MASK = 0u,
    public var fType: MENU_ITEM_TYPE = 0u,
    public var fState: MENU_ITEM_STATE = 0u,
    public var wID: UInt = 0u,
    public var hSubMenu: HMENU = 0L,
    public var hbmpChecked: HBITMAP = 0L,
    public var hbmpUnchecked: HBITMAP = 0L,
    public var dwItemData: ULong = 0uL,
    public var dwTypeData: PWSTR = 0L,
    public var cch: UInt = 0u,
    public var hbmpItem: HBITMAP = 0L,
)

public data class MENUITEMTEMPLATE(
    public var mtOption: UShort = 0u,
    public var mtID: UShort = 0u,
    public var mtString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MENUITEMTEMPLATE) return false
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

public data class MENUITEMTEMPLATEHEADER(public var versionNumber: UShort = 0u, public var offset: UShort = 0u)

public data class MENUTEMPLATEEX(public var Anonymous: MENUTEMPLATEEX_0 = MENUTEMPLATEEX_0())

public data class MENUTEMPLATEEX_0(public var Menu: MENUTEMPLATEEX_0_0 = MENUTEMPLATEEX_0_0(), public var MenuEx: MENUTEMPLATEEX_0_1 = MENUTEMPLATEEX_0_1())

public data class MENUTEMPLATEEX_0_1(public var mexHeader: MENUEX_TEMPLATE_HEADER = MENUEX_TEMPLATE_HEADER(), public var mexItem: List<MENUEX_TEMPLATE_ITEM> = List(1) { MENUEX_TEMPLATE_ITEM() })

public data class MENUTEMPLATEEX_0_0(public var mitHeader: MENUITEMTEMPLATEHEADER = MENUITEMTEMPLATEHEADER(), public var miTemplate: List<MENUITEMTEMPLATE> = List(1) { MENUITEMTEMPLATE() })

public data class MESSAGE_RESOURCE_BLOCK(
    public var LowId: UInt = 0u,
    public var HighId: UInt = 0u,
    public var OffsetToEntries: UInt = 0u,
)

public data class MESSAGE_RESOURCE_DATA(public var NumberOfBlocks: UInt = 0u, public var Blocks: List<MESSAGE_RESOURCE_BLOCK> = List(1) { MESSAGE_RESOURCE_BLOCK() })

public data class MESSAGE_RESOURCE_ENTRY(
    public var Length: UShort = 0u,
    public var Flags: UShort = 0u,
    public var Text: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MESSAGE_RESOURCE_ENTRY) return false
        if (this.Length != other.Length) return false
        if (this.Flags != other.Flags) return false
        if (!this.Text.contentEquals(other.Text)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Text.contentHashCode()
        return result
    }
}

public data class MINIMIZEDMETRICS(
    public var cbSize: UInt = 0u,
    public var iWidth: Int = 0,
    public var iHorzGap: Int = 0,
    public var iVertGap: Int = 0,
    public var iArrange: MINIMIZEDMETRICS_ARRANGE = 0,
)

public data class MINMAXINFO(
    public var ptReserved: POINT = POINT(),
    public var ptMaxSize: POINT = POINT(),
    public var ptMaxPosition: POINT = POINT(),
    public var ptMinTrackSize: POINT = POINT(),
    public var ptMaxTrackSize: POINT = POINT(),
)

public data class MOUSEHOOKSTRUCT(
    public var pt: POINT = POINT(),
    public var hwnd: HWND = 0L,
    public var wHitTestCode: UInt = 0u,
    public var dwExtraInfo: ULong = 0uL,
)

public data class MOUSEHOOKSTRUCTEX(public var Base: MOUSEHOOKSTRUCT = MOUSEHOOKSTRUCT(), public var mouseData: UInt = 0u)

public data class MSG(
    public var hwnd: HWND = 0L,
    public var message: UInt = 0u,
    public var wParam: WPARAM = 0uL,
    public var lParam: LPARAM = 0L,
    public var time: UInt = 0u,
    public var pt: POINT = POINT(),
)

public data class MSGBOXPARAMSA(
    public var cbSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszText: PCSTR = 0L,
    public var lpszCaption: PCSTR = 0L,
    public var dwStyle: MESSAGEBOX_STYLE = 0u,
    public var lpszIcon: PCSTR = 0L,
    public var dwContextHelpId: ULong = 0uL,
    public var lpfnMsgBoxCallback: MSGBOXCALLBACK = null,
    public var dwLanguageId: UInt = 0u,
)

public data class MSGBOXPARAMSW(
    public var cbSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszText: PCWSTR = 0L,
    public var lpszCaption: PCWSTR = 0L,
    public var dwStyle: MESSAGEBOX_STYLE = 0u,
    public var lpszIcon: PCWSTR = 0L,
    public var dwContextHelpId: ULong = 0uL,
    public var lpfnMsgBoxCallback: MSGBOXCALLBACK = null,
    public var dwLanguageId: UInt = 0u,
)

public data class MSLLHOOKSTRUCT(
    public var pt: POINT = POINT(),
    public var mouseData: UInt = 0u,
    public var flags: UInt = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: ULong = 0uL,
)

public data class MrmResourceIndexerHandle(public var handle: Long = 0L)

public data class MrmResourceIndexerMessage(
    public var severity: MrmResourceIndexerMessageSeverity = 0,
    public var id: UInt = 0u,
    public var text: PCWSTR = 0L,
)

public data class NCCALCSIZE_PARAMS(public var rgrc: List<RECT> = List(3) { RECT() }, public var lppos: Long = 0L)

public data class NONCLIENTMETRICSA(
    public var cbSize: UInt = 0u,
    public var iBorderWidth: Int = 0,
    public var iScrollWidth: Int = 0,
    public var iScrollHeight: Int = 0,
    public var iCaptionWidth: Int = 0,
    public var iCaptionHeight: Int = 0,
    public var lfCaptionFont: LOGFONTA = LOGFONTA(),
    public var iSmCaptionWidth: Int = 0,
    public var iSmCaptionHeight: Int = 0,
    public var lfSmCaptionFont: LOGFONTA = LOGFONTA(),
    public var iMenuWidth: Int = 0,
    public var iMenuHeight: Int = 0,
    public var lfMenuFont: LOGFONTA = LOGFONTA(),
    public var lfStatusFont: LOGFONTA = LOGFONTA(),
    public var lfMessageFont: LOGFONTA = LOGFONTA(),
    public var iPaddedBorderWidth: Int = 0,
)

public data class NONCLIENTMETRICSW(
    public var cbSize: UInt = 0u,
    public var iBorderWidth: Int = 0,
    public var iScrollWidth: Int = 0,
    public var iScrollHeight: Int = 0,
    public var iCaptionWidth: Int = 0,
    public var iCaptionHeight: Int = 0,
    public var lfCaptionFont: LOGFONTW = LOGFONTW(),
    public var iSmCaptionWidth: Int = 0,
    public var iSmCaptionHeight: Int = 0,
    public var lfSmCaptionFont: LOGFONTW = LOGFONTW(),
    public var iMenuWidth: Int = 0,
    public var iMenuHeight: Int = 0,
    public var lfMenuFont: LOGFONTW = LOGFONTW(),
    public var lfStatusFont: LOGFONTW = LOGFONTW(),
    public var lfMessageFont: LOGFONTW = LOGFONTW(),
    public var iPaddedBorderWidth: Int = 0,
)

public data class SCROLLBARINFO(
    public var cbSize: UInt = 0u,
    public var rcScrollBar: RECT = RECT(),
    public var dxyLineButton: Int = 0,
    public var xyThumbTop: Int = 0,
    public var xyThumbBottom: Int = 0,
    public var reserved: Int = 0,
    public var rgstate: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCROLLBARINFO) return false
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

public data class SCROLLINFO(
    public var cbSize: UInt = 0u,
    public var fMask: SCROLLINFO_MASK = 0u,
    public var nMin: Int = 0,
    public var nMax: Int = 0,
    public var nPage: UInt = 0u,
    public var nPos: Int = 0,
    public var nTrackPos: Int = 0,
)

public data class SHELLHOOKINFO(public var hwnd: HWND = 0L, public var rc: RECT = RECT())

public data class STYLESTRUCT(public var styleOld: UInt = 0u, public var styleNew: UInt = 0u)

public data class TITLEBARINFO(
    public var cbSize: UInt = 0u,
    public var rcTitleBar: RECT = RECT(),
    public var rgstate: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TITLEBARINFO) return false
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

public data class TITLEBARINFOEX(
    public var cbSize: UInt = 0u,
    public var rcTitleBar: RECT = RECT(),
    public var rgstate: UIntArray = UIntArray(6),
    public var rgrect: List<RECT> = List(6) { RECT() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TITLEBARINFOEX) return false
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

public data class TOUCHPREDICTIONPARAMETERS(
    public var cbSize: UInt = 0u,
    public var dwLatency: UInt = 0u,
    public var dwSampleTime: UInt = 0u,
    public var bUseHWTimeStamp: UInt = 0u,
)

public data class TPMPARAMS(public var cbSize: UInt = 0u, public var rcExclude: RECT = RECT())

public data class UPDATELAYEREDWINDOWINFO(
    public var cbSize: UInt = 0u,
    public var hdcDst: HDC = 0L,
    public var pptDst: Long = 0L,
    public var psize: Long = 0L,
    public var hdcSrc: HDC = 0L,
    public var pptSrc: Long = 0L,
    public var crKey: COLORREF = 0u,
    public var pblend: Long = 0L,
    public var dwFlags: UPDATE_LAYERED_WINDOW_FLAGS = 0u,
    public var prcDirty: Long = 0L,
)

public data class VolLockBroadcast(
    public var vlb_dbh: DEV_BROADCAST_HDR = DEV_BROADCAST_HDR(),
    public var vlb_owner: UInt = 0u,
    public var vlb_perms: UByte = 0u,
    public var vlb_lockType: UByte = 0u,
    public var vlb_drive: UByte = 0u,
    public var vlb_flags: UByte = 0u,
)

public data class WINDOWINFO(
    public var cbSize: UInt = 0u,
    public var rcWindow: RECT = RECT(),
    public var rcClient: RECT = RECT(),
    public var dwStyle: WINDOW_STYLE = 0u,
    public var dwExStyle: WINDOW_EX_STYLE = 0u,
    public var dwWindowStatus: UInt = 0u,
    public var cxWindowBorders: UInt = 0u,
    public var cyWindowBorders: UInt = 0u,
    public var atomWindowType: UShort = 0u,
    public var wCreatorVersion: UShort = 0u,
)

public data class WINDOWPLACEMENT(
    public var length: UInt = 0u,
    public var flags: WINDOWPLACEMENT_FLAGS = 0u,
    public var showCmd: UInt = 0u,
    public var ptMinPosition: POINT = POINT(),
    public var ptMaxPosition: POINT = POINT(),
    public var rcNormalPosition: RECT = RECT(),
)

public data class WINDOWPOS(
    public var hwnd: HWND = 0L,
    public var hwndInsertAfter: HWND = 0L,
    public var x: Int = 0,
    public var y: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var flags: SET_WINDOW_POS_FLAGS = 0u,
)

public data class WNDCLASSA(
    public var style: WNDCLASS_STYLES = 0u,
    public var lpfnWndProc: WNDPROC = null,
    public var cbClsExtra: Int = 0,
    public var cbWndExtra: Int = 0,
    public var hInstance: HINSTANCE = 0L,
    public var hIcon: HICON = 0L,
    public var hCursor: HCURSOR = 0L,
    public var hbrBackground: HBRUSH = 0L,
    public var lpszMenuName: PCSTR = 0L,
    public var lpszClassName: PCSTR = 0L,
)

public data class WNDCLASSEXA(
    public var cbSize: UInt = 0u,
    public var style: WNDCLASS_STYLES = 0u,
    public var lpfnWndProc: WNDPROC = null,
    public var cbClsExtra: Int = 0,
    public var cbWndExtra: Int = 0,
    public var hInstance: HINSTANCE = 0L,
    public var hIcon: HICON = 0L,
    public var hCursor: HCURSOR = 0L,
    public var hbrBackground: HBRUSH = 0L,
    public var lpszMenuName: PCSTR = 0L,
    public var lpszClassName: PCSTR = 0L,
    public var hIconSm: HICON = 0L,
)

public data class WNDCLASSEXW(
    public var cbSize: UInt = 0u,
    public var style: WNDCLASS_STYLES = 0u,
    public var lpfnWndProc: WNDPROC = null,
    public var cbClsExtra: Int = 0,
    public var cbWndExtra: Int = 0,
    public var hInstance: HINSTANCE = 0L,
    public var hIcon: HICON = 0L,
    public var hCursor: HCURSOR = 0L,
    public var hbrBackground: HBRUSH = 0L,
    public var lpszMenuName: PCWSTR = 0L,
    public var lpszClassName: PCWSTR = 0L,
    public var hIconSm: HICON = 0L,
)

public data class WNDCLASSW(
    public var style: WNDCLASS_STYLES = 0u,
    public var lpfnWndProc: WNDPROC = null,
    public var cbClsExtra: Int = 0,
    public var cbWndExtra: Int = 0,
    public var hInstance: HINSTANCE = 0L,
    public var hIcon: HICON = 0L,
    public var hCursor: HCURSOR = 0L,
    public var hbrBackground: HBRUSH = 0L,
    public var lpszMenuName: PCWSTR = 0L,
    public var lpszClassName: PCWSTR = 0L,
)

public data class _DEV_BROADCAST_HEADER(
    public var dbcd_size: UInt = 0u,
    public var dbcd_devicetype: UInt = 0u,
    public var dbcd_reserved: UInt = 0u,
)

public data class _DEV_BROADCAST_USERDEFINED(public var dbud_dbh: DEV_BROADCAST_HDR = DEV_BROADCAST_HDR(), public var dbud_szName: ByteArray = ByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is _DEV_BROADCAST_USERDEFINED) return false
        if (this.dbud_dbh != other.dbud_dbh) return false
        if (!this.dbud_szName.contentEquals(other.dbud_szName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbud_dbh.hashCode()
        result = 31 * result + this.dbud_szName.contentHashCode()
        return result
    }
}
