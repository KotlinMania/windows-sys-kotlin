package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

public expect fun ndisAcquireReadWriteLock(lock: COpaquePointer?, fwrite: Boolean, lockstate: COpaquePointer?)

public expect fun ndisAllocateMemoryWithTag(virtualaddress: COpaquePointer?, length: UInt, tag: UInt): Int

public expect fun ndisCancelTimer(timer: COpaquePointer?, timercancelled: COpaquePointer?)

public expect fun ndisClAddParty(ndisvchandle: COpaquePointer?, protocolpartycontext: COpaquePointer?, callparameters: COpaquePointer?, ndispartyhandle: COpaquePointer?): Int

public expect fun ndisClCloseAddressFamily(ndisafhandle: COpaquePointer?): Int

public expect fun ndisClCloseCall(ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt): Int

public expect fun ndisClDeregisterSap(ndissaphandle: COpaquePointer?): Int

public expect fun ndisClDropParty(ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt): Int

public expect fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: COpaquePointer?): Int

public expect fun ndisClIncomingCallComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?)

public expect fun ndisClMakeCall(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?, protocolpartycontext: COpaquePointer?, ndispartyhandle: COpaquePointer?): Int

public expect fun ndisClModifyCallQoS(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int

public expect fun ndisClRegisterSap(ndisafhandle: COpaquePointer?, protocolsapcontext: COpaquePointer?, sap: COpaquePointer?, ndissaphandle: COpaquePointer?): Int

public expect fun ndisCloseConfiguration(configurationhandle: COpaquePointer?)

public expect fun ndisCloseFile(filehandle: COpaquePointer?)

public expect fun ndisCmActivateVc(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int

public expect fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: COpaquePointer?, callmgrpartycontext: COpaquePointer?, callparameters: COpaquePointer?)

public expect fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: COpaquePointer?)

public expect fun ndisCmCloseCallComplete(status: Int, ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?)

public expect fun ndisCmDeactivateVc(ndisvchandle: COpaquePointer?): Int

public expect fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: COpaquePointer?)

public expect fun ndisCmDispatchCallConnected(ndisvchandle: COpaquePointer?)

public expect fun ndisCmDispatchIncomingCall(ndissaphandle: COpaquePointer?, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int

public expect fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?)

public expect fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt)

public expect fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt)

public expect fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: COpaquePointer?)

public expect fun ndisCmMakeCallComplete(status: Int, ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?, callmgrpartycontext: COpaquePointer?, callparameters: COpaquePointer?)

public expect fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?)

public expect fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: COpaquePointer?, callmgrafcontext: COpaquePointer?)

public expect fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: COpaquePointer?, callmgrsapcontext: COpaquePointer?)

public expect fun ndisCoAssignInstanceName(ndisvchandle: COpaquePointer?, baseinstancename: COpaquePointer?, vcinstancename: COpaquePointer?): Int

public expect fun ndisCoCreateVc(ndisbindinghandle: COpaquePointer?, ndisafhandle: COpaquePointer?, protocolvccontext: COpaquePointer?, ndisvchandle: COpaquePointer?): Int

public expect fun ndisCoDeleteVc(ndisvchandle: COpaquePointer?): Int

public expect fun ndisCoGetTapiCallId(ndisvchandle: COpaquePointer?, tapicallid: COpaquePointer?): Int

public expect fun ndisCompleteDmaTransfer(status: COpaquePointer?, ndisdmahandle: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt, writetodevice: Boolean)

public expect fun ndisCopyBuffer(status: COpaquePointer?, buffer: COpaquePointer?, poolhandle: COpaquePointer?, memorydescriptor: COpaquePointer?, offset: UInt, length: UInt)

public expect fun ndisDeregisterTdiCallBack()

public expect fun ndisFreeMemory(virtualaddress: COpaquePointer?, length: UInt, memoryflags: UInt)

public expect fun ndisGeneratePartialCancelId(): UByte

public expect fun ndisGetCurrentProcessorCounts(pidlecount: COpaquePointer?, pkernelanduser: COpaquePointer?, pindex: COpaquePointer?)

