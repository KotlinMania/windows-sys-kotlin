package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING

public expect fun NdisAcquireReadWriteLock(lock: Long, fwrite: Boolean, lockstate: Long)

public expect fun NdisAllocateMemoryWithTag(virtualaddress: Long, length: UInt, tag: UInt): Int

public expect fun NdisCancelTimer(timer: Long, timercancelled: Long)

public expect fun NdisClAddParty(ndisvchandle: Long, protocolpartycontext: Long, callparameters: Long, ndispartyhandle: Long): Int

public expect fun NdisClCloseAddressFamily(ndisafhandle: Long): Int

public expect fun NdisClCloseCall(ndisvchandle: Long, ndispartyhandle: Long, buffer: Long, size: UInt): Int

public expect fun NdisClDeregisterSap(ndissaphandle: Long): Int

public expect fun NdisClDropParty(ndispartyhandle: Long, buffer: Long, size: UInt): Int

public expect fun NdisClGetProtocolVcContextFromTapiCallId(tapicallid: UNICODE_STRING, protocolvccontext: Long): Int

public expect fun NdisClIncomingCallComplete(status: Int, ndisvchandle: Long, callparameters: Long)

public expect fun NdisClMakeCall(ndisvchandle: Long, callparameters: Long, protocolpartycontext: Long, ndispartyhandle: Long): Int

public expect fun NdisClModifyCallQoS(ndisvchandle: Long, callparameters: Long): Int

public expect fun NdisClRegisterSap(ndisafhandle: Long, protocolsapcontext: Long, sap: Long, ndissaphandle: Long): Int

public expect fun NdisCloseConfiguration(configurationhandle: Long)

public expect fun NdisCloseFile(filehandle: Long)

public expect fun NdisCmActivateVc(ndisvchandle: Long, callparameters: Long): Int

public expect fun NdisCmAddPartyComplete(status: Int, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long)

public expect fun NdisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: Long)

public expect fun NdisCmCloseCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long)

public expect fun NdisCmDeactivateVc(ndisvchandle: Long): Int

public expect fun NdisCmDeregisterSapComplete(status: Int, ndissaphandle: Long)

public expect fun NdisCmDispatchCallConnected(ndisvchandle: Long)

public expect fun NdisCmDispatchIncomingCall(ndissaphandle: Long, ndisvchandle: Long, callparameters: Long): Int

public expect fun NdisCmDispatchIncomingCallQoSChange(ndisvchandle: Long, callparameters: Long)

public expect fun NdisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: Long, buffer: Long, size: UInt)

public expect fun NdisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: Long, buffer: Long, size: UInt)

public expect fun NdisCmDropPartyComplete(status: Int, ndispartyhandle: Long)

public expect fun NdisCmMakeCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long)

public expect fun NdisCmModifyCallQoSComplete(status: Int, ndisvchandle: Long, callparameters: Long)

public expect fun NdisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: Long, callmgrafcontext: Long)

public expect fun NdisCmRegisterSapComplete(status: Int, ndissaphandle: Long, callmgrsapcontext: Long)

public expect fun NdisCoAssignInstanceName(ndisvchandle: Long, baseinstancename: Long, vcinstancename: Long): Int

public expect fun NdisCoCreateVc(ndisbindinghandle: Long, ndisafhandle: Long, protocolvccontext: Long, ndisvchandle: Long): Int

public expect fun NdisCoDeleteVc(ndisvchandle: Long): Int

public expect fun NdisCoGetTapiCallId(ndisvchandle: Long, tapicallid: Long): Int

public expect fun NdisCompleteDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean)

public expect fun NdisCopyBuffer(status: Long, buffer: Long, poolhandle: Long, memorydescriptor: Long, offset: UInt, length: UInt)

public expect fun NdisDeregisterTdiCallBack()

public expect fun NdisFreeMemory(virtualaddress: Long, length: UInt, memoryflags: UInt)

public expect fun NdisGeneratePartialCancelId(): UByte

public expect fun NdisGetCurrentProcessorCounts(pidlecount: Long, pkernelanduser: Long, pindex: Long)

public expect fun NdisGetCurrentProcessorCpuUsage(pcpuusage: Long)

public expect fun NdisGetRoutineAddress(ndisroutinename: Long): Long

public expect fun NdisGetSharedDataAlignment(): UInt

public expect fun NdisGetVersion(): UInt

public expect fun NdisIMAssociateMiniport(driverhandle: Long, protocolhandle: Long)

public expect fun NdisIMCancelInitializeDeviceInstance(driverhandle: Long, deviceinstance: Long): Int

public expect fun NdisIMDeInitializeDeviceInstance(ndisminiporthandle: Long): Int

public expect fun NdisIMGetBindingContext(ndisbindinghandle: Long): Long

public expect fun NdisIMInitializeDeviceInstanceEx(driverhandle: Long, driverinstance: Long, devicecontext: Long): Int

public expect fun NdisInitializeEvent(event: Long)

public expect fun NdisInitializeReadWriteLock(lock: Long)

public expect fun NdisInitializeString(destination: Long, source: Long)

public expect fun NdisInitializeTimer(timer: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long)

public expect fun NdisMAllocateSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long)

public expect fun NdisMAllocateSharedMemoryAsync(miniportadapterhandle: Long, length: UInt, cached: Boolean, context: Long): Int

public expect fun NdisMCancelTimer(timer: Long, timercancelled: Long)

