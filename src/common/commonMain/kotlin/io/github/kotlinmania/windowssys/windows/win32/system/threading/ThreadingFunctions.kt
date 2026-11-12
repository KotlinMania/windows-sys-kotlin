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

public expect fun acquireSRWLockExclusive(srwlock: MutPtr)

public expect fun acquireSRWLockShared(srwlock: MutPtr)

public expect fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: MutPtr, integritylabel: Psid): Bool

public expect fun addSIDToBoundaryDescriptor(boundarydescriptor: MutPtr, requiredsid: Psid): Bool

public expect fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool

public expect fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: MutPtr): Bool

public expect fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool

public expect fun avRtCreateThreadOrderingGroup(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr): Bool

public expect fun avRtCreateThreadOrderingGroupExA(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr, taskname: Pcstr): Bool

public expect fun avRtCreateThreadOrderingGroupExW(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr, taskname: Pcwstr): Bool

public expect fun avRtDeleteThreadOrderingGroup(context: Handle): Bool

public expect fun avRtJoinThreadOrderingGroup(context: MutPtr, threadorderingguid: ConstPtr, before: Bool): Bool

public expect fun avRtLeaveThreadOrderingGroup(context: Handle): Bool

public expect fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool

public expect fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: MutPtr): Handle

public expect fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: MutPtr): Handle

public expect fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: MutPtr): Handle

public expect fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: MutPtr): Handle

public expect fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool

public expect fun callbackMayRunLong(pci: PtpCallbackInstance): Bool

public expect fun cancelThreadpoolIo(pio: PtpIo)

public expect fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool

public expect fun cancelWaitableTimer(htimer: Handle): Bool

public expect fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool

public expect fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean

public expect fun closeThreadpool(ptpp: PtpPool)

public expect fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup)

public expect fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: MutPtr)

public expect fun closeThreadpoolIo(pio: PtpIo)

public expect fun closeThreadpoolTimer(pti: PtpTimer)

public expect fun closeThreadpoolWait(pwa: PtpWait)

public expect fun closeThreadpoolWork(pwk: PtpWork)

public expect fun convertFiberToThread(): Bool

public expect fun convertThreadToFiber(lpparameter: ConstPtr): MutPtr

public expect fun convertThreadToFiberEx(lpparameter: ConstPtr, dwflags: UInt): MutPtr

public expect fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle

public expect fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle

