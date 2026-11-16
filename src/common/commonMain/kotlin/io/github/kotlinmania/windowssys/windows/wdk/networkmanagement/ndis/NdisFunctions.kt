package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

public expect fun ndisAcquireReadWriteLock(lock: MutPtr, fwrite: Boolean, lockstate: MutPtr)

public expect fun ndisAllocateMemoryWithTag(virtualaddress: MutPtr, length: UInt, tag: UInt): Int

public expect fun ndisCancelTimer(timer: ConstPtr, timercancelled: MutPtr)

public expect fun ndisClAddParty(ndisvchandle: ConstPtr, protocolpartycontext: ConstPtr, callparameters: MutPtr, ndispartyhandle: MutPtr): Int

public expect fun ndisClCloseAddressFamily(ndisafhandle: ConstPtr): Int

public expect fun ndisClCloseCall(ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int

public expect fun ndisClDeregisterSap(ndissaphandle: ConstPtr): Int

public expect fun ndisClDropParty(ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int

public expect fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: MutPtr): Int

public expect fun ndisClIncomingCallComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr)

public expect fun ndisClMakeCall(ndisvchandle: ConstPtr, callparameters: MutPtr, protocolpartycontext: ConstPtr, ndispartyhandle: MutPtr): Int

public expect fun ndisClModifyCallQoS(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int

public expect fun ndisClRegisterSap(ndisafhandle: ConstPtr, protocolsapcontext: ConstPtr, sap: ConstPtr, ndissaphandle: MutPtr): Int

public expect fun ndisCloseConfiguration(configurationhandle: ConstPtr)

public expect fun ndisCloseFile(filehandle: ConstPtr)

public expect fun ndisCmActivateVc(ndisvchandle: ConstPtr, callparameters: MutPtr): Int

public expect fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr)

public expect fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr)

public expect fun ndisCmCloseCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr)

public expect fun ndisCmDeactivateVc(ndisvchandle: ConstPtr): Int

public expect fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: ConstPtr)

public expect fun ndisCmDispatchCallConnected(ndisvchandle: ConstPtr)

public expect fun ndisCmDispatchIncomingCall(ndissaphandle: ConstPtr, ndisvchandle: ConstPtr, callparameters: ConstPtr): Int

public expect fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: ConstPtr, callparameters: ConstPtr)

public expect fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: ConstPtr, buffer: ConstPtr, size: UInt)

public expect fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt)

public expect fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: ConstPtr)

public expect fun ndisCmMakeCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr)

public expect fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr)

public expect fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr, callmgrafcontext: ConstPtr)

public expect fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: ConstPtr, callmgrsapcontext: ConstPtr)

public expect fun ndisCoAssignInstanceName(ndisvchandle: ConstPtr, baseinstancename: ConstPtr, vcinstancename: MutPtr): Int

public expect fun ndisCoCreateVc(ndisbindinghandle: ConstPtr, ndisafhandle: ConstPtr, protocolvccontext: ConstPtr, ndisvchandle: MutPtr): Int

public expect fun ndisCoDeleteVc(ndisvchandle: ConstPtr): Int

public expect fun ndisCoGetTapiCallId(ndisvchandle: ConstPtr, tapicallid: MutPtr): Int

public expect fun ndisCompleteDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean)

public expect fun ndisCopyBuffer(status: MutPtr, buffer: MutPtr, poolhandle: ConstPtr, memorydescriptor: ConstPtr, offset: UInt, length: UInt)

public expect fun ndisDeregisterTdiCallBack()

public expect fun ndisFreeMemory(virtualaddress: ConstPtr, length: UInt, memoryflags: UInt)

public expect fun ndisGeneratePartialCancelId(): UByte

public expect fun ndisGetCurrentProcessorCounts(pidlecount: MutPtr, pkernelanduser: MutPtr, pindex: MutPtr)

public expect fun ndisGetCurrentProcessorCpuUsage(pcpuusage: MutPtr)

public expect fun ndisGetRoutineAddress(ndisroutinename: ConstPtr): MutPtr

public expect fun ndisGetSharedDataAlignment(): UInt

public expect fun ndisGetVersion(): UInt

public expect fun ndisIMAssociateMiniport(driverhandle: ConstPtr, protocolhandle: ConstPtr)

public expect fun ndisIMCancelInitializeDeviceInstance(driverhandle: ConstPtr, deviceinstance: ConstPtr): Int

public expect fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: ConstPtr): Int

public expect fun ndisIMGetBindingContext(ndisbindinghandle: ConstPtr): MutPtr

public expect fun ndisIMInitializeDeviceInstanceEx(driverhandle: ConstPtr, driverinstance: ConstPtr, devicecontext: ConstPtr): Int

public expect fun ndisInitializeEvent(event: MutPtr)

public expect fun ndisInitializeReadWriteLock(lock: MutPtr)

public expect fun ndisInitializeString(destination: MutPtr, source: ConstPtr)

public expect fun ndisInitializeTimer(timer: MutPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr)

public expect fun ndisMAllocateSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: MutPtr, physicaladdress: MutPtr)

public expect fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, context: ConstPtr): Int

public expect fun ndisMCancelTimer(timer: ConstPtr, timercancelled: MutPtr)

public expect fun ndisMCloseLog(loghandle: ConstPtr)

