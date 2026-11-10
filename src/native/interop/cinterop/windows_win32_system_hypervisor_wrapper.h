#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_hypervisor_applyGuestMemoryFix(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t virtualaddress, void* fixbuffer, uint32_t fixbuffersize);
int32_t windowssys_windows_win32_system_hypervisor_applyPendingSavedStateFileReplayLog(void* vmrsfile);
int32_t windowssys_windows_win32_system_hypervisor_callStackUnwind(void* vmsavedstatedumphandle, uint32_t vpid, void* imageinfo, uint32_t imageinfocount, uint32_t framecount, void* callstack);
int32_t windowssys_windows_win32_system_hypervisor_findSavedStateSymbolFieldInType(void* vmsavedstatedumphandle, uint32_t vpid, void* arg_2_typename, void* fieldname, void* offset, void* found);
int32_t windowssys_windows_win32_system_hypervisor_forceActiveVirtualTrustLevel(void* vmsavedstatedumphandle, uint32_t vpid, uint8_t virtualtrustlevel);
int32_t windowssys_windows_win32_system_hypervisor_forceArchitecture(void* vmsavedstatedumphandle, uint32_t vpid, int32_t architecture);
int32_t windowssys_windows_win32_system_hypervisor_forceNestedHostMode(void* vmsavedstatedumphandle, uint32_t vpid, int32_t hostmode, void* oldmode);
int32_t windowssys_windows_win32_system_hypervisor_forcePagingMode(void* vmsavedstatedumphandle, uint32_t vpid, int32_t pagingmode);
int32_t windowssys_windows_win32_system_hypervisor_getActiveVirtualTrustLevel(void* vmsavedstatedumphandle, uint32_t vpid, void* virtualtrustlevel);
int32_t windowssys_windows_win32_system_hypervisor_getArchitecture(void* vmsavedstatedumphandle, uint32_t vpid, void* architecture);
int32_t windowssys_windows_win32_system_hypervisor_getEnabledVirtualTrustLevels(void* vmsavedstatedumphandle, uint32_t vpid, void* virtualtrustlevels);
int32_t windowssys_windows_win32_system_hypervisor_getGuestEnabledVirtualTrustLevels(void* vmsavedstatedumphandle, void* virtualtrustlevels);
int32_t windowssys_windows_win32_system_hypervisor_getGuestOsInfo(void* vmsavedstatedumphandle, uint8_t virtualtrustlevel, void* guestosinfo);
int32_t windowssys_windows_win32_system_hypervisor_getGuestPhysicalMemoryChunks(void* vmsavedstatedumphandle, void* memorychunkpagesize, void* memorychunks, void* memorychunkcount);
int32_t windowssys_windows_win32_system_hypervisor_getGuestRawSavedMemorySize(void* vmsavedstatedumphandle, void* guestrawsavedmemorysize);
int32_t windowssys_windows_win32_system_hypervisor_getMemoryBlockCacheLimit(void* vmsavedstatedumphandle, void* memoryblockcachelimit);
int32_t windowssys_windows_win32_system_hypervisor_getNestedVirtualizationMode(void* vmsavedstatedumphandle, uint32_t vpid, void* enabled);
int32_t windowssys_windows_win32_system_hypervisor_getPagingMode(void* vmsavedstatedumphandle, uint32_t vpid, void* pagingmode);
int32_t windowssys_windows_win32_system_hypervisor_getRegisterValue(void* vmsavedstatedumphandle, uint32_t vpid, uint32_t registerid, void* registervalue);
int32_t windowssys_windows_win32_system_hypervisor_getSavedStateSymbolFieldInfo(void* vmsavedstatedumphandle, uint32_t vpid, void* arg_2_typename, void* typefieldinfomap);
void* windowssys_windows_win32_system_hypervisor_getSavedStateSymbolProviderHandle(void* vmsavedstatedumphandle);
int32_t windowssys_windows_win32_system_hypervisor_getSavedStateSymbolTypeSize(void* vmsavedstatedumphandle, uint32_t vpid, void* arg_2_typename, void* size);
int32_t windowssys_windows_win32_system_hypervisor_getVpCount(void* vmsavedstatedumphandle, void* vpcount);
int32_t windowssys_windows_win32_system_hypervisor_guestPhysicalAddressToRawSavedMemoryOffset(void* vmsavedstatedumphandle, uint64_t physicaladdress, void* rawsavedmemoryoffset);
int32_t windowssys_windows_win32_system_hypervisor_guestVirtualAddressToPhysicalAddress(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t virtualaddress, void* physicaladdress, void* unmappedregionsize);
int32_t windowssys_windows_win32_system_hypervisor_hdvCreateDeviceInstance(void* devicehosthandle, int32_t devicetype, void* deviceclassid, void* deviceinstanceid, void* deviceinterface, void* devicecontext, void* devicehandle);
int32_t windowssys_windows_win32_system_hypervisor_hdvCreateGuestMemoryAperture(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, int32_t writeprotected, void* mappedaddress);
int32_t windowssys_windows_win32_system_hypervisor_hdvCreateSectionBackedMmioRange(void* requestor, int32_t barindex, uint64_t offsetinpages, uint64_t lengthinpages, int32_t mappingflags, void* sectionhandle, uint64_t sectionoffsetinpages);
int32_t windowssys_windows_win32_system_hypervisor_hdvDeliverGuestInterrupt(void* requestor, uint64_t msiaddress, uint32_t msidata);
int32_t windowssys_windows_win32_system_hypervisor_hdvDestroyGuestMemoryAperture(void* requestor, void* mappedaddress);
int32_t windowssys_windows_win32_system_hypervisor_hdvDestroySectionBackedMmioRange(void* requestor, int32_t barindex, uint64_t offsetinpages);
int32_t windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHost(void* computesystem, void* devicehosthandle);
int32_t windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHostEx(void* computesystem, int32_t flags, void* devicehosthandle);
int32_t windowssys_windows_win32_system_hypervisor_hdvReadGuestMemory(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, void* buffer);
int32_t windowssys_windows_win32_system_hypervisor_hdvRegisterDoorbell(void* requestor, int32_t barindex, uint64_t baroffset, uint64_t triggervalue, uint64_t flags, void* doorbellevent);
int32_t windowssys_windows_win32_system_hypervisor_hdvTeardownDeviceHost(void* devicehosthandle);
int32_t windowssys_windows_win32_system_hypervisor_hdvUnregisterDoorbell(void* requestor, int32_t barindex, uint64_t baroffset, uint64_t triggervalue, uint64_t flags);
int32_t windowssys_windows_win32_system_hypervisor_hdvWriteGuestMemory(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, void* buffer);
int32_t windowssys_windows_win32_system_hypervisor_inKernelSpace(void* vmsavedstatedumphandle, uint32_t vpid, void* inkernelspace);
int32_t windowssys_windows_win32_system_hypervisor_isActiveVirtualTrustLevelEnabled(void* vmsavedstatedumphandle, uint32_t vpid, void* activevirtualtrustlevelenabled);
int32_t windowssys_windows_win32_system_hypervisor_isNestedVirtualizationEnabled(void* vmsavedstatedumphandle, void* enabled);
int32_t windowssys_windows_win32_system_hypervisor_loadSavedStateFile(void* vmrsfile, void* vmsavedstatedumphandle);
int32_t windowssys_windows_win32_system_hypervisor_loadSavedStateFiles(void* binfile, void* vsvfile, void* vmsavedstatedumphandle);
int32_t windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbols(void* vmsavedstatedumphandle, void* imagename, void* modulename, uint64_t baseaddress, uint32_t sizeofbase);
int32_t windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbolsEx(void* vmsavedstatedumphandle, void* imagename, uint32_t imagetimestamp, void* modulename, uint64_t baseaddress, uint32_t sizeofbase);
int32_t windowssys_windows_win32_system_hypervisor_loadSavedStateSymbolProvider(void* vmsavedstatedumphandle, void* usersymbols, int32_t force);
int32_t windowssys_windows_win32_system_hypervisor_locateSavedStateFiles(void* vmname, void* snapshotname, void* binpath, void* vsvpath, void* vmrspath);
int32_t windowssys_windows_win32_system_hypervisor_readGuestPhysicalAddress(void* vmsavedstatedumphandle, uint64_t physicaladdress, void* buffer, uint32_t buffersize, void* bytesread);
int32_t windowssys_windows_win32_system_hypervisor_readGuestRawSavedMemory(void* vmsavedstatedumphandle, uint64_t rawsavedmemoryoffset, void* buffer, uint32_t buffersize, void* bytesread);
int32_t windowssys_windows_win32_system_hypervisor_readSavedStateGlobalVariable(void* vmsavedstatedumphandle, uint32_t vpid, void* globalname, void* buffer, uint32_t buffersize);
int32_t windowssys_windows_win32_system_hypervisor_releaseSavedStateFiles(void* vmsavedstatedumphandle);
int32_t windowssys_windows_win32_system_hypervisor_releaseSavedStateSymbolProvider(void* vmsavedstatedumphandle);
int32_t windowssys_windows_win32_system_hypervisor_resolveSavedStateGlobalVariableAddress(void* vmsavedstatedumphandle, uint32_t vpid, void* globalname, void* virtualaddress, void* size);
int32_t windowssys_windows_win32_system_hypervisor_scanMemoryForDosImages(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t startaddress, uint64_t endaddress, void* callbackcontext, void* foundimagecallback, void* standaloneaddress, uint32_t standaloneaddresscount);
int32_t windowssys_windows_win32_system_hypervisor_setMemoryBlockCacheLimit(void* vmsavedstatedumphandle, uint64_t memoryblockcachelimit);
int32_t windowssys_windows_win32_system_hypervisor_setSavedStateSymbolProviderDebugInfoCallback(void* vmsavedstatedumphandle, void* callback);
int32_t windowssys_windows_win32_system_hypervisor_wHvAcceptPartitionMigration(void* migrationhandle, void* partition);
int32_t windowssys_windows_win32_system_hypervisor_wHvAdviseGpaRange(int64_t partition, void* gparanges, uint32_t gparangescount, int32_t advice, void* advicebuffer, uint32_t advicebuffersizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvAllocateVpciResource(void* providerid, int32_t flags, void* resourcedescriptor, uint32_t resourcedescriptorsizeinbytes, void* vpciresource);
int32_t windowssys_windows_win32_system_hypervisor_wHvCancelPartitionMigration(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_wHvCancelRunVirtualProcessor(int64_t partition, uint32_t vpindex, uint32_t flags);
int32_t windowssys_windows_win32_system_hypervisor_wHvCompletePartitionMigration(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_wHvCreateNotificationPort(int64_t partition, void* parameters, void* eventhandle, void* porthandle);
int32_t windowssys_windows_win32_system_hypervisor_wHvCreatePartition(void* partition);
int32_t windowssys_windows_win32_system_hypervisor_wHvCreateTrigger(int64_t partition, void* parameters, void* triggerhandle, void* eventhandle);
int32_t windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor(int64_t partition, uint32_t vpindex, uint32_t flags);
int32_t windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor2(int64_t partition, uint32_t vpindex, void* properties, uint32_t propertycount);
int32_t windowssys_windows_win32_system_hypervisor_wHvCreateVpciDevice(int64_t partition, uint64_t logicaldeviceid, void* vpciresource, int32_t flags, void* notificationeventhandle);
int32_t windowssys_windows_win32_system_hypervisor_wHvDeleteNotificationPort(int64_t partition, void* porthandle);
int32_t windowssys_windows_win32_system_hypervisor_wHvDeletePartition(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_wHvDeleteTrigger(int64_t partition, void* triggerhandle);
int32_t windowssys_windows_win32_system_hypervisor_wHvDeleteVirtualProcessor(int64_t partition, uint32_t vpindex);
int32_t windowssys_windows_win32_system_hypervisor_wHvDeleteVpciDevice(int64_t partition, uint64_t logicaldeviceid);
int32_t windowssys_windows_win32_system_hypervisor_wHvEmulatorCreateEmulator(void* callbacks, void* emulator);
int32_t windowssys_windows_win32_system_hypervisor_wHvEmulatorDestroyEmulator(void* emulator);
int32_t windowssys_windows_win32_system_hypervisor_wHvEmulatorTryIoEmulation(void* emulator, void* context, void* vpcontext, void* ioinstructioncontext, void* emulatorreturnstatus);
int32_t windowssys_windows_win32_system_hypervisor_wHvEmulatorTryMmioEmulation(void* emulator, void* context, void* vpcontext, void* mmioinstructioncontext, void* emulatorreturnstatus);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetCapability(int32_t capabilitycode, void* capabilitybuffer, uint32_t capabilitybuffersizeinbytes, void* writtensizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetInterruptTargetVpSet(int64_t partition, uint64_t destination, int32_t destinationmode, void* targetvps, uint32_t vpcount, void* targetvpcount);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetPartitionCounters(int64_t partition, int32_t counterset, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetPartitionProperty(int64_t partition, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes, void* writtensizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCounters(int64_t partition, uint32_t vpindex, int32_t counterset, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCpuidOutput(int64_t partition, uint32_t vpindex, uint32_t eax, uint32_t ecx, void* cpuidoutput);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize, void* writtensize);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState2(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize, void* writtensize);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorRegisters(int64_t partition, uint32_t vpindex, void* registernames, uint32_t registercount, void* registervalues);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorState(int64_t partition, uint32_t vpindex, int32_t statetype, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorXsaveState(int64_t partition, uint32_t vpindex, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceInterruptTarget(int64_t partition, uint64_t logicaldeviceid, uint32_t arg_2_index, uint32_t multimessagenumber, void* target, uint32_t targetsizeinbytes, void* byteswritten);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceNotification(int64_t partition, uint64_t logicaldeviceid, void* notification, uint32_t notificationsizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceProperty(int64_t partition, uint64_t logicaldeviceid, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes, void* writtensizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvMapGpaRange(int64_t partition, void* sourceaddress, uint64_t guestaddress, uint64_t sizeinbytes, int32_t flags);
int32_t windowssys_windows_win32_system_hypervisor_wHvMapGpaRange2(int64_t partition, void* process, void* sourceaddress, uint64_t guestaddress, uint64_t sizeinbytes, int32_t flags);
int32_t windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint32_t arg_2_index, uint32_t messagecount, void* target, void* msiaddress, void* msidata);
int32_t windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceMmioRanges(int64_t partition, uint64_t logicaldeviceid, void* mappingcount, void* mappings);
int32_t windowssys_windows_win32_system_hypervisor_wHvPostVirtualProcessorSynicMessage(int64_t partition, uint32_t vpindex, uint32_t sintindex, void* message, uint32_t messagesizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvQueryGpaRangeDirtyBitmap(int64_t partition, uint64_t guestaddress, uint64_t rangesizeinbytes, void* bitmap, uint32_t bitmapsizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvReadVpciDeviceRegister(int64_t partition, uint64_t logicaldeviceid, void* arg_2_register, void* data);
int32_t windowssys_windows_win32_system_hypervisor_wHvRegisterPartitionDoorbellEvent(int64_t partition, void* matchdata, void* eventhandle);
int32_t windowssys_windows_win32_system_hypervisor_wHvRequestInterrupt(int64_t partition, void* interrupt, uint32_t interruptcontrolsize);
int32_t windowssys_windows_win32_system_hypervisor_wHvRequestVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint64_t msiaddress, uint32_t msidata);
int32_t windowssys_windows_win32_system_hypervisor_wHvResetPartition(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_wHvResumePartitionTime(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_wHvRetargetVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint64_t msiaddress, uint32_t msidata, void* target);
int32_t windowssys_windows_win32_system_hypervisor_wHvRunVirtualProcessor(int64_t partition, uint32_t vpindex, void* exitcontext, uint32_t exitcontextsizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvSetNotificationPortProperty(int64_t partition, void* porthandle, int32_t propertycode, uint64_t propertyvalue);
int32_t windowssys_windows_win32_system_hypervisor_wHvSetPartitionProperty(int64_t partition, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize);
int32_t windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState2(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize);
int32_t windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorRegisters(int64_t partition, uint32_t vpindex, void* registernames, uint32_t registercount, void* registervalues);
int32_t windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorState(int64_t partition, uint32_t vpindex, int32_t statetype, void* buffer, uint32_t buffersizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorXsaveState(int64_t partition, uint32_t vpindex, void* buffer, uint32_t buffersizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvSetVpciDevicePowerState(int64_t partition, uint64_t logicaldeviceid, int32_t powerstate);
int32_t windowssys_windows_win32_system_hypervisor_wHvSetupPartition(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_wHvStartPartitionMigration(int64_t partition, void* migrationhandle);
int32_t windowssys_windows_win32_system_hypervisor_wHvSuspendPartitionTime(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_wHvTranslateGva(int64_t partition, uint32_t vpindex, uint64_t gva, int32_t translateflags, void* translationresult, void* gpa);
int32_t windowssys_windows_win32_system_hypervisor_wHvUnmapGpaRange(int64_t partition, uint64_t guestaddress, uint64_t sizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint32_t arg_2_index);
int32_t windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceMmioRanges(int64_t partition, uint64_t logicaldeviceid);
int32_t windowssys_windows_win32_system_hypervisor_wHvUnregisterPartitionDoorbellEvent(int64_t partition, void* matchdata);
int32_t windowssys_windows_win32_system_hypervisor_wHvUpdateTriggerParameters(int64_t partition, void* parameters, void* triggerhandle);
int32_t windowssys_windows_win32_system_hypervisor_wHvWriteVpciDeviceRegister(int64_t partition, uint64_t logicaldeviceid, void* arg_2_register, void* data);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WRAPPER_H */
