#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_REGISTRY_WINDOWS_WDK_SYSTEM_REGISTRY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_REGISTRY_WINDOWS_WDK_SYSTEM_REGISTRY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_system_registry_ntCommitRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_ntCreateKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg_4_class, uint32_t createoptions, void* disposition);
int32_t windowssys_windows_wdk_system_registry_ntCreateKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg_4_class, uint32_t createoptions, void* transactionhandle, void* disposition);
int32_t windowssys_windows_wdk_system_registry_ntCreateRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, uint32_t createoptions);
int32_t windowssys_windows_wdk_system_registry_ntDeleteKey(void* keyhandle);
int32_t windowssys_windows_wdk_system_registry_ntDeleteValueKey(void* keyhandle, void* valuename);
int32_t windowssys_windows_wdk_system_registry_ntEnumerateKey(void* keyhandle, uint32_t arg_1_index, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_ntEnumerateValueKey(void* keyhandle, uint32_t arg_1_index, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_ntFlushKey(void* keyhandle);
int32_t windowssys_windows_wdk_system_registry_ntNotifyChangeMultipleKeys(void* masterkeyhandle, uint32_t count, void* subordinateobjects, void* event, void* apcroutine, void* apccontext, void* iostatusblock, uint32_t completionfilter, bool watchtree, void* buffer, uint32_t buffersize, bool asynchronous);
int32_t windowssys_windows_wdk_system_registry_ntOpenKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_registry_ntOpenKeyEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions);
int32_t windowssys_windows_wdk_system_registry_ntOpenKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, void* transactionhandle);
int32_t windowssys_windows_wdk_system_registry_ntOpenKeyTransactedEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions, void* transactionhandle);
int32_t windowssys_windows_wdk_system_registry_ntOpenRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_registry_ntQueryKey(void* keyhandle, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_ntQueryMultipleValueKey(void* keyhandle, void* valueentries, uint32_t entrycount, void* valuebuffer, void* bufferlength, void* requiredbufferlength);
int32_t windowssys_windows_wdk_system_registry_ntQueryValueKey(void* keyhandle, void* valuename, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_ntRenameKey(void* keyhandle, void* newname);
int32_t windowssys_windows_wdk_system_registry_ntRestoreKey(void* keyhandle, void* filehandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_ntRollbackRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_ntSaveKey(void* keyhandle, void* filehandle);
int32_t windowssys_windows_wdk_system_registry_ntSaveKeyEx(void* keyhandle, void* filehandle, uint32_t format);
int32_t windowssys_windows_wdk_system_registry_ntSetInformationKey(void* keyhandle, int32_t keysetinformationclass, void* keysetinformation, uint32_t keysetinformationlength);
int32_t windowssys_windows_wdk_system_registry_ntSetValueKey(void* keyhandle, void* valuename, uint32_t titleindex, uint32_t type, void* data, uint32_t datasize);
int32_t windowssys_windows_wdk_system_registry_zwCommitRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_zwCreateKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg_4_class, uint32_t createoptions, void* disposition);
int32_t windowssys_windows_wdk_system_registry_zwCreateKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg_4_class, uint32_t createoptions, void* transactionhandle, void* disposition);
int32_t windowssys_windows_wdk_system_registry_zwCreateRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, uint32_t createoptions);
int32_t windowssys_windows_wdk_system_registry_zwDeleteKey(void* keyhandle);
int32_t windowssys_windows_wdk_system_registry_zwDeleteValueKey(void* keyhandle, void* valuename);
int32_t windowssys_windows_wdk_system_registry_zwEnumerateKey(void* keyhandle, uint32_t arg_1_index, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_zwEnumerateValueKey(void* keyhandle, uint32_t arg_1_index, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_zwFlushKey(void* keyhandle);
int32_t windowssys_windows_wdk_system_registry_zwNotifyChangeMultipleKeys(void* masterkeyhandle, uint32_t count, void* subordinateobjects, void* event, void* apcroutine, void* apccontext, void* iostatusblock, uint32_t completionfilter, bool watchtree, void* buffer, uint32_t buffersize, bool asynchronous);
int32_t windowssys_windows_wdk_system_registry_zwOpenKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_registry_zwOpenKeyEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions);
int32_t windowssys_windows_wdk_system_registry_zwOpenKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, void* transactionhandle);
int32_t windowssys_windows_wdk_system_registry_zwOpenKeyTransactedEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions, void* transactionhandle);
int32_t windowssys_windows_wdk_system_registry_zwOpenRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_registry_zwQueryKey(void* keyhandle, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_zwQueryMultipleValueKey(void* keyhandle, void* valueentries, uint32_t entrycount, void* valuebuffer, void* bufferlength, void* requiredbufferlength);
int32_t windowssys_windows_wdk_system_registry_zwQueryValueKey(void* keyhandle, void* valuename, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_zwRenameKey(void* keyhandle, void* newname);
int32_t windowssys_windows_wdk_system_registry_zwRestoreKey(void* keyhandle, void* filehandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_zwRollbackRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_zwSaveKey(void* keyhandle, void* filehandle);
int32_t windowssys_windows_wdk_system_registry_zwSaveKeyEx(void* keyhandle, void* filehandle, uint32_t format);
int32_t windowssys_windows_wdk_system_registry_zwSetInformationKey(void* keyhandle, int32_t keysetinformationclass, void* keysetinformation, uint32_t keysetinformationlength);
int32_t windowssys_windows_wdk_system_registry_zwSetValueKey(void* keyhandle, void* valuename, uint32_t titleindex, uint32_t type, void* data, uint32_t datasize);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_REGISTRY_WINDOWS_WDK_SYSTEM_REGISTRY_WRAPPER_H */