public expect fun ndisMCmActivateVc(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int

public expect fun ndisMCmCreateVc(miniportadapterhandle: ConstPtr, ndisafhandle: ConstPtr, miniportvccontext: ConstPtr, ndisvchandle: MutPtr): Int

public expect fun ndisMCmDeactivateVc(ndisvchandle: ConstPtr): Int

public expect fun ndisMCmDeleteVc(ndisvchandle: ConstPtr): Int

public expect fun ndisMCmRegisterAddressFamily(miniportadapterhandle: MutPtr, addressfamily: MutPtr, cmcharacteristics: MutPtr, sizeofcmcharacteristics: UInt): Int

public expect fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr)

public expect fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: ConstPtr)

public expect fun ndisMCreateLog(miniportadapterhandle: ConstPtr, size: UInt, loghandle: MutPtr): Int

public expect fun ndisMDeregisterDmaChannel(miniportdmahandle: ConstPtr)

public expect fun ndisMDeregisterIoPortRange(miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt, portoffset: ConstPtr)

public expect fun ndisMFlushLog(loghandle: ConstPtr)

public expect fun ndisMFreeSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: ConstPtr, physicaladdress: Long)

public expect fun ndisMGetDeviceProperty(miniportadapterhandle: ConstPtr, physicaldeviceobject: MutPtr, functionaldeviceobject: MutPtr, nextdeviceobject: MutPtr, allocatedresources: MutPtr, allocatedresourcestranslated: MutPtr)

public expect fun ndisMGetDmaAlignment(miniportadapterhandle: ConstPtr): UInt

public expect fun ndisMInitializeTimer(timer: ConstPtr, miniportadapterhandle: ConstPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr)

public expect fun ndisMMapIoSpace(virtualaddress: MutPtr, miniportadapterhandle: ConstPtr, physicaladdress: Long, length: UInt): Int

public expect fun ndisMQueryAdapterInstanceName(padapterinstancename: MutPtr, miniporthandle: ConstPtr): Int

public expect fun ndisMReadDmaCounter(miniportdmahandle: ConstPtr): UInt

public expect fun ndisMRegisterDmaChannel(miniportdmahandle: MutPtr, miniportadapterhandle: ConstPtr, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: ConstPtr, maximumlength: UInt): Int

public expect fun ndisMRegisterIoPortRange(portoffset: MutPtr, miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt): Int

public expect fun ndisMRemoveMiniport(miniporthandle: ConstPtr): Int

public expect fun ndisMSetPeriodicTimer(timer: ConstPtr, millisecondperiod: UInt)

public expect fun ndisMSleep(microsecondstosleep: UInt)

public expect fun ndisMUnmapIoSpace(miniportadapterhandle: ConstPtr, virtualaddress: ConstPtr, length: UInt)

public expect fun ndisMWriteLogData(loghandle: ConstPtr, logbuffer: ConstPtr, logbuffersize: UInt): Int

public expect fun ndisMapFile(status: MutPtr, mappedbuffer: MutPtr, filehandle: ConstPtr)

public expect fun ndisOpenConfigurationKeyByIndex(status: MutPtr, configurationhandle: ConstPtr, index: UInt, keyname: MutPtr, keyhandle: MutPtr)

public expect fun ndisOpenConfigurationKeyByName(status: MutPtr, configurationhandle: ConstPtr, subkeyname: ConstPtr, subkeyhandle: MutPtr)

public expect fun ndisOpenFile(status: MutPtr, filehandle: MutPtr, filelength: MutPtr, filename: ConstPtr, highestacceptableaddress: Long)

public expect fun ndisQueryAdapterInstanceName(padapterinstancename: MutPtr, ndisbindinghandle: ConstPtr): Int

public expect fun ndisQueryBindInstanceName(padapterinstancename: MutPtr, bindingcontext: ConstPtr): Int

public expect fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: ConstPtr)

public expect fun ndisReadConfiguration(status: MutPtr, parametervalue: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametertype: NdisParameterType)

public expect fun ndisReadNetworkAddress(status: MutPtr, networkaddress: MutPtr, networkaddresslength: MutPtr, configurationhandle: ConstPtr)

public expect fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler)

public expect fun ndisReleaseReadWriteLock(lock: MutPtr, lockstate: ConstPtr)

public expect fun ndisResetEvent(event: ConstPtr)

public expect fun ndisSetEvent(event: ConstPtr)

public expect fun ndisSetPeriodicTimer(ndistimer: ConstPtr, millisecondsperiod: UInt)

public expect fun ndisSetTimer(timer: ConstPtr, millisecondstodelay: UInt)

public expect fun ndisSetTimerEx(ndistimer: ConstPtr, millisecondstodelay: UInt, functioncontext: ConstPtr)

public expect fun ndisSetupDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean)

public expect fun ndisSystemProcessorCount(): Byte

public expect fun ndisUnmapFile(filehandle: ConstPtr)

public expect fun ndisUpdateSharedMemory(ndisadapterhandle: MutPtr, length: UInt, virtualaddress: MutPtr, physicaladdress: Long)

public expect fun ndisWaitEvent(event: ConstPtr, mstowait: UInt): Boolean

public expect fun ndisWriteConfiguration(status: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametervalue: ConstPtr)

public expect fun ndisWriteErrorLogEntry(ndisadapterhandle: ConstPtr, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long)

public expect fun ndisWriteEventLogEntry(loghandle: ConstPtr, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: ConstPtr, datasize: UInt, data: ConstPtr): Int
