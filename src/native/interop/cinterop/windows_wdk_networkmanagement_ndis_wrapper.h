#ifndef WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_wdk_networkmanagement_ndis_NdisAcquireReadWriteLock(void* lock, bool fwrite, void* lockstate);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisAllocateMemoryWithTag(void* virtualaddress, uint32_t length, uint32_t tag);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCancelTimer(void* timer, void* timercancelled);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClAddParty(void* ndisvchandle, void* protocolpartycontext, void* callparameters, void* ndispartyhandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseAddressFamily(void* ndisafhandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseCall(void* ndisvchandle, void* ndispartyhandle, void* buffer, uint32_t size);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClDeregisterSap(void* ndissaphandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClDropParty(void* ndispartyhandle, void* buffer, uint32_t size);
void windowssys_windows_wdk_networkmanagement_ndis_NdisClIncomingCallComplete(int32_t status, void* ndisvchandle, void* callparameters);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClMakeCall(void* ndisvchandle, void* callparameters, void* protocolpartycontext, void* ndispartyhandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClModifyCallQoS(void* ndisvchandle, void* callparameters);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisClRegisterSap(void* ndisafhandle, void* protocolsapcontext, void* sap, void* ndissaphandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCloseConfiguration(void* configurationhandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCloseFile(void* filehandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCmActivateVc(void* ndisvchandle, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmAddPartyComplete(int32_t status, void* ndispartyhandle, void* callmgrpartycontext, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseAddressFamilyComplete(int32_t status, void* ndisafhandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseCallComplete(int32_t status, void* ndisvchandle, void* ndispartyhandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeactivateVc(void* ndisvchandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeregisterSapComplete(int32_t status, void* ndissaphandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchCallConnected(void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCall(void* ndissaphandle, void* ndisvchandle, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCallQoSChange(void* ndisvchandle, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCloseCall(int32_t closestatus, void* ndisvchandle, void* buffer, uint32_t size);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingDropParty(int32_t dropstatus, void* ndispartyhandle, void* buffer, uint32_t size);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmDropPartyComplete(int32_t status, void* ndispartyhandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmMakeCallComplete(int32_t status, void* ndisvchandle, void* ndispartyhandle, void* callmgrpartycontext, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmModifyCallQoSComplete(int32_t status, void* ndisvchandle, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmOpenAddressFamilyComplete(int32_t status, void* ndisafhandle, void* callmgrafcontext);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCmRegisterSapComplete(int32_t status, void* ndissaphandle, void* callmgrsapcontext);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCoAssignInstanceName(void* ndisvchandle, void* baseinstancename, void* vcinstancename);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCoCreateVc(void* ndisbindinghandle, void* ndisafhandle, void* protocolvccontext, void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCoDeleteVc(void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisCoGetTapiCallId(void* ndisvchandle, void* tapicallid);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCompleteDmaTransfer(void* status, void* ndisdmahandle, void* buffer, uint32_t offset, uint32_t length, bool writetodevice);
void windowssys_windows_wdk_networkmanagement_ndis_NdisCopyBuffer(void* status, void* buffer, void* poolhandle, void* memorydescriptor, uint32_t offset, uint32_t length);
void windowssys_windows_wdk_networkmanagement_ndis_NdisDeregisterTdiCallBack(void);
void windowssys_windows_wdk_networkmanagement_ndis_NdisFreeMemory(void* virtualaddress, uint32_t length, uint32_t memoryflags);
uint8_t windowssys_windows_wdk_networkmanagement_ndis_NdisGeneratePartialCancelId(void);
void windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCounts(void* pidlecount, void* pkernelanduser, void* pindex);
void windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCpuUsage(void* pcpuusage);
void* windowssys_windows_wdk_networkmanagement_ndis_NdisGetRoutineAddress(void* ndisroutinename);
uint32_t windowssys_windows_wdk_networkmanagement_ndis_NdisGetSharedDataAlignment(void);
uint32_t windowssys_windows_wdk_networkmanagement_ndis_NdisGetVersion(void);
void windowssys_windows_wdk_networkmanagement_ndis_NdisIMAssociateMiniport(void* driverhandle, void* protocolhandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisIMCancelInitializeDeviceInstance(void* driverhandle, void* deviceinstance);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisIMDeInitializeDeviceInstance(void* ndisminiporthandle);
void* windowssys_windows_wdk_networkmanagement_ndis_NdisIMGetBindingContext(void* ndisbindinghandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisIMInitializeDeviceInstanceEx(void* driverhandle, void* driverinstance, void* devicecontext);
void windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeEvent(void* event);
void windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeReadWriteLock(void* lock);
void windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeString(void* destination, void* source);
void windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeTimer(void* timer, void* timerfunction, void* functioncontext);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemory(void* miniportadapterhandle, uint32_t length, bool cached, void* virtualaddress, void* physicaladdress);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemoryAsync(void* miniportadapterhandle, uint32_t length, bool cached, void* context);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMCancelTimer(void* timer, void* timercancelled);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMCloseLog(void* loghandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCmActivateVc(void* ndisvchandle, void* callparameters);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCmCreateVc(void* miniportadapterhandle, void* ndisafhandle, void* miniportvccontext, void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeactivateVc(void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeleteVc(void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCmRegisterAddressFamily(void* miniportadapterhandle, void* addressfamily, void* cmcharacteristics, uint32_t sizeofcmcharacteristics);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMCoActivateVcComplete(int32_t status, void* ndisvchandle, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMCoDeactivateVcComplete(int32_t status, void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMCreateLog(void* miniportadapterhandle, uint32_t size, void* loghandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterDmaChannel(void* miniportdmahandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterIoPortRange(void* miniportadapterhandle, uint32_t initialport, uint32_t numberofports, void* portoffset);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMFlushLog(void* loghandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMFreeSharedMemory(void* miniportadapterhandle, uint32_t length, bool cached, void* virtualaddress, int64_t physicaladdress);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDeviceProperty(void* miniportadapterhandle, void* physicaldeviceobject, void* functionaldeviceobject, void* nextdeviceobject, void* allocatedresources, void* allocatedresourcestranslated);
uint32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDmaAlignment(void* miniportadapterhandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMInitializeTimer(void* timer, void* miniportadapterhandle, void* timerfunction, void* functioncontext);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMMapIoSpace(void* virtualaddress, void* miniportadapterhandle, int64_t physicaladdress, uint32_t length);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMQueryAdapterInstanceName(void* padapterinstancename, void* miniporthandle);
uint32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMReadDmaCounter(void* miniportdmahandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterDmaChannel(void* miniportdmahandle, void* miniportadapterhandle, uint32_t dmachannel, bool dma32bitaddresses, void* dmadescription, uint32_t maximumlength);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterIoPortRange(void* portoffset, void* miniportadapterhandle, uint32_t initialport, uint32_t numberofports);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMRemoveMiniport(void* miniporthandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMSetPeriodicTimer(void* timer, uint32_t millisecondperiod);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMSleep(uint32_t microsecondstosleep);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMUnmapIoSpace(void* miniportadapterhandle, void* virtualaddress, uint32_t length);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisMWriteLogData(void* loghandle, void* logbuffer, uint32_t logbuffersize);
void windowssys_windows_wdk_networkmanagement_ndis_NdisMapFile(void* status, void* mappedbuffer, void* filehandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByIndex(void* status, void* configurationhandle, uint32_t arg_2_index, void* keyname, void* keyhandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByName(void* status, void* configurationhandle, void* subkeyname, void* subkeyhandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisOpenFile(void* status, void* filehandle, void* filelength, void* filename, int64_t highestacceptableaddress);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisQueryAdapterInstanceName(void* padapterinstancename, void* ndisbindinghandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisQueryBindInstanceName(void* padapterinstancename, void* bindingcontext);
void windowssys_windows_wdk_networkmanagement_ndis_NdisReEnumerateProtocolBindings(void* ndisprotocolhandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisReadConfiguration(void* status, void* parametervalue, void* configurationhandle, void* keyword, int32_t parametertype);
void windowssys_windows_wdk_networkmanagement_ndis_NdisReadNetworkAddress(void* status, void* networkaddress, void* networkaddresslength, void* configurationhandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisRegisterTdiCallBack(void* registercallback, void* pnphandler);
void windowssys_windows_wdk_networkmanagement_ndis_NdisReleaseReadWriteLock(void* lock, void* lockstate);
void windowssys_windows_wdk_networkmanagement_ndis_NdisResetEvent(void* event);
void windowssys_windows_wdk_networkmanagement_ndis_NdisSetEvent(void* event);
void windowssys_windows_wdk_networkmanagement_ndis_NdisSetPeriodicTimer(void* ndistimer, uint32_t millisecondsperiod);
void windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimer(void* timer, uint32_t millisecondstodelay);
void windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimerEx(void* ndistimer, uint32_t millisecondstodelay, void* functioncontext);
void windowssys_windows_wdk_networkmanagement_ndis_NdisSetupDmaTransfer(void* status, void* ndisdmahandle, void* buffer, uint32_t offset, uint32_t length, bool writetodevice);
int8_t windowssys_windows_wdk_networkmanagement_ndis_NdisSystemProcessorCount(void);
void windowssys_windows_wdk_networkmanagement_ndis_NdisUnmapFile(void* filehandle);
void windowssys_windows_wdk_networkmanagement_ndis_NdisUpdateSharedMemory(void* ndisadapterhandle, uint32_t length, void* virtualaddress, int64_t physicaladdress);
bool windowssys_windows_wdk_networkmanagement_ndis_NdisWaitEvent(void* event, uint32_t mstowait);
void windowssys_windows_wdk_networkmanagement_ndis_NdisWriteConfiguration(void* status, void* configurationhandle, void* keyword, void* parametervalue);
int32_t windowssys_windows_wdk_networkmanagement_ndis_NdisWriteEventLogEntry(void* loghandle, int32_t eventcode, uint32_t uniqueeventvalue, uint16_t numstrings, void* stringslist, uint32_t datasize, void* data);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WRAPPER_H */
