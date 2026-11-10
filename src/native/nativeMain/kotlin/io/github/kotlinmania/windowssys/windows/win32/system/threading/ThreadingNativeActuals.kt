@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.COpaquePointer
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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun acquireSRWLockExclusive(srwlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_acquireSRWLockExclusive(srwlock?.value?.toCPointer<ByteVar>())
}

public actual fun acquireSRWLockShared(srwlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_acquireSRWLockShared(srwlock?.value?.toCPointer<ByteVar>())
}

public actual fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: COpaquePointer?, integritylabel: Psid): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_addIntegrityLabelToBoundaryDescriptor(boundarydescriptor?.value?.toCPointer<ByteVar>(), integritylabel?.value?.toCPointer<ByteVar>())

public actual fun addSIDToBoundaryDescriptor(boundarydescriptor: COpaquePointer?, requiredsid: Psid): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_addSIDToBoundaryDescriptor(boundarydescriptor?.value?.toCPointer<ByteVar>(), requiredsid?.value?.toCPointer<ByteVar>())

public actual fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_attachThreadInput(idattach, idattachto, fattach)

public actual fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avQuerySystemResponsiveness(avrthandle?.value?.toCPointer<ByteVar>(), systemresponsivenessvalue?.value?.toCPointer<ByteVar>())

public actual fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avRevertMmThreadCharacteristics(avrthandle?.value?.toCPointer<ByteVar>())

