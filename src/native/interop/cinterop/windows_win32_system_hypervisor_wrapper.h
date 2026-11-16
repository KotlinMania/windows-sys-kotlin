#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t virtualaddress, void* fixbuffer, uint32_t fixbuffersize);
int32_t windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog(void* vmrsfile);
int32_t windowssysWindowsWin32SystemHypervisorCallStackUnwind(void* vmsavedstatedumphandle, uint32_t vpid, void* imageinfo, uint32_t imageinfocount, uint32_t framecount, void* callstack);
int32_t windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType(void* vmsavedstatedumphandle, uint32_t vpid, void* arg2Typename, void* fieldname, void* offset, void* found);
int32_t windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel(void* vmsavedstatedumphandle, uint32_t vpid, uint8_t virtualtrustlevel);
int32_t windowssysWindowsWin32SystemHypervisorForceArchitecture(void* vmsavedstatedumphandle, uint32_t vpid, int32_t architecture);
int32_t windowssysWindowsWin32SystemHypervisorForceNestedHostMode(void* vmsavedstatedumphandle, uint32_t vpid, int32_t hostmode, void* oldmode);
int32_t windowssysWindowsWin32SystemHypervisorForcePagingMode(void* vmsavedstatedumphandle, uint32_t vpid, int32_t pagingmode);
int32_t windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel(void* vmsavedstatedumphandle, uint32_t vpid, void* virtualtrustlevel);
int32_t windowssysWindowsWin32SystemHypervisorGetArchitecture(void* vmsavedstatedumphandle, uint32_t vpid, void* architecture);
int32_t windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels(void* vmsavedstatedumphandle, uint32_t vpid, void* virtualtrustlevels);
int32_t windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels(void* vmsavedstatedumphandle, void* virtualtrustlevels);
int32_t windowssysWindowsWin32SystemHypervisorGetGuestOsInfo(void* vmsavedstatedumphandle, uint8_t virtualtrustlevel, void* guestosinfo);
int32_t windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks(void* vmsavedstatedumphandle, void* memorychunkpagesize, void* memorychunks, void* memorychunkcount);
int32_t windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize(void* vmsavedstatedumphandle, void* guestrawsavedmemorysize);
int32_t windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit(void* vmsavedstatedumphandle, void* memoryblockcachelimit);
int32_t windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode(void* vmsavedstatedumphandle, uint32_t vpid, void* enabled);
int32_t windowssysWindowsWin32SystemHypervisorGetPagingMode(void* vmsavedstatedumphandle, uint32_t vpid, void* pagingmode);
int32_t windowssysWindowsWin32SystemHypervisorGetRegisterValue(void* vmsavedstatedumphandle, uint32_t vpid, uint32_t registerid, void* registervalue);
int32_t windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo(void* vmsavedstatedumphandle, uint32_t vpid, void* arg2Typename, void* typefieldinfomap);
void* windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle(void* vmsavedstatedumphandle);
int32_t windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize(void* vmsavedstatedumphandle, uint32_t vpid, void* arg2Typename, void* size);
int32_t windowssysWindowsWin32SystemHypervisorGetVpCount(void* vmsavedstatedumphandle, void* vpcount);
int32_t windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset(void* vmsavedstatedumphandle, uint64_t physicaladdress, void* rawsavedmemoryoffset);
int32_t windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t virtualaddress, void* physicaladdress, void* unmappedregionsize);
int32_t windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance(void* devicehosthandle, int32_t devicetype, void* deviceclassid, void* deviceinstanceid, void* deviceinterface, void* devicecontext, void* devicehandle);
int32_t windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, int32_t writeprotected, void* mappedaddress);
int32_t windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange(void* requestor, int32_t barindex, uint64_t offsetinpages, uint64_t lengthinpages, int32_t mappingflags, void* sectionhandle, uint64_t sectionoffsetinpages);
int32_t windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt(void* requestor, uint64_t msiaddress, uint32_t msidata);
int32_t windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture(void* requestor, void* mappedaddress);
int32_t windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange(void* requestor, int32_t barindex, uint64_t offsetinpages);
int32_t windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost(void* computesystem, void* devicehosthandle);
int32_t windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx(void* computesystem, int32_t flags, void* devicehosthandle);
int32_t windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, void* buffer);
int32_t windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell(void* requestor, int32_t barindex, uint64_t baroffset, uint64_t triggervalue, uint64_t flags, void* doorbellevent);
int32_t windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost(void* devicehosthandle);
int32_t windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell(void* requestor, int32_t barindex, uint64_t baroffset, uint64_t triggervalue, uint64_t flags);
int32_t windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, void* buffer);
int32_t windowssysWindowsWin32SystemHypervisorInKernelSpace(void* vmsavedstatedumphandle, uint32_t vpid, void* inkernelspace);
int32_t windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled(void* vmsavedstatedumphandle, uint32_t vpid, void* activevirtualtrustlevelenabled);
int32_t windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled(void* vmsavedstatedumphandle, void* enabled);
int32_t windowssysWindowsWin32SystemHypervisorLoadSavedStateFile(void* vmrsfile, void* vmsavedstatedumphandle);
int32_t windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles(void* binfile, void* vsvfile, void* vmsavedstatedumphandle);
int32_t windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols(void* vmsavedstatedumphandle, void* imagename, void* modulename, uint64_t baseaddress, uint32_t sizeofbase);
int32_t windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx(void* vmsavedstatedumphandle, void* imagename, uint32_t imagetimestamp, void* modulename, uint64_t baseaddress, uint32_t sizeofbase);
int32_t windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider(void* vmsavedstatedumphandle, void* usersymbols, int32_t force);
int32_t windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles(void* vmname, void* snapshotname, void* binpath, void* vsvpath, void* vmrspath);
int32_t windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress(void* vmsavedstatedumphandle, uint64_t physicaladdress, void* buffer, uint32_t buffersize, void* bytesread);
int32_t windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory(void* vmsavedstatedumphandle, uint64_t rawsavedmemoryoffset, void* buffer, uint32_t buffersize, void* bytesread);
int32_t windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable(void* vmsavedstatedumphandle, uint32_t vpid, void* globalname, void* buffer, uint32_t buffersize);
int32_t windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles(void* vmsavedstatedumphandle);
int32_t windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider(void* vmsavedstatedumphandle);
int32_t windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress(void* vmsavedstatedumphandle, uint32_t vpid, void* globalname, void* virtualaddress, void* size);
int32_t windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t startaddress, uint64_t endaddress, void* callbackcontext, void* foundimagecallback, void* standaloneaddress, uint32_t standaloneaddresscount);
int32_t windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit(void* vmsavedstatedumphandle, uint64_t memoryblockcachelimit);
int32_t windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback(void* vmsavedstatedumphandle, void* callback);
int32_t windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration(void* migrationhandle, void* partition);
int32_t windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange(int64_t partition, void* gparanges, uint32_t gparangescount, int32_t advice, void* advicebuffer, uint32_t advicebuffersizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource(void* providerid, int32_t flags, void* resourcedescriptor, uint32_t resourcedescriptorsizeinbytes, void* vpciresource);
int32_t windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(int64_t partition);
int32_t windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(int64_t partition, uint32_t vpindex, uint32_t flags);
int32_t windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(int64_t partition);
int32_t windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort(int64_t partition, void* parameters, void* eventhandle, void* porthandle);
int32_t windowssysWindowsWin32SystemHypervisorWHvCreatePartition(void* partition);
int32_t windowssysWindowsWin32SystemHypervisorWHvCreateTrigger(int64_t partition, void* parameters, void* triggerhandle, void* eventhandle);
int32_t windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(int64_t partition, uint32_t vpindex, uint32_t flags);
int32_t windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2(int64_t partition, uint32_t vpindex, void* properties, uint32_t propertycount);
int32_t windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice(int64_t partition, uint64_t logicaldeviceid, void* vpciresource, int32_t flags, void* notificationeventhandle);
int32_t windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort(int64_t partition, void* porthandle);
int32_t windowssysWindowsWin32SystemHypervisorWHvDeletePartition(int64_t partition);
int32_t windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger(int64_t partition, void* triggerhandle);
int32_t windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(int64_t partition, uint32_t vpindex);
int32_t windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(int64_t partition, uint64_t logicaldeviceid);
int32_t windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator(void* callbacks, void* emulator);
int32_t windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator(void* emulator);
int32_t windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation(void* emulator, void* context, void* vpcontext, void* ioinstructioncontext, void* emulatorreturnstatus);
int32_t windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation(void* emulator, void* context, void* vpcontext, void* mmioinstructioncontext, void* emulatorreturnstatus);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetCapability(int32_t capabilitycode, void* capabilitybuffer, uint32_t capabilitybuffersizeinbytes, void* writtensizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet(int64_t partition, uint64_t destination, int32_t destinationmode, void* targetvps, uint32_t vpcount, void* targetvpcount);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters(int64_t partition, int32_t counterset, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty(int64_t partition, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes, void* writtensizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters(int64_t partition, uint32_t vpindex, int32_t counterset, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput(int64_t partition, uint32_t vpindex, uint32_t eax, uint32_t ecx, void* cpuidoutput);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize, void* writtensize);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize, void* writtensize);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters(int64_t partition, uint32_t vpindex, void* registernames, uint32_t registercount, void* registervalues);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState(int64_t partition, uint32_t vpindex, int32_t statetype, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState(int64_t partition, uint32_t vpindex, void* buffer, uint32_t buffersizeinbytes, void* byteswritten);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget(int64_t partition, uint64_t logicaldeviceid, uint32_t arg2Index, uint32_t multimessagenumber, void* target, uint32_t targetsizeinbytes, void* byteswritten);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification(int64_t partition, uint64_t logicaldeviceid, void* notification, uint32_t notificationsizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty(int64_t partition, uint64_t logicaldeviceid, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes, void* writtensizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvMapGpaRange(int64_t partition, void* sourceaddress, uint64_t guestaddress, uint64_t sizeinbytes, int32_t flags);
int32_t windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2(int64_t partition, void* process, void* sourceaddress, uint64_t guestaddress, uint64_t sizeinbytes, int32_t flags);
int32_t windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint32_t arg2Index, uint32_t messagecount, void* target, void* msiaddress, void* msidata);
int32_t windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges(int64_t partition, uint64_t logicaldeviceid, void* mappingcount, void* mappings);
int32_t windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage(int64_t partition, uint32_t vpindex, uint32_t sintindex, void* message, uint32_t messagesizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap(int64_t partition, uint64_t guestaddress, uint64_t rangesizeinbytes, void* bitmap, uint32_t bitmapsizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister(int64_t partition, uint64_t logicaldeviceid, void* arg2Register, void* data);
int32_t windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent(int64_t partition, void* matchdata, void* eventhandle);
int32_t windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt(int64_t partition, void* interrupt, uint32_t interruptcontrolsize);
int32_t windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint64_t msiaddress, uint32_t msidata);
int32_t windowssysWindowsWin32SystemHypervisorWHvResetPartition(int64_t partition);
int32_t windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(int64_t partition);
int32_t windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint64_t msiaddress, uint32_t msidata, void* target);
int32_t windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor(int64_t partition, uint32_t vpindex, void* exitcontext, uint32_t exitcontextsizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty(int64_t partition, void* porthandle, int32_t propertycode, uint64_t propertyvalue);
int32_t windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty(int64_t partition, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize);
int32_t windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize);
int32_t windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters(int64_t partition, uint32_t vpindex, void* registernames, uint32_t registercount, void* registervalues);
int32_t windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState(int64_t partition, uint32_t vpindex, int32_t statetype, void* buffer, uint32_t buffersizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState(int64_t partition, uint32_t vpindex, void* buffer, uint32_t buffersizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(int64_t partition, uint64_t logicaldeviceid, int32_t powerstate);
int32_t windowssysWindowsWin32SystemHypervisorWHvSetupPartition(int64_t partition);
int32_t windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration(int64_t partition, void* migrationhandle);
int32_t windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(int64_t partition);
int32_t windowssysWindowsWin32SystemHypervisorWHvTranslateGva(int64_t partition, uint32_t vpindex, uint64_t gva, int32_t translateflags, void* translationresult, void* gpa);
int32_t windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(int64_t partition, uint64_t guestaddress, uint64_t sizeinbytes);
int32_t windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint32_t arg2Index);
int32_t windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(int64_t partition, uint64_t logicaldeviceid);
int32_t windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent(int64_t partition, void* matchdata);
int32_t windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters(int64_t partition, void* parameters, void* triggerhandle);
int32_t windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister(int64_t partition, uint64_t logicaldeviceid, void* arg2Register, void* data);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WINDOWS_WIN32_SYSTEM_HYPERVISOR_WRAPPER_H */
