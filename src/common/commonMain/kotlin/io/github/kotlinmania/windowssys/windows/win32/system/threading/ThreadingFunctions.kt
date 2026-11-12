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

public expect fun acquireSRWLockExclusive(srwlock: MutPtr<Srwlock>)

public expect fun acquireSRWLockShared(srwlock: MutPtr<Srwlock>)

public expect fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: MutPtr<Handle>, integritylabel: Psid): Bool

public expect fun addSIDToBoundaryDescriptor(boundarydescriptor: MutPtr<Handle>, requiredsid: Psid): Bool

public expect fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool

public expect fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: MutPtr<UInt>): Bool

public expect fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool

public expect fun avRtCreateThreadOrderingGroup(context: MutPtr<Handle>, period: ConstPtr<Long>, threadorderingguid: MutPtr<Guid>, timeout: ConstPtr<Long>): Bool

public expect fun avRtCreateThreadOrderingGroupExA(context: MutPtr<Handle>, period: ConstPtr<Long>, threadorderingguid: MutPtr<Guid>, timeout: ConstPtr<Long>, taskname: Pcstr): Bool

public expect fun avRtCreateThreadOrderingGroupExW(context: MutPtr<Handle>, period: ConstPtr<Long>, threadorderingguid: MutPtr<Guid>, timeout: ConstPtr<Long>, taskname: Pcwstr): Bool

public expect fun avRtDeleteThreadOrderingGroup(context: Handle): Bool

public expect fun avRtJoinThreadOrderingGroup(context: MutPtr<Handle>, threadorderingguid: ConstPtr<Guid>, before: Bool): Bool

public expect fun avRtLeaveThreadOrderingGroup(context: Handle): Bool

public expect fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool

public expect fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: MutPtr<UInt>): Handle

public expect fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: MutPtr<UInt>): Handle

public expect fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: MutPtr<UInt>): Handle

public expect fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: MutPtr<UInt>): Handle

public expect fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool

public expect fun callbackMayRunLong(pci: PtpCallbackInstance): Bool

public expect fun cancelThreadpoolIo(pio: PtpIo)

public expect fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool

public expect fun cancelWaitableTimer(htimer: Handle): Bool

public expect fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool

public expect fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean

public expect fun closeThreadpool(ptpp: PtpPool)

public expect fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup)

public expect fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: MutPtr<CVoid>)

public expect fun closeThreadpoolIo(pio: PtpIo)

public expect fun closeThreadpoolTimer(pti: PtpTimer)

public expect fun closeThreadpoolWait(pwa: PtpWait)

public expect fun closeThreadpoolWork(pwk: PtpWork)

public expect fun convertFiberToThread(): Bool

public expect fun convertThreadToFiber(lpparameter: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun convertThreadToFiberEx(lpparameter: ConstPtr<CVoid>, dwflags: UInt): MutPtr<CVoid>

public expect fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle

public expect fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle

public expect fun createEventA(lpeventattributes: ConstPtr<SecurityAttributes>, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle

public expect fun createEventExA(lpeventattributes: ConstPtr<SecurityAttributes>, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle

public expect fun createEventExW(lpeventattributes: ConstPtr<SecurityAttributes>, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle

public expect fun createEventW(lpeventattributes: ConstPtr<SecurityAttributes>, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle

public expect fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun createMutexA(lpmutexattributes: ConstPtr<SecurityAttributes>, binitialowner: Bool, lpname: Pcstr): Handle

public expect fun createMutexExA(lpmutexattributes: ConstPtr<SecurityAttributes>, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createMutexExW(lpmutexattributes: ConstPtr<SecurityAttributes>, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createMutexW(lpmutexattributes: ConstPtr<SecurityAttributes>, binitialowner: Bool, lpname: Pcwstr): Handle

public expect fun createPrivateNamespaceA(lpprivatenamespaceattributes: ConstPtr<SecurityAttributes>, lpboundarydescriptor: ConstPtr<CVoid>, lpaliasprefix: Pcstr): Handle

public expect fun createPrivateNamespaceW(lpprivatenamespaceattributes: ConstPtr<SecurityAttributes>, lpboundarydescriptor: ConstPtr<CVoid>, lpaliasprefix: Pcwstr): Handle

public expect fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr<SecurityAttributes>, lpthreadattributes: ConstPtr<SecurityAttributes>, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr<Startupinfoa>, lpprocessinformation: MutPtr<ProcessInformation>): Bool

public expect fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr<SecurityAttributes>, lpthreadattributes: ConstPtr<SecurityAttributes>, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr<Startupinfoa>, lpprocessinformation: MutPtr<ProcessInformation>): Bool

public expect fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr<SecurityAttributes>, lpthreadattributes: ConstPtr<SecurityAttributes>, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr<Startupinfow>, lpprocessinformation: MutPtr<ProcessInformation>): Bool

public expect fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr<SecurityAttributes>, lpthreadattributes: ConstPtr<SecurityAttributes>, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr<Startupinfow>, lpprocessinformation: MutPtr<ProcessInformation>): Bool

public expect fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr<Startupinfow>, lpprocessinformation: MutPtr<ProcessInformation>): Bool

public expect fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr<CVoid>, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr<Startupinfow>, lpprocessinformation: MutPtr<ProcessInformation>): Bool

public expect fun createRemoteThread(hprocess: Handle, lpthreadattributes: ConstPtr<SecurityAttributes>, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr<CVoid>, dwcreationflags: UInt, lpthreadid: MutPtr<UInt>): Handle

public expect fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: ConstPtr<SecurityAttributes>, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr<CVoid>, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: MutPtr<UInt>): Handle

