#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_hypervisor_ApplyGuestMemoryFix(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t virtualaddress, void* fixbuffer, uint32_t fixbuffersize);
int32_t windowssys_windows_win32_system_hypervisor_ApplyPendingSavedStateFileReplayLog(void* vmrsfile);
int32_t windowssys_windows_win32_system_hypervisor_CallStackUnwind(void* vmsavedstatedumphandle, uint32_t vpid, void* imageinfo, uint32_t imageinfocount, uint32_t framecount, void* callstack);
int32_t windowssys_windows_win32_system_hypervisor_FindSavedStateSymbolFieldInType(void* vmsavedstatedumphandle, uint32_t vpid, void* arg_2_typename, void* fieldname, void* offset, void* found);
int32_t windowssys_windows_win32_system_hypervisor_ForceActiveVirtualTrustLevel(void* vmsavedstatedumphandle, uint32_t vpid, uint8_t virtualtrustlevel);
int32_t windowssys_windows_win32_system_hypervisor_ForceArchitecture(void* vmsavedstatedumphandle, uint32_t vpid, int32_t architecture);
int32_t windowssys_windows_win32_system_hypervisor_ForceNestedHostMode(void* vmsavedstatedumphandle, uint32_t vpid, int32_t hostmode, void* oldmode);
int32_t windowssys_windows_win32_system_hypervisor_ForcePagingMode(void* vmsavedstatedumphandle, uint32_t vpid, int32_t pagingmode);
int32_t windowssys_windows_win32_system_hypervisor_GetActiveVirtualTrustLevel(void* vmsavedstatedumphandle, uint32_t vpid, void* virtualtrustlevel);
int32_t windowssys_windows_win32_system_hypervisor_GetArchitecture(void* vmsavedstatedumphandle, uint32_t vpid, void* architecture);
int32_t windowssys_windows_win32_system_hypervisor_GetEnabledVirtualTrustLevels(void* vmsavedstatedumphandle, uint32_t vpid, void* virtualtrustlevels);
int32_t windowssys_windows_win32_system_hypervisor_GetGuestEnabledVirtualTrustLevels(void* vmsavedstatedumphandle, void* virtualtrustlevels);
int32_t windowssys_windows_win32_system_hypervisor_GetGuestOsInfo(void* vmsavedstatedumphandle, uint8_t virtualtrustlevel, void* guestosinfo);
int32_t windowssys_windows_win32_system_hypervisor_GetGuestPhysicalMemoryChunks(void* vmsavedstatedumphandle, void* memorychunkpagesize, void* memorychunks, void* memorychunkcount);
int32_t windowssys_windows_win32_system_hypervisor_GetGuestRawSavedMemorySize(void* vmsavedstatedumphandle, void* guestrawsavedmemorysize);
int32_t windowssys_windows_win32_system_hypervisor_GetMemoryBlockCacheLimit(void* vmsavedstatedumphandle, void* memoryblockcachelimit);
int32_t windowssys_windows_win32_system_hypervisor_GetNestedVirtualizationMode(void* vmsavedstatedumphandle, uint32_t vpid, void* enabled);
int32_t windowssys_windows_win32_system_hypervisor_GetPagingMode(void* vmsavedstatedumphandle, uint32_t vpid, void* pagingmode);
int32_t windowssys_windows_win32_system_hypervisor_GetRegisterValue(void* vmsavedstatedumphandle, uint32_t vpid, uint32_t registerid, void* registervalue);
int32_t windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolFieldInfo(void* vmsavedstatedumphandle, uint32_t vpid, void* arg_2_typename, void* typefieldinfomap);
void* windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolProviderHandle(void* vmsavedstatedumphandle);
int32_t windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolTypeSize(void* vmsavedstatedumphandle, uint32_t vpid, void* arg_2_typename, void* size);
int32_t windowssys_windows_win32_system_hypervisor_GetVpCount(void* vmsavedstatedumphandle, void* vpcount);
int32_t windowssys_windows_win32_system_hypervisor_GuestPhysicalAddressToRawSavedMemoryOffset(void* vmsavedstatedumphandle, uint64_t physicaladdress, void* rawsavedmemoryoffset);
int32_t windowssys_windows_win32_system_hypervisor_GuestVirtualAddressToPhysicalAddress(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t virtualaddress, void* physicaladdress, void* unmappedregionsize);
int32_t windowssys_windows_win32_system_hypervisor_HdvCreateDeviceInstance(void* devicehosthandle, int32_t devicetype, void* deviceclassid, void* deviceinstanceid, void* deviceinterface, void* devicecontext, void* devicehandle);
int32_t windowssys_windows_win32_system_hypervisor_HdvCreateGuestMemoryAperture(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, int32_t writeprotected, void* mappedaddress);
int32_t windowssys_windows_win32_system_hypervisor_HdvCreateSectionBackedMmioRange(void* requestor, int32_t barindex, uint64_t offsetinpages, uint64_t lengthinpages, int32_t mappingflags, void* sectionhandle, uint64_t sectionoffsetinpages);
int32_t windowssys_windows_win32_system_hypervisor_HdvDeliverGuestInterrupt(void* requestor, uint64_t msiaddress, uint32_t msidata);
int32_t windowssys_windows_win32_system_hypervisor_HdvDestroyGuestMemoryAperture(void* requestor, void* mappedaddress);
int32_t windowssys_windows_win32_system_hypervisor_HdvDestroySectionBackedMmioRange(void* requestor, int32_t barindex, uint64_t offsetinpages);
int32_t windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHost(void* computesystem, void* devicehosthandle);
int32_t windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHostEx(void* computesystem, int32_t flags, void* devicehosthandle);
int32_t windowssys_windows_win32_system_hypervisor_HdvReadGuestMemory(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, void* buffer);
int32_t windowssys_windows_win32_system_hypervisor_HdvRegisterDoorbell(void* requestor, int32_t barindex, uint64_t baroffset, uint64_t triggervalue, uint64_t flags, void* doorbellevent);
int32_t windowssys_windows_win32_system_hypervisor_HdvTeardownDeviceHost(void* devicehosthandle);
int32_t windowssys_windows_win32_system_hypervisor_HdvUnregisterDoorbell(void* requestor, int32_t barindex, uint64_t baroffset, uint64_t triggervalue, uint64_t flags);
int32_t windowssys_windows_win32_system_hypervisor_HdvWriteGuestMemory(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, void* buffer);
int32_t windowssys_windows_win32_system_hypervisor_InKernelSpace(void* vmsavedstatedumphandle, uint32_t vpid, void* inkernelspace);
int32_t windowssys_windows_win32_system_hypervisor_IsActiveVirtualTrustLevelEnabled(void* vmsavedstatedumphandle, uint32_t vpid, void* activevirtualtrustlevelenabled);
int32_t windowssys_windows_win32_system_hypervisor_IsNestedVirtualizationEnabled(void* vmsavedstatedumphandle, void* enabled);
int32_t windowssys_windows_win32_system_hypervisor_LoadSavedStateFile(void* vmrsfile, void* vmsavedstatedumphandle);
int32_t windowssys_windows_win32_system_hypervisor_LoadSavedStateFiles(void* binfile, void* vsvfile, void* vmsavedstatedumphandle);
int32_t windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbols(void* vmsavedstatedumphandle, void* imagename, void* modulename, uint64_t baseaddress, uint32_t sizeofbase);
int32_t windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbolsEx(void* vmsavedstatedumphandle, void* imagename, uint32_t imagetimestamp, void* modulename, uint64_t baseaddress, uint32_t sizeofbase);
int32_t windowssys_windows_win32_system_hypervisor_LoadSavedStateSymbolProvider(void* vmsavedstatedumphandle, void* usersymbols, int32_t force);
int32_t windowssys_windows_win32_system_hypervisor_LocateSavedStateFiles(void* vmname, void* snapshotname, void* binpath, void* vsvpath, void* vmrspath);
int32_t windowssys_windows_win32_system_hypervisor_ReadGuestPhysicalAddress(void* vmsavedstatedumphandle, uint64_t physicaladdress, void* buffer, uint32_t buffersize, void* bytesread);
int32_t windowssys_windows_win32_system_hypervisor_ReadGuestRawSavedMemory(void* vmsavedstatedumphandle, uint64_t rawsavedmemoryoffset, void* buffer, uint32_t buffersize, void* bytesread);
int32_t windowssys_windows_win32_system_hypervisor_ReadSavedStateGlobalVariable(void* vmsavedstatedumphandle, uint32_t vpid, void* globalname, void* buffer, uint32_t buffersize);
int32_t windowssys_windows_win32_system_hypervisor_ReleaseSavedStateFiles(void* vmsavedstatedumphandle);
int32_t windowssys_windows_win32_system_hypervisor_ReleaseSavedStateSymbolProvider(void* vmsavedstatedumphandle);
int32_t windowssys_windows_win32_system_hypervisor_ResolveSavedStateGlobalVariableAddress(void* vmsavedstatedumphandle, uint32_t vpid, void* globalname, void* virtualaddress, void* size);
int32_t windowssys_windows_win32_system_hypervisor_ScanMemoryForDosImages(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t startaddress, uint64_t endaddress, void* callbackcontext, void* foundimagecallback, void* standaloneaddress, uint32_t standaloneaddresscount);
int32_t windowssys_windows_win32_system_hypervisor_SetMemoryBlockCacheLimit(void* vmsavedstatedumphandle, uint64_t memoryblockcachelimit);
int32_t windowssys_windows_win32_system_hypervisor_SetSavedStateSymbolProviderDebugInfoCallback(void* vmsavedstatedumphandle, void* callback);
int32_t windowssys_windows_win32_system_hypervisor_WHvAcceptPartitionMigration(void* migrationhandle, void* partition);
int32_t windowssys_windows_win32_system_hypervisor_WHvAdviseGpaRange(int64_t partition, void* gparanges, uint32_t gparangescount, int32_t advice, void* advicebuffer, uint32_t advicebuffersizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvAllocateVpciResource(void* providerid, int32_t flags, void* resourcedescriptor, uint32_t resourcedescriptorsizeinbytes, void* vpciresource);
int32_t windowssys_windows_win32_system_hypervisor_WHvCancelPartitionMigration(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_WHvCancelRunVirtualProcessor(int64_t partition, uint32_t vpindex, uint32_t flags);
int32_t windowssys_windows_win32_system_hypervisor_WHvCompletePartitionMigration(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_WHvCreateNotificationPort(int64_t partition, void* parameters, void* eventhandle, void* porthandle);
int32_t windowssys_windows_win32_system_hypervisor_WHvCreatePartition(void* partition);
int32_t windowssys_windows_win32_system_hypervisor_WHvCreateTrigger(int64_t partition, void* parameters, void* triggerhandle, void* eventhandle);
int32_t windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor(int64_t partition, uint32_t vpindex, uint32_t flags);
int32_t windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor2(int64_t partition, uint32_t vpindex, void* properties, uint32_t propertycount);
int32_t windowssys_windows_win32_system_hypervisor_WHvCreateVpciDevice(int64_t partition, uint64_t logicaldeviceid, void* vpciresource, int32_t flags, void* notificationeventhandle);
int32_t windowssys_windows_win32_system_hypervisor_WHvDeleteNotificationPort(int64_t partition, void* porthandle);
int32_t windowssys_windows_win32_system_hypervisor_WHvDeletePartition(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_WHvDeleteTrigger(int64_t partition, void* triggerhandle);
int32_t windowssys_windows_win32_system_hypervisor_WHvDeleteVirtualProcessor(int64_t partition, uint32_t vpindex);
int32_t windowssys_windows_win32_system_hypervisor_WHvDeleteVpciDevice(int64_t partition, uint64_t logicaldeviceid);
int32_t windowssys_windows_win32_system_hypervisor_WHvEmulatorCreateEmulator(void* callbacks, void* emulator);
int32_t windowssys_windows_win32_system_hypervisor_WHvEmulatorDestroyEmulator(void* emulator);
int32_t windowssys_windows_win32_system_hypervisor_WHvEmulatorTryIoEmulation(void* emulator, void* context, void* vpcontext, void* ioinstructioncontext, void* emulatorreturnstatus);
int32_t windowssys_windows_win32_system_hypervisor_WHvEmulatorTryMmioEmulation(void* emulator, void* context, void* vpcontext, void* mmioinstructioncontext, void* emulatorreturnstatus);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetCapability(int32_t capabilitycode, void* capabilitybuffer, uint32_t capabilitybuffersizeinbytes, void* writtensizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetInterruptTargetVpSet(int64_t partition, uint64_t destination, int32_t destinationmode, void* targetvps, uint32_t vpcount, void* targetvpcount);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetPartitionCounters(int64_t partition, int32_t counterset, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetPartitionProperty(int64_t partition, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes, void* writtensizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCounters(int64_t partition, uint32_t vpindex, int32_t counterset, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCpuidOutput(int64_t partition, uint32_t vpindex, uint32_t eax, uint32_t ecx, void* cpuidoutput);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize, void* writtensize);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState2(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize, void* writtensize);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorRegisters(int64_t partition, uint32_t vpindex, void* registernames, uint32_t registercount, void* registervalues);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorState(int64_t partition, uint32_t vpindex, int32_t statetype, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorXsaveState(int64_t partition, uint32_t vpindex, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceInterruptTarget(int64_t partition, uint64_t logicaldeviceid, uint32_t arg_2_index, uint32_t multimessagenumber, void* target, uint32_t targetsizeinbytes, void* byteswritten);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceNotification(int64_t partition, uint64_t logicaldeviceid, void* notification, uint32_t notificationsizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceProperty(int64_t partition, uint64_t logicaldeviceid, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes, void* writtensizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvMapGpaRange(int64_t partition, void* sourceaddress, uint64_t guestaddress, uint64_t sizeinbytes, int32_t flags);
int32_t windowssys_windows_win32_system_hypervisor_WHvMapGpaRange2(int64_t partition, void* process, void* sourceaddress, uint64_t guestaddress, uint64_t sizeinbytes, int32_t flags);
int32_t windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint32_t arg_2_index, uint32_t messagecount, void* target, void* msiaddress, void* msidata);
int32_t windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceMmioRanges(int64_t partition, uint64_t logicaldeviceid, void* mappingcount, void* mappings);
int32_t windowssys_windows_win32_system_hypervisor_WHvPostVirtualProcessorSynicMessage(int64_t partition, uint32_t vpindex, uint32_t sintindex, void* message, uint32_t messagesizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvQueryGpaRangeDirtyBitmap(int64_t partition, uint64_t guestaddress, uint64_t rangesizeinbytes, void* bitmap, uint32_t bitmapsizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvReadVpciDeviceRegister(int64_t partition, uint64_t logicaldeviceid, void* arg_2_register, void* data);
int32_t windowssys_windows_win32_system_hypervisor_WHvRegisterPartitionDoorbellEvent(int64_t partition, void* matchdata, void* eventhandle);
int32_t windowssys_windows_win32_system_hypervisor_WHvRequestInterrupt(int64_t partition, void* interrupt, uint32_t interruptcontrolsize);
int32_t windowssys_windows_win32_system_hypervisor_WHvRequestVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint64_t msiaddress, uint32_t msidata);
int32_t windowssys_windows_win32_system_hypervisor_WHvResetPartition(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_WHvResumePartitionTime(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_WHvRetargetVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint64_t msiaddress, uint32_t msidata, void* target);
int32_t windowssys_windows_win32_system_hypervisor_WHvRunVirtualProcessor(int64_t partition, uint32_t vpindex, void* exitcontext, uint32_t exitcontextsizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvSetNotificationPortProperty(int64_t partition, void* porthandle, int32_t propertycode, uint64_t propertyvalue);
int32_t windowssys_windows_win32_system_hypervisor_WHvSetPartitionProperty(int64_t partition, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize);
int32_t windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState2(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize);
int32_t windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorRegisters(int64_t partition, uint32_t vpindex, void* registernames, uint32_t registercount, void* registervalues);
int32_t windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorState(int64_t partition, uint32_t vpindex, int32_t statetype, void* buffer, uint32_t buffersizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorXsaveState(int64_t partition, uint32_t vpindex, void* buffer, uint32_t buffersizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvSetVpciDevicePowerState(int64_t partition, uint64_t logicaldeviceid, int32_t powerstate);
int32_t windowssys_windows_win32_system_hypervisor_WHvSetupPartition(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_WHvStartPartitionMigration(int64_t partition, void* migrationhandle);
int32_t windowssys_windows_win32_system_hypervisor_WHvSuspendPartitionTime(int64_t partition);
int32_t windowssys_windows_win32_system_hypervisor_WHvTranslateGva(int64_t partition, uint32_t vpindex, uint64_t gva, int32_t translateflags, void* translationresult, void* gpa);
int32_t windowssys_windows_win32_system_hypervisor_WHvUnmapGpaRange(int64_t partition, uint64_t guestaddress, uint64_t sizeinbytes);
int32_t windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint32_t arg_2_index);
int32_t windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceMmioRanges(int64_t partition, uint64_t logicaldeviceid);
int32_t windowssys_windows_win32_system_hypervisor_WHvUnregisterPartitionDoorbellEvent(int64_t partition, void* matchdata);
int32_t windowssys_windows_win32_system_hypervisor_WHvUpdateTriggerParameters(int64_t partition, void* parameters, void* triggerhandle);
int32_t windowssys_windows_win32_system_hypervisor_WHvWriteVpciDeviceRegister(int64_t partition, uint64_t logicaldeviceid, void* arg_2_register, void* data);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WRAPPER_H */
