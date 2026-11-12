#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemHostcomputesystemHcsAddResourceToOperation(void* operation, int32_t type, void* uri, void* handle);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsAttachLayerStorageFilter(void* layerpath, void* layerdata);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsCancelOperation(void* operation);
void windowssysWindowsWin32SystemHostcomputesystemHcsCloseComputeSystem(void* computesystem);
void windowssysWindowsWin32SystemHostcomputesystemHcsCloseOperation(void* operation);
void windowssysWindowsWin32SystemHostcomputesystemHcsCloseProcess(void* process);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsCrashComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystem(void* id, void* configuration, void* operation, void* securitydescriptor, void* computesystem);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystemInNamespace(void* idnamespace, void* id, void* configuration, void* operation, void* options, void* computesystem);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyGuestStateFile(void* gueststatefilepath);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyRuntimeStateFile(void* runtimestatefilepath);
void* windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperation(void* context, void* callback);
void* windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperationWithNotifications(int32_t eventtypes, void* context, void* callback);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsCreateProcess(void* computesystem, void* processparameters, void* operation, void* securitydescriptor, void* process);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsDestroyLayer(void* layerpath);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsDetachLayerStorageFilter(void* layerpath);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystems(void* query, void* operation);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystemsInNamespace(void* idnamespace, void* query, void* operation);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsExportLayer(void* layerpath, void* exportfolderpath, void* layerdata, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsExportLegacyWritableLayer(void* writablelayermountpath, void* writablelayerfolderpath, void* exportfolderpath, void* layerdata);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsFormatWritableLayerVhd(void* vhdhandle);
void* windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemFromOperation(void* operation);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemProperties(void* computesystem, void* operation, void* propertyquery);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGetLayerVhdMountPath(void* vhdhandle, void* mountpath);
void* windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationContext(void* operation);
uint64_t windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationId(void* operation);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResult(void* operation, void* resultdocument);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResultAndProcessInfo(void* operation, void* processinformation, void* resultdocument);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationType(void* operation);
void* windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessFromOperation(void* operation);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessInfo(void* process, void* operation);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessProperties(void* process, void* operation, void* propertyquery);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessorCompatibilityFromSavedState(void* runtimefilename, void* processorfeaturesstring);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGetServiceProperties(void* propertyquery, void* result);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmAccess(void* vmid, void* filepath);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmGroupAccess(void* filepath);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsImportLayer(void* layerpath, void* sourcefolderpath, void* layerdata);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsInitializeLegacyWritableLayer(void* writablelayermountpath, void* writablelayerfolderpath, void* layerdata, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsInitializeWritableLayer(void* writablelayerpath, void* layerdata, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsModifyComputeSystem(void* computesystem, void* operation, void* configuration, void* identity);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsModifyProcess(void* process, void* operation, void* settings);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsModifyServiceSettings(void* settings, void* result);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystem(void* id, uint32_t requestedaccess, void* computesystem);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystemInNamespace(void* idnamespace, void* id, uint32_t requestedaccess, void* computesystem);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsOpenProcess(void* computesystem, uint32_t processid, uint32_t requestedaccess, void* process);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsPauseComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsResumeComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmAccess(void* vmid, void* filepath);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmGroupAccess(void* filepath);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsSaveComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsSetComputeSystemCallback(void* computesystem, int32_t callbackoptions, void* context, void* callback);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationCallback(void* operation, void* context, void* callback);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationContext(void* operation, void* context);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsSetProcessCallback(void* process, int32_t callbackoptions, void* context, void* callback);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSLayer(void* layerpath, void* vhdhandle, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSVolume(void* layerpath, void* volumepath, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsShutDownComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsSignalProcess(void* process, void* operation, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsStartComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsSubmitWerReport(void* settings);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsTerminateComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsTerminateProcess(void* process, void* operation, void* options);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsWaitForComputeSystemExit(void* computesystem, uint32_t timeoutms, void* result);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResult(void* operation, uint32_t timeoutms, void* resultdocument);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResultAndProcessInfo(void* operation, uint32_t timeoutms, void* processinformation, void* resultdocument);
int32_t windowssysWindowsWin32SystemHostcomputesystemHcsWaitForProcessExit(void* computesystem, uint32_t timeoutms, void* result);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WRAPPER_H */
