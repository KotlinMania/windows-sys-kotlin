package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.CmResourceList
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

public expect fun ndisAcquireReadWriteLock(lock: MutPtr<NdisRwLock>, fwrite: Boolean, lockstate: MutPtr<LockState>)

public expect fun ndisAllocateMemoryWithTag(virtualaddress: MutPtr<MutPtr<CVoid>>, length: UInt, tag: UInt): Int

public expect fun ndisCancelTimer(timer: ConstPtr<NdisTimer>, timercancelled: MutPtr<Boolean>)

public expect fun ndisClAddParty(ndisvchandle: ConstPtr<CVoid>, protocolpartycontext: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>, ndispartyhandle: MutPtr<MutPtr<CVoid>>): Int

public expect fun ndisClCloseAddressFamily(ndisafhandle: ConstPtr<CVoid>): Int

public expect fun ndisClCloseCall(ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt): Int

public expect fun ndisClDeregisterSap(ndissaphandle: ConstPtr<CVoid>): Int

public expect fun ndisClDropParty(ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt): Int

public expect fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: MutPtr<MutPtr<CVoid>>): Int

public expect fun ndisClIncomingCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>)

public expect fun ndisClMakeCall(ndisvchandle: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>, protocolpartycontext: ConstPtr<CVoid>, ndispartyhandle: MutPtr<MutPtr<CVoid>>): Int

public expect fun ndisClModifyCallQoS(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int

public expect fun ndisClRegisterSap(ndisafhandle: ConstPtr<CVoid>, protocolsapcontext: ConstPtr<CVoid>, sap: ConstPtr<CoSap>, ndissaphandle: MutPtr<MutPtr<CVoid>>): Int

public expect fun ndisCloseConfiguration(configurationhandle: ConstPtr<CVoid>)

public expect fun ndisCloseFile(filehandle: ConstPtr<CVoid>)

public expect fun ndisCmActivateVc(ndisvchandle: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>): Int

public expect fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: ConstPtr<CVoid>, callmgrpartycontext: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>)

public expect fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr<CVoid>)

public expect fun ndisCmCloseCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>)

public expect fun ndisCmDeactivateVc(ndisvchandle: ConstPtr<CVoid>): Int

public expect fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: ConstPtr<CVoid>)

public expect fun ndisCmDispatchCallConnected(ndisvchandle: ConstPtr<CVoid>)

public expect fun ndisCmDispatchIncomingCall(ndissaphandle: ConstPtr<CVoid>, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int

public expect fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>)

public expect fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt)

public expect fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt)

public expect fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: ConstPtr<CVoid>)

public expect fun ndisCmMakeCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>, callmgrpartycontext: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>)

public expect fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>)

public expect fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr<CVoid>, callmgrafcontext: ConstPtr<CVoid>)

public expect fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: ConstPtr<CVoid>, callmgrsapcontext: ConstPtr<CVoid>)

public expect fun ndisCoAssignInstanceName(ndisvchandle: ConstPtr<CVoid>, baseinstancename: ConstPtr<UnicodeString>, vcinstancename: MutPtr<UnicodeString>): Int

public expect fun ndisCoCreateVc(ndisbindinghandle: ConstPtr<CVoid>, ndisafhandle: ConstPtr<CVoid>, protocolvccontext: ConstPtr<CVoid>, ndisvchandle: MutPtr<MutPtr<CVoid>>): Int

public expect fun ndisCoDeleteVc(ndisvchandle: ConstPtr<CVoid>): Int

public expect fun ndisCoGetTapiCallId(ndisvchandle: ConstPtr<CVoid>, tapicallid: MutPtr<VarString>): Int

public expect fun ndisCompleteDmaTransfer(status: MutPtr<Int>, ndisdmahandle: MutPtr<CVoid>, buffer: MutPtr<Mdl>, offset: UInt, length: UInt, writetodevice: Boolean)

public expect fun ndisCopyBuffer(status: MutPtr<Int>, buffer: MutPtr<MutPtr<Mdl>>, poolhandle: ConstPtr<CVoid>, memorydescriptor: ConstPtr<CVoid>, offset: UInt, length: UInt)

public expect fun ndisDeregisterTdiCallBack()

public expect fun ndisFreeMemory(virtualaddress: ConstPtr<CVoid>, length: UInt, memoryflags: UInt)

public expect fun ndisGeneratePartialCancelId(): UByte

public expect fun ndisGetCurrentProcessorCounts(pidlecount: MutPtr<UInt>, pkernelanduser: MutPtr<UInt>, pindex: MutPtr<UInt>)

public expect fun ndisGetCurrentProcessorCpuUsage(pcpuusage: MutPtr<UInt>)