public expect fun ndisGetCurrentProcessorCpuUsage(pcpuusage: COpaquePointer?)

public expect fun ndisGetRoutineAddress(ndisroutinename: COpaquePointer?): COpaquePointer?

public expect fun ndisGetSharedDataAlignment(): UInt

public expect fun ndisGetVersion(): UInt

public expect fun ndisIMAssociateMiniport(driverhandle: COpaquePointer?, protocolhandle: COpaquePointer?)

public expect fun ndisIMCancelInitializeDeviceInstance(driverhandle: COpaquePointer?, deviceinstance: COpaquePointer?): Int

public expect fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: COpaquePointer?): Int

public expect fun ndisIMGetBindingContext(ndisbindinghandle: COpaquePointer?): COpaquePointer?

public expect fun ndisIMInitializeDeviceInstanceEx(driverhandle: COpaquePointer?, driverinstance: COpaquePointer?, devicecontext: COpaquePointer?): Int

public expect fun ndisInitializeEvent(event: COpaquePointer?)

public expect fun ndisInitializeReadWriteLock(lock: COpaquePointer?)

public expect fun ndisInitializeString(destination: COpaquePointer?, source: COpaquePointer?)

public expect fun ndisInitializeTimer(timer: COpaquePointer?, timerfunction: PndisTimerFunction, functioncontext: COpaquePointer?)

public expect fun ndisMAllocateSharedMemory(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, virtualaddress: COpaquePointer?, physicaladdress: COpaquePointer?)

public expect fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, context: COpaquePointer?): Int

public expect fun ndisMCancelTimer(timer: COpaquePointer?, timercancelled: COpaquePointer?)

public expect fun ndisMCloseLog(loghandle: COpaquePointer?)

public expect fun ndisMCmActivateVc(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int

public expect fun ndisMCmCreateVc(miniportadapterhandle: COpaquePointer?, ndisafhandle: COpaquePointer?, miniportvccontext: COpaquePointer?, ndisvchandle: COpaquePointer?): Int

public expect fun ndisMCmDeactivateVc(ndisvchandle: COpaquePointer?): Int

public expect fun ndisMCmDeleteVc(ndisvchandle: COpaquePointer?): Int

public expect fun ndisMCmRegisterAddressFamily(miniportadapterhandle: COpaquePointer?, addressfamily: COpaquePointer?, cmcharacteristics: COpaquePointer?, sizeofcmcharacteristics: UInt): Int

public expect fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?)

public expect fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: COpaquePointer?)

public expect fun ndisMCreateLog(miniportadapterhandle: COpaquePointer?, size: UInt, loghandle: COpaquePointer?): Int

public expect fun ndisMDeregisterDmaChannel(miniportdmahandle: COpaquePointer?)

public expect fun ndisMDeregisterIoPortRange(miniportadapterhandle: COpaquePointer?, initialport: UInt, numberofports: UInt, portoffset: COpaquePointer?)

public expect fun ndisMFlushLog(loghandle: COpaquePointer?)

public expect fun ndisMFreeSharedMemory(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, virtualaddress: COpaquePointer?, physicaladdress: Long)

public expect fun ndisMGetDeviceProperty(miniportadapterhandle: COpaquePointer?, physicaldeviceobject: COpaquePointer?, functionaldeviceobject: COpaquePointer?, nextdeviceobject: COpaquePointer?, allocatedresources: COpaquePointer?, allocatedresourcestranslated: COpaquePointer?)

public expect fun ndisMGetDmaAlignment(miniportadapterhandle: COpaquePointer?): UInt

public expect fun ndisMInitializeTimer(timer: COpaquePointer?, miniportadapterhandle: COpaquePointer?, timerfunction: PndisTimerFunction, functioncontext: COpaquePointer?)

public expect fun ndisMMapIoSpace(virtualaddress: COpaquePointer?, miniportadapterhandle: COpaquePointer?, physicaladdress: Long, length: UInt): Int

public expect fun ndisMQueryAdapterInstanceName(padapterinstancename: COpaquePointer?, miniporthandle: COpaquePointer?): Int

public expect fun ndisMReadDmaCounter(miniportdmahandle: COpaquePointer?): UInt