public expect fun NdisMCloseLog(loghandle: Long)

public expect fun NdisMCmActivateVc(ndisvchandle: Long, callparameters: Long): Int

public expect fun NdisMCmCreateVc(miniportadapterhandle: Long, ndisafhandle: Long, miniportvccontext: Long, ndisvchandle: Long): Int

public expect fun NdisMCmDeactivateVc(ndisvchandle: Long): Int

public expect fun NdisMCmDeleteVc(ndisvchandle: Long): Int

public expect fun NdisMCmRegisterAddressFamily(miniportadapterhandle: Long, addressfamily: Long, cmcharacteristics: Long, sizeofcmcharacteristics: UInt): Int

public expect fun NdisMCoActivateVcComplete(status: Int, ndisvchandle: Long, callparameters: Long)

public expect fun NdisMCoDeactivateVcComplete(status: Int, ndisvchandle: Long)

public expect fun NdisMCreateLog(miniportadapterhandle: Long, size: UInt, loghandle: Long): Int

public expect fun NdisMDeregisterDmaChannel(miniportdmahandle: Long)

public expect fun NdisMDeregisterIoPortRange(miniportadapterhandle: Long, initialport: UInt, numberofports: UInt, portoffset: Long)

public expect fun NdisMFlushLog(loghandle: Long)

public expect fun NdisMFreeSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long)

public expect fun NdisMGetDeviceProperty(miniportadapterhandle: Long, physicaldeviceobject: Long, functionaldeviceobject: Long, nextdeviceobject: Long, allocatedresources: Long, allocatedresourcestranslated: Long)

public expect fun NdisMGetDmaAlignment(miniportadapterhandle: Long): UInt

public expect fun NdisMInitializeTimer(timer: Long, miniportadapterhandle: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long)

public expect fun NdisMMapIoSpace(virtualaddress: Long, miniportadapterhandle: Long, physicaladdress: Long, length: UInt): Int

public expect fun NdisMQueryAdapterInstanceName(padapterinstancename: Long, miniporthandle: Long): Int

public expect fun NdisMReadDmaCounter(miniportdmahandle: Long): UInt

public expect fun NdisMRegisterDmaChannel(miniportdmahandle: Long, miniportadapterhandle: Long, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: Long, maximumlength: UInt): Int

public expect fun NdisMRegisterIoPortRange(portoffset: Long, miniportadapterhandle: Long, initialport: UInt, numberofports: UInt): Int

public expect fun NdisMRemoveMiniport(miniporthandle: Long): Int

public expect fun NdisMSetPeriodicTimer(timer: Long, millisecondperiod: UInt)

public expect fun NdisMSleep(microsecondstosleep: UInt)

public expect fun NdisMUnmapIoSpace(miniportadapterhandle: Long, virtualaddress: Long, length: UInt)

public expect fun NdisMWriteLogData(loghandle: Long, logbuffer: Long, logbuffersize: UInt): Int

public expect fun NdisMapFile(status: Long, mappedbuffer: Long, filehandle: Long)

public expect fun NdisOpenConfigurationKeyByIndex(status: Long, configurationhandle: Long, index: UInt, keyname: Long, keyhandle: Long)

public expect fun NdisOpenConfigurationKeyByName(status: Long, configurationhandle: Long, subkeyname: Long, subkeyhandle: Long)

public expect fun NdisOpenFile(status: Long, filehandle: Long, filelength: Long, filename: Long, highestacceptableaddress: Long)

public expect fun NdisQueryAdapterInstanceName(padapterinstancename: Long, ndisbindinghandle: Long): Int

public expect fun NdisQueryBindInstanceName(padapterinstancename: Long, bindingcontext: Long): Int

public expect fun NdisReEnumerateProtocolBindings(ndisprotocolhandle: Long)

public expect fun NdisReadConfiguration(status: Long, parametervalue: Long, configurationhandle: Long, keyword: Long, parametertype: NDIS_PARAMETER_TYPE)

public expect fun NdisReadNetworkAddress(status: Long, networkaddress: Long, networkaddresslength: Long, configurationhandle: Long)

public expect fun NdisRegisterTdiCallBack(registercallback: TDI_REGISTER_CALLBACK, pnphandler: TDI_PNP_HANDLER)

public expect fun NdisReleaseReadWriteLock(lock: Long, lockstate: Long)

public expect fun NdisResetEvent(event: Long)

public expect fun NdisSetEvent(event: Long)

public expect fun NdisSetPeriodicTimer(ndistimer: Long, millisecondsperiod: UInt)

public expect fun NdisSetTimer(timer: Long, millisecondstodelay: UInt)

public expect fun NdisSetTimerEx(ndistimer: Long, millisecondstodelay: UInt, functioncontext: Long)

public expect fun NdisSetupDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean)

public expect fun NdisSystemProcessorCount(): Byte

public expect fun NdisUnmapFile(filehandle: Long)

public expect fun NdisUpdateSharedMemory(ndisadapterhandle: Long, length: UInt, virtualaddress: Long, physicaladdress: Long)

public expect fun NdisWaitEvent(event: Long, mstowait: UInt): Boolean

public expect fun NdisWriteConfiguration(status: Long, configurationhandle: Long, keyword: Long, parametervalue: Long)

public expect fun NdisWriteErrorLogEntry(ndisadapterhandle: Long, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long)

public expect fun NdisWriteEventLogEntry(loghandle: Long, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: Long, datasize: UInt, data: Long): Int