public expect fun createEventA(lpeventattributes: ConstPtr, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle

public expect fun createEventExA(lpeventattributes: ConstPtr, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle

public expect fun createEventExW(lpeventattributes: ConstPtr, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle

public expect fun createEventW(lpeventattributes: ConstPtr, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle

public expect fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr): MutPtr

public expect fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr): MutPtr

public expect fun createMutexA(lpmutexattributes: ConstPtr, binitialowner: Bool, lpname: Pcstr): Handle

public expect fun createMutexExA(lpmutexattributes: ConstPtr, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createMutexExW(lpmutexattributes: ConstPtr, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createMutexW(lpmutexattributes: ConstPtr, binitialowner: Bool, lpname: Pcwstr): Handle

public expect fun createPrivateNamespaceA(lpprivatenamespaceattributes: ConstPtr, lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcstr): Handle

public expect fun createPrivateNamespaceW(lpprivatenamespaceattributes: ConstPtr, lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcwstr): Handle

public expect fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool

public expect fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool

public expect fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool

public expect fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool

public expect fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool

public expect fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool

public expect fun createRemoteThread(hprocess: Handle, lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: UInt, lpthreadid: MutPtr): Handle

public expect fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: MutPtr): Handle

public expect fun createSemaphoreA(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle

public expect fun createSemaphoreExA(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createSemaphoreExW(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createSemaphoreW(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle

public expect fun createThread(lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: ThreadCreationFlags, lpthreadid: MutPtr): Handle

public expect fun createThreadpool(reserved: ConstPtr): PtpPool

public expect fun createThreadpoolCleanupGroup(): PtpCleanupGroup

public expect fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: MutPtr, pcbe: ConstPtr): PtpIo

public expect fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: MutPtr, pcbe: ConstPtr): PtpTimer

public expect fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: MutPtr, pcbe: ConstPtr): PtpWait

public expect fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: MutPtr, pcbe: ConstPtr): PtpWork

public expect fun createTimerQueue(): Handle

public expect fun createTimerQueueTimer(phnewtimer: MutPtr, timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool

public expect fun createUmsCompletionList(umscompletionlist: MutPtr): Bool

public expect fun createUmsThreadContext(lpumsthread: MutPtr): Bool

public expect fun createWaitableTimerA(lptimerattributes: ConstPtr, bmanualreset: Bool, lptimername: Pcstr): Handle

public expect fun createWaitableTimerExA(lptimerattributes: ConstPtr, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createWaitableTimerExW(lptimerattributes: ConstPtr, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createWaitableTimerW(lptimerattributes: ConstPtr, bmanualreset: Bool, lptimername: Pcwstr): Handle

public expect fun deleteBoundaryDescriptor(boundarydescriptor: Handle)

public expect fun deleteCriticalSection(lpcriticalsection: MutPtr)

public expect fun deleteFiber(lpfiber: ConstPtr)

public expect fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList)

public expect fun deleteSynchronizationBarrier(lpbarrier: MutPtr): Bool

public expect fun deleteTimerQueue(timerqueue: Handle): Bool

public expect fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool

public expect fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool

public expect fun deleteUmsCompletionList(umscompletionlist: ConstPtr): Bool

public expect fun deleteUmsThreadContext(umsthread: ConstPtr): Bool

public expect fun dequeueUmsCompletionListItems(umscompletionlist: ConstPtr, waittimeout: UInt, umsthreadlist: MutPtr): Bool

public expect fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance)

public expect fun enterCriticalSection(lpcriticalsection: MutPtr)

public expect fun enterSynchronizationBarrier(lpbarrier: MutPtr, dwflags: UInt): Bool

public expect fun enterUmsSchedulingMode(schedulerstartupinfo: ConstPtr): Bool

public expect fun executeUmsThread(umsthread: MutPtr): Bool

public expect fun exitProcess(uexitcode: UInt): Nothing

public expect fun exitThread(dwexitcode: UInt): Nothing

public expect fun flsAlloc(lpcallback: PflsCallbackFunction): UInt

public expect fun flsFree(dwflsindex: UInt): Bool

public expect fun flsGetValue(dwflsindex: UInt): MutPtr

public expect fun flsSetValue(dwflsindex: UInt, lpflsdata: ConstPtr): Bool

public expect fun flushProcessWriteBuffers()

public expect fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule)

public expect fun getActiveProcessorCount(groupnumber: UShort): UInt

public expect fun getActiveProcessorGroupCount(): UShort

public expect fun getCurrentProcess(): Handle

public expect fun getCurrentProcessId(): UInt

public expect fun getCurrentProcessorNumber(): UInt

public expect fun getCurrentProcessorNumberEx(procnumber: MutPtr)

public expect fun getCurrentThread(): Handle

public expect fun getCurrentThreadId(): UInt

public expect fun getCurrentThreadStackLimits(lowlimit: MutPtr, highlimit: MutPtr)

public expect fun getCurrentUmsThread(): MutPtr

public expect fun getExitCodeProcess(hprocess: Handle, lpexitcode: MutPtr): Bool

public expect fun getExitCodeThread(hthread: Handle, lpexitcode: MutPtr): Bool

public expect fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt

public expect fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: MutPtr): Hresult

public expect fun getMaximumProcessorCount(groupnumber: UShort): UInt

public expect fun getMaximumProcessorGroupCount(): UShort

public expect fun getNextUmsListItem(umscontext: MutPtr): MutPtr

public expect fun getNumaAvailableMemoryNode(node: UByte, availablebytes: MutPtr): Bool

public expect fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: MutPtr): Bool

public expect fun getNumaHighestNodeNumber(highestnodenumber: MutPtr): Bool

public expect fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: MutPtr): Bool

public expect fun getNumaNodeProcessorMask(node: UByte, processormask: MutPtr): Bool

public expect fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: MutPtr, processormaskcount: UShort, requiredmaskcount: MutPtr): Bool

public expect fun getNumaNodeProcessorMaskEx(node: UShort, processormask: MutPtr): Bool

public expect fun getNumaProcessorNode(processor: UByte, nodenumber: MutPtr): Bool

public expect fun getNumaProcessorNodeEx(processor: ConstPtr, nodenumber: MutPtr): Bool

public expect fun getNumaProximityNode(proximityid: UInt, nodenumber: MutPtr): Bool

public expect fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: MutPtr): Bool

public expect fun getPriorityClass(hprocess: Handle): UInt

public expect fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: MutPtr, lpsystemaffinitymask: MutPtr): Bool

public expect fun getProcessDEPPolicy(hprocess: Handle, lpflags: MutPtr, lppermanent: MutPtr): Bool

public expect fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: MutPtr, cpusetmaskcount: UShort, requiredmaskcount: MutPtr): Bool

