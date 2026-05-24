while(left<=right){
        int mid=left+(right-left)/2;
        if(target==nums[mid]) answer=mid;
        if(nums[left]<nums[mid]){
            if(target<nums[mid] && target>=nums[left]) right=mid-1;  
            else left=mid+1;
        }
        else{

            if(target>nums[mid] && target<=nums[right])left=mid+1;
            else right=mid-1;
            
        }
    }