#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_ACCESSIBILITY_WINDOWS_WIN32_UI_ACCESSIBILITY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_ACCESSIBILITY_WINDOWS_WIN32_UI_ACCESSIBILITY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_accessibility_AccSetRunningUtilityState(void* hwndapp, uint32_t dwutilitystatemask, uint32_t dwutilitystate);
int32_t windowssys_windows_win32_ui_accessibility_AccessibleChildren(void* pacccontainer, int32_t ichildstart, int32_t cchildren, void* rgvarchildren, void* pcobtained);
int32_t windowssys_windows_win32_ui_accessibility_AccessibleObjectFromEvent(void* hwnd, uint32_t dwid, uint32_t dwchildid, void* ppacc, void* pvarchild);
int32_t windowssys_windows_win32_ui_accessibility_AccessibleObjectFromWindow(void* hwnd, uint32_t dwid, void* riid, void* ppvobject);
int32_t windowssys_windows_win32_ui_accessibility_CreateStdAccessibleObject(void* hwnd, int32_t idobject, void* riid, void* ppvobject);
int32_t windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyA(void* hwnd, void* pclassname, int32_t idobject, void* riid, void* ppvobject);
int32_t windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyW(void* hwnd, void* pclassname, int32_t idobject, void* riid, void* ppvobject);
int32_t windowssys_windows_win32_ui_accessibility_DockPattern_SetDockPosition(void* hobj, int32_t dockposition);
int32_t windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Collapse(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Expand(void* hobj);
void windowssys_windows_win32_ui_accessibility_GetOleaccVersionInfo(void* pver, void* pbuild);
uint32_t windowssys_windows_win32_ui_accessibility_GetRoleTextA(uint32_t lrole, void* lpszrole, uint32_t cchrolemax);
uint32_t windowssys_windows_win32_ui_accessibility_GetRoleTextW(uint32_t lrole, void* lpszrole, uint32_t cchrolemax);
uint32_t windowssys_windows_win32_ui_accessibility_GetStateTextA(uint32_t lstatebit, void* lpszstate, uint32_t cchstate);
uint32_t windowssys_windows_win32_ui_accessibility_GetStateTextW(uint32_t lstatebit, void* lpszstate, uint32_t cchstate);
int32_t windowssys_windows_win32_ui_accessibility_GridPattern_GetItem(void* hobj, int32_t row, int32_t column, void* presult);
int32_t windowssys_windows_win32_ui_accessibility_InvokePattern_Invoke(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_IsWinEventHookInstalled(uint32_t event);
int32_t windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_DoDefaultAction(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_GetIAccessible(void* hobj, void* paccessible);
int32_t windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_Select(void* hobj, int32_t flagsselect);
int32_t windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_SetValue(void* hobj, void* szvalue);
int64_t windowssys_windows_win32_ui_accessibility_LresultFromObject(void* riid, uint64_t wparam, void* punk);
int32_t windowssys_windows_win32_ui_accessibility_MultipleViewPattern_GetViewName(void* hobj, int32_t viewid, void* ppstr);
int32_t windowssys_windows_win32_ui_accessibility_MultipleViewPattern_SetCurrentView(void* hobj, int32_t viewid);
void windowssys_windows_win32_ui_accessibility_NotifyWinEvent(uint32_t event, void* hwnd, int32_t idobject, int32_t idchild);
int32_t windowssys_windows_win32_ui_accessibility_ObjectFromLresult(int64_t lresult, void* riid, uint64_t wparam, void* ppvobject);
int32_t windowssys_windows_win32_ui_accessibility_RangeValuePattern_SetValue(void* hobj, double val);
int32_t windowssys_windows_win32_ui_accessibility_RegisterPointerInputTarget(void* hwnd, int32_t pointertype);
int32_t windowssys_windows_win32_ui_accessibility_RegisterPointerInputTargetEx(void* hwnd, int32_t pointertype, int32_t fobserve);
int32_t windowssys_windows_win32_ui_accessibility_ScrollItemPattern_ScrollIntoView(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_ScrollPattern_Scroll(void* hobj, int32_t horizontalamount, int32_t verticalamount);
int32_t windowssys_windows_win32_ui_accessibility_ScrollPattern_SetScrollPercent(void* hobj, double horizontalpercent, double verticalpercent);
int32_t windowssys_windows_win32_ui_accessibility_SelectionItemPattern_AddToSelection(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_SelectionItemPattern_RemoveFromSelection(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_SelectionItemPattern_Select(void* hobj);
void* windowssys_windows_win32_ui_accessibility_SetWinEventHook(uint32_t eventmin, uint32_t eventmax, void* hmodwineventproc, void* pfnwineventproc, uint32_t idprocess, uint32_t idthread, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_Cancel(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_StartListening(void* hobj, int32_t inputtype);
int32_t windowssys_windows_win32_ui_accessibility_TextPattern_GetSelection(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextPattern_GetVisibleRanges(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextPattern_RangeFromChild(void* hobj, void* hnodechild, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextPattern_get_DocumentRange(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextPattern_get_SupportedTextSelection(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_AddToSelection(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_Clone(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_Compare(void* hobj, void* range, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_CompareEndpoints(void* hobj, int32_t endpoint, void* targetrange, int32_t targetendpoint, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_ExpandToEnclosingUnit(void* hobj, int32_t unit);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_FindText(void* hobj, void* text, int32_t backward, int32_t ignorecase, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_GetAttributeValue(void* hobj, int32_t attributeid, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_GetBoundingRectangles(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_GetChildren(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_GetEnclosingElement(void* hobj, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_GetText(void* hobj, int32_t maxlength, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_Move(void* hobj, int32_t unit, int32_t count, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByRange(void* hobj, int32_t endpoint, void* targetrange, int32_t targetendpoint);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByUnit(void* hobj, int32_t endpoint, int32_t unit, int32_t count, void* pretval);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_RemoveFromSelection(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_ScrollIntoView(void* hobj, int32_t aligntotop);
int32_t windowssys_windows_win32_ui_accessibility_TextRange_Select(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_TogglePattern_Toggle(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_TransformPattern_Move(void* hobj, double x, double y);
int32_t windowssys_windows_win32_ui_accessibility_TransformPattern_Resize(void* hobj, double width, double height);
int32_t windowssys_windows_win32_ui_accessibility_TransformPattern_Rotate(void* hobj, double degrees);
int32_t windowssys_windows_win32_ui_accessibility_UiaAddEvent(void* hnode, int32_t eventid, void* pcallback, int32_t scope, void* pproperties, int32_t cproperties, void* prequest, void* phevent);
int32_t windowssys_windows_win32_ui_accessibility_UiaClientsAreListening(void);
int32_t windowssys_windows_win32_ui_accessibility_UiaDisconnectAllProviders(void);
int32_t windowssys_windows_win32_ui_accessibility_UiaDisconnectProvider(void* pprovider);
int32_t windowssys_windows_win32_ui_accessibility_UiaEventAddWindow(void* hevent, void* hwnd);
int32_t windowssys_windows_win32_ui_accessibility_UiaEventRemoveWindow(void* hevent, void* hwnd);
int32_t windowssys_windows_win32_ui_accessibility_UiaFind(void* hnode, void* pparams, void* prequest, void* pprequesteddata, void* ppoffsets, void* pptreestructures);
int32_t windowssys_windows_win32_ui_accessibility_UiaGetErrorDescription(void* pdescription);
int32_t windowssys_windows_win32_ui_accessibility_UiaGetPatternProvider(void* hnode, int32_t patternid, void* phobj);
int32_t windowssys_windows_win32_ui_accessibility_UiaGetPropertyValue(void* hnode, int32_t propertyid, void* pvalue);
int32_t windowssys_windows_win32_ui_accessibility_UiaGetReservedMixedAttributeValue(void* punkmixedattributevalue);
int32_t windowssys_windows_win32_ui_accessibility_UiaGetReservedNotSupportedValue(void* punknotsupportedvalue);
int32_t windowssys_windows_win32_ui_accessibility_UiaGetRootNode(void* phnode);
int32_t windowssys_windows_win32_ui_accessibility_UiaGetRuntimeId(void* hnode, void* pruntimeid);
int32_t windowssys_windows_win32_ui_accessibility_UiaGetUpdatedCache(void* hnode, void* prequest, int32_t normalizestate, void* pnormalizecondition, void* pprequesteddata, void* pptreestructure);
int32_t windowssys_windows_win32_ui_accessibility_UiaHPatternObjectFromVariant(void* pvar, void* phobj);
int32_t windowssys_windows_win32_ui_accessibility_UiaHTextRangeFromVariant(void* pvar, void* phtextrange);
int32_t windowssys_windows_win32_ui_accessibility_UiaHUiaNodeFromVariant(void* pvar, void* phnode);
int32_t windowssys_windows_win32_ui_accessibility_UiaHasServerSideProvider(void* hwnd);
int32_t windowssys_windows_win32_ui_accessibility_UiaHostProviderFromHwnd(void* hwnd, void* ppprovider);
int32_t windowssys_windows_win32_ui_accessibility_UiaIAccessibleFromProvider(void* pprovider, uint32_t dwflags, void* ppaccessible, void* pvarchild);
int32_t windowssys_windows_win32_ui_accessibility_UiaLookupId(int32_t type, void* pguid);
int32_t windowssys_windows_win32_ui_accessibility_UiaNavigate(void* hnode, int32_t direction, void* pcondition, void* prequest, void* pprequesteddata, void* pptreestructure);
int32_t windowssys_windows_win32_ui_accessibility_UiaNodeFromFocus(void* prequest, void* pprequesteddata, void* pptreestructure);
int32_t windowssys_windows_win32_ui_accessibility_UiaNodeFromHandle(void* hwnd, void* phnode);
int32_t windowssys_windows_win32_ui_accessibility_UiaNodeFromPoint(double x, double y, void* prequest, void* pprequesteddata, void* pptreestructure);
int32_t windowssys_windows_win32_ui_accessibility_UiaNodeFromProvider(void* pprovider, void* phnode);
int32_t windowssys_windows_win32_ui_accessibility_UiaNodeRelease(void* hnode);
int32_t windowssys_windows_win32_ui_accessibility_UiaPatternRelease(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_UiaProviderForNonClient(void* hwnd, int32_t idobject, int32_t idchild, void* ppprovider);
int32_t windowssys_windows_win32_ui_accessibility_UiaProviderFromIAccessible(void* paccessible, int32_t idchild, uint32_t dwflags, void* ppprovider);
int32_t windowssys_windows_win32_ui_accessibility_UiaRaiseActiveTextPositionChangedEvent(void* provider, void* textrange);
int32_t windowssys_windows_win32_ui_accessibility_UiaRaiseAsyncContentLoadedEvent(void* pprovider, int32_t asynccontentloadedstate, double percentcomplete);
int32_t windowssys_windows_win32_ui_accessibility_UiaRaiseAutomationEvent(void* pprovider, int32_t id);
int32_t windowssys_windows_win32_ui_accessibility_UiaRaiseChangesEvent(void* pprovider, int32_t eventidcount, void* puiachanges);
int32_t windowssys_windows_win32_ui_accessibility_UiaRaiseNotificationEvent(void* provider, int32_t notificationkind, int32_t notificationprocessing, void* displaystring, void* activityid);
int32_t windowssys_windows_win32_ui_accessibility_UiaRaiseStructureChangedEvent(void* pprovider, int32_t structurechangetype, void* pruntimeid, int32_t cruntimeidlen);
int32_t windowssys_windows_win32_ui_accessibility_UiaRaiseTextEditTextChangedEvent(void* pprovider, int32_t texteditchangetype, void* pchangeddata);
void windowssys_windows_win32_ui_accessibility_UiaRegisterProviderCallback(void* pcallback);
int32_t windowssys_windows_win32_ui_accessibility_UiaRemoveEvent(void* hevent);
int64_t windowssys_windows_win32_ui_accessibility_UiaReturnRawElementProvider(void* hwnd, uint64_t wparam, int64_t lparam, void* el);
int32_t windowssys_windows_win32_ui_accessibility_UiaSetFocus(void* hnode);
int32_t windowssys_windows_win32_ui_accessibility_UiaTextRangeRelease(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_UnhookWinEvent(void* hwineventhook);
int32_t windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTarget(void* hwnd, int32_t pointertype);
int32_t windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTargetEx(void* hwnd, int32_t pointertype);
int32_t windowssys_windows_win32_ui_accessibility_ValuePattern_SetValue(void* hobj, void* pval);
int32_t windowssys_windows_win32_ui_accessibility_VirtualizedItemPattern_Realize(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_WindowFromAccessibleObject(void* param0, void* phwnd);
int32_t windowssys_windows_win32_ui_accessibility_WindowPattern_Close(void* hobj);
int32_t windowssys_windows_win32_ui_accessibility_WindowPattern_SetWindowVisualState(void* hobj, int32_t state);
int32_t windowssys_windows_win32_ui_accessibility_WindowPattern_WaitForInputIdle(void* hobj, int32_t milliseconds, void* presult);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_ACCESSIBILITY_WINDOWS_WIN32_UI_ACCESSIBILITY_WRAPPER_H */
