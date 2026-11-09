#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_REGISTRY_WINDOWS_WDK_SYSTEM_REGISTRY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_REGISTRY_WINDOWS_WDK_SYSTEM_REGISTRY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_system_registry_NtCommitRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_NtCreateKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg_4_class, uint32_t createoptions, void* disposition);
int32_t windowssys_windows_wdk_system_registry_NtCreateKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg_4_class, uint32_t createoptions, void* transactionhandle, void* disposition);
int32_t windowssys_windows_wdk_system_registry_NtCreateRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, uint32_t createoptions);
int32_t windowssys_windows_wdk_system_registry_NtDeleteKey(void* keyhandle);
int32_t windowssys_windows_wdk_system_registry_NtDeleteValueKey(void* keyhandle, void* valuename);
int32_t windowssys_windows_wdk_system_registry_NtEnumerateKey(void* keyhandle, uint32_t arg_1_index, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_NtEnumerateValueKey(void* keyhandle, uint32_t arg_1_index, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_NtFlushKey(void* keyhandle);
int32_t windowssys_windows_wdk_system_registry_NtOpenKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_registry_NtOpenKeyEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions);
int32_t windowssys_windows_wdk_system_registry_NtOpenKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, void* transactionhandle);
int32_t windowssys_windows_wdk_system_registry_NtOpenKeyTransactedEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions, void* transactionhandle);
int32_t windowssys_windows_wdk_system_registry_NtOpenRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_registry_NtQueryKey(void* keyhandle, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_NtQueryMultipleValueKey(void* keyhandle, void* valueentries, uint32_t entrycount, void* valuebuffer, void* bufferlength, void* requiredbufferlength);
int32_t windowssys_windows_wdk_system_registry_NtQueryValueKey(void* keyhandle, void* valuename, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_NtRenameKey(void* keyhandle, void* newname);
int32_t windowssys_windows_wdk_system_registry_NtRestoreKey(void* keyhandle, void* filehandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_NtRollbackRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_NtSaveKey(void* keyhandle, void* filehandle);
int32_t windowssys_windows_wdk_system_registry_NtSaveKeyEx(void* keyhandle, void* filehandle, uint32_t format);
int32_t windowssys_windows_wdk_system_registry_NtSetInformationKey(void* keyhandle, int32_t keysetinformationclass, void* keysetinformation, uint32_t keysetinformationlength);
int32_t windowssys_windows_wdk_system_registry_NtSetValueKey(void* keyhandle, void* valuename, uint32_t titleindex, uint32_t type, void* data, uint32_t datasize);
int32_t windowssys_windows_wdk_system_registry_ZwCommitRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_ZwCreateKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg_4_class, uint32_t createoptions, void* disposition);
int32_t windowssys_windows_wdk_system_registry_ZwCreateKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg_4_class, uint32_t createoptions, void* transactionhandle, void* disposition);
int32_t windowssys_windows_wdk_system_registry_ZwCreateRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, uint32_t createoptions);
int32_t windowssys_windows_wdk_system_registry_ZwDeleteKey(void* keyhandle);
int32_t windowssys_windows_wdk_system_registry_ZwDeleteValueKey(void* keyhandle, void* valuename);
int32_t windowssys_windows_wdk_system_registry_ZwEnumerateKey(void* keyhandle, uint32_t arg_1_index, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_ZwEnumerateValueKey(void* keyhandle, uint32_t arg_1_index, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_ZwFlushKey(void* keyhandle);
int32_t windowssys_windows_wdk_system_registry_ZwOpenKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_registry_ZwOpenKeyEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions);
int32_t windowssys_windows_wdk_system_registry_ZwOpenKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, void* transactionhandle);
int32_t windowssys_windows_wdk_system_registry_ZwOpenKeyTransactedEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions, void* transactionhandle);
int32_t windowssys_windows_wdk_system_registry_ZwOpenRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_registry_ZwQueryKey(void* keyhandle, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_ZwQueryMultipleValueKey(void* keyhandle, void* valueentries, uint32_t entrycount, void* valuebuffer, void* bufferlength, void* requiredbufferlength);
int32_t windowssys_windows_wdk_system_registry_ZwQueryValueKey(void* keyhandle, void* valuename, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssys_windows_wdk_system_registry_ZwRenameKey(void* keyhandle, void* newname);
int32_t windowssys_windows_wdk_system_registry_ZwRestoreKey(void* keyhandle, void* filehandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_ZwRollbackRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssys_windows_wdk_system_registry_ZwSaveKey(void* keyhandle, void* filehandle);
int32_t windowssys_windows_wdk_system_registry_ZwSaveKeyEx(void* keyhandle, void* filehandle, uint32_t format);
int32_t windowssys_windows_wdk_system_registry_ZwSetInformationKey(void* keyhandle, int32_t keysetinformationclass, void* keysetinformation, uint32_t keysetinformationlength);
int32_t windowssys_windows_wdk_system_registry_ZwSetValueKey(void* keyhandle, void* valuename, uint32_t titleindex, uint32_t type, void* data, uint32_t datasize);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_REGISTRY_WINDOWS_WDK_SYSTEM_REGISTRY_WRAPPER_H */