public expect fun ndisGetRoutineAddress(ndisroutinename: ConstPtr<UnicodeString>): MutPtr<CVoid>

public expect fun ndisGetSharedDataAlignment(): UInt

public expect fun ndisGetVersion(): UInt

public expect fun ndisIMAssociateMiniport(driverhandle: ConstPtr<CVoid>, protocolhandle: ConstPtr<CVoid>)

public expect fun ndisIMCancelInitializeDeviceInstance(driverhandle: ConstPtr<CVoid>, deviceinstance: ConstPtr<UnicodeString>): Int

public expect fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: ConstPtr<CVoid>): Int

public expect fun ndisIMGetBindingContext(ndisbindinghandle: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun ndisIMInitializeDeviceInstanceEx(driverhandle: ConstPtr<CVoid>, driverinstance: ConstPtr<UnicodeString>, devicecontext: ConstPtr<CVoid>): Int

public expect fun ndisInitializeEvent(event: MutPtr<NdisEvent>)

public expect fun ndisInitializeReadWriteLock(lock: MutPtr<NdisRwLock>)

public expect fun ndisInitializeString(destination: MutPtr<UnicodeString>, source: ConstPtr<UByte>)

public expect fun ndisInitializeTimer(timer: MutPtr<NdisTimer>, timerfunction: PndisTimerFunction, functioncontext: ConstPtr<CVoid>)

public expect fun ndisMAllocateSharedMemory(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, virtualaddress: MutPtr<MutPtr<CVoid>>, physicaladdress: MutPtr<Long>)

public expect fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, context: ConstPtr<CVoid>): Int

public expect fun ndisMCancelTimer(timer: ConstPtr<NdisMiniportTimer>, timercancelled: MutPtr<Boolean>)

public expect fun ndisMCloseLog(loghandle: ConstPtr<CVoid>)

public expect fun ndisMCmActivateVc(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int

public expect fun ndisMCmCreateVc(miniportadapterhandle: ConstPtr<CVoid>, ndisafhandle: ConstPtr<CVoid>, miniportvccontext: ConstPtr<CVoid>, ndisvchandle: MutPtr<MutPtr<CVoid>>): Int

public expect fun ndisMCmDeactivateVc(ndisvchandle: ConstPtr<CVoid>): Int

public expect fun ndisMCmDeleteVc(ndisvchandle: ConstPtr<CVoid>): Int

public expect fun ndisMCmRegisterAddressFamily(miniportadapterhandle: MutPtr<CVoid>, addressfamily: MutPtr<CoAddressFamily>, cmcharacteristics: MutPtr<NdisCallManagerCharacteristics>, sizeofcmcharacteristics: UInt): Int

public expect fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>)

public expect fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: ConstPtr<CVoid>)

public expect fun ndisMCreateLog(miniportadapterhandle: ConstPtr<CVoid>, size: UInt, loghandle: MutPtr<MutPtr<CVoid>>): Int

public expect fun ndisMDeregisterDmaChannel(miniportdmahandle: ConstPtr<CVoid>)

public expect fun ndisMDeregisterIoPortRange(miniportadapterhandle: ConstPtr<CVoid>, initialport: UInt, numberofports: UInt, portoffset: ConstPtr<CVoid>)

public expect fun ndisMFlushLog(loghandle: ConstPtr<CVoid>)

public expect fun ndisMFreeSharedMemory(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, virtualaddress: ConstPtr<CVoid>, physicaladdress: Long)

public expect fun ndisMGetDeviceProperty(miniportadapterhandle: ConstPtr<CVoid>, physicaldeviceobject: MutPtr<MutPtr<DeviceObject>>, functionaldeviceobject: MutPtr<MutPtr<DeviceObject>>, nextdeviceobject: MutPtr<MutPtr<DeviceObject>>, allocatedresources: MutPtr<MutPtr<CmResourceList>>, allocatedresourcestranslated: MutPtr<MutPtr<CmResourceList>>)

public expect fun ndisMGetDmaAlignment(miniportadapterhandle: ConstPtr<CVoid>): UInt

public expect fun ndisMInitializeTimer(timer: ConstPtr<NdisMiniportTimer>, miniportadapterhandle: ConstPtr<CVoid>, timerfunction: PndisTimerFunction, functioncontext: ConstPtr<CVoid>)

public expect fun ndisMMapIoSpace(virtualaddress: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, physicaladdress: Long, length: UInt): Int

public expect fun ndisMQueryAdapterInstanceName(padapterinstancename: MutPtr<UnicodeString>, miniporthandle: ConstPtr<CVoid>): Int