public actual fun avRtCreateThreadOrderingGroup(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroup(context?.value?.toCPointer<ByteVar>(), period?.value?.toCPointer<ByteVar>(), threadorderingguid?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun avRtCreateThreadOrderingGroupExA(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?, taskname: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExA(context?.value?.toCPointer<ByteVar>(), period?.value?.toCPointer<ByteVar>(), threadorderingguid?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), taskname?.value?.toCPointer<ByteVar>())

public actual fun avRtCreateThreadOrderingGroupExW(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?, taskname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avRtCreateThreadOrderingGroupExW(context?.value?.toCPointer<ByteVar>(), period?.value?.toCPointer<ByteVar>(), threadorderingguid?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), taskname?.value?.toCPointer<ByteVar>())

public actual fun avRtDeleteThreadOrderingGroup(context: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avRtDeleteThreadOrderingGroup(context?.value?.toCPointer<ByteVar>())

public actual fun avRtJoinThreadOrderingGroup(context: COpaquePointer?, threadorderingguid: COpaquePointer?, before: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avRtJoinThreadOrderingGroup(context?.value?.toCPointer<ByteVar>(), threadorderingguid?.value?.toCPointer<ByteVar>(), before)

public actual fun avRtLeaveThreadOrderingGroup(context: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avRtLeaveThreadOrderingGroup(context?.value?.toCPointer<ByteVar>())

public actual fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avRtWaitOnThreadOrderingGroup(context?.value?.toCPointer<ByteVar>())

public actual fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsA(firsttask?.value?.toCPointer<ByteVar>(), secondtask?.value?.toCPointer<ByteVar>(), taskindex?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avSetMmMaxThreadCharacteristicsW(firsttask?.value?.toCPointer<ByteVar>(), secondtask?.value?.toCPointer<ByteVar>(), taskindex?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsA(taskname?.value?.toCPointer<ByteVar>(), taskindex?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avSetMmThreadCharacteristicsW(taskname?.value?.toCPointer<ByteVar>(), taskindex?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_avSetMmThreadPriority(avrthandle?.value?.toCPointer<ByteVar>(), priority)

public actual fun callbackMayRunLong(pci: PtpCallbackInstance): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_callbackMayRunLong(pci)

public actual fun cancelThreadpoolIo(pio: PtpIo) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_cancelThreadpoolIo(pio)
}

public actual fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_cancelTimerQueueTimer(timerqueue?.value?.toCPointer<ByteVar>(), timer?.value?.toCPointer<ByteVar>())

public actual fun cancelWaitableTimer(htimer: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_cancelWaitableTimer(htimer?.value?.toCPointer<ByteVar>())

public actual fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_changeTimerQueueTimer(timerqueue?.value?.toCPointer<ByteVar>(), timer?.value?.toCPointer<ByteVar>(), duetime, period)

public actual fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_closePrivateNamespace(handle?.value?.toCPointer<ByteVar>(), flags)

public actual fun closeThreadpool(ptpp: PtpPool) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_closeThreadpool(ptpp.toLong())
}

public actual fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroup(ptpcg.toLong())
}

public actual fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_closeThreadpoolCleanupGroupMembers(ptpcg.toLong(), fcancelpendingcallbacks, pvcleanupcontext?.value?.toCPointer<ByteVar>())
}

public actual fun closeThreadpoolIo(pio: PtpIo) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_closeThreadpoolIo(pio)
}

public actual fun closeThreadpoolTimer(pti: PtpTimer) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_closeThreadpoolTimer(pti)
}

public actual fun closeThreadpoolWait(pwa: PtpWait) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_closeThreadpoolWait(pwa)
}

public actual fun closeThreadpoolWork(pwk: PtpWork) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_closeThreadpoolWork(pwk)
}

public actual fun convertFiberToThread(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_convertFiberToThread()

public actual fun convertThreadToFiber(lpparameter: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_convertThreadToFiber(lpparameter?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun convertThreadToFiberEx(lpparameter: COpaquePointer?, dwflags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_convertThreadToFiberEx(lpparameter?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createBoundaryDescriptorA(name?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createBoundaryDescriptorW(name?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun createEventA(lpeventattributes: COpaquePointer?, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createEventA(lpeventattributes?.value?.toCPointer<ByteVar>(), bmanualreset, binitialstate, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createEventExA(lpeventattributes: COpaquePointer?, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createEventExA(lpeventattributes?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun createEventExW(lpeventattributes: COpaquePointer?, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createEventExW(lpeventattributes?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun createEventW(lpeventattributes: COpaquePointer?, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createEventW(lpeventattributes?.value?.toCPointer<ByteVar>(), bmanualreset, binitialstate, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createFiber(dwstacksize, 0L.toCPointer<ByteVar>(), lpparameter?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createFiberEx(dwstackcommitsize, dwstackreservesize, dwflags, 0L.toCPointer<ByteVar>(), lpparameter?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createMutexA(lpmutexattributes: COpaquePointer?, binitialowner: Bool, lpname: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createMutexA(lpmutexattributes?.value?.toCPointer<ByteVar>(), binitialowner, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createMutexExA(lpmutexattributes: COpaquePointer?, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createMutexExA(lpmutexattributes?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun createMutexExW(lpmutexattributes: COpaquePointer?, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createMutexExW(lpmutexattributes?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun createMutexW(lpmutexattributes: COpaquePointer?, binitialowner: Bool, lpname: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createMutexW(lpmutexattributes?.value?.toCPointer<ByteVar>(), binitialowner, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createPrivateNamespaceA(lpprivatenamespaceattributes: COpaquePointer?, lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createPrivateNamespaceA(lpprivatenamespaceattributes?.value?.toCPointer<ByteVar>(), lpboundarydescriptor?.value?.toCPointer<ByteVar>(), lpaliasprefix?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createPrivateNamespaceW(lpprivatenamespaceattributes: COpaquePointer?, lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createPrivateNamespaceW(lpprivatenamespaceattributes?.value?.toCPointer<ByteVar>(), lpboundarydescriptor?.value?.toCPointer<ByteVar>(), lpaliasprefix?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createProcessA(lpapplicationname?.value?.toCPointer<ByteVar>(), lpcommandline?.value?.toCPointer<ByteVar>(), lpprocessattributes?.value?.toCPointer<ByteVar>(), lpthreadattributes?.value?.toCPointer<ByteVar>(), binherithandles, dwcreationflags, lpenvironment?.value?.toCPointer<ByteVar>(), lpcurrentdirectory?.value?.toCPointer<ByteVar>(), lpstartupinfo?.value?.toCPointer<ByteVar>(), lpprocessinformation?.value?.toCPointer<ByteVar>())

public actual fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createProcessAsUserA(htoken?.value?.toCPointer<ByteVar>(), lpapplicationname?.value?.toCPointer<ByteVar>(), lpcommandline?.value?.toCPointer<ByteVar>(), lpprocessattributes?.value?.toCPointer<ByteVar>(), lpthreadattributes?.value?.toCPointer<ByteVar>(), binherithandles, dwcreationflags, lpenvironment?.value?.toCPointer<ByteVar>(), lpcurrentdirectory?.value?.toCPointer<ByteVar>(), lpstartupinfo?.value?.toCPointer<ByteVar>(), lpprocessinformation?.value?.toCPointer<ByteVar>())

public actual fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createProcessAsUserW(htoken?.value?.toCPointer<ByteVar>(), lpapplicationname?.value?.toCPointer<ByteVar>(), lpcommandline?.value?.toCPointer<ByteVar>(), lpprocessattributes?.value?.toCPointer<ByteVar>(), lpthreadattributes?.value?.toCPointer<ByteVar>(), binherithandles, dwcreationflags, lpenvironment?.value?.toCPointer<ByteVar>(), lpcurrentdirectory?.value?.toCPointer<ByteVar>(), lpstartupinfo?.value?.toCPointer<ByteVar>(), lpprocessinformation?.value?.toCPointer<ByteVar>())

public actual fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createProcessW(lpapplicationname?.value?.toCPointer<ByteVar>(), lpcommandline?.value?.toCPointer<ByteVar>(), lpprocessattributes?.value?.toCPointer<ByteVar>(), lpthreadattributes?.value?.toCPointer<ByteVar>(), binherithandles, dwcreationflags, lpenvironment?.value?.toCPointer<ByteVar>(), lpcurrentdirectory?.value?.toCPointer<ByteVar>(), lpstartupinfo?.value?.toCPointer<ByteVar>(), lpprocessinformation?.value?.toCPointer<ByteVar>())

public actual fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createProcessWithLogonW(lpusername?.value?.toCPointer<ByteVar>(), lpdomain?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), dwlogonflags, lpapplicationname?.value?.toCPointer<ByteVar>(), lpcommandline?.value?.toCPointer<ByteVar>(), dwcreationflags, lpenvironment?.value?.toCPointer<ByteVar>(), lpcurrentdirectory?.value?.toCPointer<ByteVar>(), lpstartupinfo?.value?.toCPointer<ByteVar>(), lpprocessinformation?.value?.toCPointer<ByteVar>())

public actual fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createProcessWithTokenW(htoken?.value?.toCPointer<ByteVar>(), dwlogonflags, lpapplicationname?.value?.toCPointer<ByteVar>(), lpcommandline?.value?.toCPointer<ByteVar>(), dwcreationflags, lpenvironment?.value?.toCPointer<ByteVar>(), lpcurrentdirectory?.value?.toCPointer<ByteVar>(), lpstartupinfo?.value?.toCPointer<ByteVar>(), lpprocessinformation?.value?.toCPointer<ByteVar>())

public actual fun createRemoteThread(hprocess: Handle, lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: UInt, lpthreadid: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createRemoteThread(hprocess?.value?.toCPointer<ByteVar>(), lpthreadattributes?.value?.toCPointer<ByteVar>(), dwstacksize, 0L.toCPointer<ByteVar>(), lpparameter?.value?.toCPointer<ByteVar>(), dwcreationflags, lpthreadid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createRemoteThreadEx(hprocess?.value?.toCPointer<ByteVar>(), lpthreadattributes?.value?.toCPointer<ByteVar>(), dwstacksize, 0L.toCPointer<ByteVar>(), lpparameter?.value?.toCPointer<ByteVar>(), dwcreationflags, lpattributelist?.value?.toCPointer<ByteVar>(), lpthreadid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createSemaphoreA(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createSemaphoreA(lpsemaphoreattributes?.value?.toCPointer<ByteVar>(), linitialcount, lmaximumcount, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createSemaphoreExA(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createSemaphoreExA(lpsemaphoreattributes?.value?.toCPointer<ByteVar>(), linitialcount, lmaximumcount, lpname?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun createSemaphoreExW(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createSemaphoreExW(lpsemaphoreattributes?.value?.toCPointer<ByteVar>(), linitialcount, lmaximumcount, lpname?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun createSemaphoreW(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createSemaphoreW(lpsemaphoreattributes?.value?.toCPointer<ByteVar>(), linitialcount, lmaximumcount, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createThread(lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: ThreadCreationFlags, lpthreadid: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createThread(lpthreadattributes?.value?.toCPointer<ByteVar>(), dwstacksize, 0L.toCPointer<ByteVar>(), lpparameter?.value?.toCPointer<ByteVar>(), dwcreationflags, lpthreadid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createThreadpool(reserved: COpaquePointer?): PtpPool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createThreadpool(reserved?.value?.toCPointer<ByteVar>())

public actual fun createThreadpoolCleanupGroup(): PtpCleanupGroup =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createThreadpoolCleanupGroup()

public actual fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpIo =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createThreadpoolIo(fl?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), pcbe?.value?.toCPointer<ByteVar>())

public actual fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpTimer =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createThreadpoolTimer(0L.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), pcbe?.value?.toCPointer<ByteVar>())

public actual fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpWait =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createThreadpoolWait(0L.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), pcbe?.value?.toCPointer<ByteVar>())

public actual fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpWork =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createThreadpoolWork(0L.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), pcbe?.value?.toCPointer<ByteVar>())

public actual fun createTimerQueue(): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createTimerQueue()?.let { COpaquePointer(it.toLong()) }

public actual fun createTimerQueueTimer(phnewtimer: COpaquePointer?, timerqueue: Handle, callback: Waitortimercallback, parameter: COpaquePointer?, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createTimerQueueTimer(phnewtimer?.value?.toCPointer<ByteVar>(), timerqueue?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), parameter?.value?.toCPointer<ByteVar>(), duetime, period, flags)

public actual fun createUmsCompletionList(umscompletionlist: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createUmsCompletionList(umscompletionlist?.value?.toCPointer<ByteVar>())

public actual fun createUmsThreadContext(lpumsthread: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createUmsThreadContext(lpumsthread?.value?.toCPointer<ByteVar>())

public actual fun createWaitableTimerA(lptimerattributes: COpaquePointer?, bmanualreset: Bool, lptimername: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createWaitableTimerA(lptimerattributes?.value?.toCPointer<ByteVar>(), bmanualreset, lptimername?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createWaitableTimerExA(lptimerattributes: COpaquePointer?, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createWaitableTimerExA(lptimerattributes?.value?.toCPointer<ByteVar>(), lptimername?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun createWaitableTimerExW(lptimerattributes: COpaquePointer?, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createWaitableTimerExW(lptimerattributes?.value?.toCPointer<ByteVar>(), lptimername?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun createWaitableTimerW(lptimerattributes: COpaquePointer?, bmanualreset: Bool, lptimername: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_createWaitableTimerW(lptimerattributes?.value?.toCPointer<ByteVar>(), bmanualreset, lptimername?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun deleteBoundaryDescriptor(boundarydescriptor: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_deleteBoundaryDescriptor(boundarydescriptor?.value?.toCPointer<ByteVar>())
}

public actual fun deleteCriticalSection(lpcriticalsection: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_deleteCriticalSection(lpcriticalsection?.value?.toCPointer<ByteVar>())
}

public actual fun deleteFiber(lpfiber: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_deleteFiber(lpfiber?.value?.toCPointer<ByteVar>())
}

public actual fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_deleteProcThreadAttributeList(lpattributelist?.value?.toCPointer<ByteVar>())
}

public actual fun deleteSynchronizationBarrier(lpbarrier: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_deleteSynchronizationBarrier(lpbarrier?.value?.toCPointer<ByteVar>())

public actual fun deleteTimerQueue(timerqueue: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_deleteTimerQueue(timerqueue?.value?.toCPointer<ByteVar>())

public actual fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_deleteTimerQueueEx(timerqueue?.value?.toCPointer<ByteVar>(), completionevent?.value?.toCPointer<ByteVar>())

public actual fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_deleteTimerQueueTimer(timerqueue?.value?.toCPointer<ByteVar>(), timer?.value?.toCPointer<ByteVar>(), completionevent?.value?.toCPointer<ByteVar>())

public actual fun deleteUmsCompletionList(umscompletionlist: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_deleteUmsCompletionList(umscompletionlist?.value?.toCPointer<ByteVar>())

public actual fun deleteUmsThreadContext(umsthread: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_deleteUmsThreadContext(umsthread?.value?.toCPointer<ByteVar>())

public actual fun dequeueUmsCompletionListItems(umscompletionlist: COpaquePointer?, waittimeout: UInt, umsthreadlist: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_dequeueUmsCompletionListItems(umscompletionlist?.value?.toCPointer<ByteVar>(), waittimeout, umsthreadlist?.value?.toCPointer<ByteVar>())

public actual fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_disassociateCurrentThreadFromCallback(pci)
}

public actual fun enterCriticalSection(lpcriticalsection: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_enterCriticalSection(lpcriticalsection?.value?.toCPointer<ByteVar>())
}

public actual fun enterSynchronizationBarrier(lpbarrier: COpaquePointer?, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_enterSynchronizationBarrier(lpbarrier?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun enterUmsSchedulingMode(schedulerstartupinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_enterUmsSchedulingMode(schedulerstartupinfo?.value?.toCPointer<ByteVar>())

public actual fun executeUmsThread(umsthread: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_executeUmsThread(umsthread?.value?.toCPointer<ByteVar>())

public actual fun exitProcess(uexitcode: UInt): Nothing {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_exitProcess(uexitcode)
    error("Unreachable noreturn C function exitProcess")
}

public actual fun exitThread(dwexitcode: UInt): Nothing {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_exitThread(dwexitcode)
    error("Unreachable noreturn C function exitThread")
}

public actual fun flsAlloc(lpcallback: PflsCallbackFunction): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_flsAlloc(0L.toCPointer<ByteVar>())

public actual fun flsFree(dwflsindex: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_flsFree(dwflsindex)

public actual fun flsGetValue(dwflsindex: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_flsGetValue(dwflsindex)?.let { COpaquePointer(it.toLong()) }

public actual fun flsSetValue(dwflsindex: UInt, lpflsdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_flsSetValue(dwflsindex, lpflsdata?.value?.toCPointer<ByteVar>())

public actual fun flushProcessWriteBuffers() {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_flushProcessWriteBuffers()
}

public actual fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_freeLibraryWhenCallbackReturns(pci, mod?.value?.toCPointer<ByteVar>())
}

public actual fun getActiveProcessorCount(groupnumber: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getActiveProcessorCount(groupnumber)

public actual fun getActiveProcessorGroupCount(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getActiveProcessorGroupCount()

public actual fun getCurrentProcess(): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getCurrentProcess()?.let { COpaquePointer(it.toLong()) }

public actual fun getCurrentProcessId(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getCurrentProcessId()

public actual fun getCurrentProcessorNumber(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getCurrentProcessorNumber()

public actual fun getCurrentProcessorNumberEx(procnumber: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getCurrentProcessorNumberEx(procnumber?.value?.toCPointer<ByteVar>())
}

public actual fun getCurrentThread(): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getCurrentThread()?.let { COpaquePointer(it.toLong()) }

public actual fun getCurrentThreadId(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getCurrentThreadId()

public actual fun getCurrentThreadStackLimits(lowlimit: COpaquePointer?, highlimit: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getCurrentThreadStackLimits(lowlimit?.value?.toCPointer<ByteVar>(), highlimit?.value?.toCPointer<ByteVar>())
}

public actual fun getCurrentUmsThread(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getCurrentUmsThread()?.let { COpaquePointer(it.toLong()) }

public actual fun getExitCodeProcess(hprocess: Handle, lpexitcode: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getExitCodeProcess(hprocess?.value?.toCPointer<ByteVar>(), lpexitcode?.value?.toCPointer<ByteVar>())

public actual fun getExitCodeThread(hthread: Handle, lpexitcode: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getExitCodeThread(hthread?.value?.toCPointer<ByteVar>(), lpexitcode?.value?.toCPointer<ByteVar>())

public actual fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getGuiResources(hprocess?.value?.toCPointer<ByteVar>(), uiflags)

public actual fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getMachineTypeAttributes(machine, machinetypeattributes?.value?.toCPointer<ByteVar>())

public actual fun getMaximumProcessorCount(groupnumber: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getMaximumProcessorCount(groupnumber)

public actual fun getMaximumProcessorGroupCount(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getMaximumProcessorGroupCount()

public actual fun getNextUmsListItem(umscontext: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNextUmsListItem(umscontext?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getNumaAvailableMemoryNode(node: UByte, availablebytes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaAvailableMemoryNode(node, availablebytes?.value?.toCPointer<ByteVar>())

public actual fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaAvailableMemoryNodeEx(node, availablebytes?.value?.toCPointer<ByteVar>())

public actual fun getNumaHighestNodeNumber(highestnodenumber: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaHighestNodeNumber(highestnodenumber?.value?.toCPointer<ByteVar>())

public actual fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaNodeNumberFromHandle(hfile?.value?.toCPointer<ByteVar>(), nodenumber?.value?.toCPointer<ByteVar>())

public actual fun getNumaNodeProcessorMask(node: UByte, processormask: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaNodeProcessorMask(node, processormask?.value?.toCPointer<ByteVar>())

public actual fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: COpaquePointer?, processormaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaNodeProcessorMask2(nodenumber, processormasks?.value?.toCPointer<ByteVar>(), processormaskcount, requiredmaskcount?.value?.toCPointer<ByteVar>())

public actual fun getNumaNodeProcessorMaskEx(node: UShort, processormask: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaNodeProcessorMaskEx(node, processormask?.value?.toCPointer<ByteVar>())

public actual fun getNumaProcessorNode(processor: UByte, nodenumber: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaProcessorNode(processor, nodenumber?.value?.toCPointer<ByteVar>())

public actual fun getNumaProcessorNodeEx(processor: COpaquePointer?, nodenumber: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaProcessorNodeEx(processor?.value?.toCPointer<ByteVar>(), nodenumber?.value?.toCPointer<ByteVar>())

public actual fun getNumaProximityNode(proximityid: UInt, nodenumber: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaProximityNode(proximityid, nodenumber?.value?.toCPointer<ByteVar>())

public actual fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getNumaProximityNodeEx(proximityid, nodenumber?.value?.toCPointer<ByteVar>())

public actual fun getPriorityClass(hprocess: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getPriorityClass(hprocess?.value?.toCPointer<ByteVar>())

public actual fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: COpaquePointer?, lpsystemaffinitymask: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessAffinityMask(hprocess?.value?.toCPointer<ByteVar>(), lpprocessaffinitymask?.value?.toCPointer<ByteVar>(), lpsystemaffinitymask?.value?.toCPointer<ByteVar>())

public actual fun getProcessDEPPolicy(hprocess: Handle, lpflags: COpaquePointer?, lppermanent: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessDEPPolicy(hprocess?.value?.toCPointer<ByteVar>(), lpflags?.value?.toCPointer<ByteVar>(), lppermanent?.value?.toCPointer<ByteVar>())

public actual fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessDefaultCpuSetMasks(process?.value?.toCPointer<ByteVar>(), cpusetmasks?.value?.toCPointer<ByteVar>(), cpusetmaskcount, requiredmaskcount?.value?.toCPointer<ByteVar>())

public actual fun getProcessDefaultCpuSets(process: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt, requiredidcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessDefaultCpuSets(process?.value?.toCPointer<ByteVar>(), cpusetids?.value?.toCPointer<ByteVar>(), cpusetidcount, requiredidcount?.value?.toCPointer<ByteVar>())

public actual fun getProcessGroupAffinity(hprocess: Handle, groupcount: COpaquePointer?, grouparray: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessGroupAffinity(hprocess?.value?.toCPointer<ByteVar>(), groupcount?.value?.toCPointer<ByteVar>(), grouparray?.value?.toCPointer<ByteVar>())

public actual fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessHandleCount(hprocess?.value?.toCPointer<ByteVar>(), pdwhandlecount?.value?.toCPointer<ByteVar>())

public actual fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessHandleFromHwnd(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getProcessId(process: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessId(process?.value?.toCPointer<ByteVar>())

public actual fun getProcessIdOfThread(thread: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessIdOfThread(thread?.value?.toCPointer<ByteVar>())

public actual fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: COpaquePointer?, processinformationsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessInformation(hprocess?.value?.toCPointer<ByteVar>(), processinformationclass, processinformation?.value?.toCPointer<ByteVar>(), processinformationsize)

public actual fun getProcessIoCounters(hprocess: Handle, lpiocounters: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessIoCounters(hprocess?.value?.toCPointer<ByteVar>(), lpiocounters?.value?.toCPointer<ByteVar>())

public actual fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: COpaquePointer?, dwlength: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessMitigationPolicy(hprocess?.value?.toCPointer<ByteVar>(), mitigationpolicy, lpbuffer?.value?.toCPointer<ByteVar>(), dwlength)

public actual fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessPriorityBoost(hprocess?.value?.toCPointer<ByteVar>(), pdisablepriorityboost?.value?.toCPointer<ByteVar>())

public actual fun getProcessShutdownParameters(lpdwlevel: COpaquePointer?, lpdwflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessShutdownParameters(lpdwlevel?.value?.toCPointer<ByteVar>(), lpdwflags?.value?.toCPointer<ByteVar>())

public actual fun getProcessTimes(hprocess: Handle, lpcreationtime: COpaquePointer?, lpexittime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessTimes(hprocess?.value?.toCPointer<ByteVar>(), lpcreationtime?.value?.toCPointer<ByteVar>(), lpexittime?.value?.toCPointer<ByteVar>(), lpkerneltime?.value?.toCPointer<ByteVar>(), lpusertime?.value?.toCPointer<ByteVar>())

public actual fun getProcessVersion(processid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessVersion(processid)

public actual fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: COpaquePointer?, lpmaximumworkingsetsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getProcessWorkingSetSize(hprocess?.value?.toCPointer<ByteVar>(), lpminimumworkingsetsize?.value?.toCPointer<ByteVar>(), lpmaximumworkingsetsize?.value?.toCPointer<ByteVar>())

public actual fun getStartupInfoA(lpstartupinfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getStartupInfoA(lpstartupinfo?.value?.toCPointer<ByteVar>())
}

public actual fun getStartupInfoW(lpstartupinfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getStartupInfoW(lpstartupinfo?.value?.toCPointer<ByteVar>())
}

public actual fun getSystemTimes(lpidletime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getSystemTimes(lpidletime?.value?.toCPointer<ByteVar>(), lpkerneltime?.value?.toCPointer<ByteVar>(), lpusertime?.value?.toCPointer<ByteVar>())

public actual fun getThreadDescription(hthread: Handle, ppszthreaddescription: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadDescription(hthread?.value?.toCPointer<ByteVar>(), ppszthreaddescription?.value?.toCPointer<ByteVar>())

public actual fun getThreadGroupAffinity(hthread: Handle, groupaffinity: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadGroupAffinity(hthread?.value?.toCPointer<ByteVar>(), groupaffinity?.value?.toCPointer<ByteVar>())

public actual fun getThreadIOPendingFlag(hthread: Handle, lpioispending: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadIOPendingFlag(hthread?.value?.toCPointer<ByteVar>(), lpioispending?.value?.toCPointer<ByteVar>())

public actual fun getThreadId(thread: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadId(thread?.value?.toCPointer<ByteVar>())

public actual fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadIdealProcessorEx(hthread?.value?.toCPointer<ByteVar>(), lpidealprocessor?.value?.toCPointer<ByteVar>())

public actual fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: COpaquePointer?, threadinformationsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadInformation(hthread?.value?.toCPointer<ByteVar>(), threadinformationclass, threadinformation?.value?.toCPointer<ByteVar>(), threadinformationsize)

public actual fun getThreadPriority(hthread: Handle): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadPriority(hthread?.value?.toCPointer<ByteVar>())

public actual fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadPriorityBoost(hthread?.value?.toCPointer<ByteVar>(), pdisablepriorityboost?.value?.toCPointer<ByteVar>())

public actual fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadSelectedCpuSetMasks(thread?.value?.toCPointer<ByteVar>(), cpusetmasks?.value?.toCPointer<ByteVar>(), cpusetmaskcount, requiredmaskcount?.value?.toCPointer<ByteVar>())

public actual fun getThreadSelectedCpuSets(thread: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt, requiredidcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadSelectedCpuSets(thread?.value?.toCPointer<ByteVar>(), cpusetids?.value?.toCPointer<ByteVar>(), cpusetidcount, requiredidcount?.value?.toCPointer<ByteVar>())

public actual fun getThreadTimes(hthread: Handle, lpcreationtime: COpaquePointer?, lpexittime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getThreadTimes(hthread?.value?.toCPointer<ByteVar>(), lpcreationtime?.value?.toCPointer<ByteVar>(), lpexittime?.value?.toCPointer<ByteVar>(), lpkerneltime?.value?.toCPointer<ByteVar>(), lpusertime?.value?.toCPointer<ByteVar>())

public actual fun getUmsCompletionListEvent(umscompletionlist: COpaquePointer?, umscompletionevent: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getUmsCompletionListEvent(umscompletionlist?.value?.toCPointer<ByteVar>(), umscompletionevent?.value?.toCPointer<ByteVar>())

public actual fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_getUmsSystemThreadInformation(threadhandle?.value?.toCPointer<ByteVar>(), systemthreadinfo?.value?.toCPointer<ByteVar>())

public actual fun initOnceBeginInitialize(lpinitonce: COpaquePointer?, dwflags: UInt, fpending: COpaquePointer?, lpcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initOnceBeginInitialize(lpinitonce?.value?.toCPointer<ByteVar>(), dwflags, fpending?.value?.toCPointer<ByteVar>(), lpcontext?.value?.toCPointer<ByteVar>())

public actual fun initOnceComplete(lpinitonce: COpaquePointer?, dwflags: UInt, lpcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initOnceComplete(lpinitonce?.value?.toCPointer<ByteVar>(), dwflags, lpcontext?.value?.toCPointer<ByteVar>())

public actual fun initOnceExecuteOnce(initonce: COpaquePointer?, initfn: PinitOnceFn, parameter: COpaquePointer?, context: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initOnceExecuteOnce(initonce?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), parameter?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun initOnceInitialize(initonce: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initOnceInitialize(initonce?.value?.toCPointer<ByteVar>())
}

public actual fun initializeConditionVariable(conditionvariable: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initializeConditionVariable(conditionvariable?.value?.toCPointer<ByteVar>())
}

public actual fun initializeCriticalSection(lpcriticalsection: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initializeCriticalSection(lpcriticalsection?.value?.toCPointer<ByteVar>())
}

public actual fun initializeCriticalSectionAndSpinCount(lpcriticalsection: COpaquePointer?, dwspincount: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initializeCriticalSectionAndSpinCount(lpcriticalsection?.value?.toCPointer<ByteVar>(), dwspincount)

public actual fun initializeCriticalSectionEx(lpcriticalsection: COpaquePointer?, dwspincount: UInt, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initializeCriticalSectionEx(lpcriticalsection?.value?.toCPointer<ByteVar>(), dwspincount, flags)

public actual fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initializeProcThreadAttributeList(lpattributelist?.value?.toCPointer<ByteVar>(), dwattributecount, dwflags, lpsize?.value?.toCPointer<ByteVar>())

public actual fun initializeSListHead(listhead: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initializeSListHead(listhead?.value?.toCPointer<ByteVar>())
}

public actual fun initializeSRWLock(srwlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initializeSRWLock(srwlock?.value?.toCPointer<ByteVar>())
}

public actual fun initializeSynchronizationBarrier(lpbarrier: COpaquePointer?, ltotalthreads: Int, lspincount: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_initializeSynchronizationBarrier(lpbarrier?.value?.toCPointer<ByteVar>(), ltotalthreads, lspincount)

public actual fun interlockedFlushSList(listhead: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_interlockedFlushSList(listhead?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun interlockedPopEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_interlockedPopEntrySList(listhead?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun interlockedPushEntrySList(listhead: COpaquePointer?, listentry: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_interlockedPushEntrySList(listhead?.value?.toCPointer<ByteVar>(), listentry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun interlockedPushListSListEx(listhead: COpaquePointer?, list: COpaquePointer?, listend: COpaquePointer?, count: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_interlockedPushListSListEx(listhead?.value?.toCPointer<ByteVar>(), list?.value?.toCPointer<ByteVar>(), listend?.value?.toCPointer<ByteVar>(), count)?.let { COpaquePointer(it.toLong()) }

public actual fun isImmersiveProcess(hprocess: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_isImmersiveProcess(hprocess?.value?.toCPointer<ByteVar>())

public actual fun isProcessCritical(hprocess: Handle, critical: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_isProcessCritical(hprocess?.value?.toCPointer<ByteVar>(), critical?.value?.toCPointer<ByteVar>())

public actual fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_isProcessorFeaturePresent(processorfeature)

public actual fun isThreadAFiber(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_isThreadAFiber()

public actual fun isThreadpoolTimerSet(pti: PtpTimer): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_isThreadpoolTimerSet(pti)

public actual fun isWow64Process(hprocess: Handle, wow64process: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_isWow64Process(hprocess?.value?.toCPointer<ByteVar>(), wow64process?.value?.toCPointer<ByteVar>())

public actual fun isWow64Process2(hprocess: Handle, pprocessmachine: COpaquePointer?, pnativemachine: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_isWow64Process2(hprocess?.value?.toCPointer<ByteVar>(), pprocessmachine?.value?.toCPointer<ByteVar>(), pnativemachine?.value?.toCPointer<ByteVar>())

public actual fun leaveCriticalSection(lpcriticalsection: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_leaveCriticalSection(lpcriticalsection?.value?.toCPointer<ByteVar>())
}

public actual fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_leaveCriticalSectionWhenCallbackReturns(pci, pcs?.value?.toCPointer<ByteVar>())
}

public actual fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openEventA(dwdesiredaccess, binherithandle, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openEventW(dwdesiredaccess, binherithandle, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openMutexW(dwdesiredaccess, binherithandle, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openPrivateNamespaceA(lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openPrivateNamespaceA(lpboundarydescriptor?.value?.toCPointer<ByteVar>(), lpaliasprefix?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openPrivateNamespaceW(lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openPrivateNamespaceW(lpboundarydescriptor?.value?.toCPointer<ByteVar>(), lpaliasprefix?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openProcess(dwdesiredaccess, binherithandle, dwprocessid)?.let { COpaquePointer(it.toLong()) }

public actual fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openProcessToken(processhandle?.value?.toCPointer<ByteVar>(), desiredaccess, tokenhandle?.value?.toCPointer<ByteVar>())

public actual fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openSemaphoreW(dwdesiredaccess, binherithandle, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openThread(dwdesiredaccess, binherithandle, dwthreadid)?.let { COpaquePointer(it.toLong()) }

public actual fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openThreadToken(threadhandle?.value?.toCPointer<ByteVar>(), desiredaccess, openasself, tokenhandle?.value?.toCPointer<ByteVar>())

public actual fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openWaitableTimerA(dwdesiredaccess, binherithandle, lptimername?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_openWaitableTimerW(dwdesiredaccess, binherithandle, lptimername?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pulseEvent(hevent: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_pulseEvent(hevent?.value?.toCPointer<ByteVar>())

public actual fun queryDepthSList(listhead: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_queryDepthSList(listhead?.value?.toCPointer<ByteVar>())

public actual fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_queryFullProcessImageNameA(hprocess?.value?.toCPointer<ByteVar>(), dwflags, lpexename?.value?.toCPointer<ByteVar>(), lpdwsize?.value?.toCPointer<ByteVar>())

public actual fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_queryFullProcessImageNameW(hprocess?.value?.toCPointer<ByteVar>(), dwflags, lpexename?.value?.toCPointer<ByteVar>(), lpdwsize?.value?.toCPointer<ByteVar>())

public actual fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_queryProcessAffinityUpdateMode(hprocess?.value?.toCPointer<ByteVar>(), lpdwflags?.value?.toCPointer<ByteVar>())

public actual fun queryProtectedPolicy(policyguid: COpaquePointer?, policyvalue: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_queryProtectedPolicy(policyguid?.value?.toCPointer<ByteVar>(), policyvalue?.value?.toCPointer<ByteVar>())

public actual fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_queryThreadpoolStackInformation(ptpp.toLong(), ptpsi?.value?.toCPointer<ByteVar>())

public actual fun queryUmsThreadInformation(umsthread: COpaquePointer?, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: COpaquePointer?, umsthreadinformationlength: UInt, returnlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_queryUmsThreadInformation(umsthread?.value?.toCPointer<ByteVar>(), umsthreadinfoclass, umsthreadinformation?.value?.toCPointer<ByteVar>(), umsthreadinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt =
    0u

public actual fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool =
    0

public actual fun queueUserWorkItem(function: LpthreadStartRoutine, context: COpaquePointer?, flags: WorkerThreadFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_queueUserWorkItem(0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), flags)

public actual fun registerWaitForSingleObject(phnewwaitobject: COpaquePointer?, hobject: Handle, callback: Waitortimercallback, context: COpaquePointer?, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_registerWaitForSingleObject(phnewwaitobject?.value?.toCPointer<ByteVar>(), hobject?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), dwmilliseconds, dwflags)

public actual fun releaseMutex(hmutex: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_releaseMutex(hmutex?.value?.toCPointer<ByteVar>())

public actual fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_releaseMutexWhenCallbackReturns(pci, mut?.value?.toCPointer<ByteVar>())
}

public actual fun releaseSRWLockExclusive(srwlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_releaseSRWLockExclusive(srwlock?.value?.toCPointer<ByteVar>())
}

public actual fun releaseSRWLockShared(srwlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_releaseSRWLockShared(srwlock?.value?.toCPointer<ByteVar>())
}

public actual fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_releaseSemaphore(hsemaphore?.value?.toCPointer<ByteVar>(), lreleasecount, lppreviouscount?.value?.toCPointer<ByteVar>())

public actual fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_releaseSemaphoreWhenCallbackReturns(pci, sem?.value?.toCPointer<ByteVar>(), crel)
}

public actual fun resetEvent(hevent: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_resetEvent(hevent?.value?.toCPointer<ByteVar>())

public actual fun resumeThread(hthread: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_resumeThread(hthread?.value?.toCPointer<ByteVar>())

public actual fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: COpaquePointer?, key: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqAddPeriodicCallback(0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqAllocateSerialWorkQueue(workqueueidin, workqueueidout?.value?.toCPointer<ByteVar>())

public actual fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqAllocateWorkQueue(workqueuetype, workqueueid?.value?.toCPointer<ByteVar>())

public actual fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: COpaquePointer?, donestate: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid, usageclass?.value?.toCPointer<ByteVar>(), dwtaskid, lpriority, donecallback?.value?.toCPointer<ByteVar>(), donestate?.value?.toCPointer<ByteVar>())

public actual fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: COpaquePointer?, donestate: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid, donecallback?.value?.toCPointer<ByteVar>(), donestate?.value?.toCPointer<ByteVar>())

public actual fun rtwqCancelDeadline(prequest: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqCancelDeadline(prequest?.value?.toCPointer<ByteVar>())

public actual fun rtwqCancelWorkItem(key: ULong): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqCancelWorkItem(key)

public actual fun rtwqCreateAsyncResult(appobject: COpaquePointer?, callback: COpaquePointer?, appstate: COpaquePointer?, asyncresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqCreateAsyncResult(appobject?.value?.toCPointer<ByteVar>(), callback?.value?.toCPointer<ByteVar>(), appstate?.value?.toCPointer<ByteVar>(), asyncresult?.value?.toCPointer<ByteVar>())

public actual fun rtwqEndRegisterWorkQueueWithMMCSS(result: COpaquePointer?, taskid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqEndRegisterWorkQueueWithMMCSS(result?.value?.toCPointer<ByteVar>(), taskid?.value?.toCPointer<ByteVar>())

public actual fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSClass(workqueueid, usageclass?.value?.toCPointer<ByteVar>(), usageclasslength?.value?.toCPointer<ByteVar>())

public actual fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSPriority(workqueueid, priority?.value?.toCPointer<ByteVar>())

public actual fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqGetWorkQueueMMCSSTaskId(workqueueid, taskid?.value?.toCPointer<ByteVar>())

public actual fun rtwqInvokeCallback(result: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqInvokeCallback(result?.value?.toCPointer<ByteVar>())

public actual fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqJoinWorkQueue(workqueueid, hfile?.value?.toCPointer<ByteVar>(), out?.value?.toCPointer<ByteVar>())

public actual fun rtwqLockPlatform(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqLockPlatform()

public actual fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: COpaquePointer?, id: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqLockSharedWorkQueue(usageclass?.value?.toCPointer<ByteVar>(), basepriority, taskid?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>())

public actual fun rtwqLockWorkQueue(workqueueid: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqLockWorkQueue(workqueueid)

public actual fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: COpaquePointer?, key: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqPutWaitingWorkItem(hevent?.value?.toCPointer<ByteVar>(), lpriority, result?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqPutWorkItem(dwqueue, lpriority, result?.value?.toCPointer<ByteVar>())

public actual fun rtwqRegisterPlatformEvents(platformevents: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqRegisterPlatformEvents(platformevents?.value?.toCPointer<ByteVar>())

public actual fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: COpaquePointer?, lpriority: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqRegisterPlatformWithMMCSS(usageclass?.value?.toCPointer<ByteVar>(), taskid?.value?.toCPointer<ByteVar>(), lpriority)

public actual fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqRemovePeriodicCallback(dwkey)

public actual fun rtwqScheduleWorkItem(result: COpaquePointer?, timeout: Long, key: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqScheduleWorkItem(result?.value?.toCPointer<ByteVar>(), timeout, key?.value?.toCPointer<ByteVar>())

public actual fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqSetDeadline(workqueueid, deadlineinhns, prequest?.value?.toCPointer<ByteVar>())

public actual fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqSetDeadline2(workqueueid, deadlineinhns, predeadlineinhns, prequest?.value?.toCPointer<ByteVar>())

public actual fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqSetLongRunning(workqueueid, enable)

public actual fun rtwqShutdown(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqShutdown()

public actual fun rtwqStartup(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqStartup()

public actual fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqUnjoinWorkQueue(workqueueid, hfile?.value?.toCPointer<ByteVar>())

public actual fun rtwqUnlockPlatform(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqUnlockPlatform()

public actual fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqUnlockWorkQueue(workqueueid)

public actual fun rtwqUnregisterPlatformEvents(platformevents: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqUnregisterPlatformEvents(platformevents?.value?.toCPointer<ByteVar>())

public actual fun rtwqUnregisterPlatformFromMMCSS(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_rtwqUnregisterPlatformFromMMCSS()

public actual fun setCriticalSectionSpinCount(lpcriticalsection: COpaquePointer?, dwspincount: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setCriticalSectionSpinCount(lpcriticalsection?.value?.toCPointer<ByteVar>(), dwspincount)

public actual fun setEvent(hevent: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setEvent(hevent?.value?.toCPointer<ByteVar>())

public actual fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setEventWhenCallbackReturns(pci, evt?.value?.toCPointer<ByteVar>())
}

public actual fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setPriorityClass(hprocess?.value?.toCPointer<ByteVar>(), dwpriorityclass)

public actual fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessAffinityMask(hprocess?.value?.toCPointer<ByteVar>(), dwprocessaffinitymask)

public actual fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessAffinityUpdateMode(hprocess?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessDEPPolicy(dwflags)

public actual fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessDefaultCpuSetMasks(process?.value?.toCPointer<ByteVar>(), cpusetmasks?.value?.toCPointer<ByteVar>(), cpusetmaskcount)

public actual fun setProcessDefaultCpuSets(process: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessDefaultCpuSets(process?.value?.toCPointer<ByteVar>(), cpusetids?.value?.toCPointer<ByteVar>(), cpusetidcount)

public actual fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessDynamicEHContinuationTargets(process?.value?.toCPointer<ByteVar>(), numberoftargets, targets?.value?.toCPointer<ByteVar>())

public actual fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessDynamicEnforcedCetCompatibleRanges(process?.value?.toCPointer<ByteVar>(), numberofranges, ranges?.value?.toCPointer<ByteVar>())

public actual fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: COpaquePointer?, processinformationsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessInformation(hprocess?.value?.toCPointer<ByteVar>(), processinformationclass, processinformation?.value?.toCPointer<ByteVar>(), processinformationsize)

public actual fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: COpaquePointer?, dwlength: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessMitigationPolicy(mitigationpolicy, lpbuffer?.value?.toCPointer<ByteVar>(), dwlength)

public actual fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessPriorityBoost(hprocess?.value?.toCPointer<ByteVar>(), bdisablepriorityboost)

public actual fun setProcessRestrictionExemption(fenableexemption: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessRestrictionExemption(fenableexemption)

public actual fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessShutdownParameters(dwlevel, dwflags)

public actual fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProcessWorkingSetSize(hprocess?.value?.toCPointer<ByteVar>(), dwminimumworkingsetsize, dwmaximumworkingsetsize)

public actual fun setProtectedPolicy(policyguid: COpaquePointer?, policyvalue: ULong, oldpolicyvalue: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setProtectedPolicy(policyguid?.value?.toCPointer<ByteVar>(), policyvalue, oldpolicyvalue?.value?.toCPointer<ByteVar>())

public actual fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadAffinityMask(hthread?.value?.toCPointer<ByteVar>(), dwthreadaffinitymask)

public actual fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadDescription(hthread?.value?.toCPointer<ByteVar>(), lpthreaddescription?.value?.toCPointer<ByteVar>())

public actual fun setThreadGroupAffinity(hthread: Handle, groupaffinity: COpaquePointer?, previousgroupaffinity: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadGroupAffinity(hthread?.value?.toCPointer<ByteVar>(), groupaffinity?.value?.toCPointer<ByteVar>(), previousgroupaffinity?.value?.toCPointer<ByteVar>())

public actual fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadIdealProcessor(hthread?.value?.toCPointer<ByteVar>(), dwidealprocessor)

public actual fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: COpaquePointer?, lppreviousidealprocessor: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadIdealProcessorEx(hthread?.value?.toCPointer<ByteVar>(), lpidealprocessor?.value?.toCPointer<ByteVar>(), lppreviousidealprocessor?.value?.toCPointer<ByteVar>())

public actual fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: COpaquePointer?, threadinformationsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadInformation(hthread?.value?.toCPointer<ByteVar>(), threadinformationclass, threadinformation?.value?.toCPointer<ByteVar>(), threadinformationsize)

public actual fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadPriority(hthread?.value?.toCPointer<ByteVar>(), npriority)

public actual fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadPriorityBoost(hthread?.value?.toCPointer<ByteVar>(), bdisablepriorityboost)

public actual fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadSelectedCpuSetMasks(thread?.value?.toCPointer<ByteVar>(), cpusetmasks?.value?.toCPointer<ByteVar>(), cpusetmaskcount)

public actual fun setThreadSelectedCpuSets(thread: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadSelectedCpuSets(thread?.value?.toCPointer<ByteVar>(), cpusetids?.value?.toCPointer<ByteVar>(), cpusetidcount)

public actual fun setThreadStackGuarantee(stacksizeinbytes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadStackGuarantee(stacksizeinbytes?.value?.toCPointer<ByteVar>())

public actual fun setThreadToken(thread: COpaquePointer?, token: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadToken(thread?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>())

public actual fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadpoolStackInformation(ptpp.toLong(), ptpsi?.value?.toCPointer<ByteVar>())

public actual fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadpoolThreadMaximum(ptpp.toLong(), cthrdmost)
}

public actual fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadpoolThreadMinimum(ptpp.toLong(), cthrdmic)

public actual fun setThreadpoolTimer(pti: PtpTimer, pftduetime: COpaquePointer?, msperiod: UInt, mswindowlength: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadpoolTimer(pti, pftduetime?.value?.toCPointer<ByteVar>(), msperiod, mswindowlength)
}

public actual fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: COpaquePointer?, msperiod: UInt, mswindowlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadpoolTimerEx(pti, pftduetime?.value?.toCPointer<ByteVar>(), msperiod, mswindowlength)

public actual fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadpoolWait(pwa, h?.value?.toCPointer<ByteVar>(), pfttimeout?.value?.toCPointer<ByteVar>())
}

public actual fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setThreadpoolWaitEx(pwa, h?.value?.toCPointer<ByteVar>(), pfttimeout?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>())

public actual fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: COpaquePointer?, duetime: UInt, period: UInt, preferio: Bool): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setTimerQueueTimer(timerqueue?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), parameter?.value?.toCPointer<ByteVar>(), duetime, period, preferio)?.let { COpaquePointer(it.toLong()) }

public actual fun setUmsThreadInformation(umsthread: COpaquePointer?, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: COpaquePointer?, umsthreadinformationlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setUmsThreadInformation(umsthread?.value?.toCPointer<ByteVar>(), umsthreadinfoclass, umsthreadinformation?.value?.toCPointer<ByteVar>(), umsthreadinformationlength)

public actual fun setWaitableTimer(htimer: Handle, lpduetime: COpaquePointer?, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: COpaquePointer?, fresume: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setWaitableTimer(htimer?.value?.toCPointer<ByteVar>(), lpduetime?.value?.toCPointer<ByteVar>(), lperiod, 0L.toCPointer<ByteVar>(), lpargtocompletionroutine?.value?.toCPointer<ByteVar>(), fresume)

public actual fun setWaitableTimerEx(htimer: Handle, lpduetime: COpaquePointer?, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: COpaquePointer?, wakecontext: COpaquePointer?, tolerabledelay: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_setWaitableTimerEx(htimer?.value?.toCPointer<ByteVar>(), lpduetime?.value?.toCPointer<ByteVar>(), lperiod, 0L.toCPointer<ByteVar>(), lpargtocompletionroutine?.value?.toCPointer<ByteVar>(), wakecontext?.value?.toCPointer<ByteVar>(), tolerabledelay)

public actual fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_signalObjectAndWait(hobjecttosignal?.value?.toCPointer<ByteVar>(), hobjecttowaiton?.value?.toCPointer<ByteVar>(), dwmilliseconds, balertable)

public actual fun sleep(dwmilliseconds: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_sleep(dwmilliseconds)
}

public actual fun sleepConditionVariableCS(conditionvariable: COpaquePointer?, criticalsection: COpaquePointer?, dwmilliseconds: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_sleepConditionVariableCS(conditionvariable?.value?.toCPointer<ByteVar>(), criticalsection?.value?.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun sleepConditionVariableSRW(conditionvariable: COpaquePointer?, srwlock: COpaquePointer?, dwmilliseconds: UInt, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_sleepConditionVariableSRW(conditionvariable?.value?.toCPointer<ByteVar>(), srwlock?.value?.toCPointer<ByteVar>(), dwmilliseconds, flags)

public actual fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_sleepEx(dwmilliseconds, balertable)

public actual fun startThreadpoolIo(pio: PtpIo) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_startThreadpoolIo(pio)
}

public actual fun submitThreadpoolWork(pwk: PtpWork) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_submitThreadpoolWork(pwk)
}

public actual fun suspendThread(hthread: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_suspendThread(hthread?.value?.toCPointer<ByteVar>())

public actual fun switchToFiber(lpfiber: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_switchToFiber(lpfiber?.value?.toCPointer<ByteVar>())
}

public actual fun switchToThread(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_switchToThread()

public actual fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_terminateProcess(hprocess?.value?.toCPointer<ByteVar>(), uexitcode)

public actual fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_terminateThread(hthread?.value?.toCPointer<ByteVar>(), dwexitcode)

public actual fun tlsAlloc(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_tlsAlloc()

public actual fun tlsFree(dwtlsindex: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_tlsFree(dwtlsindex)

public actual fun tlsGetValue(dwtlsindex: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_tlsGetValue(dwtlsindex)?.let { COpaquePointer(it.toLong()) }

public actual fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_tlsSetValue(dwtlsindex, lptlsvalue?.value?.toCPointer<ByteVar>())

public actual fun tryAcquireSRWLockExclusive(srwlock: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_tryAcquireSRWLockExclusive(srwlock?.value?.toCPointer<ByteVar>())

public actual fun tryAcquireSRWLockShared(srwlock: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_tryAcquireSRWLockShared(srwlock?.value?.toCPointer<ByteVar>())

public actual fun tryEnterCriticalSection(lpcriticalsection: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_tryEnterCriticalSection(lpcriticalsection?.value?.toCPointer<ByteVar>())

public actual fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_trySubmitThreadpoolCallback(0L.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), pcbe?.value?.toCPointer<ByteVar>())

public actual fun umsThreadYield(schedulerparam: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_umsThreadYield(schedulerparam?.value?.toCPointer<ByteVar>())

public actual fun unregisterWait(waithandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_unregisterWait(waithandle?.value?.toCPointer<ByteVar>())

public actual fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_unregisterWaitEx(waithandle?.value?.toCPointer<ByteVar>(), completionevent?.value?.toCPointer<ByteVar>())

public actual fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: COpaquePointer?, cbsize: ULong, lppreviousvalue: COpaquePointer?, lpreturnsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_updateProcThreadAttribute(lpattributelist?.value?.toCPointer<ByteVar>(), dwflags, attribute, lpvalue?.value?.toCPointer<ByteVar>(), cbsize, lppreviousvalue?.value?.toCPointer<ByteVar>(), lpreturnsize?.value?.toCPointer<ByteVar>())

public actual fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_waitForInputIdle(hprocess?.value?.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun waitForMultipleObjects(ncount: UInt, lphandles: COpaquePointer?, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_waitForMultipleObjects(ncount, lphandles?.value?.toCPointer<ByteVar>(), bwaitall, dwmilliseconds)

public actual fun waitForMultipleObjectsEx(ncount: UInt, lphandles: COpaquePointer?, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_waitForMultipleObjectsEx(ncount, lphandles?.value?.toCPointer<ByteVar>(), bwaitall, dwmilliseconds, balertable)

public actual fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_waitForSingleObject(hhandle?.value?.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_waitForSingleObjectEx(hhandle?.value?.toCPointer<ByteVar>(), dwmilliseconds, balertable)

public actual fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_waitForThreadpoolIoCallbacks(pio, fcancelpendingcallbacks)
}

public actual fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_waitForThreadpoolTimerCallbacks(pti, fcancelpendingcallbacks)
}

public actual fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_waitForThreadpoolWaitCallbacks(pwa, fcancelpendingcallbacks)
}

public actual fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_waitForThreadpoolWorkCallbacks(pwk, fcancelpendingcallbacks)
}

public actual fun waitOnAddress(address: COpaquePointer?, compareaddress: COpaquePointer?, addresssize: ULong, dwmilliseconds: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_waitOnAddress(address?.value?.toCPointer<ByteVar>(), compareaddress?.value?.toCPointer<ByteVar>(), addresssize, dwmilliseconds)

public actual fun wakeAllConditionVariable(conditionvariable: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_wakeAllConditionVariable(conditionvariable?.value?.toCPointer<ByteVar>())
}

public actual fun wakeByAddressAll(address: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_wakeByAddressAll(address?.value?.toCPointer<ByteVar>())
}

public actual fun wakeByAddressSingle(address: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_wakeByAddressSingle(address?.value?.toCPointer<ByteVar>())
}

public actual fun wakeConditionVariable(conditionvariable: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_wakeConditionVariable(conditionvariable?.value?.toCPointer<ByteVar>())
}

public actual fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_winExec(lpcmdline?.value?.toCPointer<ByteVar>(), ucmdshow)

public actual fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_wow64SetThreadDefaultGuestMachine(machine)

public actual fun wow64SuspendThread(hthread: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_wow64SuspendThread(hthread?.value?.toCPointer<ByteVar>())
