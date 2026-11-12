@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
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
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn

private object WindowsWin32UiWindowsandmessagingJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32UiWindowsandmessagingJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingAdjustWindowRect(lprect: Long, dwstyle: Int, bmenu: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingAdjustWindowRectEx(lprect: Long, dwstyle: Int, bmenu: Int, dwexstyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingAllowSetForegroundWindow(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingAnimateWindow(hwnd: Long, dwtime: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingAnyPopup(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingAppendMenuA(hmenu: Long, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingAppendMenuW(hmenu: Long, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingArrangeIconicWindows(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingBeginDeferWindowPos(nnumwindows: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingBringWindowToTop(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCalculatePopupWindowPosition(anchorpoint: Long, windowsize: Long, flags: Int, excluderect: Long, popupwindowposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCallMsgFilterA(lpmsg: Long, ncode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCallMsgFilterW(lpmsg: Long, ncode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCallNextHookEx(hhk: Long, ncode: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCallWindowProcA(lpprevwndfunc: Long, hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCallWindowProcW(lpprevwndfunc: Long, hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCancelShutdown(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCascadeWindows(hwndparent: Long, whow: Int, lprect: Long, ckids: Int, lpkids: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingChangeMenuA(hmenu: Long, cmd: Int, lpsznewitem: Long, cmdinsert: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingChangeMenuW(hmenu: Long, cmd: Int, lpsznewitem: Long, cmdinsert: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilter(message: Int, dwflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilterEx(hwnd: Long, message: Int, action: Int, pchangefilterstruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharLowerA(lpsz: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharLowerBuffA(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharLowerBuffW(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharLowerW(lpsz: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharNextA(lpsz: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharNextExA(codepage: Short, lpcurrentchar: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharNextW(lpsz: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharPrevA(lpszstart: Long, lpszcurrent: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharPrevExA(codepage: Short, lpstart: Long, lpcurrentchar: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharPrevW(lpszstart: Long, lpszcurrent: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharToOemA(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharToOemBuffA(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharToOemBuffW(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharToOemW(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharUpperA(lpsz: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharUpperBuffA(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharUpperBuffW(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCharUpperW(lpsz: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCheckMenuItem(hmenu: Long, uidcheckitem: Int, ucheck: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCheckMenuRadioItem(hmenu: Long, first: Int, last: Int, check: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingClipCursor(lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCloseWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableA(haccelsrc: Long, lpacceldst: Long, caccelentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableW(haccelsrc: Long, lpacceldst: Long, caccelentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCopyIcon(hicon: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCopyImage(h: Long, type: Int, cx: Int, cy: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableA(paccel: Long, caccel: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableW(paccel: Long, caccel: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateCaret(hwnd: Long, hbitmap: Long, nwidth: Int, nheight: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateCursor(hinst: Long, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: Long, pvxorplane: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamA(hinstance: Long, lptemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamW(hinstance: Long, lptemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateDialogParamA(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateDialogParamW(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateIcon(hinstance: Long, nwidth: Int, nheight: Int, cplanes: Byte, cbitspixel: Byte, lpbandbits: Long, lpbxorbits: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateIconFromResource(presbits: Long, dwressize: Int, ficon: Int, dwver: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateIconFromResourceEx(presbits: Long, dwressize: Int, ficon: Int, dwver: Int, cxdesired: Int, cydesired: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateIconIndirect(piconinfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowA(lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hinstance: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowW(lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hinstance: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateMenu(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreatePopupMenu(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateResourceIndexer(projectroot: Long, extensiondllpath: Long, ppresourceindexer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateWindowExA(dwexstyle: Int, lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hmenu: Long, hinstance: Long, lpparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingCreateWindowExW(dwexstyle: Int, lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hmenu: Long, hinstance: Long, lpparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDefDlgProcA(hdlg: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDefDlgProcW(hdlg: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDefFrameProcA(hwnd: Long, hwndmdiclient: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDefFrameProcW(hwnd: Long, hwndmdiclient: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcA(hwnd: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcW(hwnd: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDefWindowProcA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDefWindowProcW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDeferWindowPos(hwinposinfo: Long, hwnd: Long, hwndinsertafter: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDeleteMenu(hmenu: Long, uposition: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDeregisterShellHookWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDestroyAcceleratorTable(haccel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDestroyCaret(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDestroyCursor(hcursor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDestroyIcon(hicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDestroyIndexedResults(resourceuri: Long, qualifiercount: Int, qualifiers: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDestroyMenu(hmenu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDestroyResourceIndexer(resourceindexer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDestroyWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamA(hinstance: Long, hdialogtemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamW(hinstance: Long, hdialogtemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDialogBoxParamA(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDialogBoxParamW(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDisableProcessWindowsGhosting()

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDispatchMessageA(lpmsg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDispatchMessageW(lpmsg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDragObject(hwndparent: Long, hwndfrom: Long, fmt: Int, data: Long, hcur: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDrawIcon(hdc: Long, x: Int, y: Int, hicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDrawIconEx(hdc: Long, xleft: Int, ytop: Int, hicon: Long, cxwidth: Int, cywidth: Int, istepifanicur: Int, hbrflickerfreedraw: Long, diflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingDrawMenuBar(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEnableMenuItem(hmenu: Long, uidenableitem: Int, uenable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEndDeferWindowPos(hwinposinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEndDialog(hdlg: Long, nresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEndMenu(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEnumChildWindows(hwndparent: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEnumPropsA(hwnd: Long, lpenumfunc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEnumPropsExA(hwnd: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEnumPropsExW(hwnd: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEnumPropsW(hwnd: Long, lpenumfunc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEnumThreadWindows(dwthreadid: Int, lpfn: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingEnumWindows(lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingFindWindowA(lpclassname: Long, lpwindowname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingFindWindowExA(hwndparent: Long, hwndchildafter: Long, lpszclass: Long, lpszwindow: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingFindWindowExW(hwndparent: Long, hwndchildafter: Long, lpszclass: Long, lpszwindow: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingFindWindowW(lpclassname: Long, lpwindowname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingFlashWindow(hwnd: Long, binvert: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingFlashWindowEx(pfwi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoA(hwnd: Long, iitem: Int, pati: Long, pszitemtext: Long, cchitemtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoW(hwnd: Long, iitem: Int, pati: Long, pszitemtext: Long, cchitemtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetAncestor(hwnd: Long, gaflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetCaretBlinkTime(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetCaretPos(lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassInfoA(hinstance: Long, lpclassname: Long, lpwndclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassInfoExA(hinstance: Long, lpszclass: Long, lpwcx: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassInfoExW(hinstance: Long, lpszclass: Long, lpwcx: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassInfoW(hinstance: Long, lpclassname: Long, lpwndclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassLongA(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrA(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrW(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassLongW(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassNameA(hwnd: Long, lpclassname: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassNameW(hwnd: Long, lpclassname: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClassWord(hwnd: Long, nindex: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClientRect(hwnd: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetClipCursor(lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetCursor(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetCursorInfo(pci: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetCursorPos(lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetDesktopWindow(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetDialogBaseUnits(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetDlgCtrlID(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetDlgItem(hdlg: Long, niddlgitem: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetDlgItemInt(hdlg: Long, niddlgitem: Int, lptranslated: Long, bsigned: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextA(hdlg: Long, niddlgitem: Int, lpstring: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextW(hdlg: Long, niddlgitem: Int, lpstring: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetForegroundWindow(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetGUIThreadInfo(idthread: Int, pgui: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetIconInfo(hicon: Long, piconinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetIconInfoExA(hicon: Long, piconinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetIconInfoExW(hicon: Long, piconinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetInputState(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetLastActivePopup(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetLayeredWindowAttributes(hwnd: Long, pcrkey: Long, pbalpha: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenu(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuBarInfo(hwnd: Long, idobject: Int, iditem: Int, pmbi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuCheckMarkDimensions(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuDefaultItem(hmenu: Long, fbypos: Int, gmdiflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuInfo(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuItemCount(hmenu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuItemID(hmenu: Long, npos: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoA(hmenu: Long, item: Int, fbyposition: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoW(hmenu: Long, item: Int, fbyposition: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuItemRect(hwnd: Long, hmenu: Long, uitem: Int, lprcitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuState(hmenu: Long, uid: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuStringA(hmenu: Long, uiditem: Int, lpstring: Long, cchmax: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMenuStringW(hmenu: Long, uiditem: Int, lpstring: Long, cchmax: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMessageA(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMessageExtraInfo(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMessagePos(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMessageTime(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetMessageW(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetNextDlgGroupItem(hdlg: Long, hctl: Long, bprevious: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetNextDlgTabItem(hdlg: Long, hctl: Long, bprevious: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetParent(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetPhysicalCursorPos(lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetProcessDefaultLayout(pdwdefaultlayout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetPropA(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetPropW(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetQueueStatus(flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetScrollBarInfo(hwnd: Long, idobject: Int, psbi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetScrollInfo(hwnd: Long, nbar: Int, lpsi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetScrollPos(hwnd: Long, nbar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetScrollRange(hwnd: Long, nbar: Int, lpminpos: Long, lpmaxpos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetShellWindow(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetSubMenu(hmenu: Long, npos: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetSystemMenu(hwnd: Long, brevert: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetSystemMetrics(nindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetTitleBarInfo(hwnd: Long, pti: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetTopWindow(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindow(hwnd: Long, ucmd: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowDisplayAffinity(hwnd: Long, pdwaffinity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowInfo(hwnd: Long, pwi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowLongA(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrA(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrW(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowLongW(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameA(hwnd: Long, pszfilename: Long, cchfilenamemax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameW(hwnd: Long, pszfilename: Long, cchfilenamemax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowPlacement(hwnd: Long, lpwndpl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowRect(hwnd: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowTextA(hwnd: Long, lpstring: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthA(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthW(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowTextW(hwnd: Long, lpstring: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowThreadProcessId(hwnd: Long, lpdwprocessid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingGetWindowWord(hwnd: Long, nindex: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingHideCaret(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingHiliteMenuItem(hwnd: Long, hmenu: Long, uidhiliteitem: Int, uhilite: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingInSendMessage(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingInSendMessageEx(lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIndexFilePath(resourceindexer: Long, filepath: Long, ppresourceuri: Long, pqualifiercount: Long, ppqualifiers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingInheritWindowMonitor(hwnd: Long, hwndinherit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingInsertMenuA(hmenu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingInsertMenuItemA(hmenu: Long, item: Int, fbyposition: Int, lpmi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingInsertMenuItemW(hmenu: Long, item: Int, fbyposition: Int, lpmi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingInsertMenuW(hmenu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingInternalGetWindowText(hwnd: Long, pstring: Long, cchmaxcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaA(ch: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericA(ch: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericW(ch: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaW(ch: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsCharLowerA(ch: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsCharUpperA(ch: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsCharUpperW(ch: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsChild(hwndparent: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsDialogMessageA(hdlg: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsDialogMessageW(hdlg: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsGUIThread(bconvert: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsHungAppWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsIconic(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsMenu(hmenu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsProcessDPIAware(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsWindowArranged(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsWindowUnicode(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsWindowVisible(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsWow64Message(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingIsZoomed(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingKillTimer(hwnd: Long, uidevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsA(hinstance: Long, lptablename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsW(hinstance: Long, lptablename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadCursorA(hinstance: Long, lpcursorname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileA(lpfilename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileW(lpfilename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadCursorW(hinstance: Long, lpcursorname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadIconA(hinstance: Long, lpiconname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadIconW(hinstance: Long, lpiconname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadImageA(hinst: Long, name: Long, type: Int, cx: Int, cy: Int, fuload: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadImageW(hinst: Long, name: Long, type: Int, cx: Int, cy: Int, fuload: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadMenuA(hinstance: Long, lpmenuname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectA(lpmenutemplate: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectW(lpmenutemplate: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadMenuW(hinstance: Long, lpmenuname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadStringA(hinstance: Long, uid: Int, lpbuffer: Long, cchbuffermax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLoadStringW(hinstance: Long, uid: Int, lpbuffer: Long, cchbuffermax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLockSetForegroundWindow(ulockcode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLogicalToPhysicalPoint(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectory(presbits: Long, ficon: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectoryEx(presbits: Long, ficon: Int, cxdesired: Int, cydesired: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMapDialogRect(hdlg: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMessageBoxA(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMessageBoxExA(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int, wlanguageid: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMessageBoxExW(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int, wlanguageid: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectA(lpmbp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectW(lpmbp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMessageBoxW(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingModifyMenuA(hmnu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingModifyMenuW(hmnu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMoveWindow(hwnd: Long, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmCreateConfig(platformversion: Int, defaultqualifiers: Long, outputxmlfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmCreateConfigInMemory(platformversion: Int, defaultqualifiers: Long, outputxmldata: Long, outputxmlsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexer(packagefamilyname: Long, projectroot: Long, platformversion: Int, defaultqualifiers: Long, indexer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriData(projectroot: Long, platformversion: Int, defaultqualifiers: Long, pridata: Long, prisize: Int, indexer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriFile(projectroot: Long, platformversion: Int, defaultqualifiers: Long, prifile: Long, indexer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Long, platformversion: Int, defaultqualifiers: Long, schemaxmldata: Long, schemaxmlsize: Int, indexer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Long, platformversion: Int, defaultqualifiers: Long, schemafile: Long, indexer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerWithFlags(packagefamilyname: Long, projectroot: Long, platformversion: Int, defaultqualifiers: Long, flags: Int, indexer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriDataInMemory(inputpridata: Long, inputprisize: Int, schemapridata: Long, schemaprisize: Int, dumptype: Int, outputxmldata: Long, outputxmlsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFile(indexfilename: Long, schemaprifile: Long, dumptype: Int, outputxmlfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFileInMemory(indexfilename: Long, schemaprifile: Long, dumptype: Int, outputxmldata: Long, outputxmlsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmFreeMemory(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMrmGetPriFileContentChecksum(prifile: Long, checksum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjects(ncount: Int, phandles: Long, fwaitall: Int, dwmilliseconds: Int, dwwakemask: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjectsEx(ncount: Int, phandles: Long, dwmilliseconds: Int, dwwakemask: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingOemToCharA(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingOemToCharBuffA(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingOemToCharBuffW(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingOemToCharW(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingOpenIcon(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingPeekMessageA(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int, wremovemsg: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingPeekMessageW(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int, wremovemsg: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingPhysicalToLogicalPoint(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingPostMessageA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingPostMessageW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingPostQuitMessage(nexitcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingPostThreadMessageA(idthread: Int, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingPostThreadMessageW(idthread: Int, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsA(szfilename: Long, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsW(szfilename: Long, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassA(hwnd: Long, ptszclassname: Long, cchclassnamemax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassW(hwnd: Long, ptszclassname: Long, cchclassnamemax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRegisterClassA(lpwndclass: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRegisterClassExA(param0: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRegisterClassExW(param0: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRegisterClassW(lpwndclass: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationA(hrecipient: Long, notificationfilter: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationW(hrecipient: Long, notificationfilter: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRegisterForTooltipDismissNotification(hwnd: Long, tdflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRegisterShellHookWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageA(lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageW(lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRemoveMenu(hmenu: Long, uposition: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRemovePropA(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingRemovePropW(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingReplyMessage(lresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingScrollDC(hdc: Long, dx: Int, dy: Int, lprcscroll: Long, lprcclip: Long, hrgnupdate: Long, lprcupdate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingScrollWindow(hwnd: Long, xamount: Int, yamount: Int, lprect: Long, lpcliprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingScrollWindowEx(hwnd: Long, dx: Int, dy: Int, prcscroll: Long, prcclip: Long, hrgnupdate: Long, prcupdate: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageA(hdlg: Long, niddlgitem: Int, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageW(hdlg: Long, niddlgitem: Int, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSendMessageA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackA(hwnd: Long, msg: Int, wparam: Long, lparam: Long, lpresultcallback: Long, dwdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackW(hwnd: Long, msg: Int, wparam: Long, lparam: Long, lpresultcallback: Long, dwdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutA(hwnd: Long, msg: Int, wparam: Long, lparam: Long, fuflags: Int, utimeout: Int, lpdwresult: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutW(hwnd: Long, msg: Int, wparam: Long, lparam: Long, fuflags: Int, utimeout: Int, lpdwresult: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSendMessageW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetAdditionalForegroundBoostProcesses(toplevelwindow: Long, processhandlecount: Int, processhandlearray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetCaretBlinkTime(umseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetCaretPos(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetClassLongA(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrA(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrW(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetClassLongW(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetClassWord(hwnd: Long, nindex: Int, wnewword: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetCoalescableTimer(hwnd: Long, nidevent: Long, uelapse: Int, lptimerfunc: Long, utolerancedelay: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetCursor(hcursor: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetCursorPos(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetDebugErrorLevel(dwlevel: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetDlgItemInt(hdlg: Long, niddlgitem: Int, uvalue: Int, bsigned: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextA(hdlg: Long, niddlgitem: Int, lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextW(hdlg: Long, niddlgitem: Int, lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetForegroundWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetLayeredWindowAttributes(hwnd: Long, crkey: Int, balpha: Byte, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetMenu(hwnd: Long, hmenu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetMenuDefaultItem(hmenu: Long, uitem: Int, fbypos: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetMenuInfo(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetMenuItemBitmaps(hmenu: Long, uposition: Int, uflags: Int, hbitmapunchecked: Long, hbitmapchecked: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoA(hmenu: Long, item: Int, fbypositon: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoW(hmenu: Long, item: Int, fbypositon: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetMessageExtraInfo(lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetMessageQueue(cmessagesmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetParent(hwndchild: Long, hwndnewparent: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetPhysicalCursorPos(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetProcessDPIAware(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetProcessDefaultLayout(dwdefaultlayout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetPropA(hwnd: Long, lpstring: Long, hdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetPropW(hwnd: Long, lpstring: Long, hdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetSystemCursor(hcur: Long, id: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetTimer(hwnd: Long, nidevent: Long, uelapse: Int, lptimerfunc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowDisplayAffinity(hwnd: Long, dwaffinity: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowLongA(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrA(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrW(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowLongW(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowPlacement(hwnd: Long, lpwndpl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowPos(hwnd: Long, hwndinsertafter: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowTextA(hwnd: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowTextW(hwnd: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowWord(hwnd: Long, nindex: Int, wnewword: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookA(nfiltertype: Int, pfnfilterproc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExA(idhook: Int, lpfn: Long, hmod: Long, dwthreadid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExW(idhook: Int, lpfn: Long, hmod: Long, dwthreadid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookW(nfiltertype: Int, pfnfilterproc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingShowCaret(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingShowCursor(bshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingShowOwnedPopups(hwnd: Long, fshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingShowWindow(hwnd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingShowWindowAsync(hwnd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSoundSentry(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSwitchToThisWindow(hwnd: Long, funknown: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoA(uiaction: Int, uiparam: Int, pvparam: Long, fwinini: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoW(uiaction: Int, uiparam: Int, pvparam: Long, fwinini: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingTileWindows(hwndparent: Long, whow: Int, lprect: Long, ckids: Int, lpkids: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingTrackPopupMenu(hmenu: Long, uflags: Int, x: Int, y: Int, nreserved: Int, hwnd: Long, prcrect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingTrackPopupMenuEx(hmenu: Long, uflags: Int, x: Int, y: Int, hwnd: Long, lptpm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorA(hwnd: Long, hacctable: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorW(hwnd: Long, hacctable: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingTranslateMDISysAccel(hwndclient: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingTranslateMessage(lpmsg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHook(ncode: Int, pfnfilterproc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHookEx(hhk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingUnregisterClassA(lpclassname: Long, hinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingUnregisterClassW(lpclassname: Long, hinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingUnregisterDeviceNotification(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindow(hwnd: Long, hdcdst: Long, pptdst: Long, psize: Long, hdcsrc: Long, pptsrc: Long, crkey: Int, pblend: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindowIndirect(hwnd: Long, pulwinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingWaitMessage(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingWsprintfA(param0: Long, param1: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingWsprintfW(param0: Long, param1: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingWvsprintfA(param0: Long, param1: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiWindowsandmessagingWvsprintfW(param0: Long, param1: Long, arglist: Long): Int
}

public actual fun adjustWindowRect(lprect: MutPtr, dwstyle: WindowStyle, bmenu: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingAdjustWindowRect(lprect.rawAddress, dwstyle.toInt(), bmenu)

public actual fun adjustWindowRectEx(lprect: MutPtr, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingAdjustWindowRectEx(lprect.rawAddress, dwstyle.toInt(), bmenu, dwexstyle.toInt())

public actual fun allowSetForegroundWindow(dwprocessid: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingAllowSetForegroundWindow(dwprocessid.toInt())

public actual fun animateWindow(hwnd: Hwnd, dwtime: UInt, dwflags: AnimateWindowFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingAnimateWindow(hwnd.rawAddress, dwtime.toInt(), dwflags.toInt())

public actual fun anyPopup(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingAnyPopup()

public actual fun appendMenuA(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingAppendMenuA(hmenu.rawAddress, uflags.toInt(), uidnewitem.toLong(), lpnewitem.rawAddress)

public actual fun appendMenuW(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingAppendMenuW(hmenu.rawAddress, uflags.toInt(), uidnewitem.toLong(), lpnewitem.rawAddress)

public actual fun arrangeIconicWindows(hwnd: Hwnd): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingArrangeIconicWindows(hwnd.rawAddress).toUInt()

public actual fun beginDeferWindowPos(nnumwindows: Int): Hdwp =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingBeginDeferWindowPos(nnumwindows))

public actual fun bringWindowToTop(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingBringWindowToTop(hwnd.rawAddress)

public actual fun calculatePopupWindowPosition(anchorpoint: ConstPtr, windowsize: ConstPtr, flags: UInt, excluderect: ConstPtr, popupwindowposition: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCalculatePopupWindowPosition(anchorpoint.rawAddress, windowsize.rawAddress, flags.toInt(), excluderect.rawAddress, popupwindowposition.rawAddress)

public actual fun callMsgFilterA(lpmsg: ConstPtr, ncode: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCallMsgFilterA(lpmsg.rawAddress, ncode)

public actual fun callMsgFilterW(lpmsg: ConstPtr, ncode: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCallMsgFilterW(lpmsg.rawAddress, ncode)

public actual fun callNextHookEx(hhk: Hhook, ncode: Int, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCallNextHookEx(hhk.rawAddress, ncode, wparam.toLong(), lparam)

public actual fun callWindowProcA(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCallWindowProcA(0L, hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun callWindowProcW(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCallWindowProcW(0L, hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun cancelShutdown(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCancelShutdown()

public actual fun cascadeWindows(hwndparent: Hwnd, whow: CascadeWindowsHow, lprect: ConstPtr, ckids: UInt, lpkids: ConstPtr): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCascadeWindows(hwndparent.rawAddress, whow.toInt(), lprect.rawAddress, ckids.toInt(), lpkids.rawAddress).toUShort()

public actual fun changeMenuA(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcstr, cmdinsert: UInt, flags: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingChangeMenuA(hmenu.rawAddress, cmd.toInt(), lpsznewitem.rawAddress, cmdinsert.toInt(), flags.toInt())

public actual fun changeMenuW(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcwstr, cmdinsert: UInt, flags: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingChangeMenuW(hmenu.rawAddress, cmd.toInt(), lpsznewitem.rawAddress, cmdinsert.toInt(), flags.toInt())

public actual fun changeWindowMessageFilter(message: UInt, dwflag: ChangeWindowMessageFilterFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilter(message.toInt(), dwflag.toInt())

public actual fun changeWindowMessageFilterEx(hwnd: Hwnd, message: UInt, action: WindowMessageFilterAction, pchangefilterstruct: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilterEx(hwnd.rawAddress, message.toInt(), action.toInt(), pchangefilterstruct.rawAddress)

public actual fun charLowerA(lpsz: Pstr): Pstr =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharLowerA(lpsz.rawAddress))

public actual fun charLowerBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharLowerBuffA(lpsz.rawAddress, cchlength.toInt()).toUInt()

public actual fun charLowerBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharLowerBuffW(lpsz.rawAddress, cchlength.toInt()).toUInt()

public actual fun charLowerW(lpsz: Pwstr): Pwstr =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharLowerW(lpsz.rawAddress))

public actual fun charNextA(lpsz: Pcstr): Pstr =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharNextA(lpsz.rawAddress))

public actual fun charNextExA(codepage: UShort, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharNextExA(codepage.toShort(), lpcurrentchar.rawAddress, dwflags.toInt()))

public actual fun charNextW(lpsz: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharNextW(lpsz.rawAddress))

public actual fun charPrevA(lpszstart: Pcstr, lpszcurrent: Pcstr): Pstr =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharPrevA(lpszstart.rawAddress, lpszcurrent.rawAddress))

public actual fun charPrevExA(codepage: UShort, lpstart: Pcstr, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharPrevExA(codepage.toShort(), lpstart.rawAddress, lpcurrentchar.rawAddress, dwflags.toInt()))

public actual fun charPrevW(lpszstart: Pcwstr, lpszcurrent: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharPrevW(lpszstart.rawAddress, lpszcurrent.rawAddress))

public actual fun charToOemA(psrc: Pcstr, pdst: Pstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharToOemA(psrc.rawAddress, pdst.rawAddress)

public actual fun charToOemBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharToOemBuffA(lpszsrc.rawAddress, lpszdst.rawAddress, cchdstlength.toInt())

public actual fun charToOemBuffW(lpszsrc: Pcwstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharToOemBuffW(lpszsrc.rawAddress, lpszdst.rawAddress, cchdstlength.toInt())

public actual fun charToOemW(psrc: Pcwstr, pdst: Pstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharToOemW(psrc.rawAddress, pdst.rawAddress)

public actual fun charUpperA(lpsz: Pstr): Pstr =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharUpperA(lpsz.rawAddress))

public actual fun charUpperBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharUpperBuffA(lpsz.rawAddress, cchlength.toInt()).toUInt()

public actual fun charUpperBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharUpperBuffW(lpsz.rawAddress, cchlength.toInt()).toUInt()

public actual fun charUpperW(lpsz: Pwstr): Pwstr =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCharUpperW(lpsz.rawAddress))

public actual fun checkMenuItem(hmenu: Hmenu, uidcheckitem: UInt, ucheck: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCheckMenuItem(hmenu.rawAddress, uidcheckitem.toInt(), ucheck.toInt()).toUInt()

public actual fun checkMenuRadioItem(hmenu: Hmenu, first: UInt, last: UInt, check: UInt, flags: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCheckMenuRadioItem(hmenu.rawAddress, first.toInt(), last.toInt(), check.toInt(), flags.toInt())

public actual fun childWindowFromPoint(hwndparent: Hwnd, point: Point): Hwnd =
    MutPtr(0L)

public actual fun childWindowFromPointEx(hwnd: Hwnd, pt: Point, flags: CwpFlags): Hwnd =
    MutPtr(0L)

public actual fun clipCursor(lprect: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingClipCursor(lprect.rawAddress)

public actual fun closeWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCloseWindow(hwnd.rawAddress)

public actual fun copyAcceleratorTableA(haccelsrc: Haccel, lpacceldst: MutPtr, caccelentries: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableA(haccelsrc.rawAddress, lpacceldst.rawAddress, caccelentries)

public actual fun copyAcceleratorTableW(haccelsrc: Haccel, lpacceldst: MutPtr, caccelentries: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableW(haccelsrc.rawAddress, lpacceldst.rawAddress, caccelentries)

public actual fun copyIcon(hicon: Hicon): Hicon =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCopyIcon(hicon.rawAddress))

public actual fun copyImage(h: Handle, type: GdiImageType, cx: Int, cy: Int, flags: ImageFlags): Handle =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCopyImage(h.rawAddress, type.toInt(), cx, cy, flags.toInt()))

public actual fun createAcceleratorTableA(paccel: ConstPtr, caccel: Int): Haccel =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableA(paccel.rawAddress, caccel))

public actual fun createAcceleratorTableW(paccel: ConstPtr, caccel: Int): Haccel =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableW(paccel.rawAddress, caccel))

public actual fun createCaret(hwnd: Hwnd, hbitmap: Hbitmap, nwidth: Int, nheight: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateCaret(hwnd.rawAddress, hbitmap.rawAddress, nwidth, nheight)

public actual fun createCursor(hinst: Hinstance, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: ConstPtr, pvxorplane: ConstPtr): Hcursor =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateCursor(hinst.rawAddress, xhotspot, yhotspot, nwidth, nheight, pvandplane.rawAddress, pvxorplane.rawAddress))

public actual fun createDialogIndirectParamA(hinstance: Hinstance, lptemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamA(hinstance.rawAddress, lptemplate.rawAddress, hwndparent.rawAddress, 0L, dwinitparam))

public actual fun createDialogIndirectParamW(hinstance: Hinstance, lptemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamW(hinstance.rawAddress, lptemplate.rawAddress, hwndparent.rawAddress, 0L, dwinitparam))

public actual fun createDialogParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateDialogParamA(hinstance.rawAddress, lptemplatename.rawAddress, hwndparent.rawAddress, 0L, dwinitparam))

public actual fun createDialogParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateDialogParamW(hinstance.rawAddress, lptemplatename.rawAddress, hwndparent.rawAddress, 0L, dwinitparam))

public actual fun createIcon(hinstance: Hinstance, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: ConstPtr, lpbxorbits: ConstPtr): Hicon =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateIcon(hinstance.rawAddress, nwidth, nheight, cplanes.toByte(), cbitspixel.toByte(), lpbandbits.rawAddress, lpbxorbits.rawAddress))

public actual fun createIconFromResource(presbits: ConstPtr, dwressize: UInt, ficon: Bool, dwver: UInt): Hicon =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateIconFromResource(presbits.rawAddress, dwressize.toInt(), ficon, dwver.toInt()))

public actual fun createIconFromResourceEx(presbits: ConstPtr, dwressize: UInt, ficon: Bool, dwver: UInt, cxdesired: Int, cydesired: Int, flags: ImageFlags): Hicon =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateIconFromResourceEx(presbits.rawAddress, dwressize.toInt(), ficon, dwver.toInt(), cxdesired, cydesired, flags.toInt()))

public actual fun createIconIndirect(piconinfo: ConstPtr): Hicon =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateIconIndirect(piconinfo.rawAddress))

public actual fun createMDIWindowA(lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowA(lpclassname.rawAddress, lpwindowname.rawAddress, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress, hinstance.rawAddress, lparam))

public actual fun createMDIWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowW(lpclassname.rawAddress, lpwindowname.rawAddress, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress, hinstance.rawAddress, lparam))

public actual fun createMenu(): Hmenu =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateMenu())

public actual fun createPopupMenu(): Hmenu =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreatePopupMenu())

public actual fun createResourceIndexer(projectroot: Pcwstr, extensiondllpath: Pcwstr, ppresourceindexer: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateResourceIndexer(projectroot.rawAddress, extensiondllpath.rawAddress, ppresourceindexer.rawAddress)

public actual fun createWindowExA(dwexstyle: WindowExStyle, lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: ConstPtr): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateWindowExA(dwexstyle.toInt(), lpclassname.rawAddress, lpwindowname.rawAddress, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress, hmenu.rawAddress, hinstance.rawAddress, lpparam.rawAddress))

public actual fun createWindowExW(dwexstyle: WindowExStyle, lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: ConstPtr): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingCreateWindowExW(dwexstyle.toInt(), lpclassname.rawAddress, lpwindowname.rawAddress, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress, hmenu.rawAddress, hinstance.rawAddress, lpparam.rawAddress))

public actual fun defDlgProcA(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDefDlgProcA(hdlg.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun defDlgProcW(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDefDlgProcW(hdlg.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun defFrameProcA(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDefFrameProcA(hwnd.rawAddress, hwndmdiclient.rawAddress, umsg.toInt(), wparam.toLong(), lparam)

public actual fun defFrameProcW(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDefFrameProcW(hwnd.rawAddress, hwndmdiclient.rawAddress, umsg.toInt(), wparam.toLong(), lparam)

public actual fun defMDIChildProcA(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcA(hwnd.rawAddress, umsg.toInt(), wparam.toLong(), lparam)

public actual fun defMDIChildProcW(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcW(hwnd.rawAddress, umsg.toInt(), wparam.toLong(), lparam)

public actual fun defWindowProcA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDefWindowProcA(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun defWindowProcW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDefWindowProcW(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun deferWindowPos(hwinposinfo: Hdwp, hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Hdwp =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDeferWindowPos(hwinposinfo.rawAddress, hwnd.rawAddress, hwndinsertafter.rawAddress, x, y, cx, cy, uflags.toInt()))

public actual fun deleteMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDeleteMenu(hmenu.rawAddress, uposition.toInt(), uflags.toInt())

public actual fun deregisterShellHookWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDeregisterShellHookWindow(hwnd.rawAddress)

public actual fun destroyAcceleratorTable(haccel: Haccel): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDestroyAcceleratorTable(haccel.rawAddress)

public actual fun destroyCaret(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDestroyCaret()

public actual fun destroyCursor(hcursor: Hcursor): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDestroyCursor(hcursor.rawAddress)

public actual fun destroyIcon(hicon: Hicon): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDestroyIcon(hicon.rawAddress)

public actual fun destroyIndexedResults(resourceuri: Pcwstr, qualifiercount: UInt, qualifiers: ConstPtr) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDestroyIndexedResults(resourceuri.rawAddress, qualifiercount.toInt(), qualifiers.rawAddress)
}

public actual fun destroyMenu(hmenu: Hmenu): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDestroyMenu(hmenu.rawAddress)

public actual fun destroyResourceIndexer(resourceindexer: ConstPtr) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDestroyResourceIndexer(resourceindexer.rawAddress)
}

public actual fun destroyWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDestroyWindow(hwnd.rawAddress)

public actual fun dialogBoxIndirectParamA(hinstance: Hinstance, hdialogtemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamA(hinstance.rawAddress, hdialogtemplate.rawAddress, hwndparent.rawAddress, 0L, dwinitparam)

public actual fun dialogBoxIndirectParamW(hinstance: Hinstance, hdialogtemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamW(hinstance.rawAddress, hdialogtemplate.rawAddress, hwndparent.rawAddress, 0L, dwinitparam)

public actual fun dialogBoxParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDialogBoxParamA(hinstance.rawAddress, lptemplatename.rawAddress, hwndparent.rawAddress, 0L, dwinitparam)

public actual fun dialogBoxParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDialogBoxParamW(hinstance.rawAddress, lptemplatename.rawAddress, hwndparent.rawAddress, 0L, dwinitparam)

public actual fun disableProcessWindowsGhosting() {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDisableProcessWindowsGhosting()
}

public actual fun dispatchMessageA(lpmsg: ConstPtr): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDispatchMessageA(lpmsg.rawAddress)

public actual fun dispatchMessageW(lpmsg: ConstPtr): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDispatchMessageW(lpmsg.rawAddress)

public actual fun dragObject(hwndparent: Hwnd, hwndfrom: Hwnd, fmt: UInt, data: ULong, hcur: Hcursor): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDragObject(hwndparent.rawAddress, hwndfrom.rawAddress, fmt.toInt(), data.toLong(), hcur.rawAddress).toUInt()

public actual fun drawIcon(hdc: Hdc, x: Int, y: Int, hicon: Hicon): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDrawIcon(hdc.rawAddress, x, y, hicon.rawAddress)

public actual fun drawIconEx(hdc: Hdc, xleft: Int, ytop: Int, hicon: Hicon, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: Hbrush, diflags: DiFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDrawIconEx(hdc.rawAddress, xleft, ytop, hicon.rawAddress, cxwidth, cywidth, istepifanicur.toInt(), hbrflickerfreedraw.rawAddress, diflags.toInt())

public actual fun drawMenuBar(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingDrawMenuBar(hwnd.rawAddress)

public actual fun enableMenuItem(hmenu: Hmenu, uidenableitem: UInt, uenable: MenuItemFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEnableMenuItem(hmenu.rawAddress, uidenableitem.toInt(), uenable.toInt())

public actual fun endDeferWindowPos(hwinposinfo: Hdwp): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEndDeferWindowPos(hwinposinfo.rawAddress)

public actual fun endDialog(hdlg: Hwnd, nresult: Long): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEndDialog(hdlg.rawAddress, nresult)

public actual fun endMenu(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEndMenu()

public actual fun enumChildWindows(hwndparent: Hwnd, lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEnumChildWindows(hwndparent.rawAddress, 0L, lparam)

public actual fun enumPropsA(hwnd: Hwnd, lpenumfunc: Propenumproca): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEnumPropsA(hwnd.rawAddress, 0L)

public actual fun enumPropsExA(hwnd: Hwnd, lpenumfunc: Propenumprocexa, lparam: Lparam): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEnumPropsExA(hwnd.rawAddress, 0L, lparam)

public actual fun enumPropsExW(hwnd: Hwnd, lpenumfunc: Propenumprocexw, lparam: Lparam): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEnumPropsExW(hwnd.rawAddress, 0L, lparam)

public actual fun enumPropsW(hwnd: Hwnd, lpenumfunc: Propenumprocw): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEnumPropsW(hwnd.rawAddress, 0L)

public actual fun enumThreadWindows(dwthreadid: UInt, lpfn: Wndenumproc, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEnumThreadWindows(dwthreadid.toInt(), 0L, lparam)

public actual fun enumWindows(lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingEnumWindows(0L, lparam)

public actual fun findWindowA(lpclassname: Pcstr, lpwindowname: Pcstr): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingFindWindowA(lpclassname.rawAddress, lpwindowname.rawAddress))

public actual fun findWindowExA(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcstr, lpszwindow: Pcstr): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingFindWindowExA(hwndparent.rawAddress, hwndchildafter.rawAddress, lpszclass.rawAddress, lpszwindow.rawAddress))

public actual fun findWindowExW(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcwstr, lpszwindow: Pcwstr): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingFindWindowExW(hwndparent.rawAddress, hwndchildafter.rawAddress, lpszclass.rawAddress, lpszwindow.rawAddress))

public actual fun findWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingFindWindowW(lpclassname.rawAddress, lpwindowname.rawAddress))

public actual fun flashWindow(hwnd: Hwnd, binvert: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingFlashWindow(hwnd.rawAddress, binvert)

public actual fun flashWindowEx(pfwi: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingFlashWindowEx(pfwi.rawAddress)

public actual fun getAltTabInfoA(hwnd: Hwnd, iitem: Int, pati: MutPtr, pszitemtext: Pstr, cchitemtext: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoA(hwnd.rawAddress, iitem, pati.rawAddress, pszitemtext.rawAddress, cchitemtext.toInt())

public actual fun getAltTabInfoW(hwnd: Hwnd, iitem: Int, pati: MutPtr, pszitemtext: Pwstr, cchitemtext: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoW(hwnd.rawAddress, iitem, pati.rawAddress, pszitemtext.rawAddress, cchitemtext.toInt())

public actual fun getAncestor(hwnd: Hwnd, gaflags: GetAncestorFlags): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetAncestor(hwnd.rawAddress, gaflags.toInt()))

public actual fun getCaretBlinkTime(): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetCaretBlinkTime().toUInt()

public actual fun getCaretPos(lppoint: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetCaretPos(lppoint.rawAddress)

public actual fun getClassInfoA(hinstance: Hinstance, lpclassname: Pcstr, lpwndclass: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoA(hinstance.rawAddress, lpclassname.rawAddress, lpwndclass.rawAddress)

public actual fun getClassInfoExA(hinstance: Hinstance, lpszclass: Pcstr, lpwcx: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoExA(hinstance.rawAddress, lpszclass.rawAddress, lpwcx.rawAddress)

public actual fun getClassInfoExW(hinstance: Hinstance, lpszclass: Pcwstr, lpwcx: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoExW(hinstance.rawAddress, lpszclass.rawAddress, lpwcx.rawAddress)

public actual fun getClassInfoW(hinstance: Hinstance, lpclassname: Pcwstr, lpwndclass: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoW(hinstance.rawAddress, lpclassname.rawAddress, lpwndclass.rawAddress)

public actual fun getClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassLongA(hwnd.rawAddress, nindex).toUInt()

public actual fun getClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrA(hwnd.rawAddress, nindex).toULong()

public actual fun getClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrW(hwnd.rawAddress, nindex).toULong()

public actual fun getClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassLongW(hwnd.rawAddress, nindex).toUInt()

public actual fun getClassNameA(hwnd: Hwnd, lpclassname: Pstr, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassNameA(hwnd.rawAddress, lpclassname.rawAddress, nmaxcount)

public actual fun getClassNameW(hwnd: Hwnd, lpclassname: Pwstr, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassNameW(hwnd.rawAddress, lpclassname.rawAddress, nmaxcount)

public actual fun getClassWord(hwnd: Hwnd, nindex: Int): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClassWord(hwnd.rawAddress, nindex).toUShort()

public actual fun getClientRect(hwnd: Hwnd, lprect: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClientRect(hwnd.rawAddress, lprect.rawAddress)

public actual fun getClipCursor(lprect: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetClipCursor(lprect.rawAddress)

public actual fun getCursor(): Hcursor =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetCursor())

public actual fun getCursorInfo(pci: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetCursorInfo(pci.rawAddress)

public actual fun getCursorPos(lppoint: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetCursorPos(lppoint.rawAddress)

public actual fun getDesktopWindow(): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetDesktopWindow())

public actual fun getDialogBaseUnits(): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetDialogBaseUnits()

public actual fun getDlgCtrlID(hwnd: Hwnd): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetDlgCtrlID(hwnd.rawAddress)

public actual fun getDlgItem(hdlg: Hwnd, niddlgitem: Int): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetDlgItem(hdlg.rawAddress, niddlgitem))

public actual fun getDlgItemInt(hdlg: Hwnd, niddlgitem: Int, lptranslated: MutPtr, bsigned: Bool): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetDlgItemInt(hdlg.rawAddress, niddlgitem, lptranslated.rawAddress, bsigned).toUInt()

public actual fun getDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pstr, cchmax: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextA(hdlg.rawAddress, niddlgitem, lpstring.rawAddress, cchmax).toUInt()

public actual fun getDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pwstr, cchmax: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextW(hdlg.rawAddress, niddlgitem, lpstring.rawAddress, cchmax).toUInt()

public actual fun getForegroundWindow(): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetForegroundWindow())

public actual fun getGUIThreadInfo(idthread: UInt, pgui: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetGUIThreadInfo(idthread.toInt(), pgui.rawAddress)

public actual fun getIconInfo(hicon: Hicon, piconinfo: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetIconInfo(hicon.rawAddress, piconinfo.rawAddress)

public actual fun getIconInfoExA(hicon: Hicon, piconinfo: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetIconInfoExA(hicon.rawAddress, piconinfo.rawAddress)

public actual fun getIconInfoExW(hicon: Hicon, piconinfo: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetIconInfoExW(hicon.rawAddress, piconinfo.rawAddress)

public actual fun getInputState(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetInputState()

public actual fun getLastActivePopup(hwnd: Hwnd): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetLastActivePopup(hwnd.rawAddress))

public actual fun getLayeredWindowAttributes(hwnd: Hwnd, pcrkey: MutPtr, pbalpha: MutPtr, pdwflags: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetLayeredWindowAttributes(hwnd.rawAddress, pcrkey.rawAddress, pbalpha.rawAddress, pdwflags.rawAddress)

public actual fun getMenu(hwnd: Hwnd): Hmenu =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenu(hwnd.rawAddress))

public actual fun getMenuBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, iditem: Int, pmbi: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuBarInfo(hwnd.rawAddress, idobject, iditem, pmbi.rawAddress)

public actual fun getMenuCheckMarkDimensions(): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuCheckMarkDimensions()

public actual fun getMenuDefaultItem(hmenu: Hmenu, fbypos: UInt, gmdiflags: GetMenuDefaultItemFlags): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuDefaultItem(hmenu.rawAddress, fbypos.toInt(), gmdiflags.toInt()).toUInt()

public actual fun getMenuInfo(param0: Hmenu, param1: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuInfo(param0.rawAddress, param1.rawAddress)

public actual fun getMenuItemCount(hmenu: Hmenu): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemCount(hmenu.rawAddress)

public actual fun getMenuItemID(hmenu: Hmenu, npos: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemID(hmenu.rawAddress, npos).toUInt()

public actual fun getMenuItemInfoA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoA(hmenu.rawAddress, item.toInt(), fbyposition, lpmii.rawAddress)

public actual fun getMenuItemInfoW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoW(hmenu.rawAddress, item.toInt(), fbyposition, lpmii.rawAddress)

public actual fun getMenuItemRect(hwnd: Hwnd, hmenu: Hmenu, uitem: UInt, lprcitem: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemRect(hwnd.rawAddress, hmenu.rawAddress, uitem.toInt(), lprcitem.rawAddress)

public actual fun getMenuState(hmenu: Hmenu, uid: UInt, uflags: MenuItemFlags): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuState(hmenu.rawAddress, uid.toInt(), uflags.toInt()).toUInt()

public actual fun getMenuStringA(hmenu: Hmenu, uiditem: UInt, lpstring: Pstr, cchmax: Int, flags: MenuItemFlags): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuStringA(hmenu.rawAddress, uiditem.toInt(), lpstring.rawAddress, cchmax, flags.toInt())

public actual fun getMenuStringW(hmenu: Hmenu, uiditem: UInt, lpstring: Pwstr, cchmax: Int, flags: MenuItemFlags): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMenuStringW(hmenu.rawAddress, uiditem.toInt(), lpstring.rawAddress, cchmax, flags.toInt())

public actual fun getMessageA(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMessageA(lpmsg.rawAddress, hwnd.rawAddress, wmsgfiltermin.toInt(), wmsgfiltermax.toInt())

public actual fun getMessageExtraInfo(): Lparam =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMessageExtraInfo()

public actual fun getMessagePos(): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMessagePos().toUInt()

public actual fun getMessageTime(): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMessageTime()

public actual fun getMessageW(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetMessageW(lpmsg.rawAddress, hwnd.rawAddress, wmsgfiltermin.toInt(), wmsgfiltermax.toInt())

public actual fun getNextDlgGroupItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetNextDlgGroupItem(hdlg.rawAddress, hctl.rawAddress, bprevious))

public actual fun getNextDlgTabItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetNextDlgTabItem(hdlg.rawAddress, hctl.rawAddress, bprevious))

public actual fun getParent(hwnd: Hwnd): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetParent(hwnd.rawAddress))

public actual fun getPhysicalCursorPos(lppoint: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetPhysicalCursorPos(lppoint.rawAddress)

public actual fun getProcessDefaultLayout(pdwdefaultlayout: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetProcessDefaultLayout(pdwdefaultlayout.rawAddress)

public actual fun getPropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetPropA(hwnd.rawAddress, lpstring.rawAddress))

public actual fun getPropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetPropW(hwnd.rawAddress, lpstring.rawAddress))

public actual fun getQueueStatus(flags: QueueStatusFlags): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetQueueStatus(flags.toInt()).toUInt()

public actual fun getScrollBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, psbi: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetScrollBarInfo(hwnd.rawAddress, idobject, psbi.rawAddress)

public actual fun getScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetScrollInfo(hwnd.rawAddress, nbar, lpsi.rawAddress)

public actual fun getScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetScrollPos(hwnd.rawAddress, nbar)

public actual fun getScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, lpminpos: MutPtr, lpmaxpos: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetScrollRange(hwnd.rawAddress, nbar, lpminpos.rawAddress, lpmaxpos.rawAddress)

public actual fun getShellWindow(): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetShellWindow())

public actual fun getSubMenu(hmenu: Hmenu, npos: Int): Hmenu =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetSubMenu(hmenu.rawAddress, npos))

public actual fun getSystemMenu(hwnd: Hwnd, brevert: Bool): Hmenu =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetSystemMenu(hwnd.rawAddress, brevert))

public actual fun getSystemMetrics(nindex: SystemMetricsIndex): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetSystemMetrics(nindex)

public actual fun getTitleBarInfo(hwnd: Hwnd, pti: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetTitleBarInfo(hwnd.rawAddress, pti.rawAddress)

public actual fun getTopWindow(hwnd: Hwnd): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetTopWindow(hwnd.rawAddress))

public actual fun getWindow(hwnd: Hwnd, ucmd: GetWindowCmd): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindow(hwnd.rawAddress, ucmd.toInt()))

public actual fun getWindowDisplayAffinity(hwnd: Hwnd, pdwaffinity: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowDisplayAffinity(hwnd.rawAddress, pdwaffinity.rawAddress)

public actual fun getWindowInfo(hwnd: Hwnd, pwi: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowInfo(hwnd.rawAddress, pwi.rawAddress)

public actual fun getWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongA(hwnd.rawAddress, nindex)

public actual fun getWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrA(hwnd.rawAddress, nindex)

public actual fun getWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrW(hwnd.rawAddress, nindex)

public actual fun getWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongW(hwnd.rawAddress, nindex)

public actual fun getWindowModuleFileNameA(hwnd: Hwnd, pszfilename: Pstr, cchfilenamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameA(hwnd.rawAddress, pszfilename.rawAddress, cchfilenamemax.toInt()).toUInt()

public actual fun getWindowModuleFileNameW(hwnd: Hwnd, pszfilename: Pwstr, cchfilenamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameW(hwnd.rawAddress, pszfilename.rawAddress, cchfilenamemax.toInt()).toUInt()

public actual fun getWindowPlacement(hwnd: Hwnd, lpwndpl: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowPlacement(hwnd.rawAddress, lpwndpl.rawAddress)

public actual fun getWindowRect(hwnd: Hwnd, lprect: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowRect(hwnd.rawAddress, lprect.rawAddress)

public actual fun getWindowTextA(hwnd: Hwnd, lpstring: Pstr, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextA(hwnd.rawAddress, lpstring.rawAddress, nmaxcount)

public actual fun getWindowTextLengthA(hwnd: Hwnd): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthA(hwnd.rawAddress)

public actual fun getWindowTextLengthW(hwnd: Hwnd): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthW(hwnd.rawAddress)

public actual fun getWindowTextW(hwnd: Hwnd, lpstring: Pwstr, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextW(hwnd.rawAddress, lpstring.rawAddress, nmaxcount)

public actual fun getWindowThreadProcessId(hwnd: Hwnd, lpdwprocessid: MutPtr): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowThreadProcessId(hwnd.rawAddress, lpdwprocessid.rawAddress).toUInt()

public actual fun getWindowWord(hwnd: Hwnd, nindex: Int): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingGetWindowWord(hwnd.rawAddress, nindex).toUShort()

public actual fun hideCaret(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingHideCaret(hwnd.rawAddress)

public actual fun hiliteMenuItem(hwnd: Hwnd, hmenu: Hmenu, uidhiliteitem: UInt, uhilite: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingHiliteMenuItem(hwnd.rawAddress, hmenu.rawAddress, uidhiliteitem.toInt(), uhilite.toInt())

public actual fun inSendMessage(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingInSendMessage()

public actual fun inSendMessageEx(lpreserved: ConstPtr): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingInSendMessageEx(lpreserved.rawAddress).toUInt()

public actual fun indexFilePath(resourceindexer: ConstPtr, filepath: Pcwstr, ppresourceuri: MutPtr, pqualifiercount: MutPtr, ppqualifiers: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIndexFilePath(resourceindexer.rawAddress, filepath.rawAddress, ppresourceuri.rawAddress, pqualifiercount.rawAddress, ppqualifiers.rawAddress)

public actual fun inheritWindowMonitor(hwnd: Hwnd, hwndinherit: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingInheritWindowMonitor(hwnd.rawAddress, hwndinherit.rawAddress)

public actual fun insertMenuA(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingInsertMenuA(hmenu.rawAddress, uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), lpnewitem.rawAddress)

public actual fun insertMenuItemA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingInsertMenuItemA(hmenu.rawAddress, item.toInt(), fbyposition, lpmi.rawAddress)

public actual fun insertMenuItemW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingInsertMenuItemW(hmenu.rawAddress, item.toInt(), fbyposition, lpmi.rawAddress)

public actual fun insertMenuW(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingInsertMenuW(hmenu.rawAddress, uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), lpnewitem.rawAddress)

public actual fun internalGetWindowText(hwnd: Hwnd, pstring: Pwstr, cchmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingInternalGetWindowText(hwnd.rawAddress, pstring.rawAddress, cchmaxcount)

public actual fun isCharAlphaA(ch: Byte): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaA(ch)

public actual fun isCharAlphaNumericA(ch: Byte): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericA(ch)

public actual fun isCharAlphaNumericW(ch: UShort): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericW(ch.toShort())

public actual fun isCharAlphaW(ch: UShort): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaW(ch.toShort())

public actual fun isCharLowerA(ch: Byte): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsCharLowerA(ch)

public actual fun isCharUpperA(ch: Byte): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsCharUpperA(ch)

public actual fun isCharUpperW(ch: UShort): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsCharUpperW(ch.toShort())

public actual fun isChild(hwndparent: Hwnd, hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsChild(hwndparent.rawAddress, hwnd.rawAddress)

public actual fun isDialogMessageA(hdlg: Hwnd, lpmsg: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsDialogMessageA(hdlg.rawAddress, lpmsg.rawAddress)

public actual fun isDialogMessageW(hdlg: Hwnd, lpmsg: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsDialogMessageW(hdlg.rawAddress, lpmsg.rawAddress)

public actual fun isGUIThread(bconvert: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsGUIThread(bconvert)

public actual fun isHungAppWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsHungAppWindow(hwnd.rawAddress)

public actual fun isIconic(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsIconic(hwnd.rawAddress)

public actual fun isMenu(hmenu: Hmenu): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsMenu(hmenu.rawAddress)

public actual fun isProcessDPIAware(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsProcessDPIAware()

public actual fun isWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsWindow(hwnd.rawAddress)

public actual fun isWindowArranged(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsWindowArranged(hwnd.rawAddress)

public actual fun isWindowUnicode(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsWindowUnicode(hwnd.rawAddress)

public actual fun isWindowVisible(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsWindowVisible(hwnd.rawAddress)

public actual fun isWow64Message(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsWow64Message()

public actual fun isZoomed(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingIsZoomed(hwnd.rawAddress)

public actual fun killTimer(hwnd: Hwnd, uidevent: ULong): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingKillTimer(hwnd.rawAddress, uidevent.toLong())

public actual fun loadAcceleratorsA(hinstance: Hinstance, lptablename: Pcstr): Haccel =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsA(hinstance.rawAddress, lptablename.rawAddress))

public actual fun loadAcceleratorsW(hinstance: Hinstance, lptablename: Pcwstr): Haccel =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsW(hinstance.rawAddress, lptablename.rawAddress))

public actual fun loadCursorA(hinstance: Hinstance, lpcursorname: Pcstr): Hcursor =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadCursorA(hinstance.rawAddress, lpcursorname.rawAddress))

public actual fun loadCursorFromFileA(lpfilename: Pcstr): Hcursor =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileA(lpfilename.rawAddress))

public actual fun loadCursorFromFileW(lpfilename: Pcwstr): Hcursor =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileW(lpfilename.rawAddress))

public actual fun loadCursorW(hinstance: Hinstance, lpcursorname: Pcwstr): Hcursor =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadCursorW(hinstance.rawAddress, lpcursorname.rawAddress))

public actual fun loadIconA(hinstance: Hinstance, lpiconname: Pcstr): Hicon =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadIconA(hinstance.rawAddress, lpiconname.rawAddress))

public actual fun loadIconW(hinstance: Hinstance, lpiconname: Pcwstr): Hicon =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadIconW(hinstance.rawAddress, lpiconname.rawAddress))

public actual fun loadImageA(hinst: Hinstance, name: Pcstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadImageA(hinst.rawAddress, name.rawAddress, type.toInt(), cx, cy, fuload.toInt()))

public actual fun loadImageW(hinst: Hinstance, name: Pcwstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadImageW(hinst.rawAddress, name.rawAddress, type.toInt(), cx, cy, fuload.toInt()))

public actual fun loadMenuA(hinstance: Hinstance, lpmenuname: Pcstr): Hmenu =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadMenuA(hinstance.rawAddress, lpmenuname.rawAddress))

public actual fun loadMenuIndirectA(lpmenutemplate: ConstPtr): Hmenu =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectA(lpmenutemplate.rawAddress))

public actual fun loadMenuIndirectW(lpmenutemplate: ConstPtr): Hmenu =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectW(lpmenutemplate.rawAddress))

public actual fun loadMenuW(hinstance: Hinstance, lpmenuname: Pcwstr): Hmenu =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadMenuW(hinstance.rawAddress, lpmenuname.rawAddress))

public actual fun loadStringA(hinstance: Hinstance, uid: UInt, lpbuffer: Pstr, cchbuffermax: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadStringA(hinstance.rawAddress, uid.toInt(), lpbuffer.rawAddress, cchbuffermax)

public actual fun loadStringW(hinstance: Hinstance, uid: UInt, lpbuffer: Pwstr, cchbuffermax: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLoadStringW(hinstance.rawAddress, uid.toInt(), lpbuffer.rawAddress, cchbuffermax)

public actual fun lockSetForegroundWindow(ulockcode: ForegroundWindowLockCode): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLockSetForegroundWindow(ulockcode.toInt())

public actual fun logicalToPhysicalPoint(hwnd: Hwnd, lppoint: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLogicalToPhysicalPoint(hwnd.rawAddress, lppoint.rawAddress)

public actual fun lookupIconIdFromDirectory(presbits: ConstPtr, ficon: Bool): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectory(presbits.rawAddress, ficon)

public actual fun lookupIconIdFromDirectoryEx(presbits: ConstPtr, ficon: Bool, cxdesired: Int, cydesired: Int, flags: ImageFlags): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectoryEx(presbits.rawAddress, ficon, cxdesired, cydesired, flags.toInt())

public actual fun mapDialogRect(hdlg: Hwnd, lprect: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMapDialogRect(hdlg.rawAddress, lprect.rawAddress)

public actual fun menuItemFromPoint(hwnd: Hwnd, hmenu: Hmenu, ptscreen: Point): Int =
    0

public actual fun messageBoxA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMessageBoxA(hwnd.rawAddress, lptext.rawAddress, lpcaption.rawAddress, utype.toInt())

public actual fun messageBoxExA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMessageBoxExA(hwnd.rawAddress, lptext.rawAddress, lpcaption.rawAddress, utype.toInt(), wlanguageid.toShort())

public actual fun messageBoxExW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMessageBoxExW(hwnd.rawAddress, lptext.rawAddress, lpcaption.rawAddress, utype.toInt(), wlanguageid.toShort())

public actual fun messageBoxIndirectA(lpmbp: ConstPtr): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectA(lpmbp.rawAddress)

public actual fun messageBoxIndirectW(lpmbp: ConstPtr): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectW(lpmbp.rawAddress)

public actual fun messageBoxW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMessageBoxW(hwnd.rawAddress, lptext.rawAddress, lpcaption.rawAddress, utype.toInt())

public actual fun modifyMenuA(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingModifyMenuA(hmnu.rawAddress, uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), lpnewitem.rawAddress)

public actual fun modifyMenuW(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingModifyMenuW(hmnu.rawAddress, uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), lpnewitem.rawAddress)

public actual fun moveWindow(hwnd: Hwnd, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMoveWindow(hwnd.rawAddress, x, y, nwidth, nheight, brepaint)

public actual fun mrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmlfile: Pcwstr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmCreateConfig(platformversion, defaultqualifiers.rawAddress, outputxmlfile.rawAddress)

public actual fun mrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmCreateConfigInMemory(platformversion, defaultqualifiers.rawAddress, outputxmldata.rawAddress, outputxmlsize.rawAddress)

public actual fun mrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: Pcwstr): Hresult =
    0

public actual fun mrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: MutPtr, outputprisize: MutPtr): Hresult =
    0

public actual fun mrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: Pcwstr): Hresult =
    0

public actual fun mrmCreateResourceIndexer(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, indexer: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexer(packagefamilyname.rawAddress, projectroot.rawAddress, platformversion, defaultqualifiers.rawAddress, indexer.rawAddress)

public actual fun mrmCreateResourceIndexerFromPreviousPriData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, pridata: ConstPtr, prisize: UInt, indexer: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriData(projectroot.rawAddress, platformversion, defaultqualifiers.rawAddress, pridata.rawAddress, prisize.toInt(), indexer.rawAddress)

public actual fun mrmCreateResourceIndexerFromPreviousPriFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, prifile: Pcwstr, indexer: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriFile(projectroot.rawAddress, platformversion, defaultqualifiers.rawAddress, prifile.rawAddress, indexer.rawAddress)

public actual fun mrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemaxmldata: ConstPtr, schemaxmlsize: UInt, indexer: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaData(projectroot.rawAddress, platformversion, defaultqualifiers.rawAddress, schemaxmldata.rawAddress, schemaxmlsize.toInt(), indexer.rawAddress)

public actual fun mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemafile: Pcwstr, indexer: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaFile(projectroot.rawAddress, platformversion, defaultqualifiers.rawAddress, schemafile.rawAddress, indexer.rawAddress)

public actual fun mrmCreateResourceIndexerWithFlags(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, flags: MrmIndexerFlags, indexer: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerWithFlags(packagefamilyname.rawAddress, projectroot.rawAddress, platformversion, defaultqualifiers.rawAddress, flags, indexer.rawAddress)

public actual fun mrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): Hresult =
    0

public actual fun mrmDumpPriDataInMemory(inputpridata: ConstPtr, inputprisize: UInt, schemapridata: ConstPtr, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriDataInMemory(inputpridata.rawAddress, inputprisize.toInt(), schemapridata.rawAddress, schemaprisize.toInt(), dumptype, outputxmldata.rawAddress, outputxmlsize.rawAddress)

public actual fun mrmDumpPriFile(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmlfile: Pcwstr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFile(indexfilename.rawAddress, schemaprifile.rawAddress, dumptype, outputxmlfile.rawAddress)

public actual fun mrmDumpPriFileInMemory(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFileInMemory(indexfilename.rawAddress, schemaprifile.rawAddress, dumptype, outputxmldata.rawAddress, outputxmlsize.rawAddress)

public actual fun mrmFreeMemory(data: ConstPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmFreeMemory(data.rawAddress)

public actual fun mrmGetPriFileContentChecksum(prifile: Pcwstr, checksum: MutPtr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMrmGetPriFileContentChecksum(prifile.rawAddress, checksum.rawAddress)

public actual fun mrmIndexEmbeddedData(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, embeddeddata: ConstPtr, embeddeddatasize: UInt, qualifiers: Pcwstr): Hresult =
    0

public actual fun mrmIndexFile(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, filepath: Pcwstr, qualifiers: Pcwstr): Hresult =
    0

public actual fun mrmIndexFileAutoQualifiers(indexer: MrmResourceIndexerHandle, filepath: Pcwstr): Hresult =
    0

public actual fun mrmIndexResourceContainerAutoQualifiers(indexer: MrmResourceIndexerHandle, containerpath: Pcwstr): Hresult =
    0

public actual fun mrmIndexString(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, resourcestring: Pcwstr, qualifiers: Pcwstr): Hresult =
    0

public actual fun mrmPeekResourceIndexerMessages(handle: MrmResourceIndexerHandle, messages: MutPtr, nummsgs: MutPtr): Hresult =
    0

public actual fun msgWaitForMultipleObjects(ncount: UInt, phandles: ConstPtr, fwaitall: Bool, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags): WaitEvent =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjects(ncount.toInt(), phandles.rawAddress, fwaitall, dwmilliseconds.toInt(), dwwakemask.toInt()).toUInt()

public actual fun msgWaitForMultipleObjectsEx(ncount: UInt, phandles: ConstPtr, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags, dwflags: MsgWaitForMultipleObjectsExFlags): WaitEvent =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjectsEx(ncount.toInt(), phandles.rawAddress, dwmilliseconds.toInt(), dwwakemask.toInt(), dwflags.toInt()).toUInt()

public actual fun oemToCharA(psrc: Pcstr, pdst: Pstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingOemToCharA(psrc.rawAddress, pdst.rawAddress)

public actual fun oemToCharBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingOemToCharBuffA(lpszsrc.rawAddress, lpszdst.rawAddress, cchdstlength.toInt())

public actual fun oemToCharBuffW(lpszsrc: Pcstr, lpszdst: Pwstr, cchdstlength: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingOemToCharBuffW(lpszsrc.rawAddress, lpszdst.rawAddress, cchdstlength.toInt())

public actual fun oemToCharW(psrc: Pcstr, pdst: Pwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingOemToCharW(psrc.rawAddress, pdst.rawAddress)

public actual fun openIcon(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingOpenIcon(hwnd.rawAddress)

public actual fun peekMessageA(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingPeekMessageA(lpmsg.rawAddress, hwnd.rawAddress, wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt())

public actual fun peekMessageW(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingPeekMessageW(lpmsg.rawAddress, hwnd.rawAddress, wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt())

public actual fun physicalToLogicalPoint(hwnd: Hwnd, lppoint: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingPhysicalToLogicalPoint(hwnd.rawAddress, lppoint.rawAddress)

public actual fun postMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingPostMessageA(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun postMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingPostMessageW(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun postQuitMessage(nexitcode: Int) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingPostQuitMessage(nexitcode)
}

public actual fun postThreadMessageA(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingPostThreadMessageA(idthread.toInt(), msg.toInt(), wparam.toLong(), lparam)

public actual fun postThreadMessageW(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingPostThreadMessageW(idthread.toInt(), msg.toInt(), wparam.toLong(), lparam)

public actual fun privateExtractIconsA(szfilename: Pcstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: MutPtr, piconid: MutPtr, nicons: UInt, flags: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsA(szfilename.rawAddress, niconindex, cxicon, cyicon, phicon.rawAddress, piconid.rawAddress, nicons.toInt(), flags.toInt()).toUInt()

public actual fun privateExtractIconsW(szfilename: Pcwstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: MutPtr, piconid: MutPtr, nicons: UInt, flags: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsW(szfilename.rawAddress, niconindex, cxicon, cyicon, phicon.rawAddress, piconid.rawAddress, nicons.toInt(), flags.toInt()).toUInt()

public actual fun realChildWindowFromPoint(hwndparent: Hwnd, ptparentclientcoords: Point): Hwnd =
    MutPtr(0L)

public actual fun realGetWindowClassA(hwnd: Hwnd, ptszclassname: Pstr, cchclassnamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassA(hwnd.rawAddress, ptszclassname.rawAddress, cchclassnamemax.toInt()).toUInt()

public actual fun realGetWindowClassW(hwnd: Hwnd, ptszclassname: Pwstr, cchclassnamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassW(hwnd.rawAddress, ptszclassname.rawAddress, cchclassnamemax.toInt()).toUInt()

public actual fun registerClassA(lpwndclass: ConstPtr): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRegisterClassA(lpwndclass.rawAddress).toUShort()

public actual fun registerClassExA(param0: ConstPtr): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRegisterClassExA(param0.rawAddress).toUShort()

public actual fun registerClassExW(param0: ConstPtr): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRegisterClassExW(param0.rawAddress).toUShort()

public actual fun registerClassW(lpwndclass: ConstPtr): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRegisterClassW(lpwndclass.rawAddress).toUShort()

public actual fun registerDeviceNotificationA(hrecipient: Handle, notificationfilter: ConstPtr, flags: RegisterNotificationFlags): Hdevnotify =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationA(hrecipient.rawAddress, notificationfilter.rawAddress, flags.toInt()))

public actual fun registerDeviceNotificationW(hrecipient: Handle, notificationfilter: ConstPtr, flags: RegisterNotificationFlags): Hdevnotify =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationW(hrecipient.rawAddress, notificationfilter.rawAddress, flags.toInt()))

public actual fun registerForTooltipDismissNotification(hwnd: Hwnd, tdflags: TooltipDismissFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRegisterForTooltipDismissNotification(hwnd.rawAddress, tdflags)

public actual fun registerShellHookWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRegisterShellHookWindow(hwnd.rawAddress)

public actual fun registerWindowMessageA(lpstring: Pcstr): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageA(lpstring.rawAddress).toUInt()

public actual fun registerWindowMessageW(lpstring: Pcwstr): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageW(lpstring.rawAddress).toUInt()

public actual fun removeMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRemoveMenu(hmenu.rawAddress, uposition.toInt(), uflags.toInt())

public actual fun removePropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRemovePropA(hwnd.rawAddress, lpstring.rawAddress))

public actual fun removePropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingRemovePropW(hwnd.rawAddress, lpstring.rawAddress))

public actual fun replyMessage(lresult: Lresult): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingReplyMessage(lresult)

public actual fun scrollDC(hdc: Hdc, dx: Int, dy: Int, lprcscroll: ConstPtr, lprcclip: ConstPtr, hrgnupdate: Hrgn, lprcupdate: MutPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingScrollDC(hdc.rawAddress, dx, dy, lprcscroll.rawAddress, lprcclip.rawAddress, hrgnupdate.rawAddress, lprcupdate.rawAddress)

public actual fun scrollWindow(hwnd: Hwnd, xamount: Int, yamount: Int, lprect: ConstPtr, lpcliprect: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingScrollWindow(hwnd.rawAddress, xamount, yamount, lprect.rawAddress, lpcliprect.rawAddress)

public actual fun scrollWindowEx(hwnd: Hwnd, dx: Int, dy: Int, prcscroll: ConstPtr, prcclip: ConstPtr, hrgnupdate: Hrgn, prcupdate: MutPtr, flags: ScrollWindowFlags): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingScrollWindowEx(hwnd.rawAddress, dx, dy, prcscroll.rawAddress, prcclip.rawAddress, hrgnupdate.rawAddress, prcupdate.rawAddress, flags.toInt())

public actual fun sendDlgItemMessageA(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageA(hdlg.rawAddress, niddlgitem, msg.toInt(), wparam.toLong(), lparam)

public actual fun sendDlgItemMessageW(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageW(hdlg.rawAddress, niddlgitem, msg.toInt(), wparam.toLong(), lparam)

public actual fun sendMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSendMessageA(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun sendMessageCallbackA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackA(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam, 0L, dwdata.toLong())

public actual fun sendMessageCallbackW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackW(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam, 0L, dwdata.toLong())

public actual fun sendMessageTimeoutA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: MutPtr): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutA(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam, fuflags.toInt(), utimeout.toInt(), lpdwresult.rawAddress)

public actual fun sendMessageTimeoutW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: MutPtr): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutW(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam, fuflags.toInt(), utimeout.toInt(), lpdwresult.rawAddress)

public actual fun sendMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSendMessageW(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun sendNotifyMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageA(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun sendNotifyMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageW(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam)

public actual fun setAdditionalForegroundBoostProcesses(toplevelwindow: Hwnd, processhandlecount: UInt, processhandlearray: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetAdditionalForegroundBoostProcesses(toplevelwindow.rawAddress, processhandlecount.toInt(), processhandlearray.rawAddress)

public actual fun setCaretBlinkTime(umseconds: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetCaretBlinkTime(umseconds.toInt())

public actual fun setCaretPos(x: Int, y: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetCaretPos(x, y)

public actual fun setClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetClassLongA(hwnd.rawAddress, nindex, dwnewlong).toUInt()

public actual fun setClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrA(hwnd.rawAddress, nindex, dwnewlong).toULong()

public actual fun setClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrW(hwnd.rawAddress, nindex, dwnewlong).toULong()

public actual fun setClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetClassLongW(hwnd.rawAddress, nindex, dwnewlong).toUInt()

public actual fun setClassWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetClassWord(hwnd.rawAddress, nindex, wnewword.toShort()).toUShort()

public actual fun setCoalescableTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc, utolerancedelay: UInt): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetCoalescableTimer(hwnd.rawAddress, nidevent.toLong(), uelapse.toInt(), 0L, utolerancedelay.toInt()).toULong()

public actual fun setCursor(hcursor: Hcursor): Hcursor =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetCursor(hcursor.rawAddress))

public actual fun setCursorPos(x: Int, y: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetCursorPos(x, y)

public actual fun setDebugErrorLevel(dwlevel: UInt) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetDebugErrorLevel(dwlevel.toInt())
}

public actual fun setDlgItemInt(hdlg: Hwnd, niddlgitem: Int, uvalue: UInt, bsigned: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetDlgItemInt(hdlg.rawAddress, niddlgitem, uvalue.toInt(), bsigned)

public actual fun setDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextA(hdlg.rawAddress, niddlgitem, lpstring.rawAddress)

public actual fun setDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextW(hdlg.rawAddress, niddlgitem, lpstring.rawAddress)

public actual fun setForegroundWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetForegroundWindow(hwnd.rawAddress)

public actual fun setLayeredWindowAttributes(hwnd: Hwnd, crkey: Colorref, balpha: UByte, dwflags: LayeredWindowAttributesFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetLayeredWindowAttributes(hwnd.rawAddress, crkey.toInt(), balpha.toByte(), dwflags.toInt())

public actual fun setMenu(hwnd: Hwnd, hmenu: Hmenu): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetMenu(hwnd.rawAddress, hmenu.rawAddress)

public actual fun setMenuDefaultItem(hmenu: Hmenu, uitem: UInt, fbypos: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetMenuDefaultItem(hmenu.rawAddress, uitem.toInt(), fbypos.toInt())

public actual fun setMenuInfo(param0: Hmenu, param1: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetMenuInfo(param0.rawAddress, param1.rawAddress)

public actual fun setMenuItemBitmaps(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, hbitmapunchecked: Hbitmap, hbitmapchecked: Hbitmap): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetMenuItemBitmaps(hmenu.rawAddress, uposition.toInt(), uflags.toInt(), hbitmapunchecked.rawAddress, hbitmapchecked.rawAddress)

public actual fun setMenuItemInfoA(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoA(hmenu.rawAddress, item.toInt(), fbypositon, lpmii.rawAddress)

public actual fun setMenuItemInfoW(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoW(hmenu.rawAddress, item.toInt(), fbypositon, lpmii.rawAddress)

public actual fun setMessageExtraInfo(lparam: Lparam): Lparam =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetMessageExtraInfo(lparam)

public actual fun setMessageQueue(cmessagesmax: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetMessageQueue(cmessagesmax)

public actual fun setParent(hwndchild: Hwnd, hwndnewparent: Hwnd): Hwnd =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetParent(hwndchild.rawAddress, hwndnewparent.rawAddress))

public actual fun setPhysicalCursorPos(x: Int, y: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetPhysicalCursorPos(x, y)

public actual fun setProcessDPIAware(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetProcessDPIAware()

public actual fun setProcessDefaultLayout(dwdefaultlayout: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetProcessDefaultLayout(dwdefaultlayout.toInt())

public actual fun setPropA(hwnd: Hwnd, lpstring: Pcstr, hdata: Handle): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetPropA(hwnd.rawAddress, lpstring.rawAddress, hdata.rawAddress)

public actual fun setPropW(hwnd: Hwnd, lpstring: Pcwstr, hdata: Handle): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetPropW(hwnd.rawAddress, lpstring.rawAddress, hdata.rawAddress)

public actual fun setSystemCursor(hcur: Hcursor, id: SystemCursorId): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetSystemCursor(hcur.rawAddress, id.toInt())

public actual fun setTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetTimer(hwnd.rawAddress, nidevent.toLong(), uelapse.toInt(), 0L).toULong()

public actual fun setWindowDisplayAffinity(hwnd: Hwnd, dwaffinity: WindowDisplayAffinity): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowDisplayAffinity(hwnd.rawAddress, dwaffinity.toInt())

public actual fun setWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongA(hwnd.rawAddress, nindex, dwnewlong)

public actual fun setWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrA(hwnd.rawAddress, nindex, dwnewlong)

public actual fun setWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrW(hwnd.rawAddress, nindex, dwnewlong)

public actual fun setWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongW(hwnd.rawAddress, nindex, dwnewlong)

public actual fun setWindowPlacement(hwnd: Hwnd, lpwndpl: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowPlacement(hwnd.rawAddress, lpwndpl.rawAddress)

public actual fun setWindowPos(hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowPos(hwnd.rawAddress, hwndinsertafter.rawAddress, x, y, cx, cy, uflags.toInt())

public actual fun setWindowTextA(hwnd: Hwnd, lpstring: Pcstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowTextA(hwnd.rawAddress, lpstring.rawAddress)

public actual fun setWindowTextW(hwnd: Hwnd, lpstring: Pcwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowTextW(hwnd.rawAddress, lpstring.rawAddress)

public actual fun setWindowWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowWord(hwnd.rawAddress, nindex, wnewword.toShort()).toUShort()

public actual fun setWindowsHookA(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookA(nfiltertype, 0L))

public actual fun setWindowsHookExA(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExA(idhook, 0L, hmod.rawAddress, dwthreadid.toInt()))

public actual fun setWindowsHookExW(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExW(idhook, 0L, hmod.rawAddress, dwthreadid.toInt()))

public actual fun setWindowsHookW(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    MutPtr(WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookW(nfiltertype, 0L))

public actual fun showCaret(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingShowCaret(hwnd.rawAddress)

public actual fun showCursor(bshow: Bool): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingShowCursor(bshow)

public actual fun showOwnedPopups(hwnd: Hwnd, fshow: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingShowOwnedPopups(hwnd.rawAddress, fshow)

public actual fun showWindow(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingShowWindow(hwnd.rawAddress, ncmdshow)

public actual fun showWindowAsync(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingShowWindowAsync(hwnd.rawAddress, ncmdshow)

public actual fun soundSentry(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSoundSentry()

public actual fun switchToThisWindow(hwnd: Hwnd, funknown: Bool) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSwitchToThisWindow(hwnd.rawAddress, funknown)
}

public actual fun systemParametersInfoA(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: MutPtr, fwinini: SystemParametersInfoUpdateFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoA(uiaction.toInt(), uiparam.toInt(), pvparam.rawAddress, fwinini.toInt())

public actual fun systemParametersInfoW(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: MutPtr, fwinini: SystemParametersInfoUpdateFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoW(uiaction.toInt(), uiparam.toInt(), pvparam.rawAddress, fwinini.toInt())

public actual fun tileWindows(hwndparent: Hwnd, whow: TileWindowsHow, lprect: ConstPtr, ckids: UInt, lpkids: ConstPtr): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingTileWindows(hwndparent.rawAddress, whow.toInt(), lprect.rawAddress, ckids.toInt(), lpkids.rawAddress).toUShort()

public actual fun trackPopupMenu(hmenu: Hmenu, uflags: TrackPopupMenuFlags, x: Int, y: Int, nreserved: Int, hwnd: Hwnd, prcrect: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingTrackPopupMenu(hmenu.rawAddress, uflags.toInt(), x, y, nreserved, hwnd.rawAddress, prcrect.rawAddress)

public actual fun trackPopupMenuEx(hmenu: Hmenu, uflags: UInt, x: Int, y: Int, hwnd: Hwnd, lptpm: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingTrackPopupMenuEx(hmenu.rawAddress, uflags.toInt(), x, y, hwnd.rawAddress, lptpm.rawAddress)

public actual fun translateAcceleratorA(hwnd: Hwnd, hacctable: Haccel, lpmsg: ConstPtr): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorA(hwnd.rawAddress, hacctable.rawAddress, lpmsg.rawAddress)

public actual fun translateAcceleratorW(hwnd: Hwnd, hacctable: Haccel, lpmsg: ConstPtr): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorW(hwnd.rawAddress, hacctable.rawAddress, lpmsg.rawAddress)

public actual fun translateMDISysAccel(hwndclient: Hwnd, lpmsg: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingTranslateMDISysAccel(hwndclient.rawAddress, lpmsg.rawAddress)

public actual fun translateMessage(lpmsg: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingTranslateMessage(lpmsg.rawAddress)

public actual fun unhookWindowsHook(ncode: Int, pfnfilterproc: Hookproc): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHook(ncode, 0L)

public actual fun unhookWindowsHookEx(hhk: Hhook): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHookEx(hhk.rawAddress)

public actual fun unregisterClassA(lpclassname: Pcstr, hinstance: Hinstance): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingUnregisterClassA(lpclassname.rawAddress, hinstance.rawAddress)

public actual fun unregisterClassW(lpclassname: Pcwstr, hinstance: Hinstance): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingUnregisterClassW(lpclassname.rawAddress, hinstance.rawAddress)

public actual fun unregisterDeviceNotification(handle: Hdevnotify): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingUnregisterDeviceNotification(handle.rawAddress)

public actual fun updateLayeredWindow(hwnd: Hwnd, hdcdst: Hdc, pptdst: ConstPtr, psize: ConstPtr, hdcsrc: Hdc, pptsrc: ConstPtr, crkey: Colorref, pblend: ConstPtr, dwflags: UpdateLayeredWindowFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindow(hwnd.rawAddress, hdcdst.rawAddress, pptdst.rawAddress, psize.rawAddress, hdcsrc.rawAddress, pptsrc.rawAddress, crkey.toInt(), pblend.rawAddress, dwflags.toInt())

public actual fun updateLayeredWindowIndirect(hwnd: Hwnd, pulwinfo: ConstPtr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindowIndirect(hwnd.rawAddress, pulwinfo.rawAddress)

public actual fun waitMessage(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingWaitMessage()

public actual fun windowFromPhysicalPoint(point: Point): Hwnd =
    MutPtr(0L)

public actual fun windowFromPoint(point: Point): Hwnd =
    MutPtr(0L)

public actual fun wsprintfA(param0: Pstr, param1: Pcstr, vararg variadicArgs: Long): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingWsprintfA(param0.rawAddress, param1.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wsprintfW(param0: Pwstr, param1: Pcwstr, vararg variadicArgs: Long): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingWsprintfW(param0.rawAddress, param1.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wvsprintfA(param0: Pstr, param1: Pcstr, arglist: ConstPtr): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingWvsprintfA(param0.rawAddress, param1.rawAddress, arglist.rawAddress)

public actual fun wvsprintfW(param0: Pwstr, param1: Pcwstr, arglist: ConstPtr): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssysWindowsWin32UiWindowsandmessagingWvsprintfW(param0.rawAddress, param1.rawAddress, arglist.rawAddress)