public expect fun createSemaphoreA(lpsemaphoreattributes: ConstPtr<SecurityAttributes>, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle

public expect fun createSemaphoreExA(lpsemaphoreattributes: ConstPtr<SecurityAttributes>, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createSemaphoreExW(lpsemaphoreattributes: ConstPtr<SecurityAttributes>, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createSemaphoreW(lpsemaphoreattributes: ConstPtr<SecurityAttributes>, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle

public expect fun createThread(lpthreadattributes: ConstPtr<SecurityAttributes>, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr<CVoid>, dwcreationflags: ThreadCreationFlags, lpthreadid: MutPtr<UInt>): Handle

public expect fun createThreadpool(reserved: ConstPtr<CVoid>): PtpPool

public expect fun createThreadpoolCleanupGroup(): PtpCleanupGroup

public expect fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: MutPtr<CVoid>, pcbe: ConstPtr<TpCallbackEnvironV3>): PtpIo

public expect fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: MutPtr<CVoid>, pcbe: ConstPtr<TpCallbackEnvironV3>): PtpTimer

public expect fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: MutPtr<CVoid>, pcbe: ConstPtr<TpCallbackEnvironV3>): PtpWait

public expect fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: MutPtr<CVoid>, pcbe: ConstPtr<TpCallbackEnvironV3>): PtpWork

public expect fun createTimerQueue(): Handle

public expect fun createTimerQueueTimer(phnewtimer: MutPtr<Handle>, timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr<CVoid>, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool

public expect fun createUmsCompletionList(umscompletionlist: MutPtr<MutPtr<CVoid>>): Bool

public expect fun createUmsThreadContext(lpumsthread: MutPtr<MutPtr<CVoid>>): Bool

public expect fun createWaitableTimerA(lptimerattributes: ConstPtr<SecurityAttributes>, bmanualreset: Bool, lptimername: Pcstr): Handle

public expect fun createWaitableTimerExA(lptimerattributes: ConstPtr<SecurityAttributes>, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createWaitableTimerExW(lptimerattributes: ConstPtr<SecurityAttributes>, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createWaitableTimerW(lptimerattributes: ConstPtr<SecurityAttributes>, bmanualreset: Bool, lptimername: Pcwstr): Handle

public expect fun deleteBoundaryDescriptor(boundarydescriptor: Handle)

public expect fun deleteCriticalSection(lpcriticalsection: MutPtr<CriticalSection>)

public expect fun deleteFiber(lpfiber: ConstPtr<CVoid>)

public expect fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList)

public expect fun deleteSynchronizationBarrier(lpbarrier: MutPtr<SynchronizationBarrier>): Bool

public expect fun deleteTimerQueue(timerqueue: Handle): Bool

public expect fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool

public expect fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool

public expect fun deleteUmsCompletionList(umscompletionlist: ConstPtr<CVoid>): Bool

public expect fun deleteUmsThreadContext(umsthread: ConstPtr<CVoid>): Bool

public expect fun dequeueUmsCompletionListItems(umscompletionlist: ConstPtr<CVoid>, waittimeout: UInt, umsthreadlist: MutPtr<MutPtr<CVoid>>): Bool

public expect fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance)

public expect fun enterCriticalSection(lpcriticalsection: MutPtr<CriticalSection>)

public expect fun enterSynchronizationBarrier(lpbarrier: MutPtr<SynchronizationBarrier>, dwflags: UInt): Bool

public expect fun enterUmsSchedulingMode(schedulerstartupinfo: ConstPtr<UmsSchedulerStartupInfo>): Bool

public expect fun executeUmsThread(umsthread: MutPtr<CVoid>): Bool

public expect fun exitProcess(uexitcode: UInt): Nothing

public expect fun exitThread(dwexitcode: UInt): Nothing

public expect fun flsAlloc(lpcallback: PflsCallbackFunction): UInt

public expect fun flsFree(dwflsindex: UInt): Bool

public expect fun flsGetValue(dwflsindex: UInt): MutPtr<CVoid>

public expect fun flsSetValue(dwflsindex: UInt, lpflsdata: ConstPtr<CVoid>): Bool

public expect fun flushProcessWriteBuffers()

public expect fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule)