public expect fun getProcessDefaultCpuSets(process: Handle, cpusetids: MutPtr, cpusetidcount: UInt, requiredidcount: MutPtr): Bool

public expect fun getProcessGroupAffinity(hprocess: Handle, groupcount: MutPtr, grouparray: MutPtr): Bool

public expect fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: MutPtr): Bool

public expect fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle

public expect fun getProcessId(process: Handle): UInt

public expect fun getProcessIdOfThread(thread: Handle): UInt

public expect fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: MutPtr, processinformationsize: UInt): Bool

public expect fun getProcessIoCounters(hprocess: Handle, lpiocounters: MutPtr): Bool

public expect fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: MutPtr, dwlength: ULong): Bool

public expect fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: MutPtr): Bool

public expect fun getProcessShutdownParameters(lpdwlevel: MutPtr, lpdwflags: MutPtr): Bool

public expect fun getProcessTimes(hprocess: Handle, lpcreationtime: MutPtr, lpexittime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool

public expect fun getProcessVersion(processid: UInt): UInt

public expect fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: MutPtr, lpmaximumworkingsetsize: MutPtr): Bool

public expect fun getStartupInfoA(lpstartupinfo: MutPtr)

public expect fun getStartupInfoW(lpstartupinfo: MutPtr)

public expect fun getSystemTimes(lpidletime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool

public expect fun getThreadDescription(hthread: Handle, ppszthreaddescription: MutPtr): Hresult

public expect fun getThreadGroupAffinity(hthread: Handle, groupaffinity: MutPtr): Bool

public expect fun getThreadIOPendingFlag(hthread: Handle, lpioispending: MutPtr): Bool

public expect fun getThreadId(thread: Handle): UInt

public expect fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: MutPtr): Bool

public expect fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: MutPtr, threadinformationsize: UInt): Bool

public expect fun getThreadPriority(hthread: Handle): Int

public expect fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: MutPtr): Bool

public expect fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: MutPtr, cpusetmaskcount: UShort, requiredmaskcount: MutPtr): Bool

public expect fun getThreadSelectedCpuSets(thread: Handle, cpusetids: MutPtr, cpusetidcount: UInt, requiredidcount: MutPtr): Bool

public expect fun getThreadTimes(hthread: Handle, lpcreationtime: MutPtr, lpexittime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool

public expect fun getUmsCompletionListEvent(umscompletionlist: ConstPtr, umscompletionevent: MutPtr): Bool

public expect fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: MutPtr): Bool

public expect fun initOnceBeginInitialize(lpinitonce: MutPtr, dwflags: UInt, fpending: MutPtr, lpcontext: MutPtr): Bool

public expect fun initOnceComplete(lpinitonce: MutPtr, dwflags: UInt, lpcontext: ConstPtr): Bool

public expect fun initOnceExecuteOnce(initonce: MutPtr, initfn: PinitOnceFn, parameter: MutPtr, context: MutPtr): Bool

public expect fun initOnceInitialize(initonce: MutPtr)

public expect fun initializeConditionVariable(conditionvariable: MutPtr)

public expect fun initializeCriticalSection(lpcriticalsection: MutPtr)

public expect fun initializeCriticalSectionAndSpinCount(lpcriticalsection: MutPtr, dwspincount: UInt): Bool

public expect fun initializeCriticalSectionEx(lpcriticalsection: MutPtr, dwspincount: UInt, flags: UInt): Bool

public expect fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: MutPtr): Bool

public expect fun initializeSListHead(listhead: MutPtr)

public expect fun initializeSRWLock(srwlock: MutPtr)

public expect fun initializeSynchronizationBarrier(lpbarrier: MutPtr, ltotalthreads: Int, lspincount: Int): Bool

public expect fun interlockedFlushSList(listhead: MutPtr): MutPtr

public expect fun interlockedPopEntrySList(listhead: MutPtr): MutPtr

public expect fun interlockedPushEntrySList(listhead: MutPtr, listentry: MutPtr): MutPtr

public expect fun interlockedPushListSListEx(listhead: MutPtr, list: MutPtr, listend: MutPtr, count: UInt): MutPtr

public expect fun isImmersiveProcess(hprocess: Handle): Bool

public expect fun isProcessCritical(hprocess: Handle, critical: MutPtr): Bool

public expect fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool

public expect fun isThreadAFiber(): Bool

public expect fun isThreadpoolTimerSet(pti: PtpTimer): Bool

public expect fun isWow64Process(hprocess: Handle, wow64process: MutPtr): Bool