public expect fun ndisMReadDmaCounter(miniportdmahandle: ConstPtr<CVoid>): UInt

public expect fun ndisMRegisterDmaChannel(miniportdmahandle: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: ConstPtr<NdisDmaDescription>, maximumlength: UInt): Int

public expect fun ndisMRegisterIoPortRange(portoffset: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, initialport: UInt, numberofports: UInt): Int

public expect fun ndisMRemoveMiniport(miniporthandle: ConstPtr<CVoid>): Int

public expect fun ndisMSetPeriodicTimer(timer: ConstPtr<NdisMiniportTimer>, millisecondperiod: UInt)

public expect fun ndisMSleep(microsecondstosleep: UInt)

public expect fun ndisMUnmapIoSpace(miniportadapterhandle: ConstPtr<CVoid>, virtualaddress: ConstPtr<CVoid>, length: UInt)

public expect fun ndisMWriteLogData(loghandle: ConstPtr<CVoid>, logbuffer: ConstPtr<CVoid>, logbuffersize: UInt): Int

public expect fun ndisMapFile(status: MutPtr<Int>, mappedbuffer: MutPtr<MutPtr<CVoid>>, filehandle: ConstPtr<CVoid>)

public expect fun ndisOpenConfigurationKeyByIndex(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, index: UInt, keyname: MutPtr<UnicodeString>, keyhandle: MutPtr<MutPtr<CVoid>>)

public expect fun ndisOpenConfigurationKeyByName(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, subkeyname: ConstPtr<UnicodeString>, subkeyhandle: MutPtr<MutPtr<CVoid>>)

public expect fun ndisOpenFile(status: MutPtr<Int>, filehandle: MutPtr<MutPtr<CVoid>>, filelength: MutPtr<UInt>, filename: ConstPtr<UnicodeString>, highestacceptableaddress: Long)

public expect fun ndisQueryAdapterInstanceName(padapterinstancename: MutPtr<UnicodeString>, ndisbindinghandle: ConstPtr<CVoid>): Int

public expect fun ndisQueryBindInstanceName(padapterinstancename: MutPtr<UnicodeString>, bindingcontext: ConstPtr<CVoid>): Int

public expect fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: ConstPtr<CVoid>)

public expect fun ndisReadConfiguration(status: MutPtr<Int>, parametervalue: MutPtr<MutPtr<NdisConfigurationParameter>>, configurationhandle: ConstPtr<CVoid>, keyword: ConstPtr<UnicodeString>, parametertype: NdisParameterType)

public expect fun ndisReadNetworkAddress(status: MutPtr<Int>, networkaddress: MutPtr<MutPtr<CVoid>>, networkaddresslength: MutPtr<UInt>, configurationhandle: ConstPtr<CVoid>)

public expect fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler)

public expect fun ndisReleaseReadWriteLock(lock: MutPtr<NdisRwLock>, lockstate: ConstPtr<LockState>)

public expect fun ndisResetEvent(event: ConstPtr<NdisEvent>)

public expect fun ndisSetEvent(event: ConstPtr<NdisEvent>)

public expect fun ndisSetPeriodicTimer(ndistimer: ConstPtr<NdisTimer>, millisecondsperiod: UInt)

public expect fun ndisSetTimer(timer: ConstPtr<NdisTimer>, millisecondstodelay: UInt)

public expect fun ndisSetTimerEx(ndistimer: ConstPtr<NdisTimer>, millisecondstodelay: UInt, functioncontext: ConstPtr<CVoid>)

public expect fun ndisSetupDmaTransfer(status: MutPtr<Int>, ndisdmahandle: MutPtr<CVoid>, buffer: MutPtr<Mdl>, offset: UInt, length: UInt, writetodevice: Boolean)

public expect fun ndisSystemProcessorCount(): Byte

public expect fun ndisUnmapFile(filehandle: ConstPtr<CVoid>)

public expect fun ndisUpdateSharedMemory(ndisadapterhandle: MutPtr<CVoid>, length: UInt, virtualaddress: MutPtr<CVoid>, physicaladdress: Long)

public expect fun ndisWaitEvent(event: ConstPtr<NdisEvent>, mstowait: UInt): Boolean

public expect fun ndisWriteConfiguration(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, keyword: ConstPtr<UnicodeString>, parametervalue: ConstPtr<NdisConfigurationParameter>)

public expect fun ndisWriteErrorLogEntry(ndisadapterhandle: ConstPtr<CVoid>, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long)

public expect fun ndisWriteEventLogEntry(loghandle: ConstPtr<CVoid>, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: ConstPtr<CVoid>, datasize: UInt, data: ConstPtr<CVoid>): Int