public expect fun getActiveProcessorCount(groupnumber: UShort): UInt

public expect fun getActiveProcessorGroupCount(): UShort

public expect fun getCurrentProcess(): Handle

public expect fun getCurrentProcessId(): UInt

public expect fun getCurrentProcessorNumber(): UInt

public expect fun getCurrentProcessorNumberEx(procnumber: MutPtr<ProcessorNumber>)

public expect fun getCurrentThread(): Handle

public expect fun getCurrentThreadId(): UInt

public expect fun getCurrentThreadStackLimits(lowlimit: MutPtr<ULong>, highlimit: MutPtr<ULong>)

public expect fun getCurrentUmsThread(): MutPtr<CVoid>

public expect fun getExitCodeProcess(hprocess: Handle, lpexitcode: MutPtr<UInt>): Bool

public expect fun getExitCodeThread(hthread: Handle, lpexitcode: MutPtr<UInt>): Bool

public expect fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt

public expect fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: MutPtr<MachineAttributes>): Hresult

public expect fun getMaximumProcessorCount(groupnumber: UShort): UInt

public expect fun getMaximumProcessorGroupCount(): UShort

public expect fun getNextUmsListItem(umscontext: MutPtr<CVoid>): MutPtr<CVoid>

public expect fun getNumaAvailableMemoryNode(node: UByte, availablebytes: MutPtr<ULong>): Bool

public expect fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: MutPtr<ULong>): Bool

public expect fun getNumaHighestNodeNumber(highestnodenumber: MutPtr<UInt>): Bool

public expect fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: MutPtr<UShort>): Bool

public expect fun getNumaNodeProcessorMask(node: UByte, processormask: MutPtr<ULong>): Bool

public expect fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: MutPtr<GroupAffinity>, processormaskcount: UShort, requiredmaskcount: MutPtr<UShort>): Bool

public expect fun getNumaNodeProcessorMaskEx(node: UShort, processormask: MutPtr<GroupAffinity>): Bool

public expect fun getNumaProcessorNode(processor: UByte, nodenumber: MutPtr<UByte>): Bool

public expect fun getNumaProcessorNodeEx(processor: ConstPtr<ProcessorNumber>, nodenumber: MutPtr<UShort>): Bool

public expect fun getNumaProximityNode(proximityid: UInt, nodenumber: MutPtr<UByte>): Bool

public expect fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: MutPtr<UShort>): Bool

public expect fun getPriorityClass(hprocess: Handle): UInt

public expect fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: MutPtr<ULong>, lpsystemaffinitymask: MutPtr<ULong>): Bool

public expect fun getProcessDEPPolicy(hprocess: Handle, lpflags: MutPtr<UInt>, lppermanent: MutPtr<Bool>): Bool

public expect fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: MutPtr<GroupAffinity>, cpusetmaskcount: UShort, requiredmaskcount: MutPtr<UShort>): Bool