public expect fun isWow64Process2(hprocess: Handle, pprocessmachine: MutPtr, pnativemachine: MutPtr): Bool

public expect fun leaveCriticalSection(lpcriticalsection: MutPtr)

public expect fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: MutPtr)

public expect fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle

public expect fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun openPrivateNamespaceA(lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcstr): Handle

public expect fun openPrivateNamespaceW(lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcwstr): Handle

public expect fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle

public expect fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: MutPtr): Bool

public expect fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle

public expect fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: MutPtr): Bool

public expect fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle

public expect fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle

public expect fun pulseEvent(hevent: Handle): Bool

public expect fun queryDepthSList(listhead: ConstPtr): UShort

public expect fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: MutPtr): Bool

public expect fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: MutPtr): Bool

public expect fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: MutPtr): Bool

public expect fun queryProtectedPolicy(policyguid: ConstPtr, policyvalue: MutPtr): Bool

public expect fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: MutPtr): Bool

public expect fun queryUmsThreadInformation(umsthread: ConstPtr, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: MutPtr, umsthreadinformationlength: UInt, returnlength: MutPtr): Bool

public expect fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt

public expect fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool

public expect fun queueUserWorkItem(function: LpthreadStartRoutine, context: ConstPtr, flags: WorkerThreadFlags): Bool

public expect fun registerWaitForSingleObject(phnewwaitobject: MutPtr, hobject: Handle, callback: Waitortimercallback, context: ConstPtr, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool

public expect fun releaseMutex(hmutex: Handle): Bool

public expect fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle)

public expect fun releaseSRWLockExclusive(srwlock: MutPtr)

public expect fun releaseSRWLockShared(srwlock: MutPtr)

public expect fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: MutPtr): Bool

public expect fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt)

public expect fun resetEvent(hevent: Handle): Bool

public expect fun resumeThread(hthread: Handle): UInt

public expect fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: MutPtr, key: MutPtr): Hresult

public expect fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: MutPtr): Hresult

public expect fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: MutPtr): Hresult

public expect fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: MutPtr, donestate: MutPtr): Hresult

public expect fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: MutPtr, donestate: MutPtr): Hresult

public expect fun rtwqCancelDeadline(prequest: Handle): Hresult

public expect fun rtwqCancelWorkItem(key: ULong): Hresult

public expect fun rtwqCreateAsyncResult(appobject: MutPtr, callback: MutPtr, appstate: MutPtr, asyncresult: MutPtr): Hresult

public expect fun rtwqEndRegisterWorkQueueWithMMCSS(result: MutPtr, taskid: MutPtr): Hresult

public expect fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: MutPtr): Hresult

public expect fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: MutPtr): Hresult

public expect fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: MutPtr): Hresult

public expect fun rtwqInvokeCallback(result: MutPtr): Hresult

public expect fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: MutPtr): Hresult

public expect fun rtwqLockPlatform(): Hresult

public expect fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: MutPtr, id: MutPtr): Hresult

public expect fun rtwqLockWorkQueue(workqueueid: UInt): Hresult

public expect fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: MutPtr, key: MutPtr): Hresult

public expect fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: MutPtr): Hresult

public expect fun rtwqRegisterPlatformEvents(platformevents: MutPtr): Hresult

public expect fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: MutPtr, lpriority: Int): Hresult

public expect fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult

public expect fun rtwqScheduleWorkItem(result: MutPtr, timeout: Long, key: MutPtr): Hresult

public expect fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: MutPtr): Hresult

public expect fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: MutPtr): Hresult

public expect fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult

public expect fun rtwqShutdown(): Hresult

public expect fun rtwqStartup(): Hresult

public expect fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult

public expect fun rtwqUnlockPlatform(): Hresult

public expect fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult

public expect fun rtwqUnregisterPlatformEvents(platformevents: MutPtr): Hresult

public expect fun rtwqUnregisterPlatformFromMMCSS(): Hresult

public expect fun setCriticalSectionSpinCount(lpcriticalsection: MutPtr, dwspincount: UInt): UInt

public expect fun setEvent(hevent: Handle): Bool

public expect fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle)

public expect fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool

public expect fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool

public expect fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool

public expect fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool

public expect fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: ConstPtr, cpusetmaskcount: UShort): Bool

public expect fun setProcessDefaultCpuSets(process: Handle, cpusetids: ConstPtr, cpusetidcount: UInt): Bool

public expect fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: MutPtr): Bool

public expect fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: MutPtr): Bool

public expect fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: ConstPtr, processinformationsize: UInt): Bool

