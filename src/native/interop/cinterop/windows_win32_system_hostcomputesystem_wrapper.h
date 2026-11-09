#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_hostcomputesystem_HcsAddResourceToOperation(void* operation, int32_t type, void* uri, void* handle);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsAttachLayerStorageFilter(void* layerpath, void* layerdata);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsCancelOperation(void* operation);
void windowssys_windows_win32_system_hostcomputesystem_HcsCloseComputeSystem(void* computesystem);
void windowssys_windows_win32_system_hostcomputesystem_HcsCloseOperation(void* operation);
void windowssys_windows_win32_system_hostcomputesystem_HcsCloseProcess(void* process);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsCrashComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystem(void* id, void* configuration, void* operation, void* securitydescriptor, void* computesystem);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystemInNamespace(void* idnamespace, void* id, void* configuration, void* operation, void* options, void* computesystem);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyGuestStateFile(void* gueststatefilepath);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyRuntimeStateFile(void* runtimestatefilepath);
void* windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperation(void* context, void* callback);
void* windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperationWithNotifications(int32_t eventtypes, void* context, void* callback);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsCreateProcess(void* computesystem, void* processparameters, void* operation, void* securitydescriptor, void* process);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsDestroyLayer(void* layerpath);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsDetachLayerStorageFilter(void* layerpath);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystems(void* query, void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystemsInNamespace(void* idnamespace, void* query, void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsExportLayer(void* layerpath, void* exportfolderpath, void* layerdata, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsExportLegacyWritableLayer(void* writablelayermountpath, void* writablelayerfolderpath, void* exportfolderpath, void* layerdata);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsFormatWritableLayerVhd(void* vhdhandle);
void* windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemFromOperation(void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemProperties(void* computesystem, void* operation, void* propertyquery);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGetLayerVhdMountPath(void* vhdhandle, void* mountpath);
void* windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationContext(void* operation);
uint64_t windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationId(void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResult(void* operation, void* resultdocument);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResultAndProcessInfo(void* operation, void* processinformation, void* resultdocument);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationType(void* operation);
void* windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessFromOperation(void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessInfo(void* process, void* operation);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessProperties(void* process, void* operation, void* propertyquery);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessorCompatibilityFromSavedState(void* runtimefilename, void* processorfeaturesstring);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGetServiceProperties(void* propertyquery, void* result);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmAccess(void* vmid, void* filepath);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmGroupAccess(void* filepath);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsImportLayer(void* layerpath, void* sourcefolderpath, void* layerdata);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsInitializeLegacyWritableLayer(void* writablelayermountpath, void* writablelayerfolderpath, void* layerdata, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsInitializeWritableLayer(void* writablelayerpath, void* layerdata, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsModifyComputeSystem(void* computesystem, void* operation, void* configuration, void* identity);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsModifyProcess(void* process, void* operation, void* settings);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsModifyServiceSettings(void* settings, void* result);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystem(void* id, uint32_t requestedaccess, void* computesystem);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystemInNamespace(void* idnamespace, void* id, uint32_t requestedaccess, void* computesystem);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsOpenProcess(void* computesystem, uint32_t processid, uint32_t requestedaccess, void* process);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsPauseComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsResumeComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmAccess(void* vmid, void* filepath);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmGroupAccess(void* filepath);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsSaveComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsSetComputeSystemCallback(void* computesystem, int32_t callbackoptions, void* context, void* callback);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationCallback(void* operation, void* context, void* callback);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationContext(void* operation, void* context);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsSetProcessCallback(void* process, int32_t callbackoptions, void* context, void* callback);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSLayer(void* layerpath, void* vhdhandle, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSVolume(void* layerpath, void* volumepath, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsShutDownComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsSignalProcess(void* process, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsStartComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsSubmitWerReport(void* settings);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsTerminateComputeSystem(void* computesystem, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsTerminateProcess(void* process, void* operation, void* options);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsWaitForComputeSystemExit(void* computesystem, uint32_t timeoutms, void* result);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResult(void* operation, uint32_t timeoutms, void* resultdocument);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResultAndProcessInfo(void* operation, uint32_t timeoutms, void* processinformation, void* resultdocument);
int32_t windowssys_windows_win32_system_hostcomputesystem_HcsWaitForProcessExit(void* computesystem, uint32_t timeoutms, void* result);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTESYSTEM_WRAPPER_H */