public expect fun getProcessDefaultCpuSets(process: Handle, cpusetids: MutPtr<UInt>, cpusetidcount: UInt, requiredidcount: MutPtr<UInt>): Bool

public expect fun getProcessGroupAffinity(hprocess: Handle, groupcount: MutPtr<UShort>, grouparray: MutPtr<UShort>): Bool

public expect fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: MutPtr<UInt>): Bool

public expect fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle

public expect fun getProcessId(process: Handle): UInt

public expect fun getProcessIdOfThread(thread: Handle): UInt

public expect fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: MutPtr<CVoid>, processinformationsize: UInt): Bool

public expect fun getProcessIoCounters(hprocess: Handle, lpiocounters: MutPtr<IoCounters>): Bool

public expect fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: MutPtr<CVoid>, dwlength: ULong): Bool

public expect fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: MutPtr<Bool>): Bool

public expect fun getProcessShutdownParameters(lpdwlevel: MutPtr<UInt>, lpdwflags: MutPtr<UInt>): Bool

public expect fun getProcessTimes(hprocess: Handle, lpcreationtime: MutPtr<Filetime>, lpexittime: MutPtr<Filetime>, lpkerneltime: MutPtr<Filetime>, lpusertime: MutPtr<Filetime>): Bool

public expect fun getProcessVersion(processid: UInt): UInt

public expect fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: MutPtr<ULong>, lpmaximumworkingsetsize: MutPtr<ULong>): Bool

public expect fun getStartupInfoA(lpstartupinfo: MutPtr<Startupinfoa>)

public expect fun getStartupInfoW(lpstartupinfo: MutPtr<Startupinfow>)

public expect fun getSystemTimes(lpidletime: MutPtr<Filetime>, lpkerneltime: MutPtr<Filetime>, lpusertime: MutPtr<Filetime>): Bool

public expect fun getThreadDescription(hthread: Handle, ppszthreaddescription: MutPtr<Pwstr>): Hresult

public expect fun getThreadGroupAffinity(hthread: Handle, groupaffinity: MutPtr<GroupAffinity>): Bool

public expect fun getThreadIOPendingFlag(hthread: Handle, lpioispending: MutPtr<Bool>): Bool

public expect fun getThreadId(thread: Handle): UInt

public expect fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: MutPtr<ProcessorNumber>): Bool

public expect fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: MutPtr<CVoid>, threadinformationsize: UInt): Bool

public expect fun getThreadPriority(hthread: Handle): Int

public expect fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: MutPtr<Bool>): Bool

public expect fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: MutPtr<GroupAffinity>, cpusetmaskcount: UShort, requiredmaskcount: MutPtr<UShort>): Bool

public expect fun getThreadSelectedCpuSets(thread: Handle, cpusetids: MutPtr<UInt>, cpusetidcount: UInt, requiredidcount: MutPtr<UInt>): Bool

public expect fun getThreadTimes(hthread: Handle, lpcreationtime: MutPtr<Filetime>, lpexittime: MutPtr<Filetime>, lpkerneltime: MutPtr<Filetime>, lpusertime: MutPtr<Filetime>): Bool

public expect fun getUmsCompletionListEvent(umscompletionlist: ConstPtr<CVoid>, umscompletionevent: MutPtr<Handle>): Bool

public expect fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: MutPtr<UmsSystemThreadInformation>): Bool

public expect fun initOnceBeginInitialize(lpinitonce: MutPtr<InitOnce>, dwflags: UInt, fpending: MutPtr<Bool>, lpcontext: MutPtr<MutPtr<CVoid>>): Bool

public expect fun initOnceComplete(lpinitonce: MutPtr<InitOnce>, dwflags: UInt, lpcontext: ConstPtr<CVoid>): Bool

public expect fun initOnceExecuteOnce(initonce: MutPtr<InitOnce>, initfn: PinitOnceFn, parameter: MutPtr<CVoid>, context: MutPtr<MutPtr<CVoid>>): Bool

public expect fun initOnceInitialize(initonce: MutPtr<InitOnce>)

public expect fun initializeConditionVariable(conditionvariable: MutPtr<ConditionVariable>)

public expect fun initializeCriticalSection(lpcriticalsection: MutPtr<CriticalSection>)

public expect fun initializeCriticalSectionAndSpinCount(lpcriticalsection: MutPtr<CriticalSection>, dwspincount: UInt): Bool

