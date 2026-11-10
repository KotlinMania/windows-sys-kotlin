#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsAddResourceToOperation(void* operation, int32_t type, void* uri, void* handle);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsAttachLayerStorageFilter(void* layerpath, void* layerdata);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCancelOperation(void* operation);
void windowssys_windows_win32_system_hostcomputesystem_hcsCloseComputeSystem(void* computesystem);
void windowssys_windows_win32_system_hostcomputesystem_hcsCloseOperation(void* operation);
void windowssys_windows_win32_system_hostcomputesystem_hcsCloseProcess(void* process);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCrashComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystem(void* id, void* configuration, void* operation, void* securitydescriptor, void* computesystem);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystemInNamespace(void* idnamespace, void* id, void* configuration, void* operation, void* options, void* computesystem);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyGuestStateFile(void* gueststatefilepath);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyRuntimeStateFile(void* runtimestatefilepath);
void* windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperation(void* context, void* callback);
void* windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperationWithNotifications(int32_t eventtypes, void* context, void* callback);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCreateProcess(void* computesystem, void* processparameters, void* operation, void* securitydescriptor, void* process);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsDestroyLayer(void* layerpath);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsDetachLayerStorageFilter(void* layerpath);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystems(void* query, void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystemsInNamespace(void* idnamespace, void* query, void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsExportLayer(void* layerpath, void* exportfolderpath, void* layerdata, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsExportLegacyWritableLayer(void* writablelayermountpath, void* writablelayerfolderpath, void* exportfolderpath, void* layerdata);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsFormatWritableLayerVhd(void* vhdhandle);
void* windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemFromOperation(void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemProperties(void* computesystem, void* operation, void* propertyquery);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetLayerVhdMountPath(void* vhdhandle, void* mountpath);
void* windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationContext(void* operation);
uint64_t windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationId(void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResult(void* operation, void* resultdocument);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResultAndProcessInfo(void* operation, void* processinformation, void* resultdocument);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationType(void* operation);
void* windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessFromOperation(void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessInfo(void* process, void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessProperties(void* process, void* operation, void* propertyquery);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessorCompatibilityFromSavedState(void* runtimefilename, void* processorfeaturesstring);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetServiceProperties(void* propertyquery, void* result);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmAccess(void* vmid, void* filepath);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmGroupAccess(void* filepath);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsImportLayer(void* layerpath, void* sourcefolderpath, void* layerdata);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsInitializeLegacyWritableLayer(void* writablelayermountpath, void* writablelayerfolderpath, void* layerdata, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsInitializeWritableLayer(void* writablelayerpath, void* layerdata, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsModifyComputeSystem(void* computesystem, void* operation, void* configuration, void* identity);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsModifyProcess(void* process, void* operation, void* settings);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsModifyServiceSettings(void* settings, void* result);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystem(void* id, uint32_t requestedaccess, void* computesystem);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystemInNamespace(void* idnamespace, void* id, uint32_t requestedaccess, void* computesystem);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsOpenProcess(void* computesystem, uint32_t processid, uint32_t requestedaccess, void* process);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsPauseComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsResumeComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmAccess(void* vmid, void* filepath);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmGroupAccess(void* filepath);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSaveComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetComputeSystemCallback(void* computesystem, int32_t callbackoptions, void* context, void* callback);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationCallback(void* operation, void* context, void* callback);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationContext(void* operation, void* context);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetProcessCallback(void* process, int32_t callbackoptions, void* context, void* callback);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSLayer(void* layerpath, void* vhdhandle, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSVolume(void* layerpath, void* volumepath, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsShutDownComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSignalProcess(void* process, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsStartComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSubmitWerReport(void* settings);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsTerminateComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsTerminateProcess(void* process, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsWaitForComputeSystemExit(void* computesystem, uint32_t timeoutms, void* result);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResult(void* operation, uint32_t timeoutms, void* resultdocument);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResultAndProcessInfo(void* operation, uint32_t timeoutms, void* processinformation, void* resultdocument);
int32_t windowssys_windows_win32_system_hostcomputesystem_hcsWaitForProcessExit(void* computesystem, uint32_t timeoutms, void* result);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WRAPPER_H */
