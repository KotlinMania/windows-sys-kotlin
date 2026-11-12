@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Papcfunc
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.TokenAccessMask
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ProcessorNumber
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SlistEntry
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SlistHeader
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.GroupAffinity
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ImageFileMachine

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun acquireSRWLockExclusive(srwlock: MutPtr<Srwlock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAcquireSRWLockExclusive")

public actual fun acquireSRWLockShared(srwlock: MutPtr<Srwlock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAcquireSRWLockShared")

public actual fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: MutPtr<Handle>, integritylabel: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAddIntegrityLabelToBoundaryDescriptor")

public actual fun addSIDToBoundaryDescriptor(boundarydescriptor: MutPtr<Handle>, requiredsid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAddSIDToBoundaryDescriptor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingAttachThreadInput")
private external fun wasiWindowssysWindowsWin32SystemThreadingAttachThreadInput(idattach: Int, idattachto: Int, fattach: Int): Int

public actual fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool =
    wasiWindowssysWindowsWin32SystemThreadingAttachThreadInput(idattach.toInt(), idattachto.toInt(), fattach)

public actual fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvQuerySystemResponsiveness")

public actual fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRevertMmThreadCharacteristics")

public actual fun avRtCreateThreadOrderingGroup(context: MutPtr<Handle>, period: ConstPtr<Long>, threadorderingguid: MutPtr<Guid>, timeout: ConstPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroup")

public actual fun avRtCreateThreadOrderingGroupExA(context: MutPtr<Handle>, period: ConstPtr<Long>, threadorderingguid: MutPtr<Guid>, timeout: ConstPtr<Long>, taskname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExA")

public actual fun avRtCreateThreadOrderingGroupExW(context: MutPtr<Handle>, period: ConstPtr<Long>, threadorderingguid: MutPtr<Guid>, timeout: ConstPtr<Long>, taskname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExW")

public actual fun avRtDeleteThreadOrderingGroup(context: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtDeleteThreadOrderingGroup")

public actual fun avRtJoinThreadOrderingGroup(context: MutPtr<Handle>, threadorderingguid: ConstPtr<Guid>, before: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtJoinThreadOrderingGroup")

public actual fun avRtLeaveThreadOrderingGroup(context: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtLeaveThreadOrderingGroup")

public actual fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtWaitOnThreadOrderingGroup")

public actual fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: MutPtr<UInt>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsA")

public actual fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: MutPtr<UInt>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsW")

public actual fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: MutPtr<UInt>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsA")

public actual fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: MutPtr<UInt>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsW")

public actual fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvSetMmThreadPriority")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCallbackMayRunLong")
private external fun wasiWindowssysWindowsWin32SystemThreadingCallbackMayRunLong(pci: Long): Int

public actual fun callbackMayRunLong(pci: PtpCallbackInstance): Bool =
    wasiWindowssysWindowsWin32SystemThreadingCallbackMayRunLong(pci)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCancelThreadpoolIo")
private external fun wasiWindowssysWindowsWin32SystemThreadingCancelThreadpoolIo(pio: Long): Unit

public actual fun cancelThreadpoolIo(pio: PtpIo): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCancelThreadpoolIo(pio)

public actual fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCancelTimerQueueTimer")

public actual fun cancelWaitableTimer(htimer: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCancelWaitableTimer")

public actual fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingChangeTimerQueueTimer")

public actual fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingClosePrivateNamespace")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpool")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpool(ptpp: Long): Unit

public actual fun closeThreadpool(ptpp: PtpPool): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpool(ptpp)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup(ptpcg: Long): Unit

public actual fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup(ptpcg)

public actual fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroupMembers")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpoolIo")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolIo(pio: Long): Unit

public actual fun closeThreadpoolIo(pio: PtpIo): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolIo(pio)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpoolTimer")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolTimer(pti: Long): Unit

public actual fun closeThreadpoolTimer(pti: PtpTimer): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolTimer(pti)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpoolWait")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolWait(pwa: Long): Unit

public actual fun closeThreadpoolWait(pwa: PtpWait): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolWait(pwa)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpoolWork")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolWork(pwk: Long): Unit

public actual fun closeThreadpoolWork(pwk: PtpWork): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolWork(pwk)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingConvertFiberToThread")
private external fun wasiWindowssysWindowsWin32SystemThreadingConvertFiberToThread(): Int

public actual fun convertFiberToThread(): Bool =
    wasiWindowssysWindowsWin32SystemThreadingConvertFiberToThread()

public actual fun convertThreadToFiber(lpparameter: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingConvertThreadToFiber")

public actual fun convertThreadToFiberEx(lpparameter: ConstPtr<CVoid>, dwflags: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingConvertThreadToFiberEx")

public actual fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorA")

public actual fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorW")

public actual fun createEventA(lpeventattributes: ConstPtr<SecurityAttributes>, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateEventA")

public actual fun createEventExA(lpeventattributes: ConstPtr<SecurityAttributes>, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateEventExA")

public actual fun createEventExW(lpeventattributes: ConstPtr<SecurityAttributes>, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateEventExW")

public actual fun createEventW(lpeventattributes: ConstPtr<SecurityAttributes>, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateEventW")

public actual fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateFiber")

public actual fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateFiberEx")

public actual fun createMutexA(lpmutexattributes: ConstPtr<SecurityAttributes>, binitialowner: Bool, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateMutexA")

public actual fun createMutexExA(lpmutexattributes: ConstPtr<SecurityAttributes>, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateMutexExA")

public actual fun createMutexExW(lpmutexattributes: ConstPtr<SecurityAttributes>, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateMutexExW")

public actual fun createMutexW(lpmutexattributes: ConstPtr<SecurityAttributes>, binitialowner: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateMutexW")

public actual fun createPrivateNamespaceA(lpprivatenamespaceattributes: ConstPtr<SecurityAttributes>, lpboundarydescriptor: ConstPtr<CVoid>, lpaliasprefix: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceA")

public actual fun createPrivateNamespaceW(lpprivatenamespaceattributes: ConstPtr<SecurityAttributes>, lpboundarydescriptor: ConstPtr<CVoid>, lpaliasprefix: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceW")

public actual fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr<SecurityAttributes>, lpthreadattributes: ConstPtr<SecurityAttributes>, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr<Startupinfoa>, lpprocessinformation: MutPtr<ProcessInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessA")

public actual fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr<SecurityAttributes>, lpthreadattributes: ConstPtr<SecurityAttributes>, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr<Startupinfoa>, lpprocessinformation: MutPtr<ProcessInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessAsUserA")

public actual fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr<SecurityAttributes>, lpthreadattributes: ConstPtr<SecurityAttributes>, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr<Startupinfow>, lpprocessinformation: MutPtr<ProcessInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessAsUserW")

public actual fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr<SecurityAttributes>, lpthreadattributes: ConstPtr<SecurityAttributes>, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr<Startupinfow>, lpprocessinformation: MutPtr<ProcessInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessW")

public actual fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr<Startupinfow>, lpprocessinformation: MutPtr<ProcessInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessWithLogonW")

public actual fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr<Startupinfow>, lpprocessinformation: MutPtr<ProcessInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessWithTokenW")

public actual fun createRemoteThread(hprocess: Handle, lpthreadattributes: ConstPtr<SecurityAttributes>, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr<CVoid>, dwcreationflags: UInt, lpthreadid: MutPtr<UInt>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateRemoteThread")

public actual fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: ConstPtr<SecurityAttributes>, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr<CVoid>, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: MutPtr<UInt>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateRemoteThreadEx")

public actual fun createSemaphoreA(lpsemaphoreattributes: ConstPtr<SecurityAttributes>, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateSemaphoreA")

public actual fun createSemaphoreExA(lpsemaphoreattributes: ConstPtr<SecurityAttributes>, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateSemaphoreExA")

public actual fun createSemaphoreExW(lpsemaphoreattributes: ConstPtr<SecurityAttributes>, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateSemaphoreExW")

public actual fun createSemaphoreW(lpsemaphoreattributes: ConstPtr<SecurityAttributes>, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateSemaphoreW")

public actual fun createThread(lpthreadattributes: ConstPtr<SecurityAttributes>, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr<CVoid>, dwcreationflags: ThreadCreationFlags, lpthreadid: MutPtr<UInt>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThread")

public actual fun createThreadpool(reserved: ConstPtr<CVoid>): PtpPool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThreadpool")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup")
private external fun wasiWindowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup(): Long

public actual fun createThreadpoolCleanupGroup(): PtpCleanupGroup =
    wasiWindowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup()

public actual fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: MutPtr<CVoid>, pcbe: ConstPtr<TpCallbackEnvironV3>): PtpIo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThreadpoolIo")

public actual fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: MutPtr<CVoid>, pcbe: ConstPtr<TpCallbackEnvironV3>): PtpTimer =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThreadpoolTimer")

public actual fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: MutPtr<CVoid>, pcbe: ConstPtr<TpCallbackEnvironV3>): PtpWait =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThreadpoolWait")

public actual fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: MutPtr<CVoid>, pcbe: ConstPtr<TpCallbackEnvironV3>): PtpWork =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThreadpoolWork")

public actual fun createTimerQueue(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateTimerQueue")

public actual fun createTimerQueueTimer(phnewtimer: MutPtr<Handle>, timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr<CVoid>, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateTimerQueueTimer")

public actual fun createUmsCompletionList(umscompletionlist: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateUmsCompletionList")

public actual fun createUmsThreadContext(lpumsthread: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateUmsThreadContext")

public actual fun createWaitableTimerA(lptimerattributes: ConstPtr<SecurityAttributes>, bmanualreset: Bool, lptimername: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateWaitableTimerA")

public actual fun createWaitableTimerExA(lptimerattributes: ConstPtr<SecurityAttributes>, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateWaitableTimerExA")

public actual fun createWaitableTimerExW(lptimerattributes: ConstPtr<SecurityAttributes>, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateWaitableTimerExW")

public actual fun createWaitableTimerW(lptimerattributes: ConstPtr<SecurityAttributes>, bmanualreset: Bool, lptimername: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateWaitableTimerW")

public actual fun deleteBoundaryDescriptor(boundarydescriptor: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteBoundaryDescriptor")

public actual fun deleteCriticalSection(lpcriticalsection: MutPtr<CriticalSection>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteCriticalSection")

public actual fun deleteFiber(lpfiber: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteFiber")

public actual fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteProcThreadAttributeList")

public actual fun deleteSynchronizationBarrier(lpbarrier: MutPtr<SynchronizationBarrier>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteSynchronizationBarrier")

public actual fun deleteTimerQueue(timerqueue: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteTimerQueue")

public actual fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteTimerQueueEx")

public actual fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteTimerQueueTimer")

public actual fun deleteUmsCompletionList(umscompletionlist: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteUmsCompletionList")

public actual fun deleteUmsThreadContext(umsthread: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteUmsThreadContext")

public actual fun dequeueUmsCompletionListItems(umscompletionlist: ConstPtr<CVoid>, waittimeout: UInt, umsthreadlist: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDequeueUmsCompletionListItems")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback")
private external fun wasiWindowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback(pci: Long): Unit

public actual fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance): Unit =
    wasiWindowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback(pci)

public actual fun enterCriticalSection(lpcriticalsection: MutPtr<CriticalSection>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingEnterCriticalSection")

public actual fun enterSynchronizationBarrier(lpbarrier: MutPtr<SynchronizationBarrier>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingEnterSynchronizationBarrier")

public actual fun enterUmsSchedulingMode(schedulerstartupinfo: ConstPtr<UmsSchedulerStartupInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingEnterUmsSchedulingMode")

public actual fun executeUmsThread(umsthread: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingExecuteUmsThread")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingExitProcess")
private external fun wasiWindowssysWindowsWin32SystemThreadingExitProcess(uexitcode: Int): Unit

public actual fun exitProcess(uexitcode: UInt): Nothing {
    wasiWindowssysWindowsWin32SystemThreadingExitProcess(uexitcode.toInt())
    error("C noreturn function windowssysWindowsWin32SystemThreadingExitProcess returned")
}

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingExitThread")
private external fun wasiWindowssysWindowsWin32SystemThreadingExitThread(dwexitcode: Int): Unit

public actual fun exitThread(dwexitcode: UInt): Nothing {
    wasiWindowssysWindowsWin32SystemThreadingExitThread(dwexitcode.toInt())
    error("C noreturn function windowssysWindowsWin32SystemThreadingExitThread returned")
}

public actual fun flsAlloc(lpcallback: PflsCallbackFunction): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingFlsAlloc")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingFlsFree")
private external fun wasiWindowssysWindowsWin32SystemThreadingFlsFree(dwflsindex: Int): Int

public actual fun flsFree(dwflsindex: UInt): Bool =
    wasiWindowssysWindowsWin32SystemThreadingFlsFree(dwflsindex.toInt())

public actual fun flsGetValue(dwflsindex: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingFlsGetValue")

public actual fun flsSetValue(dwflsindex: UInt, lpflsdata: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingFlsSetValue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers")
private external fun wasiWindowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers(): Unit

public actual fun flushProcessWriteBuffers(): Unit =
    wasiWindowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers()

public actual fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingFreeLibraryWhenCallbackReturns")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetActiveProcessorCount")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetActiveProcessorCount(groupnumber: Int): Int

public actual fun getActiveProcessorCount(groupnumber: UShort): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetActiveProcessorCount(groupnumber.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount(): Int

public actual fun getActiveProcessorGroupCount(): UShort =
    wasiWindowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount().toUShort()

public actual fun getCurrentProcess(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetCurrentProcess")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetCurrentProcessId")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetCurrentProcessId(): Int

public actual fun getCurrentProcessId(): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetCurrentProcessId().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber(): Int

public actual fun getCurrentProcessorNumber(): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber().toUInt()

public actual fun getCurrentProcessorNumberEx(procnumber: MutPtr<ProcessorNumber>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumberEx")

public actual fun getCurrentThread(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetCurrentThread")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetCurrentThreadId")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetCurrentThreadId(): Int

public actual fun getCurrentThreadId(): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetCurrentThreadId().toUInt()

public actual fun getCurrentThreadStackLimits(lowlimit: MutPtr<ULong>, highlimit: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetCurrentThreadStackLimits")

public actual fun getCurrentUmsThread(): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetCurrentUmsThread")

public actual fun getExitCodeProcess(hprocess: Handle, lpexitcode: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetExitCodeProcess")

public actual fun getExitCodeThread(hthread: Handle, lpexitcode: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetExitCodeThread")

public actual fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetGuiResources")

public actual fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: MutPtr<MachineAttributes>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetMachineTypeAttributes")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetMaximumProcessorCount")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetMaximumProcessorCount(groupnumber: Int): Int

public actual fun getMaximumProcessorCount(groupnumber: UShort): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetMaximumProcessorCount(groupnumber.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount(): Int

public actual fun getMaximumProcessorGroupCount(): UShort =
    wasiWindowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount().toUShort()

public actual fun getNextUmsListItem(umscontext: MutPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNextUmsListItem")

public actual fun getNumaAvailableMemoryNode(node: UByte, availablebytes: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNode")

public actual fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNodeEx")

public actual fun getNumaHighestNodeNumber(highestnodenumber: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaHighestNodeNumber")

public actual fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaNodeNumberFromHandle")

public actual fun getNumaNodeProcessorMask(node: UByte, processormask: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask")

public actual fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: MutPtr<GroupAffinity>, processormaskcount: UShort, requiredmaskcount: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask2")

public actual fun getNumaNodeProcessorMaskEx(node: UShort, processormask: MutPtr<GroupAffinity>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMaskEx")

public actual fun getNumaProcessorNode(processor: UByte, nodenumber: MutPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaProcessorNode")

public actual fun getNumaProcessorNodeEx(processor: ConstPtr<ProcessorNumber>, nodenumber: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaProcessorNodeEx")

public actual fun getNumaProximityNode(proximityid: UInt, nodenumber: MutPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaProximityNode")

public actual fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaProximityNodeEx")

public actual fun getPriorityClass(hprocess: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetPriorityClass")

public actual fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: MutPtr<ULong>, lpsystemaffinitymask: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessAffinityMask")

public actual fun getProcessDEPPolicy(hprocess: Handle, lpflags: MutPtr<UInt>, lppermanent: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessDEPPolicy")

public actual fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: MutPtr<GroupAffinity>, cpusetmaskcount: UShort, requiredmaskcount: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSetMasks")

public actual fun getProcessDefaultCpuSets(process: Handle, cpusetids: MutPtr<UInt>, cpusetidcount: UInt, requiredidcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSets")

public actual fun getProcessGroupAffinity(hprocess: Handle, groupcount: MutPtr<UShort>, grouparray: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessGroupAffinity")

public actual fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessHandleCount")

public actual fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessHandleFromHwnd")

public actual fun getProcessId(process: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessId")

public actual fun getProcessIdOfThread(thread: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessIdOfThread")

public actual fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: MutPtr<CVoid>, processinformationsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessInformation")

public actual fun getProcessIoCounters(hprocess: Handle, lpiocounters: MutPtr<IoCounters>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessIoCounters")

public actual fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: MutPtr<CVoid>, dwlength: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessMitigationPolicy")

public actual fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessPriorityBoost")

public actual fun getProcessShutdownParameters(lpdwlevel: MutPtr<UInt>, lpdwflags: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessShutdownParameters")

public actual fun getProcessTimes(hprocess: Handle, lpcreationtime: MutPtr<Filetime>, lpexittime: MutPtr<Filetime>, lpkerneltime: MutPtr<Filetime>, lpusertime: MutPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessTimes")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetProcessVersion")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetProcessVersion(processid: Int): Int

public actual fun getProcessVersion(processid: UInt): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetProcessVersion(processid.toInt()).toUInt()

public actual fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: MutPtr<ULong>, lpmaximumworkingsetsize: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessWorkingSetSize")

public actual fun getStartupInfoA(lpstartupinfo: MutPtr<Startupinfoa>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetStartupInfoA")

public actual fun getStartupInfoW(lpstartupinfo: MutPtr<Startupinfow>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetStartupInfoW")

public actual fun getSystemTimes(lpidletime: MutPtr<Filetime>, lpkerneltime: MutPtr<Filetime>, lpusertime: MutPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetSystemTimes")

public actual fun getThreadDescription(hthread: Handle, ppszthreaddescription: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadDescription")

public actual fun getThreadGroupAffinity(hthread: Handle, groupaffinity: MutPtr<GroupAffinity>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadGroupAffinity")

public actual fun getThreadIOPendingFlag(hthread: Handle, lpioispending: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadIOPendingFlag")

public actual fun getThreadId(thread: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadId")

public actual fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: MutPtr<ProcessorNumber>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadIdealProcessorEx")

public actual fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: MutPtr<CVoid>, threadinformationsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadInformation")

public actual fun getThreadPriority(hthread: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadPriority")

public actual fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadPriorityBoost")

public actual fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: MutPtr<GroupAffinity>, cpusetmaskcount: UShort, requiredmaskcount: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSetMasks")

public actual fun getThreadSelectedCpuSets(thread: Handle, cpusetids: MutPtr<UInt>, cpusetidcount: UInt, requiredidcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSets")

public actual fun getThreadTimes(hthread: Handle, lpcreationtime: MutPtr<Filetime>, lpexittime: MutPtr<Filetime>, lpkerneltime: MutPtr<Filetime>, lpusertime: MutPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadTimes")

public actual fun getUmsCompletionListEvent(umscompletionlist: ConstPtr<CVoid>, umscompletionevent: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetUmsCompletionListEvent")

public actual fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: MutPtr<UmsSystemThreadInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetUmsSystemThreadInformation")

public actual fun initOnceBeginInitialize(lpinitonce: MutPtr<InitOnce>, dwflags: UInt, fpending: MutPtr<Bool>, lpcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitOnceBeginInitialize")

public actual fun initOnceComplete(lpinitonce: MutPtr<InitOnce>, dwflags: UInt, lpcontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitOnceComplete")

public actual fun initOnceExecuteOnce(initonce: MutPtr<InitOnce>, initfn: PinitOnceFn, parameter: MutPtr<CVoid>, context: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitOnceExecuteOnce")

public actual fun initOnceInitialize(initonce: MutPtr<InitOnce>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitOnceInitialize")

public actual fun initializeConditionVariable(conditionvariable: MutPtr<ConditionVariable>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeConditionVariable")

public actual fun initializeCriticalSection(lpcriticalsection: MutPtr<CriticalSection>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeCriticalSection")

public actual fun initializeCriticalSectionAndSpinCount(lpcriticalsection: MutPtr<CriticalSection>, dwspincount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeCriticalSectionAndSpinCount")

public actual fun initializeCriticalSectionEx(lpcriticalsection: MutPtr<CriticalSection>, dwspincount: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeCriticalSectionEx")

public actual fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeProcThreadAttributeList")

public actual fun initializeSListHead(listhead: MutPtr<SlistHeader>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeSListHead")

public actual fun initializeSRWLock(srwlock: MutPtr<Srwlock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeSRWLock")

public actual fun initializeSynchronizationBarrier(lpbarrier: MutPtr<SynchronizationBarrier>, ltotalthreads: Int, lspincount: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeSynchronizationBarrier")

public actual fun interlockedFlushSList(listhead: MutPtr<SlistHeader>): MutPtr<SlistEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInterlockedFlushSList")

public actual fun interlockedPopEntrySList(listhead: MutPtr<SlistHeader>): MutPtr<SlistEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInterlockedPopEntrySList")

public actual fun interlockedPushEntrySList(listhead: MutPtr<SlistHeader>, listentry: MutPtr<SlistEntry>): MutPtr<SlistEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInterlockedPushEntrySList")

public actual fun interlockedPushListSListEx(listhead: MutPtr<SlistHeader>, list: MutPtr<SlistEntry>, listend: MutPtr<SlistEntry>, count: UInt): MutPtr<SlistEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInterlockedPushListSListEx")

public actual fun isImmersiveProcess(hprocess: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingIsImmersiveProcess")

public actual fun isProcessCritical(hprocess: Handle, critical: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingIsProcessCritical")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent")
private external fun wasiWindowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent(processorfeature: Int): Int

public actual fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool =
    wasiWindowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent(processorfeature.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingIsThreadAFiber")
private external fun wasiWindowssysWindowsWin32SystemThreadingIsThreadAFiber(): Int

public actual fun isThreadAFiber(): Bool =
    wasiWindowssysWindowsWin32SystemThreadingIsThreadAFiber()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet")
private external fun wasiWindowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet(pti: Long): Int

public actual fun isThreadpoolTimerSet(pti: PtpTimer): Bool =
    wasiWindowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet(pti)

public actual fun isWow64Process(hprocess: Handle, wow64process: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingIsWow64Process")

public actual fun isWow64Process2(hprocess: Handle, pprocessmachine: MutPtr<ImageFileMachine>, pnativemachine: MutPtr<ImageFileMachine>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingIsWow64Process2")

public actual fun leaveCriticalSection(lpcriticalsection: MutPtr<CriticalSection>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingLeaveCriticalSection")

public actual fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: MutPtr<CriticalSection>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingLeaveCriticalSectionWhenCallbackReturns")

public actual fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenEventA")

public actual fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenEventW")

public actual fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenMutexW")

public actual fun openPrivateNamespaceA(lpboundarydescriptor: ConstPtr<CVoid>, lpaliasprefix: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceA")

public actual fun openPrivateNamespaceW(lpboundarydescriptor: ConstPtr<CVoid>, lpaliasprefix: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceW")

public actual fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenProcess")

public actual fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenProcessToken")

public actual fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenSemaphoreW")

public actual fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenThread")

public actual fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenThreadToken")

public actual fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenWaitableTimerA")

public actual fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenWaitableTimerW")

public actual fun pulseEvent(hevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingPulseEvent")

public actual fun queryDepthSList(listhead: ConstPtr<SlistHeader>): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryDepthSList")

public actual fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameA")

public actual fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameW")

public actual fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: MutPtr<ProcessAffinityAutoUpdateFlags>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryProcessAffinityUpdateMode")

public actual fun queryProtectedPolicy(policyguid: ConstPtr<Guid>, policyvalue: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryProtectedPolicy")

public actual fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: MutPtr<TpPoolStackInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryThreadpoolStackInformation")

public actual fun queryUmsThreadInformation(umsthread: ConstPtr<CVoid>, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: MutPtr<CVoid>, umsthreadinformationlength: UInt, returnlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryUmsThreadInformation")

public actual fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueueUserAPC")

public actual fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueueUserAPC2")

public actual fun queueUserWorkItem(function: LpthreadStartRoutine, context: ConstPtr<CVoid>, flags: WorkerThreadFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueueUserWorkItem")

public actual fun registerWaitForSingleObject(phnewwaitobject: MutPtr<Handle>, hobject: Handle, callback: Waitortimercallback, context: ConstPtr<CVoid>, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRegisterWaitForSingleObject")

public actual fun releaseMutex(hmutex: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseMutex")

public actual fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseMutexWhenCallbackReturns")

public actual fun releaseSRWLockExclusive(srwlock: MutPtr<Srwlock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseSRWLockExclusive")

public actual fun releaseSRWLockShared(srwlock: MutPtr<Srwlock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseSRWLockShared")

public actual fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: MutPtr<Int>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseSemaphore")

public actual fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseSemaphoreWhenCallbackReturns")

public actual fun resetEvent(hevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingResetEvent")

public actual fun resumeThread(hthread: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingResumeThread")

public actual fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: MutPtr<CVoid>, key: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqAddPeriodicCallback")

public actual fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqAllocateSerialWorkQueue")

public actual fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqAllocateWorkQueue")

public actual fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: MutPtr<CVoid>, donestate: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqBeginRegisterWorkQueueWithMMCSS")

public actual fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: MutPtr<CVoid>, donestate: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqBeginUnregisterWorkQueueWithMMCSS")

public actual fun rtwqCancelDeadline(prequest: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqCancelDeadline")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqCancelWorkItem")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqCancelWorkItem(key: Long): Int

public actual fun rtwqCancelWorkItem(key: ULong): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqCancelWorkItem(key.toLong())

public actual fun rtwqCreateAsyncResult(appobject: MutPtr<CVoid>, callback: MutPtr<CVoid>, appstate: MutPtr<CVoid>, asyncresult: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqCreateAsyncResult")

public actual fun rtwqEndRegisterWorkQueueWithMMCSS(result: MutPtr<CVoid>, taskid: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqEndRegisterWorkQueueWithMMCSS")

public actual fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSClass")

public actual fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSPriority")

public actual fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSTaskId")

public actual fun rtwqInvokeCallback(result: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqInvokeCallback")

public actual fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqJoinWorkQueue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqLockPlatform")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqLockPlatform(): Int

public actual fun rtwqLockPlatform(): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqLockPlatform()

public actual fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: MutPtr<UInt>, id: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqLockSharedWorkQueue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqLockWorkQueue")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqLockWorkQueue(workqueueid: Int): Int

public actual fun rtwqLockWorkQueue(workqueueid: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqLockWorkQueue(workqueueid.toInt())

public actual fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: MutPtr<CVoid>, key: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqPutWaitingWorkItem")

public actual fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqPutWorkItem")

public actual fun rtwqRegisterPlatformEvents(platformevents: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformEvents")

public actual fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: MutPtr<UInt>, lpriority: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformWithMMCSS")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback(dwkey: Int): Int

public actual fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback(dwkey.toInt())

public actual fun rtwqScheduleWorkItem(result: MutPtr<CVoid>, timeout: Long, key: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqScheduleWorkItem")

public actual fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqSetDeadline")

public actual fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqSetDeadline2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqSetLongRunning")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqSetLongRunning(workqueueid: Int, enable: Int): Int

public actual fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqSetLongRunning(workqueueid.toInt(), enable)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqShutdown")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqShutdown(): Int

public actual fun rtwqShutdown(): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqShutdown()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqStartup")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqStartup(): Int

public actual fun rtwqStartup(): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqStartup()

public actual fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqUnjoinWorkQueue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqUnlockPlatform")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqUnlockPlatform(): Int

public actual fun rtwqUnlockPlatform(): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqUnlockPlatform()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue(workqueueid: Int): Int

public actual fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue(workqueueid.toInt())

public actual fun rtwqUnregisterPlatformEvents(platformevents: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformEvents")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS(): Int

public actual fun rtwqUnregisterPlatformFromMMCSS(): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS()

public actual fun setCriticalSectionSpinCount(lpcriticalsection: MutPtr<CriticalSection>, dwspincount: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetCriticalSectionSpinCount")

public actual fun setEvent(hevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetEvent")

public actual fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetEventWhenCallbackReturns")

public actual fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetPriorityClass")

public actual fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessAffinityMask")

public actual fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessAffinityUpdateMode")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSetProcessDEPPolicy")
private external fun wasiWindowssysWindowsWin32SystemThreadingSetProcessDEPPolicy(dwflags: Int): Int

public actual fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool =
    wasiWindowssysWindowsWin32SystemThreadingSetProcessDEPPolicy(dwflags.toInt())

public actual fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: ConstPtr<GroupAffinity>, cpusetmaskcount: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSetMasks")

public actual fun setProcessDefaultCpuSets(process: Handle, cpusetids: ConstPtr<UInt>, cpusetidcount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSets")

public actual fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: MutPtr<ProcessDynamicEhContinuationTarget>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessDynamicEHContinuationTargets")

public actual fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: MutPtr<ProcessDynamicEnforcedAddressRange>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessDynamicEnforcedCetCompatibleRanges")

public actual fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: ConstPtr<CVoid>, processinformationsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessInformation")

public actual fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: ConstPtr<CVoid>, dwlength: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessMitigationPolicy")

public actual fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessPriorityBoost")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption")
private external fun wasiWindowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption(fenableexemption: Int): Int

public actual fun setProcessRestrictionExemption(fenableexemption: Bool): Bool =
    wasiWindowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption(fenableexemption)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSetProcessShutdownParameters")
private external fun wasiWindowssysWindowsWin32SystemThreadingSetProcessShutdownParameters(dwlevel: Int, dwflags: Int): Int

public actual fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool =
    wasiWindowssysWindowsWin32SystemThreadingSetProcessShutdownParameters(dwlevel.toInt(), dwflags.toInt())

public actual fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessWorkingSetSize")

public actual fun setProtectedPolicy(policyguid: ConstPtr<Guid>, policyvalue: ULong, oldpolicyvalue: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProtectedPolicy")

public actual fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadAffinityMask")

public actual fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadDescription")

public actual fun setThreadGroupAffinity(hthread: Handle, groupaffinity: ConstPtr<GroupAffinity>, previousgroupaffinity: MutPtr<GroupAffinity>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadGroupAffinity")

public actual fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadIdealProcessor")

public actual fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: ConstPtr<ProcessorNumber>, lppreviousidealprocessor: MutPtr<ProcessorNumber>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadIdealProcessorEx")

public actual fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: ConstPtr<CVoid>, threadinformationsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadInformation")

public actual fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadPriority")

public actual fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadPriorityBoost")

public actual fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: ConstPtr<GroupAffinity>, cpusetmaskcount: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSetMasks")

public actual fun setThreadSelectedCpuSets(thread: Handle, cpusetids: ConstPtr<UInt>, cpusetidcount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSets")

public actual fun setThreadStackGuarantee(stacksizeinbytes: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadStackGuarantee")

public actual fun setThreadToken(thread: ConstPtr<Handle>, token: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadToken")

public actual fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: ConstPtr<TpPoolStackInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadpoolStackInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum")
private external fun wasiWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum(ptpp: Long, cthrdmost: Int): Unit

public actual fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt): Unit =
    wasiWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum(ptpp, cthrdmost.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum")
private external fun wasiWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum(ptpp: Long, cthrdmic: Int): Int

public actual fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool =
    wasiWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum(ptpp, cthrdmic.toInt())

public actual fun setThreadpoolTimer(pti: PtpTimer, pftduetime: ConstPtr<Filetime>, msperiod: UInt, mswindowlength: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadpoolTimer")

public actual fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: ConstPtr<Filetime>, msperiod: UInt, mswindowlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadpoolTimerEx")

public actual fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr<Filetime>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadpoolWait")

public actual fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr<Filetime>, reserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadpoolWaitEx")

public actual fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr<CVoid>, duetime: UInt, period: UInt, preferio: Bool): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetTimerQueueTimer")

public actual fun setUmsThreadInformation(umsthread: ConstPtr<CVoid>, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: ConstPtr<CVoid>, umsthreadinformationlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetUmsThreadInformation")

public actual fun setWaitableTimer(htimer: Handle, lpduetime: ConstPtr<Long>, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr<CVoid>, fresume: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetWaitableTimer")

public actual fun setWaitableTimerEx(htimer: Handle, lpduetime: ConstPtr<Long>, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr<CVoid>, wakecontext: ConstPtr<ReasonContext>, tolerabledelay: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetWaitableTimerEx")

public actual fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSignalObjectAndWait")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSleep")
private external fun wasiWindowssysWindowsWin32SystemThreadingSleep(dwmilliseconds: Int): Unit

public actual fun sleep(dwmilliseconds: UInt): Unit =
    wasiWindowssysWindowsWin32SystemThreadingSleep(dwmilliseconds.toInt())

public actual fun sleepConditionVariableCS(conditionvariable: MutPtr<ConditionVariable>, criticalsection: MutPtr<CriticalSection>, dwmilliseconds: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSleepConditionVariableCS")

public actual fun sleepConditionVariableSRW(conditionvariable: MutPtr<ConditionVariable>, srwlock: MutPtr<Srwlock>, dwmilliseconds: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSleepConditionVariableSRW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSleepEx")
private external fun wasiWindowssysWindowsWin32SystemThreadingSleepEx(dwmilliseconds: Int, balertable: Int): Int

public actual fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt =
    wasiWindowssysWindowsWin32SystemThreadingSleepEx(dwmilliseconds.toInt(), balertable).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingStartThreadpoolIo")
private external fun wasiWindowssysWindowsWin32SystemThreadingStartThreadpoolIo(pio: Long): Unit

public actual fun startThreadpoolIo(pio: PtpIo): Unit =
    wasiWindowssysWindowsWin32SystemThreadingStartThreadpoolIo(pio)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSubmitThreadpoolWork")
private external fun wasiWindowssysWindowsWin32SystemThreadingSubmitThreadpoolWork(pwk: Long): Unit

public actual fun submitThreadpoolWork(pwk: PtpWork): Unit =
    wasiWindowssysWindowsWin32SystemThreadingSubmitThreadpoolWork(pwk)

public actual fun suspendThread(hthread: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSuspendThread")

public actual fun switchToFiber(lpfiber: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSwitchToFiber")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSwitchToThread")
private external fun wasiWindowssysWindowsWin32SystemThreadingSwitchToThread(): Int

public actual fun switchToThread(): Bool =
    wasiWindowssysWindowsWin32SystemThreadingSwitchToThread()

public actual fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTerminateProcess")

public actual fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTerminateThread")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingTlsAlloc")
private external fun wasiWindowssysWindowsWin32SystemThreadingTlsAlloc(): Int

public actual fun tlsAlloc(): UInt =
    wasiWindowssysWindowsWin32SystemThreadingTlsAlloc().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingTlsFree")
private external fun wasiWindowssysWindowsWin32SystemThreadingTlsFree(dwtlsindex: Int): Int

public actual fun tlsFree(dwtlsindex: UInt): Bool =
    wasiWindowssysWindowsWin32SystemThreadingTlsFree(dwtlsindex.toInt())

public actual fun tlsGetValue(dwtlsindex: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTlsGetValue")

public actual fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTlsSetValue")

public actual fun tryAcquireSRWLockExclusive(srwlock: MutPtr<Srwlock>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTryAcquireSRWLockExclusive")

public actual fun tryAcquireSRWLockShared(srwlock: MutPtr<Srwlock>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTryAcquireSRWLockShared")

public actual fun tryEnterCriticalSection(lpcriticalsection: MutPtr<CriticalSection>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTryEnterCriticalSection")

public actual fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: MutPtr<CVoid>, pcbe: ConstPtr<TpCallbackEnvironV3>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTrySubmitThreadpoolCallback")

public actual fun umsThreadYield(schedulerparam: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingUmsThreadYield")

public actual fun unregisterWait(waithandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingUnregisterWait")

public actual fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingUnregisterWaitEx")

public actual fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: ConstPtr<CVoid>, cbsize: ULong, lppreviousvalue: MutPtr<CVoid>, lpreturnsize: ConstPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingUpdateProcThreadAttribute")

public actual fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitForInputIdle")

public actual fun waitForMultipleObjects(ncount: UInt, lphandles: ConstPtr<Handle>, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitForMultipleObjects")

public actual fun waitForMultipleObjectsEx(ncount: UInt, lphandles: ConstPtr<Handle>, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitForMultipleObjectsEx")

public actual fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitForSingleObject")

public actual fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitForSingleObjectEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks")
private external fun wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks(pio: Long, fcancelpendingcallbacks: Int): Unit

public actual fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool): Unit =
    wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks(pio, fcancelpendingcallbacks)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks")
private external fun wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks(pti: Long, fcancelpendingcallbacks: Int): Unit

public actual fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool): Unit =
    wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks(pti, fcancelpendingcallbacks)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks")
private external fun wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks(pwa: Long, fcancelpendingcallbacks: Int): Unit

public actual fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool): Unit =
    wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks(pwa, fcancelpendingcallbacks)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks")
private external fun wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks(pwk: Long, fcancelpendingcallbacks: Int): Unit

public actual fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool): Unit =
    wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks(pwk, fcancelpendingcallbacks)

public actual fun waitOnAddress(address: ConstPtr<CVoid>, compareaddress: ConstPtr<CVoid>, addresssize: ULong, dwmilliseconds: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitOnAddress")

public actual fun wakeAllConditionVariable(conditionvariable: MutPtr<ConditionVariable>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWakeAllConditionVariable")

public actual fun wakeByAddressAll(address: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWakeByAddressAll")

public actual fun wakeByAddressSingle(address: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWakeByAddressSingle")

public actual fun wakeConditionVariable(conditionvariable: MutPtr<ConditionVariable>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWakeConditionVariable")

public actual fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWinExec")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine")
private external fun wasiWindowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine(machine: Int): Int

public actual fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    wasiWindowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine(machine.toInt()).toUShort()

public actual fun wow64SuspendThread(hthread: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWow64SuspendThread")
