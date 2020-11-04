public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode tmp = new ListNode();
        ListNode head = new ListNode();
        if(list1.val > list2.val){
            tmp = list1;
            list1 = list1.next;
        }else{
            tmp = list2;
            list2 = list2.next;
        }
        head = tmp;
        while(list1 != null || list2 != null){
            if(list1.val > list2.val){
                tmp = list1;
                list1 = list1.next;
            }else{
                tmp = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }
        if(list1 == null){
            tmp = list2;
        }
        if(list2 == null){
            tmp = list1;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        ListNode list1 = null;
        ListNode list2 = null;
        st.Merge(list1,list2);
    }
}