public expect fun initializeCriticalSectionEx(lpcriticalsection: MutPtr<CriticalSection>, dwspincount: UInt, flags: UInt): Bool

public expect fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: MutPtr<ULong>): Bool

public expect fun initializeSListHead(listhead: MutPtr<SlistHeader>)

public expect fun initializeSRWLock(srwlock: MutPtr<Srwlock>)

public expect fun initializeSynchronizationBarrier(lpbarrier: MutPtr<SynchronizationBarrier>, ltotalthreads: Int, lspincount: Int): Bool

public expect fun interlockedFlushSList(listhead: MutPtr<SlistHeader>): MutPtr<SlistEntry>

public expect fun interlockedPopEntrySList(listhead: MutPtr<SlistHeader>): MutPtr<SlistEntry>

public expect fun interlockedPushEntrySList(listhead: MutPtr<SlistHeader>, listentry: MutPtr<SlistEntry>): MutPtr<SlistEntry>

public expect fun interlockedPushListSListEx(listhead: MutPtr<SlistHeader>, list: MutPtr<SlistEntry>, listend: MutPtr<SlistEntry>, count: UInt): MutPtr<SlistEntry>

public expect fun isImmersiveProcess(hprocess: Handle): Bool

public expect fun isProcessCritical(hprocess: Handle, critical: MutPtr<Bool>): Bool

public expect fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool

public expect fun isThreadAFiber(): Bool

public expect fun isThreadpoolTimerSet(pti: PtpTimer): Bool

public expect fun isWow64Process(hprocess: Handle, wow64process: MutPtr<Bool>): Bool

public expect fun isWow64Process2(hprocess: Handle, pprocessmachine: MutPtr<ImageFileMachine>, pnativemachine: MutPtr<ImageFileMachine>): Bool

public expect fun leaveCriticalSection(lpcriticalsection: MutPtr<CriticalSection>)

public expect fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: MutPtr<CriticalSection>)

public expect fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle

public expect fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun openPrivateNamespaceA(lpboundarydescriptor: ConstPtr<CVoid>, lpaliasprefix: Pcstr): Handle

public expect fun openPrivateNamespaceW(lpboundarydescriptor: ConstPtr<CVoid>, lpaliasprefix: Pcwstr): Handle

public expect fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle

public expect fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: MutPtr<Handle>): Bool

public expect fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle

public expect fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: MutPtr<Handle>): Bool

public expect fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle

public expect fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle

public expect fun pulseEvent(hevent: Handle): Bool

public expect fun queryDepthSList(listhead: ConstPtr<SlistHeader>): UShort

public expect fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: MutPtr<UInt>): Bool

public expect fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: MutPtr<UInt>): Bool

public expect fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: MutPtr<ProcessAffinityAutoUpdateFlags>): Bool

public expect fun queryProtectedPolicy(policyguid: ConstPtr<Guid>, policyvalue: MutPtr<ULong>): Bool

public expect fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: MutPtr<TpPoolStackInformation>): Bool

public expect fun queryUmsThreadInformation(umsthread: ConstPtr<CVoid>, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: MutPtr<CVoid>, umsthreadinformationlength: UInt, returnlength: MutPtr<UInt>): Bool

public expect fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt

public expect fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool

public expect fun queueUserWorkItem(function: LpthreadStartRoutine, context: ConstPtr<CVoid>, flags: WorkerThreadFlags): Bool

public expect fun registerWaitForSingleObject(phnewwaitobject: MutPtr<Handle>, hobject: Handle, callback: Waitortimercallback, context: ConstPtr<CVoid>, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool

public expect fun releaseMutex(hmutex: Handle): Bool

public expect fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle)

public expect fun releaseSRWLockExclusive(srwlock: MutPtr<Srwlock>)

public expect fun releaseSRWLockShared(srwlock: MutPtr<Srwlock>)

public expect fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: MutPtr<Int>): Bool

public expect fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt)

public expect fun resetEvent(hevent: Handle): Bool

public expect fun resumeThread(hthread: Handle): UInt

public expect fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: MutPtr<CVoid>, key: MutPtr<UInt>): Hresult

public expect fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: MutPtr<UInt>): Hresult

