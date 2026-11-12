#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_REGISTRY_WINDOWS_WDK_SYSTEM_REGISTRY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_REGISTRY_WINDOWS_WDK_SYSTEM_REGISTRY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssysWindowsWdkSystemRegistryNtCreateKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg4Class, uint32_t createoptions, void* disposition);
int32_t windowssysWindowsWdkSystemRegistryNtCreateKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg4Class, uint32_t createoptions, void* transactionhandle, void* disposition);
int32_t windowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, uint32_t createoptions);
int32_t windowssysWindowsWdkSystemRegistryNtDeleteKey(void* keyhandle);
int32_t windowssysWindowsWdkSystemRegistryNtDeleteValueKey(void* keyhandle, void* valuename);
int32_t windowssysWindowsWdkSystemRegistryNtEnumerateKey(void* keyhandle, uint32_t arg1Index, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssysWindowsWdkSystemRegistryNtEnumerateValueKey(void* keyhandle, uint32_t arg1Index, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssysWindowsWdkSystemRegistryNtFlushKey(void* keyhandle);
int32_t windowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys(void* masterkeyhandle, uint32_t count, void* subordinateobjects, void* event, void* apcroutine, void* apccontext, void* iostatusblock, uint32_t completionfilter, bool watchtree, void* buffer, uint32_t buffersize, bool asynchronous);
int32_t windowssysWindowsWdkSystemRegistryNtOpenKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssysWindowsWdkSystemRegistryNtOpenKeyEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions);
int32_t windowssysWindowsWdkSystemRegistryNtOpenKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, void* transactionhandle);
int32_t windowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions, void* transactionhandle);
int32_t windowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssysWindowsWdkSystemRegistryNtQueryKey(void* keyhandle, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey(void* keyhandle, void* valueentries, uint32_t entrycount, void* valuebuffer, void* bufferlength, void* requiredbufferlength);
int32_t windowssysWindowsWdkSystemRegistryNtQueryValueKey(void* keyhandle, void* valuename, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssysWindowsWdkSystemRegistryNtRenameKey(void* keyhandle, void* newname);
int32_t windowssysWindowsWdkSystemRegistryNtRestoreKey(void* keyhandle, void* filehandle, uint32_t flags);
int32_t windowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssysWindowsWdkSystemRegistryNtSaveKey(void* keyhandle, void* filehandle);
int32_t windowssysWindowsWdkSystemRegistryNtSaveKeyEx(void* keyhandle, void* filehandle, uint32_t format);
int32_t windowssysWindowsWdkSystemRegistryNtSetInformationKey(void* keyhandle, int32_t keysetinformationclass, void* keysetinformation, uint32_t keysetinformationlength);
int32_t windowssysWindowsWdkSystemRegistryNtSetValueKey(void* keyhandle, void* valuename, uint32_t titleindex, uint32_t type, void* data, uint32_t datasize);
int32_t windowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssysWindowsWdkSystemRegistryZwCreateKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg4Class, uint32_t createoptions, void* disposition);
int32_t windowssysWindowsWdkSystemRegistryZwCreateKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg4Class, uint32_t createoptions, void* transactionhandle, void* disposition);
int32_t windowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, uint32_t createoptions);
int32_t windowssysWindowsWdkSystemRegistryZwDeleteKey(void* keyhandle);
int32_t windowssysWindowsWdkSystemRegistryZwDeleteValueKey(void* keyhandle, void* valuename);
int32_t windowssysWindowsWdkSystemRegistryZwEnumerateKey(void* keyhandle, uint32_t arg1Index, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssysWindowsWdkSystemRegistryZwEnumerateValueKey(void* keyhandle, uint32_t arg1Index, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssysWindowsWdkSystemRegistryZwFlushKey(void* keyhandle);
int32_t windowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys(void* masterkeyhandle, uint32_t count, void* subordinateobjects, void* event, void* apcroutine, void* apccontext, void* iostatusblock, uint32_t completionfilter, bool watchtree, void* buffer, uint32_t buffersize, bool asynchronous);
int32_t windowssysWindowsWdkSystemRegistryZwOpenKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssysWindowsWdkSystemRegistryZwOpenKeyEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions);
int32_t windowssysWindowsWdkSystemRegistryZwOpenKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, void* transactionhandle);
int32_t windowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions, void* transactionhandle);
int32_t windowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssysWindowsWdkSystemRegistryZwQueryKey(void* keyhandle, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength);
int32_t windowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey(void* keyhandle, void* valueentries, uint32_t entrycount, void* valuebuffer, void* bufferlength, void* requiredbufferlength);
int32_t windowssysWindowsWdkSystemRegistryZwQueryValueKey(void* keyhandle, void* valuename, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength);
int32_t windowssysWindowsWdkSystemRegistryZwRenameKey(void* keyhandle, void* newname);
int32_t windowssysWindowsWdkSystemRegistryZwRestoreKey(void* keyhandle, void* filehandle, uint32_t flags);
int32_t windowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction(void* transactionhandle, uint32_t flags);
int32_t windowssysWindowsWdkSystemRegistryZwSaveKey(void* keyhandle, void* filehandle);
int32_t windowssysWindowsWdkSystemRegistryZwSaveKeyEx(void* keyhandle, void* filehandle, uint32_t format);
int32_t windowssysWindowsWdkSystemRegistryZwSetInformationKey(void* keyhandle, int32_t keysetinformationclass, void* keysetinformation, uint32_t keysetinformationlength);
int32_t windowssysWindowsWdkSystemRegistryZwSetValueKey(void* keyhandle, void* valuename, uint32_t titleindex, uint32_t type, void* data, uint32_t datasize);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_REGISTRY_WINDOWS_WDK_SYSTEM_REGISTRY_WRAPPER_H */
