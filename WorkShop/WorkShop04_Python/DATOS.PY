if __name__ == "__main__":
   
   student = {
        'name': 'Dennis',
        'age': 20,
        'career':'Ing. de Software'
    }

#print(student['name'])
#print(student['age'])

for key, value in student.items():
    print(f'{key}->{value}')