public expect fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: MutPtr<UInt>): Hresult

public expect fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: MutPtr<CVoid>, donestate: MutPtr<CVoid>): Hresult

public expect fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: MutPtr<CVoid>, donestate: MutPtr<CVoid>): Hresult

public expect fun rtwqCancelDeadline(prequest: Handle): Hresult

public expect fun rtwqCancelWorkItem(key: ULong): Hresult

public expect fun rtwqCreateAsyncResult(appobject: MutPtr<CVoid>, callback: MutPtr<CVoid>, appstate: MutPtr<CVoid>, asyncresult: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun rtwqEndRegisterWorkQueueWithMMCSS(result: MutPtr<CVoid>, taskid: MutPtr<UInt>): Hresult

public expect fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: MutPtr<UInt>): Hresult

public expect fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: MutPtr<Int>): Hresult

public expect fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: MutPtr<UInt>): Hresult

public expect fun rtwqInvokeCallback(result: MutPtr<CVoid>): Hresult

public expect fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: MutPtr<Handle>): Hresult

public expect fun rtwqLockPlatform(): Hresult

public expect fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: MutPtr<UInt>, id: MutPtr<UInt>): Hresult

public expect fun rtwqLockWorkQueue(workqueueid: UInt): Hresult

public expect fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: MutPtr<CVoid>, key: MutPtr<ULong>): Hresult

public expect fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: MutPtr<CVoid>): Hresult

public expect fun rtwqRegisterPlatformEvents(platformevents: MutPtr<CVoid>): Hresult

public expect fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: MutPtr<UInt>, lpriority: Int): Hresult

public expect fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult

public expect fun rtwqScheduleWorkItem(result: MutPtr<CVoid>, timeout: Long, key: MutPtr<ULong>): Hresult

public expect fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: MutPtr<Handle>): Hresult

public expect fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: MutPtr<Handle>): Hresult

public expect fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult

public expect fun rtwqShutdown(): Hresult

public expect fun rtwqStartup(): Hresult

public expect fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult

public expect fun rtwqUnlockPlatform(): Hresult

public expect fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult

public expect fun rtwqUnregisterPlatformEvents(platformevents: MutPtr<CVoid>): Hresult

public expect fun rtwqUnregisterPlatformFromMMCSS(): Hresult

public expect fun setCriticalSectionSpinCount(lpcriticalsection: MutPtr<CriticalSection>, dwspincount: UInt): UInt

public expect fun setEvent(hevent: Handle): Bool

public expect fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle)

public expect fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool

public expect fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool

public expect fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool

public expect fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool

public expect fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: ConstPtr<GroupAffinity>, cpusetmaskcount: UShort): Bool

public expect fun setProcessDefaultCpuSets(process: Handle, cpusetids: ConstPtr<UInt>, cpusetidcount: UInt): Bool

public expect fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: MutPtr<ProcessDynamicEhContinuationTarget>): Bool

public expect fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: MutPtr<ProcessDynamicEnforcedAddressRange>): Bool

public expect fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: ConstPtr<CVoid>, processinformationsize: UInt): Bool

public expect fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: ConstPtr<CVoid>, dwlength: ULong): Bool

public expect fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool

public expect fun setProcessRestrictionExemption(fenableexemption: Bool): Bool

public expect fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool

public expect fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool

public expect fun setProtectedPolicy(policyguid: ConstPtr<Guid>, policyvalue: ULong, oldpolicyvalue: MutPtr<ULong>): Bool

public expect fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong

public expect fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult

public expect fun setThreadGroupAffinity(hthread: Handle, groupaffinity: ConstPtr<GroupAffinity>, previousgroupaffinity: MutPtr<GroupAffinity>): Bool

public expect fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt

public expect fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: ConstPtr<ProcessorNumber>, lppreviousidealprocessor: MutPtr<ProcessorNumber>): Bool

public expect fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: ConstPtr<CVoid>, threadinformationsize: UInt): Bool

public expect fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool

public expect fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool

public expect fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: ConstPtr<GroupAffinity>, cpusetmaskcount: UShort): Bool

public expect fun setThreadSelectedCpuSets(thread: Handle, cpusetids: ConstPtr<UInt>, cpusetidcount: UInt): Bool