public expect fun ndisMRegisterDmaChannel(miniportdmahandle: COpaquePointer?, miniportadapterhandle: COpaquePointer?, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: COpaquePointer?, maximumlength: UInt): Int

public expect fun ndisMRegisterIoPortRange(portoffset: COpaquePointer?, miniportadapterhandle: COpaquePointer?, initialport: UInt, numberofports: UInt): Int

public expect fun ndisMRemoveMiniport(miniporthandle: COpaquePointer?): Int

public expect fun ndisMSetPeriodicTimer(timer: COpaquePointer?, millisecondperiod: UInt)

public expect fun ndisMSleep(microsecondstosleep: UInt)

public expect fun ndisMUnmapIoSpace(miniportadapterhandle: COpaquePointer?, virtualaddress: COpaquePointer?, length: UInt)

public expect fun ndisMWriteLogData(loghandle: COpaquePointer?, logbuffer: COpaquePointer?, logbuffersize: UInt): Int

public expect fun ndisMapFile(status: COpaquePointer?, mappedbuffer: COpaquePointer?, filehandle: COpaquePointer?)

public expect fun ndisOpenConfigurationKeyByIndex(status: COpaquePointer?, configurationhandle: COpaquePointer?, index: UInt, keyname: COpaquePointer?, keyhandle: COpaquePointer?)

public expect fun ndisOpenConfigurationKeyByName(status: COpaquePointer?, configurationhandle: COpaquePointer?, subkeyname: COpaquePointer?, subkeyhandle: COpaquePointer?)

public expect fun ndisOpenFile(status: COpaquePointer?, filehandle: COpaquePointer?, filelength: COpaquePointer?, filename: COpaquePointer?, highestacceptableaddress: Long)

public expect fun ndisQueryAdapterInstanceName(padapterinstancename: COpaquePointer?, ndisbindinghandle: COpaquePointer?): Int

public expect fun ndisQueryBindInstanceName(padapterinstancename: COpaquePointer?, bindingcontext: COpaquePointer?): Int

public expect fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: COpaquePointer?)

public expect fun ndisReadConfiguration(status: COpaquePointer?, parametervalue: COpaquePointer?, configurationhandle: COpaquePointer?, keyword: COpaquePointer?, parametertype: NdisParameterType)

public expect fun ndisReadNetworkAddress(status: COpaquePointer?, networkaddress: COpaquePointer?, networkaddresslength: COpaquePointer?, configurationhandle: COpaquePointer?)

public expect fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler)

public expect fun ndisReleaseReadWriteLock(lock: COpaquePointer?, lockstate: COpaquePointer?)

public expect fun ndisResetEvent(event: COpaquePointer?)

public expect fun ndisSetEvent(event: COpaquePointer?)

public expect fun ndisSetPeriodicTimer(ndistimer: COpaquePointer?, millisecondsperiod: UInt)

public expect fun ndisSetTimer(timer: COpaquePointer?, millisecondstodelay: UInt)

public expect fun ndisSetTimerEx(ndistimer: COpaquePointer?, millisecondstodelay: UInt, functioncontext: COpaquePointer?)

public expect fun ndisSetupDmaTransfer(status: COpaquePointer?, ndisdmahandle: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt, writetodevice: Boolean)

public expect fun ndisSystemProcessorCount(): Byte

public expect fun ndisUnmapFile(filehandle: COpaquePointer?)

public expect fun ndisUpdateSharedMemory(ndisadapterhandle: COpaquePointer?, length: UInt, virtualaddress: COpaquePointer?, physicaladdress: Long)

public expect fun ndisWaitEvent(event: COpaquePointer?, mstowait: UInt): Boolean

public expect fun ndisWriteConfiguration(status: COpaquePointer?, configurationhandle: COpaquePointer?, keyword: COpaquePointer?, parametervalue: COpaquePointer?)

public expect fun ndisWriteErrorLogEntry(ndisadapterhandle: COpaquePointer?, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long)

public expect fun ndisWriteEventLogEntry(loghandle: COpaquePointer?, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: COpaquePointer?, datasize: UInt, data: COpaquePointer?): Int