public expect fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: ConstPtr, dwlength: ULong): Bool

public expect fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool

public expect fun setProcessRestrictionExemption(fenableexemption: Bool): Bool

public expect fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool

public expect fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool

public expect fun setProtectedPolicy(policyguid: ConstPtr, policyvalue: ULong, oldpolicyvalue: MutPtr): Bool

public expect fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong

public expect fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult

public expect fun setThreadGroupAffinity(hthread: Handle, groupaffinity: ConstPtr, previousgroupaffinity: MutPtr): Bool

public expect fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt

public expect fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: ConstPtr, lppreviousidealprocessor: MutPtr): Bool

public expect fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: ConstPtr, threadinformationsize: UInt): Bool

public expect fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool

public expect fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool

public expect fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: ConstPtr, cpusetmaskcount: UShort): Bool

public expect fun setThreadSelectedCpuSets(thread: Handle, cpusetids: ConstPtr, cpusetidcount: UInt): Bool

public expect fun setThreadStackGuarantee(stacksizeinbytes: MutPtr): Bool

public expect fun setThreadToken(thread: ConstPtr, token: Handle): Bool

public expect fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: ConstPtr): Bool

public expect fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt)

public expect fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool

public expect fun setThreadpoolTimer(pti: PtpTimer, pftduetime: ConstPtr, msperiod: UInt, mswindowlength: UInt)

public expect fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: ConstPtr, msperiod: UInt, mswindowlength: UInt): Bool

public expect fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr)

public expect fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr, reserved: ConstPtr): Bool

public expect fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr, duetime: UInt, period: UInt, preferio: Bool): Handle

public expect fun setUmsThreadInformation(umsthread: ConstPtr, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: ConstPtr, umsthreadinformationlength: UInt): Bool

public expect fun setWaitableTimer(htimer: Handle, lpduetime: ConstPtr, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr, fresume: Bool): Bool

public expect fun setWaitableTimerEx(htimer: Handle, lpduetime: ConstPtr, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr, wakecontext: ConstPtr, tolerabledelay: UInt): Bool

public expect fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent

public expect fun sleep(dwmilliseconds: UInt)

public expect fun sleepConditionVariableCS(conditionvariable: MutPtr, criticalsection: MutPtr, dwmilliseconds: UInt): Bool

public expect fun sleepConditionVariableSRW(conditionvariable: MutPtr, srwlock: MutPtr, dwmilliseconds: UInt, flags: UInt): Bool

public expect fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt

public expect fun startThreadpoolIo(pio: PtpIo)

public expect fun submitThreadpoolWork(pwk: PtpWork)

public expect fun suspendThread(hthread: Handle): UInt

public expect fun switchToFiber(lpfiber: ConstPtr)

public expect fun switchToThread(): Bool

public expect fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool

public expect fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool

public expect fun tlsAlloc(): UInt

public expect fun tlsFree(dwtlsindex: UInt): Bool

public expect fun tlsGetValue(dwtlsindex: UInt): MutPtr

public expect fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: ConstPtr): Bool

public expect fun tryAcquireSRWLockExclusive(srwlock: MutPtr): Boolean

public expect fun tryAcquireSRWLockShared(srwlock: MutPtr): Boolean

public expect fun tryEnterCriticalSection(lpcriticalsection: MutPtr): Bool

public expect fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: MutPtr, pcbe: ConstPtr): Bool

public expect fun umsThreadYield(schedulerparam: ConstPtr): Bool

public expect fun unregisterWait(waithandle: Handle): Bool

public expect fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool

public expect fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: ConstPtr, cbsize: ULong, lppreviousvalue: MutPtr, lpreturnsize: ConstPtr): Bool

public expect fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt

public expect fun waitForMultipleObjects(ncount: UInt, lphandles: ConstPtr, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent

public expect fun waitForMultipleObjectsEx(ncount: UInt, lphandles: ConstPtr, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent

public expect fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent

public expect fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent

public expect fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool)

public expect fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool)

public expect fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool)

public expect fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool)

public expect fun waitOnAddress(address: ConstPtr, compareaddress: ConstPtr, addresssize: ULong, dwmilliseconds: UInt): Bool

public expect fun wakeAllConditionVariable(conditionvariable: MutPtr)

public expect fun wakeByAddressAll(address: ConstPtr)

public expect fun wakeByAddressSingle(address: ConstPtr)

public expect fun wakeConditionVariable(conditionvariable: MutPtr)

public expect fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt

public expect fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort

public expect fun wow64SuspendThread(hthread: Handle): UInt