public expect fun setThreadStackGuarantee(stacksizeinbytes: MutPtr<UInt>): Bool

public expect fun setThreadToken(thread: ConstPtr<Handle>, token: Handle): Bool

public expect fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: ConstPtr<TpPoolStackInformation>): Bool

public expect fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt)

public expect fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool

public expect fun setThreadpoolTimer(pti: PtpTimer, pftduetime: ConstPtr<Filetime>, msperiod: UInt, mswindowlength: UInt)

public expect fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: ConstPtr<Filetime>, msperiod: UInt, mswindowlength: UInt): Bool

public expect fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr<Filetime>)

public expect fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr<Filetime>, reserved: ConstPtr<CVoid>): Bool

public expect fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr<CVoid>, duetime: UInt, period: UInt, preferio: Bool): Handle

public expect fun setUmsThreadInformation(umsthread: ConstPtr<CVoid>, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: ConstPtr<CVoid>, umsthreadinformationlength: UInt): Bool

public expect fun setWaitableTimer(htimer: Handle, lpduetime: ConstPtr<Long>, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr<CVoid>, fresume: Bool): Bool

public expect fun setWaitableTimerEx(htimer: Handle, lpduetime: ConstPtr<Long>, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr<CVoid>, wakecontext: ConstPtr<ReasonContext>, tolerabledelay: UInt): Bool

public expect fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent

public expect fun sleep(dwmilliseconds: UInt)

public expect fun sleepConditionVariableCS(conditionvariable: MutPtr<ConditionVariable>, criticalsection: MutPtr<CriticalSection>, dwmilliseconds: UInt): Bool

public expect fun sleepConditionVariableSRW(conditionvariable: MutPtr<ConditionVariable>, srwlock: MutPtr<Srwlock>, dwmilliseconds: UInt, flags: UInt): Bool

public expect fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt

public expect fun startThreadpoolIo(pio: PtpIo)

public expect fun submitThreadpoolWork(pwk: PtpWork)

public expect fun suspendThread(hthread: Handle): UInt

public expect fun switchToFiber(lpfiber: ConstPtr<CVoid>)

public expect fun switchToThread(): Bool

public expect fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool

public expect fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool

public expect fun tlsAlloc(): UInt

public expect fun tlsFree(dwtlsindex: UInt): Bool

public expect fun tlsGetValue(dwtlsindex: UInt): MutPtr<CVoid>

public expect fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: ConstPtr<CVoid>): Bool

public expect fun tryAcquireSRWLockExclusive(srwlock: MutPtr<Srwlock>): Boolean

public expect fun tryAcquireSRWLockShared(srwlock: MutPtr<Srwlock>): Boolean

public expect fun tryEnterCriticalSection(lpcriticalsection: MutPtr<CriticalSection>): Bool

public expect fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: MutPtr<CVoid>, pcbe: ConstPtr<TpCallbackEnvironV3>): Bool

public expect fun umsThreadYield(schedulerparam: ConstPtr<CVoid>): Bool

public expect fun unregisterWait(waithandle: Handle): Bool

public expect fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool

public expect fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: ConstPtr<CVoid>, cbsize: ULong, lppreviousvalue: MutPtr<CVoid>, lpreturnsize: ConstPtr<ULong>): Bool

public expect fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt

public expect fun waitForMultipleObjects(ncount: UInt, lphandles: ConstPtr<Handle>, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent

public expect fun waitForMultipleObjectsEx(ncount: UInt, lphandles: ConstPtr<Handle>, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent

public expect fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent

public expect fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent

public expect fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool)

public expect fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool)

public expect fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool)

public expect fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool)

public expect fun waitOnAddress(address: ConstPtr<CVoid>, compareaddress: ConstPtr<CVoid>, addresssize: ULong, dwmilliseconds: UInt): Bool

public expect fun wakeAllConditionVariable(conditionvariable: MutPtr<ConditionVariable>)

public expect fun wakeByAddressAll(address: ConstPtr<CVoid>)

public expect fun wakeByAddressSingle(address: ConstPtr<CVoid>)

public expect fun wakeConditionVariable(conditionvariable: MutPtr<ConditionVariable>)

public expect fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt

public expect fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort

public expect fun wow64SuspendThread(hthread: Handle): UInt
