@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Papcfunc
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.TokenAccessMask

private val windowsWin32SystemThreadingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun acquireSRWLockExclusive(srwlock: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAcquireSRWLockExclusive(srwlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun acquireSRWLockShared(srwlock: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAcquireSRWLockShared(srwlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: MutPtr, integritylabel: Psid): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAddIntegrityLabelToBoundaryDescriptor(boundarydescriptor.rawAddress.toString(), integritylabel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSIDToBoundaryDescriptor(boundarydescriptor: MutPtr, requiredsid: Psid): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAddSIDToBoundaryDescriptor(boundarydescriptor.rawAddress.toString(), requiredsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAttachThreadInput(idattach.toInt(), idattachto.toInt(), fattach) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvQuerySystemResponsiveness(avrthandle.rawAddress.toString(), systemresponsivenessvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvRevertMmThreadCharacteristics(avrthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtCreateThreadOrderingGroup(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroup(context.rawAddress.toString(), period.rawAddress.toString(), threadorderingguid.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtCreateThreadOrderingGroupExA(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr, taskname: Pcstr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExA(context.rawAddress.toString(), period.rawAddress.toString(), threadorderingguid.rawAddress.toString(), timeout.rawAddress.toString(), taskname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtCreateThreadOrderingGroupExW(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr, taskname: Pcwstr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExW(context.rawAddress.toString(), period.rawAddress.toString(), threadorderingguid.rawAddress.toString(), timeout.rawAddress.toString(), taskname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtDeleteThreadOrderingGroup(context: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvRtDeleteThreadOrderingGroup(context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtJoinThreadOrderingGroup(context: MutPtr, threadorderingguid: ConstPtr, before: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvRtJoinThreadOrderingGroup(context.rawAddress.toString(), threadorderingguid.rawAddress.toString(), before) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtLeaveThreadOrderingGroup(context: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvRtLeaveThreadOrderingGroup(context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvRtWaitOnThreadOrderingGroup(context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsA(firsttask.rawAddress.toString(), secondtask.rawAddress.toString(), taskindex.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsW(firsttask.rawAddress.toString(), secondtask.rawAddress.toString(), taskindex.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsA(taskname.rawAddress.toString(), taskindex.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsW(taskname.rawAddress.toString(), taskindex.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingAvSetMmThreadPriority(avrthandle.rawAddress.toString(), priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callbackMayRunLong(pci: PtpCallbackInstance): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCallbackMayRunLong(pci.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelThreadpoolIo(pio: PtpIo) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCancelThreadpoolIo(pio.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCancelTimerQueueTimer(timerqueue.rawAddress.toString(), timer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelWaitableTimer(htimer: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCancelWaitableTimer(htimer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingChangeTimerQueueTimer(timerqueue.rawAddress.toString(), timer.rawAddress.toString(), duetime.toInt(), period.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingClosePrivateNamespace(handle.rawAddress.toString(), flags.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeThreadpool(ptpp: PtpPool) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCloseThreadpool(ptpp.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup(ptpcg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroupMembers(ptpcg.toString(), fcancelpendingcallbacks, pvcleanupcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolIo(pio: PtpIo) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCloseThreadpoolIo(pio.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolTimer(pti: PtpTimer) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCloseThreadpoolTimer(pti.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolWait(pwa: PtpWait) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCloseThreadpoolWait(pwa.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeThreadpoolWork(pwk: PtpWork) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCloseThreadpoolWork(pwk.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun convertFiberToThread(): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingConvertFiberToThread() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertThreadToFiber(lpparameter: ConstPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingConvertThreadToFiber(lpparameter.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertThreadToFiberEx(lpparameter: ConstPtr, dwflags: UInt): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingConvertThreadToFiberEx(lpparameter.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorA(name.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorW(name.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventA(lpeventattributes: ConstPtr, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateEventA(lpeventattributes.rawAddress.toString(), bmanualreset, binitialstate, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventExA(lpeventattributes: ConstPtr, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateEventExA(lpeventattributes.rawAddress.toString(), lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventExW(lpeventattributes: ConstPtr, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateEventExW(lpeventattributes.rawAddress.toString(), lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEventW(lpeventattributes: ConstPtr, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateEventW(lpeventattributes.rawAddress.toString(), bmanualreset, binitialstate, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateFiber(dwstacksize.toString(), 0L.toString(), lpparameter.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateFiberEx(dwstackcommitsize.toString(), dwstackreservesize.toString(), dwflags.toInt(), 0L.toString(), lpparameter.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexA(lpmutexattributes: ConstPtr, binitialowner: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateMutexA(lpmutexattributes.rawAddress.toString(), binitialowner, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexExA(lpmutexattributes: ConstPtr, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateMutexExA(lpmutexattributes.rawAddress.toString(), lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexExW(lpmutexattributes: ConstPtr, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateMutexExW(lpmutexattributes.rawAddress.toString(), lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMutexW(lpmutexattributes: ConstPtr, binitialowner: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateMutexW(lpmutexattributes.rawAddress.toString(), binitialowner, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateNamespaceA(lpprivatenamespaceattributes: ConstPtr, lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceA(lpprivatenamespaceattributes.rawAddress.toString(), lpboundarydescriptor.rawAddress.toString(), lpaliasprefix.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateNamespaceW(lpprivatenamespaceattributes: ConstPtr, lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceW(lpprivatenamespaceattributes.rawAddress.toString(), lpboundarydescriptor.rawAddress.toString(), lpaliasprefix.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateProcessA(lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), lpprocessattributes.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateProcessAsUserA(htoken.rawAddress.toString(), lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), lpprocessattributes.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateProcessAsUserW(htoken.rawAddress.toString(), lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), lpprocessattributes.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateProcessW(lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), lpprocessattributes.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateProcessWithLogonW(lpusername.rawAddress.toString(), lpdomain.rawAddress.toString(), lppassword.rawAddress.toString(), dwlogonflags.toInt(), lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateProcessWithTokenW(htoken.rawAddress.toString(), dwlogonflags.toInt(), lpapplicationname.rawAddress.toString(), lpcommandline.rawAddress.toString(), dwcreationflags.toInt(), lpenvironment.rawAddress.toString(), lpcurrentdirectory.rawAddress.toString(), lpstartupinfo.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRemoteThread(hprocess: Handle, lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: UInt, lpthreadid: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateRemoteThread(hprocess.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), dwstacksize.toString(), 0L.toString(), lpparameter.rawAddress.toString(), dwcreationflags.toInt(), lpthreadid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateRemoteThreadEx(hprocess.rawAddress.toString(), lpthreadattributes.rawAddress.toString(), dwstacksize.toString(), 0L.toString(), lpparameter.rawAddress.toString(), dwcreationflags.toInt(), lpattributelist.rawAddress.toString(), lpthreadid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreA(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateSemaphoreA(lpsemaphoreattributes.rawAddress.toString(), linitialcount, lmaximumcount, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreExA(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateSemaphoreExA(lpsemaphoreattributes.rawAddress.toString(), linitialcount, lmaximumcount, lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreExW(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateSemaphoreExW(lpsemaphoreattributes.rawAddress.toString(), linitialcount, lmaximumcount, lpname.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSemaphoreW(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateSemaphoreW(lpsemaphoreattributes.rawAddress.toString(), linitialcount, lmaximumcount, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThread(lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: ThreadCreationFlags, lpthreadid: MutPtr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateThread(lpthreadattributes.rawAddress.toString(), dwstacksize.toString(), 0L.toString(), lpparameter.rawAddress.toString(), dwcreationflags.toInt(), lpthreadid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpool(reserved: ConstPtr): PtpPool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateThreadpool(reserved.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolCleanupGroup(): PtpCleanupGroup =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: MutPtr, pcbe: ConstPtr): PtpIo =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateThreadpoolIo(fl.rawAddress.toString(), 0L.toString(), pv.rawAddress.toString(), pcbe.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: MutPtr, pcbe: ConstPtr): PtpTimer =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateThreadpoolTimer(0L.toString(), pv.rawAddress.toString(), pcbe.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: MutPtr, pcbe: ConstPtr): PtpWait =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateThreadpoolWait(0L.toString(), pv.rawAddress.toString(), pcbe.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: MutPtr, pcbe: ConstPtr): PtpWork =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateThreadpoolWork(0L.toString(), pv.rawAddress.toString(), pcbe.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTimerQueue(): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateTimerQueue() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTimerQueueTimer(phnewtimer: MutPtr, timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateTimerQueueTimer(phnewtimer.rawAddress.toString(), timerqueue.rawAddress.toString(), 0L.toString(), parameter.rawAddress.toString(), duetime.toInt(), period.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUmsCompletionList(umscompletionlist: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateUmsCompletionList(umscompletionlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUmsThreadContext(lpumsthread: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateUmsThreadContext(lpumsthread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerA(lptimerattributes: ConstPtr, bmanualreset: Bool, lptimername: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateWaitableTimerA(lptimerattributes.rawAddress.toString(), bmanualreset, lptimername.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerExA(lptimerattributes: ConstPtr, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateWaitableTimerExA(lptimerattributes.rawAddress.toString(), lptimername.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerExW(lptimerattributes: ConstPtr, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateWaitableTimerExW(lptimerattributes.rawAddress.toString(), lptimername.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWaitableTimerW(lptimerattributes: ConstPtr, bmanualreset: Bool, lptimername: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingCreateWaitableTimerW(lptimerattributes.rawAddress.toString(), bmanualreset, lptimername.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteBoundaryDescriptor(boundarydescriptor: Handle) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDeleteBoundaryDescriptor(boundarydescriptor.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteCriticalSection(lpcriticalsection: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDeleteCriticalSection(lpcriticalsection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteFiber(lpfiber: ConstPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDeleteFiber(lpfiber.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDeleteProcThreadAttributeList(lpattributelist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deleteSynchronizationBarrier(lpbarrier: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDeleteSynchronizationBarrier(lpbarrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteTimerQueue(timerqueue: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDeleteTimerQueue(timerqueue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDeleteTimerQueueEx(timerqueue.rawAddress.toString(), completionevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDeleteTimerQueueTimer(timerqueue.rawAddress.toString(), timer.rawAddress.toString(), completionevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUmsCompletionList(umscompletionlist: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDeleteUmsCompletionList(umscompletionlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUmsThreadContext(umsthread: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDeleteUmsThreadContext(umsthread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dequeueUmsCompletionListItems(umscompletionlist: ConstPtr, waittimeout: UInt, umsthreadlist: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDequeueUmsCompletionListItems(umscompletionlist.rawAddress.toString(), waittimeout.toInt(), umsthreadlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback(pci.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enterCriticalSection(lpcriticalsection: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingEnterCriticalSection(lpcriticalsection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enterSynchronizationBarrier(lpbarrier: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingEnterSynchronizationBarrier(lpbarrier.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enterUmsSchedulingMode(schedulerstartupinfo: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingEnterUmsSchedulingMode(schedulerstartupinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun executeUmsThread(umsthread: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingExecuteUmsThread(umsthread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exitProcess(uexitcode: UInt): Nothing {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingExitProcess(uexitcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exitProcess")
}

public actual fun exitThread(dwexitcode: UInt): Nothing {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingExitThread(dwexitcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exitThread")
}

public actual fun flsAlloc(lpcallback: PflsCallbackFunction): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingFlsAlloc(0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsFree(dwflsindex: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingFlsFree(dwflsindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsGetValue(dwflsindex: UInt): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingFlsGetValue(dwflsindex.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsSetValue(dwflsindex: UInt, lpflsdata: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingFlsSetValue(dwflsindex.toInt(), lpflsdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushProcessWriteBuffers() {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingFreeLibraryWhenCallbackReturns(pci.toString(), mod.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getActiveProcessorCount(groupnumber: UShort): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetActiveProcessorCount(groupnumber.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveProcessorGroupCount(): UShort =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcess(): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetCurrentProcess() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessId(): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetCurrentProcessId() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessorNumber(): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessorNumberEx(procnumber: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumberEx(procnumber.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getCurrentThread(): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetCurrentThread() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadId(): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetCurrentThreadId() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadStackLimits(lowlimit: MutPtr, highlimit: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetCurrentThreadStackLimits(lowlimit.rawAddress.toString(), highlimit.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getCurrentUmsThread(): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetCurrentUmsThread() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExitCodeProcess(hprocess: Handle, lpexitcode: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetExitCodeProcess(hprocess.rawAddress.toString(), lpexitcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExitCodeThread(hthread: Handle, lpexitcode: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetExitCodeThread(hthread.rawAddress.toString(), lpexitcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetGuiResources(hprocess.rawAddress.toString(), uiflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetMachineTypeAttributes(machine.toInt(), machinetypeattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMaximumProcessorCount(groupnumber: UShort): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetMaximumProcessorCount(groupnumber.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMaximumProcessorGroupCount(): UShort =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextUmsListItem(umscontext: MutPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNextUmsListItem(umscontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaAvailableMemoryNode(node: UByte, availablebytes: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNode(node.toInt(), availablebytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNodeEx(node.toInt(), availablebytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaHighestNodeNumber(highestnodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaHighestNodeNumber(highestnodenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaNodeNumberFromHandle(hfile.rawAddress.toString(), nodenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeProcessorMask(node: UByte, processormask: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask(node.toInt(), processormask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: MutPtr, processormaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask2(nodenumber.toInt(), processormasks.rawAddress.toString(), processormaskcount.toInt(), requiredmaskcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaNodeProcessorMaskEx(node: UShort, processormask: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMaskEx(node.toInt(), processormask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProcessorNode(processor: UByte, nodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaProcessorNode(processor.toInt(), nodenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProcessorNodeEx(processor: ConstPtr, nodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaProcessorNodeEx(processor.rawAddress.toString(), nodenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProximityNode(proximityid: UInt, nodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaProximityNode(proximityid.toInt(), nodenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetNumaProximityNodeEx(proximityid.toInt(), nodenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPriorityClass(hprocess: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetPriorityClass(hprocess.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: MutPtr, lpsystemaffinitymask: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessAffinityMask(hprocess.rawAddress.toString(), lpprocessaffinitymask.rawAddress.toString(), lpsystemaffinitymask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDEPPolicy(hprocess: Handle, lpflags: MutPtr, lppermanent: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessDEPPolicy(hprocess.rawAddress.toString(), lpflags.rawAddress.toString(), lppermanent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: MutPtr, cpusetmaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSetMasks(process.rawAddress.toString(), cpusetmasks.rawAddress.toString(), cpusetmaskcount.toInt(), requiredmaskcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDefaultCpuSets(process: Handle, cpusetids: MutPtr, cpusetidcount: UInt, requiredidcount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSets(process.rawAddress.toString(), cpusetids.rawAddress.toString(), cpusetidcount.toInt(), requiredidcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessGroupAffinity(hprocess: Handle, groupcount: MutPtr, grouparray: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessGroupAffinity(hprocess.rawAddress.toString(), groupcount.rawAddress.toString(), grouparray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessHandleCount(hprocess.rawAddress.toString(), pdwhandlecount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessHandleFromHwnd(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessId(process: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessId(process.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessIdOfThread(thread: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessIdOfThread(thread.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: MutPtr, processinformationsize: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessInformation(hprocess.rawAddress.toString(), processinformationclass, processinformation.rawAddress.toString(), processinformationsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessIoCounters(hprocess: Handle, lpiocounters: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessIoCounters(hprocess.rawAddress.toString(), lpiocounters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: MutPtr, dwlength: ULong): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessMitigationPolicy(hprocess.rawAddress.toString(), mitigationpolicy, lpbuffer.rawAddress.toString(), dwlength.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessPriorityBoost(hprocess.rawAddress.toString(), pdisablepriorityboost.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessShutdownParameters(lpdwlevel: MutPtr, lpdwflags: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessShutdownParameters(lpdwlevel.rawAddress.toString(), lpdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessTimes(hprocess: Handle, lpcreationtime: MutPtr, lpexittime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessTimes(hprocess.rawAddress.toString(), lpcreationtime.rawAddress.toString(), lpexittime.rawAddress.toString(), lpkerneltime.rawAddress.toString(), lpusertime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessVersion(processid: UInt): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessVersion(processid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: MutPtr, lpmaximumworkingsetsize: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetProcessWorkingSetSize(hprocess.rawAddress.toString(), lpminimumworkingsetsize.rawAddress.toString(), lpmaximumworkingsetsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStartupInfoA(lpstartupinfo: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetStartupInfoA(lpstartupinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getStartupInfoW(lpstartupinfo: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetStartupInfoW(lpstartupinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimes(lpidletime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetSystemTimes(lpidletime.rawAddress.toString(), lpkerneltime.rawAddress.toString(), lpusertime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDescription(hthread: Handle, ppszthreaddescription: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadDescription(hthread.rawAddress.toString(), ppszthreaddescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadGroupAffinity(hthread: Handle, groupaffinity: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadGroupAffinity(hthread.rawAddress.toString(), groupaffinity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadIOPendingFlag(hthread: Handle, lpioispending: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadIOPendingFlag(hthread.rawAddress.toString(), lpioispending.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadId(thread: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadId(thread.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadIdealProcessorEx(hthread.rawAddress.toString(), lpidealprocessor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: MutPtr, threadinformationsize: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadInformation(hthread.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadPriority(hthread: Handle): Int =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadPriority(hthread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadPriorityBoost(hthread.rawAddress.toString(), pdisablepriorityboost.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: MutPtr, cpusetmaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSetMasks(thread.rawAddress.toString(), cpusetmasks.rawAddress.toString(), cpusetmaskcount.toInt(), requiredmaskcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadSelectedCpuSets(thread: Handle, cpusetids: MutPtr, cpusetidcount: UInt, requiredidcount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSets(thread.rawAddress.toString(), cpusetids.rawAddress.toString(), cpusetidcount.toInt(), requiredidcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadTimes(hthread: Handle, lpcreationtime: MutPtr, lpexittime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetThreadTimes(hthread.rawAddress.toString(), lpcreationtime.rawAddress.toString(), lpexittime.rawAddress.toString(), lpkerneltime.rawAddress.toString(), lpusertime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUmsCompletionListEvent(umscompletionlist: ConstPtr, umscompletionevent: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetUmsCompletionListEvent(umscompletionlist.rawAddress.toString(), umscompletionevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingGetUmsSystemThreadInformation(threadhandle.rawAddress.toString(), systemthreadinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceBeginInitialize(lpinitonce: MutPtr, dwflags: UInt, fpending: MutPtr, lpcontext: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitOnceBeginInitialize(lpinitonce.rawAddress.toString(), dwflags.toInt(), fpending.rawAddress.toString(), lpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceComplete(lpinitonce: MutPtr, dwflags: UInt, lpcontext: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitOnceComplete(lpinitonce.rawAddress.toString(), dwflags.toInt(), lpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceExecuteOnce(initonce: MutPtr, initfn: PinitOnceFn, parameter: MutPtr, context: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitOnceExecuteOnce(initonce.rawAddress.toString(), 0L.toString(), parameter.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initOnceInitialize(initonce: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitOnceInitialize(initonce.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeConditionVariable(conditionvariable: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitializeConditionVariable(conditionvariable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeCriticalSection(lpcriticalsection: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitializeCriticalSection(lpcriticalsection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeCriticalSectionAndSpinCount(lpcriticalsection: MutPtr, dwspincount: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitializeCriticalSectionAndSpinCount(lpcriticalsection.rawAddress.toString(), dwspincount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeCriticalSectionEx(lpcriticalsection: MutPtr, dwspincount: UInt, flags: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitializeCriticalSectionEx(lpcriticalsection.rawAddress.toString(), dwspincount.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitializeProcThreadAttributeList(lpattributelist.rawAddress.toString(), dwattributecount.toInt(), dwflags.toInt(), lpsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSListHead(listhead: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitializeSListHead(listhead.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeSRWLock(srwlock: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitializeSRWLock(srwlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeSynchronizationBarrier(lpbarrier: MutPtr, ltotalthreads: Int, lspincount: Int): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInitializeSynchronizationBarrier(lpbarrier.rawAddress.toString(), ltotalthreads, lspincount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedFlushSList(listhead: MutPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInterlockedFlushSList(listhead.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedPopEntrySList(listhead: MutPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInterlockedPopEntrySList(listhead.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedPushEntrySList(listhead: MutPtr, listentry: MutPtr): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInterlockedPushEntrySList(listhead.rawAddress.toString(), listentry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interlockedPushListSListEx(listhead: MutPtr, list: MutPtr, listend: MutPtr, count: UInt): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingInterlockedPushListSListEx(listhead.rawAddress.toString(), list.rawAddress.toString(), listend.rawAddress.toString(), count.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isImmersiveProcess(hprocess: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingIsImmersiveProcess(hprocess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessCritical(hprocess: Handle, critical: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingIsProcessCritical(hprocess.rawAddress.toString(), critical.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent(processorfeature.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThreadAFiber(): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingIsThreadAFiber() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThreadpoolTimerSet(pti: PtpTimer): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet(pti.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64Process(hprocess: Handle, wow64process: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingIsWow64Process(hprocess.rawAddress.toString(), wow64process.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64Process2(hprocess: Handle, pprocessmachine: MutPtr, pnativemachine: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingIsWow64Process2(hprocess.rawAddress.toString(), pprocessmachine.rawAddress.toString(), pnativemachine.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun leaveCriticalSection(lpcriticalsection: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingLeaveCriticalSection(lpcriticalsection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingLeaveCriticalSectionWhenCallbackReturns(pci.toString(), pcs.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenEventA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenEventW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenMutexW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrivateNamespaceA(lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceA(lpboundarydescriptor.rawAddress.toString(), lpaliasprefix.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrivateNamespaceW(lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceW(lpboundarydescriptor.rawAddress.toString(), lpaliasprefix.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenProcess(dwdesiredaccess.toInt(), binherithandle, dwprocessid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenProcessToken(processhandle.rawAddress.toString(), desiredaccess.toInt(), tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenSemaphoreW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenThread(dwdesiredaccess.toInt(), binherithandle, dwthreadid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenThreadToken(threadhandle.rawAddress.toString(), desiredaccess.toInt(), openasself, tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenWaitableTimerA(dwdesiredaccess.toInt(), binherithandle, lptimername.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingOpenWaitableTimerW(dwdesiredaccess.toInt(), binherithandle, lptimername.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pulseEvent(hevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingPulseEvent(hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDepthSList(listhead: ConstPtr): UShort =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingQueryDepthSList(listhead.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameA(hprocess.rawAddress.toString(), dwflags.toInt(), lpexename.rawAddress.toString(), lpdwsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameW(hprocess.rawAddress.toString(), dwflags.toInt(), lpexename.rawAddress.toString(), lpdwsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingQueryProcessAffinityUpdateMode(hprocess.rawAddress.toString(), lpdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryProtectedPolicy(policyguid: ConstPtr, policyvalue: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingQueryProtectedPolicy(policyguid.rawAddress.toString(), policyvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingQueryThreadpoolStackInformation(ptpp.toString(), ptpsi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUmsThreadInformation(umsthread: ConstPtr, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: MutPtr, umsthreadinformationlength: UInt, returnlength: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingQueryUmsThreadInformation(umsthread.rawAddress.toString(), umsthreadinfoclass, umsthreadinformation.rawAddress.toString(), umsthreadinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queueUserWorkItem(function: LpthreadStartRoutine, context: ConstPtr, flags: WorkerThreadFlags): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingQueueUserWorkItem(0L.toString(), context.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWaitForSingleObject(phnewwaitobject: MutPtr, hobject: Handle, callback: Waitortimercallback, context: ConstPtr, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRegisterWaitForSingleObject(phnewwaitobject.rawAddress.toString(), hobject.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), dwmilliseconds.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseMutex(hmutex: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingReleaseMutex(hmutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingReleaseMutexWhenCallbackReturns(pci.toString(), mut.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun releaseSRWLockExclusive(srwlock: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingReleaseSRWLockExclusive(srwlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun releaseSRWLockShared(srwlock: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingReleaseSRWLockShared(srwlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingReleaseSemaphore(hsemaphore.rawAddress.toString(), lreleasecount, lppreviouscount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingReleaseSemaphoreWhenCallbackReturns(pci.toString(), sem.rawAddress.toString(), crel.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun resetEvent(hevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingResetEvent(hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeThread(hthread: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingResumeThread(hthread.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: MutPtr, key: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqAddPeriodicCallback(0L.toString(), context.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqAllocateSerialWorkQueue(workqueueidin.toInt(), workqueueidout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqAllocateWorkQueue(workqueuetype, workqueueid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: MutPtr, donestate: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqBeginRegisterWorkQueueWithMMCSS(workqueueid.toInt(), usageclass.rawAddress.toString(), dwtaskid.toInt(), lpriority, donecallback.rawAddress.toString(), donestate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: MutPtr, donestate: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid.toInt(), donecallback.rawAddress.toString(), donestate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqCancelDeadline(prequest: Handle): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqCancelDeadline(prequest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqCancelWorkItem(key: ULong): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqCancelWorkItem(key.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqCreateAsyncResult(appobject: MutPtr, callback: MutPtr, appstate: MutPtr, asyncresult: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqCreateAsyncResult(appobject.rawAddress.toString(), callback.rawAddress.toString(), appstate.rawAddress.toString(), asyncresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqEndRegisterWorkQueueWithMMCSS(result: MutPtr, taskid: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqEndRegisterWorkQueueWithMMCSS(result.rawAddress.toString(), taskid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSClass(workqueueid.toInt(), usageclass.rawAddress.toString(), usageclasslength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSPriority(workqueueid.toInt(), priority.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSTaskId(workqueueid.toInt(), taskid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqInvokeCallback(result: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqInvokeCallback(result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqJoinWorkQueue(workqueueid.toInt(), hfile.rawAddress.toString(), out.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqLockPlatform(): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqLockPlatform() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: MutPtr, id: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqLockSharedWorkQueue(usageclass.rawAddress.toString(), basepriority, taskid.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqLockWorkQueue(workqueueid: UInt): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqLockWorkQueue(workqueueid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: MutPtr, key: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqPutWaitingWorkItem(hevent.rawAddress.toString(), lpriority, result.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqPutWorkItem(dwqueue.toInt(), lpriority, result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqRegisterPlatformEvents(platformevents: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformEvents(platformevents.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: MutPtr, lpriority: Int): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformWithMMCSS(usageclass.rawAddress.toString(), taskid.rawAddress.toString(), lpriority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback(dwkey.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqScheduleWorkItem(result: MutPtr, timeout: Long, key: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqScheduleWorkItem(result.rawAddress.toString(), timeout.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqSetDeadline(workqueueid.toInt(), deadlineinhns.toString(), prequest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqSetDeadline2(workqueueid.toInt(), deadlineinhns.toString(), predeadlineinhns.toString(), prequest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqSetLongRunning(workqueueid.toInt(), enable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqShutdown(): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqShutdown() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqStartup(): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqStartup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqUnjoinWorkQueue(workqueueid.toInt(), hfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnlockPlatform(): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqUnlockPlatform() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue(workqueueid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnregisterPlatformEvents(platformevents: MutPtr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformEvents(platformevents.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtwqUnregisterPlatformFromMMCSS(): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCriticalSectionSpinCount(lpcriticalsection: MutPtr, dwspincount: UInt): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetCriticalSectionSpinCount(lpcriticalsection.rawAddress.toString(), dwspincount.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEvent(hevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetEvent(hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetEventWhenCallbackReturns(pci.toString(), evt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetPriorityClass(hprocess.rawAddress.toString(), dwpriorityclass.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessAffinityMask(hprocess.rawAddress.toString(), dwprocessaffinitymask.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessAffinityUpdateMode(hprocess.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessDEPPolicy(dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: ConstPtr, cpusetmaskcount: UShort): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSetMasks(process.rawAddress.toString(), cpusetmasks.rawAddress.toString(), cpusetmaskcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDefaultCpuSets(process: Handle, cpusetids: ConstPtr, cpusetidcount: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSets(process.rawAddress.toString(), cpusetids.rawAddress.toString(), cpusetidcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessDynamicEHContinuationTargets(process.rawAddress.toString(), numberoftargets.toInt(), targets.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessDynamicEnforcedCetCompatibleRanges(process.rawAddress.toString(), numberofranges.toInt(), ranges.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: ConstPtr, processinformationsize: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessInformation(hprocess.rawAddress.toString(), processinformationclass, processinformation.rawAddress.toString(), processinformationsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: ConstPtr, dwlength: ULong): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessMitigationPolicy(mitigationpolicy, lpbuffer.rawAddress.toString(), dwlength.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessPriorityBoost(hprocess.rawAddress.toString(), bdisablepriorityboost) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessRestrictionExemption(fenableexemption: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption(fenableexemption) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessShutdownParameters(dwlevel.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProcessWorkingSetSize(hprocess.rawAddress.toString(), dwminimumworkingsetsize.toString(), dwmaximumworkingsetsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProtectedPolicy(policyguid: ConstPtr, policyvalue: ULong, oldpolicyvalue: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetProtectedPolicy(policyguid.rawAddress.toString(), policyvalue.toString(), oldpolicyvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadAffinityMask(hthread.rawAddress.toString(), dwthreadaffinitymask.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadDescription(hthread.rawAddress.toString(), lpthreaddescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadGroupAffinity(hthread: Handle, groupaffinity: ConstPtr, previousgroupaffinity: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadGroupAffinity(hthread.rawAddress.toString(), groupaffinity.rawAddress.toString(), previousgroupaffinity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadIdealProcessor(hthread.rawAddress.toString(), dwidealprocessor.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: ConstPtr, lppreviousidealprocessor: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadIdealProcessorEx(hthread.rawAddress.toString(), lpidealprocessor.rawAddress.toString(), lppreviousidealprocessor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: ConstPtr, threadinformationsize: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadInformation(hthread.rawAddress.toString(), threadinformationclass, threadinformation.rawAddress.toString(), threadinformationsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadPriority(hthread.rawAddress.toString(), npriority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadPriorityBoost(hthread.rawAddress.toString(), bdisablepriorityboost) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: ConstPtr, cpusetmaskcount: UShort): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSetMasks(thread.rawAddress.toString(), cpusetmasks.rawAddress.toString(), cpusetmaskcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadSelectedCpuSets(thread: Handle, cpusetids: ConstPtr, cpusetidcount: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSets(thread.rawAddress.toString(), cpusetids.rawAddress.toString(), cpusetidcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadStackGuarantee(stacksizeinbytes: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadStackGuarantee(stacksizeinbytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadToken(thread: ConstPtr, token: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadToken(thread.rawAddress.toString(), token.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadpoolStackInformation(ptpp.toString(), ptpsi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum(ptpp.toString(), cthrdmost.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum(ptpp.toString(), cthrdmic.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolTimer(pti: PtpTimer, pftduetime: ConstPtr, msperiod: UInt, mswindowlength: UInt) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadpoolTimer(pti.toString(), pftduetime.rawAddress.toString(), msperiod.toInt(), mswindowlength.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: ConstPtr, msperiod: UInt, mswindowlength: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadpoolTimerEx(pti.toString(), pftduetime.rawAddress.toString(), msperiod.toInt(), mswindowlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadpoolWait(pwa.toString(), h.rawAddress.toString(), pfttimeout.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr, reserved: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetThreadpoolWaitEx(pwa.toString(), h.rawAddress.toString(), pfttimeout.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr, duetime: UInt, period: UInt, preferio: Bool): Handle =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetTimerQueueTimer(timerqueue.rawAddress.toString(), 0L.toString(), parameter.rawAddress.toString(), duetime.toInt(), period.toInt(), preferio) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUmsThreadInformation(umsthread: ConstPtr, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: ConstPtr, umsthreadinformationlength: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetUmsThreadInformation(umsthread.rawAddress.toString(), umsthreadinfoclass, umsthreadinformation.rawAddress.toString(), umsthreadinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWaitableTimer(htimer: Handle, lpduetime: ConstPtr, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr, fresume: Bool): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetWaitableTimer(htimer.rawAddress.toString(), lpduetime.rawAddress.toString(), lperiod, 0L.toString(), lpargtocompletionroutine.rawAddress.toString(), fresume) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWaitableTimerEx(htimer: Handle, lpduetime: ConstPtr, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr, wakecontext: ConstPtr, tolerabledelay: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSetWaitableTimerEx(htimer.rawAddress.toString(), lpduetime.rawAddress.toString(), lperiod, 0L.toString(), lpargtocompletionroutine.rawAddress.toString(), wakecontext.rawAddress.toString(), tolerabledelay.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSignalObjectAndWait(hobjecttosignal.rawAddress.toString(), hobjecttowaiton.rawAddress.toString(), dwmilliseconds.toInt(), balertable) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(dwmilliseconds: UInt) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSleep(dwmilliseconds.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sleepConditionVariableCS(conditionvariable: MutPtr, criticalsection: MutPtr, dwmilliseconds: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSleepConditionVariableCS(conditionvariable.rawAddress.toString(), criticalsection.rawAddress.toString(), dwmilliseconds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleepConditionVariableSRW(conditionvariable: MutPtr, srwlock: MutPtr, dwmilliseconds: UInt, flags: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSleepConditionVariableSRW(conditionvariable.rawAddress.toString(), srwlock.rawAddress.toString(), dwmilliseconds.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSleepEx(dwmilliseconds.toInt(), balertable) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startThreadpoolIo(pio: PtpIo) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingStartThreadpoolIo(pio.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun submitThreadpoolWork(pwk: PtpWork) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSubmitThreadpoolWork(pwk.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun suspendThread(hthread: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSuspendThread(hthread.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchToFiber(lpfiber: ConstPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSwitchToFiber(lpfiber.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun switchToThread(): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingSwitchToThread() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingTerminateProcess(hprocess.rawAddress.toString(), uexitcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingTerminateThread(hthread.rawAddress.toString(), dwexitcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsAlloc(): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingTlsAlloc() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsFree(dwtlsindex: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingTlsFree(dwtlsindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsGetValue(dwtlsindex: UInt): MutPtr =
    if (windowsWin32SystemThreadingNapiAddon != null) MutPtr((windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingTlsGetValue(dwtlsindex.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingTlsSetValue(dwtlsindex.toInt(), lptlsvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryAcquireSRWLockExclusive(srwlock: MutPtr): Boolean =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingTryAcquireSRWLockExclusive(srwlock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryAcquireSRWLockShared(srwlock: MutPtr): Boolean =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingTryAcquireSRWLockShared(srwlock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryEnterCriticalSection(lpcriticalsection: MutPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingTryEnterCriticalSection(lpcriticalsection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: MutPtr, pcbe: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingTrySubmitThreadpoolCallback(0L.toString(), pv.rawAddress.toString(), pcbe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsThreadYield(schedulerparam: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingUmsThreadYield(schedulerparam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterWait(waithandle: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingUnregisterWait(waithandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingUnregisterWaitEx(waithandle.rawAddress.toString(), completionevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: ConstPtr, cbsize: ULong, lppreviousvalue: MutPtr, lpreturnsize: ConstPtr): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingUpdateProcThreadAttribute(lpattributelist.rawAddress.toString(), dwflags.toInt(), attribute.toString(), lpvalue.rawAddress.toString(), cbsize.toString(), lppreviousvalue.rawAddress.toString(), lpreturnsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWaitForInputIdle(hprocess.rawAddress.toString(), dwmilliseconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForMultipleObjects(ncount: UInt, lphandles: ConstPtr, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWaitForMultipleObjects(ncount.toInt(), lphandles.rawAddress.toString(), bwaitall, dwmilliseconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForMultipleObjectsEx(ncount: UInt, lphandles: ConstPtr, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWaitForMultipleObjectsEx(ncount.toInt(), lphandles.rawAddress.toString(), bwaitall, dwmilliseconds.toInt(), balertable) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWaitForSingleObject(hhandle.rawAddress.toString(), dwmilliseconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWaitForSingleObjectEx(hhandle.rawAddress.toString(), dwmilliseconds.toInt(), balertable) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks(pio.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks(pti.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks(pwa.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks(pwk.toString(), fcancelpendingcallbacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitOnAddress(address: ConstPtr, compareaddress: ConstPtr, addresssize: ULong, dwmilliseconds: UInt): Bool =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWaitOnAddress(address.rawAddress.toString(), compareaddress.rawAddress.toString(), addresssize.toString(), dwmilliseconds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wakeAllConditionVariable(conditionvariable: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWakeAllConditionVariable(conditionvariable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wakeByAddressAll(address: ConstPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWakeByAddressAll(address.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wakeByAddressSingle(address: ConstPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWakeByAddressSingle(address.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wakeConditionVariable(conditionvariable: MutPtr) {
    if (windowsWin32SystemThreadingNapiAddon != null) {
        windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWakeConditionVariable(conditionvariable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWinExec(lpcmdline.rawAddress.toString(), ucmdshow.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine(machine.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64SuspendThread(hthread: Handle): UInt =
    if (windowsWin32SystemThreadingNapiAddon != null) (windowsWin32SystemThreadingNapiAddon.windowssysWindowsWin32SystemThreadingWow64SuspendThread(hthread.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
